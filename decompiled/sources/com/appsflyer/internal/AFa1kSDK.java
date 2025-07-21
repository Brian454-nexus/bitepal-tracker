package com.appsflyer.internal;

import android.os.Process;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFa1kSDK {
    private StringBuilder getMediationNetwork = new StringBuilder();
    private final List<AFa1ySDK> AFAdRevenueData = new ArrayList();
    private final String getCurrencyIso4217Code = null;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public enum AFa1ySDK {
        EMPTY_ARRAY,
        NONEMPTY_ARRAY,
        EMPTY_OBJECT,
        DANGLING_KEY,
        NONEMPTY_OBJECT,
        NULL
    }

    private AFa1ySDK getMonetizationNetwork() {
        if (!this.AFAdRevenueData.isEmpty()) {
            return this.AFAdRevenueData.get(r0.size() - 1);
        }
        throw new AFa1gSDK("Nesting problem");
    }

    public final AFa1kSDK AFAdRevenueData(AFa1ySDK aFa1ySDK, String str) {
        if (this.AFAdRevenueData.isEmpty() && this.getMediationNetwork.length() > 0) {
            throw new AFa1gSDK("Nesting problem: multiple top-level roots");
        }
        getMediationNetwork();
        this.AFAdRevenueData.add(aFa1ySDK);
        this.getMediationNetwork.append(str);
        return this;
    }

    public final void getCurrencyIso4217Code() {
        AFa1ySDK monetizationNetwork = getMonetizationNetwork();
        if (monetizationNetwork == AFa1ySDK.NONEMPTY_OBJECT) {
            this.getMediationNetwork.append(',');
        } else if (monetizationNetwork != AFa1ySDK.EMPTY_OBJECT) {
            throw new AFa1gSDK("Nesting problem");
        }
        AFa1ySDK aFa1ySDK = AFa1ySDK.DANGLING_KEY;
        this.AFAdRevenueData.set(r1.size() - 1, aFa1ySDK);
    }

    public final void getMediationNetwork(String str) {
        this.getMediationNetwork.append("\"");
        int length = str.length();
        for (int i6 = 0; i6 < length; i6++) {
            char charAt = str.charAt(i6);
            if (charAt == '\f') {
                this.getMediationNetwork.append("\\f");
            } else if (charAt == '\r') {
                this.getMediationNetwork.append("\\r");
            } else if (charAt != '\"' && charAt != '/' && charAt != '\\') {
                switch (charAt) {
                    case '\b':
                        this.getMediationNetwork.append("\\b");
                        break;
                    case '\t':
                        this.getMediationNetwork.append("\\t");
                        break;
                    case '\n':
                        this.getMediationNetwork.append("\\n");
                        break;
                    default:
                        if (charAt <= 31) {
                            this.getMediationNetwork.append(String.format("\\u%04x", Integer.valueOf(charAt)));
                            break;
                        } else {
                            this.getMediationNetwork.append(charAt);
                            break;
                        }
                }
            } else {
                StringBuilder sb = this.getMediationNetwork;
                sb.append('\\');
                sb.append(charAt);
            }
        }
        this.getMediationNetwork.append("\"");
    }

    public final String toString() {
        if (this.getMediationNetwork.length() == 0) {
            return null;
        }
        return this.getMediationNetwork.toString();
    }

    public final AFa1kSDK getMonetizationNetwork(Object obj) {
        if (!this.AFAdRevenueData.isEmpty()) {
            if (((Class) AFa1vSDK.getRevenue(37 - View.resolveSize(0, 0), 159 - ((Process.getThreadPriority(0) + 20) >> 6), (char) ((-1) - Process.getGidForName("")))).isInstance(obj)) {
                try {
                    Object[] objArr = {this};
                    Map map = AFa1vSDK.registerClient;
                    Object obj2 = map.get(1161076700);
                    if (obj2 == null) {
                        obj2 = ((Class) AFa1vSDK.getRevenue(((byte) KeyEvent.getModifierMetaStateMask()) + 38, (ViewConfiguration.getJumpTapTimeout() >> 16) + 159, (char) (ViewConfiguration.getWindowTouchSlop() >> 8))).getDeclaredMethod("getCurrencyIso4217Code", AFa1kSDK.class);
                        map.put(1161076700, obj2);
                    }
                    ((Method) obj2).invoke(obj, objArr);
                    return this;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            if (obj instanceof AFa1lSDK) {
                ((AFa1lSDK) obj).getCurrencyIso4217Code(this);
                return this;
            }
            getMediationNetwork();
            if (obj != null && !(obj instanceof Boolean) && obj != AFa1lSDK.AFAdRevenueData) {
                if (obj instanceof Number) {
                    this.getMediationNetwork.append(AFa1lSDK.getCurrencyIso4217Code((Number) obj));
                    return this;
                }
                getMediationNetwork(obj.toString());
                return this;
            }
            this.getMediationNetwork.append(obj);
            return this;
        }
        throw new AFa1gSDK("Nesting problem");
    }

    public final AFa1kSDK AFAdRevenueData(AFa1ySDK aFa1ySDK, AFa1ySDK aFa1ySDK2, String str) {
        AFa1ySDK monetizationNetwork = getMonetizationNetwork();
        if (monetizationNetwork != aFa1ySDK2 && monetizationNetwork != aFa1ySDK) {
            throw new AFa1gSDK("Nesting problem");
        }
        this.AFAdRevenueData.remove(r2.size() - 1);
        this.getMediationNetwork.append(str);
        return this;
    }

    private void getMediationNetwork() {
        if (this.AFAdRevenueData.isEmpty()) {
            return;
        }
        AFa1ySDK monetizationNetwork = getMonetizationNetwork();
        if (monetizationNetwork == AFa1ySDK.EMPTY_ARRAY) {
            AFa1ySDK aFa1ySDK = AFa1ySDK.NONEMPTY_ARRAY;
            this.AFAdRevenueData.set(r1.size() - 1, aFa1ySDK);
        } else {
            if (monetizationNetwork == AFa1ySDK.NONEMPTY_ARRAY) {
                this.getMediationNetwork.append(',');
                return;
            }
            if (monetizationNetwork == AFa1ySDK.DANGLING_KEY) {
                this.getMediationNetwork.append(":");
                AFa1ySDK aFa1ySDK2 = AFa1ySDK.NONEMPTY_OBJECT;
                this.AFAdRevenueData.set(r1.size() - 1, aFa1ySDK2);
                return;
            }
            if (monetizationNetwork != AFa1ySDK.NULL) {
                throw new AFa1gSDK("Nesting problem");
            }
        }
    }
}
