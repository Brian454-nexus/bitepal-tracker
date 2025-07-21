package W0;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.SystemClock;
import android.text.format.DateUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import v0.m;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class a extends b {

    /* renamed from: i, reason: collision with root package name */
    public Executor f5371i;

    /* renamed from: j, reason: collision with root package name */
    public volatile RunnableC0094a f5372j;

    /* renamed from: k, reason: collision with root package name */
    public volatile RunnableC0094a f5373k;

    /* renamed from: l, reason: collision with root package name */
    public long f5374l;

    /* renamed from: m, reason: collision with root package name */
    public long f5375m;

    /* renamed from: n, reason: collision with root package name */
    public Handler f5376n;

    /* renamed from: W0.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public final class RunnableC0094a extends c implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        public boolean f5377f;

        public RunnableC0094a() {
        }

        @Override // W0.c
        public Object b() {
            try {
                return a.this.E();
            } catch (m e6) {
                if (f()) {
                    return null;
                }
                throw e6;
            }
        }

        @Override // W0.c
        public void g(Object obj) {
            a.this.y(this, obj);
        }

        @Override // W0.c
        public void h(Object obj) {
            a.this.z(this, obj);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5377f = false;
            a.this.A();
        }
    }

    public a(Context context) {
        super(context);
        this.f5375m = -10000L;
    }

    public void A() {
        if (this.f5373k != null || this.f5372j == null) {
            return;
        }
        if (this.f5372j.f5377f) {
            this.f5372j.f5377f = false;
            this.f5376n.removeCallbacks(this.f5372j);
        }
        if (this.f5374l > 0 && SystemClock.uptimeMillis() < this.f5375m + this.f5374l) {
            this.f5372j.f5377f = true;
            this.f5376n.postAtTime(this.f5372j, this.f5375m + this.f5374l);
        } else {
            if (this.f5371i == null) {
                this.f5371i = B();
            }
            this.f5372j.c(this.f5371i);
        }
    }

    public Executor B() {
        return AsyncTask.THREAD_POOL_EXECUTOR;
    }

    public abstract Object C();

    public void D(Object obj) {
    }

    public Object E() {
        return C();
    }

    @Override // W0.b
    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2;
        super.g(str, fileDescriptor, printWriter, strArr);
        if (this.f5372j != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f5372j);
            printWriter.print(" waiting=");
            printWriter.println(this.f5372j.f5377f);
        }
        if (this.f5373k != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f5373k);
            printWriter.print(" waiting=");
            printWriter.println(this.f5373k.f5377f);
        }
        if (this.f5374l != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            printWriter.print(DateUtils.formatElapsedTime(timeUnit.toSeconds(this.f5374l)));
            printWriter.print(" mLastLoadCompleteTime=");
            if (this.f5375m == -10000) {
                str2 = "--";
            } else {
                str2 = "-" + DateUtils.formatElapsedTime(timeUnit.toSeconds(SystemClock.uptimeMillis() - this.f5375m));
            }
            printWriter.print(str2);
            printWriter.println();
        }
    }

    @Override // W0.b
    public boolean l() {
        if (this.f5372j == null) {
            return false;
        }
        if (!j()) {
            m();
        }
        if (this.f5373k != null) {
            if (this.f5372j.f5377f) {
                this.f5372j.f5377f = false;
                this.f5376n.removeCallbacks(this.f5372j);
            }
            this.f5372j = null;
            return false;
        }
        if (this.f5372j.f5377f) {
            this.f5372j.f5377f = false;
            this.f5376n.removeCallbacks(this.f5372j);
            this.f5372j = null;
            return false;
        }
        boolean a6 = this.f5372j.a(false);
        if (a6) {
            this.f5373k = this.f5372j;
            x();
        }
        this.f5372j = null;
        return a6;
    }

    @Override // W0.b
    public void n() {
        super.n();
        b();
        this.f5372j = new RunnableC0094a();
        A();
    }

    public void x() {
    }

    public void y(RunnableC0094a runnableC0094a, Object obj) {
        D(obj);
        if (this.f5373k == runnableC0094a) {
            t();
            this.f5375m = SystemClock.uptimeMillis();
            this.f5373k = null;
            e();
            A();
        }
    }

    public void z(RunnableC0094a runnableC0094a, Object obj) {
        if (this.f5372j != runnableC0094a) {
            y(runnableC0094a, obj);
            return;
        }
        if (i()) {
            D(obj);
            return;
        }
        c();
        this.f5375m = SystemClock.uptimeMillis();
        this.f5372j = null;
        f(obj);
    }
}
