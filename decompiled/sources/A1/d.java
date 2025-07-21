package A1;

import A1.d;
import android.os.Handler;
import c1.AbstractC1119a;
import e1.InterfaceC1266x;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface d {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface a {

        /* renamed from: A1.d$a$a, reason: collision with other inner class name */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class C0000a {

            /* renamed from: a, reason: collision with root package name */
            public final CopyOnWriteArrayList f86a = new CopyOnWriteArrayList();

            /* renamed from: A1.d$a$a$a, reason: collision with other inner class name */
            /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
            public static final class C0001a {

                /* renamed from: a, reason: collision with root package name */
                public final Handler f87a;

                /* renamed from: b, reason: collision with root package name */
                public final a f88b;

                /* renamed from: c, reason: collision with root package name */
                public boolean f89c;

                public C0001a(Handler handler, a aVar) {
                    this.f87a = handler;
                    this.f88b = aVar;
                }

                public void d() {
                    this.f89c = true;
                }
            }

            public void b(Handler handler, a aVar) {
                AbstractC1119a.e(handler);
                AbstractC1119a.e(aVar);
                d(aVar);
                this.f86a.add(new C0001a(handler, aVar));
            }

            public void c(int i6, long j6, long j7) {
                final int i7;
                final long j8;
                final long j9;
                Iterator it = this.f86a.iterator();
                while (it.hasNext()) {
                    final C0001a c0001a = (C0001a) it.next();
                    if (c0001a.f89c) {
                        i7 = i6;
                        j8 = j6;
                        j9 = j7;
                    } else {
                        i7 = i6;
                        j8 = j6;
                        j9 = j7;
                        c0001a.f87a.post(new Runnable() { // from class: A1.c
                            @Override // java.lang.Runnable
                            public final void run() {
                                d.a.C0000a.C0001a.this.f88b.M(i7, j8, j9);
                            }
                        });
                    }
                    i6 = i7;
                    j6 = j8;
                    j7 = j9;
                }
            }

            public void d(a aVar) {
                Iterator it = this.f86a.iterator();
                while (it.hasNext()) {
                    C0001a c0001a = (C0001a) it.next();
                    if (c0001a.f88b == aVar) {
                        c0001a.d();
                        this.f86a.remove(c0001a);
                    }
                }
            }
        }

        void M(int i6, long j6, long j7);
    }

    default long b() {
        return -9223372036854775807L;
    }

    InterfaceC1266x d();

    long f();

    void h(a aVar);

    void i(Handler handler, a aVar);
}
