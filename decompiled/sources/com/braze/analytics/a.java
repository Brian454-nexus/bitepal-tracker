package com.braze.analytics;

import com.braze.models.i;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a implements c {
    @Override // com.braze.analytics.c
    public final i a(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        return com.braze.models.outgoing.event.b.f12605g.g(cardId);
    }

    @Override // com.braze.analytics.c
    public final i b(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        return com.braze.models.outgoing.event.b.f12605g.c(cardId);
    }

    @Override // com.braze.analytics.c
    public final i c(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        return com.braze.models.outgoing.event.b.f12605g.e(cardId);
    }

    @Override // com.braze.analytics.c
    public final i d(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        return com.braze.models.outgoing.event.b.f12605g.i(cardId);
    }
}
