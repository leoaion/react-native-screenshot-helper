package com.chaion.rn.screenshot;

import android.view.WindowManager;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNScreenshotHelperModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;

    public RNScreenshotHelperModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "RNScreenshotHelper";
    }

    @ReactMethod
    public void sampleMethod(String stringArgument, int numberArgument, Callback callback) {
        // TODO: Implement
    }

    @ReactMethod
    public void disableTakeScreenshot() {
        getCurrentActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
                getCurrentActivity().getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);
            }
        });
    }

    @ReactMethod
    public void enableTakeScreenshot() {
        getCurrentActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
                getCurrentActivity().getWindow().clearFlags(WindowManager.LayoutParams.FLAG_SECURE);
            }
        });
    }
}