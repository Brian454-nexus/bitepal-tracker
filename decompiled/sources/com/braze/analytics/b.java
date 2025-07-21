package com.braze.analytics;

import com.braze.j;
import com.braze.models.i;
import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class b implements c {
    public static final String e(String str) {
        return j.a("Cannot create card control event for Feed card. Returning null. Card id: ", str);
    }

    public static final String f(String str) {
        return j.a("Cannot create card dismissed event for Feed card. Returning null. Card id: ", str);
    }

    @Override // com.braze.analytics.c
    public final i a(final String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: O3.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.analytics.b.f(cardId);
            }
        }, 6, (Object) null);
        return null;
    }

    @Override // com.braze.analytics.c
    public final i b(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        return com.braze.models.outgoing.event.b.f12605g.k(cardId);
    }

    @Override // com.braze.analytics.c
    public final i c(final String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: O3.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.analytics.b.e(cardId);
            }
        }, 6, (Object) null);
        return null;
    }

    @Override // com.braze.analytics.c
    public final i d(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        return com.braze.models.outgoing.event.b.f12605g.m(cardId);
    }
}
