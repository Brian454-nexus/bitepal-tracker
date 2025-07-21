package com.braze.events.internal.dispatchmanager;

import com.braze.models.o;
import com.braze.requests.n;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final a f12270e = new a();

    /* renamed from: a, reason: collision with root package name */
    public final b f12271a;

    /* renamed from: b, reason: collision with root package name */
    public final List f12272b;

    /* renamed from: c, reason: collision with root package name */
    public final o f12273c;

    /* renamed from: d, reason: collision with root package name */
    public final n f12274d;

    public c(b commandType, List brazeEvents, o oVar, com.braze.requests.b bVar, int i6) {
        brazeEvents = (i6 & 2) != 0 ? CollectionsKt.emptyList() : brazeEvents;
        oVar = (i6 & 4) != 0 ? null : oVar;
        bVar = (i6 & 8) != 0 ? null : bVar;
        Intrinsics.checkNotNullParameter(commandType, "commandType");
        Intrinsics.checkNotNullParameter(brazeEvents, "brazeEvents");
        this.f12271a = commandType;
        this.f12272b = brazeEvents;
        this.f12273c = oVar;
        this.f12274d = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f12271a == cVar.f12271a && Intrinsics.areEqual(this.f12272b, cVar.f12272b) && Intrinsics.areEqual(this.f12273c, cVar.f12273c) && Intrinsics.areEqual(this.f12274d, cVar.f12274d);
    }

    public final int hashCode() {
        int hashCode = (this.f12272b.hashCode() + (this.f12271a.hashCode() * 31)) * 31;
        o oVar = this.f12273c;
        int hashCode2 = (hashCode + (oVar == null ? 0 : oVar.f12602a.hashCode())) * 31;
        n nVar = this.f12274d;
        return hashCode2 + (nVar != null ? nVar.hashCode() : 0);
    }

    public final String toString() {
        return "DispatchCommandEvent(commandType=" + this.f12271a + ", brazeEvents=" + this.f12272b + ", sessionId=" + this.f12273c + ", brazeRequest=" + this.f12274d + ')';
    }
}
