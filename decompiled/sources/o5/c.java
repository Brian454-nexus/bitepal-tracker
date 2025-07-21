package o5;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class c {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b extends c {

        /* renamed from: a, reason: collision with root package name */
        public volatile boolean f18047a;

        public b() {
            super();
        }

        @Override // o5.c
        public void b(boolean z6) {
            this.f18047a = z6;
        }

        @Override // o5.c
        public void c() {
            if (this.f18047a) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    public static c a() {
        return new b();
    }

    public abstract void b(boolean z6);

    public abstract void c();

    public c() {
    }
}
