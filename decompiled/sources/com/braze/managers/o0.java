package com.braze.managers;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f12481a;

    /* renamed from: b, reason: collision with root package name */
    public Long f12482b;

    /* renamed from: c, reason: collision with root package name */
    public String f12483c;

    /* renamed from: d, reason: collision with root package name */
    public long f12484d;

    /* renamed from: e, reason: collision with root package name */
    public long f12485e;

    /* renamed from: f, reason: collision with root package name */
    public long f12486f;

    public /* synthetic */ o0() {
        this(false, null, null, 0L, 0L, 0L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return this.f12481a == o0Var.f12481a && Intrinsics.areEqual(this.f12482b, o0Var.f12482b) && Intrinsics.areEqual(this.f12483c, o0Var.f12483c) && this.f12484d == o0Var.f12484d && this.f12485e == o0Var.f12485e && this.f12486f == o0Var.f12486f;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.f12481a) * 31;
        Long l6 = this.f12482b;
        int hashCode2 = (hashCode + (l6 == null ? 0 : l6.hashCode())) * 31;
        String str = this.f12483c;
        return Long.hashCode(this.f12486f) + ((Long.hashCode(this.f12485e) + ((Long.hashCode(this.f12484d) + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Config(isEnabled=" + this.f12481a + ", sdkDebuggerExpirationTime=" + this.f12482b + ", sdkDebuggerAuthCode=" + this.f12483c + ", sdkDebuggerFlushIntervalBytes=" + this.f12484d + ", sdkDebuggerFlushIntervalSeconds=" + this.f12485e + ", sdkDebuggerMaxPayloadBytes=" + this.f12486f + ')';
    }

    public o0(boolean z6, Long l6, String str, long j6, long j7, long j8) {
        this.f12481a = z6;
        this.f12482b = l6;
        this.f12483c = str;
        this.f12484d = j6;
        this.f12485e = j7;
        this.f12486f = j8;
    }
}
