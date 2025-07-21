package w5;

import w5.e;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class o {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class a {
        public abstract o a();

        public abstract a b(w5.a aVar);

        public abstract a c(b bVar);
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public enum b {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);


        /* renamed from: a, reason: collision with root package name */
        public final int f20321a;

        b(int i6) {
            this.f20321a = i6;
        }
    }

    public static a a() {
        return new e.b();
    }

    public abstract w5.a b();

    public abstract b c();
}
