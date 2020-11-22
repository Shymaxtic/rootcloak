package com.devadvance.rootcloak2;

import android.util.Log;

import de.robv.android.xposed.XposedBridge;

public class Utility {
    final static String TAG = "AndroidFaker";
    public static void log(String message) {
        XposedBridge.log("[" + TAG + "] " + message);
    }

    public static void log2(String message) {
        Log.d(TAG, message);
    }


}
