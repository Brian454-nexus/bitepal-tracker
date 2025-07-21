package H;

import F.X;
import android.graphics.Matrix;
import android.graphics.Rect;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: H.h, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0384h extends X {

    /* renamed from: b, reason: collision with root package name */
    public final Executor f1995b;

    /* renamed from: c, reason: collision with root package name */
    public final X.f f1996c;

    /* renamed from: d, reason: collision with root package name */
    public final X.g f1997d;

    /* renamed from: e, reason: collision with root package name */
    public final Rect f1998e;

    /* renamed from: f, reason: collision with root package name */
    public final Matrix f1999f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2000g;

    /* renamed from: h, reason: collision with root package name */
    public final int f2001h;

    /* renamed from: i, reason: collision with root package name */
    public final int f2002i;

    /* renamed from: j, reason: collision with root package name */
    public final List f2003j;

    public C0384h(Executor executor, X.e eVar, X.f fVar, X.g gVar, Rect rect, Matrix matrix, int i6, int i7, int i8, List list) {
        if (executor == null) {
            throw new NullPointerException("Null appExecutor");
        }
        this.f1995b = executor;
        this.f1996c = fVar;
        this.f1997d = gVar;
        if (rect == null) {
            throw new NullPointerException("Null cropRect");
        }
        this.f1998e = rect;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransform");
        }
        this.f1999f = matrix;
        this.f2000g = i6;
        this.f2001h = i7;
        this.f2002i = i8;
        if (list == null) {
            throw new NullPointerException("Null sessionConfigCameraCaptureCallbacks");
        }
        this.f2003j = list;
    }

    @Override // H.X
    public Executor e() {
        return this.f1995b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof X) {
            X x6 = (X) obj;
            if (this.f1995b.equals(x6.e())) {
                x6.h();
                X.f fVar = this.f1996c;
                if (fVar != null ? fVar.equals(x6.j()) : x6.j() == null) {
                    X.g gVar = this.f1997d;
                    if (gVar != null ? gVar.equals(x6.k()) : x6.k() == null) {
                        if (this.f1998e.equals(x6.g()) && this.f1999f.equals(x6.m()) && this.f2000g == x6.l() && this.f2001h == x6.i() && this.f2002i == x6.f() && this.f2003j.equals(x6.n())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // H.X
    public int f() {
        return this.f2002i;
    }

    @Override // H.X
    public Rect g() {
        return this.f1998e;
    }

    @Override // H.X
    public X.e h() {
        return null;
    }

    public int hashCode() {
        int hashCode = (this.f1995b.hashCode() ^ 1000003) * (-721379959);
        X.f fVar = this.f1996c;
        int hashCode2 = (hashCode ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        X.g gVar = this.f1997d;
        return ((((((((((((hashCode2 ^ (gVar != null ? gVar.hashCode() : 0)) * 1000003) ^ this.f1998e.hashCode()) * 1000003) ^ this.f1999f.hashCode()) * 1000003) ^ this.f2000g) * 1000003) ^ this.f2001h) * 1000003) ^ this.f2002i) * 1000003) ^ this.f2003j.hashCode();
    }

    @Override // H.X
    public int i() {
        return this.f2001h;
    }

    @Override // H.X
    public X.f j() {
        return this.f1996c;
    }

    @Override // H.X
    public X.g k() {
        return this.f1997d;
    }

    @Override // H.X
    public int l() {
        return this.f2000g;
    }

    @Override // H.X
    public Matrix m() {
        return this.f1999f;
    }

    @Override // H.X
    public List n() {
        return this.f2003j;
    }

    public String toString() {
        return "TakePictureRequest{appExecutor=" + this.f1995b + ", inMemoryCallback=" + ((Object) null) + ", onDiskCallback=" + this.f1996c + ", outputFileOptions=" + this.f1997d + ", cropRect=" + this.f1998e + ", sensorToBufferTransform=" + this.f1999f + ", rotationDegrees=" + this.f2000g + ", jpegQuality=" + this.f2001h + ", captureMode=" + this.f2002i + ", sessionConfigCameraCaptureCallbacks=" + this.f2003j + "}";
    }
}
