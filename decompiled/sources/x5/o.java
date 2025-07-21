package x5;

import x5.c;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class o {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class a {
        public abstract o a();

        public abstract a b(u5.c cVar);

        public abstract a c(u5.d dVar);

        public abstract a d(u5.h hVar);

        public abstract a e(p pVar);

        public abstract a f(String str);
    }

    public static a a() {
        return new c.b();
    }

    public abstract u5.c b();

    public abstract u5.d c();

    public byte[] d() {
        return (byte[]) e().apply(c().c());
    }

    public abstract u5.h e();

    public abstract p f();

    public abstract String g();
}
