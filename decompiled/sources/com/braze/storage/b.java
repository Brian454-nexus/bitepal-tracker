package com.braze.storage;

import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final pa.d f12896a = pa.f.b(1, 0, 2, (Object) null);

    public static final String b(b bVar) {
        return "Cache locked successfully for export: " + bVar;
    }

    public final synchronized Object a() {
        Object obj;
        try {
            if (this.f12896a.g()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: o4.d
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.storage.b.b(com.braze.storage.b.this);
                    }
                }, 7, (Object) null);
                obj = c();
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: o4.e
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.storage.b.b();
                    }
                }, 7, (Object) null);
                obj = null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return obj;
    }

    public abstract Object c();

    public abstract void c(Object obj, boolean z6);

    public static final String b() {
        return "Received call to export dirty object, but the cache was already locked.";
    }

    public static final String b(Object obj, boolean z6) {
        return "Tried to confirm outboundObject [" + obj + "] with success [" + z6 + "], but the cache wasn't locked, so not doing anything.";
    }

    public final synchronized void a(final Object obj, final boolean z6) {
        if (this.f12896a.a() != 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: o4.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.storage.b.b(obj, z6);
                }
            }, 6, (Object) null);
            return;
        }
        c(obj, z6);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: o4.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.storage.b.a(com.braze.storage.b.this);
            }
        }, 6, (Object) null);
        this.f12896a.release();
    }

    public static final String a(b bVar) {
        return "Notifying confirmAndUnlock listeners for cache: " + bVar;
    }
}
