package a0;

import F.AbstractC0335i0;
import a0.InterfaceC0991p;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: a0.E, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C0975E implements InterfaceC0991p {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f7543a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f7544b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public final int f7545c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7546d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f7547e;

    /* renamed from: f, reason: collision with root package name */
    public long f7548f;

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC0991p.a f7549g;

    /* renamed from: h, reason: collision with root package name */
    public Executor f7550h;

    public C0975E(AbstractC0976a abstractC0976a) {
        this.f7545c = abstractC0976a.d();
        this.f7546d = abstractC0976a.f();
    }

    public static void c(long j6) {
        long f6 = j6 - f();
        if (f6 > 0) {
            try {
                Thread.sleep(TimeUnit.NANOSECONDS.toMillis(f6));
            } catch (InterruptedException e6) {
                AbstractC0335i0.m("SilentAudioStream", "Ignore interruption", e6);
            }
        }
    }

    private void d() {
        y0.g.i(!this.f7544b.get(), "AudioStream has been released.");
    }

    private void e() {
        y0.g.i(this.f7543a.get(), "AudioStream has not been started.");
    }

    public static long f() {
        return System.nanoTime();
    }

    @Override // a0.InterfaceC0991p
    public void a(InterfaceC0991p.a aVar, Executor executor) {
        boolean z6 = true;
        y0.g.i(!this.f7543a.get(), "AudioStream can not be started when setCallback.");
        d();
        if (aVar != null && executor == null) {
            z6 = false;
        }
        y0.g.b(z6, "executor can't be null with non-null callback.");
        this.f7549g = aVar;
        this.f7550h = executor;
    }

    public final void g() {
        final InterfaceC0991p.a aVar = this.f7549g;
        Executor executor = this.f7550h;
        if (aVar == null || executor == null) {
            return;
        }
        executor.execute(new Runnable() { // from class: a0.D
            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC0991p.a.this.a(true);
            }
        });
    }

    public final void h(ByteBuffer byteBuffer, int i6) {
        y0.g.h(i6 <= byteBuffer.remaining());
        byte[] bArr = this.f7547e;
        if (bArr == null || bArr.length < i6) {
            this.f7547e = new byte[i6];
        }
        int position = byteBuffer.position();
        byteBuffer.put(this.f7547e, 0, i6).limit(i6 + position).position(position);
    }

    @Override // a0.InterfaceC0991p
    public InterfaceC0991p.c read(ByteBuffer byteBuffer) {
        d();
        e();
        long f6 = AbstractC0995t.f(byteBuffer.remaining(), this.f7545c);
        int d6 = (int) AbstractC0995t.d(f6, this.f7545c);
        if (d6 <= 0) {
            return InterfaceC0991p.c.c(0, this.f7548f);
        }
        long c6 = this.f7548f + AbstractC0995t.c(f6, this.f7546d);
        c(c6);
        h(byteBuffer, d6);
        InterfaceC0991p.c c7 = InterfaceC0991p.c.c(d6, this.f7548f);
        this.f7548f = c6;
        return c7;
    }

    @Override // a0.InterfaceC0991p
    public void release() {
        this.f7544b.getAndSet(true);
    }

    @Override // a0.InterfaceC0991p
    public void start() {
        d();
        if (this.f7543a.getAndSet(true)) {
            return;
        }
        this.f7548f = f();
        g();
    }

    @Override // a0.InterfaceC0991p
    public void stop() {
        d();
        this.f7543a.set(false);
    }
}
