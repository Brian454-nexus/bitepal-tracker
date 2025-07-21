package j5;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface e {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public enum a {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);


        /* renamed from: a, reason: collision with root package name */
        public final boolean f16242a;

        a(boolean z6) {
            this.f16242a = z6;
        }

        public boolean b() {
            return this.f16242a;
        }
    }

    boolean a();

    void b(d dVar);

    e d();

    boolean f(d dVar);

    boolean h(d dVar);

    boolean i(d dVar);

    void k(d dVar);
}
