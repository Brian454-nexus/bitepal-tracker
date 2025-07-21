package x2;

import A2.g;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import v2.l;

/* renamed from: x2.d, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C2270d {

    /* renamed from: e, reason: collision with root package name */
    public static final b f20487e = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f20488a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f20489b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f20490c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f20491d;

    /* renamed from: x2.d$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: h, reason: collision with root package name */
        public static final C0271a f20492h = new C0271a(null);

        /* renamed from: a, reason: collision with root package name */
        public final String f20493a;

        /* renamed from: b, reason: collision with root package name */
        public final String f20494b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f20495c;

        /* renamed from: d, reason: collision with root package name */
        public final int f20496d;

        /* renamed from: e, reason: collision with root package name */
        public final String f20497e;

        /* renamed from: f, reason: collision with root package name */
        public final int f20498f;

        /* renamed from: g, reason: collision with root package name */
        public final int f20499g;

        /* renamed from: x2.d$a$a, reason: collision with other inner class name */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class C0271a {
            public /* synthetic */ C0271a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final boolean a(String str) {
                if (str.length() == 0) {
                    return false;
                }
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                while (i6 < str.length()) {
                    char charAt = str.charAt(i6);
                    int i9 = i8 + 1;
                    if (i8 == 0 && charAt != '(') {
                        return false;
                    }
                    if (charAt == '(') {
                        i7++;
                    } else if (charAt == ')' && i7 - 1 == 0 && i8 != str.length() - 1) {
                        return false;
                    }
                    i6++;
                    i8 = i9;
                }
                return i7 == 0;
            }

            public final boolean b(String current, String str) {
                Intrinsics.checkNotNullParameter(current, "current");
                if (Intrinsics.areEqual(current, str)) {
                    return true;
                }
                if (!a(current)) {
                    return false;
                }
                String substring = current.substring(1, current.length() - 1);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                return Intrinsics.areEqual(StringsKt.trim(substring).toString(), str);
            }

            public C0271a() {
            }
        }

        public a(String name, String type, boolean z6, int i6, String str, int i7) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(type, "type");
            this.f20493a = name;
            this.f20494b = type;
            this.f20495c = z6;
            this.f20496d = i6;
            this.f20497e = str;
            this.f20498f = i7;
            this.f20499g = a(type);
        }

        public final int a(String str) {
            if (str == null) {
                return 5;
            }
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String upperCase = str.toUpperCase(US);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
            if (StringsKt.contains$default(upperCase, "INT", false, 2, (Object) null)) {
                return 3;
            }
            if (StringsKt.contains$default(upperCase, "CHAR", false, 2, (Object) null) || StringsKt.contains$default(upperCase, "CLOB", false, 2, (Object) null) || StringsKt.contains$default(upperCase, "TEXT", false, 2, (Object) null)) {
                return 2;
            }
            if (StringsKt.contains$default(upperCase, "BLOB", false, 2, (Object) null)) {
                return 5;
            }
            return (StringsKt.contains$default(upperCase, "REAL", false, 2, (Object) null) || StringsKt.contains$default(upperCase, "FLOA", false, 2, (Object) null) || StringsKt.contains$default(upperCase, "DOUB", false, 2, (Object) null)) ? 4 : 1;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a) || this.f20496d != ((a) obj).f20496d) {
                return false;
            }
            a aVar = (a) obj;
            if (!Intrinsics.areEqual(this.f20493a, aVar.f20493a) || this.f20495c != aVar.f20495c) {
                return false;
            }
            if (this.f20498f == 1 && aVar.f20498f == 2 && (str3 = this.f20497e) != null && !f20492h.b(str3, aVar.f20497e)) {
                return false;
            }
            if (this.f20498f == 2 && aVar.f20498f == 1 && (str2 = aVar.f20497e) != null && !f20492h.b(str2, this.f20497e)) {
                return false;
            }
            int i6 = this.f20498f;
            return (i6 == 0 || i6 != aVar.f20498f || ((str = this.f20497e) == null ? aVar.f20497e == null : f20492h.b(str, aVar.f20497e))) && this.f20499g == aVar.f20499g;
        }

        public int hashCode() {
            return (((((this.f20493a.hashCode() * 31) + this.f20499g) * 31) + (this.f20495c ? 1231 : 1237)) * 31) + this.f20496d;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Column{name='");
            sb.append(this.f20493a);
            sb.append("', type='");
            sb.append(this.f20494b);
            sb.append("', affinity='");
            sb.append(this.f20499g);
            sb.append("', notNull=");
            sb.append(this.f20495c);
            sb.append(", primaryKeyPosition=");
            sb.append(this.f20496d);
            sb.append(", defaultValue='");
            String str = this.f20497e;
            if (str == null) {
                str = "undefined";
            }
            sb.append(str);
            sb.append("'}");
            return sb.toString();
        }
    }

    /* renamed from: x2.d$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C2270d a(g database, String tableName) {
            Intrinsics.checkNotNullParameter(database, "database");
            Intrinsics.checkNotNullParameter(tableName, "tableName");
            return AbstractC2271e.f(database, tableName);
        }

        public b() {
        }
    }

    /* renamed from: x2.d$c */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final String f20500a;

        /* renamed from: b, reason: collision with root package name */
        public final String f20501b;

        /* renamed from: c, reason: collision with root package name */
        public final String f20502c;

        /* renamed from: d, reason: collision with root package name */
        public final List f20503d;

        /* renamed from: e, reason: collision with root package name */
        public final List f20504e;

        public c(String referenceTable, String onDelete, String onUpdate, List columnNames, List referenceColumnNames) {
            Intrinsics.checkNotNullParameter(referenceTable, "referenceTable");
            Intrinsics.checkNotNullParameter(onDelete, "onDelete");
            Intrinsics.checkNotNullParameter(onUpdate, "onUpdate");
            Intrinsics.checkNotNullParameter(columnNames, "columnNames");
            Intrinsics.checkNotNullParameter(referenceColumnNames, "referenceColumnNames");
            this.f20500a = referenceTable;
            this.f20501b = onDelete;
            this.f20502c = onUpdate;
            this.f20503d = columnNames;
            this.f20504e = referenceColumnNames;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (Intrinsics.areEqual(this.f20500a, cVar.f20500a) && Intrinsics.areEqual(this.f20501b, cVar.f20501b) && Intrinsics.areEqual(this.f20502c, cVar.f20502c) && Intrinsics.areEqual(this.f20503d, cVar.f20503d)) {
                return Intrinsics.areEqual(this.f20504e, cVar.f20504e);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.f20500a.hashCode() * 31) + this.f20501b.hashCode()) * 31) + this.f20502c.hashCode()) * 31) + this.f20503d.hashCode()) * 31) + this.f20504e.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.f20500a + "', onDelete='" + this.f20501b + " +', onUpdate='" + this.f20502c + "', columnNames=" + this.f20503d + ", referenceColumnNames=" + this.f20504e + '}';
        }
    }

    /* renamed from: x2.d$d, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class C0272d implements Comparable {

        /* renamed from: a, reason: collision with root package name */
        public final int f20505a;

        /* renamed from: b, reason: collision with root package name */
        public final int f20506b;

        /* renamed from: c, reason: collision with root package name */
        public final String f20507c;

        /* renamed from: d, reason: collision with root package name */
        public final String f20508d;

        public C0272d(int i6, int i7, String from, String to) {
            Intrinsics.checkNotNullParameter(from, "from");
            Intrinsics.checkNotNullParameter(to, "to");
            this.f20505a = i6;
            this.f20506b = i7;
            this.f20507c = from;
            this.f20508d = to;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(C0272d other) {
            Intrinsics.checkNotNullParameter(other, "other");
            int i6 = this.f20505a - other.f20505a;
            return i6 == 0 ? this.f20506b - other.f20506b : i6;
        }

        public final String b() {
            return this.f20507c;
        }

        public final int c() {
            return this.f20505a;
        }

        public final String d() {
            return this.f20508d;
        }
    }

    /* renamed from: x2.d$e */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class e {

        /* renamed from: e, reason: collision with root package name */
        public static final a f20509e = new a(null);

        /* renamed from: a, reason: collision with root package name */
        public final String f20510a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f20511b;

        /* renamed from: c, reason: collision with root package name */
        public final List f20512c;

        /* renamed from: d, reason: collision with root package name */
        public List f20513d;

        /* renamed from: x2.d$e$a */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public a() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r5v2 */
        /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
        public e(String name, boolean z6, List columns, List orders) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(columns, "columns");
            Intrinsics.checkNotNullParameter(orders, "orders");
            this.f20510a = name;
            this.f20511b = z6;
            this.f20512c = columns;
            this.f20513d = orders;
            List list = orders;
            if (list.isEmpty()) {
                int size = columns.size();
                list = new ArrayList(size);
                for (int i6 = 0; i6 < size; i6++) {
                    list.add(l.ASC.name());
                }
            }
            this.f20513d = (List) list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (this.f20511b == eVar.f20511b && Intrinsics.areEqual(this.f20512c, eVar.f20512c) && Intrinsics.areEqual(this.f20513d, eVar.f20513d)) {
                return StringsKt.startsWith$default(this.f20510a, "index_", false, 2, (Object) null) ? StringsKt.startsWith$default(eVar.f20510a, "index_", false, 2, (Object) null) : Intrinsics.areEqual(this.f20510a, eVar.f20510a);
            }
            return false;
        }

        public int hashCode() {
            return ((((((StringsKt.startsWith$default(this.f20510a, "index_", false, 2, (Object) null) ? -1184239155 : this.f20510a.hashCode()) * 31) + (this.f20511b ? 1 : 0)) * 31) + this.f20512c.hashCode()) * 31) + this.f20513d.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.f20510a + "', unique=" + this.f20511b + ", columns=" + this.f20512c + ", orders=" + this.f20513d + "'}";
        }
    }

    public C2270d(String name, Map columns, Set foreignKeys, Set set) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(columns, "columns");
        Intrinsics.checkNotNullParameter(foreignKeys, "foreignKeys");
        this.f20488a = name;
        this.f20489b = columns;
        this.f20490c = foreignKeys;
        this.f20491d = set;
    }

    public static final C2270d a(g gVar, String str) {
        return f20487e.a(gVar, str);
    }

    public boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2270d)) {
            return false;
        }
        C2270d c2270d = (C2270d) obj;
        if (!Intrinsics.areEqual(this.f20488a, c2270d.f20488a) || !Intrinsics.areEqual(this.f20489b, c2270d.f20489b) || !Intrinsics.areEqual(this.f20490c, c2270d.f20490c)) {
            return false;
        }
        Set set2 = this.f20491d;
        if (set2 == null || (set = c2270d.f20491d) == null) {
            return true;
        }
        return Intrinsics.areEqual(set2, set);
    }

    public int hashCode() {
        return (((this.f20488a.hashCode() * 31) + this.f20489b.hashCode()) * 31) + this.f20490c.hashCode();
    }

    public String toString() {
        return "TableInfo{name='" + this.f20488a + "', columns=" + this.f20489b + ", foreignKeys=" + this.f20490c + ", indices=" + this.f20491d + '}';
    }
}
