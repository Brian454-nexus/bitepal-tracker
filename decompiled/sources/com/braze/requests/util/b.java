package com.braze.requests.util;

import android.os.SystemClock;
import com.braze.support.BrazeLogger;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.random.RandomKt;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class b {

    /* renamed from: g, reason: collision with root package name */
    public static final int f12865g = (int) TimeUnit.SECONDS.toMillis(45);

    /* renamed from: a, reason: collision with root package name */
    public final int f12866a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12867b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12868c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12869d;

    /* renamed from: e, reason: collision with root package name */
    public final Random f12870e;

    /* renamed from: f, reason: collision with root package name */
    public int f12871f;

    public b(int i6, int i7, int i8) {
        int i9 = f12865g;
        this.f12866a = i6;
        this.f12867b = i9;
        this.f12868c = i7;
        this.f12869d = i8;
        this.f12870e = RandomKt.Random(SystemClock.uptimeMillis());
    }

    public final int a(final int i6) {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: n4.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.requests.util.b.a(com.braze.requests.util.b.this);
            }
        }, 7, (Object) null);
        Random random = this.f12870e;
        int i7 = this.f12871f * this.f12869d;
        Intrinsics.checkNotNullParameter(random, "random");
        final int min = Math.min(i6, i7) + random.nextInt(Math.abs(i6 - i7) + 1);
        this.f12871f = Math.max(this.f12868c, Math.min(this.f12866a, min));
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: n4.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.requests.util.b.a(com.braze.requests.util.b.this, i6, min);
            }
        }, 7, (Object) null);
        return this.f12871f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExponentialBackoffStateProvider(maxSleepDurationMs=");
        sb.append(this.f12866a);
        sb.append(", defaultNormalFlushIntervalMs=");
        sb.append(this.f12867b);
        sb.append(", minSleepDurationMs=");
        sb.append(this.f12868c);
        sb.append(", scaleFactor=");
        sb.append(this.f12869d);
        sb.append(", randomSleepDurationGenerator=");
        sb.append(this.f12870e);
        sb.append(", lastSleepDurationMs=");
        sb.append(this.f12871f);
        sb.append(", isBackingOff=");
        sb.append(this.f12871f != 0);
        sb.append(')');
        return sb.toString();
    }

    public static final String a(b bVar) {
        return "Computing new sleep delay. Previous sleep delay: " + bVar.f12871f;
    }

    public static final String a(b bVar, int i6, int i7) {
        return "New sleep duration: " + bVar.f12871f + " ms. Default sleep duration: " + i6 + " ms. Max sleep: " + bVar.f12866a + " ms. Min sleep: " + bVar.f12868c + " ms. Scale factor: " + bVar.f12869d + " randomValueBetweenSleepIntervals: " + i7;
    }
}
