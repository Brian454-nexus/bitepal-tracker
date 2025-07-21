package B2;

import A2.j;
import A2.k;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.os.CancellationSignal;
import android.text.TextUtils;
import java.util.List;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class c implements A2.g {

    /* renamed from: c, reason: collision with root package name */
    public static final a f278c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f279d = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f280e = new String[0];

    /* renamed from: a, reason: collision with root package name */
    public final SQLiteDatabase f281a;

    /* renamed from: b, reason: collision with root package name */
    public final List f282b;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends Lambda implements Function4 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j f283a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(j jVar) {
            super(4);
            this.f283a = jVar;
        }

        @Override // kotlin.jvm.functions.Function4
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SQLiteCursor invoke(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            j jVar = this.f283a;
            Intrinsics.checkNotNull(sQLiteQuery);
            jVar.a(new g(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public c(SQLiteDatabase delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f281a = delegate;
        this.f282b = delegate.getAttachedDbs();
    }

    public static final Cursor I(Function4 tmp0, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Cursor) tmp0.invoke(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }

    public static final Cursor P(j query, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        Intrinsics.checkNotNullParameter(query, "$query");
        Intrinsics.checkNotNull(sQLiteQuery);
        query.a(new g(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    @Override // A2.g
    public void B() {
        this.f281a.setTransactionSuccessful();
    }

    @Override // A2.g
    public void C(String sql, Object[] bindArgs) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        Intrinsics.checkNotNullParameter(bindArgs, "bindArgs");
        this.f281a.execSQL(sql, bindArgs);
    }

    public final boolean D(SQLiteDatabase sqLiteDatabase) {
        Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
        return Intrinsics.areEqual(this.f281a, sqLiteDatabase);
    }

    @Override // A2.g
    public void E() {
        this.f281a.beginTransactionNonExclusive();
    }

    @Override // A2.g
    public int F(String table, int i6, ContentValues values, String str, Object[] objArr) {
        Intrinsics.checkNotNullParameter(table, "table");
        Intrinsics.checkNotNullParameter(values, "values");
        if (values.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        int size = values.size();
        int length = objArr == null ? size : objArr.length + size;
        Object[] objArr2 = new Object[length];
        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE ");
        sb.append(f279d[i6]);
        sb.append(table);
        sb.append(" SET ");
        int i7 = 0;
        for (String str2 : values.keySet()) {
            sb.append(i7 > 0 ? com.amazon.a.a.o.b.f.f11248a : "");
            sb.append(str2);
            objArr2[i7] = values.get(str2);
            sb.append("=?");
            i7++;
        }
        if (objArr != null) {
            for (int i8 = size; i8 < length; i8++) {
                objArr2[i8] = objArr[i8 - size];
            }
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(" WHERE ");
            sb.append(str);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        k q6 = q(sb2);
        A2.a.f175c.b(q6, objArr2);
        return q6.p();
    }

    @Override // A2.g
    public Cursor K(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return g0(new A2.a(query));
    }

    @Override // A2.g
    public void M() {
        this.f281a.endTransaction();
    }

    @Override // A2.g
    public String U() {
        return this.f281a.getPath();
    }

    @Override // A2.g
    public boolean W() {
        return this.f281a.inTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f281a.close();
    }

    @Override // A2.g
    public boolean d0() {
        return A2.b.b(this.f281a);
    }

    @Override // A2.g
    public Cursor g0(j query) {
        Intrinsics.checkNotNullParameter(query, "query");
        final b bVar = new b(query);
        Cursor rawQueryWithFactory = this.f281a.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: B2.b
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                Cursor I6;
                I6 = c.I(Function4.this, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
                return I6;
            }
        }, query.c(), f280e, null);
        Intrinsics.checkNotNullExpressionValue(rawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return rawQueryWithFactory;
    }

    @Override // A2.g
    public void h() {
        this.f281a.beginTransaction();
    }

    @Override // A2.g
    public boolean isOpen() {
        return this.f281a.isOpen();
    }

    @Override // A2.g
    public List m() {
        return this.f282b;
    }

    @Override // A2.g
    public void n(String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        this.f281a.execSQL(sql);
    }

    @Override // A2.g
    public k q(String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        SQLiteStatement compileStatement = this.f281a.compileStatement(sql);
        Intrinsics.checkNotNullExpressionValue(compileStatement, "delegate.compileStatement(sql)");
        return new h(compileStatement);
    }

    @Override // A2.g
    public Cursor u(final j query, CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(query, "query");
        SQLiteDatabase sQLiteDatabase = this.f281a;
        String c6 = query.c();
        String[] strArr = f280e;
        Intrinsics.checkNotNull(cancellationSignal);
        return A2.b.c(sQLiteDatabase, c6, strArr, null, cancellationSignal, new SQLiteDatabase.CursorFactory() { // from class: B2.a
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase2, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                Cursor P5;
                P5 = c.P(j.this, sQLiteDatabase2, sQLiteCursorDriver, str, sQLiteQuery);
                return P5;
            }
        });
    }
}
