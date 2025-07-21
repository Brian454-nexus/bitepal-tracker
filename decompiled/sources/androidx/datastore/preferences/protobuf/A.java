package androidx.datastore.preferences.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'e' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class A {

    /* renamed from: d, reason: collision with root package name */
    public static final A f8642d;

    /* renamed from: e, reason: collision with root package name */
    public static final A f8643e;

    /* renamed from: f, reason: collision with root package name */
    public static final A f8644f;

    /* renamed from: g, reason: collision with root package name */
    public static final A f8645g;

    /* renamed from: h, reason: collision with root package name */
    public static final A f8646h;

    /* renamed from: i, reason: collision with root package name */
    public static final A f8647i;

    /* renamed from: j, reason: collision with root package name */
    public static final A f8648j;

    /* renamed from: k, reason: collision with root package name */
    public static final A f8649k;

    /* renamed from: l, reason: collision with root package name */
    public static final A f8650l;

    /* renamed from: m, reason: collision with root package name */
    public static final A f8651m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ A[] f8652n;

    /* renamed from: a, reason: collision with root package name */
    public final Class f8653a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f8654b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f8655c;

    static {
        A a6 = new A("VOID", 0, Void.class, Void.class, null);
        f8642d = a6;
        Class cls = Integer.TYPE;
        A a7 = new A("INT", 1, cls, Integer.class, 0);
        f8643e = a7;
        A a8 = new A("LONG", 2, Long.TYPE, Long.class, 0L);
        f8644f = a8;
        A a9 = new A("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f8645g = a9;
        A a10 = new A("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f8646h = a10;
        A a11 = new A("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f8647i = a11;
        A a12 = new A("STRING", 6, String.class, String.class, "");
        f8648j = a12;
        A a13 = new A("BYTE_STRING", 7, AbstractC1030g.class, AbstractC1030g.class, AbstractC1030g.f8721b);
        f8649k = a13;
        A a14 = new A("ENUM", 8, cls, Integer.class, null);
        f8650l = a14;
        A a15 = new A("MESSAGE", 9, Object.class, Object.class, null);
        f8651m = a15;
        f8652n = new A[]{a6, a7, a8, a9, a10, a11, a12, a13, a14, a15};
    }

    public A(String str, int i6, Class cls, Class cls2, Object obj) {
        this.f8653a = cls;
        this.f8654b = cls2;
        this.f8655c = obj;
    }

    public static A valueOf(String str) {
        return (A) Enum.valueOf(A.class, str);
    }

    public static A[] values() {
        return (A[]) f8652n.clone();
    }

    public Class a() {
        return this.f8654b;
    }
}
