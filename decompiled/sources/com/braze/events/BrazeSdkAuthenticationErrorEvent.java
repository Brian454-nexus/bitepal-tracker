package com.braze.events;

import com.braze.models.response.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\bR\u0011\u0010\u0014\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000bR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\b¨\u0006\u0017"}, d2 = {"Lcom/braze/events/BrazeSdkAuthenticationErrorEvent;", "", "Lcom/braze/models/response/h;", "sdkAuthError", "<init>", "(Lcom/braze/models/response/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/braze/models/response/h;", "getErrorReason", "errorReason", "getErrorCode", "errorCode", "getUserId", "userId", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final /* data */ class BrazeSdkAuthenticationErrorEvent {
    private final h sdkAuthError;

    public BrazeSdkAuthenticationErrorEvent(h sdkAuthError) {
        Intrinsics.checkNotNullParameter(sdkAuthError, "sdkAuthError");
        this.sdkAuthError = sdkAuthError;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BrazeSdkAuthenticationErrorEvent) && Intrinsics.areEqual(this.sdkAuthError, ((BrazeSdkAuthenticationErrorEvent) other).sdkAuthError);
    }

    public final int getErrorCode() {
        return this.sdkAuthError.f12670b;
    }

    public final String getErrorReason() {
        return this.sdkAuthError.f12671c;
    }

    public final String getUserId() {
        return ((com.braze.requests.b) this.sdkAuthError.f12669a).f12741b;
    }

    public int hashCode() {
        return this.sdkAuthError.hashCode();
    }

    public String toString() {
        return this.sdkAuthError.toString();
    }
}
