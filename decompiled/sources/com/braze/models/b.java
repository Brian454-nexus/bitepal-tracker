package com.braze.models;

import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class b implements k {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f12572a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f12573b;

    public b(LinkedHashSet eventsList) {
        Intrinsics.checkNotNullParameter(eventsList, "eventsList");
        this.f12572a = eventsList;
        this.f12573b = eventsList.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.areEqual(this.f12572a, ((b) obj).f12572a);
    }

    public final int hashCode() {
        return this.f12572a.hashCode();
    }

    @Override // com.braze.models.k
    public final boolean isEmpty() {
        return this.f12573b;
    }

    public final String toString() {
        return "BrazeEventContainer(eventsList=" + this.f12572a + ')';
    }
}
