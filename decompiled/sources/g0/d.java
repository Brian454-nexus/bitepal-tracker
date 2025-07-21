package g0;

import F.AbstractC0335i0;
import android.util.Range;
import android.util.Size;
import c0.AbstractC1104f;
import c0.l;
import e0.o0;
import java.util.HashSet;
import java.util.Set;
import y0.g;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class d implements o0 {

    /* renamed from: a, reason: collision with root package name */
    public final o0 f14273a;

    /* renamed from: b, reason: collision with root package name */
    public final Range f14274b;

    /* renamed from: c, reason: collision with root package name */
    public final Range f14275c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f14276d;

    public d(o0 o0Var, Size size) {
        HashSet hashSet = new HashSet();
        this.f14276d = hashSet;
        this.f14273a = o0Var;
        int a6 = o0Var.a();
        this.f14274b = Range.create(Integer.valueOf(a6), Integer.valueOf(((int) Math.ceil(4096.0d / a6)) * a6));
        int e6 = o0Var.e();
        this.f14275c = Range.create(Integer.valueOf(e6), Integer.valueOf(((int) Math.ceil(2160.0d / e6)) * e6));
        if (size != null) {
            hashSet.add(size);
        }
        hashSet.addAll(l.d());
    }

    public static o0 i(o0 o0Var, Size size) {
        if (o0Var instanceof d) {
            return o0Var;
        }
        if (AbstractC1104f.a(l.class) == null) {
            if (size == null || o0Var.g(size.getWidth(), size.getHeight())) {
                return o0Var;
            }
            AbstractC0335i0.l("VideoEncoderInfoWrapper", String.format("Detected that the device does not support a size %s that should be valid in widths/heights = %s/%s", size, o0Var.f(), o0Var.h()));
        }
        return new d(o0Var, size);
    }

    @Override // e0.o0
    public int a() {
        return this.f14273a.a();
    }

    @Override // e0.o0
    public Range b() {
        return this.f14273a.b();
    }

    @Override // e0.o0
    public Range c(int i6) {
        g.b(this.f14275c.contains((Range) Integer.valueOf(i6)) && i6 % this.f14273a.e() == 0, "Not supported height: " + i6 + " which is not in " + this.f14275c + " or can not be divided by alignment " + this.f14273a.e());
        return this.f14274b;
    }

    @Override // e0.o0
    public Range d(int i6) {
        g.b(this.f14274b.contains((Range) Integer.valueOf(i6)) && i6 % this.f14273a.a() == 0, "Not supported width: " + i6 + " which is not in " + this.f14274b + " or can not be divided by alignment " + this.f14273a.a());
        return this.f14275c;
    }

    @Override // e0.o0
    public int e() {
        return this.f14273a.e();
    }

    @Override // e0.o0
    public Range f() {
        return this.f14274b;
    }

    @Override // e0.o0
    public boolean g(int i6, int i7) {
        if (this.f14276d.isEmpty() || !this.f14276d.contains(new Size(i6, i7))) {
            return this.f14274b.contains((Range) Integer.valueOf(i6)) && this.f14275c.contains((Range) Integer.valueOf(i7)) && i6 % this.f14273a.a() == 0 && i7 % this.f14273a.e() == 0;
        }
        return true;
    }

    @Override // e0.o0
    public Range h() {
        return this.f14275c;
    }
}
