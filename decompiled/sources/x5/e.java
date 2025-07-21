package x5;

import F5.C0360g;
import F5.C0361h;
import F5.C0362i;
import F5.C0363j;
import F5.InterfaceC0357d;
import F5.N;
import F5.X;
import android.content.Context;
import x5.v;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class e {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b implements v.a {

        /* renamed from: a, reason: collision with root package name */
        public Context f20623a;

        public b() {
        }

        @Override // x5.v.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a(Context context) {
            this.f20623a = (Context) z5.d.b(context);
            return this;
        }

        @Override // x5.v.a
        public v build() {
            z5.d.a(this.f20623a, Context.class);
            return new c(this.f20623a);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c extends v {

        /* renamed from: a, reason: collision with root package name */
        public final c f20624a;

        /* renamed from: b, reason: collision with root package name */
        public fa.a f20625b;

        /* renamed from: c, reason: collision with root package name */
        public fa.a f20626c;

        /* renamed from: d, reason: collision with root package name */
        public fa.a f20627d;

        /* renamed from: e, reason: collision with root package name */
        public fa.a f20628e;

        /* renamed from: f, reason: collision with root package name */
        public fa.a f20629f;

        /* renamed from: g, reason: collision with root package name */
        public fa.a f20630g;

        /* renamed from: h, reason: collision with root package name */
        public fa.a f20631h;

        /* renamed from: i, reason: collision with root package name */
        public fa.a f20632i;

        /* renamed from: j, reason: collision with root package name */
        public fa.a f20633j;

        /* renamed from: k, reason: collision with root package name */
        public fa.a f20634k;

        /* renamed from: l, reason: collision with root package name */
        public fa.a f20635l;

        /* renamed from: m, reason: collision with root package name */
        public fa.a f20636m;

        /* renamed from: n, reason: collision with root package name */
        public fa.a f20637n;

        public final void D(Context context) {
            this.f20625b = z5.a.a(k.a());
            z5.b a6 = z5.c.a(context);
            this.f20626c = a6;
            y5.j a7 = y5.j.a(a6, H5.c.a(), H5.d.a());
            this.f20627d = a7;
            this.f20628e = z5.a.a(y5.l.a(this.f20626c, a7));
            this.f20629f = X.a(this.f20626c, C0360g.a(), C0362i.a());
            this.f20630g = z5.a.a(C0361h.a(this.f20626c));
            this.f20631h = z5.a.a(N.a(H5.c.a(), H5.d.a(), C0363j.a(), this.f20629f, this.f20630g));
            D5.g b6 = D5.g.b(H5.c.a());
            this.f20632i = b6;
            D5.i a8 = D5.i.a(this.f20626c, this.f20631h, b6, H5.d.a());
            this.f20633j = a8;
            fa.a aVar = this.f20625b;
            fa.a aVar2 = this.f20628e;
            fa.a aVar3 = this.f20631h;
            this.f20634k = D5.d.a(aVar, aVar2, a8, aVar3, aVar3);
            fa.a aVar4 = this.f20626c;
            fa.a aVar5 = this.f20628e;
            fa.a aVar6 = this.f20631h;
            this.f20635l = E5.s.a(aVar4, aVar5, aVar6, this.f20633j, this.f20625b, aVar6, H5.c.a(), H5.d.a(), this.f20631h);
            fa.a aVar7 = this.f20625b;
            fa.a aVar8 = this.f20631h;
            this.f20636m = E5.w.a(aVar7, aVar8, this.f20633j, aVar8);
            this.f20637n = z5.a.a(w.a(H5.c.a(), H5.d.a(), this.f20634k, this.f20635l, this.f20636m));
        }

        @Override // x5.v
        public InterfaceC0357d a() {
            return (InterfaceC0357d) this.f20631h.get();
        }

        @Override // x5.v
        public u c() {
            return (u) this.f20637n.get();
        }

        public c(Context context) {
            this.f20624a = this;
            D(context);
        }
    }

    public static v.a a() {
        return new b();
    }
}
