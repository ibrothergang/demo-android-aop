package com.brothergang.demo.aop;

import android.util.Log;

/**
 * Created by Administrator on 2017/3/27.
 */

public class LogUtils {
    private static final boolean DEBUG = true;

    public static void i(Class cls, String loginfo){
        Log.i(cls.getSimpleName(), " 内嵌log：" + loginfo);
    }
}
