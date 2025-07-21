package X;

import F.H0;
import X.b0;

/* renamed from: X.m, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0804m extends b0 {

    /* renamed from: d, reason: collision with root package name */
    public final int f5940d;

    /* renamed from: e, reason: collision with root package name */
    public final b0.a f5941e;

    /* renamed from: f, reason: collision with root package name */
    public final H0.h f5942f;

    public C0804m(int i6, b0.a aVar, H0.h hVar) {
        this.f5940d = i6;
        if (aVar == null) {
            throw new NullPointerException("Null streamState");
        }
        this.f5941e = aVar;
        this.f5942f = hVar;
    }

    @Override // X.b0
    public int a() {
        return this.f5940d;
    }

    @Override // X.b0
    public H0.h b() {
        return this.f5942f;
    }

    @Override // X.b0
    public b0.a c() {
        return this.f5941e;
    }

    public boolean equals(Object obj) {
        H0.h hVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            if (this.f5940d == b0Var.a() && this.f5941e.equals(b0Var.c()) && ((hVar = this.f5942f) != null ? hVar.equals(b0Var.b()) : b0Var.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((this.f5940d ^ 1000003) * 1000003) ^ this.f5941e.hashCode()) * 1000003;
        H0.h hVar = this.f5942f;
        return hashCode ^ (hVar == null ? 0 : hVar.hashCode());
    }

    public String toString() {
        return "StreamInfo{id=" + this.f5940d + ", streamState=" + this.f5941e + ", inProgressTransformationInfo=" + this.f5942f + "}";
    }
}
