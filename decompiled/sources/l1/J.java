package l1;

import Z0.AbstractC0835g;
import android.net.Uri;
import android.text.TextUtils;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import e1.C1250h;
import e1.C1252j;
import e1.C1261s;
import e1.C1265w;
import e1.InterfaceC1248f;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import l1.InterfaceC1730A;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class J implements L {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1248f.a f16914a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16915b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f16916c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f16917d;

    public J(String str, boolean z6, InterfaceC1248f.a aVar) {
        AbstractC1119a.a((z6 && TextUtils.isEmpty(str)) ? false : true);
        this.f16914a = aVar;
        this.f16915b = str;
        this.f16916c = z6;
        this.f16917d = new HashMap();
    }

    public static byte[] c(InterfaceC1248f.a aVar, String str, byte[] bArr, Map map) {
        C1265w c1265w = new C1265w(aVar.a());
        C1252j a6 = new C1252j.b().j(str).e(map).d(2).c(bArr).b(1).a();
        int i6 = 0;
        C1252j c1252j = a6;
        while (true) {
            try {
                C1250h c1250h = new C1250h(c1265w, c1252j);
                try {
                    try {
                        return A6.a.b(c1250h);
                    } catch (C1261s e6) {
                        String d6 = d(e6, i6);
                        if (d6 == null) {
                            throw e6;
                        }
                        i6++;
                        c1252j = c1252j.a().j(d6).a();
                        AbstractC1117K.m(c1250h);
                    }
                } finally {
                    AbstractC1117K.m(c1250h);
                }
            } catch (Exception e7) {
                throw new M(a6, (Uri) AbstractC1119a.e(c1265w.t()), c1265w.n(), c1265w.f(), e7);
            }
        }
    }

    public static String d(C1261s c1261s, int i6) {
        Map map;
        List list;
        int i7 = c1261s.f13888d;
        if ((i7 != 307 && i7 != 308) || i6 >= 5 || (map = c1261s.f13890f) == null || (list = (List) map.get("Location")) == null || list.isEmpty()) {
            return null;
        }
        return (String) list.get(0);
    }

    @Override // l1.L
    public byte[] a(UUID uuid, InterfaceC1730A.d dVar) {
        return c(this.f16914a, dVar.b() + "&signedRequest=" + AbstractC1117K.I(dVar.a()), null, Collections.EMPTY_MAP);
    }

    @Override // l1.L
    public byte[] b(UUID uuid, InterfaceC1730A.a aVar) {
        String b6 = aVar.b();
        if (this.f16916c || TextUtils.isEmpty(b6)) {
            b6 = this.f16915b;
        }
        if (TextUtils.isEmpty(b6)) {
            C1252j.b bVar = new C1252j.b();
            Uri uri = Uri.EMPTY;
            throw new M(bVar.i(uri).a(), uri, z6.y.j(), 0L, new IllegalStateException("No license URL"));
        }
        HashMap hashMap = new HashMap();
        UUID uuid2 = AbstractC0835g.f6883e;
        hashMap.put("Content-Type", uuid2.equals(uuid) ? "text/xml" : AbstractC0835g.f6881c.equals(uuid) ? "application/json" : "application/octet-stream");
        if (uuid2.equals(uuid)) {
            hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.f16917d) {
            hashMap.putAll(this.f16917d);
        }
        return c(this.f16914a, b6, aVar.a(), hashMap);
    }

    public void e(String str, String str2) {
        AbstractC1119a.e(str);
        AbstractC1119a.e(str2);
        synchronized (this.f16917d) {
            this.f16917d.put(str, str2);
        }
    }
}
