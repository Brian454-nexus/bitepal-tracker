package p1;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import c1.AbstractC1112F;
import c1.AbstractC1117K;
import java.nio.ByteBuffer;
import p1.C1901b;
import p1.k;

/* renamed from: p1.b, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1901b implements k {

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f18138a;

    /* renamed from: b, reason: collision with root package name */
    public final C1907h f18139b;

    /* renamed from: c, reason: collision with root package name */
    public final l f18140c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f18141d;

    /* renamed from: e, reason: collision with root package name */
    public int f18142e;

    /* renamed from: p1.b$b, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class C0233b implements k.b {

        /* renamed from: a, reason: collision with root package name */
        public final y6.u f18143a;

        /* renamed from: b, reason: collision with root package name */
        public final y6.u f18144b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f18145c;

        public C0233b(final int i6) {
            this(new y6.u() { // from class: p1.c
                public final Object get() {
                    return C1901b.C0233b.c(i6);
                }
            }, new y6.u() { // from class: p1.d
                public final Object get() {
                    return C1901b.C0233b.b(i6);
                }
            });
        }

        public static /* synthetic */ HandlerThread b(int i6) {
            return new HandlerThread(C1901b.u(i6));
        }

        public static /* synthetic */ HandlerThread c(int i6) {
            return new HandlerThread(C1901b.t(i6));
        }

        public static boolean f(Z0.q qVar) {
            int i6 = AbstractC1117K.f10560a;
            if (i6 < 34) {
                return false;
            }
            return i6 >= 35 || Z0.y.s(qVar.f6990n);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [p1.b$a] */
        /* JADX WARN: Type inference failed for: r1v1, types: [p1.b] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v4 */
        @Override // p1.k.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public C1901b a(k.a aVar) {
            MediaCodec mediaCodec;
            l c1905f;
            String str = aVar.f18185a.f18194a;
            ?? r12 = 0;
            r12 = 0;
            try {
                AbstractC1112F.a("createCodec:" + str);
                mediaCodec = MediaCodec.createByCodecName(str);
                try {
                    int i6 = aVar.f18190f;
                    if (this.f18145c && f(aVar.f18187c)) {
                        c1905f = new J(mediaCodec);
                        i6 |= 4;
                    } else {
                        c1905f = new C1905f(mediaCodec, (HandlerThread) this.f18144b.get());
                    }
                    C1901b c1901b = new C1901b(mediaCodec, (HandlerThread) this.f18143a.get(), c1905f);
                    try {
                        AbstractC1112F.b();
                        c1901b.w(aVar.f18186b, aVar.f18188d, aVar.f18189e, i6);
                        return c1901b;
                    } catch (Exception e6) {
                        e = e6;
                        r12 = c1901b;
                        if (r12 != 0) {
                            r12.release();
                        } else if (mediaCodec != null) {
                            mediaCodec.release();
                        }
                        throw e;
                    }
                } catch (Exception e7) {
                    e = e7;
                }
            } catch (Exception e8) {
                e = e8;
                mediaCodec = null;
            }
        }

        public void e(boolean z6) {
            this.f18145c = z6;
        }

        public C0233b(y6.u uVar, y6.u uVar2) {
            this.f18143a = uVar;
            this.f18144b = uVar2;
            this.f18145c = true;
        }
    }

    public static /* synthetic */ void p(C1901b c1901b, k.d dVar, MediaCodec mediaCodec, long j6, long j7) {
        c1901b.getClass();
        dVar.a(c1901b, j6, j7);
    }

    public static String t(int i6) {
        return v(i6, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    public static String u(int i6) {
        return v(i6, "ExoPlayer:MediaCodecQueueingThread:");
    }

    public static String v(int i6, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i6 == 1) {
            sb.append("Audio");
        } else if (i6 == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i6);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // p1.k
    public void a(Bundle bundle) {
        this.f18140c.a(bundle);
    }

    @Override // p1.k
    public void b(int i6, int i7, f1.c cVar, long j6, int i8) {
        this.f18140c.b(i6, i7, cVar, j6, i8);
    }

    @Override // p1.k
    public void c(int i6, int i7, int i8, long j6, int i9) {
        this.f18140c.c(i6, i7, i8, j6, i9);
    }

    @Override // p1.k
    public boolean d() {
        return false;
    }

    @Override // p1.k
    public MediaFormat e() {
        return this.f18139b.g();
    }

    @Override // p1.k
    public void f(int i6, long j6) {
        this.f18138a.releaseOutputBuffer(i6, j6);
    }

    @Override // p1.k
    public void flush() {
        this.f18140c.flush();
        this.f18138a.flush();
        this.f18139b.e();
        this.f18138a.start();
    }

    @Override // p1.k
    public int g() {
        this.f18140c.d();
        return this.f18139b.c();
    }

    @Override // p1.k
    public boolean h(k.c cVar) {
        this.f18139b.p(cVar);
        return true;
    }

    @Override // p1.k
    public int i(MediaCodec.BufferInfo bufferInfo) {
        this.f18140c.d();
        return this.f18139b.d(bufferInfo);
    }

    @Override // p1.k
    public void j(int i6, boolean z6) {
        this.f18138a.releaseOutputBuffer(i6, z6);
    }

    @Override // p1.k
    public void k(int i6) {
        this.f18138a.setVideoScalingMode(i6);
    }

    @Override // p1.k
    public ByteBuffer l(int i6) {
        return this.f18138a.getInputBuffer(i6);
    }

    @Override // p1.k
    public void m(Surface surface) {
        this.f18138a.setOutputSurface(surface);
    }

    @Override // p1.k
    public void n(final k.d dVar, Handler handler) {
        this.f18138a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: p1.a
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j6, long j7) {
                C1901b.p(C1901b.this, dVar, mediaCodec, j6, j7);
            }
        }, handler);
    }

    @Override // p1.k
    public ByteBuffer o(int i6) {
        return this.f18138a.getOutputBuffer(i6);
    }

    @Override // p1.k
    public void release() {
        try {
            if (this.f18142e == 1) {
                this.f18140c.shutdown();
                this.f18139b.q();
            }
            this.f18142e = 2;
            if (this.f18141d) {
                return;
            }
            try {
                int i6 = AbstractC1117K.f10560a;
                if (i6 >= 30 && i6 < 33) {
                    this.f18138a.stop();
                }
            } finally {
            }
        } catch (Throwable th) {
            if (!this.f18141d) {
                try {
                    int i7 = AbstractC1117K.f10560a;
                    if (i7 >= 30 && i7 < 33) {
                        this.f18138a.stop();
                    }
                } finally {
                }
            }
            throw th;
        }
    }

    public final void w(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i6) {
        this.f18139b.h(this.f18138a);
        AbstractC1112F.a("configureCodec");
        this.f18138a.configure(mediaFormat, surface, mediaCrypto, i6);
        AbstractC1112F.b();
        this.f18140c.start();
        AbstractC1112F.a("startCodec");
        this.f18138a.start();
        AbstractC1112F.b();
        this.f18142e = 1;
    }

    public C1901b(MediaCodec mediaCodec, HandlerThread handlerThread, l lVar) {
        this.f18138a = mediaCodec;
        this.f18139b = new C1907h(handlerThread);
        this.f18140c = lVar;
        this.f18142e = 0;
    }
}
