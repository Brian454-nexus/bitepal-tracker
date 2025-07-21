package com.braze.triggers.utils;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final com.braze.triggers.enums.b f13107a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13108b;

    public a(com.braze.triggers.enums.b pathType, String remoteUrl) {
        Intrinsics.checkNotNullParameter(pathType, "pathType");
        Intrinsics.checkNotNullParameter(remoteUrl, "remoteUrl");
        this.f13107a = pathType;
        this.f13108b = remoteUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f13107a == aVar.f13107a && Intrinsics.areEqual(this.f13108b, aVar.f13108b);
    }

    public final int hashCode() {
        return this.f13108b.hashCode() + (this.f13107a.hashCode() * 31);
    }

    public final String toString() {
        return "RemotePath(pathType=" + this.f13107a + ", remoteUrl=" + this.f13108b + ')';
    }
}
