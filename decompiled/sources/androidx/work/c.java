package androidx.work;

import D6.g;
import W2.x;
import android.content.Context;
import h3.C1461c;
import i3.InterfaceC1511b;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public Context f10262a;

    /* renamed from: b, reason: collision with root package name */
    public WorkerParameters f10263b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f10264c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f10265d;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class a {

        /* renamed from: androidx.work.c$a$a, reason: collision with other inner class name */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class C0153a extends a {

            /* renamed from: a, reason: collision with root package name */
            public final androidx.work.b f10266a;

            public C0153a() {
                this(androidx.work.b.f10259c);
            }

            public androidx.work.b e() {
                return this.f10266a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0153a.class != obj.getClass()) {
                    return false;
                }
                return this.f10266a.equals(((C0153a) obj).f10266a);
            }

            public int hashCode() {
                return (C0153a.class.getName().hashCode() * 31) + this.f10266a.hashCode();
            }

            public String toString() {
                return "Failure {mOutputData=" + this.f10266a + '}';
            }

            public C0153a(androidx.work.b bVar) {
                this.f10266a = bVar;
            }
        }

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class b extends a {
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && b.class == obj.getClass();
            }

            public int hashCode() {
                return b.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        /* renamed from: androidx.work.c$a$c, reason: collision with other inner class name */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class C0154c extends a {

            /* renamed from: a, reason: collision with root package name */
            public final androidx.work.b f10267a;

            public C0154c() {
                this(androidx.work.b.f10259c);
            }

            public androidx.work.b e() {
                return this.f10267a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0154c.class != obj.getClass()) {
                    return false;
                }
                return this.f10267a.equals(((C0154c) obj).f10267a);
            }

            public int hashCode() {
                return (C0154c.class.getName().hashCode() * 31) + this.f10267a.hashCode();
            }

            public String toString() {
                return "Success {mOutputData=" + this.f10267a + '}';
            }

            public C0154c(androidx.work.b bVar) {
                this.f10267a = bVar;
            }
        }

        public static a a() {
            return new C0153a();
        }

        public static a b() {
            return new b();
        }

        public static a c() {
            return new C0154c();
        }

        public static a d(androidx.work.b bVar) {
            return new C0154c(bVar);
        }
    }

    public c(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.f10262a = context;
        this.f10263b = workerParameters;
    }

    public final Context a() {
        return this.f10262a;
    }

    public Executor b() {
        return this.f10263b.a();
    }

    public g d() {
        C1461c t6 = C1461c.t();
        t6.q(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return t6;
    }

    public final UUID e() {
        return this.f10263b.c();
    }

    public final b g() {
        return this.f10263b.d();
    }

    public InterfaceC1511b h() {
        return this.f10263b.e();
    }

    public x i() {
        return this.f10263b.f();
    }

    public final boolean j() {
        return this.f10264c;
    }

    public final boolean k() {
        return this.f10265d;
    }

    public void l() {
    }

    public final void m() {
        this.f10265d = true;
    }

    public abstract g n();

    public final void o() {
        this.f10264c = true;
        l();
    }
}
