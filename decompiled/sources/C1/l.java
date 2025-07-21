package C1;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import c1.AbstractC1119a;
import c1.AbstractC1128j;
import c1.AbstractC1133o;
import c1.RunnableC1127i;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class l extends Surface {

    /* renamed from: d, reason: collision with root package name */
    public static int f574d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f575e;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f576a;

    /* renamed from: b, reason: collision with root package name */
    public final b f577b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f578c;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b extends HandlerThread implements Handler.Callback {

        /* renamed from: a, reason: collision with root package name */
        public RunnableC1127i f579a;

        /* renamed from: b, reason: collision with root package name */
        public Handler f580b;

        /* renamed from: c, reason: collision with root package name */
        public Error f581c;

        /* renamed from: d, reason: collision with root package name */
        public RuntimeException f582d;

        /* renamed from: e, reason: collision with root package name */
        public l f583e;

        public b() {
            super("ExoPlayer:PlaceholderSurface");
        }

        public l a(int i6) {
            boolean z6;
            start();
            this.f580b = new Handler(getLooper(), this);
            this.f579a = new RunnableC1127i(this.f580b);
            synchronized (this) {
                z6 = false;
                this.f580b.obtainMessage(1, i6, 0).sendToTarget();
                while (this.f583e == null && this.f582d == null && this.f581c == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z6 = true;
                    }
                }
            }
            if (z6) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.f582d;
            if (runtimeException != null) {
                throw runtimeException;
            }
            Error error = this.f581c;
            if (error == null) {
                return (l) AbstractC1119a.e(this.f583e);
            }
            throw error;
        }

        public final void b(int i6) {
            AbstractC1119a.e(this.f579a);
            this.f579a.h(i6);
            this.f583e = new l(this, this.f579a.g(), i6 != 0);
        }

        public void c() {
            AbstractC1119a.e(this.f580b);
            this.f580b.sendEmptyMessage(2);
        }

        public final void d() {
            AbstractC1119a.e(this.f579a);
            this.f579a.i();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i6 = message.what;
            try {
                if (i6 != 1) {
                    if (i6 != 2) {
                        return true;
                    }
                    try {
                        d();
                    } finally {
                        try {
                            return true;
                        } finally {
                        }
                    }
                    return true;
                }
                try {
                    b(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (AbstractC1128j.a e6) {
                    AbstractC1133o.d("PlaceholderSurface", "Failed to initialize placeholder surface", e6);
                    this.f582d = new IllegalStateException(e6);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e7) {
                    AbstractC1133o.d("PlaceholderSurface", "Failed to initialize placeholder surface", e7);
                    this.f581c = e7;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e8) {
                    AbstractC1133o.d("PlaceholderSurface", "Failed to initialize placeholder surface", e8);
                    this.f582d = e8;
                    synchronized (this) {
                        notify();
                    }
                }
                return true;
            } catch (Throwable th) {
                synchronized (this) {
                    notify();
                    throw th;
                }
            }
        }
    }

    public static int a(Context context) {
        if (AbstractC1128j.d(context)) {
            return AbstractC1128j.e() ? 1 : 2;
        }
        return 0;
    }

    public static synchronized boolean c(Context context) {
        boolean z6;
        synchronized (l.class) {
            try {
                if (!f575e) {
                    f574d = a(context);
                    f575e = true;
                }
                z6 = f574d != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z6;
    }

    public static l d(Context context, boolean z6) {
        AbstractC1119a.g(!z6 || c(context));
        return new b().a(z6 ? f574d : 0);
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.f577b) {
            try {
                if (!this.f578c) {
                    this.f577b.c();
                    this.f578c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public l(b bVar, SurfaceTexture surfaceTexture, boolean z6) {
        super(surfaceTexture);
        this.f577b = bVar;
        this.f576a = z6;
    }
}
