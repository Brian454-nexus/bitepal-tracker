package com.appsflyer.internal;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lcom/appsflyer/internal/AFb1sSDK;", "", "Lcom/appsflyer/internal/AFa1oSDK;", "values", "<init>", "(Lcom/appsflyer/internal/AFa1oSDK;)V", "", "afInfoLog", "()V", "getMonetizationNetwork", "Lcom/appsflyer/internal/AFa1oSDK;", "getMediationNetwork"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFb1sSDK {

    /* renamed from: getMonetizationNetwork, reason: from kotlin metadata */
    @NotNull
    private final AFa1oSDK getMediationNetwork;

    public AFb1sSDK(@NotNull AFa1oSDK aFa1oSDK) {
        Intrinsics.checkNotNullParameter(aFa1oSDK, "");
        this.getMediationNetwork = aFa1oSDK;
    }

    public final void afInfoLog() {
        try {
            Map map = AFa1vSDK.registerClient;
            Object obj = map.get(-305051340);
            if (obj == null) {
                obj = ((Class) AFa1vSDK.getRevenue((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 37, 322 - (KeyEvent.getMaxKeyCode() >> 16), (char) (52978 - KeyEvent.keyCodeFromString("")))).getDeclaredConstructor(null);
                map.put(-305051340, obj);
            }
            Object newInstance = ((Constructor) obj).newInstance(null);
            Object[] objArr = {this.getMediationNetwork};
            Object obj2 = map.get(-1120235931);
            if (obj2 == null) {
                obj2 = ((Class) AFa1vSDK.getRevenue(37 - View.resolveSize(0, 0), TextUtils.getTrimmedLength("") + 322, (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 52978))).getMethod("getMonetizationNetwork", AFa1oSDK.class);
                map.put(-1120235931, obj2);
            }
            ((Method) obj2).invoke(newInstance, objArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
