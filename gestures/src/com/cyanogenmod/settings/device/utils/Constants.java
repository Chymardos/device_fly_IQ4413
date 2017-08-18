/*
 * Copyright (C) 2015 The CyanogenMod Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.cyanogenmod.settings.device.utils;

import java.util.HashMap;
import java.util.Map;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class Constants {

    // Preference keys
    public static final String TOUCHSCREEN_S2W_GESTURE_KEY = "touchscreen_gesture_s2w";
    public static final String TOUCHSCREEN_S2S_GESTURE_KEY = "touchscreen_gesture_s2s";
    public static final String TOUCHSCREEN_S2WI_GESTURE_KEY = "touchscreen_gesture_s2wi";
    public static final String TOUCHSCREEN_DT2W_GESTURE_KEY = "touchscreen_gesture_dt2w";
    public static final String TOUCHSCREEN_DT2S_GESTURE_KEY = "touchscreen_gesture_dt2s";
    public static final String TOUCHSCREEN_VIBRATE_KEY = "touchscreen_gesture_haptic_feedback";

    // Proc nodes
    public static final String TOUCHSCREEN_S2W_NODE = "/sys/android_touch/sweep2wake";
    public static final String TOUCHSCREEN_S2S_NODE = "/sys/android_touch/sweep2sleep";
    public static final String TOUCHSCREEN_S2WI_NODE = "/sys/android_touch/sweep2wake_invert";
    public static final String TOUCHSCREEN_DT2W_NODE = "/sys/android_touch/doubletap2wake";
    public static final String TOUCHSCREEN_DT2S_NODE = "/sys/android_touch/doubletap2sleep";
    public static final String TOUCHSCREEN_VIBRATE_NODE = "/sys/twf_debug/vibrate";

    // Proc nodes default values
    public static final boolean TOUCHSCREEN_S2W_DEFAULT = false;
    public static final boolean TOUCHSCREEN_S2S_DEFAULT = false;
    public static final boolean TOUCHSCREEN_S2WI_DEFAULT = false;
    public static final boolean TOUCHSCREEN_DT2W_DEFAULT = false;
    public static final boolean TOUCHSCREEN_DT2S_DEFAULT = false;
    public static final boolean TOUCHSCREEN_VIBRATE_DEFAULT = true;

    // Holds <preference_key> -> <proc_node> mapping
    public static final Map<String, String> sNodePreferenceMap = new HashMap<String, String>();

    // Holds <preference_key> -> <default_values> mapping
    public static final Map<String, Boolean> sNodeDefaultMap = new HashMap<String, Boolean>();

    static {
        sNodePreferenceMap.put(TOUCHSCREEN_S2W_GESTURE_KEY, TOUCHSCREEN_S2W_NODE);
        sNodePreferenceMap.put(TOUCHSCREEN_S2S_GESTURE_KEY, TOUCHSCREEN_S2S_NODE);
        sNodePreferenceMap.put(TOUCHSCREEN_S2WI_GESTURE_KEY, TOUCHSCREEN_S2WI_NODE);
        sNodePreferenceMap.put(TOUCHSCREEN_DT2W_GESTURE_KEY, TOUCHSCREEN_DT2W_NODE);
        sNodePreferenceMap.put(TOUCHSCREEN_DT2S_GESTURE_KEY, TOUCHSCREEN_DT2S_NODE);
        sNodePreferenceMap.put(TOUCHSCREEN_VIBRATE_KEY, TOUCHSCREEN_VIBRATE_NODE);

        sNodeDefaultMap.put(TOUCHSCREEN_S2W_GESTURE_KEY, TOUCHSCREEN_S2W_DEFAULT);
        sNodeDefaultMap.put(TOUCHSCREEN_S2S_GESTURE_KEY, TOUCHSCREEN_S2S_DEFAULT);
        sNodeDefaultMap.put(TOUCHSCREEN_S2WI_GESTURE_KEY, TOUCHSCREEN_S2WI_DEFAULT);
        sNodeDefaultMap.put(TOUCHSCREEN_DT2W_GESTURE_KEY, TOUCHSCREEN_DT2W_DEFAULT);
        sNodeDefaultMap.put(TOUCHSCREEN_DT2S_GESTURE_KEY, TOUCHSCREEN_DT2S_DEFAULT);
        sNodeDefaultMap.put(TOUCHSCREEN_VIBRATE_KEY, TOUCHSCREEN_VIBRATE_DEFAULT);
    }

    public static boolean isPreferenceEnabled(Context context, String key, boolean defaultValue) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        return preferences.getBoolean(key, defaultValue);
    }
}
