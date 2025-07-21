package v2;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class d implements A2.h, g {

    /* renamed from: a, reason: collision with root package name */
    public final A2.h f19380a;

    /* renamed from: b, reason: collision with root package name */
    public final C2165c f19381b;

    /* renamed from: c, reason: collision with root package name */
    public final a f19382c;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a implements A2.g {

        /* renamed from: a, reason: collision with root package name */
        public final C2165c f19383a;

        /* renamed from: v2.d$a$a, reason: collision with other inner class name */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class C0257a extends Lambda implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final C0257a f19384a = new C0257a();

            public C0257a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List invoke(A2.g obj) {
                Intrinsics.checkNotNullParameter(obj, "obj");
                return obj.m();
            }
        }

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class b extends Lambda implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f19385a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str) {
                super(1);
                this.f19385a = str;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(A2.g db) {
                Intrinsics.checkNotNullParameter(db, "db");
                db.n(this.f19385a);
                return null;
            }
        }

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class c extends Lambda implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f19386a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Object[] f19387b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String str, Object[] objArr) {
                super(1);
                this.f19386a = str;
                this.f19387b = objArr;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(A2.g db) {
                Intrinsics.checkNotNullParameter(db, "db");
                db.C(this.f19386a, this.f19387b);
                return null;
            }
        }

        /* renamed from: v2.d$a$d, reason: collision with other inner class name */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public /* synthetic */ class C0258d extends FunctionReferenceImpl implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final C0258d f19388a = new C0258d();

            public C0258d() {
                super(1, A2.g.class, "inTransaction", "inTransaction()Z", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(A2.g p02) {
                Intrinsics.checkNotNullParameter(p02, "p0");
                return Boolean.valueOf(p02.W());
            }
        }

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class e extends Lambda implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final e f19389a = new e();

            public e() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(A2.g db) {
                Intrinsics.checkNotNullParameter(db, "db");
                return Boolean.valueOf(db.d0());
            }
        }

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class f extends Lambda implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final f f19390a = new f();

            public f() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(A2.g obj) {
                Intrinsics.checkNotNullParameter(obj, "obj");
                return obj.U();
            }
        }

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class g extends Lambda implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final g f19391a = new g();

            public g() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(A2.g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return null;
            }
        }

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class h extends Lambda implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f19392a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f19393b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ContentValues f19394c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f19395d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ Object[] f19396e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public h(String str, int i6, ContentValues contentValues, String str2, Object[] objArr) {
                super(1);
                this.f19392a = str;
                this.f19393b = i6;
                this.f19394c = contentValues;
                this.f19395d = str2;
                this.f19396e = objArr;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(A2.g db) {
                Intrinsics.checkNotNullParameter(db, "db");
                return Integer.valueOf(db.F(this.f19392a, this.f19393b, this.f19394c, this.f19395d, this.f19396e));
            }
        }

        public a(C2165c autoCloser) {
            Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
            this.f19383a = autoCloser;
        }

        @Override // A2.g
        public void B() {
            Unit unit;
            A2.g h6 = this.f19383a.h();
            if (h6 != null) {
                h6.B();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                throw new IllegalStateException("setTransactionSuccessful called but delegateDb is null");
            }
        }

        @Override // A2.g
        public void C(String sql, Object[] bindArgs) {
            Intrinsics.checkNotNullParameter(sql, "sql");
            Intrinsics.checkNotNullParameter(bindArgs, "bindArgs");
            this.f19383a.g(new c(sql, bindArgs));
        }

        @Override // A2.g
        public void E() {
            try {
                this.f19383a.j().E();
            } catch (Throwable th) {
                this.f19383a.e();
                throw th;
            }
        }

        @Override // A2.g
        public int F(String table, int i6, ContentValues values, String str, Object[] objArr) {
            Intrinsics.checkNotNullParameter(table, "table");
            Intrinsics.checkNotNullParameter(values, "values");
            return ((Number) this.f19383a.g(new h(table, i6, values, str, objArr))).intValue();
        }

        @Override // A2.g
        public Cursor K(String query) {
            Intrinsics.checkNotNullParameter(query, "query");
            try {
                return new c(this.f19383a.j().K(query), this.f19383a);
            } catch (Throwable th) {
                this.f19383a.e();
                throw th;
            }
        }

        @Override // A2.g
        public void M() {
            if (this.f19383a.h() == null) {
                throw new IllegalStateException("End transaction called but delegateDb is null");
            }
            try {
                A2.g h6 = this.f19383a.h();
                Intrinsics.checkNotNull(h6);
                h6.M();
            } finally {
                this.f19383a.e();
            }
        }

        @Override // A2.g
        public String U() {
            return (String) this.f19383a.g(f.f19390a);
        }

        @Override // A2.g
        public boolean W() {
            if (this.f19383a.h() == null) {
                return false;
            }
            return ((Boolean) this.f19383a.g(C0258d.f19388a)).booleanValue();
        }

        public final void a() {
            this.f19383a.g(g.f19391a);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f19383a.d();
        }

        @Override // A2.g
        public boolean d0() {
            return ((Boolean) this.f19383a.g(e.f19389a)).booleanValue();
        }

        @Override // A2.g
        public Cursor g0(A2.j query) {
            Intrinsics.checkNotNullParameter(query, "query");
            try {
                return new c(this.f19383a.j().g0(query), this.f19383a);
            } catch (Throwable th) {
                this.f19383a.e();
                throw th;
            }
        }

        @Override // A2.g
        public void h() {
            try {
                this.f19383a.j().h();
            } catch (Throwable th) {
                this.f19383a.e();
                throw th;
            }
        }

        @Override // A2.g
        public boolean isOpen() {
            A2.g h6 = this.f19383a.h();
            if (h6 == null) {
                return false;
            }
            return h6.isOpen();
        }

        @Override // A2.g
        public List m() {
            return (List) this.f19383a.g(C0257a.f19384a);
        }

        @Override // A2.g
        public void n(String sql) {
            Intrinsics.checkNotNullParameter(sql, "sql");
            this.f19383a.g(new b(sql));
        }

        @Override // A2.g
        public A2.k q(String sql) {
            Intrinsics.checkNotNullParameter(sql, "sql");
            return new b(sql, this.f19383a);
        }

        @Override // A2.g
        public Cursor u(A2.j query, CancellationSignal cancellationSignal) {
            Intrinsics.checkNotNullParameter(query, "query");
            try {
                return new c(this.f19383a.j().u(query, cancellationSignal), this.f19383a);
            } catch (Throwable th) {
                this.f19383a.e();
                throw th;
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b implements A2.k {

        /* renamed from: a, reason: collision with root package name */
        public final String f19397a;

        /* renamed from: b, reason: collision with root package name */
        public final C2165c f19398b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f19399c;

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class a extends Lambda implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final a f19400a = new a();

            public a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Long invoke(A2.k obj) {
                Intrinsics.checkNotNullParameter(obj, "obj");
                return Long.valueOf(obj.l0());
            }
        }

        /* renamed from: v2.d$b$b, reason: collision with other inner class name */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class C0259b extends Lambda implements Function1 {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Function1 f19402b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0259b(Function1 function1) {
                super(1);
                this.f19402b = function1;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(A2.g db) {
                Intrinsics.checkNotNullParameter(db, "db");
                A2.k q6 = db.q(b.this.f19397a);
                b.this.D(q6);
                return this.f19402b.invoke(q6);
            }
        }

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class c extends Lambda implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final c f19403a = new c();

            public c() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(A2.k obj) {
                Intrinsics.checkNotNullParameter(obj, "obj");
                return Integer.valueOf(obj.p());
            }
        }

        public b(String sql, C2165c autoCloser) {
            Intrinsics.checkNotNullParameter(sql, "sql");
            Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
            this.f19397a = sql;
            this.f19398b = autoCloser;
            this.f19399c = new ArrayList();
        }

        @Override // A2.i
        public void A(int i6, long j6) {
            P(i6, Long.valueOf(j6));
        }

        public final void D(A2.k kVar) {
            Iterator it = this.f19399c.iterator();
            int i6 = 0;
            while (it.hasNext()) {
                it.next();
                int i7 = i6 + 1;
                if (i6 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Object obj = this.f19399c.get(i6);
                if (obj == null) {
                    kVar.Q(i7);
                } else if (obj instanceof Long) {
                    kVar.A(i7, ((Number) obj).longValue());
                } else if (obj instanceof Double) {
                    kVar.t(i7, ((Number) obj).doubleValue());
                } else if (obj instanceof String) {
                    kVar.b(i7, (String) obj);
                } else if (obj instanceof byte[]) {
                    kVar.H(i7, (byte[]) obj);
                }
                i6 = i7;
            }
        }

        @Override // A2.i
        public void H(int i6, byte[] value) {
            Intrinsics.checkNotNullParameter(value, "value");
            P(i6, value);
        }

        public final Object I(Function1 function1) {
            return this.f19398b.g(new C0259b(function1));
        }

        public final void P(int i6, Object obj) {
            int size;
            int i7 = i6 - 1;
            if (i7 >= this.f19399c.size() && (size = this.f19399c.size()) <= i7) {
                while (true) {
                    this.f19399c.add(null);
                    if (size == i7) {
                        break;
                    } else {
                        size++;
                    }
                }
            }
            this.f19399c.set(i7, obj);
        }

        @Override // A2.i
        public void Q(int i6) {
            P(i6, null);
        }

        @Override // A2.i
        public void b(int i6, String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            P(i6, value);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // A2.k
        public long l0() {
            return ((Number) I(a.f19400a)).longValue();
        }

        @Override // A2.k
        public int p() {
            return ((Number) I(c.f19403a)).intValue();
        }

        @Override // A2.i
        public void t(int i6, double d6) {
            P(i6, Double.valueOf(d6));
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c implements Cursor {

        /* renamed from: a, reason: collision with root package name */
        public final Cursor f19404a;

        /* renamed from: b, reason: collision with root package name */
        public final C2165c f19405b;

        public c(Cursor delegate, C2165c autoCloser) {
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
            this.f19404a = delegate;
            this.f19405b = autoCloser;
        }

        @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f19404a.close();
            this.f19405b.e();
        }

        @Override // android.database.Cursor
        public void copyStringToBuffer(int i6, CharArrayBuffer charArrayBuffer) {
            this.f19404a.copyStringToBuffer(i6, charArrayBuffer);
        }

        @Override // android.database.Cursor
        public void deactivate() {
            this.f19404a.deactivate();
        }

        @Override // android.database.Cursor
        public byte[] getBlob(int i6) {
            return this.f19404a.getBlob(i6);
        }

        @Override // android.database.Cursor
        public int getColumnCount() {
            return this.f19404a.getColumnCount();
        }

        @Override // android.database.Cursor
        public int getColumnIndex(String str) {
            return this.f19404a.getColumnIndex(str);
        }

        @Override // android.database.Cursor
        public int getColumnIndexOrThrow(String str) {
            return this.f19404a.getColumnIndexOrThrow(str);
        }

        @Override // android.database.Cursor
        public String getColumnName(int i6) {
            return this.f19404a.getColumnName(i6);
        }

        @Override // android.database.Cursor
        public String[] getColumnNames() {
            return this.f19404a.getColumnNames();
        }

        @Override // android.database.Cursor
        public int getCount() {
            return this.f19404a.getCount();
        }

        @Override // android.database.Cursor
        public double getDouble(int i6) {
            return this.f19404a.getDouble(i6);
        }

        @Override // android.database.Cursor
        public Bundle getExtras() {
            return this.f19404a.getExtras();
        }

        @Override // android.database.Cursor
        public float getFloat(int i6) {
            return this.f19404a.getFloat(i6);
        }

        @Override // android.database.Cursor
        public int getInt(int i6) {
            return this.f19404a.getInt(i6);
        }

        @Override // android.database.Cursor
        public long getLong(int i6) {
            return this.f19404a.getLong(i6);
        }

        @Override // android.database.Cursor
        public Uri getNotificationUri() {
            return A2.c.a(this.f19404a);
        }

        @Override // android.database.Cursor
        public List getNotificationUris() {
            return A2.f.a(this.f19404a);
        }

        @Override // android.database.Cursor
        public int getPosition() {
            return this.f19404a.getPosition();
        }

        @Override // android.database.Cursor
        public short getShort(int i6) {
            return this.f19404a.getShort(i6);
        }

        @Override // android.database.Cursor
        public String getString(int i6) {
            return this.f19404a.getString(i6);
        }

        @Override // android.database.Cursor
        public int getType(int i6) {
            return this.f19404a.getType(i6);
        }

        @Override // android.database.Cursor
        public boolean getWantsAllOnMoveCalls() {
            return this.f19404a.getWantsAllOnMoveCalls();
        }

        @Override // android.database.Cursor
        public boolean isAfterLast() {
            return this.f19404a.isAfterLast();
        }

        @Override // android.database.Cursor
        public boolean isBeforeFirst() {
            return this.f19404a.isBeforeFirst();
        }

        @Override // android.database.Cursor
        public boolean isClosed() {
            return this.f19404a.isClosed();
        }

        @Override // android.database.Cursor
        public boolean isFirst() {
            return this.f19404a.isFirst();
        }

        @Override // android.database.Cursor
        public boolean isLast() {
            return this.f19404a.isLast();
        }

        @Override // android.database.Cursor
        public boolean isNull(int i6) {
            return this.f19404a.isNull(i6);
        }

        @Override // android.database.Cursor
        public boolean move(int i6) {
            return this.f19404a.move(i6);
        }

        @Override // android.database.Cursor
        public boolean moveToFirst() {
            return this.f19404a.moveToFirst();
        }

        @Override // android.database.Cursor
        public boolean moveToLast() {
            return this.f19404a.moveToLast();
        }

        @Override // android.database.Cursor
        public boolean moveToNext() {
            return this.f19404a.moveToNext();
        }

        @Override // android.database.Cursor
        public boolean moveToPosition(int i6) {
            return this.f19404a.moveToPosition(i6);
        }

        @Override // android.database.Cursor
        public boolean moveToPrevious() {
            return this.f19404a.moveToPrevious();
        }

        @Override // android.database.Cursor
        public void registerContentObserver(ContentObserver contentObserver) {
            this.f19404a.registerContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            this.f19404a.registerDataSetObserver(dataSetObserver);
        }

        @Override // android.database.Cursor
        public boolean requery() {
            return this.f19404a.requery();
        }

        @Override // android.database.Cursor
        public Bundle respond(Bundle bundle) {
            return this.f19404a.respond(bundle);
        }

        @Override // android.database.Cursor
        public void setExtras(Bundle extras) {
            Intrinsics.checkNotNullParameter(extras, "extras");
            A2.e.a(this.f19404a, extras);
        }

        @Override // android.database.Cursor
        public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
            this.f19404a.setNotificationUri(contentResolver, uri);
        }

        @Override // android.database.Cursor
        public void setNotificationUris(ContentResolver cr, List uris) {
            Intrinsics.checkNotNullParameter(cr, "cr");
            Intrinsics.checkNotNullParameter(uris, "uris");
            A2.f.b(this.f19404a, cr, uris);
        }

        @Override // android.database.Cursor
        public void unregisterContentObserver(ContentObserver contentObserver) {
            this.f19404a.unregisterContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            this.f19404a.unregisterDataSetObserver(dataSetObserver);
        }
    }

    public d(A2.h delegate, C2165c autoCloser) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
        this.f19380a = delegate;
        this.f19381b = autoCloser;
        autoCloser.k(getDelegate());
        this.f19382c = new a(autoCloser);
    }

    @Override // A2.h
    public A2.g J() {
        this.f19382c.a();
        return this.f19382c;
    }

    @Override // A2.h, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f19382c.close();
    }

    @Override // A2.h
    public String getDatabaseName() {
        return this.f19380a.getDatabaseName();
    }

    @Override // v2.g
    public A2.h getDelegate() {
        return this.f19380a;
    }

    @Override // A2.h
    public void setWriteAheadLoggingEnabled(boolean z6) {
        this.f19380a.setWriteAheadLoggingEnabled(z6);
    }
}
