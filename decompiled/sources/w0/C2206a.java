package w0;

import android.graphics.Typeface;
import java.util.concurrent.Executor;
import w0.i;
import w0.j;

/* renamed from: w0.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C2206a {

    /* renamed from: a, reason: collision with root package name */
    public final j.c f19680a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f19681b;

    /* renamed from: w0.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class RunnableC0264a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j.c f19682a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Typeface f19683b;

        public RunnableC0264a(j.c cVar, Typeface typeface) {
            this.f19682a = cVar;
            this.f19683b = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f19682a.b(this.f19683b);
        }
    }

    /* renamed from: w0.a$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j.c f19685a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f19686b;

        public b(j.c cVar, int i6) {
            this.f19685a = cVar;
            this.f19686b = i6;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f19685a.a(this.f19686b);
        }
    }

    public C2206a(j.c cVar, Executor executor) {
        this.f19680a = cVar;
        this.f19681b = executor;
    }

    public final void a(int i6) {
        this.f19681b.execute(new b(this.f19680a, i6));
    }

    public void b(i.e eVar) {
        if (eVar.a()) {
            c(eVar.f19714a);
        } else {
            a(eVar.f19715b);
        }
    }

    public final void c(Typeface typeface) {
        this.f19681b.execute(new RunnableC0264a(this.f19680a, typeface));
    }
}
