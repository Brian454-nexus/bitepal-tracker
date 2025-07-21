package com.braze.managers;

import android.content.Context;
import com.braze.support.BrazeImageUtils;
import com.braze.support.BrazeLogger;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class s {
    public final String a(Context context, boolean z6) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Pair<Integer, Integer> displayHeightAndWidthPixels = BrazeImageUtils.getDisplayHeightAndWidthPixels(context);
            int intValue = ((Number) displayHeightAndWidthPixels.component1()).intValue();
            int intValue2 = ((Number) displayHeightAndWidthPixels.component2()).intValue();
            if (z6) {
                StringBuilder sb = new StringBuilder();
                sb.append(intValue);
                sb.append('x');
                sb.append(intValue2);
                return sb.toString();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(intValue2);
            sb2.append('x');
            sb2.append(intValue);
            return sb2.toString();
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: Z3.d3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.managers.s.a();
                }
            }, 4, (Object) null);
            return null;
        }
    }

    public static final String a() {
        return "Failed to obtain device resolution";
    }
}
