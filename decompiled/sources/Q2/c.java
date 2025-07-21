package Q2;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface c extends Q2.a {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final C0073a f4449b = new C0073a(null);

        /* renamed from: c, reason: collision with root package name */
        public static final a f4450c = new a("NONE");

        /* renamed from: d, reason: collision with root package name */
        public static final a f4451d = new a("FULL");

        /* renamed from: a, reason: collision with root package name */
        public final String f4452a;

        /* renamed from: Q2.c$a$a, reason: collision with other inner class name */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class C0073a {
            public /* synthetic */ C0073a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public C0073a() {
            }
        }

        public a(String str) {
            this.f4452a = str;
        }

        public String toString() {
            return this.f4452a;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final a f4453b = new a(null);

        /* renamed from: c, reason: collision with root package name */
        public static final b f4454c = new b("FLAT");

        /* renamed from: d, reason: collision with root package name */
        public static final b f4455d = new b("HALF_OPENED");

        /* renamed from: a, reason: collision with root package name */
        public final String f4456a;

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public a() {
            }
        }

        public b(String str) {
            this.f4456a = str;
        }

        public String toString() {
            return this.f4456a;
        }
    }

    b f();

    a g();
}
