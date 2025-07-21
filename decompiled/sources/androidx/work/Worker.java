package androidx.work;

import D6.g;
import W2.f;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.c;
import h3.C1461c;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class Worker extends c {

    /* renamed from: e, reason: collision with root package name */
    public C1461c f10212e;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Worker.this.f10212e.p(Worker.this.p());
            } catch (Throwable th) {
                Worker.this.f10212e.q(th);
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C1461c f10214a;

        public b(C1461c c1461c) {
            this.f10214a = c1461c;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f10214a.p(Worker.this.q());
            } catch (Throwable th) {
                this.f10214a.q(th);
            }
        }
    }

    public Worker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.c
    public g d() {
        C1461c t6 = C1461c.t();
        b().execute(new b(t6));
        return t6;
    }

    @Override // androidx.work.c
    public final g n() {
        this.f10212e = C1461c.t();
        b().execute(new a());
        return this.f10212e;
    }

    public abstract c.a p();

    public f q() {
        throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo()`");
    }
}
