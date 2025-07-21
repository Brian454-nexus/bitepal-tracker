package n5;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class f {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public volatile Object f17782a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f17783b;

        public a(b bVar) {
            this.f17783b = bVar;
        }

        @Override // n5.f.b
        public Object get() {
            if (this.f17782a == null) {
                synchronized (this) {
                    try {
                        if (this.f17782a == null) {
                            this.f17782a = k.d(this.f17783b.get());
                        }
                    } finally {
                    }
                }
            }
            return this.f17782a;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface b {
        Object get();
    }

    public static b a(b bVar) {
        return new a(bVar);
    }
}
