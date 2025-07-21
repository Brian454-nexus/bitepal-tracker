package j2;

import b1.C1076a;
import b2.C1081e;
import b2.s;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import c1.C1144z;
import c1.InterfaceC1125g;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: j2.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1644a implements s {

    /* renamed from: a, reason: collision with root package name */
    public final C1144z f16144a = new C1144z();

    public static C1076a e(C1144z c1144z, int i6) {
        CharSequence charSequence = null;
        C1076a.b bVar = null;
        while (i6 > 0) {
            AbstractC1119a.b(i6 >= 8, "Incomplete vtt cue box header found.");
            int p6 = c1144z.p();
            int p7 = c1144z.p();
            int i7 = p6 - 8;
            String J6 = AbstractC1117K.J(c1144z.e(), c1144z.f(), i7);
            c1144z.U(i7);
            i6 = (i6 - 8) - i7;
            if (p7 == 1937011815) {
                bVar = e.o(J6);
            } else if (p7 == 1885436268) {
                charSequence = e.q(null, J6.trim(), Collections.EMPTY_LIST);
            }
        }
        if (charSequence == null) {
            charSequence = "";
        }
        return bVar != null ? bVar.o(charSequence).a() : e.l(charSequence);
    }

    @Override // b2.s
    public void c(byte[] bArr, int i6, int i7, s.b bVar, InterfaceC1125g interfaceC1125g) {
        this.f16144a.R(bArr, i7 + i6);
        this.f16144a.T(i6);
        ArrayList arrayList = new ArrayList();
        while (this.f16144a.a() > 0) {
            AbstractC1119a.b(this.f16144a.a() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            int p6 = this.f16144a.p();
            if (this.f16144a.p() == 1987343459) {
                arrayList.add(e(this.f16144a, p6 - 8));
            } else {
                this.f16144a.U(p6 - 8);
            }
        }
        interfaceC1125g.accept(new C1081e(arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    @Override // b2.s
    public int d() {
        return 2;
    }
}
