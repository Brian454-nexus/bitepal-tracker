package A1;

import A1.l;
import android.net.Uri;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import e1.C1250h;
import e1.C1252j;
import e1.C1265w;
import e1.InterfaceC1248f;
import java.io.InputStream;
import java.util.Map;
import w1.C2239y;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class n implements l.e {

    /* renamed from: a, reason: collision with root package name */
    public final long f157a;

    /* renamed from: b, reason: collision with root package name */
    public final C1252j f158b;

    /* renamed from: c, reason: collision with root package name */
    public final int f159c;

    /* renamed from: d, reason: collision with root package name */
    public final C1265w f160d;

    /* renamed from: e, reason: collision with root package name */
    public final a f161e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f162f;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface a {
        Object a(Uri uri, InputStream inputStream);
    }

    public n(InterfaceC1248f interfaceC1248f, Uri uri, int i6, a aVar) {
        this(interfaceC1248f, new C1252j.b().i(uri).b(1).a(), i6, aVar);
    }

    @Override // A1.l.e
    public final void a() {
        this.f160d.v();
        C1250h c1250h = new C1250h(this.f160d, this.f158b);
        try {
            c1250h.c();
            this.f162f = this.f161e.a((Uri) AbstractC1119a.e(this.f160d.getUri()), c1250h);
        } finally {
            AbstractC1117K.m(c1250h);
        }
    }

    public long b() {
        return this.f160d.f();
    }

    @Override // A1.l.e
    public final void c() {
    }

    public Map d() {
        return this.f160d.u();
    }

    public final Object e() {
        return this.f162f;
    }

    public Uri f() {
        return this.f160d.t();
    }

    public n(InterfaceC1248f interfaceC1248f, C1252j c1252j, int i6, a aVar) {
        this.f160d = new C1265w(interfaceC1248f);
        this.f158b = c1252j;
        this.f159c = i6;
        this.f161e = aVar;
        this.f157a = C2239y.a();
    }
}
