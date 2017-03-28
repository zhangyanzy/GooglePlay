package com.tarenwang.googleplay;

import android.content.Context;
import android.content.res.Resources;
import android.widget.StackView;

/**
 * Created by Administrator on 2017/3/27.
 */

public class UIUtils {

    public static Context getContext() {
        return BaseApplication.getContext();
    }

    public static Resources getResources() {
        return getContext().getResources();
    }

    public static String getString(int resid) {
        return getResources().getString(resid);
    }
    public static String[] getStringArr(int resId){
        return getResources().getStringArray(resId);
    }


    public static String getPackageName() {
        return getContext().getPackageName();
    }
}
