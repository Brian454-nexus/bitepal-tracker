package androidx.media3.exoplayer.rtsp;

import android.net.Uri;
import androidx.media3.exoplayer.rtsp.g;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import e1.AbstractC1244b;
import e1.C1252j;
import java.util.Arrays;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class j extends AbstractC1244b implements a, g.b {

    /* renamed from: e, reason: collision with root package name */
    public final LinkedBlockingQueue f9419e;

    /* renamed from: f, reason: collision with root package name */
    public final long f9420f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f9421g;

    /* renamed from: h, reason: collision with root package name */
    public int f9422h;

    public j(long j6) {
        super(true);
        this.f9420f = j6;
        this.f9419e = new LinkedBlockingQueue();
        this.f9421g = new byte[0];
        this.f9422h = -1;
    }

    @Override // androidx.media3.exoplayer.rtsp.a
    public String b() {
        AbstractC1119a.g(this.f9422h != -1);
        return AbstractC1117K.H("RTP/AVP/TCP;unicast;interleaved=%d-%d", Integer.valueOf(this.f9422h), Integer.valueOf(this.f9422h + 1));
    }

    @Override // e1.InterfaceC1248f
    public void close() {
    }

    @Override // androidx.media3.exoplayer.rtsp.a
    public int d() {
        return this.f9422h;
    }

    @Override // androidx.media3.exoplayer.rtsp.a
    public boolean e() {
        return false;
    }

    @Override // androidx.media3.exoplayer.rtsp.g.b
    public void f(byte[] bArr) {
        this.f9419e.add(bArr);
    }

    @Override // e1.InterfaceC1248f
    public Uri getUri() {
        return null;
    }

    @Override // androidx.media3.exoplayer.rtsp.a
    public g.b i() {
        return this;
    }

    @Override // e1.InterfaceC1248f
    public long r(C1252j c1252j) {
        this.f9422h = c1252j.f13820a.getPort();
        return -1L;
    }

    @Override // Z0.InterfaceC0837i
    public int read(byte[] bArr, int i6, int i7) {
        if (i7 == 0) {
            return 0;
        }
        int min = Math.min(i7, this.f9421g.length);
        System.arraycopy(this.f9421g, 0, bArr, i6, min);
        byte[] bArr2 = this.f9421g;
        this.f9421g = Arrays.copyOfRange(bArr2, min, bArr2.length);
        if (min == i7) {
            return min;
        }
        try {
            byte[] bArr3 = (byte[]) this.f9419e.poll(this.f9420f, TimeUnit.MILLISECONDS);
            if (bArr3 == null) {
                return -1;
            }
            int min2 = Math.min(i7 - min, bArr3.length);
            System.arraycopy(bArr3, 0, bArr, i6 + min, min2);
            if (min2 < bArr3.length) {
                this.f9421g = Arrays.copyOfRange(bArr3, min2, bArr3.length);
            }
            return min + min2;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return -1;
        }
    }
}
