package X;

import android.location.Location;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public final b f5958a;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        public final b.a f5959a;

        public a(b.a aVar) {
            this.f5959a = aVar;
            aVar.b(0L);
            aVar.a(0L);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class b {

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static abstract class a {
            public abstract Object a(long j6);

            public abstract Object b(long j6);
        }

        public abstract long a();

        public abstract long b();

        public abstract Location c();
    }

    public r(b bVar) {
        this.f5958a = bVar;
    }

    public long a() {
        return this.f5958a.a();
    }

    public long b() {
        return this.f5958a.b();
    }

    public Location c() {
        return this.f5958a.c();
    }
}
