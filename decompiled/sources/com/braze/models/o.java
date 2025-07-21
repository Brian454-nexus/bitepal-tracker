package com.braze.models;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class o implements IPutIntoJson {

    /* renamed from: a, reason: collision with root package name */
    public final UUID f12602a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12603b;

    public o(UUID sessionIdUuid) {
        Intrinsics.checkNotNullParameter(sessionIdUuid, "sessionIdUuid");
        this.f12602a = sessionIdUuid;
        String uuid = sessionIdUuid.toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        this.f12603b = uuid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && Intrinsics.areEqual(this.f12602a, ((o) obj).f12602a);
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final Object getValue() {
        return this.f12603b;
    }

    public final int hashCode() {
        return this.f12602a.hashCode();
    }

    public final String toString() {
        return this.f12603b;
    }
}
