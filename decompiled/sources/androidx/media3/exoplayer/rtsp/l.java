package androidx.media3.exoplayer.rtsp;

import android.net.Uri;
import androidx.media3.exoplayer.rtsp.g;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import e1.C1252j;
import e1.C1267y;
import e1.InterfaceC1266x;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class l implements a {

    /* renamed from: a, reason: collision with root package name */
    public final C1267y f9424a;

    /* renamed from: b, reason: collision with root package name */
    public l f9425b;

    public l(long j6) {
        this.f9424a = new C1267y(2000, C6.g.d(j6));
    }

    @Override // androidx.media3.exoplayer.rtsp.a
    public String b() {
        int d6 = d();
        AbstractC1119a.g(d6 != -1);
        return AbstractC1117K.H("RTP/AVP;unicast;client_port=%d-%d", Integer.valueOf(d6), Integer.valueOf(d6 + 1));
    }

    @Override // e1.InterfaceC1248f
    public void close() {
        this.f9424a.close();
        l lVar = this.f9425b;
        if (lVar != null) {
            lVar.close();
        }
    }

    @Override // androidx.media3.exoplayer.rtsp.a
    public int d() {
        int d6 = this.f9424a.d();
        if (d6 == -1) {
            return -1;
        }
        return d6;
    }

    @Override // androidx.media3.exoplayer.rtsp.a
    public boolean e() {
        return true;
    }

    public void f(l lVar) {
        AbstractC1119a.a(this != lVar);
        this.f9425b = lVar;
    }

    @Override // e1.InterfaceC1248f
    public Uri getUri() {
        return this.f9424a.getUri();
    }

    @Override // androidx.media3.exoplayer.rtsp.a
    public g.b i() {
        return null;
    }

    @Override // e1.InterfaceC1248f
    public void l(InterfaceC1266x interfaceC1266x) {
        this.f9424a.l(interfaceC1266x);
    }

    @Override // e1.InterfaceC1248f
    public long r(C1252j c1252j) {
        return this.f9424a.r(c1252j);
    }

    @Override // Z0.InterfaceC0837i
    public int read(byte[] bArr, int i6, int i7) {
        try {
            return this.f9424a.read(bArr, i6, i7);
        } catch (C1267y.a e6) {
            if (e6.f13813a == 2002) {
                return -1;
            }
            throw e6;
        }
    }
}
