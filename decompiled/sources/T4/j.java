package T4;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f5018a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final j f5019b = new b();

    /* renamed from: c, reason: collision with root package name */
    public static final j f5020c = new c();

    /* renamed from: d, reason: collision with root package name */
    public static final j f5021d = new d();

    /* renamed from: e, reason: collision with root package name */
    public static final j f5022e = new e();

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a extends j {
        @Override // T4.j
        public boolean a() {
            return true;
        }

        @Override // T4.j
        public boolean b() {
            return true;
        }

        @Override // T4.j
        public boolean c(R4.a aVar) {
            return aVar == R4.a.REMOTE;
        }

        @Override // T4.j
        public boolean d(boolean z6, R4.a aVar, R4.c cVar) {
            return (aVar == R4.a.RESOURCE_DISK_CACHE || aVar == R4.a.MEMORY_CACHE) ? false : true;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class b extends j {
        @Override // T4.j
        public boolean a() {
            return false;
        }

        @Override // T4.j
        public boolean b() {
            return false;
        }

        @Override // T4.j
        public boolean c(R4.a aVar) {
            return false;
        }

        @Override // T4.j
        public boolean d(boolean z6, R4.a aVar, R4.c cVar) {
            return false;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class c extends j {
        @Override // T4.j
        public boolean a() {
            return true;
        }

        @Override // T4.j
        public boolean b() {
            return false;
        }

        @Override // T4.j
        public boolean c(R4.a aVar) {
            return (aVar == R4.a.DATA_DISK_CACHE || aVar == R4.a.MEMORY_CACHE) ? false : true;
        }

        @Override // T4.j
        public boolean d(boolean z6, R4.a aVar, R4.c cVar) {
            return false;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class d extends j {
        @Override // T4.j
        public boolean a() {
            return false;
        }

        @Override // T4.j
        public boolean b() {
            return true;
        }

        @Override // T4.j
        public boolean c(R4.a aVar) {
            return false;
        }

        @Override // T4.j
        public boolean d(boolean z6, R4.a aVar, R4.c cVar) {
            return (aVar == R4.a.RESOURCE_DISK_CACHE || aVar == R4.a.MEMORY_CACHE) ? false : true;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class e extends j {
        @Override // T4.j
        public boolean a() {
            return true;
        }

        @Override // T4.j
        public boolean b() {
            return true;
        }

        @Override // T4.j
        public boolean c(R4.a aVar) {
            return aVar == R4.a.REMOTE;
        }

        @Override // T4.j
        public boolean d(boolean z6, R4.a aVar, R4.c cVar) {
            return ((z6 && aVar == R4.a.DATA_DISK_CACHE) || aVar == R4.a.LOCAL) && cVar == R4.c.TRANSFORMED;
        }
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c(R4.a aVar);

    public abstract boolean d(boolean z6, R4.a aVar, R4.c cVar);
}
