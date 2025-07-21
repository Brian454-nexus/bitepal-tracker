package com.braze.triggers.managers;

import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.triggers.events.h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class c {
    public static boolean a(com.braze.triggers.events.b triggerEvent, com.braze.triggers.actions.g action, long j6, final long j7) {
        long j8;
        Intrinsics.checkNotNullParameter(triggerEvent, "triggerEvent");
        Intrinsics.checkNotNullParameter(action, "action");
        if (triggerEvent instanceof h) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f.f13088q, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: t4.y
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.triggers.managers.c.a();
                }
            }, 14, (Object) null);
            return true;
        }
        long nowInSeconds = DateTimeUtils.nowInSeconds();
        final long j9 = nowInSeconds + r0.f13048d;
        final int i6 = action.f13021b.f13051g;
        if (i6 != -1) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f.f13088q, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: t4.z
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.triggers.managers.c.a(i6);
                }
            }, 14, (Object) null);
            j8 = j6 + i6;
        } else {
            j8 = j6 + j7;
        }
        final long j10 = j8;
        if (j9 >= j10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f.f13088q, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: t4.A
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.triggers.managers.c.a(j9, j10);
                }
            }, 12, (Object) null);
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f.f13088q, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: t4.B
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.triggers.managers.c.a(j7, j10, j9);
            }
        }, 12, (Object) null);
        return false;
    }

    public static final String a() {
        return "Ignoring minimum time interval between triggered actions because the trigger event is a test.";
    }

    public static final String a(int i6) {
        return "Using override minimum display interval: " + i6;
    }

    public static final String a(long j6, long j7) {
        return "Minimum time interval requirement met for matched trigger. Action display time: " + j6 + " . Next viable display time: " + j7;
    }

    public static final String a(long j6, long j7, long j8) {
        return "Minimum time interval requirement and triggered action override time interval requirement of " + j6 + " not met for matched trigger. Returning null. Next viable display time: " + j7 + ". Action display time: " + j8;
    }
}
