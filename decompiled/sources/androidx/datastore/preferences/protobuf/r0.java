package androidx.datastore.preferences.protobuf;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class r0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f8843a = c(1, 3);

    /* renamed from: b, reason: collision with root package name */
    public static final int f8844b = c(1, 4);

    /* renamed from: c, reason: collision with root package name */
    public static final int f8845c = c(2, 0);

    /* renamed from: d, reason: collision with root package name */
    public static final int f8846d = c(3, 2);

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
    public static class b {

        /* renamed from: c, reason: collision with root package name */
        public static final b f8847c;

        /* renamed from: d, reason: collision with root package name */
        public static final b f8848d;

        /* renamed from: e, reason: collision with root package name */
        public static final b f8849e;

        /* renamed from: f, reason: collision with root package name */
        public static final b f8850f;

        /* renamed from: g, reason: collision with root package name */
        public static final b f8851g;

        /* renamed from: h, reason: collision with root package name */
        public static final b f8852h;

        /* renamed from: i, reason: collision with root package name */
        public static final b f8853i;

        /* renamed from: j, reason: collision with root package name */
        public static final b f8854j;

        /* renamed from: k, reason: collision with root package name */
        public static final b f8855k;

        /* renamed from: l, reason: collision with root package name */
        public static final b f8856l;

        /* renamed from: m, reason: collision with root package name */
        public static final b f8857m;

        /* renamed from: n, reason: collision with root package name */
        public static final b f8858n;

        /* renamed from: o, reason: collision with root package name */
        public static final b f8859o;

        /* renamed from: p, reason: collision with root package name */
        public static final b f8860p;

        /* renamed from: q, reason: collision with root package name */
        public static final b f8861q;

        /* renamed from: r, reason: collision with root package name */
        public static final b f8862r;

        /* renamed from: s, reason: collision with root package name */
        public static final b f8863s;

        /* renamed from: t, reason: collision with root package name */
        public static final b f8864t;

        /* renamed from: u, reason: collision with root package name */
        public static final /* synthetic */ b[] f8865u;

        /* renamed from: a, reason: collision with root package name */
        public final c f8866a;

        /* renamed from: b, reason: collision with root package name */
        public final int f8867b;

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public enum a extends b {
            public a(String str, int i6, c cVar, int i7) {
                super(str, i6, cVar, i7);
            }
        }

        /* renamed from: androidx.datastore.preferences.protobuf.r0$b$b, reason: collision with other inner class name */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public enum C0129b extends b {
            public C0129b(String str, int i6, c cVar, int i7) {
                super(str, i6, cVar, i7);
            }
        }

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public enum c extends b {
            public c(String str, int i6, c cVar, int i7) {
                super(str, i6, cVar, i7);
            }
        }

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public enum d extends b {
            public d(String str, int i6, c cVar, int i7) {
                super(str, i6, cVar, i7);
            }
        }

        static {
            b bVar = new b("DOUBLE", 0, c.DOUBLE, 1);
            f8847c = bVar;
            b bVar2 = new b("FLOAT", 1, c.FLOAT, 5);
            f8848d = bVar2;
            c cVar = c.LONG;
            b bVar3 = new b("INT64", 2, cVar, 0);
            f8849e = bVar3;
            b bVar4 = new b("UINT64", 3, cVar, 0);
            f8850f = bVar4;
            c cVar2 = c.INT;
            b bVar5 = new b("INT32", 4, cVar2, 0);
            f8851g = bVar5;
            b bVar6 = new b("FIXED64", 5, cVar, 1);
            f8852h = bVar6;
            b bVar7 = new b("FIXED32", 6, cVar2, 5);
            f8853i = bVar7;
            b bVar8 = new b("BOOL", 7, c.BOOLEAN, 0);
            f8854j = bVar8;
            a aVar = new a("STRING", 8, c.STRING, 2);
            f8855k = aVar;
            c cVar3 = c.MESSAGE;
            C0129b c0129b = new C0129b("GROUP", 9, cVar3, 3);
            f8856l = c0129b;
            c cVar4 = new c("MESSAGE", 10, cVar3, 2);
            f8857m = cVar4;
            d dVar = new d("BYTES", 11, c.BYTE_STRING, 2);
            f8858n = dVar;
            b bVar9 = new b("UINT32", 12, cVar2, 0);
            f8859o = bVar9;
            b bVar10 = new b("ENUM", 13, c.ENUM, 0);
            f8860p = bVar10;
            b bVar11 = new b("SFIXED32", 14, cVar2, 5);
            f8861q = bVar11;
            b bVar12 = new b("SFIXED64", 15, cVar, 1);
            f8862r = bVar12;
            b bVar13 = new b("SINT32", 16, cVar2, 0);
            f8863s = bVar13;
            b bVar14 = new b("SINT64", 17, cVar, 0);
            f8864t = bVar14;
            f8865u = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, aVar, c0129b, cVar4, dVar, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f8865u.clone();
        }

        public c a() {
            return this.f8866a;
        }

        public int b() {
            return this.f8867b;
        }

        public b(String str, int i6, c cVar, int i7) {
            this.f8866a = cVar;
            this.f8867b = i7;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public enum c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(AbstractC1030g.f8721b),
        ENUM(null),
        MESSAGE(null);


        /* renamed from: a, reason: collision with root package name */
        public final Object f8878a;

        c(Object obj) {
            this.f8878a = obj;
        }
    }

    public static int a(int i6) {
        return i6 >>> 3;
    }

    public static int b(int i6) {
        return i6 & 7;
    }

    public static int c(int i6, int i7) {
        return (i6 << 3) | i7;
    }
}
