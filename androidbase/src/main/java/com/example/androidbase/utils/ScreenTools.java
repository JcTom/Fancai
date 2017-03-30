package com.example.androidbase.utils;

import android.app.Activity;
import android.util.DisplayMetrics;

public class ScreenTools {

    /**
     * 获取屏幕的宽度
     */
    public final static int getWindowsWidth(Activity activity) {
        DisplayMetrics dm = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(dm);
        return dm.widthPixels;
    }

    /**
     * 获取屏幕的高度
     */
    public final static int getWindowsHeight(Activity activity) {
        DisplayMetrics dm = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(dm);
        return dm.heightPixels;
    }

    //获取状态栏高度
    public static int getstatusBarHeight(Activity activity) {
        int resourceId = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int statusHeight = 0;
        if (resourceId > 0) {
            statusHeight = activity.getResources().getDimensionPixelSize(resourceId);
        }
        return statusHeight;
    }

}
