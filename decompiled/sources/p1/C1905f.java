package p1;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import c1.C1124f;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: p1.f, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C1905f implements l {

    /* renamed from: g, reason: collision with root package name */
    public static final ArrayDeque f18148g = new ArrayDeque();

    /* renamed from: h, reason: collision with root package name */
    public static final Object f18149h = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f18150a;

    /* renamed from: b, reason: collision with root package name */
    public final HandlerThread f18151b;

    /* renamed from: c, reason: collision with root package name */
    public Handler f18152c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f18153d;

    /* renamed from: e, reason: collision with root package name */
    public final C1124f f18154e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f18155f;

    /* renamed from: p1.f$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            C1905f.this.j(message);
        }
    }

    /* renamed from: p1.f$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f18157a;

        /* renamed from: b, reason: collision with root package name */
        public int f18158b;

        /* renamed from: c, reason: collision with root package name */
        public int f18159c;

        /* renamed from: d, reason: collision with root package name */
        public final MediaCodec.CryptoInfo f18160d = new MediaCodec.CryptoInfo();

        /* renamed from: e, reason: collision with root package name */
        public long f18161e;

        /* renamed from: f, reason: collision with root package name */
        public int f18162f;

        public void a(int i6, int i7, int i8, long j6, int i9) {
            this.f18157a = i6;
            this.f18158b = i7;
            this.f18159c = i8;
            this.f18161e = j6;
            this.f18162f = i9;
        }
    }

    public C1905f(MediaCodec mediaCodec, HandlerThread handlerThread) {
        this(mediaCodec, handlerThread, new C1124f());
    }

    public static void g(f1.c cVar, MediaCodec.CryptoInfo cryptoInfo) {
        cryptoInfo.numSubSamples = cVar.f13996f;
        cryptoInfo.numBytesOfClearData = i(cVar.f13994d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = i(cVar.f13995e, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) AbstractC1119a.e(h(cVar.f13992b, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) AbstractC1119a.e(h(cVar.f13991a, cryptoInfo.iv));
        cryptoInfo.mode = cVar.f13993c;
        if (AbstractC1117K.f10560a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(cVar.f13997g, cVar.f13998h));
        }
    }

    public static byte[] h(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < bArr.length) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static int[] i(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < iArr.length) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    public static b o() {
        ArrayDeque arrayDeque = f18148g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new b();
                }
                return (b) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void p(b bVar) {
        ArrayDeque arrayDeque = f18148g;
        synchronized (arrayDeque) {
            arrayDeque.add(bVar);
        }
    }

    @Override // p1.l
    public void a(Bundle bundle) {
        d();
        ((Handler) AbstractC1117K.i(this.f18152c)).obtainMessage(4, bundle).sendToTarget();
    }

    @Override // p1.l
    public void b(int i6, int i7, f1.c cVar, long j6, int i8) {
        d();
        b o6 = o();
        o6.a(i6, i7, 0, j6, i8);
        g(cVar, o6.f18160d);
        ((Handler) AbstractC1117K.i(this.f18152c)).obtainMessage(2, o6).sendToTarget();
    }

    @Override // p1.l
    public void c(int i6, int i7, int i8, long j6, int i9) {
        d();
        b o6 = o();
        o6.a(i6, i7, i8, j6, i9);
        ((Handler) AbstractC1117K.i(this.f18152c)).obtainMessage(1, o6).sendToTarget();
    }

    @Override // p1.l
    public void d() {
        RuntimeException runtimeException = (RuntimeException) this.f18153d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    public final void f() {
        this.f18154e.c();
        ((Handler) AbstractC1119a.e(this.f18152c)).obtainMessage(3).sendToTarget();
        this.f18154e.a();
    }

    @Override // p1.l
    public void flush() {
        if (this.f18155f) {
            try {
                n();
            } catch (InterruptedException e6) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e6);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(android.os.Message r9) {
        /*
            r8 = this;
            int r2 = r9.what
            r3 = 1
            if (r2 == r3) goto L43
            r3 = 2
            if (r2 == r3) goto L2e
            r3 = 3
            r4 = 0
            if (r2 == r3) goto L28
            r3 = 4
            if (r2 == r3) goto L20
            java.util.concurrent.atomic.AtomicReference r2 = r8.f18153d
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            int r1 = r9.what
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r3.<init>(r1)
            p1.AbstractC1904e.a(r2, r4, r3)
            goto L57
        L20:
            java.lang.Object r1 = r9.obj
            android.os.Bundle r1 = (android.os.Bundle) r1
            r8.m(r1)
            goto L57
        L28:
            c1.f r1 = r8.f18154e
            r1.e()
            goto L57
        L2e:
            java.lang.Object r1 = r9.obj
            r7 = r1
            p1.f$b r7 = (p1.C1905f.b) r7
            int r1 = r7.f18157a
            int r2 = r7.f18158b
            android.media.MediaCodec$CryptoInfo r3 = r7.f18160d
            long r4 = r7.f18161e
            int r6 = r7.f18162f
            r0 = r8
            r0.l(r1, r2, r3, r4, r6)
        L41:
            r4 = r7
            goto L57
        L43:
            java.lang.Object r0 = r9.obj
            r7 = r0
            p1.f$b r7 = (p1.C1905f.b) r7
            int r1 = r7.f18157a
            int r2 = r7.f18158b
            int r3 = r7.f18159c
            long r4 = r7.f18161e
            int r6 = r7.f18162f
            r0 = r8
            r0.k(r1, r2, r3, r4, r6)
            goto L41
        L57:
            if (r4 == 0) goto L5c
            p(r4)
        L5c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.C1905f.j(android.os.Message):void");
    }

    public final void k(int i6, int i7, int i8, long j6, int i9) {
        try {
            this.f18150a.queueInputBuffer(i6, i7, i8, j6, i9);
        } catch (RuntimeException e6) {
            AbstractC1904e.a(this.f18153d, null, e6);
        }
    }

    public final void l(int i6, int i7, MediaCodec.CryptoInfo cryptoInfo, long j6, int i8) {
        try {
            synchronized (f18149h) {
                this.f18150a.queueSecureInputBuffer(i6, i7, cryptoInfo, j6, i8);
            }
        } catch (RuntimeException e6) {
            AbstractC1904e.a(this.f18153d, null, e6);
        }
    }

    public final void m(Bundle bundle) {
        try {
            this.f18150a.setParameters(bundle);
        } catch (RuntimeException e6) {
            AbstractC1904e.a(this.f18153d, null, e6);
        }
    }

    public final void n() {
        ((Handler) AbstractC1119a.e(this.f18152c)).removeCallbacksAndMessages(null);
        f();
    }

    @Override // p1.l
    public void shutdown() {
        if (this.f18155f) {
            flush();
            this.f18151b.quit();
        }
        this.f18155f = false;
    }

    @Override // p1.l
    public void start() {
        if (this.f18155f) {
            return;
        }
        this.f18151b.start();
        this.f18152c = new a(this.f18151b.getLooper());
        this.f18155f = true;
    }

    public C1905f(MediaCodec mediaCodec, HandlerThread handlerThread, C1124f c1124f) {
        this.f18150a = mediaCodec;
        this.f18151b = handlerThread;
        this.f18154e = c1124f;
        this.f18153d = new AtomicReference();
    }
}
