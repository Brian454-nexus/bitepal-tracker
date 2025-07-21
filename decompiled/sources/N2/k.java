package N2;

import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class k implements Comparable {

    /* renamed from: f, reason: collision with root package name */
    public static final a f3606f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    public static final k f3607g = new k(0, 0, 0, "");

    /* renamed from: h, reason: collision with root package name */
    public static final k f3608h = new k(0, 1, 0, "");

    /* renamed from: i, reason: collision with root package name */
    public static final k f3609i;

    /* renamed from: j, reason: collision with root package name */
    public static final k f3610j;

    /* renamed from: a, reason: collision with root package name */
    public final int f3611a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3612b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3613c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3614d;

    /* renamed from: e, reason: collision with root package name */
    public final Lazy f3615e;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k a() {
            return k.f3608h;
        }

        public final k b(String str) {
            String group;
            if (str != null && !StringsKt.isBlank(str)) {
                Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
                if (matcher.matches() && (group = matcher.group(1)) != null) {
                    int parseInt = Integer.parseInt(group);
                    String group2 = matcher.group(2);
                    if (group2 != null) {
                        int parseInt2 = Integer.parseInt(group2);
                        String group3 = matcher.group(3);
                        if (group3 != null) {
                            int parseInt3 = Integer.parseInt(group3);
                            String description = matcher.group(4) != null ? matcher.group(4) : "";
                            Intrinsics.checkNotNullExpressionValue(description, "description");
                            return new k(parseInt, parseInt2, parseInt3, description, null);
                        }
                    }
                }
            }
            return null;
        }

        public a() {
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends Lambda implements Function0 {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BigInteger invoke() {
            return BigInteger.valueOf(k.this.d()).shiftLeft(32).or(BigInteger.valueOf(k.this.e())).shiftLeft(32).or(BigInteger.valueOf(k.this.f()));
        }
    }

    static {
        k kVar = new k(1, 0, 0, "");
        f3609i = kVar;
        f3610j = kVar;
    }

    public /* synthetic */ k(int i6, int i7, int i8, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(i6, i7, i8, str);
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(k other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return c().compareTo(other.c());
    }

    public final BigInteger c() {
        Object value = this.f3615e.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-bigInteger>(...)");
        return (BigInteger) value;
    }

    public final int d() {
        return this.f3611a;
    }

    public final int e() {
        return this.f3612b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f3611a == kVar.f3611a && this.f3612b == kVar.f3612b && this.f3613c == kVar.f3613c;
    }

    public final int f() {
        return this.f3613c;
    }

    public int hashCode() {
        return ((((527 + this.f3611a) * 31) + this.f3612b) * 31) + this.f3613c;
    }

    public String toString() {
        String str;
        if (StringsKt.isBlank(this.f3614d)) {
            str = "";
        } else {
            str = '-' + this.f3614d;
        }
        return this.f3611a + com.amazon.a.a.o.c.a.b.f11260a + this.f3612b + com.amazon.a.a.o.c.a.b.f11260a + this.f3613c + str;
    }

    public k(int i6, int i7, int i8, String str) {
        this.f3611a = i6;
        this.f3612b = i7;
        this.f3613c = i8;
        this.f3614d = str;
        this.f3615e = LazyKt.lazy(new b());
    }
}
