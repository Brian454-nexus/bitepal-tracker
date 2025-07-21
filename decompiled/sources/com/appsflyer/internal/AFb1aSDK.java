package com.appsflyer.internal;

import com.appsflyer.AFLogger;

@Deprecated
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFb1aSDK {
    private final AFa1tSDK getMediationNetwork = new AFa1tSDK() { // from class: com.appsflyer.internal.AFb1aSDK.2
        @Override // com.appsflyer.internal.AFb1aSDK.AFa1tSDK
        public final Class<?> getCurrencyIso4217Code(String str) {
            return Class.forName(str);
        }
    };

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface AFa1tSDK {
        Class<?> getCurrencyIso4217Code(String str);
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public enum AFa1uSDK {
        ADOBE_AIR("android_adobe_air", "com.appsflyer.adobeair.AppsFlyerExtension"),
        ADOBE_MOBILE_SDK("android_adobe_mobile", "com.appsflyer.adobeextension.AppsFlyerAdobeExtension"),
        COCOS2DX("android_cocos2dx", "org.cocos2dx.lib.Cocos2dxActivity"),
        CORDOVA("android_cordova", "com.appsflyer.cordova.plugin.AppsFlyerPlugin"),
        DEFAULT("android_native", "android_native"),
        FLUTTER("android_flutter", "com.appsflyer.appsflyersdk.AppsflyerSdkPlugin"),
        M_PARTICLE("android_mparticle", "com.mparticle.kits.AppsFlyerKit"),
        NATIVE_SCRIPT("android_native_script", "com.tns.NativeScriptActivity"),
        EXPO("android_expo", "expo.modules.devmenu.react.DevMenuAwareReactActivity"),
        REACT_NATIVE("android_reactNative", "com.appsflyer.reactnative.RNAppsFlyerModule"),
        UNITY("android_unity", "com.appsflyer.unity.AppsFlyerAndroidWrapper"),
        UNREAL_ENGINE("android_unreal", "com.epicgames.ue4.GameActivity"),
        XAMARIN("android_xamarin", "mono.android.Runtime"),
        CAPACITOR("android_capacitor", "capacitor.plugin.appsflyer.sdk.AppsFlyerPlugin");

        final String AFAdRevenueData;
        final String getRevenue;

        AFa1uSDK(String str, String str2) {
            this.getRevenue = str;
            this.AFAdRevenueData = str2;
        }
    }

    private boolean AFAdRevenueData(String str) {
        try {
            this.getMediationNetwork.getCurrencyIso4217Code(str);
            StringBuilder sb = new StringBuilder("Class: ");
            sb.append(str);
            sb.append(" is found.");
            AFLogger.afRDLog(sb.toString());
            return true;
        } catch (ClassNotFoundException e6) {
            StringBuilder sb2 = new StringBuilder("Class: ");
            sb2.append(str);
            sb2.append(" is  not found. (Platform extension)");
            AFLogger.afErrorLogForExcManagerOnly(sb2.toString(), e6, true);
            return false;
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return false;
        }
    }

    public final String getMediationNetwork() {
        for (AFa1uSDK aFa1uSDK : AFa1uSDK.values()) {
            if (AFAdRevenueData(aFa1uSDK.AFAdRevenueData)) {
                return aFa1uSDK.getRevenue;
            }
        }
        return AFa1uSDK.DEFAULT.getRevenue;
    }
}
