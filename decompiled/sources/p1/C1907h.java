package p1;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import java.util.ArrayDeque;
import p1.k;

/* renamed from: p1.h, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1907h extends MediaCodec.Callback {

    /* renamed from: b, reason: collision with root package name */
    public final HandlerThread f18165b;

    /* renamed from: c, reason: collision with root package name */
    public Handler f18166c;

    /* renamed from: h, reason: collision with root package name */
    public MediaFormat f18171h;

    /* renamed from: i, reason: collision with root package name */
    public MediaFormat f18172i;

    /* renamed from: j, reason: collision with root package name */
    public MediaCodec.CodecException f18173j;

    /* renamed from: k, reason: collision with root package name */
    public MediaCodec.CryptoException f18174k;

    /* renamed from: l, reason: collision with root package name */
    public long f18175l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f18176m;

    /* renamed from: n, reason: collision with root package name */
    public IllegalStateException f18177n;

    /* renamed from: o, reason: collision with root package name */
    public k.c f18178o;

    /* renamed from: a, reason: collision with root package name */
    public final Object f18164a = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final j0.e f18167d = new j0.e();

    /* renamed from: e, reason: collision with root package name */
    public final j0.e f18168e = new j0.e();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f18169f = new ArrayDeque();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f18170g = new ArrayDeque();

    public C1907h(HandlerThread handlerThread) {
        this.f18165b = handlerThread;
    }

    public final void b(MediaFormat mediaFormat) {
        this.f18168e.a(-2);
        this.f18170g.add(mediaFormat);
    }

    public int c() {
        synchronized (this.f18164a) {
            try {
                j();
                int i6 = -1;
                if (i()) {
                    return -1;
                }
                if (!this.f18167d.d()) {
                    i6 = this.f18167d.e();
                }
                return i6;
            } finally {
            }
        }
    }

    public int d(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f18164a) {
            try {
                j();
                if (i()) {
                    return -1;
                }
                if (this.f18168e.d()) {
                    return -1;
                }
                int e6 = this.f18168e.e();
                if (e6 >= 0) {
                    AbstractC1119a.i(this.f18171h);
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.f18169f.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (e6 == -2) {
                    this.f18171h = (MediaFormat) this.f18170g.remove();
                }
                return e6;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e() {
        synchronized (this.f18164a) {
            this.f18175l++;
            ((Handler) AbstractC1117K.i(this.f18166c)).post(new Runnable() { // from class: p1.g
                @Override // java.lang.Runnable
                public final void run() {
                    C1907h.this.n();
                }
            });
        }
    }

    public final void f() {
        if (!this.f18170g.isEmpty()) {
            this.f18172i = (MediaFormat) this.f18170g.getLast();
        }
        this.f18167d.b();
        this.f18168e.b();
        this.f18169f.clear();
        this.f18170g.clear();
    }

    public MediaFormat g() {
        MediaFormat mediaFormat;
        synchronized (this.f18164a) {
            try {
                mediaFormat = this.f18171h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    public void h(MediaCodec mediaCodec) {
        AbstractC1119a.g(this.f18166c == null);
        this.f18165b.start();
        Handler handler = new Handler(this.f18165b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f18166c = handler;
    }

    public final boolean i() {
        return this.f18175l > 0 || this.f18176m;
    }

    public final void j() {
        k();
        m();
        l();
    }

    public final void k() {
        IllegalStateException illegalStateException = this.f18177n;
        if (illegalStateException == null) {
            return;
        }
        this.f18177n = null;
        throw illegalStateException;
    }

    public final void l() {
        MediaCodec.CryptoException cryptoException = this.f18174k;
        if (cryptoException == null) {
            return;
        }
        this.f18174k = null;
        throw cryptoException;
    }

    public final void m() {
        MediaCodec.CodecException codecException = this.f18173j;
        if (codecException == null) {
            return;
        }
        this.f18173j = null;
        throw codecException;
    }

    public final void n() {
        synchronized (this.f18164a) {
            try {
                if (this.f18176m) {
                    return;
                }
                long j6 = this.f18175l - 1;
                this.f18175l = j6;
                if (j6 > 0) {
                    return;
                }
                if (j6 < 0) {
                    o(new IllegalStateException());
                } else {
                    f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o(IllegalStateException illegalStateException) {
        synchronized (this.f18164a) {
            this.f18177n = illegalStateException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f18164a) {
            this.f18174k = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f18164a) {
            this.f18173j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i6) {
        synchronized (this.f18164a) {
            try {
                this.f18167d.a(i6);
                k.c cVar = this.f18178o;
                if (cVar != null) {
                    cVar.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i6, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f18164a) {
            try {
                MediaFormat mediaFormat = this.f18172i;
                if (mediaFormat != null) {
                    b(mediaFormat);
                    this.f18172i = null;
                }
                this.f18168e.a(i6);
                this.f18169f.add(bufferInfo);
                k.c cVar = this.f18178o;
                if (cVar != null) {
                    cVar.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f18164a) {
            b(mediaFormat);
            this.f18172i = null;
        }
    }

    public void p(k.c cVar) {
        synchronized (this.f18164a) {
            this.f18178o = cVar;
        }
    }

    public void q() {
        synchronized (this.f18164a) {
            this.f18176m = true;
            this.f18165b.quit();
            f();
        }
    }
}
