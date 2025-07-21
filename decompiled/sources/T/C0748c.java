package T;

import I.InterfaceC0455u;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;

/* renamed from: T.c, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0748c extends A {

    /* renamed from: a, reason: collision with root package name */
    public final Object f4809a;

    /* renamed from: b, reason: collision with root package name */
    public final L.g f4810b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4811c;

    /* renamed from: d, reason: collision with root package name */
    public final Size f4812d;

    /* renamed from: e, reason: collision with root package name */
    public final Rect f4813e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4814f;

    /* renamed from: g, reason: collision with root package name */
    public final Matrix f4815g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC0455u f4816h;

    public C0748c(Object obj, L.g gVar, int i6, Size size, Rect rect, int i7, Matrix matrix, InterfaceC0455u interfaceC0455u) {
        if (obj == null) {
            throw new NullPointerException("Null data");
        }
        this.f4809a = obj;
        this.f4810b = gVar;
        this.f4811c = i6;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f4812d = size;
        if (rect == null) {
            throw new NullPointerException("Null cropRect");
        }
        this.f4813e = rect;
        this.f4814f = i7;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransform");
        }
        this.f4815g = matrix;
        if (interfaceC0455u == null) {
            throw new NullPointerException("Null cameraCaptureResult");
        }
        this.f4816h = interfaceC0455u;
    }

    @Override // T.A
    public InterfaceC0455u a() {
        return this.f4816h;
    }

    @Override // T.A
    public Rect b() {
        return this.f4813e;
    }

    @Override // T.A
    public Object c() {
        return this.f4809a;
    }

    @Override // T.A
    public L.g d() {
        return this.f4810b;
    }

    @Override // T.A
    public int e() {
        return this.f4811c;
    }

    public boolean equals(Object obj) {
        L.g gVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof A) {
            A a6 = (A) obj;
            if (this.f4809a.equals(a6.c()) && ((gVar = this.f4810b) != null ? gVar.equals(a6.d()) : a6.d() == null) && this.f4811c == a6.e() && this.f4812d.equals(a6.h()) && this.f4813e.equals(a6.b()) && this.f4814f == a6.f() && this.f4815g.equals(a6.g()) && this.f4816h.equals(a6.a())) {
                return true;
            }
        }
        return false;
    }

    @Override // T.A
    public int f() {
        return this.f4814f;
    }

    @Override // T.A
    public Matrix g() {
        return this.f4815g;
    }

    @Override // T.A
    public Size h() {
        return this.f4812d;
    }

    public int hashCode() {
        int hashCode = (this.f4809a.hashCode() ^ 1000003) * 1000003;
        L.g gVar = this.f4810b;
        return ((((((((((((hashCode ^ (gVar == null ? 0 : gVar.hashCode())) * 1000003) ^ this.f4811c) * 1000003) ^ this.f4812d.hashCode()) * 1000003) ^ this.f4813e.hashCode()) * 1000003) ^ this.f4814f) * 1000003) ^ this.f4815g.hashCode()) * 1000003) ^ this.f4816h.hashCode();
    }

    public String toString() {
        return "Packet{data=" + this.f4809a + ", exif=" + this.f4810b + ", format=" + this.f4811c + ", size=" + this.f4812d + ", cropRect=" + this.f4813e + ", rotationDegrees=" + this.f4814f + ", sensorToBufferTransform=" + this.f4815g + ", cameraCaptureResult=" + this.f4816h + "}";
    }
}
