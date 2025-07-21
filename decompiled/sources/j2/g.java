package j2;

import Z0.z;
import android.text.TextUtils;
import b2.s;
import c1.C1144z;
import c1.InterfaceC1125g;
import java.util.ArrayList;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class g implements s {

    /* renamed from: a, reason: collision with root package name */
    public final C1144z f16193a = new C1144z();

    /* renamed from: b, reason: collision with root package name */
    public final C1645b f16194b = new C1645b();

    public static int e(C1144z c1144z) {
        int i6 = -1;
        int i7 = 0;
        while (i6 == -1) {
            i7 = c1144z.f();
            String r6 = c1144z.r();
            i6 = r6 == null ? 0 : "STYLE".equals(r6) ? 2 : r6.startsWith("NOTE") ? 1 : 3;
        }
        c1144z.T(i7);
        return i6;
    }

    public static void f(C1144z c1144z) {
        do {
        } while (!TextUtils.isEmpty(c1144z.r()));
    }

    @Override // b2.s
    public void c(byte[] bArr, int i6, int i7, s.b bVar, InterfaceC1125g interfaceC1125g) {
        d m6;
        this.f16193a.R(bArr, i7 + i6);
        this.f16193a.T(i6);
        ArrayList arrayList = new ArrayList();
        try {
            h.e(this.f16193a);
            do {
            } while (!TextUtils.isEmpty(this.f16193a.r()));
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int e6 = e(this.f16193a);
                if (e6 == 0) {
                    b2.i.c(new j(arrayList2), bVar, interfaceC1125g);
                    return;
                }
                if (e6 == 1) {
                    f(this.f16193a);
                } else if (e6 == 2) {
                    if (!arrayList2.isEmpty()) {
                        throw new IllegalArgumentException("A style block was found after the first cue.");
                    }
                    this.f16193a.r();
                    arrayList.addAll(this.f16194b.d(this.f16193a));
                } else if (e6 == 3 && (m6 = e.m(this.f16193a, arrayList)) != null) {
                    arrayList2.add(m6);
                }
            }
        } catch (z e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    @Override // b2.s
    public int d() {
        return 1;
    }
}
