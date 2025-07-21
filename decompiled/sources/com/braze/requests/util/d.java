package com.braze.requests.util;

import android.content.SharedPreferences;
import com.braze.requests.util.d;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public int f12876a;

    /* renamed from: b, reason: collision with root package name */
    public int f12877b;

    /* renamed from: c, reason: collision with root package name */
    public final SharedPreferences f12878c;

    /* renamed from: d, reason: collision with root package name */
    public long f12879d;

    /* renamed from: e, reason: collision with root package name */
    public double f12880e;

    public d(int i6, int i7, SharedPreferences storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f12876a = i6;
        this.f12877b = i7;
        this.f12878c = storage;
        this.f12879d = storage.getLong("last_call_at_ms", 0L);
        this.f12880e = storage.getFloat("current_token_count", RangesKt.coerceAtLeast(this.f12876a, 1));
    }

    public final void a() {
        long nowInMillisecondsSystemClock = DateTimeUtils.nowInMillisecondsSystemClock();
        this.f12880e = a(nowInMillisecondsSystemClock);
        this.f12879d = nowInMillisecondsSystemClock;
        this.f12878c.edit().putLong("last_call_at_ms", this.f12879d).putFloat("current_token_count", (float) this.f12880e).apply();
        double d6 = this.f12880e;
        if (d6 < 1.0d) {
            return;
        }
        this.f12880e = d6 - 1;
    }

    public final long b() {
        this.f12880e = a(DateTimeUtils.nowInMillisecondsSystemClock());
        this.f12878c.edit().putLong("last_call_at_ms", this.f12879d).putFloat("current_token_count", (float) this.f12880e).apply();
        double d6 = this.f12880e;
        if (d6 >= 1.0d) {
            return 0L;
        }
        return Math.max(0L, (long) ((1 - d6) * RangesKt.coerceAtLeast(this.f12877b, 1) * 1000));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(capacity=");
        sb.append(RangesKt.coerceAtLeast(this.f12876a, 1));
        sb.append(", refillRate=");
        sb.append(RangesKt.coerceAtLeast(this.f12877b, 1));
        sb.append(", lastCallAt='");
        sb.append(DateTimeUtils.formatDateFromMillis$default(this.f12879d, null, null, 3, null));
        sb.append("', currentTokenCount=");
        sb.append(a(DateTimeUtils.nowInMillisecondsSystemClock()));
        sb.append(')');
        return sb.toString();
    }

    public static final String b(int i6, int i7) {
        return "TokenBucketRateLimiter updated with new capacity: " + i6 + " and refill rate: " + i7;
    }

    public final double a(long j6) {
        return Math.min((((j6 - this.f12879d) / RangesKt.coerceAtLeast(this.f12877b, 1)) / 1000) + this.f12880e, RangesKt.coerceAtLeast(this.f12876a, 1));
    }

    public final void a(final int i6, final int i7) {
        if (i6 < 1 || i7 < 1) {
            return;
        }
        if (this.f12876a == i6 && this.f12877b == i7) {
            return;
        }
        this.f12876a = i6;
        this.f12877b = i7;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: n4.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d.b(i6, i7);
            }
        }, 6, (Object) null);
    }
}
