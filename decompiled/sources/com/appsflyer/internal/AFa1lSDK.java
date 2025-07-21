package com.appsflyer.internal;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.appsflyer.internal.AFa1kSDK;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFa1lSDK {
    public static final Object AFAdRevenueData = new Object() { // from class: com.appsflyer.internal.AFa1lSDK.1
        public final boolean equals(Object obj) {
            return obj == this || obj == null;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "null";
        }
    };
    private static final Double getRevenue = Double.valueOf(-0.0d);
    final LinkedHashMap<String, Object> getMediationNetwork;

    public AFa1lSDK() {
        this.getMediationNetwork = new LinkedHashMap<>();
    }

    public static Object AFAdRevenueData(Object obj) {
        if (obj == null) {
            return AFAdRevenueData;
        }
        if (((Class) AFa1vSDK.getRevenue((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 36, TextUtils.lastIndexOf("", '0') + 160, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1))).isInstance(obj) || (obj instanceof AFa1lSDK)) {
            return obj;
        }
        if (obj instanceof JSONArray) {
            try {
                Object[] objArr = {obj.toString()};
                Map map = AFa1vSDK.registerClient;
                Object obj2 = map.get(2121538775);
                if (obj2 == null) {
                    obj2 = ((Class) AFa1vSDK.getRevenue((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 37, 160 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (Process.myTid() >> 22))).getDeclaredConstructor(String.class);
                    map.put(2121538775, obj2);
                }
                obj = ((Constructor) obj2).newInstance(objArr);
                return obj;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        if (obj instanceof JSONObject) {
            return new AFa1lSDK(obj.toString());
        }
        if (obj.equals(AFAdRevenueData)) {
            return obj;
        }
        if (obj instanceof Collection) {
            try {
                Object[] objArr2 = {(Collection) obj};
                Map map2 = AFa1vSDK.registerClient;
                Object obj3 = map2.get(2111093904);
                if (obj3 == null) {
                    obj3 = ((Class) AFa1vSDK.getRevenue(TextUtils.indexOf((CharSequence) "", '0', 0) + 38, TextUtils.getTrimmedLength("") + 159, (char) (ViewConfiguration.getLongPressTimeout() >> 16))).getDeclaredConstructor(Collection.class);
                    map2.put(2111093904, obj3);
                }
                return ((Constructor) obj3).newInstance(objArr2);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        }
        if (obj.getClass().isArray()) {
            try {
                Object[] objArr3 = {obj};
                Map map3 = AFa1vSDK.registerClient;
                Object obj4 = map3.get(417025157);
                if (obj4 == null) {
                    obj4 = ((Class) AFa1vSDK.getRevenue(37 - (Process.myPid() >> 22), (-16777057) - Color.rgb(0, 0, 0), (char) (ViewConfiguration.getTouchSlop() >> 8))).getDeclaredConstructor(Object.class);
                    map3.put(417025157, obj4);
                }
                return ((Constructor) obj4).newInstance(objArr3);
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 != null) {
                    throw cause3;
                }
                throw th3;
            }
        }
        if (obj instanceof Map) {
            return new AFa1lSDK((Map) obj);
        }
        if ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof String)) {
            return obj;
        }
        if (obj.getClass().getPackage().getName().startsWith("java.")) {
            return obj.toString();
        }
        return null;
        return null;
    }

    public static String getCurrencyIso4217Code(Number number) {
        if (number != null) {
            double doubleValue = number.doubleValue();
            try {
                Object[] objArr = {Double.valueOf(doubleValue)};
                Map map = AFa1vSDK.registerClient;
                Object obj = map.get(-1977863553);
                if (obj == null) {
                    obj = ((Class) AFa1vSDK.getRevenue(37 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 123 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (22433 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)))).getDeclaredMethod("getRevenue", Double.TYPE);
                    map.put(-1977863553, obj);
                }
                ((Double) ((Method) obj).invoke(null, objArr)).getClass();
                if (number.equals(getRevenue)) {
                    return "-0";
                }
                long longValue = number.longValue();
                if (doubleValue == longValue) {
                    return Long.toString(longValue);
                }
                return number.toString();
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        throw new AFa1gSDK("Number must be non-null");
    }

    public final String toString() {
        try {
            AFa1kSDK aFa1kSDK = new AFa1kSDK();
            getCurrencyIso4217Code(aFa1kSDK);
            return aFa1kSDK.toString();
        } catch (AFa1gSDK unused) {
            return null;
        }
    }

    public AFa1lSDK(Map map) {
        this();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str != null) {
                this.getMediationNetwork.put(str, AFAdRevenueData(entry.getValue()));
            } else {
                throw new NullPointerException("key == null");
            }
        }
    }

    private AFa1lSDK(Object obj) {
        try {
            Map map = AFa1vSDK.registerClient;
            Object obj2 = map.get(-807770607);
            if (obj2 == null) {
                obj2 = ((Class) AFa1vSDK.getRevenue(Color.green(0) + 37, (ViewConfiguration.getLongPressTimeout() >> 16) + 196, (char) (KeyEvent.normalizeMetaState(0) + 2457))).getDeclaredMethod("getMonetizationNetwork", null);
                map.put(-807770607, obj2);
            }
            Object invoke = ((Method) obj2).invoke(obj, null);
            if (invoke instanceof AFa1lSDK) {
                this.getMediationNetwork = ((AFa1lSDK) invoke).getMediationNetwork;
                return;
            }
            Object[] objArr = {invoke, "AFJsonObject"};
            Object obj3 = map.get(1756973990);
            if (obj3 == null) {
                obj3 = ((Class) AFa1vSDK.getRevenue(38 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (Process.myPid() >> 22) + 122, (char) (22433 - TextUtils.lastIndexOf("", '0')))).getDeclaredMethod("getCurrencyIso4217Code", Object.class, String.class);
                map.put(1756973990, obj3);
            }
            throw ((Throwable) ((Method) obj3).invoke(null, objArr));
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public final AFa1lSDK getCurrencyIso4217Code(String str, Object obj) {
        if (obj == null) {
            this.getMediationNetwork.remove(str);
            return this;
        }
        if (obj instanceof Number) {
            try {
                Object[] objArr = {Double.valueOf(((Number) obj).doubleValue())};
                Map map = AFa1vSDK.registerClient;
                Object obj2 = map.get(-1977863553);
                if (obj2 == null) {
                    obj2 = ((Class) AFa1vSDK.getRevenue(37 - View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 122, (char) (22434 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)))).getMethod("getRevenue", Double.TYPE);
                    map.put(-1977863553, obj2);
                }
                ((Double) ((Method) obj2).invoke(null, objArr)).getClass();
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        LinkedHashMap<String, Object> linkedHashMap = this.getMediationNetwork;
        if (str == null) {
            throw new AFa1gSDK("Names must be non-null");
        }
        linkedHashMap.put(str, obj);
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private AFa1lSDK(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = ""
            java.lang.Object[] r8 = new java.lang.Object[]{r8}     // Catch: java.lang.Throwable -> L4d
            java.util.Map r1 = com.appsflyer.internal.AFa1vSDK.registerClient     // Catch: java.lang.Throwable -> L4d
            r2 = -1479677238(0xffffffffa7cdeaca, float:-5.715349E-15)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r3 = r1.get(r3)     // Catch: java.lang.Throwable -> L4d
            if (r3 == 0) goto L16
            goto L43
        L16:
            r3 = 0
            int r4 = android.view.View.MeasureSpec.getSize(r3)     // Catch: java.lang.Throwable -> L4d
            int r4 = r4 + 37
            r5 = 48
            int r6 = android.text.TextUtils.indexOf(r0, r5)     // Catch: java.lang.Throwable -> L4d
            int r6 = 195 - r6
            int r0 = android.text.TextUtils.indexOf(r0, r5, r3)     // Catch: java.lang.Throwable -> L4d
            int r0 = r0 + 2458
            char r0 = (char) r0     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r0 = com.appsflyer.internal.AFa1vSDK.getRevenue(r4, r6, r0)     // Catch: java.lang.Throwable -> L4d
            java.lang.Class r0 = (java.lang.Class) r0     // Catch: java.lang.Throwable -> L4d
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            java.lang.Class[] r3 = new java.lang.Class[]{r3}     // Catch: java.lang.Throwable -> L4d
            java.lang.reflect.Constructor r3 = r0.getDeclaredConstructor(r3)     // Catch: java.lang.Throwable -> L4d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L4d
            r1.put(r0, r3)     // Catch: java.lang.Throwable -> L4d
        L43:
            java.lang.reflect.Constructor r3 = (java.lang.reflect.Constructor) r3     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r8 = r3.newInstance(r8)     // Catch: java.lang.Throwable -> L4d
            r7.<init>(r8)
            return
        L4d:
            r8 = move-exception
            java.lang.Throwable r0 = r8.getCause()
            if (r0 == 0) goto L55
            throw r0
        L55:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1lSDK.<init>(java.lang.String):void");
    }

    public static String getCurrencyIso4217Code(String str) {
        if (str != null) {
            return str;
        }
        throw new AFa1gSDK("Names must be non-null");
    }

    public final void getCurrencyIso4217Code(AFa1kSDK aFa1kSDK) {
        aFa1kSDK.AFAdRevenueData(AFa1kSDK.AFa1ySDK.EMPTY_OBJECT, "{");
        for (Map.Entry<String, Object> entry : this.getMediationNetwork.entrySet()) {
            String key = entry.getKey();
            if (key != null) {
                aFa1kSDK.getCurrencyIso4217Code();
                aFa1kSDK.getMediationNetwork(key);
                aFa1kSDK.getMonetizationNetwork(entry.getValue());
            } else {
                throw new AFa1gSDK("Names must be non-null");
            }
        }
        aFa1kSDK.AFAdRevenueData(AFa1kSDK.AFa1ySDK.EMPTY_OBJECT, AFa1kSDK.AFa1ySDK.NONEMPTY_OBJECT, "}");
    }
}
