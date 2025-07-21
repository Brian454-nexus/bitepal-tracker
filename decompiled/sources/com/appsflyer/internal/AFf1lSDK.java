package com.appsflyer.internal;

import android.graphics.Color;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.UUID;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFf1lSDK extends AFf1oSDK<Map<String, String>> {
    public AFa1uSDK component3;
    private String copy;
    private String copydefault;
    private final boolean equals;
    private String hashCode;
    private final AFe1qSDK toString;
    private final UUID values;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface AFa1uSDK {
        void getCurrencyIso4217Code(String str);

        void getRevenue(Map<String, String> map);
    }

    public AFf1lSDK(@NonNull AFd1kSDK aFd1kSDK, @NonNull UUID uuid, @NonNull Uri uri) {
        super(AFf1zSDK.ONELINK, new AFf1zSDK[]{AFf1zSDK.RC_CDN}, aFd1kSDK, uuid.toString());
        this.toString = aFd1kSDK.getCurrencyIso4217Code();
        this.values = uuid;
        boolean z6 = false;
        try {
            if (!AFc1sSDK.getRevenue(uri.getHost()) && !AFc1sSDK.getRevenue(uri.getPath())) {
                try {
                    Object[] objArr = {uri, aFd1kSDK.d()};
                    Map map = AFa1vSDK.registerClient;
                    Object obj = map.get(94011772);
                    if (obj == null) {
                        obj = ((Class) AFa1vSDK.getRevenue(37 - TextUtils.indexOf("", "", 0), TextUtils.getOffsetBefore("", 0) + 233, (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 38237))).getDeclaredConstructor(Uri.class, AFc1kSDK.class);
                        map.put(94011772, obj);
                    }
                    Object newInstance = ((Constructor) obj).newInstance(objArr);
                    try {
                        Object obj2 = map.get(503513178);
                        if (obj2 == null) {
                            obj2 = ((Class) AFa1vSDK.getRevenue(Color.alpha(0) + 37, 233 - TextUtils.indexOf("", ""), (char) (View.resolveSize(0, 0) + 38237))).getMethod("getMonetizationNetwork", null);
                            map.put(503513178, obj2);
                        }
                        Object invoke = ((Method) obj2).invoke(newInstance, null);
                        try {
                            Object obj3 = map.get(1776451557);
                            if (obj3 == null) {
                                obj3 = ((Class) AFa1vSDK.getRevenue(51 - ExpandableListView.getPackedPositionChild(0L), 270 - View.getDefaultSize(0, 0), (char) (37201 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)))).getMethod("getRevenue", null);
                                map.put(1776451557, obj3);
                            }
                            boolean booleanValue = ((Boolean) ((Method) obj3).invoke(invoke, null)).booleanValue();
                            try {
                                Object obj4 = map.get(-1029327759);
                                if (obj4 == null) {
                                    obj4 = ((Class) AFa1vSDK.getRevenue(52 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 269, (char) (37201 - Gravity.getAbsoluteGravity(0, 0)))).getMethod("getMediationNetwork", null);
                                    map.put(-1029327759, obj4);
                                }
                                z6 = ((Boolean) ((Method) obj4).invoke(invoke, null)).booleanValue();
                                String[] split = uri.getPath().split("/");
                                if (booleanValue && split.length == 3) {
                                    this.hashCode = split[1];
                                    this.copy = split[2];
                                    this.copydefault = uri.toString();
                                }
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                } catch (Throwable th4) {
                    Throwable cause4 = th4.getCause();
                    if (cause4 == null) {
                        throw th4;
                    }
                    throw cause4;
                }
            }
        } catch (Exception e6) {
            AFLogger.afErrorLogForExcManagerOnly("OneLinkValidator: reflection init failed", e6);
        }
        this.equals = z6;
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    public final boolean a_() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    public final AppsFlyerRequestListener areAllFieldsValid() {
        return null;
    }

    public final boolean copy() {
        return this.equals;
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    public final boolean copydefault() {
        return false;
    }

    public final boolean equals() {
        return (TextUtils.isEmpty(this.hashCode) || TextUtils.isEmpty(this.copy) || this.hashCode.equals("app")) ? false : true;
    }

    @Override // com.appsflyer.internal.AFf1oSDK, com.appsflyer.internal.AFe1eSDK
    public final boolean getMediationNetwork() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1oSDK, com.appsflyer.internal.AFe1eSDK
    public final long getMonetizationNetwork() {
        return 3000L;
    }

    @Override // com.appsflyer.internal.AFf1oSDK, com.appsflyer.internal.AFe1eSDK
    public final void getRevenue() {
        ResponseNetwork responseNetwork;
        super.getRevenue();
        AFa1uSDK aFa1uSDK = this.component3;
        if (aFa1uSDK != null) {
            if (this.getMediationNetwork == AFe1cSDK.SUCCESS && (responseNetwork = ((AFf1oSDK) this).component4) != null) {
                aFa1uSDK.getRevenue((Map) responseNetwork.getBody());
                return;
            }
            Throwable component1 = component1();
            if (!(component1 instanceof ParsingException)) {
                String str = this.copydefault;
                aFa1uSDK.getCurrencyIso4217Code(str != null ? str : "Can't get OneLink data");
            } else if (((ParsingException) component1).getRawResponse().isSuccessful()) {
                aFa1uSDK.getCurrencyIso4217Code("Can't parse one link data");
            } else {
                String str2 = this.copydefault;
                aFa1uSDK.getCurrencyIso4217Code(str2 != null ? str2 : "Can't get OneLink data");
            }
        }
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    public final AFe1tSDK<Map<String, String>> getMediationNetwork(@NonNull String str) {
        AFe1qSDK aFe1qSDK = this.toString;
        return (AFe1tSDK) AFe1qSDK.AFAdRevenueData(new Object[]{aFe1qSDK, this.hashCode, this.copy, this.values, str}, -15930200, 15930202, System.identityHashCode(aFe1qSDK));
    }
}
