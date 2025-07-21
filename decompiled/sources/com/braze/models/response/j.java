package com.braze.models.response;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f12676a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12677b;

    public j(int i6, int i7) {
        this.f12676a = i6;
        this.f12677b = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f12676a == jVar.f12676a && this.f12677b == jVar.f12677b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f12677b) + (Integer.hashCode(this.f12676a) * 31);
    }

    public final String toString() {
        return "RateLimitEndpointConfig(capacity=" + this.f12676a + ", refillRate=" + this.f12677b + ')';
    }
}
