package com.braze.requests.framework;

import com.braze.requests.n;
import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final n f12805a;

    /* renamed from: b, reason: collision with root package name */
    public long f12806b;

    /* renamed from: c, reason: collision with root package name */
    public final long f12807c;

    /* renamed from: d, reason: collision with root package name */
    public i f12808d;

    /* renamed from: e, reason: collision with root package name */
    public int f12809e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f12810f;

    /* renamed from: g, reason: collision with root package name */
    public long f12811g;

    /* renamed from: h, reason: collision with root package name */
    public int f12812h;

    public h(n request, long j6, long j7) {
        i state = i.f12813a;
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f12805a = request;
        this.f12806b = j6;
        this.f12807c = j7;
        this.f12808d = state;
        this.f12809e = 0;
        this.f12810f = null;
        this.f12811g = j7;
    }

    public final void a(final long j6, final i newState) {
        Intrinsics.checkNotNullParameter(newState, "newState");
        if (this.f12808d != newState) {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.Priority priority = BrazeLogger.Priority.f12983V;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, true, new Function0() { // from class: l4.G
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.requests.framework.h.a(com.braze.requests.framework.h.this, newState, j6);
                }
            }, 2, (Object) null);
            this.f12811g = j6;
            this.f12808d = newState;
            if (newState == i.f12814b) {
                this.f12812h++;
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, true, new Function0() { // from class: l4.H
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.requests.framework.h.a(com.braze.requests.framework.h.this, j6);
                    }
                }, 2, (Object) null);
            }
        }
    }

    public static final String a(h hVar, i iVar, long j6) {
        return "Moving from " + hVar.f12808d + " -> " + iVar + " with time " + j6 + " for \n" + hVar.a(j6);
    }

    public static final String a(h hVar, long j6) {
        return "Moving to pending retry.Updated retry count: " + hVar.f12812h + " for: \n" + hVar.a(j6);
    }

    public final String a(long j6) {
        return StringsKt.trimMargin$default("\n            |RequestInfo for " + this.f12805a.hashCode() + " \n            | at " + j6 + "\n            | request.target = " + ((com.braze.requests.b) this.f12805a).e() + "\n            | nextAdvance = " + (this.f12806b - j6) + "\n            | createdAt = " + (this.f12807c - j6) + "\n            | state = " + this.f12808d + "\n            | lastStateMovedAt = " + (this.f12811g - j6) + "\n            | timesMovedToRetry = " + this.f12812h + "\n        ", (String) null, 1, (Object) null);
    }
}
