package A2;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a implements j {

    /* renamed from: c, reason: collision with root package name */
    public static final C0002a f175c = new C0002a(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f176a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f177b;

    /* renamed from: A2.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class C0002a {
        public /* synthetic */ C0002a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(i iVar, int i6, Object obj) {
            if (obj == null) {
                iVar.Q(i6);
                return;
            }
            if (obj instanceof byte[]) {
                iVar.H(i6, (byte[]) obj);
                return;
            }
            if (obj instanceof Float) {
                iVar.t(i6, ((Number) obj).floatValue());
                return;
            }
            if (obj instanceof Double) {
                iVar.t(i6, ((Number) obj).doubleValue());
                return;
            }
            if (obj instanceof Long) {
                iVar.A(i6, ((Number) obj).longValue());
                return;
            }
            if (obj instanceof Integer) {
                iVar.A(i6, ((Number) obj).intValue());
                return;
            }
            if (obj instanceof Short) {
                iVar.A(i6, ((Number) obj).shortValue());
                return;
            }
            if (obj instanceof Byte) {
                iVar.A(i6, ((Number) obj).byteValue());
                return;
            }
            if (obj instanceof String) {
                iVar.b(i6, (String) obj);
                return;
            }
            if (obj instanceof Boolean) {
                iVar.A(i6, ((Boolean) obj).booleanValue() ? 1L : 0L);
                return;
            }
            throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i6 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
        }

        public final void b(i statement, Object[] objArr) {
            Intrinsics.checkNotNullParameter(statement, "statement");
            if (objArr == null) {
                return;
            }
            int length = objArr.length;
            int i6 = 0;
            while (i6 < length) {
                Object obj = objArr[i6];
                i6++;
                a(statement, i6, obj);
            }
        }

        public C0002a() {
        }
    }

    public a(String query, Object[] objArr) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.f176a = query;
        this.f177b = objArr;
    }

    @Override // A2.j
    public void a(i statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        f175c.b(statement, this.f177b);
    }

    @Override // A2.j
    public String c() {
        return this.f176a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(String query) {
        this(query, null);
        Intrinsics.checkNotNullParameter(query, "query");
    }
}
