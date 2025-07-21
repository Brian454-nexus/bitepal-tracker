package com.braze.requests.framework;

import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class e implements c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f12786a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f12787b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f12788c;

    public e(g gVar, h hVar, b bVar) {
        this.f12786a = gVar;
        this.f12787b = hVar;
        this.f12788c = bVar;
    }

    @Override // com.braze.requests.framework.c
    public final void a(com.braze.models.response.g apiResponse) {
        Intrinsics.checkNotNullParameter(apiResponse, "apiResponse");
        ReentrantLock reentrantLock = this.f12786a.f12798g;
        final h hVar = this.f12787b;
        b bVar = this.f12788c;
        reentrantLock.lock();
        try {
            final long nowInMillisecondsSystemClock = DateTimeUtils.nowInMillisecondsSystemClock();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, g.f12789n, (BrazeLogger.Priority) null, (Throwable) null, true, new Function0() { // from class: l4.m
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.requests.framework.e.a(com.braze.requests.framework.h.this, nowInMillisecondsSystemClock);
                }
            }, 6, (Object) null);
            hVar.a(nowInMillisecondsSystemClock, i.f12817e);
            bVar.a(nowInMillisecondsSystemClock, hVar, apiResponse);
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final String a(h hVar, long j6) {
        return "Request success received for " + hVar.a(j6);
    }

    @Override // com.braze.requests.framework.c
    public final void a(com.braze.models.response.a apiResponse) {
        BrazeLogger brazeLogger;
        Intrinsics.checkNotNullParameter(apiResponse, "apiResponse");
        final g gVar = this.f12786a;
        ReentrantLock reentrantLock = gVar.f12798g;
        final h hVar = this.f12787b;
        b bVar = this.f12788c;
        reentrantLock.lock();
        try {
            final long nowInMillisecondsSystemClock = DateTimeUtils.nowInMillisecondsSystemClock();
            com.braze.models.response.g gVar2 = apiResponse instanceof com.braze.models.response.g ? (com.braze.models.response.g) apiResponse : null;
            final com.braze.models.response.d dVar = gVar2 != null ? gVar2.f12656d : null;
            BrazeLogger brazeLogger2 = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger2, g.f12789n, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: l4.n
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.requests.framework.e.a(com.braze.requests.framework.h.this, nowInMillisecondsSystemClock, dVar);
                }
            }, 14, (Object) null);
            hVar.a(nowInMillisecondsSystemClock, i.f12814b);
            bVar.a(nowInMillisecondsSystemClock, hVar, apiResponse);
            if (dVar instanceof com.braze.models.response.h) {
                gVar.f12800i = nowInMillisecondsSystemClock;
                gVar.f12799h = ((com.braze.requests.b) ((com.braze.models.response.h) dVar).f12669a).f12748i;
                brazeLogger = brazeLogger2;
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: l4.o
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.requests.framework.e.a(com.braze.requests.framework.g.this, hVar, nowInMillisecondsSystemClock);
                    }
                }, 7, (Object) null);
                gVar.f12801j = nowInMillisecondsSystemClock + g.f12790o;
            } else {
                brazeLogger = brazeLogger2;
            }
            if (dVar instanceof com.braze.models.response.e) {
                gVar.f12802k.incrementAndGet();
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: l4.p
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.requests.framework.e.a(com.braze.requests.framework.g.this);
                    }
                }, 7, (Object) null);
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String a(h hVar, long j6, com.braze.models.response.d dVar) {
        return "Request failure received " + hVar.a(j6) + " \n" + dVar;
    }

    public static final String a(g gVar, h hVar, long j6) {
        return "Got failed token " + gVar.f12799h + " for\n " + hVar.a(j6);
    }

    public static final String a(g gVar) {
        return "Incremented invalidApiKeyErrorCounter to " + gVar.f12802k.get();
    }
}
