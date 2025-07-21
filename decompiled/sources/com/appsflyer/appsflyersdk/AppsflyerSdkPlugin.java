package com.appsflyer.appsflyersdk;

import B9.a;
import G9.c;
import G9.j;
import G9.m;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.appsflyer.AFAdRevenueData;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerConsent;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.MediationNetwork;
import com.appsflyer.appsflyersdk.AppsflyerSdkPlugin;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.platform_extension.Plugin;
import com.appsflyer.internal.platform_extension.PluginInfo;
import com.appsflyer.share.CrossPromotionHelper;
import com.appsflyer.share.LinkGenerator;
import com.appsflyer.share.ShareInviteHelper;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class AppsflyerSdkPlugin implements j.c, B9.a, C9.a {
    private static DeepLinkResult cachedDeepLinkResult;
    private static Map<String, String> cachedOnAppOpenAttribution;
    private static String cachedOnAttributionFailure;
    private static String cachedOnConversionDataFail;
    private static Map<String, Object> cachedOnConversionDataSuccess;
    private static boolean saveCallbacks;
    private Activity activity;
    private final AppsFlyerConversionListener afConversionListener;
    private final DeepLinkListener afDeepLinkListener;
    private final j.c callbacksHandler;
    private Boolean gcdCallback;
    private Boolean isFacebookDeferredApplinksEnabled;
    private Boolean isSetDisableAdvertisingIdentifiersEnable;
    private Application mApplication;
    private j mCallbackChannel;
    private Map<String, Map<String, Object>> mCallbacks;
    private Context mContext;
    private G9.c mEventChannel;
    private Intent mIntent;
    private j mMethodChannel;
    private Boolean oaoaCallback;
    m onNewIntentListener;
    private Boolean udlCallback;
    final Handler uiThreadHandler = new Handler(Looper.getMainLooper());
    private Boolean validatePurchaseCallback;

    /* renamed from: com.appsflyer.appsflyersdk.AppsflyerSdkPlugin$5, reason: invalid class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class AnonymousClass5 implements AppsFlyerRequestListener {
        final /* synthetic */ AppsflyerSdkPlugin this$0;
        final /* synthetic */ j.d val$result;

        public AnonymousClass5(AppsflyerSdkPlugin appsflyerSdkPlugin, j.d dVar) {
            this.val$result = dVar;
            this.this$0 = appsflyerSdkPlugin;
        }

        public static /* synthetic */ void b(AnonymousClass5 anonymousClass5, int i6, String str) {
            anonymousClass5.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("errorCode", Integer.valueOf(i6));
            hashMap.put(com.amazon.a.a.o.b.f11202f, str);
            anonymousClass5.this$0.mMethodChannel.c("onError", hashMap);
        }

        @Override // com.appsflyer.attribution.AppsFlyerRequestListener
        public void onError(final int i6, final String str) {
            if (this.this$0.mMethodChannel != null) {
                this.this$0.uiThreadHandler.post(new Runnable() { // from class: com.appsflyer.appsflyersdk.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        AppsflyerSdkPlugin.AnonymousClass5.b(AppsflyerSdkPlugin.AnonymousClass5.this, i6, str);
                    }
                });
            } else {
                Log.e("AppsFlyer_FlutterPlugin", LogMessages.METHOD_CHANNEL_IS_NULL);
                this.val$result.b("NULL_OBJECT", LogMessages.METHOD_CHANNEL_IS_NULL, (Object) null);
            }
        }

        @Override // com.appsflyer.attribution.AppsFlyerRequestListener
        public void onSuccess() {
            if (this.this$0.mMethodChannel != null) {
                this.this$0.uiThreadHandler.post(new Runnable() { // from class: com.appsflyer.appsflyersdk.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        AppsflyerSdkPlugin.AnonymousClass5.this.this$0.mMethodChannel.c("onSuccess", (Object) null);
                    }
                });
            } else {
                Log.e("AppsFlyer_FlutterPlugin", LogMessages.METHOD_CHANNEL_IS_NULL);
                this.val$result.b("NULL_OBJECT", LogMessages.METHOD_CHANNEL_IS_NULL, (Object) null);
            }
        }
    }

    public AppsflyerSdkPlugin() {
        Boolean bool = Boolean.FALSE;
        this.gcdCallback = bool;
        this.oaoaCallback = bool;
        this.udlCallback = bool;
        this.validatePurchaseCallback = bool;
        this.isFacebookDeferredApplinksEnabled = bool;
        this.isSetDisableAdvertisingIdentifiersEnable = bool;
        this.mCallbacks = new HashMap();
        this.onNewIntentListener = new m() { // from class: com.appsflyer.appsflyersdk.AppsflyerSdkPlugin.1
            public boolean onNewIntent(Intent intent) {
                AppsflyerSdkPlugin.this.activity.setIntent(intent);
                return false;
            }
        };
        this.afConversionListener = new AppsFlyerConversionListener() { // from class: com.appsflyer.appsflyersdk.AppsflyerSdkPlugin.2
            @Override // com.appsflyer.AppsFlyerConversionListener
            public void onAppOpenAttribution(Map<String, String> map) {
                if (AppsflyerSdkPlugin.saveCallbacks) {
                    Map unused = AppsflyerSdkPlugin.cachedOnAppOpenAttribution = map;
                } else if (AppsflyerSdkPlugin.this.oaoaCallback.booleanValue()) {
                    AppsflyerSdkPlugin.this.runOnUIThread(new JSONObject(AppsflyerSdkPlugin.this.replaceNullValues(map)), "onAppOpenAttribution", com.amazon.device.simplesignin.a.a.a.f11730s);
                }
            }

            @Override // com.appsflyer.AppsFlyerConversionListener
            public void onAttributionFailure(String str) {
                if (AppsflyerSdkPlugin.saveCallbacks) {
                    String unused = AppsflyerSdkPlugin.cachedOnAttributionFailure = str;
                } else if (AppsflyerSdkPlugin.this.oaoaCallback.booleanValue()) {
                    AppsflyerSdkPlugin.this.runOnUIThread(AppsflyerSdkPlugin.this.buildJsonResponse(str, "failure"), "onAppOpenAttribution", "failure");
                }
            }

            @Override // com.appsflyer.AppsFlyerConversionListener
            public void onConversionDataFail(String str) {
                if (AppsflyerSdkPlugin.saveCallbacks) {
                    String unused = AppsflyerSdkPlugin.cachedOnConversionDataFail = str;
                } else if (AppsflyerSdkPlugin.this.gcdCallback.booleanValue()) {
                    AppsflyerSdkPlugin.this.runOnUIThread(AppsflyerSdkPlugin.this.buildJsonResponse(str, "failure"), "onInstallConversionData", "failure");
                }
            }

            @Override // com.appsflyer.AppsFlyerConversionListener
            public void onConversionDataSuccess(Map<String, Object> map) {
                if (AppsflyerSdkPlugin.saveCallbacks) {
                    Map unused = AppsflyerSdkPlugin.cachedOnConversionDataSuccess = map;
                } else if (AppsflyerSdkPlugin.this.gcdCallback.booleanValue()) {
                    AppsflyerSdkPlugin.this.runOnUIThread(new JSONObject(AppsflyerSdkPlugin.this.replaceNullValues(map)), "onInstallConversionData", com.amazon.device.simplesignin.a.a.a.f11730s);
                }
            }
        };
        this.afDeepLinkListener = new DeepLinkListener() { // from class: com.appsflyer.appsflyersdk.AppsflyerSdkPlugin.3
            @Override // com.appsflyer.deeplink.DeepLinkListener
            public void onDeepLinking(DeepLinkResult deepLinkResult) {
                if (AppsflyerSdkPlugin.saveCallbacks) {
                    DeepLinkResult unused = AppsflyerSdkPlugin.cachedDeepLinkResult = deepLinkResult;
                } else if (AppsflyerSdkPlugin.this.udlCallback.booleanValue()) {
                    AppsflyerSdkPlugin.this.runOnUIThread(deepLinkResult, "onDeepLinking", com.amazon.device.simplesignin.a.a.a.f11730s);
                }
            }
        };
        this.callbacksHandler = new j.c() { // from class: com.appsflyer.appsflyersdk.AppsflyerSdkPlugin.4
            public void onMethodCall(G9.i iVar, j.d dVar) {
                if ("startListening".equals(iVar.a)) {
                    AppsflyerSdkPlugin.this.startListening(iVar.b, dVar);
                } else {
                    dVar.c();
                }
            }
        };
    }

    private void addPushNotificationDeepLinkPath(G9.i iVar, j.d dVar) {
        Object obj = iVar.b;
        if (obj != null) {
            ArrayList arrayList = (ArrayList) obj;
            AppsFlyerLib.getInstance().addPushNotificationDeepLinkPath((String[]) arrayList.toArray(new String[arrayList.size()]));
        }
        dVar.a((Object) null);
    }

    private void anonymizeUser(G9.i iVar, j.d dVar) {
        AppsFlyerLib.getInstance().anonymizeUser(((Boolean) iVar.a("shouldAnonymize")).booleanValue());
        dVar.a((Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject buildJsonResponse(Object obj, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", str);
            jSONObject.put("data", obj.toString());
            return jSONObject;
        } catch (JSONException e6) {
            e6.printStackTrace();
            return jSONObject;
        }
    }

    private void enableFacebookDeferredApplinks(G9.i iVar, j.d dVar) {
        Boolean bool = (Boolean) iVar.a("isFacebookDeferredApplinksEnabled");
        bool.booleanValue();
        this.isFacebookDeferredApplinksEnabled = bool;
        if (bool.booleanValue()) {
            AppsFlyerLib.getInstance().enableFacebookDeferredApplinks(true);
        } else {
            AppsFlyerLib.getInstance().enableFacebookDeferredApplinks(false);
        }
        dVar.a((Object) null);
    }

    private void enableTCFDataCollection(G9.i iVar, j.d dVar) {
        AppsFlyerLib.getInstance().enableTCFDataCollection(((Boolean) iVar.a("shouldCollect")).booleanValue());
        dVar.a((Object) null);
    }

    private void generateInviteLink(G9.i iVar, j.d dVar) {
        String str = (String) iVar.a(AppsFlyerProperties.CHANNEL);
        String str2 = (String) iVar.a("customerID");
        String str3 = (String) iVar.a("campaign");
        String str4 = (String) iVar.a("referrerName");
        String str5 = (String) iVar.a("referrerImageUrl");
        String str6 = (String) iVar.a("baseDeeplink");
        String str7 = (String) iVar.a("brandDomain");
        Map<String, String> map = (Map) iVar.a("customParams");
        LinkGenerator generateInviteUrl = ShareInviteHelper.generateInviteUrl(this.mContext);
        if (str != null && !str.equals("")) {
            generateInviteUrl.setChannel(str);
        }
        if (str3 != null && !str3.equals("")) {
            generateInviteUrl.setCampaign(str3);
        }
        if (str4 != null && !str4.equals("")) {
            generateInviteUrl.setReferrerName(str4);
        }
        if (str5 != null && !str5.equals("")) {
            generateInviteUrl.setReferrerImageURL(str5);
        }
        if (str2 != null && !str2.equals("")) {
            generateInviteUrl.setReferrerCustomerId(str2);
        }
        if (str6 != null && !str6.equals("")) {
            generateInviteUrl.setBaseDeeplink(str6);
        }
        if (str7 != null && !str7.equals("")) {
            generateInviteUrl.setBrandDomain(str7);
        }
        if (map != null && !map.equals("")) {
            generateInviteUrl.addParameters(map);
        }
        generateInviteUrl.generateLink(this.mContext, new LinkGenerator.ResponseListener() { // from class: com.appsflyer.appsflyersdk.AppsflyerSdkPlugin.6
            final JSONObject obj = new JSONObject();

            @Override // com.appsflyer.share.LinkGenerator.ResponseListener
            public void onResponse(String str8) {
                if (AppsflyerSdkPlugin.this.mCallbacks.containsKey("generateInviteLinkSuccess")) {
                    try {
                        this.obj.put("userInviteURL", str8);
                        AppsflyerSdkPlugin.this.runOnUIThread(this.obj, "generateInviteLinkSuccess", com.amazon.device.simplesignin.a.a.a.f11730s);
                    } catch (JSONException e6) {
                        e6.printStackTrace();
                    }
                }
            }

            @Override // com.appsflyer.share.LinkGenerator.ResponseListener
            public void onResponseError(String str8) {
                if (AppsflyerSdkPlugin.this.mCallbacks.containsKey("generateInviteLinkFailure")) {
                    try {
                        this.obj.put("error", str8);
                        AppsflyerSdkPlugin.this.runOnUIThread(str8, "generateInviteLinkFailure", "failure");
                    } catch (JSONException e6) {
                        e6.printStackTrace();
                    }
                }
            }
        });
        dVar.a((Object) null);
    }

    private void getAppsFlyerUID(j.d dVar) {
        dVar.a(AppsFlyerLib.getInstance().getAppsFlyerUID(this.mContext));
    }

    private void getHostName(j.d dVar) {
        dVar.a(AppsFlyerLib.getInstance().getHostName());
    }

    private void getHostPrefix(j.d dVar) {
        dVar.a(AppsFlyerLib.getInstance().getHostPrefix());
    }

    private void getOutOfStore(j.d dVar) {
        dVar.a(AppsFlyerLib.getInstance().getOutOfStore(this.mContext));
    }

    private void getSdkVersion(j.d dVar) {
        dVar.a(AppsFlyerLib.getInstance().getSdkVersion());
    }

    private void initSdk(G9.i iVar, j.d dVar) {
        AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
        boolean booleanValue = ((Boolean) iVar.a("manualStart")).booleanValue();
        String str = (String) iVar.a("afDevKey");
        if (str == null || str.equals("")) {
            dVar.b((String) null, "AF Dev Key is empty", "AF dev key cannot be empty");
        }
        if (((Boolean) iVar.a("disableAdvertisingIdentifier")).booleanValue()) {
            appsFlyerLib.setDisableAdvertisingIdentifiers(true);
        }
        AppsFlyerConversionListener appsFlyerConversionListener = ((Boolean) iVar.a("GCD")).booleanValue() ? this.afConversionListener : null;
        if (((Boolean) iVar.a("UDL")).booleanValue()) {
            appsFlyerLib.subscribeForDeepLink(this.afDeepLinkListener);
        }
        if (((Boolean) iVar.a("isDebug")).booleanValue()) {
            appsFlyerLib.setLogLevel(AFLogger.LogLevel.DEBUG);
            appsFlyerLib.setDebugLog(true);
        } else {
            appsFlyerLib.setDebugLog(false);
        }
        appsFlyerLib.setPluginInfo(new PluginInfo(Plugin.FLUTTER, "6.15.1"));
        appsFlyerLib.init(str, appsFlyerConversionListener, this.mContext);
        String str2 = (String) iVar.a("appInviteOneLink");
        if (str2 != null) {
            appsFlyerLib.setAppInviteOneLink(str2);
        }
        if (!booleanValue) {
            appsFlyerLib.start(this.activity);
        }
        if (saveCallbacks) {
            saveCallbacks = false;
            sendCachedCallbacksToDart();
        }
        dVar.a(com.amazon.device.simplesignin.a.a.a.f11730s);
    }

    private static Bundle jsonToBundle(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            bundle.putString(next, jSONObject.getString(next));
        }
        return bundle;
    }

    private void logAdRevenue(G9.i iVar, j.d dVar) {
        try {
            String str = (String) requireNonNullArgument(iVar, "monetizationNetwork");
            String str2 = (String) requireNonNullArgument(iVar, "currencyIso4217Code");
            double doubleValue = ((Double) requireNonNullArgument(iVar, "revenue")).doubleValue();
            MediationNetwork valueOf = MediationNetwork.valueOf(((String) requireNonNullArgument(iVar, "mediationNetwork")).toUpperCase());
            AppsFlyerLib.getInstance().logAdRevenue(new AFAdRevenueData(str, valueOf, str2, doubleValue), (Map) iVar.a("additionalParameters"));
            dVar.a(Boolean.TRUE);
        } catch (IllegalArgumentException e6) {
            dVar.b("INVALID_ARGUMENT_PROVIDED", e6.getMessage(), (Object) null);
        } catch (Throwable th) {
            dVar.b("UNEXPECTED_ERROR", "[logAdRevenue]: An unexpected error occurred: " + th.getMessage(), (Object) null);
            Log.e("AppsFlyer_FlutterPlugin", "Unexpected exception occurred: [logAdRevenue]", th);
        }
    }

    private void logCrossPromotionAndOpenStore(G9.i iVar, j.d dVar) {
        String str = (String) iVar.a("appId");
        String str2 = (String) iVar.a("campaign");
        Map map = (Map) iVar.a("params");
        if (str != null && !str.equals("")) {
            CrossPromotionHelper.logAndOpenStore(this.mContext, str, str2, map);
        }
        dVar.a((Object) null);
    }

    private void logCrossPromotionImpression(G9.i iVar, j.d dVar) {
        String str = (String) iVar.a("appId");
        String str2 = (String) iVar.a("campaign");
        Map map = (Map) iVar.a("data");
        if (str != null && !str.equals("")) {
            CrossPromotionHelper.logCrossPromoteImpression(this.mContext, str, str2, map);
        }
        dVar.a((Object) null);
    }

    private void logEvent(G9.i iVar, j.d dVar) {
        AppsFlyerLib.getInstance().logEvent(this.mContext, (String) iVar.a("eventName"), (Map) iVar.a("eventValues"));
        dVar.a(Boolean.TRUE);
    }

    private void onAttachedToEngine(Context context, G9.b bVar) {
        this.mContext = context;
        this.mEventChannel = new G9.c(bVar, "af-events");
        j jVar = new j(bVar, "af-api");
        this.mMethodChannel = jVar;
        jVar.e(this);
        j jVar2 = new j(bVar, "callbacks");
        this.mCallbackChannel = jVar2;
        jVar2.e(this.callbacksHandler);
    }

    private void performOnDeepLinking(G9.i iVar, j.d dVar) {
        Activity activity = this.activity;
        if (activity == null) {
            Log.d("AppsFlyer_FlutterPlugin", "performOnDeepLinking: activity is null!");
            dVar.b("NO_ACTIVITY", "The current activity is null", (Object) null);
            return;
        }
        Intent intent = activity.getIntent();
        if (intent != null) {
            AppsFlyerLib.getInstance().performOnDeepLinking(intent, this.mApplication);
            dVar.a((Object) null);
        } else {
            Log.d("AppsFlyer_FlutterPlugin", "performOnDeepLinking: intent is null!");
            dVar.b("NO_INTENT", "The intent is null", (Object) null);
        }
    }

    private void registerValidatorListener() {
        AppsFlyerLib.getInstance().registerValidatorListener(this.mContext, new AppsFlyerInAppPurchaseValidatorListener() { // from class: com.appsflyer.appsflyersdk.AppsflyerSdkPlugin.8
            @Override // com.appsflyer.AppsFlyerInAppPurchaseValidatorListener
            public void onValidateInApp() {
                if (AppsflyerSdkPlugin.this.validatePurchaseCallback.booleanValue()) {
                    AppsflyerSdkPlugin.this.runOnUIThread(new JSONObject(), "validatePurchase", com.amazon.device.simplesignin.a.a.a.f11730s);
                }
            }

            @Override // com.appsflyer.AppsFlyerInAppPurchaseValidatorListener
            public void onValidateInAppFailure(String str) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("error", str);
                    if (AppsflyerSdkPlugin.this.validatePurchaseCallback.booleanValue()) {
                        AppsflyerSdkPlugin.this.runOnUIThread(jSONObject, "validatePurchase", "failure");
                    }
                } catch (JSONException e6) {
                    e6.printStackTrace();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Object> replaceNullValues(Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Object> next = it.next();
            hashMap.put(next.getKey(), next.getValue() == null ? JSONObject.NULL : next.getValue());
            it.remove();
        }
        return hashMap;
    }

    private <T> T requireNonNullArgument(G9.i iVar, String str) {
        T t6 = (T) iVar.a(str);
        if (t6 != null) {
            return t6;
        }
        Log.e("AppsFlyer_FlutterPlugin", "Exception occurred when trying to: " + iVar.a + "->" + str + " must not be null");
        throw new IllegalArgumentException("[" + iVar.a + "]: " + str + " must not be null");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void runOnUIThread(final Object obj, final String str, final String str2) {
        this.uiThreadHandler.post(new Runnable(this) { // from class: com.appsflyer.appsflyersdk.AppsflyerSdkPlugin.7
            final /* synthetic */ AppsflyerSdkPlugin this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                Log.d("Callbacks", "Calling invokeMethod with: " + obj);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", str);
                    if (str.equals("onDeepLinking")) {
                        DeepLinkResult deepLinkResult = (DeepLinkResult) obj;
                        jSONObject.put("deepLinkStatus", deepLinkResult.getStatus().toString());
                        if (deepLinkResult.getError() != null) {
                            jSONObject.put("deepLinkError", deepLinkResult.getError().toString());
                        }
                        if (deepLinkResult.getStatus() == DeepLinkResult.Status.FOUND) {
                            jSONObject.put("deepLinkObj", deepLinkResult.getDeepLink().getClickEvent());
                        }
                    } else {
                        jSONObject.put("status", str2);
                        jSONObject.put("data", obj.toString());
                    }
                } catch (JSONException e6) {
                    e6.printStackTrace();
                }
                this.this$0.mCallbackChannel.c("callListener", jSONObject.toString());
            }
        });
    }

    private void sendCachedCallbacksToDart() {
        DeepLinkResult deepLinkResult = cachedDeepLinkResult;
        if (deepLinkResult != null) {
            this.afDeepLinkListener.onDeepLinking(deepLinkResult);
            cachedDeepLinkResult = null;
        }
        Map<String, Object> map = cachedOnConversionDataSuccess;
        if (map != null) {
            this.afConversionListener.onConversionDataSuccess(map);
            cachedOnConversionDataSuccess = null;
        }
        Map<String, String> map2 = cachedOnAppOpenAttribution;
        if (map2 != null) {
            this.afConversionListener.onAppOpenAttribution(map2);
            cachedOnAppOpenAttribution = null;
        }
        String str = cachedOnAttributionFailure;
        if (str != null) {
            this.afConversionListener.onAttributionFailure(str);
            cachedOnAttributionFailure = null;
        }
        String str2 = cachedOnConversionDataFail;
        if (str2 != null) {
            this.afConversionListener.onConversionDataFail(str2);
            cachedOnConversionDataFail = null;
        }
    }

    private void sendPushNotificationData(G9.i iVar, j.d dVar) {
        String str;
        Map map = (Map) iVar.b;
        if (map == null) {
            Log.d("AppsFlyer_FlutterPlugin", "Push payload is null");
            return;
        }
        try {
            Bundle jsonToBundle = jsonToBundle(new JSONObject(map));
            Activity activity = this.activity;
            if (activity != null) {
                Intent intent = activity.getIntent();
                if (intent != null) {
                    intent.putExtras(jsonToBundle);
                    this.activity.setIntent(intent);
                    AppsFlyerLib.getInstance().sendPushNotificationData(this.activity);
                    str = null;
                } else {
                    str = "The intent is null. Push payload has not been sent!";
                }
            } else {
                str = "The activity is null. Push payload has not been sent!";
            }
            if (str != null) {
                Log.d("AppsFlyer_FlutterPlugin", str);
            } else {
                dVar.a((Object) null);
            }
        } catch (JSONException unused) {
            Log.d("AppsFlyer_FlutterPlugin", "Can't parse pushPayload to bundle");
        }
    }

    private void setAdditionalData(G9.i iVar, j.d dVar) {
        AppsFlyerLib.getInstance().setAdditionalData((HashMap) iVar.a("customData"));
        dVar.a((Object) null);
    }

    private void setAndroidIdData(G9.i iVar, j.d dVar) {
        AppsFlyerLib.getInstance().setAndroidIdData((String) iVar.a("androidId"));
        dVar.a((Object) null);
    }

    private void setAppInivteOneLinkID(G9.i iVar, j.d dVar) {
        String str = (String) iVar.a("oneLinkID");
        if (str == null || str.length() == 0) {
            dVar.a((Object) null);
            return;
        }
        AppsFlyerLib.getInstance().setAppInviteOneLink(str);
        if (this.mCallbacks.containsKey("setAppInviteOneLinkIDCallback")) {
            runOnUIThread(buildJsonResponse(com.amazon.device.simplesignin.a.a.a.f11730s, com.amazon.device.simplesignin.a.a.a.f11730s), "setAppInviteOneLinkIDCallback", com.amazon.device.simplesignin.a.a.a.f11730s);
        }
    }

    private void setCollectAndroidId(G9.i iVar, j.d dVar) {
        AppsFlyerLib.getInstance().setCollectAndroidID(((Boolean) iVar.a("isCollect")).booleanValue());
        dVar.a((Object) null);
    }

    private void setCollectIMEI(G9.i iVar, j.d dVar) {
        AppsFlyerLib.getInstance().setCollectIMEI(((Boolean) iVar.a("isCollect")).booleanValue());
        dVar.a((Object) null);
    }

    private void setCurrencyCode(G9.i iVar, j.d dVar) {
        AppsFlyerLib.getInstance().setCurrencyCode((String) iVar.a(AppsFlyerProperties.CURRENCY_CODE));
        dVar.a((Object) null);
    }

    private void setCustomerIdAndLogSession(G9.i iVar, j.d dVar) {
        AppsFlyerLib.getInstance().setCustomerIdAndLogSession((String) iVar.a("id"), this.mContext);
        dVar.a((Object) null);
    }

    private void setCustomerUserId(G9.i iVar, j.d dVar) {
        AppsFlyerLib.getInstance().setCustomerUserId((String) iVar.a("id"));
        dVar.a((Object) null);
    }

    private void setDisableAdvertisingIdentifiers(G9.i iVar, j.d dVar) {
        Boolean bool = (Boolean) iVar.b;
        bool.booleanValue();
        this.isSetDisableAdvertisingIdentifiersEnable = bool;
        if (bool.booleanValue()) {
            AppsFlyerLib.getInstance().setDisableAdvertisingIdentifiers(true);
        } else {
            AppsFlyerLib.getInstance().setDisableAdvertisingIdentifiers(false);
        }
        dVar.a((Object) null);
    }

    private void setDisableNetworkData(G9.i iVar, j.d dVar) {
        AppsFlyerLib.getInstance().setDisableNetworkData(((Boolean) iVar.b).booleanValue());
        dVar.a((Object) null);
    }

    private void setHost(G9.i iVar, j.d dVar) {
        AppsFlyerLib.getInstance().setHost((String) iVar.a("hostPrefix"), (String) iVar.a("hostName"));
    }

    private void setImeiData(G9.i iVar, j.d dVar) {
        AppsFlyerLib.getInstance().setImeiData((String) iVar.a("imei"));
        dVar.a((Object) null);
    }

    private void setIsUpdate(G9.i iVar, j.d dVar) {
        AppsFlyerLib.getInstance().setIsUpdate(((Boolean) iVar.a("isUpdate")).booleanValue());
        dVar.a((Object) null);
    }

    private void setMinTimeBetweenSessions(G9.i iVar, j.d dVar) {
        AppsFlyerLib.getInstance().setMinTimeBetweenSessions(((Integer) iVar.a("seconds")).intValue());
        dVar.a((Object) null);
    }

    private void setOneLinkCustomDomain(G9.i iVar, j.d dVar) {
        ArrayList arrayList = (ArrayList) iVar.b;
        AppsFlyerLib.getInstance().setOneLinkCustomDomain((String[]) arrayList.toArray(new String[arrayList.size()]));
        dVar.a((Object) null);
    }

    private void setOutOfStore(G9.i iVar, j.d dVar) {
        String str = (String) iVar.b;
        if (str != null) {
            AppsFlyerLib.getInstance().setOutOfStore(str);
        }
        dVar.a((Object) null);
    }

    private void setPartnerData(G9.i iVar, j.d dVar) {
        String str = (String) iVar.a("partnerId");
        HashMap hashMap = (HashMap) iVar.a("partnersData");
        if (hashMap != null) {
            AppsFlyerLib.getInstance().setPartnerData(str, hashMap);
        }
        dVar.a((Object) null);
    }

    private void setPushNotification(G9.i iVar, j.d dVar) {
        AppsFlyerLib.getInstance().sendPushNotificationData(this.activity);
        dVar.a((Object) null);
    }

    private void setResolveDeepLinkURLs(G9.i iVar, j.d dVar) {
        AppsFlyerLib.getInstance().setResolveDeepLinkURLs((String[]) ((ArrayList) iVar.b).toArray(new String[0]));
        dVar.a((Object) null);
    }

    private void setSharingFilter(G9.i iVar, j.d dVar) {
        AppsFlyerLib.getInstance().setSharingFilter(new String[0]);
        dVar.a((Object) null);
    }

    private void setSharingFilterForAllPartners(j.d dVar) {
        AppsFlyerLib.getInstance().setSharingFilterForAllPartners();
        dVar.a((Object) null);
    }

    private void setSharingFilterForPartners(G9.i iVar, j.d dVar) {
        Object obj = iVar.b;
        if (obj != null) {
            ArrayList arrayList = (ArrayList) obj;
            AppsFlyerLib.getInstance().setSharingFilterForPartners((String[]) arrayList.toArray(new String[arrayList.size()]));
        }
        dVar.a((Object) null);
    }

    private void setUserEmails(G9.i iVar, j.d dVar) {
        AppsFlyerProperties.EmailsCryptType emailsCryptType;
        List list = (List) iVar.a("emails");
        int intValue = ((Integer) iVar.a("cryptType")).intValue();
        if (intValue == 0) {
            emailsCryptType = AppsFlyerProperties.EmailsCryptType.NONE;
        } else {
            if (intValue != 1) {
                throw new InvalidParameterException("You can use only NONE or SHA256 for EmailsCryptType on android");
            }
            emailsCryptType = AppsFlyerProperties.EmailsCryptType.SHA256;
        }
        if (list != null) {
            AppsFlyerLib.getInstance().setUserEmails(emailsCryptType, (String[]) list.toArray(new String[0]));
        }
        dVar.a((Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startListening(Object obj, j.d dVar) {
        String str = (String) obj;
        if (str.equals("onInstallConversionData")) {
            this.gcdCallback = Boolean.TRUE;
        }
        if (str.equals("onAppOpenAttribution")) {
            this.oaoaCallback = Boolean.TRUE;
        }
        if (str.equals("onDeepLinking")) {
            this.udlCallback = Boolean.TRUE;
        }
        if (str.equals("validatePurchase")) {
            this.validatePurchaseCallback = Boolean.TRUE;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("id", str);
        this.mCallbacks.put(str, hashMap);
        dVar.a((Object) null);
    }

    private void startSDK(G9.i iVar, j.d dVar) {
        AppsFlyerLib.getInstance().start(this.activity);
        dVar.a((Object) null);
    }

    private void startSDKwithHandler(G9.i iVar, j.d dVar) {
        try {
            AppsFlyerLib.getInstance().start(this.activity, null, new AnonymousClass5(this, dVar));
            dVar.a((Object) null);
        } catch (Throwable th) {
            dVar.b("UNEXPECTED_ERROR", th.getMessage(), (Object) null);
        }
    }

    private void stop(G9.i iVar, j.d dVar) {
        AppsFlyerLib.getInstance().stop(((Boolean) iVar.a("isStopped")).booleanValue(), this.mContext);
        dVar.a((Object) null);
    }

    private void updateServerUninstallToken(G9.i iVar, j.d dVar) {
        AppsFlyerLib.getInstance().updateServerUninstallToken(this.mContext, (String) iVar.a("token"));
        dVar.a((Object) null);
    }

    private void validateAndLogInAppPurchase(G9.i iVar, j.d dVar) {
        registerValidatorListener();
        AppsFlyerLib.getInstance().validateAndLogInAppPurchase(this.mContext, (String) iVar.a("publicKey"), (String) iVar.a("signature"), (String) iVar.a("purchaseData"), (String) iVar.a(com.amazon.a.a.o.b.f11220x), (String) iVar.a(com.amazon.a.a.o.b.f11197a), (Map) iVar.a("additionalParameters"));
        dVar.a((Object) null);
    }

    private void waitForCustomerUserId(G9.i iVar, j.d dVar) {
        AppsFlyerLib.getInstance().waitForCustomerUserId(((Boolean) iVar.a("wait")).booleanValue());
        dVar.a((Object) null);
    }

    public void onAttachedToActivity(C9.c cVar) {
        this.activity = cVar.f();
        this.mIntent = cVar.f().getIntent();
        this.mApplication = cVar.f().getApplication();
        cVar.h(this.onNewIntentListener);
    }

    public void onDetachedFromActivity() {
        this.activity = null;
        saveCallbacks = true;
    }

    public void onDetachedFromActivityForConfigChanges() {
    }

    public void onDetachedFromEngine(a.b bVar) {
        this.mMethodChannel.e((j.c) null);
        this.mMethodChannel = null;
        this.mEventChannel.d((c.d) null);
        this.mEventChannel = null;
        AppsFlyerPurchaseConnector.INSTANCE.onDetachedFromEngine(bVar);
    }

    public void onMethodCall(G9.i iVar, j.d dVar) {
        if (this.activity == null) {
            Log.d("AppsFlyer_FlutterPlugin", LogMessages.ACTIVITY_NOT_ATTACHED_TO_ENGINE);
            return;
        }
        String str = iVar.a;
        str.getClass();
        char c6 = 65535;
        switch (str.hashCode()) {
            case -2012504269:
                if (str.equals("setAppInviteOneLinkID")) {
                    c6 = 0;
                    break;
                }
                break;
            case -1995722377:
                if (str.equals("validateAndLogInAppAndroidPurchase")) {
                    c6 = 1;
                    break;
                }
                break;
            case -1820568830:
                if (str.equals("setSharingFilterForPartners")) {
                    c6 = 2;
                    break;
                }
                break;
            case -1777356377:
                if (str.equals("setPushNotification")) {
                    c6 = 3;
                    break;
                }
                break;
            case -1489605040:
                if (str.equals("getHostPrefix")) {
                    c6 = 4;
                    break;
                }
                break;
            case -1437772080:
                if (str.equals("setPartnerData")) {
                    c6 = 5;
                    break;
                }
                break;
            case -1267985549:
                if (str.equals("setOneLinkCustomDomain")) {
                    c6 = 6;
                    break;
                }
                break;
            case -1253411310:
                if (str.equals("getOutOfStore")) {
                    c6 = 7;
                    break;
                }
                break;
            case -1191484736:
                if (str.equals("enableFacebookDeferredApplinks")) {
                    c6 = '\b';
                    break;
                }
                break;
            case -752931040:
                if (str.equals("setCurrencyCode")) {
                    c6 = '\t';
                    break;
                }
                break;
            case -717099497:
                if (str.equals("sendPushNotificationData")) {
                    c6 = '\n';
                    break;
                }
                break;
            case -559100112:
                if (str.equals("setCollectIMEI")) {
                    c6 = 11;
                    break;
                }
                break;
            case -512438553:
                if (str.equals("logCrossPromotionAndOpenStore")) {
                    c6 = '\f';
                    break;
                }
                break;
            case -479280098:
                if (str.equals("setOutOfStore")) {
                    c6 = '\r';
                    break;
                }
                break;
            case -249478878:
                if (str.equals("setConsentData")) {
                    c6 = 14;
                    break;
                }
                break;
            case -191766732:
                if (str.equals("getSDKVersion")) {
                    c6 = 15;
                    break;
                }
                break;
            case -171680875:
                if (str.equals("logAdRevenue")) {
                    c6 = 16;
                    break;
                }
                break;
            case -144228848:
                if (str.equals("logCrossPromotionImpression")) {
                    c6 = 17;
                    break;
                }
                break;
            case -120258830:
                if (str.equals("setDisableNetworkData")) {
                    c6 = 18;
                    break;
                }
                break;
            case 3540994:
                if (str.equals("stop")) {
                    c6 = 19;
                    break;
                }
                break;
            case 12497644:
                if (str.equals("setDisableAdvertisingIdentifiers")) {
                    c6 = 20;
                    break;
                }
                break;
            case 23388530:
                if (str.equals("setAndroidIdData")) {
                    c6 = 21;
                    break;
                }
                break;
            case 24884786:
                if (str.equals("setSharingFilter")) {
                    c6 = 22;
                    break;
                }
                break;
            case 205546591:
                if (str.equals("anonymizeUser")) {
                    c6 = 23;
                    break;
                }
                break;
            case 312972995:
                if (str.equals("updateServerUninstallToken")) {
                    c6 = 24;
                    break;
                }
                break;
            case 572656008:
                if (str.equals("setMinTimeBetweenSessions")) {
                    c6 = 25;
                    break;
                }
                break;
            case 655665144:
                if (str.equals("waitForCustomerUserId")) {
                    c6 = 26;
                    break;
                }
                break;
            case 668311477:
                if (str.equals("setSharingFilterForAllPartners")) {
                    c6 = 27;
                    break;
                }
                break;
            case 725535758:
                if (str.equals("setCustomerIdAndLogSession")) {
                    c6 = 28;
                    break;
                }
                break;
            case 747368646:
                if (str.equals("setCustomerUserId")) {
                    c6 = 29;
                    break;
                }
                break;
            case 927926776:
                if (str.equals("generateInviteLink")) {
                    c6 = 30;
                    break;
                }
                break;
            case 1040605788:
                if (str.equals(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION)) {
                    c6 = 31;
                    break;
                }
                break;
            case 1179298132:
                if (str.equals("setResolveDeepLinkURLs")) {
                    c6 = ' ';
                    break;
                }
                break;
            case 1245101844:
                if (str.equals("setImeiData")) {
                    c6 = '!';
                    break;
                }
                break;
            case 1316784248:
                if (str.equals("startSDK")) {
                    c6 = '\"';
                    break;
                }
                break;
            case 1523989980:
                if (str.equals("performOnDeepLinking")) {
                    c6 = '#';
                    break;
                }
                break;
            case 1586688044:
                if (str.equals("startSDKwithHandler")) {
                    c6 = '$';
                    break;
                }
                break;
            case 1660731908:
                if (str.equals("setUserEmails")) {
                    c6 = '%';
                    break;
                }
                break;
            case 1777143241:
                if (str.equals("getHostName")) {
                    c6 = '&';
                    break;
                }
                break;
            case 1809410897:
                if (str.equals("addPushNotificationDeepLinkPath")) {
                    c6 = '\'';
                    break;
                }
                break;
            case 1824508181:
                if (str.equals("setIsUpdate")) {
                    c6 = '(';
                    break;
                }
                break;
            case 1877854818:
                if (str.equals("setCollectAndroidId")) {
                    c6 = ')';
                    break;
                }
                break;
            case 1948321034:
                if (str.equals("initSdk")) {
                    c6 = '*';
                    break;
                }
                break;
            case 1984636202:
                if (str.equals("setHost")) {
                    c6 = '+';
                    break;
                }
                break;
            case 1989757366:
                if (str.equals("logEvent")) {
                    c6 = ',';
                    break;
                }
                break;
            case 1998705368:
                if (str.equals("getAppsFlyerUID")) {
                    c6 = '-';
                    break;
                }
                break;
            case 2088314227:
                if (str.equals("setAdditionalData")) {
                    c6 = com.amazon.a.a.o.c.a.b.f11260a;
                    break;
                }
                break;
        }
        switch (c6) {
            case 0:
                setAppInivteOneLinkID(iVar, dVar);
                return;
            case 1:
                validateAndLogInAppPurchase(iVar, dVar);
                return;
            case 2:
                setSharingFilterForPartners(iVar, dVar);
                return;
            case 3:
                setPushNotification(iVar, dVar);
                return;
            case 4:
                getHostPrefix(dVar);
                return;
            case 5:
                setPartnerData(iVar, dVar);
                return;
            case 6:
                setOneLinkCustomDomain(iVar, dVar);
                return;
            case 7:
                getOutOfStore(dVar);
                return;
            case '\b':
                enableFacebookDeferredApplinks(iVar, dVar);
                return;
            case '\t':
                setCurrencyCode(iVar, dVar);
                return;
            case '\n':
                sendPushNotificationData(iVar, dVar);
                return;
            case 11:
                setCollectIMEI(iVar, dVar);
                return;
            case '\f':
                logCrossPromotionAndOpenStore(iVar, dVar);
                return;
            case '\r':
                setOutOfStore(iVar, dVar);
                return;
            case 14:
                setConsentData(iVar, dVar);
                return;
            case 15:
                getSdkVersion(dVar);
                return;
            case 16:
                logAdRevenue(iVar, dVar);
                return;
            case 17:
                logCrossPromotionImpression(iVar, dVar);
                return;
            case 18:
                setDisableNetworkData(iVar, dVar);
                return;
            case 19:
                stop(iVar, dVar);
                return;
            case 20:
                setDisableAdvertisingIdentifiers(iVar, dVar);
                return;
            case 21:
                setAndroidIdData(iVar, dVar);
                return;
            case 22:
                setSharingFilter(iVar, dVar);
                return;
            case 23:
                anonymizeUser(iVar, dVar);
                return;
            case 24:
                updateServerUninstallToken(iVar, dVar);
                return;
            case 25:
                setMinTimeBetweenSessions(iVar, dVar);
                return;
            case 26:
                waitForCustomerUserId(iVar, dVar);
                return;
            case 27:
                setSharingFilterForAllPartners(dVar);
                return;
            case 28:
                setCustomerIdAndLogSession(iVar, dVar);
                return;
            case 29:
                setCustomerUserId(iVar, dVar);
                return;
            case 30:
                generateInviteLink(iVar, dVar);
                return;
            case 31:
                enableTCFDataCollection(iVar, dVar);
                return;
            case ' ':
                setResolveDeepLinkURLs(iVar, dVar);
                return;
            case '!':
                setImeiData(iVar, dVar);
                return;
            case '\"':
                startSDK(iVar, dVar);
                return;
            case '#':
                performOnDeepLinking(iVar, dVar);
                return;
            case '$':
                startSDKwithHandler(iVar, dVar);
                return;
            case '%':
                setUserEmails(iVar, dVar);
                return;
            case '&':
                getHostName(dVar);
                return;
            case '\'':
                addPushNotificationDeepLinkPath(iVar, dVar);
                return;
            case '(':
                setIsUpdate(iVar, dVar);
                return;
            case ')':
                setCollectAndroidId(iVar, dVar);
                return;
            case '*':
                initSdk(iVar, dVar);
                return;
            case '+':
                setHost(iVar, dVar);
                return;
            case ',':
                logEvent(iVar, dVar);
                return;
            case '-':
                getAppsFlyerUID(dVar);
                return;
            case '.':
                setAdditionalData(iVar, dVar);
                return;
            default:
                dVar.c();
                return;
        }
    }

    public void onReattachedToActivityForConfigChanges(C9.c cVar) {
        sendCachedCallbacksToDart();
        cVar.h(this.onNewIntentListener);
    }

    public void setConsentData(G9.i iVar, j.d dVar) {
        Map map = (Map) ((Map) iVar.b).get("consentData");
        boolean booleanValue = ((Boolean) map.get("isUserSubjectToGDPR")).booleanValue();
        Boolean bool = (Boolean) map.get("hasConsentForDataUsage");
        Boolean bool2 = (Boolean) map.get("hasConsentForAdsPersonalization");
        AppsFlyerLib.getInstance().setConsentData((!booleanValue || bool == null || bool2 == null) ? AppsFlyerConsent.forNonGDPRUser() : AppsFlyerConsent.forGDPRUser(bool.booleanValue(), bool2.booleanValue()));
        dVar.a((Object) null);
    }

    public void onAttachedToEngine(a.b bVar) {
        onAttachedToEngine(bVar.a(), bVar.b());
        AppsFlyerPurchaseConnector.INSTANCE.onAttachedToEngine(bVar);
    }
}
