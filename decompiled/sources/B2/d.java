package B2;

import A2.h;
import B2.d;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import java.io.File;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class d implements A2.h {

    /* renamed from: h, reason: collision with root package name */
    public static final a f284h = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final Context f285a;

    /* renamed from: b, reason: collision with root package name */
    public final String f286b;

    /* renamed from: c, reason: collision with root package name */
    public final h.a f287c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f288d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f289e;

    /* renamed from: f, reason: collision with root package name */
    public final Lazy f290f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f291g;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public B2.c f292a;

        public b(B2.c cVar) {
            this.f292a = cVar;
        }

        public final B2.c a() {
            return this.f292a;
        }

        public final void b(B2.c cVar) {
            this.f292a = cVar;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c extends SQLiteOpenHelper {

        /* renamed from: h, reason: collision with root package name */
        public static final C0009c f293h = new C0009c(null);

        /* renamed from: a, reason: collision with root package name */
        public final Context f294a;

        /* renamed from: b, reason: collision with root package name */
        public final b f295b;

        /* renamed from: c, reason: collision with root package name */
        public final h.a f296c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f297d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f298e;

        /* renamed from: f, reason: collision with root package name */
        public final C2.a f299f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f300g;

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class a extends RuntimeException {

            /* renamed from: a, reason: collision with root package name */
            public final b f301a;

            /* renamed from: b, reason: collision with root package name */
            public final Throwable f302b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b callbackName, Throwable cause) {
                super(cause);
                Intrinsics.checkNotNullParameter(callbackName, "callbackName");
                Intrinsics.checkNotNullParameter(cause, "cause");
                this.f301a = callbackName;
                this.f302b = cause;
            }

            public final b a() {
                return this.f301a;
            }

            @Override // java.lang.Throwable
            public Throwable getCause() {
                return this.f302b;
            }
        }

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public enum b {
            ON_CONFIGURE,
            ON_CREATE,
            ON_UPGRADE,
            ON_DOWNGRADE,
            ON_OPEN
        }

        /* renamed from: B2.d$c$c, reason: collision with other inner class name */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class C0009c {
            public /* synthetic */ C0009c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final B2.c a(b refHolder, SQLiteDatabase sqLiteDatabase) {
                Intrinsics.checkNotNullParameter(refHolder, "refHolder");
                Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
                B2.c a6 = refHolder.a();
                if (a6 != null && a6.D(sqLiteDatabase)) {
                    return a6;
                }
                B2.c cVar = new B2.c(sqLiteDatabase);
                refHolder.b(cVar);
                return cVar;
            }

            public C0009c() {
            }
        }

        /* renamed from: B2.d$c$d, reason: collision with other inner class name */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public /* synthetic */ class C0010d {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f309a;

            static {
                int[] iArr = new int[b.values().length];
                try {
                    iArr[b.ON_CONFIGURE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b.ON_CREATE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[b.ON_UPGRADE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[b.ON_DOWNGRADE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[b.ON_OPEN.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f309a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, String str, final b dbRef, final h.a callback, boolean z6) {
            super(context, str, null, callback.f184a, new DatabaseErrorHandler() { // from class: B2.e
                @Override // android.database.DatabaseErrorHandler
                public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                    d.c.c(h.a.this, dbRef, sQLiteDatabase);
                }
            });
            String str2;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(dbRef, "dbRef");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f294a = context;
            this.f295b = dbRef;
            this.f296c = callback;
            this.f297d = z6;
            if (str == null) {
                str2 = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(str2, "randomUUID().toString()");
            } else {
                str2 = str;
            }
            File cacheDir = context.getCacheDir();
            Intrinsics.checkNotNullExpressionValue(cacheDir, "context.cacheDir");
            this.f299f = new C2.a(str2, cacheDir, false);
        }

        public static final void c(h.a callback, b dbRef, SQLiteDatabase dbObj) {
            Intrinsics.checkNotNullParameter(callback, "$callback");
            Intrinsics.checkNotNullParameter(dbRef, "$dbRef");
            C0009c c0009c = f293h;
            Intrinsics.checkNotNullExpressionValue(dbObj, "dbObj");
            callback.c(c0009c.a(dbRef, dbObj));
        }

        public final A2.g D(boolean z6) {
            A2.g I6;
            try {
                this.f299f.b((this.f300g || getDatabaseName() == null) ? false : true);
                this.f298e = false;
                SQLiteDatabase R5 = R(z6);
                if (this.f298e) {
                    close();
                    I6 = D(z6);
                } else {
                    I6 = I(R5);
                }
                this.f299f.d();
                return I6;
            } catch (Throwable th) {
                this.f299f.d();
                throw th;
            }
        }

        public final B2.c I(SQLiteDatabase sqLiteDatabase) {
            Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
            return f293h.a(this.f295b, sqLiteDatabase);
        }

        public final SQLiteDatabase P(boolean z6) {
            if (z6) {
                SQLiteDatabase writableDatabase = super.getWritableDatabase();
                Intrinsics.checkNotNullExpressionValue(writableDatabase, "{\n                super.…eDatabase()\n            }");
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase = super.getReadableDatabase();
            Intrinsics.checkNotNullExpressionValue(readableDatabase, "{\n                super.…eDatabase()\n            }");
            return readableDatabase;
        }

        public final SQLiteDatabase R(boolean z6) {
            File parentFile;
            String databaseName = getDatabaseName();
            if (databaseName != null && (parentFile = this.f294a.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
                }
            }
            try {
                return P(z6);
            } catch (Throwable unused) {
                super.close();
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    return P(z6);
                } catch (Throwable th) {
                    super.close();
                    if (th instanceof a) {
                        a aVar = th;
                        Throwable cause = aVar.getCause();
                        int i6 = C0010d.f309a[aVar.a().ordinal()];
                        if (i6 == 1) {
                            throw cause;
                        }
                        if (i6 == 2) {
                            throw cause;
                        }
                        if (i6 == 3) {
                            throw cause;
                        }
                        if (i6 == 4) {
                            throw cause;
                        }
                        if (!(cause instanceof SQLiteException)) {
                            throw cause;
                        }
                    } else {
                        if (!(th instanceof SQLiteException)) {
                            throw th;
                        }
                        if (databaseName == null || !this.f297d) {
                            throw th;
                        }
                    }
                    this.f294a.deleteDatabase(databaseName);
                    try {
                        return P(z6);
                    } catch (a e6) {
                        throw e6.getCause();
                    }
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public void close() {
            try {
                C2.a.c(this.f299f, false, 1, null);
                super.close();
                this.f295b.b(null);
                this.f300g = false;
            } finally {
                this.f299f.d();
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            try {
                this.f296c.b(I(db));
            } catch (Throwable th) {
                throw new a(b.ON_CONFIGURE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sqLiteDatabase) {
            Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
            try {
                this.f296c.d(I(sqLiteDatabase));
            } catch (Throwable th) {
                throw new a(b.ON_CREATE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase db, int i6, int i7) {
            Intrinsics.checkNotNullParameter(db, "db");
            this.f298e = true;
            try {
                this.f296c.e(I(db), i6, i7);
            } catch (Throwable th) {
                throw new a(b.ON_DOWNGRADE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            if (!this.f298e) {
                try {
                    this.f296c.f(I(db));
                } catch (Throwable th) {
                    throw new a(b.ON_OPEN, th);
                }
            }
            this.f300g = true;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i6, int i7) {
            Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
            this.f298e = true;
            try {
                this.f296c.g(I(sqLiteDatabase), i6, i7);
            } catch (Throwable th) {
                throw new a(b.ON_UPGRADE, th);
            }
        }
    }

    /* renamed from: B2.d$d, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class C0011d extends Lambda implements Function0 {
        public C0011d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c invoke() {
            c cVar;
            if (d.this.f286b == null || !d.this.f288d) {
                cVar = new c(d.this.f285a, d.this.f286b, new b(null), d.this.f287c, d.this.f289e);
            } else {
                cVar = new c(d.this.f285a, new File(A2.d.a(d.this.f285a), d.this.f286b).getAbsolutePath(), new b(null), d.this.f287c, d.this.f289e);
            }
            A2.b.d(cVar, d.this.f291g);
            return cVar;
        }
    }

    public d(Context context, String str, h.a callback, boolean z6, boolean z7) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f285a = context;
        this.f286b = str;
        this.f287c = callback;
        this.f288d = z6;
        this.f289e = z7;
        this.f290f = LazyKt.lazy(new C0011d());
    }

    @Override // A2.h
    public A2.g J() {
        return T().D(true);
    }

    public final c T() {
        return (c) this.f290f.getValue();
    }

    @Override // A2.h, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f290f.isInitialized()) {
            T().close();
        }
    }

    @Override // A2.h
    public String getDatabaseName() {
        return this.f286b;
    }

    @Override // A2.h
    public void setWriteAheadLoggingEnabled(boolean z6) {
        if (this.f290f.isInitialized()) {
            A2.b.d(T(), z6);
        }
        this.f291g = z6;
    }
}
