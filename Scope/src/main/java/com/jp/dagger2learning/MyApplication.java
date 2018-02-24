package com.jp.dagger2learning;

import android.app.Application;

import com.jp.dagger2learning.scope.MyScope;

import javax.inject.Inject;

import dagger.releasablereferences.ForReleasableReferences;
import dagger.releasablereferences.ReleasableReferenceManager;


public class MyApplication extends Application {
    @Inject
    @ForReleasableReferences(MyScope.class)
    ReleasableReferenceManager releasableReferenceManager;

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        releasableReferenceManager.releaseStrongReferences();
    }
}
