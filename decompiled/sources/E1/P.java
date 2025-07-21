package E1;

import E1.O;
import c1.AbstractC1119a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f931a = new byte[10];

    /* renamed from: b, reason: collision with root package name */
    public boolean f932b;

    /* renamed from: c, reason: collision with root package name */
    public int f933c;

    /* renamed from: d, reason: collision with root package name */
    public long f934d;

    /* renamed from: e, reason: collision with root package name */
    public int f935e;

    /* renamed from: f, reason: collision with root package name */
    public int f936f;

    /* renamed from: g, reason: collision with root package name */
    public int f937g;

    public void a(O o6, O.a aVar) {
        if (this.f933c > 0) {
            o6.f(this.f934d, this.f935e, this.f936f, this.f937g, aVar);
            this.f933c = 0;
        }
    }

    public void b() {
        this.f932b = false;
        this.f933c = 0;
    }

    public void c(O o6, long j6, int i6, int i7, int i8, O.a aVar) {
        AbstractC1119a.h(this.f937g <= i7 + i8, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.f932b) {
            int i9 = this.f933c;
            int i10 = i9 + 1;
            this.f933c = i10;
            if (i9 == 0) {
                this.f934d = j6;
                this.f935e = i6;
                this.f936f = 0;
            }
            this.f936f += i7;
            this.f937g = i8;
            if (i10 >= 16) {
                a(o6, aVar);
            }
        }
    }

    public void d(InterfaceC0315q interfaceC0315q) {
        if (this.f932b) {
            return;
        }
        interfaceC0315q.s(this.f931a, 0, 10);
        interfaceC0315q.o();
        if (AbstractC0300b.j(this.f931a) == 0) {
            return;
        }
        this.f932b = true;
    }
}
