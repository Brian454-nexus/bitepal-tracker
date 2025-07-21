package a0;

import F.AbstractC0335i0;
import a0.InterfaceC0991p;
import java.nio.ByteBuffer;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: a0.C, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C0973C implements InterfaceC0991p {

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC0991p f7532g;

    /* renamed from: h, reason: collision with root package name */
    public final int f7533h;

    /* renamed from: i, reason: collision with root package name */
    public final int f7534i;

    /* renamed from: j, reason: collision with root package name */
    public final int f7535j;

    /* renamed from: l, reason: collision with root package name */
    public int f7537l;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f7526a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f7527b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public final Queue f7528c = new ConcurrentLinkedQueue();

    /* renamed from: d, reason: collision with root package name */
    public final Executor f7529d = M.c.g(M.c.a());

    /* renamed from: e, reason: collision with root package name */
    public final Object f7530e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public a f7531f = null;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicBoolean f7536k = new AtomicBoolean(false);

    /* renamed from: a0.C$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f7538a;

        /* renamed from: b, reason: collision with root package name */
        public final int f7539b;

        /* renamed from: c, reason: collision with root package name */
        public final ByteBuffer f7540c;

        /* renamed from: d, reason: collision with root package name */
        public long f7541d;

        public a(ByteBuffer byteBuffer, InterfaceC0991p.c cVar, int i6, int i7) {
            byteBuffer.rewind();
            int limit = byteBuffer.limit() - byteBuffer.position();
            if (limit == cVar.a()) {
                this.f7538a = i6;
                this.f7539b = i7;
                this.f7540c = byteBuffer;
                this.f7541d = cVar.b();
                return;
            }
            throw new IllegalStateException("Byte buffer size is not match with packet info: " + limit + " != " + cVar.a());
        }

        public int a() {
            return this.f7540c.remaining();
        }

        public InterfaceC0991p.c b(ByteBuffer byteBuffer) {
            int remaining;
            long j6 = this.f7541d;
            int position = this.f7540c.position();
            int position2 = byteBuffer.position();
            if (this.f7540c.remaining() > byteBuffer.remaining()) {
                remaining = byteBuffer.remaining();
                this.f7541d += AbstractC0995t.c(AbstractC0995t.f(remaining, this.f7538a), this.f7539b);
                ByteBuffer duplicate = this.f7540c.duplicate();
                duplicate.position(position).limit(position + remaining);
                byteBuffer.put(duplicate).limit(position2 + remaining).position(position2);
            } else {
                remaining = this.f7540c.remaining();
                byteBuffer.put(this.f7540c).limit(position2 + remaining).position(position2);
            }
            this.f7540c.position(position + remaining);
            return InterfaceC0991p.c.c(remaining, j6);
        }
    }

    public C0973C(InterfaceC0991p interfaceC0991p, AbstractC0976a abstractC0976a) {
        this.f7532g = interfaceC0991p;
        int d6 = abstractC0976a.d();
        this.f7533h = d6;
        int f6 = abstractC0976a.f();
        this.f7534i = f6;
        y0.g.b(((long) d6) > 0, "mBytesPerFrame must be greater than 0.");
        y0.g.b(((long) f6) > 0, "mSampleRate must be greater than 0.");
        this.f7535j = 500;
        this.f7537l = d6 * 1024;
    }

    public static /* synthetic */ void b(C0973C c0973c) {
        c0973c.f7536k.set(false);
        c0973c.f7532g.stop();
        synchronized (c0973c.f7530e) {
            c0973c.f7531f = null;
            c0973c.f7528c.clear();
        }
    }

    public static /* synthetic */ void c(C0973C c0973c) {
        c0973c.getClass();
        try {
            c0973c.f7532g.start();
            c0973c.k();
        } catch (InterfaceC0991p.b e6) {
            throw new RuntimeException(e6);
        }
    }

    public static /* synthetic */ void d(C0973C c0973c) {
        c0973c.f7536k.set(false);
        c0973c.f7532g.release();
        synchronized (c0973c.f7530e) {
            c0973c.f7531f = null;
            c0973c.f7528c.clear();
        }
    }

    private void h() {
        y0.g.i(!this.f7527b.get(), "AudioStream has been released.");
    }

    private void i() {
        y0.g.i(this.f7526a.get(), "AudioStream has not been started.");
    }

    @Override // a0.InterfaceC0991p
    public void a(final InterfaceC0991p.a aVar, final Executor executor) {
        boolean z6 = true;
        y0.g.i(!this.f7526a.get(), "AudioStream can not be started when setCallback.");
        h();
        if (aVar != null && executor == null) {
            z6 = false;
        }
        y0.g.b(z6, "executor can't be null with non-null callback.");
        this.f7529d.execute(new Runnable() { // from class: a0.x
            @Override // java.lang.Runnable
            public final void run() {
                C0973C.this.f7532g.a(aVar, executor);
            }
        });
    }

    public final void j() {
        if (this.f7536k.get()) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.f7537l);
            a aVar = new a(allocateDirect, this.f7532g.read(allocateDirect), this.f7533h, this.f7534i);
            int i6 = this.f7535j;
            synchronized (this.f7530e) {
                try {
                    this.f7528c.offer(aVar);
                    while (this.f7528c.size() > i6) {
                        this.f7528c.poll();
                        AbstractC0335i0.l("BufferedAudioStream", "Drop audio data due to full of queue.");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f7536k.get()) {
                this.f7529d.execute(new Runnable() { // from class: a0.A
                    @Override // java.lang.Runnable
                    public final void run() {
                        C0973C.this.j();
                    }
                });
            }
        }
    }

    public final void k() {
        if (this.f7536k.getAndSet(true)) {
            return;
        }
        j();
    }

    public final void l(int i6) {
        int i7 = this.f7537l;
        if (i7 == i6) {
            return;
        }
        int i8 = this.f7533h;
        this.f7537l = (i6 / i8) * i8;
        AbstractC0335i0.a("BufferedAudioStream", "Update buffer size from " + i7 + " to " + this.f7537l);
    }

    public final void m(final int i6) {
        this.f7529d.execute(new Runnable() { // from class: a0.z
            @Override // java.lang.Runnable
            public final void run() {
                C0973C.this.l(i6);
            }
        });
    }

    @Override // a0.InterfaceC0991p
    public InterfaceC0991p.c read(ByteBuffer byteBuffer) {
        boolean z6;
        h();
        i();
        m(byteBuffer.remaining());
        InterfaceC0991p.c c6 = InterfaceC0991p.c.c(0, 0L);
        do {
            synchronized (this.f7530e) {
                try {
                    a aVar = this.f7531f;
                    this.f7531f = null;
                    if (aVar == null) {
                        aVar = (a) this.f7528c.poll();
                    }
                    if (aVar != null) {
                        c6 = aVar.b(byteBuffer);
                        if (aVar.a() > 0) {
                            this.f7531f = aVar;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            z6 = c6.a() <= 0 && this.f7526a.get() && !this.f7527b.get();
            if (z6) {
                try {
                    Thread.sleep(1L);
                } catch (InterruptedException e6) {
                    AbstractC0335i0.m("BufferedAudioStream", "Interruption while waiting for audio data", e6);
                }
            }
        } while (z6);
        return c6;
    }

    @Override // a0.InterfaceC0991p
    public void release() {
        if (this.f7527b.getAndSet(true)) {
            return;
        }
        this.f7529d.execute(new Runnable() { // from class: a0.B
            @Override // java.lang.Runnable
            public final void run() {
                C0973C.d(C0973C.this);
            }
        });
    }

    @Override // a0.InterfaceC0991p
    public void start() {
        h();
        if (this.f7526a.getAndSet(true)) {
            return;
        }
        FutureTask futureTask = new FutureTask(new Runnable() { // from class: a0.y
            @Override // java.lang.Runnable
            public final void run() {
                C0973C.c(C0973C.this);
            }
        }, null);
        this.f7529d.execute(futureTask);
        try {
            futureTask.get();
        } catch (InterruptedException | ExecutionException e6) {
            this.f7526a.set(false);
            throw new InterfaceC0991p.b(e6);
        }
    }

    @Override // a0.InterfaceC0991p
    public void stop() {
        h();
        if (this.f7526a.getAndSet(false)) {
            this.f7529d.execute(new Runnable() { // from class: a0.w
                @Override // java.lang.Runnable
                public final void run() {
                    C0973C.b(C0973C.this);
                }
            });
        }
    }
}
