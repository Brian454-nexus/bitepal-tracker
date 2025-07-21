package v2;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import s.C2039b;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class o {

    /* renamed from: q, reason: collision with root package name */
    public static final a f19435q = new a(null);

    /* renamed from: r, reason: collision with root package name */
    public static final String[] f19436r = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: a, reason: collision with root package name */
    public final u f19437a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f19438b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f19439c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f19440d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f19441e;

    /* renamed from: f, reason: collision with root package name */
    public C2165c f19442f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f19443g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f19444h;

    /* renamed from: i, reason: collision with root package name */
    public volatile A2.k f19445i;

    /* renamed from: j, reason: collision with root package name */
    public final b f19446j;

    /* renamed from: k, reason: collision with root package name */
    public final m f19447k;

    /* renamed from: l, reason: collision with root package name */
    public final C2039b f19448l;

    /* renamed from: m, reason: collision with root package name */
    public r f19449m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f19450n;

    /* renamed from: o, reason: collision with root package name */
    public final Object f19451o;

    /* renamed from: p, reason: collision with root package name */
    public final Runnable f19452p;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(A2.g database) {
            Intrinsics.checkNotNullParameter(database, "database");
            if (database.d0()) {
                database.E();
            } else {
                database.h();
            }
        }

        public final String b(String tableName, String triggerType) {
            Intrinsics.checkNotNullParameter(tableName, "tableName");
            Intrinsics.checkNotNullParameter(triggerType, "triggerType");
            return "`room_table_modification_trigger_" + tableName + '_' + triggerType + '`';
        }

        public a() {
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {

        /* renamed from: e, reason: collision with root package name */
        public static final a f19453e = new a(null);

        /* renamed from: a, reason: collision with root package name */
        public final long[] f19454a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean[] f19455b;

        /* renamed from: c, reason: collision with root package name */
        public final int[] f19456c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f19457d;

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public a() {
            }
        }

        public b(int i6) {
            this.f19454a = new long[i6];
            this.f19455b = new boolean[i6];
            this.f19456c = new int[i6];
        }

        public final int[] a() {
            synchronized (this) {
                try {
                    if (!this.f19457d) {
                        return null;
                    }
                    long[] jArr = this.f19454a;
                    int length = jArr.length;
                    int i6 = 0;
                    int i7 = 0;
                    while (i6 < length) {
                        int i8 = i7 + 1;
                        int i9 = 1;
                        boolean z6 = jArr[i6] > 0;
                        boolean[] zArr = this.f19455b;
                        if (z6 != zArr[i7]) {
                            int[] iArr = this.f19456c;
                            if (!z6) {
                                i9 = 2;
                            }
                            iArr[i7] = i9;
                        } else {
                            this.f19456c[i7] = 0;
                        }
                        zArr[i7] = z6;
                        i6++;
                        i7 = i8;
                    }
                    this.f19457d = false;
                    return (int[]) this.f19456c.clone();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final boolean b(int... tableIds) {
            boolean z6;
            Intrinsics.checkNotNullParameter(tableIds, "tableIds");
            synchronized (this) {
                try {
                    z6 = false;
                    for (int i6 : tableIds) {
                        long[] jArr = this.f19454a;
                        long j6 = jArr[i6];
                        jArr[i6] = 1 + j6;
                        if (j6 == 0) {
                            this.f19457d = true;
                            z6 = true;
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z6;
        }

        public final boolean c(int... tableIds) {
            boolean z6;
            Intrinsics.checkNotNullParameter(tableIds, "tableIds");
            synchronized (this) {
                try {
                    z6 = false;
                    for (int i6 : tableIds) {
                        long[] jArr = this.f19454a;
                        long j6 = jArr[i6];
                        jArr[i6] = j6 - 1;
                        if (j6 == 1) {
                            this.f19457d = true;
                            z6 = true;
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z6;
        }

        public final void d() {
            synchronized (this) {
                Arrays.fill(this.f19455b, false);
                this.f19457d = true;
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        public final String[] f19458a;

        public c(String[] tables) {
            Intrinsics.checkNotNullParameter(tables, "tables");
            this.f19458a = tables;
        }

        public final String[] a() {
            return this.f19458a;
        }

        public abstract boolean b();

        public abstract void c(Set set);
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final c f19459a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f19460b;

        /* renamed from: c, reason: collision with root package name */
        public final String[] f19461c;

        /* renamed from: d, reason: collision with root package name */
        public final Set f19462d;

        public d(c observer, int[] tableIds, String[] tableNames) {
            Intrinsics.checkNotNullParameter(observer, "observer");
            Intrinsics.checkNotNullParameter(tableIds, "tableIds");
            Intrinsics.checkNotNullParameter(tableNames, "tableNames");
            this.f19459a = observer;
            this.f19460b = tableIds;
            this.f19461c = tableNames;
            this.f19462d = !(tableNames.length == 0) ? SetsKt.setOf(tableNames[0]) : SetsKt.emptySet();
            if (tableIds.length != tableNames.length) {
                throw new IllegalStateException("Check failed.");
            }
        }

        public final int[] a() {
            return this.f19460b;
        }

        public final void b(Set invalidatedTablesIds) {
            Set emptySet;
            Intrinsics.checkNotNullParameter(invalidatedTablesIds, "invalidatedTablesIds");
            int[] iArr = this.f19460b;
            int length = iArr.length;
            if (length != 0) {
                int i6 = 0;
                if (length != 1) {
                    Set createSetBuilder = SetsKt.createSetBuilder();
                    int[] iArr2 = this.f19460b;
                    int length2 = iArr2.length;
                    int i7 = 0;
                    while (i6 < length2) {
                        int i8 = i7 + 1;
                        if (invalidatedTablesIds.contains(Integer.valueOf(iArr2[i6]))) {
                            createSetBuilder.add(this.f19461c[i7]);
                        }
                        i6++;
                        i7 = i8;
                    }
                    emptySet = SetsKt.build(createSetBuilder);
                } else {
                    emptySet = invalidatedTablesIds.contains(Integer.valueOf(iArr[0])) ? this.f19462d : SetsKt.emptySet();
                }
            } else {
                emptySet = SetsKt.emptySet();
            }
            if (emptySet.isEmpty()) {
                return;
            }
            this.f19459a.c(emptySet);
        }

        public final void c(String[] tables) {
            Set emptySet;
            Intrinsics.checkNotNullParameter(tables, "tables");
            int length = this.f19461c.length;
            if (length == 0) {
                emptySet = SetsKt.emptySet();
            } else if (length == 1) {
                int length2 = tables.length;
                int i6 = 0;
                while (true) {
                    if (i6 >= length2) {
                        emptySet = SetsKt.emptySet();
                        break;
                    } else {
                        if (StringsKt.equals(tables[i6], this.f19461c[0], true)) {
                            emptySet = this.f19462d;
                            break;
                        }
                        i6++;
                    }
                }
            } else {
                Set createSetBuilder = SetsKt.createSetBuilder();
                for (String str : tables) {
                    for (String str2 : this.f19461c) {
                        if (StringsKt.equals(str2, str, true)) {
                            createSetBuilder.add(str2);
                        }
                    }
                }
                emptySet = SetsKt.build(createSetBuilder);
            }
            if (emptySet.isEmpty()) {
                return;
            }
            this.f19459a.c(emptySet);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class e implements Runnable {
        public e() {
        }

        public final Set a() {
            o oVar = o.this;
            Set createSetBuilder = SetsKt.createSetBuilder();
            Cursor y6 = u.y(oVar.e(), new A2.a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), null, 2, null);
            while (y6.moveToNext()) {
                try {
                    createSetBuilder.add(Integer.valueOf(y6.getInt(0)));
                } finally {
                }
            }
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(y6, null);
            Set build = SetsKt.build(createSetBuilder);
            if (build.isEmpty()) {
                return build;
            }
            if (o.this.d() == null) {
                throw new IllegalStateException("Required value was null.");
            }
            A2.k d6 = o.this.d();
            if (d6 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            d6.p();
            return build;
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x0080, code lost:
        
            if (r0 != null) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0082, code lost:
        
            r0.e();
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00c4, code lost:
        
            if (r2.isEmpty() != false) goto L72;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00c6, code lost:
        
            r0 = r4.f19463a.f();
            r1 = r4.f19463a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00ce, code lost:
        
            monitor-enter(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00cf, code lost:
        
            r1 = r1.f().iterator();
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00db, code lost:
        
            if (r1.hasNext() == false) goto L69;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00dd, code lost:
        
            ((v2.o.d) ((java.util.Map.Entry) r1.next()).getValue()).b(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00ef, code lost:
        
            r1 = kotlin.Unit.INSTANCE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00f1, code lost:
        
            monitor-exit(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00ed, code lost:
        
            r1 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00f4, code lost:
        
            throw r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x00a6, code lost:
        
            if (r0 == null) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x00bd, code lost:
        
            if (r0 == null) goto L44;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 261
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: v2.o.e.run():void");
        }
    }

    public o(u database, Map shadowTablesMap, Map viewTables, String... tableNames) {
        String str;
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(shadowTablesMap, "shadowTablesMap");
        Intrinsics.checkNotNullParameter(viewTables, "viewTables");
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        this.f19437a = database;
        this.f19438b = shadowTablesMap;
        this.f19439c = viewTables;
        this.f19443g = new AtomicBoolean(false);
        this.f19446j = new b(tableNames.length);
        this.f19447k = new m(database);
        this.f19448l = new C2039b();
        this.f19450n = new Object();
        this.f19451o = new Object();
        this.f19440d = new LinkedHashMap();
        int length = tableNames.length;
        String[] strArr = new String[length];
        for (int i6 = 0; i6 < length; i6++) {
            String str2 = tableNames[i6];
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = str2.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            this.f19440d.put(lowerCase, Integer.valueOf(i6));
            String str3 = (String) this.f19438b.get(tableNames[i6]);
            if (str3 != null) {
                Intrinsics.checkNotNullExpressionValue(US, "US");
                str = str3.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String).toLowerCase(locale)");
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr[i6] = lowerCase;
        }
        this.f19441e = strArr;
        for (Map.Entry entry : this.f19438b.entrySet()) {
            String str4 = (String) entry.getValue();
            Locale US2 = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US2, "US");
            String lowerCase2 = str4.toLowerCase(US2);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            if (this.f19440d.containsKey(lowerCase2)) {
                String str5 = (String) entry.getKey();
                Intrinsics.checkNotNullExpressionValue(US2, "US");
                String lowerCase3 = str5.toLowerCase(US2);
                Intrinsics.checkNotNullExpressionValue(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
                Map map = this.f19440d;
                map.put(lowerCase3, MapsKt.getValue(map, lowerCase2));
            }
        }
        this.f19452p = new e();
    }

    public void b(c observer) {
        d dVar;
        Intrinsics.checkNotNullParameter(observer, "observer");
        String[] n6 = n(observer.a());
        ArrayList arrayList = new ArrayList(n6.length);
        for (String str : n6) {
            Map map = this.f19440d;
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = str.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            Integer num = (Integer) map.get(lowerCase);
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name " + str);
            }
            arrayList.add(num);
        }
        int[] intArray = CollectionsKt.toIntArray(arrayList);
        d dVar2 = new d(observer, intArray, n6);
        synchronized (this.f19448l) {
            dVar = (d) this.f19448l.k(observer, dVar2);
        }
        if (dVar == null && this.f19446j.b(Arrays.copyOf(intArray, intArray.length))) {
            s();
        }
    }

    public final boolean c() {
        if (!this.f19437a.w()) {
            return false;
        }
        if (!this.f19444h) {
            this.f19437a.m().J();
        }
        if (this.f19444h) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final A2.k d() {
        return this.f19445i;
    }

    public final u e() {
        return this.f19437a;
    }

    public final C2039b f() {
        return this.f19448l;
    }

    public final AtomicBoolean g() {
        return this.f19443g;
    }

    public final Map h() {
        return this.f19440d;
    }

    public final void i(A2.g database) {
        Intrinsics.checkNotNullParameter(database, "database");
        synchronized (this.f19451o) {
            if (this.f19444h) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            database.n("PRAGMA temp_store = MEMORY;");
            database.n("PRAGMA recursive_triggers='ON';");
            database.n("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            t(database);
            this.f19445i = database.q("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
            this.f19444h = true;
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void j(String... tables) {
        Intrinsics.checkNotNullParameter(tables, "tables");
        synchronized (this.f19448l) {
            try {
                for (Map.Entry entry : this.f19448l) {
                    Intrinsics.checkNotNullExpressionValue(entry, "(observer, wrapper)");
                    c cVar = (c) entry.getKey();
                    d dVar = (d) entry.getValue();
                    if (!cVar.b()) {
                        dVar.c(tables);
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k() {
        synchronized (this.f19451o) {
            this.f19444h = false;
            this.f19446j.d();
            Unit unit = Unit.INSTANCE;
        }
    }

    public void l() {
        if (this.f19443g.compareAndSet(false, true)) {
            C2165c c2165c = this.f19442f;
            if (c2165c != null) {
                c2165c.j();
            }
            this.f19437a.n().execute(this.f19452p);
        }
    }

    public void m(c observer) {
        d dVar;
        Intrinsics.checkNotNullParameter(observer, "observer");
        synchronized (this.f19448l) {
            dVar = (d) this.f19448l.l(observer);
        }
        if (dVar != null) {
            b bVar = this.f19446j;
            int[] a6 = dVar.a();
            if (bVar.c(Arrays.copyOf(a6, a6.length))) {
                s();
            }
        }
    }

    public final String[] n(String[] strArr) {
        Set createSetBuilder = SetsKt.createSetBuilder();
        for (String str : strArr) {
            Map map = this.f19439c;
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = str.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (map.containsKey(lowerCase)) {
                Map map2 = this.f19439c;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                String lowerCase2 = str.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                Object obj = map2.get(lowerCase2);
                Intrinsics.checkNotNull(obj);
                createSetBuilder.addAll((Collection) obj);
            } else {
                createSetBuilder.add(str);
            }
        }
        Object[] array = SetsKt.build(createSetBuilder).toArray(new String[0]);
        Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (String[]) array;
    }

    public final void o(C2165c autoCloser) {
        Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
        this.f19442f = autoCloser;
        autoCloser.m(new Runnable() { // from class: v2.n
            @Override // java.lang.Runnable
            public final void run() {
                o.this.k();
            }
        });
    }

    public final void p(Context context, String name, Intent serviceIntent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(serviceIntent, "serviceIntent");
        this.f19449m = new r(context, name, serviceIntent, this, this.f19437a.n());
    }

    public final void q(A2.g gVar, int i6) {
        gVar.n("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i6 + ", 0)");
        String str = this.f19441e[i6];
        for (String str2 : f19436r) {
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + f19435q.b(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i6 + " AND invalidated = 0; END";
            Intrinsics.checkNotNullExpressionValue(str3, "StringBuilder().apply(builderAction).toString()");
            gVar.n(str3);
        }
    }

    public final void r(A2.g gVar, int i6) {
        String str = this.f19441e[i6];
        for (String str2 : f19436r) {
            String str3 = "DROP TRIGGER IF EXISTS " + f19435q.b(str, str2);
            Intrinsics.checkNotNullExpressionValue(str3, "StringBuilder().apply(builderAction).toString()");
            gVar.n(str3);
        }
    }

    public final void s() {
        if (this.f19437a.w()) {
            t(this.f19437a.m().J());
        }
    }

    public final void t(A2.g database) {
        Intrinsics.checkNotNullParameter(database, "database");
        if (database.W()) {
            return;
        }
        try {
            Lock k6 = this.f19437a.k();
            k6.lock();
            try {
                synchronized (this.f19450n) {
                    int[] a6 = this.f19446j.a();
                    if (a6 != null) {
                        f19435q.a(database);
                        try {
                            int length = a6.length;
                            int i6 = 0;
                            int i7 = 0;
                            while (i6 < length) {
                                int i8 = a6[i6];
                                int i9 = i7 + 1;
                                if (i8 == 1) {
                                    q(database, i7);
                                } else if (i8 == 2) {
                                    r(database, i7);
                                }
                                i6++;
                                i7 = i9;
                            }
                            database.B();
                            database.M();
                            Unit unit = Unit.INSTANCE;
                        } catch (Throwable th) {
                            database.M();
                            throw th;
                        }
                    }
                }
            } finally {
                k6.unlock();
            }
        } catch (SQLiteException e6) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e6);
        } catch (IllegalStateException e7) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e7);
        }
    }
}
