package com.braze.models.outgoing;

import com.braze.models.IPutIntoJson;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class b implements IPutIntoJson {

    /* renamed from: a, reason: collision with root package name */
    public final String f12604a;

    public b(String apiKey) {
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        this.f12604a = apiKey;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.areEqual(this.f12604a, ((b) obj).f12604a);
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final Object getValue() {
        return this.f12604a;
    }

    public final int hashCode() {
        return this.f12604a.hashCode();
    }

    public final String toString() {
        return this.f12604a;
    }
}
