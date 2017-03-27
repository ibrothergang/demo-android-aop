package com.brothergang.demo.aop;

import android.util.Log;

/**
 * Created by brothergang on 2017/3/27.
 */

public class LogUtils {
    private static final boolean DEBUG = true;

    public static void i(Class cls, String loginfo){
        Log.i(cls.getSimpleName(), " 代码中埋点：" + loginfo);
    }
}
