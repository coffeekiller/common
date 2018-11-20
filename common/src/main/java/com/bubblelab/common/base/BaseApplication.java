package com.bubblelab.common.base;

import android.app.Application;
import android.content.Context;

import java.lang.ref.SoftReference;

/**
 * Created  on 2018/11/20.
 *
 * @author JamesWang
 */

public class BaseApplication extends Application {
    public static SoftReference<Context> context;
    @Override
    public void onCreate() {
        super.onCreate();
        context = new SoftReference<Context>(this);
    }

    public static Context getContext() {
        return context.get();
    }
}
