package com.tarenwang.googleplay;

import android.app.Application;
import android.content.Context;
import android.os.Looper;
import android.os.Process;

/**
 * Created by Administrator on 2017/3/27.
 */

public class BaseApplication extends Application {


    private static Context mContext;
    private static Thread mMainThread;
    private static long mMainThreadId;
    private static Looper mMainLooper;

    public static Context getContext() {
        return mContext;
    }

    public static Thread getMainThread() {
        return mMainThread;
    }

    public static long getMainThreadId() {
        return mMainThreadId;
    }

    public static Looper getMainThreadLooper() {
        return mMainLooper;
    }

    @Override
    public void onCreate() {
        //上下文
        mContext = getApplicationContext();
        //主线程

        mMainThread = Thread.currentThread();
        //主线程id
        mMainThreadId = Process.myTid();
        //tid
        //uid
        //pid
        mMainLooper = getMainLooper();
        super.onCreate();
    }
}
