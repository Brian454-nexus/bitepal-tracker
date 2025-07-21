package androidx.media3.exoplayer.rtsp;

import androidx.media3.exoplayer.rtsp.a;
import e1.AbstractC1251i;
import java.io.IOException;
import s1.AbstractC2048h;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class m implements a.InterfaceC0138a {

    /* renamed from: a, reason: collision with root package name */
    public final long f9426a;

    public m(long j6) {
        this.f9426a = j6;
    }

    @Override // androidx.media3.exoplayer.rtsp.a.InterfaceC0138a
    public a a(int i6) {
        l lVar = new l(this.f9426a);
        l lVar2 = new l(this.f9426a);
        try {
            lVar.r(AbstractC2048h.a(0));
            int d6 = lVar.d();
            boolean z6 = d6 % 2 == 0;
            lVar2.r(AbstractC2048h.a(z6 ? d6 + 1 : d6 - 1));
            if (z6) {
                lVar.f(lVar2);
                return lVar;
            }
            lVar2.f(lVar);
            return lVar2;
        } catch (IOException e6) {
            AbstractC1251i.a(lVar);
            AbstractC1251i.a(lVar2);
            throw e6;
        }
    }

    @Override // androidx.media3.exoplayer.rtsp.a.InterfaceC0138a
    public a.InterfaceC0138a b() {
        return new k(this.f9426a);
    }
}
