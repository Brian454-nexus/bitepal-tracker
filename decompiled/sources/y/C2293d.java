package y;

import android.util.Size;
import y.K;

/* renamed from: y.d, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C2293d extends K.i {

    /* renamed from: a, reason: collision with root package name */
    public final String f20957a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f20958b;

    /* renamed from: c, reason: collision with root package name */
    public final I.L0 f20959c;

    /* renamed from: d, reason: collision with root package name */
    public final I.Y0 f20960d;

    /* renamed from: e, reason: collision with root package name */
    public final Size f20961e;

    public C2293d(String str, Class cls, I.L0 l02, I.Y0 y02, Size size) {
        if (str == null) {
            throw new NullPointerException("Null useCaseId");
        }
        this.f20957a = str;
        if (cls == null) {
            throw new NullPointerException("Null useCaseType");
        }
        this.f20958b = cls;
        if (l02 == null) {
            throw new NullPointerException("Null sessionConfig");
        }
        this.f20959c = l02;
        if (y02 == null) {
            throw new NullPointerException("Null useCaseConfig");
        }
        this.f20960d = y02;
        this.f20961e = size;
    }

    @Override // y.K.i
    public I.L0 c() {
        return this.f20959c;
    }

    @Override // y.K.i
    public Size d() {
        return this.f20961e;
    }

    @Override // y.K.i
    public I.Y0 e() {
        return this.f20960d;
    }

    public boolean equals(Object obj) {
        Size size;
        if (obj == this) {
            return true;
        }
        if (obj instanceof K.i) {
            K.i iVar = (K.i) obj;
            if (this.f20957a.equals(iVar.f()) && this.f20958b.equals(iVar.g()) && this.f20959c.equals(iVar.c()) && this.f20960d.equals(iVar.e()) && ((size = this.f20961e) != null ? size.equals(iVar.d()) : iVar.d() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // y.K.i
    public String f() {
        return this.f20957a;
    }

    @Override // y.K.i
    public Class g() {
        return this.f20958b;
    }

    public int hashCode() {
        int hashCode = (((((((this.f20957a.hashCode() ^ 1000003) * 1000003) ^ this.f20958b.hashCode()) * 1000003) ^ this.f20959c.hashCode()) * 1000003) ^ this.f20960d.hashCode()) * 1000003;
        Size size = this.f20961e;
        return hashCode ^ (size == null ? 0 : size.hashCode());
    }

    public String toString() {
        return "UseCaseInfo{useCaseId=" + this.f20957a + ", useCaseType=" + this.f20958b + ", sessionConfig=" + this.f20959c + ", useCaseConfig=" + this.f20960d + ", surfaceResolution=" + this.f20961e + "}";
    }
}
