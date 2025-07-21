package com.appsflyer;

import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface AppsFlyerConversionListener {
    void onAppOpenAttribution(Map<String, String> map);

    void onAttributionFailure(String str);

    void onConversionDataFail(String str);

    void onConversionDataSuccess(Map<String, Object> map);
}
