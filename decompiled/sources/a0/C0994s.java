package a0;

import F.AbstractC0335i0;
import a0.InterfaceC0991p;
import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.media.AudioTimestamp;
import android.os.Build;
import b0.AbstractC1075a;
import c0.AbstractC1104f;
import c0.C1100b;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: a0.s, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C0994s implements InterfaceC0991p {

    /* renamed from: a, reason: collision with root package name */
    public final AudioRecord f7607a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0976a f7608b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f7609c = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f7610d = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference f7611e = new AtomicReference(null);

    /* renamed from: f, reason: collision with root package name */
    public final int f7612f;

    /* renamed from: g, reason: collision with root package name */
    public final int f7613g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC0991p.a f7614h;

    /* renamed from: i, reason: collision with root package name */
    public Executor f7615i;

    /* renamed from: j, reason: collision with root package name */
    public long f7616j;

    /* renamed from: k, reason: collision with root package name */
    public AudioManager.AudioRecordingCallback f7617k;

    /* renamed from: a0.s$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a extends AudioManager.AudioRecordingCallback {
        public a() {
        }

        @Override // android.media.AudioManager.AudioRecordingCallback
        public void onRecordingConfigChanged(List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AudioRecordingConfiguration audioRecordingConfiguration = (AudioRecordingConfiguration) it.next();
                if (b0.b.a(audioRecordingConfiguration) == C0994s.this.f7607a.getAudioSessionId()) {
                    C0994s.this.j(b0.d.b(audioRecordingConfiguration));
                    return;
                }
            }
        }
    }

    public C0994s(AbstractC0976a abstractC0976a, Context context) {
        if (!i(abstractC0976a.f(), abstractC0976a.e(), abstractC0976a.b())) {
            throw new UnsupportedOperationException(String.format("The combination of sample rate %d, channel count %d and audio format %d is not supported.", Integer.valueOf(abstractC0976a.f()), Integer.valueOf(abstractC0976a.e()), Integer.valueOf(abstractC0976a.b())));
        }
        this.f7608b = abstractC0976a;
        this.f7613g = abstractC0976a.d();
        int g6 = g(abstractC0976a.f(), abstractC0976a.e(), abstractC0976a.b());
        y0.g.h(g6 > 0);
        int i6 = g6 * 2;
        this.f7612f = i6;
        int i7 = Build.VERSION.SDK_INT;
        AudioFormat build = new AudioFormat.Builder().setSampleRate(abstractC0976a.f()).setChannelMask(AbstractC0995t.b(abstractC0976a.e())).setEncoding(abstractC0976a.b()).build();
        AudioRecord.Builder b6 = AbstractC1075a.b();
        if (i7 >= 31 && context != null) {
            b0.e.c(b6, context);
        }
        AbstractC1075a.d(b6, abstractC0976a.c());
        AbstractC1075a.c(b6, build);
        AbstractC1075a.e(b6, i6);
        AudioRecord a6 = AbstractC1075a.a(b6);
        this.f7607a = a6;
        if (a6.getState() == 1) {
            return;
        }
        a6.release();
        throw new InterfaceC0991p.b("Unable to initialize AudioRecord");
    }

    public static long e(int i6, long j6, AudioTimestamp audioTimestamp) {
        long c6 = audioTimestamp.nanoTime + AbstractC0995t.c(j6 - audioTimestamp.framePosition, i6);
        if (c6 < 0) {
            return 0L;
        }
        return c6;
    }

    public static int g(int i6, int i7, int i8) {
        return AudioRecord.getMinBufferSize(i6, AbstractC0995t.a(i7), i8);
    }

    public static boolean h() {
        return AbstractC1104f.a(C1100b.class) != null;
    }

    public static boolean i(int i6, int i7, int i8) {
        return i6 > 0 && i7 > 0 && g(i6, i7, i8) > 0;
    }

    @Override // a0.InterfaceC0991p
    public void a(InterfaceC0991p.a aVar, Executor executor) {
        boolean z6 = true;
        y0.g.i(!this.f7610d.get(), "AudioStream can not be started when setCallback.");
        c();
        if (aVar != null && executor == null) {
            z6 = false;
        }
        y0.g.b(z6, "executor can't be null with non-null callback.");
        this.f7614h = aVar;
        this.f7615i = executor;
        if (Build.VERSION.SDK_INT >= 29) {
            AudioManager.AudioRecordingCallback audioRecordingCallback = this.f7617k;
            if (audioRecordingCallback != null) {
                b0.d.d(this.f7607a, audioRecordingCallback);
            }
            if (aVar == null) {
                return;
            }
            if (this.f7617k == null) {
                this.f7617k = new a();
            }
            b0.d.c(this.f7607a, executor, this.f7617k);
        }
    }

    public final void c() {
        y0.g.i(!this.f7609c.get(), "AudioStream has been released.");
    }

    public final void d() {
        y0.g.i(this.f7610d.get(), "AudioStream has not been started.");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long f() {
        /*
            r6 = this;
            boolean r0 = h()
            r1 = -1
            if (r0 != 0) goto L2a
            android.media.AudioTimestamp r0 = new android.media.AudioTimestamp
            r0.<init>()
            android.media.AudioRecord r3 = r6.f7607a
            r4 = 0
            int r3 = b0.b.b(r3, r0, r4)
            if (r3 != 0) goto L23
            a0.a r3 = r6.f7608b
            int r3 = r3.f()
            long r4 = r6.f7616j
            long r3 = e(r3, r4, r0)
            goto L2b
        L23:
            java.lang.String r0 = "AudioStreamImpl"
            java.lang.String r3 = "Unable to get audio timestamp"
            F.AbstractC0335i0.l(r0, r3)
        L2a:
            r3 = r1
        L2b:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L34
            long r0 = java.lang.System.nanoTime()
            return r0
        L34:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.C0994s.f():long");
    }

    public void j(final boolean z6) {
        Executor executor = this.f7615i;
        final InterfaceC0991p.a aVar = this.f7614h;
        if (executor == null || aVar == null || Objects.equals(this.f7611e.getAndSet(Boolean.valueOf(z6)), Boolean.valueOf(z6))) {
            return;
        }
        executor.execute(new Runnable() { // from class: a0.r
            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC0991p.a.this.a(z6);
            }
        });
    }

    @Override // a0.InterfaceC0991p
    public InterfaceC0991p.c read(ByteBuffer byteBuffer) {
        long j6;
        c();
        d();
        int read = this.f7607a.read(byteBuffer, this.f7612f);
        if (read > 0) {
            byteBuffer.limit(read);
            j6 = f();
            this.f7616j += AbstractC0995t.f(read, this.f7613g);
        } else {
            j6 = 0;
        }
        return InterfaceC0991p.c.c(read, j6);
    }

    @Override // a0.InterfaceC0991p
    public void release() {
        AudioManager.AudioRecordingCallback audioRecordingCallback;
        if (this.f7609c.getAndSet(true)) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 29 && (audioRecordingCallback = this.f7617k) != null) {
            b0.d.d(this.f7607a, audioRecordingCallback);
        }
        this.f7607a.release();
    }

    @Override // a0.InterfaceC0991p
    public void start() {
        c();
        if (this.f7610d.getAndSet(true)) {
            return;
        }
        this.f7607a.startRecording();
        boolean z6 = false;
        if (this.f7607a.getRecordingState() != 3) {
            this.f7610d.set(false);
            throw new InterfaceC0991p.b("Unable to start AudioRecord with state: " + this.f7607a.getRecordingState());
        }
        this.f7616j = 0L;
        this.f7611e.set(null);
        if (Build.VERSION.SDK_INT >= 29) {
            AudioRecordingConfiguration a6 = b0.d.a(this.f7607a);
            z6 = a6 != null && b0.d.b(a6);
        }
        j(z6);
    }

    @Override // a0.InterfaceC0991p
    public void stop() {
        c();
        if (this.f7610d.getAndSet(false)) {
            this.f7607a.stop();
            if (this.f7607a.getRecordingState() != 1) {
                AbstractC0335i0.l("AudioStreamImpl", "Failed to stop AudioRecord with state: " + this.f7607a.getRecordingState());
            }
        }
    }
}
