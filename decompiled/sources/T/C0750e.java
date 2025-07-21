package T;

import T.U;
import android.graphics.Rect;
import android.util.Size;
import java.util.UUID;

/* renamed from: T.e, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0750e extends U.d {

    /* renamed from: a, reason: collision with root package name */
    public final UUID f4819a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4820b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4821c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f4822d;

    /* renamed from: e, reason: collision with root package name */
    public final Size f4823e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4824f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f4825g;

    public C0750e(UUID uuid, int i6, int i7, Rect rect, Size size, int i8, boolean z6) {
        if (uuid == null) {
            throw new NullPointerException("Null uuid");
        }
        this.f4819a = uuid;
        this.f4820b = i6;
        this.f4821c = i7;
        if (rect == null) {
            throw new NullPointerException("Null cropRect");
        }
        this.f4822d = rect;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f4823e = size;
        this.f4824f = i8;
        this.f4825g = z6;
    }

    @Override // T.U.d
    public Rect a() {
        return this.f4822d;
    }

    @Override // T.U.d
    public int b() {
        return this.f4821c;
    }

    @Override // T.U.d
    public boolean c() {
        return this.f4825g;
    }

    @Override // T.U.d
    public int d() {
        return this.f4824f;
    }

    @Override // T.U.d
    public Size e() {
        return this.f4823e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof U.d) {
            U.d dVar = (U.d) obj;
            if (this.f4819a.equals(dVar.g()) && this.f4820b == dVar.f() && this.f4821c == dVar.b() && this.f4822d.equals(dVar.a()) && this.f4823e.equals(dVar.e()) && this.f4824f == dVar.d() && this.f4825g == dVar.c()) {
                return true;
            }
        }
        return false;
    }

    @Override // T.U.d
    public int f() {
        return this.f4820b;
    }

    @Override // T.U.d
    public UUID g() {
        return this.f4819a;
    }

    public int hashCode() {
        return ((((((((((((this.f4819a.hashCode() ^ 1000003) * 1000003) ^ this.f4820b) * 1000003) ^ this.f4821c) * 1000003) ^ this.f4822d.hashCode()) * 1000003) ^ this.f4823e.hashCode()) * 1000003) ^ this.f4824f) * 1000003) ^ (this.f4825g ? 1231 : 1237);
    }

    public String toString() {
        return "OutConfig{uuid=" + this.f4819a + ", targets=" + this.f4820b + ", format=" + this.f4821c + ", cropRect=" + this.f4822d + ", size=" + this.f4823e + ", rotationDegrees=" + this.f4824f + ", mirroring=" + this.f4825g + "}";
    }
}
