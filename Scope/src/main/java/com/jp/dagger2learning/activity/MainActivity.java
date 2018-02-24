package com.jp.dagger2learning.activity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.jp.dagger2learning.component.DaggerMainActivityComponent;
import com.jp.dagger2learning.entity.Pot;

import java.lang.ref.WeakReference;

import javax.inject.Inject;
import javax.inject.Provider;

public class MainActivity extends AppCompatActivity {
    private static class MyHandler extends Handler {
        private WeakReference<MainActivity> reference;

        public MyHandler(MainActivity mainActivity) {
            this.reference = new WeakReference<MainActivity>(mainActivity);
        }

        @Override
        public void handleMessage(Message msg) {
            Object temp = msg.obj;
            StringBuffer show = new StringBuffer();
            if (temp instanceof StringBuffer) {
                show = (StringBuffer) temp;
            }
            Toast.makeText(reference.get(), show, Toast.LENGTH_SHORT).show();
        }
    }

    @Inject
    Provider<Pot> pot;
    private Handler handler = new MyHandler(this);

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        DaggerMainActivityComponent.create().inject(this);
        final StringBuffer show = new StringBuffer();
        // Reusable scope注解在多线程的情况下可能会生成多个实例
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    show.append(pot.get().toString() + "\n");
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    show.append(pot.get().toString() + "\n");
                }
                Message message = new Message();
                message.obj = show;
                handler.sendMessage(message);
            }
        });
        try {
            thread1.start();
            thread1.join();
            thread2.start();
            thread2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}