package D3;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final i f806a;

    /* renamed from: b, reason: collision with root package name */
    public final C3.a f807b;

    public h(i type, C3.a aVar) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f806a = type;
        this.f807b = aVar;
    }

    public final C3.a a() {
        return this.f807b;
    }

    public final i b() {
        return this.f806a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f806a == hVar.f806a && Intrinsics.areEqual(this.f807b, hVar.f807b);
    }

    public int hashCode() {
        int hashCode = this.f806a.hashCode() * 31;
        C3.a aVar = this.f807b;
        return hashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public String toString() {
        return "WriteQueueMessage(type=" + this.f806a + ", event=" + this.f807b + ')';
    }
}
