package com.braze.models.response;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class f implements d {

    /* renamed from: a, reason: collision with root package name */
    public final com.braze.requests.n f12653a;

    /* renamed from: b, reason: collision with root package name */
    public final com.braze.communication.d f12654b;

    public f(com.braze.requests.n originalRequest, com.braze.communication.d connectionResult) {
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        Intrinsics.checkNotNullParameter(connectionResult, "connectionResult");
        this.f12653a = originalRequest;
        this.f12654b = connectionResult;
    }

    @Override // com.braze.models.response.d
    public final String a() {
        return "An error occurred during request processing, resulting in no valid response being received. Check the error log for more details.";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.areEqual(this.f12653a, fVar.f12653a) && Intrinsics.areEqual("An error occurred during request processing, resulting in no valid response being received. Check the error log for more details.", "An error occurred during request processing, resulting in no valid response being received. Check the error log for more details.") && Intrinsics.areEqual(this.f12654b, fVar.f12654b);
    }

    public final int hashCode() {
        return this.f12654b.hashCode() + (((this.f12653a.hashCode() * 31) - 525898564) * 31);
    }

    public final String toString() {
        return "NetworkCommunicationFailureResponseError(originalRequest=" + this.f12653a + ", errorMessage=An error occurred during request processing, resulting in no valid response being received. Check the error log for more details., connectionResult=" + this.f12654b + ')';
    }
}
