package com.braze.models.response;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    public final String f12651a;

    /* renamed from: b, reason: collision with root package name */
    public final com.braze.requests.n f12652b;

    public e(String str, com.braze.requests.n originalRequest) {
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        this.f12651a = str;
        this.f12652b = originalRequest;
    }

    @Override // com.braze.models.response.d
    public final String a() {
        return this.f12651a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.areEqual(this.f12651a, eVar.f12651a) && Intrinsics.areEqual(this.f12652b, eVar.f12652b);
    }

    public final int hashCode() {
        String str = this.f12651a;
        return this.f12652b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "InvalidApiKeyError(errorMessage=" + this.f12651a + ", originalRequest=" + this.f12652b + ')';
    }
}
