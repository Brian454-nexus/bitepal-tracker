package com.braze.managers;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final com.braze.events.d f12474a;

    /* renamed from: b, reason: collision with root package name */
    public final com.braze.storage.e0 f12475b;

    /* renamed from: c, reason: collision with root package name */
    public final SharedPreferences f12476c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f12477d;

    public n(Context applicationContext, com.braze.events.d eventPublisher, com.braze.storage.e0 serverConfigStorageProvider) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(eventPublisher, "eventPublisher");
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        this.f12474a = eventPublisher;
        this.f12475b = serverConfigStorageProvider;
        this.f12476c = applicationContext.getSharedPreferences("com.appboy.storage.sessions.messaging_session", 0);
    }

    public static final String c() {
        return "Publishing new messaging session event.";
    }

    public static final String d() {
        return "Messaging session not started.";
    }

    public final boolean a() {
        final long r6 = this.f12475b.r();
        if (r6 != -1 && !this.f12477d) {
            final long j6 = this.f12476c.getLong("messaging_session_timestamp", -1L);
            final long nowInSeconds = DateTimeUtils.nowInSeconds();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.K2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.managers.n.a(r6, nowInSeconds, j6);
                }
            }, 7, (Object) null);
            if (j6 + r6 < nowInSeconds) {
                return true;
            }
        }
        return false;
    }

    public final void b() {
        if (!a()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.J2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.managers.n.d();
                }
            }, 7, (Object) null);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.I2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.managers.n.c();
            }
        }, 7, (Object) null);
        this.f12474a.b(com.braze.events.internal.n.f12291a, com.braze.events.internal.n.class);
        this.f12477d = true;
    }

    public final void e() {
        final long nowInSeconds = DateTimeUtils.nowInSeconds();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.H2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.managers.n.a(nowInSeconds);
            }
        }, 7, (Object) null);
        this.f12476c.edit().putLong("messaging_session_timestamp", nowInSeconds).apply();
        this.f12477d = false;
    }

    public static final String a(long j6, long j7, long j8) {
        return "Messaging session timeout: " + j6 + ", current diff: " + (j7 - j8);
    }

    public static final String a(long j6) {
        return "Messaging session stopped. Adding new messaging session timestamp: " + j6;
    }
}
