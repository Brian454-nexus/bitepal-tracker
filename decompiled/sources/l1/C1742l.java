package l1;

import Z0.u;
import android.net.Uri;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import e1.C1254l;
import e1.InterfaceC1248f;
import java.util.Map;
import l1.C1738h;
import z6.g0;

/* renamed from: l1.l, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1742l implements w {

    /* renamed from: a, reason: collision with root package name */
    public final Object f17004a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public u.f f17005b;

    /* renamed from: c, reason: collision with root package name */
    public u f17006c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC1248f.a f17007d;

    /* renamed from: e, reason: collision with root package name */
    public String f17008e;

    /* renamed from: f, reason: collision with root package name */
    public A1.k f17009f;

    @Override // l1.w
    public u a(Z0.u uVar) {
        u uVar2;
        AbstractC1119a.e(uVar.f7064b);
        u.f fVar = uVar.f7064b.f7158c;
        if (fVar == null) {
            return u.f17030a;
        }
        synchronized (this.f17004a) {
            try {
                if (!AbstractC1117K.c(fVar, this.f17005b)) {
                    this.f17005b = fVar;
                    this.f17006c = b(fVar);
                }
                uVar2 = (u) AbstractC1119a.e(this.f17006c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return uVar2;
    }

    public final u b(u.f fVar) {
        InterfaceC1248f.a aVar = this.f17007d;
        if (aVar == null) {
            aVar = new C1254l.b().e(this.f17008e);
        }
        Uri uri = fVar.f7115c;
        J j6 = new J(uri == null ? null : uri.toString(), fVar.f7120h, aVar);
        g0 l6 = fVar.f7117e.g().l();
        while (l6.hasNext()) {
            Map.Entry entry = (Map.Entry) l6.next();
            j6.e((String) entry.getKey(), (String) entry.getValue());
        }
        C1738h.b e6 = new C1738h.b().f(fVar.f7113a, I.f16910d).c(fVar.f7118f).d(fVar.f7119g).e(C6.g.m(fVar.f7122j));
        A1.k kVar = this.f17009f;
        if (kVar != null) {
            e6.b(kVar);
        }
        C1738h a6 = e6.a(j6);
        a6.F(0, fVar.c());
        return a6;
    }
}
