package b3;

/* renamed from: b3.b, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1086b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10513a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f10514b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f10515c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f10516d;

    public C1086b(boolean z6, boolean z7, boolean z8, boolean z9) {
        this.f10513a = z6;
        this.f10514b = z7;
        this.f10515c = z8;
        this.f10516d = z9;
    }

    public final boolean a() {
        return this.f10513a;
    }

    public final boolean b() {
        return this.f10515c;
    }

    public final boolean c() {
        return this.f10516d;
    }

    public final boolean d() {
        return this.f10514b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1086b)) {
            return false;
        }
        C1086b c1086b = (C1086b) obj;
        return this.f10513a == c1086b.f10513a && this.f10514b == c1086b.f10514b && this.f10515c == c1086b.f10515c && this.f10516d == c1086b.f10516d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    public int hashCode() {
        boolean z6 = this.f10513a;
        ?? r02 = z6;
        if (z6) {
            r02 = 1;
        }
        int i6 = r02 * 31;
        ?? r22 = this.f10514b;
        int i7 = r22;
        if (r22 != 0) {
            i7 = 1;
        }
        int i8 = (i6 + i7) * 31;
        ?? r23 = this.f10515c;
        int i9 = r23;
        if (r23 != 0) {
            i9 = 1;
        }
        int i10 = (i8 + i9) * 31;
        boolean z7 = this.f10516d;
        return i10 + (z7 ? 1 : z7 ? 1 : 0);
    }

    public String toString() {
        return "NetworkState(isConnected=" + this.f10513a + ", isValidated=" + this.f10514b + ", isMetered=" + this.f10515c + ", isNotRoaming=" + this.f10516d + ')';
    }
}
