package p1;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import c1.AbstractC1112F;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import java.io.IOException;
import java.nio.ByteBuffer;
import p1.k;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class I implements k {

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f18132a;

    /* renamed from: b, reason: collision with root package name */
    public ByteBuffer[] f18133b;

    /* renamed from: c, reason: collision with root package name */
    public ByteBuffer[] f18134c;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b implements k.b {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [p1.I$a] */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v3 */
        @Override // p1.k.b
        public k a(k.a aVar) {
            MediaCodec b6;
            MediaCodec mediaCodec = 0;
            mediaCodec = 0;
            try {
                b6 = b(aVar);
            } catch (IOException e6) {
                e = e6;
            } catch (RuntimeException e7) {
                e = e7;
            }
            try {
                AbstractC1112F.a("configureCodec");
                b6.configure(aVar.f18186b, aVar.f18188d, aVar.f18189e, aVar.f18190f);
                AbstractC1112F.b();
                AbstractC1112F.a("startCodec");
                b6.start();
                AbstractC1112F.b();
                return new I(b6);
            } catch (IOException | RuntimeException e8) {
                e = e8;
                mediaCodec = b6;
                if (mediaCodec != 0) {
                    mediaCodec.release();
                }
                throw e;
            }
        }

        public MediaCodec b(k.a aVar) {
            AbstractC1119a.e(aVar.f18185a);
            String str = aVar.f18185a.f18194a;
            AbstractC1112F.a("createCodec:" + str);
            MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
            AbstractC1112F.b();
            return createByCodecName;
        }
    }

    public static /* synthetic */ void p(I i6, k.d dVar, MediaCodec mediaCodec, long j6, long j7) {
        i6.getClass();
        dVar.a(i6, j6, j7);
    }

    @Override // p1.k
    public void a(Bundle bundle) {
        this.f18132a.setParameters(bundle);
    }

    @Override // p1.k
    public void b(int i6, int i7, f1.c cVar, long j6, int i8) {
        this.f18132a.queueSecureInputBuffer(i6, i7, cVar.a(), j6, i8);
    }

    @Override // p1.k
    public void c(int i6, int i7, int i8, long j6, int i9) {
        this.f18132a.queueInputBuffer(i6, i7, i8, j6, i9);
    }

    @Override // p1.k
    public boolean d() {
        return false;
    }

    @Override // p1.k
    public MediaFormat e() {
        return this.f18132a.getOutputFormat();
    }

    @Override // p1.k
    public void f(int i6, long j6) {
        this.f18132a.releaseOutputBuffer(i6, j6);
    }

    @Override // p1.k
    public void flush() {
        this.f18132a.flush();
    }

    @Override // p1.k
    public int g() {
        return this.f18132a.dequeueInputBuffer(0L);
    }

    @Override // p1.k
    public int i(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f18132a.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3 && AbstractC1117K.f10560a < 21) {
                this.f18134c = this.f18132a.getOutputBuffers();
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // p1.k
    public void j(int i6, boolean z6) {
        this.f18132a.releaseOutputBuffer(i6, z6);
    }

    @Override // p1.k
    public void k(int i6) {
        this.f18132a.setVideoScalingMode(i6);
    }

    @Override // p1.k
    public ByteBuffer l(int i6) {
        return AbstractC1117K.f10560a >= 21 ? this.f18132a.getInputBuffer(i6) : ((ByteBuffer[]) AbstractC1117K.i(this.f18133b))[i6];
    }

    @Override // p1.k
    public void m(Surface surface) {
        this.f18132a.setOutputSurface(surface);
    }

    @Override // p1.k
    public void n(final k.d dVar, Handler handler) {
        this.f18132a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: p1.H
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j6, long j7) {
                I.p(I.this, dVar, mediaCodec, j6, j7);
            }
        }, handler);
    }

    @Override // p1.k
    public ByteBuffer o(int i6) {
        return AbstractC1117K.f10560a >= 21 ? this.f18132a.getOutputBuffer(i6) : ((ByteBuffer[]) AbstractC1117K.i(this.f18134c))[i6];
    }

    @Override // p1.k
    public void release() {
        this.f18133b = null;
        this.f18134c = null;
        try {
            int i6 = AbstractC1117K.f10560a;
            if (i6 >= 30 && i6 < 33) {
                this.f18132a.stop();
            }
        } finally {
            this.f18132a.release();
        }
    }

    public I(MediaCodec mediaCodec) {
        this.f18132a = mediaCodec;
        if (AbstractC1117K.f10560a < 21) {
            this.f18133b = mediaCodec.getInputBuffers();
            this.f18134c = mediaCodec.getOutputBuffers();
        }
    }
}
