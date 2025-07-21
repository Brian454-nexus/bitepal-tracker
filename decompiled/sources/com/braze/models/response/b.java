package com.braze.models.response;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final String f12645a;

    /* renamed from: b, reason: collision with root package name */
    public final com.braze.requests.n f12646b;

    public b(String str, com.braze.requests.n originalRequest) {
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        this.f12645a = str;
        this.f12646b = originalRequest;
    }

    @Override // com.braze.models.response.d
    public final String a() {
        return this.f12645a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f12645a, bVar.f12645a) && Intrinsics.areEqual(this.f12646b, bVar.f12646b);
    }

    public final int hashCode() {
        String str = this.f12645a;
        return this.f12646b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "BasicResponseError(errorMessage=" + this.f12645a + ", originalRequest=" + this.f12646b + ')';
    }
}
