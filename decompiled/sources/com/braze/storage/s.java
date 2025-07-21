package com.braze.storage;

import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final g0 f12953a;

    /* renamed from: b, reason: collision with root package name */
    public final com.braze.events.d f12954b;

    public s(g0 sessionStorageManager, com.braze.events.d eventPublisher) {
        Intrinsics.checkNotNullParameter(sessionStorageManager, "sessionStorageManager");
        Intrinsics.checkNotNullParameter(eventPublisher, "eventPublisher");
        this.f12953a = sessionStorageManager;
        this.f12954b = eventPublisher;
    }

    public static final String a() {
        return "Failed to get the active session from the storage.";
    }

    public static final String b() {
        return "Failed to delete the sealed session from the storage.";
    }

    public static final String d() {
        return "Error occured while publishing exception.";
    }

    public static final String e() {
        return "Failed to upsert active session in the storage.";
    }

    public final com.braze.models.n c() {
        try {
            return this.f12953a.c();
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: o4.s0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.storage.s.a();
                }
            }, 4, (Object) null);
            a(this.f12954b, e6);
            return null;
        }
    }

    public final void a(com.braze.models.n session) {
        Intrinsics.checkNotNullParameter(session, "session");
        try {
            this.f12953a.a(session);
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: o4.q0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.storage.s.e();
                }
            }, 4, (Object) null);
            a(this.f12954b, e6);
        }
    }

    public final void a(String sessionId) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        try {
            this.f12953a.a(sessionId);
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: o4.r0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.storage.s.b();
                }
            }, 4, (Object) null);
            a(this.f12954b, e6);
        }
    }

    public final void a(com.braze.events.d eventPublisher, Exception throwable) {
        Intrinsics.checkNotNullParameter(eventPublisher, "eventPublisher");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        try {
            eventPublisher.b(new com.braze.exceptions.b("A storage exception has occurred. Please view the stack trace for more details.", throwable), com.braze.exceptions.b.class);
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: o4.t0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.storage.s.d();
                }
            }, 4, (Object) null);
        }
    }
}
