package E1;

import a2.C1005a;
import android.net.Uri;
import b2.C1084h;
import b2.s;
import c1.C1111E;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import k2.C1665C;
import k2.C1668b;
import k2.C1671e;
import k2.C1674h;
import k2.C1676j;
import l2.C1747b;
import m2.C1800a;

/* renamed from: E1.l, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0310l implements u {

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f1038r = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};

    /* renamed from: s, reason: collision with root package name */
    public static final a f1039s = new a(new a.InterfaceC0024a() { // from class: E1.j
        @Override // E1.C0310l.a.InterfaceC0024a
        public final Constructor a() {
            Constructor j6;
            j6 = C0310l.j();
            return j6;
        }
    });

    /* renamed from: t, reason: collision with root package name */
    public static final a f1040t = new a(new a.InterfaceC0024a() { // from class: E1.k
        @Override // E1.C0310l.a.InterfaceC0024a
        public final Constructor a() {
            Constructor k6;
            k6 = C0310l.k();
            return k6;
        }
    });

    /* renamed from: b, reason: collision with root package name */
    public boolean f1041b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1042c;

    /* renamed from: d, reason: collision with root package name */
    public int f1043d;

    /* renamed from: e, reason: collision with root package name */
    public int f1044e;

    /* renamed from: f, reason: collision with root package name */
    public int f1045f;

    /* renamed from: g, reason: collision with root package name */
    public int f1046g;

    /* renamed from: h, reason: collision with root package name */
    public int f1047h;

    /* renamed from: i, reason: collision with root package name */
    public int f1048i;

    /* renamed from: j, reason: collision with root package name */
    public int f1049j;

    /* renamed from: l, reason: collision with root package name */
    public int f1051l;

    /* renamed from: m, reason: collision with root package name */
    public z6.w f1052m;

    /* renamed from: q, reason: collision with root package name */
    public int f1056q;

    /* renamed from: k, reason: collision with root package name */
    public int f1050k = 1;

    /* renamed from: n, reason: collision with root package name */
    public int f1053n = 112800;

    /* renamed from: p, reason: collision with root package name */
    public s.a f1055p = new C1084h();

    /* renamed from: o, reason: collision with root package name */
    public boolean f1054o = true;

    /* renamed from: E1.l$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC0024a f1057a;

        /* renamed from: b, reason: collision with root package name */
        public final AtomicBoolean f1058b = new AtomicBoolean(false);

        /* renamed from: c, reason: collision with root package name */
        public Constructor f1059c;

        /* renamed from: E1.l$a$a, reason: collision with other inner class name */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public interface InterfaceC0024a {
            Constructor a();
        }

        public a(InterfaceC0024a interfaceC0024a) {
            this.f1057a = interfaceC0024a;
        }

        public InterfaceC0314p a(Object... objArr) {
            Constructor b6 = b();
            if (b6 == null) {
                return null;
            }
            try {
                return (InterfaceC0314p) b6.newInstance(objArr);
            } catch (Exception e6) {
                throw new IllegalStateException("Unexpected error creating extractor", e6);
            }
        }

        public final Constructor b() {
            synchronized (this.f1058b) {
                if (this.f1058b.get()) {
                    return this.f1059c;
                }
                try {
                    return this.f1057a.a();
                } catch (ClassNotFoundException unused) {
                    this.f1058b.set(true);
                    return this.f1059c;
                } catch (Exception e6) {
                    throw new RuntimeException("Error instantiating extension", e6);
                }
            }
        }
    }

    public static Constructor j() {
        if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
            return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(InterfaceC0314p.class).getConstructor(Integer.TYPE);
        }
        return null;
    }

    public static Constructor k() {
        return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(InterfaceC0314p.class).getConstructor(new Class[0]);
    }

    @Override // E1.u
    public synchronized InterfaceC0314p[] c() {
        return e(Uri.EMPTY, new HashMap());
    }

    @Override // E1.u
    public synchronized InterfaceC0314p[] e(Uri uri, Map map) {
        InterfaceC0314p[] interfaceC0314pArr;
        try {
            int[] iArr = f1038r;
            ArrayList arrayList = new ArrayList(iArr.length);
            int b6 = Z0.o.b(map);
            if (b6 != -1) {
                h(b6, arrayList);
            }
            int c6 = Z0.o.c(uri);
            if (c6 != -1 && c6 != b6) {
                h(c6, arrayList);
            }
            for (int i6 : iArr) {
                if (i6 != b6 && i6 != c6) {
                    h(i6, arrayList);
                }
            }
            interfaceC0314pArr = new InterfaceC0314p[arrayList.size()];
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                InterfaceC0314p interfaceC0314p = (InterfaceC0314p) arrayList.get(i7);
                if (this.f1054o && !(interfaceC0314p.d() instanceof Y1.h) && !(interfaceC0314p.d() instanceof Y1.m) && !(interfaceC0314p.d() instanceof k2.J) && !(interfaceC0314p.d() instanceof G1.b) && !(interfaceC0314p.d() instanceof W1.e)) {
                    interfaceC0314p = new b2.t(interfaceC0314p, this.f1055p);
                }
                interfaceC0314pArr[i7] = interfaceC0314p;
            }
        } catch (Throwable th) {
            throw th;
        }
        return interfaceC0314pArr;
    }

    public final void h(int i6, List list) {
        switch (i6) {
            case 0:
                list.add(new C1668b());
                return;
            case 1:
                list.add(new C1671e());
                return;
            case 2:
                list.add(new C1674h((this.f1042c ? 2 : 0) | this.f1043d | (this.f1041b ? 1 : 0)));
                return;
            case 3:
                list.add(new F1.b((this.f1042c ? 2 : 0) | this.f1044e | (this.f1041b ? 1 : 0)));
                return;
            case 4:
                InterfaceC0314p a6 = f1039s.a(Integer.valueOf(this.f1045f));
                if (a6 != null) {
                    list.add(a6);
                    return;
                } else {
                    list.add(new J1.d(this.f1045f));
                    return;
                }
            case 5:
                list.add(new K1.c());
                return;
            case 6:
                list.add(new W1.e(this.f1055p, (this.f1054o ? 0 : 2) | this.f1046g));
                return;
            case 7:
                list.add(new X1.f((this.f1042c ? 2 : 0) | this.f1049j | (this.f1041b ? 1 : 0)));
                return;
            case 8:
                list.add(new Y1.h(this.f1055p, this.f1048i | (this.f1054o ? 0 : 32)));
                list.add(new Y1.m(this.f1055p, (this.f1054o ? 0 : 16) | this.f1047h));
                return;
            case 9:
                list.add(new Z1.d());
                return;
            case 10:
                list.add(new C1665C());
                return;
            case 11:
                if (this.f1052m == null) {
                    this.f1052m = z6.w.w();
                }
                list.add(new k2.J(this.f1050k, !this.f1054o ? 1 : 0, this.f1055p, new C1111E(0L), new C1676j(this.f1051l, this.f1052m), this.f1053n));
                return;
            case 12:
                list.add(new C1747b());
                return;
            case 13:
            default:
                return;
            case 14:
                list.add(new M1.a(this.f1056q));
                return;
            case 15:
                InterfaceC0314p a7 = f1040t.a(new Object[0]);
                if (a7 != null) {
                    list.add(a7);
                    return;
                }
                return;
            case 16:
                list.add(new G1.b(!this.f1054o ? 1 : 0, this.f1055p));
                return;
            case 17:
                list.add(new C1005a());
                return;
            case 18:
                list.add(new C1800a());
                return;
            case 19:
                list.add(new I1.a());
                return;
            case 20:
                int i7 = this.f1047h;
                if ((i7 & 2) == 0 && (i7 & 4) == 0) {
                    list.add(new L1.a());
                    return;
                }
                return;
            case 21:
                list.add(new H1.a());
                return;
        }
    }

    @Override // E1.u
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public synchronized C0310l d(boolean z6) {
        this.f1054o = z6;
        return this;
    }

    public synchronized C0310l l(int i6) {
        this.f1056q = i6;
        return this;
    }

    @Override // E1.u
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public synchronized C0310l a(s.a aVar) {
        this.f1055p = aVar;
        return this;
    }
}
