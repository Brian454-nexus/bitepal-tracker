package v2;

import A2.h;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import r.C2016c;
import w2.AbstractC2242b;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class u {

    /* renamed from: o, reason: collision with root package name */
    public static final c f19484o = new c(null);

    /* renamed from: a, reason: collision with root package name */
    public volatile A2.g f19485a;

    /* renamed from: b, reason: collision with root package name */
    public Executor f19486b;

    /* renamed from: c, reason: collision with root package name */
    public Executor f19487c;

    /* renamed from: d, reason: collision with root package name */
    public A2.h f19488d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f19490f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f19491g;

    /* renamed from: h, reason: collision with root package name */
    public List f19492h;

    /* renamed from: k, reason: collision with root package name */
    public C2165c f19495k;

    /* renamed from: m, reason: collision with root package name */
    public final Map f19497m;

    /* renamed from: n, reason: collision with root package name */
    public final Map f19498n;

    /* renamed from: e, reason: collision with root package name */
    public final o f19489e = g();

    /* renamed from: i, reason: collision with root package name */
    public Map f19493i = new LinkedHashMap();

    /* renamed from: j, reason: collision with root package name */
    public final ReentrantReadWriteLock f19494j = new ReentrantReadWriteLock();

    /* renamed from: l, reason: collision with root package name */
    public final ThreadLocal f19496l = new ThreadLocal();

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Context f19499a;

        /* renamed from: b, reason: collision with root package name */
        public final Class f19500b;

        /* renamed from: c, reason: collision with root package name */
        public final String f19501c;

        /* renamed from: d, reason: collision with root package name */
        public final List f19502d;

        /* renamed from: e, reason: collision with root package name */
        public final List f19503e;

        /* renamed from: f, reason: collision with root package name */
        public List f19504f;

        /* renamed from: g, reason: collision with root package name */
        public Executor f19505g;

        /* renamed from: h, reason: collision with root package name */
        public Executor f19506h;

        /* renamed from: i, reason: collision with root package name */
        public h.c f19507i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f19508j;

        /* renamed from: k, reason: collision with root package name */
        public d f19509k;

        /* renamed from: l, reason: collision with root package name */
        public Intent f19510l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f19511m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f19512n;

        /* renamed from: o, reason: collision with root package name */
        public long f19513o;

        /* renamed from: p, reason: collision with root package name */
        public TimeUnit f19514p;

        /* renamed from: q, reason: collision with root package name */
        public final e f19515q;

        /* renamed from: r, reason: collision with root package name */
        public Set f19516r;

        /* renamed from: s, reason: collision with root package name */
        public Set f19517s;

        /* renamed from: t, reason: collision with root package name */
        public String f19518t;

        /* renamed from: u, reason: collision with root package name */
        public File f19519u;

        /* renamed from: v, reason: collision with root package name */
        public Callable f19520v;

        public a(Context context, Class klass, String str) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(klass, "klass");
            this.f19499a = context;
            this.f19500b = klass;
            this.f19501c = str;
            this.f19502d = new ArrayList();
            this.f19503e = new ArrayList();
            this.f19504f = new ArrayList();
            this.f19509k = d.AUTOMATIC;
            this.f19511m = true;
            this.f19513o = -1L;
            this.f19515q = new e();
            this.f19516r = new LinkedHashSet();
        }

        public a a(b callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f19502d.add(callback);
            return this;
        }

        public a b(AbstractC2242b... migrations) {
            Intrinsics.checkNotNullParameter(migrations, "migrations");
            if (this.f19517s == null) {
                this.f19517s = new HashSet();
            }
            for (AbstractC2242b abstractC2242b : migrations) {
                Set set = this.f19517s;
                Intrinsics.checkNotNull(set);
                set.add(Integer.valueOf(abstractC2242b.f20141a));
                Set set2 = this.f19517s;
                Intrinsics.checkNotNull(set2);
                set2.add(Integer.valueOf(abstractC2242b.f20142b));
            }
            this.f19515q.b((AbstractC2242b[]) Arrays.copyOf(migrations, migrations.length));
            return this;
        }

        public a c() {
            this.f19508j = true;
            return this;
        }

        public u d() {
            Executor executor = this.f19505g;
            if (executor == null && this.f19506h == null) {
                Executor f6 = C2016c.f();
                this.f19506h = f6;
                this.f19505g = f6;
            } else if (executor != null && this.f19506h == null) {
                this.f19506h = executor;
            } else if (executor == null) {
                this.f19505g = this.f19506h;
            }
            Set set = this.f19517s;
            if (set != null) {
                Intrinsics.checkNotNull(set);
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    int intValue = ((Number) it.next()).intValue();
                    if (this.f19516r.contains(Integer.valueOf(intValue))) {
                        throw new IllegalArgumentException(("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: " + intValue).toString());
                    }
                }
            }
            h.c cVar = this.f19507i;
            if (cVar == null) {
                cVar = new B2.f();
            }
            if (cVar != null) {
                if (this.f19513o > 0) {
                    if (this.f19501c == null) {
                        throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
                    }
                    long j6 = this.f19513o;
                    TimeUnit timeUnit = this.f19514p;
                    if (timeUnit == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    Executor executor2 = this.f19505g;
                    if (executor2 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    cVar = new v2.e(cVar, new C2165c(j6, timeUnit, executor2));
                }
                String str = this.f19518t;
                if (str != null || this.f19519u != null || this.f19520v != null) {
                    if (this.f19501c == null) {
                        throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
                    }
                    int i6 = str == null ? 0 : 1;
                    File file = this.f19519u;
                    int i7 = file == null ? 0 : 1;
                    Callable callable = this.f19520v;
                    if (i6 + i7 + (callable != null ? 1 : 0) != 1) {
                        throw new IllegalArgumentException("More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations.");
                    }
                    cVar = new z(str, file, callable, cVar);
                }
            } else {
                cVar = null;
            }
            h.c cVar2 = cVar;
            if (cVar2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Context context = this.f19499a;
            String str2 = this.f19501c;
            e eVar = this.f19515q;
            List list = this.f19502d;
            boolean z6 = this.f19508j;
            d c6 = this.f19509k.c(context);
            Executor executor3 = this.f19505g;
            if (executor3 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Executor executor4 = this.f19506h;
            if (executor4 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            v2.f fVar = new v2.f(context, str2, cVar2, eVar, list, z6, c6, executor3, executor4, this.f19510l, this.f19511m, this.f19512n, this.f19516r, this.f19518t, this.f19519u, this.f19520v, null, this.f19503e, this.f19504f);
            u uVar = (u) t.b(this.f19500b, "_Impl");
            uVar.r(fVar);
            return uVar;
        }

        public a e() {
            this.f19511m = false;
            this.f19512n = true;
            return this;
        }

        public a f(h.c cVar) {
            this.f19507i = cVar;
            return this;
        }

        public a g(Executor executor) {
            Intrinsics.checkNotNullParameter(executor, "executor");
            this.f19505g = executor;
            return this;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class b {
        public void a(A2.g db) {
            Intrinsics.checkNotNullParameter(db, "db");
        }

        public void b(A2.g db) {
            Intrinsics.checkNotNullParameter(db, "db");
        }

        public void c(A2.g db) {
            Intrinsics.checkNotNullParameter(db, "db");
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public c() {
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public enum d {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        public final boolean b(ActivityManager activityManager) {
            return A2.c.b(activityManager);
        }

        public final d c(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (this != AUTOMATIC) {
                return this;
            }
            Object systemService = context.getSystemService("activity");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            return !b((ActivityManager) systemService) ? WRITE_AHEAD_LOGGING : TRUNCATE;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public final Map f19525a = new LinkedHashMap();

        public final void a(AbstractC2242b abstractC2242b) {
            int i6 = abstractC2242b.f20141a;
            int i7 = abstractC2242b.f20142b;
            Map map = this.f19525a;
            Integer valueOf = Integer.valueOf(i6);
            Object obj = map.get(valueOf);
            if (obj == null) {
                obj = new TreeMap();
                map.put(valueOf, obj);
            }
            TreeMap treeMap = (TreeMap) obj;
            if (treeMap.containsKey(Integer.valueOf(i7))) {
                Log.w("ROOM", "Overriding migration " + treeMap.get(Integer.valueOf(i7)) + " with " + abstractC2242b);
            }
            treeMap.put(Integer.valueOf(i7), abstractC2242b);
        }

        public void b(AbstractC2242b... migrations) {
            Intrinsics.checkNotNullParameter(migrations, "migrations");
            for (AbstractC2242b abstractC2242b : migrations) {
                a(abstractC2242b);
            }
        }

        public final boolean c(int i6, int i7) {
            Map f6 = f();
            if (!f6.containsKey(Integer.valueOf(i6))) {
                return false;
            }
            Map map = (Map) f6.get(Integer.valueOf(i6));
            if (map == null) {
                map = MapsKt.emptyMap();
            }
            return map.containsKey(Integer.valueOf(i7));
        }

        public List d(int i6, int i7) {
            if (i6 == i7) {
                return CollectionsKt.emptyList();
            }
            return e(new ArrayList(), i7 > i6, i6, i7);
        }

        public final List e(List list, boolean z6, int i6, int i7) {
            boolean z7;
            do {
                if (z6) {
                    if (i6 >= i7) {
                        return list;
                    }
                } else if (i6 <= i7) {
                    return list;
                }
                TreeMap treeMap = (TreeMap) this.f19525a.get(Integer.valueOf(i6));
                if (treeMap == null) {
                    return null;
                }
                for (Integer targetVersion : z6 ? treeMap.descendingKeySet() : treeMap.keySet()) {
                    if (z6) {
                        int i8 = i6 + 1;
                        Intrinsics.checkNotNullExpressionValue(targetVersion, "targetVersion");
                        int intValue = targetVersion.intValue();
                        if (i8 <= intValue && intValue <= i7) {
                            Object obj = treeMap.get(targetVersion);
                            Intrinsics.checkNotNull(obj);
                            list.add(obj);
                            i6 = targetVersion.intValue();
                            z7 = true;
                            break;
                        }
                    } else {
                        Intrinsics.checkNotNullExpressionValue(targetVersion, "targetVersion");
                        int intValue2 = targetVersion.intValue();
                        if (i7 <= intValue2 && intValue2 < i6) {
                            Object obj2 = treeMap.get(targetVersion);
                            Intrinsics.checkNotNull(obj2);
                            list.add(obj2);
                            i6 = targetVersion.intValue();
                            z7 = true;
                            break;
                            break;
                        }
                    }
                }
                z7 = false;
            } while (z7);
            return null;
        }

        public Map f() {
            return this.f19525a;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class f {
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class g extends Lambda implements Function1 {
        public g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(A2.g it) {
            Intrinsics.checkNotNullParameter(it, "it");
            u.this.s();
            return null;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class h extends Lambda implements Function1 {
        public h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(A2.g it) {
            Intrinsics.checkNotNullParameter(it, "it");
            u.this.t();
            return null;
        }
    }

    public u() {
        Map synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        Intrinsics.checkNotNullExpressionValue(synchronizedMap, "synchronizedMap(mutableMapOf())");
        this.f19497m = synchronizedMap;
        this.f19498n = new LinkedHashMap();
    }

    public static /* synthetic */ Cursor y(u uVar, A2.j jVar, CancellationSignal cancellationSignal, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
        }
        if ((i6 & 2) != 0) {
            cancellationSignal = null;
        }
        return uVar.x(jVar, cancellationSignal);
    }

    public void A(Runnable body) {
        Intrinsics.checkNotNullParameter(body, "body");
        e();
        try {
            body.run();
            B();
        } finally {
            i();
        }
    }

    public void B() {
        m().J().B();
    }

    public final Object C(Class cls, A2.h hVar) {
        if (cls.isInstance(hVar)) {
            return hVar;
        }
        if (hVar instanceof v2.g) {
            return C(cls, ((v2.g) hVar).getDelegate());
        }
        return null;
    }

    public void c() {
        if (!this.f19490f && v()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void d() {
        if (!q() && this.f19496l.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public void e() {
        c();
        C2165c c2165c = this.f19495k;
        if (c2165c == null) {
            s();
        } else {
            c2165c.g(new g());
        }
    }

    public A2.k f(String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        c();
        d();
        return m().J().q(sql);
    }

    public abstract o g();

    public abstract A2.h h(v2.f fVar);

    public void i() {
        C2165c c2165c = this.f19495k;
        if (c2165c == null) {
            t();
        } else {
            c2165c.g(new h());
        }
    }

    public List j(Map autoMigrationSpecs) {
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        return CollectionsKt.emptyList();
    }

    public final Lock k() {
        ReentrantReadWriteLock.ReadLock readLock = this.f19494j.readLock();
        Intrinsics.checkNotNullExpressionValue(readLock, "readWriteLock.readLock()");
        return readLock;
    }

    public o l() {
        return this.f19489e;
    }

    public A2.h m() {
        A2.h hVar = this.f19488d;
        if (hVar != null) {
            return hVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("internalOpenHelper");
        return null;
    }

    public Executor n() {
        Executor executor = this.f19486b;
        if (executor != null) {
            return executor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("internalQueryExecutor");
        return null;
    }

    public Set o() {
        return SetsKt.emptySet();
    }

    public Map p() {
        return MapsKt.emptyMap();
    }

    public boolean q() {
        return m().J().W();
    }

    public void r(v2.f configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f19488d = h(configuration);
        Set o6 = o();
        BitSet bitSet = new BitSet();
        Iterator it = o6.iterator();
        while (true) {
            int i6 = -1;
            if (it.hasNext()) {
                Class cls = (Class) it.next();
                int size = configuration.f19425r.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i7 = size - 1;
                        if (cls.isAssignableFrom(configuration.f19425r.get(size).getClass())) {
                            bitSet.set(size);
                            i6 = size;
                            break;
                        } else if (i7 < 0) {
                            break;
                        } else {
                            size = i7;
                        }
                    }
                }
                if (i6 < 0) {
                    throw new IllegalArgumentException(("A required auto migration spec (" + cls.getCanonicalName() + ") is missing in the database configuration.").toString());
                }
                this.f19493i.put(cls, configuration.f19425r.get(i6));
            } else {
                int size2 = configuration.f19425r.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        int i8 = size2 - 1;
                        if (!bitSet.get(size2)) {
                            throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                        }
                        if (i8 < 0) {
                            break;
                        } else {
                            size2 = i8;
                        }
                    }
                }
                for (AbstractC2242b abstractC2242b : j(this.f19493i)) {
                    if (!configuration.f19411d.c(abstractC2242b.f20141a, abstractC2242b.f20142b)) {
                        configuration.f19411d.b(abstractC2242b);
                    }
                }
                y yVar = (y) C(y.class, m());
                if (yVar != null) {
                    yVar.D(configuration);
                }
                v2.d dVar = (v2.d) C(v2.d.class, m());
                if (dVar != null) {
                    this.f19495k = dVar.f19381b;
                    l().o(dVar.f19381b);
                }
                boolean z6 = configuration.f19414g == d.WRITE_AHEAD_LOGGING;
                m().setWriteAheadLoggingEnabled(z6);
                this.f19492h = configuration.f19412e;
                this.f19486b = configuration.f19415h;
                this.f19487c = new C(configuration.f19416i);
                this.f19490f = configuration.f19413f;
                this.f19491g = z6;
                if (configuration.f19417j != null) {
                    if (configuration.f19409b == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    l().p(configuration.f19408a, configuration.f19409b, configuration.f19417j);
                }
                Map p6 = p();
                BitSet bitSet2 = new BitSet();
                for (Map.Entry entry : p6.entrySet()) {
                    Class cls2 = (Class) entry.getKey();
                    for (Class cls3 : (List) entry.getValue()) {
                        int size3 = configuration.f19424q.size() - 1;
                        if (size3 >= 0) {
                            while (true) {
                                int i9 = size3 - 1;
                                if (cls3.isAssignableFrom(configuration.f19424q.get(size3).getClass())) {
                                    bitSet2.set(size3);
                                    break;
                                } else if (i9 < 0) {
                                    break;
                                } else {
                                    size3 = i9;
                                }
                            }
                        }
                        size3 = -1;
                        if (size3 < 0) {
                            throw new IllegalArgumentException(("A required type converter (" + cls3 + ") for " + cls2.getCanonicalName() + " is missing in the database configuration.").toString());
                        }
                        this.f19498n.put(cls3, configuration.f19424q.get(size3));
                    }
                }
                int size4 = configuration.f19424q.size() - 1;
                if (size4 < 0) {
                    return;
                }
                while (true) {
                    int i10 = size4 - 1;
                    if (!bitSet2.get(size4)) {
                        throw new IllegalArgumentException("Unexpected type converter " + configuration.f19424q.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                    }
                    if (i10 < 0) {
                        return;
                    } else {
                        size4 = i10;
                    }
                }
            }
        }
    }

    public final void s() {
        c();
        A2.g J6 = m().J();
        l().t(J6);
        if (J6.d0()) {
            J6.E();
        } else {
            J6.h();
        }
    }

    public final void t() {
        m().J().M();
        if (q()) {
            return;
        }
        l().l();
    }

    public void u(A2.g db) {
        Intrinsics.checkNotNullParameter(db, "db");
        l().i(db);
    }

    public final boolean v() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public boolean w() {
        Boolean bool;
        boolean isOpen;
        C2165c c2165c = this.f19495k;
        if (c2165c != null) {
            isOpen = c2165c.l();
        } else {
            A2.g gVar = this.f19485a;
            if (gVar == null) {
                bool = null;
                return Intrinsics.areEqual(bool, Boolean.TRUE);
            }
            isOpen = gVar.isOpen();
        }
        bool = Boolean.valueOf(isOpen);
        return Intrinsics.areEqual(bool, Boolean.TRUE);
    }

    public Cursor x(A2.j query, CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(query, "query");
        c();
        d();
        return cancellationSignal != null ? m().J().u(query, cancellationSignal) : m().J().g0(query);
    }

    public Object z(Callable body) {
        Intrinsics.checkNotNullParameter(body, "body");
        e();
        try {
            Object call = body.call();
            B();
            return call;
        } finally {
            i();
        }
    }
}
