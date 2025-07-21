package e1;

import android.content.Context;
import android.net.Uri;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import c1.AbstractC1133o;
import e1.C1254l;
import e1.InterfaceC1248f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: e1.k, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1253k implements InterfaceC1248f {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13841a;

    /* renamed from: b, reason: collision with root package name */
    public final List f13842b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1248f f13843c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC1248f f13844d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC1248f f13845e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC1248f f13846f;

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC1248f f13847g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC1248f f13848h;

    /* renamed from: i, reason: collision with root package name */
    public InterfaceC1248f f13849i;

    /* renamed from: j, reason: collision with root package name */
    public InterfaceC1248f f13850j;

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC1248f f13851k;

    /* renamed from: e1.k$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a implements InterfaceC1248f.a {

        /* renamed from: a, reason: collision with root package name */
        public final Context f13852a;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC1248f.a f13853b;

        /* renamed from: c, reason: collision with root package name */
        public InterfaceC1266x f13854c;

        public a(Context context) {
            this(context, new C1254l.b());
        }

        @Override // e1.InterfaceC1248f.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C1253k a() {
            C1253k c1253k = new C1253k(this.f13852a, this.f13853b.a());
            InterfaceC1266x interfaceC1266x = this.f13854c;
            if (interfaceC1266x != null) {
                c1253k.l(interfaceC1266x);
            }
            return c1253k;
        }

        public a(Context context, InterfaceC1248f.a aVar) {
            this.f13852a = context.getApplicationContext();
            this.f13853b = aVar;
        }
    }

    public C1253k(Context context, InterfaceC1248f interfaceC1248f) {
        this.f13841a = context.getApplicationContext();
        this.f13843c = (InterfaceC1248f) AbstractC1119a.e(interfaceC1248f);
    }

    public final void A(InterfaceC1248f interfaceC1248f, InterfaceC1266x interfaceC1266x) {
        if (interfaceC1248f != null) {
            interfaceC1248f.l(interfaceC1266x);
        }
    }

    @Override // e1.InterfaceC1248f
    public void close() {
        InterfaceC1248f interfaceC1248f = this.f13851k;
        if (interfaceC1248f != null) {
            try {
                interfaceC1248f.close();
            } finally {
                this.f13851k = null;
            }
        }
    }

    public final void f(InterfaceC1248f interfaceC1248f) {
        for (int i6 = 0; i6 < this.f13842b.size(); i6++) {
            interfaceC1248f.l((InterfaceC1266x) this.f13842b.get(i6));
        }
    }

    @Override // e1.InterfaceC1248f
    public Uri getUri() {
        InterfaceC1248f interfaceC1248f = this.f13851k;
        if (interfaceC1248f == null) {
            return null;
        }
        return interfaceC1248f.getUri();
    }

    @Override // e1.InterfaceC1248f
    public void l(InterfaceC1266x interfaceC1266x) {
        AbstractC1119a.e(interfaceC1266x);
        this.f13843c.l(interfaceC1266x);
        this.f13842b.add(interfaceC1266x);
        A(this.f13844d, interfaceC1266x);
        A(this.f13845e, interfaceC1266x);
        A(this.f13846f, interfaceC1266x);
        A(this.f13847g, interfaceC1266x);
        A(this.f13848h, interfaceC1266x);
        A(this.f13849i, interfaceC1266x);
        A(this.f13850j, interfaceC1266x);
    }

    @Override // e1.InterfaceC1248f
    public Map n() {
        InterfaceC1248f interfaceC1248f = this.f13851k;
        return interfaceC1248f == null ? Collections.EMPTY_MAP : interfaceC1248f.n();
    }

    @Override // e1.InterfaceC1248f
    public long r(C1252j c1252j) {
        AbstractC1119a.g(this.f13851k == null);
        String scheme = c1252j.f13820a.getScheme();
        if (AbstractC1117K.E0(c1252j.f13820a)) {
            String path = c1252j.f13820a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                this.f13851k = w();
            } else {
                this.f13851k = t();
            }
        } else if ("asset".equals(scheme)) {
            this.f13851k = t();
        } else if ("content".equals(scheme)) {
            this.f13851k = u();
        } else if ("rtmp".equals(scheme)) {
            this.f13851k = y();
        } else if ("udp".equals(scheme)) {
            this.f13851k = z();
        } else if ("data".equals(scheme)) {
            this.f13851k = v();
        } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
            this.f13851k = x();
        } else {
            this.f13851k = this.f13843c;
        }
        return this.f13851k.r(c1252j);
    }

    @Override // Z0.InterfaceC0837i
    public int read(byte[] bArr, int i6, int i7) {
        return ((InterfaceC1248f) AbstractC1119a.e(this.f13851k)).read(bArr, i6, i7);
    }

    public final InterfaceC1248f t() {
        if (this.f13845e == null) {
            C1243a c1243a = new C1243a(this.f13841a);
            this.f13845e = c1243a;
            f(c1243a);
        }
        return this.f13845e;
    }

    public final InterfaceC1248f u() {
        if (this.f13846f == null) {
            C1246d c1246d = new C1246d(this.f13841a);
            this.f13846f = c1246d;
            f(c1246d);
        }
        return this.f13846f;
    }

    public final InterfaceC1248f v() {
        if (this.f13849i == null) {
            C1247e c1247e = new C1247e();
            this.f13849i = c1247e;
            f(c1247e);
        }
        return this.f13849i;
    }

    public final InterfaceC1248f w() {
        if (this.f13844d == null) {
            C1257o c1257o = new C1257o();
            this.f13844d = c1257o;
            f(c1257o);
        }
        return this.f13844d;
    }

    public final InterfaceC1248f x() {
        if (this.f13850j == null) {
            C1264v c1264v = new C1264v(this.f13841a);
            this.f13850j = c1264v;
            f(c1264v);
        }
        return this.f13850j;
    }

    public final InterfaceC1248f y() {
        if (this.f13847g == null) {
            try {
                InterfaceC1248f interfaceC1248f = (InterfaceC1248f) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                this.f13847g = interfaceC1248f;
                f(interfaceC1248f);
            } catch (ClassNotFoundException unused) {
                AbstractC1133o.h("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e6) {
                throw new RuntimeException("Error instantiating RTMP extension", e6);
            }
            if (this.f13847g == null) {
                this.f13847g = this.f13843c;
            }
        }
        return this.f13847g;
    }

    public final InterfaceC1248f z() {
        if (this.f13848h == null) {
            C1267y c1267y = new C1267y();
            this.f13848h = c1267y;
            f(c1267y);
        }
        return this.f13848h;
    }
}
