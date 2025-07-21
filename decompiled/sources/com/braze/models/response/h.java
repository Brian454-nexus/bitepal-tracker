package com.braze.models.response;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class h implements d {

    /* renamed from: a, reason: collision with root package name */
    public final com.braze.requests.n f12669a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12670b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12671c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12672d;

    public h(com.braze.requests.n originalRequest, int i6, String str, String str2) {
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        this.f12669a = originalRequest;
        this.f12670b = i6;
        this.f12671c = str;
        this.f12672d = str2;
    }

    @Override // com.braze.models.response.d
    public final String a() {
        return this.f12672d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.areEqual(this.f12669a, hVar.f12669a) && this.f12670b == hVar.f12670b && Intrinsics.areEqual(this.f12671c, hVar.f12671c) && Intrinsics.areEqual(this.f12672d, hVar.f12672d);
    }

    public final int hashCode() {
        int hashCode = (Integer.hashCode(this.f12670b) + (this.f12669a.hashCode() * 31)) * 31;
        String str = this.f12671c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f12672d;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "{code = " + this.f12670b + ", reason = " + this.f12671c + ", message = " + this.f12672d + '}';
    }
}
