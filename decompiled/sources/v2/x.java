package v2;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class x implements A2.j, A2.i {

    /* renamed from: i, reason: collision with root package name */
    public static final a f19537i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    public static final TreeMap f19538j = new TreeMap();

    /* renamed from: a, reason: collision with root package name */
    public final int f19539a;

    /* renamed from: b, reason: collision with root package name */
    public volatile String f19540b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f19541c;

    /* renamed from: d, reason: collision with root package name */
    public final double[] f19542d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f19543e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[][] f19544f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f19545g;

    /* renamed from: h, reason: collision with root package name */
    public int f19546h;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final x a(String query, int i6) {
            Intrinsics.checkNotNullParameter(query, "query");
            TreeMap treeMap = x.f19538j;
            synchronized (treeMap) {
                Map.Entry ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i6));
                if (ceilingEntry == null) {
                    Unit unit = Unit.INSTANCE;
                    x xVar = new x(i6, null);
                    xVar.P(query, i6);
                    return xVar;
                }
                treeMap.remove(ceilingEntry.getKey());
                x sqliteQuery = (x) ceilingEntry.getValue();
                sqliteQuery.P(query, i6);
                Intrinsics.checkNotNullExpressionValue(sqliteQuery, "sqliteQuery");
                return sqliteQuery;
            }
        }

        public final void b() {
            TreeMap treeMap = x.f19538j;
            if (treeMap.size() <= 15) {
                return;
            }
            int size = treeMap.size() - 10;
            Iterator it = treeMap.descendingKeySet().iterator();
            Intrinsics.checkNotNullExpressionValue(it, "queryPool.descendingKeySet().iterator()");
            while (true) {
                int i6 = size - 1;
                if (size <= 0) {
                    return;
                }
                it.next();
                it.remove();
                size = i6;
            }
        }

        public a() {
        }
    }

    public /* synthetic */ x(int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(i6);
    }

    public static final x D(String str, int i6) {
        return f19537i.a(str, i6);
    }

    @Override // A2.i
    public void A(int i6, long j6) {
        this.f19545g[i6] = 2;
        this.f19541c[i6] = j6;
    }

    @Override // A2.i
    public void H(int i6, byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f19545g[i6] = 5;
        this.f19544f[i6] = value;
    }

    public int I() {
        return this.f19546h;
    }

    public final void P(String query, int i6) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.f19540b = query;
        this.f19546h = i6;
    }

    @Override // A2.i
    public void Q(int i6) {
        this.f19545g[i6] = 1;
    }

    public final void R() {
        TreeMap treeMap = f19538j;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f19539a), this);
            f19537i.b();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // A2.j
    public void a(A2.i statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        int I6 = I();
        if (1 > I6) {
            return;
        }
        int i6 = 1;
        while (true) {
            int i7 = this.f19545g[i6];
            if (i7 == 1) {
                statement.Q(i6);
            } else if (i7 == 2) {
                statement.A(i6, this.f19541c[i6]);
            } else if (i7 == 3) {
                statement.t(i6, this.f19542d[i6]);
            } else if (i7 == 4) {
                String str = this.f19543e[i6];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                statement.b(i6, str);
            } else if (i7 == 5) {
                byte[] bArr = this.f19544f[i6];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                statement.H(i6, bArr);
            }
            if (i6 == I6) {
                return;
            } else {
                i6++;
            }
        }
    }

    @Override // A2.i
    public void b(int i6, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f19545g[i6] = 4;
        this.f19543e[i6] = value;
    }

    @Override // A2.j
    public String c() {
        String str = this.f19540b;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // A2.i
    public void t(int i6, double d6) {
        this.f19545g[i6] = 3;
        this.f19542d[i6] = d6;
    }

    public x(int i6) {
        this.f19539a = i6;
        int i7 = i6 + 1;
        this.f19545g = new int[i7];
        this.f19541c = new long[i7];
        this.f19542d = new double[i7];
        this.f19543e = new String[i7];
        this.f19544f = new byte[i7];
    }
}
