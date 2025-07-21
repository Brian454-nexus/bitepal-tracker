package com.braze.models.response;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class i implements d {

    /* renamed from: a, reason: collision with root package name */
    public final com.braze.requests.n f12673a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12674b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12675c;

    public i(com.braze.requests.n originalRequest, int i6, String str) {
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        this.f12673a = originalRequest;
        this.f12674b = i6;
        this.f12675c = str;
    }

    @Override // com.braze.models.response.d
    public final String a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.areEqual(this.f12673a, iVar.f12673a) && this.f12674b == iVar.f12674b && Intrinsics.areEqual(this.f12675c, iVar.f12675c);
    }

    public final int hashCode() {
        int hashCode = (Integer.hashCode(this.f12674b) + (this.f12673a.hashCode() * 31)) * 31;
        String str = this.f12675c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "{code = " + this.f12674b + ", reason = " + this.f12675c + '}';
    }
}
