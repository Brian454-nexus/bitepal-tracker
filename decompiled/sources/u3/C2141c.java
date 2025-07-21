package u3;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.File;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import y3.InterfaceC2355a;
import z3.C2459b;

/* renamed from: u3.c, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C2141c extends SQLiteOpenHelper {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2355a f19183a;

    /* renamed from: b, reason: collision with root package name */
    public File f19184b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f19185c;

    /* renamed from: d, reason: collision with root package name */
    public int f19186d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2141c(Context context, String databaseName, InterfaceC2355a logger) {
        super(context, databaseName, (SQLiteDatabase.CursorFactory) null, 4);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(databaseName, "databaseName");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f19183a = logger;
        File databasePath = context.getDatabasePath(databaseName);
        Intrinsics.checkNotNullExpressionValue(databasePath, "getDatabasePath(...)");
        this.f19184b = databasePath;
        this.f19185c = true;
        this.f19186d = 4;
    }

    public final synchronized Long D(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (Long) P("long_store", key);
    }

    public final synchronized String I(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (String) P("store", key);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00f3, code lost:
    
        if (r12 != null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0097, code lost:
    
        if (r12 != null) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cd  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object P(java.lang.String r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.C2141c.P(java.lang.String, java.lang.String):java.lang.Object");
    }

    public final void R(IllegalStateException illegalStateException) {
        String message = illegalStateException.getMessage();
        if (message == null) {
            throw illegalStateException;
        }
        if (message.length() == 0) {
            throw illegalStateException;
        }
        if (!StringsKt.contains$default(message, "Couldn't read", false, 2, (Object) null)) {
            throw illegalStateException;
        }
        if (!StringsKt.contains$default(message, "CursorWindow", false, 2, (Object) null)) {
            throw illegalStateException;
        }
        a();
    }

    public final Cursor T(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, String str2, String[] strArr2, String str3) {
        return sQLiteDatabase.query(str, strArr, str2, strArr2, null, null, str3, null);
    }

    public final synchronized List Y() {
        return a0("events");
    }

    public final void a() {
        try {
            close();
        } catch (Exception e6) {
            C2459b.f21719c.a().a("close failed: " + e6.getMessage());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00fe, code lost:
    
        if (r4 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a2, code lost:
    
        if (r4 != null) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List a0(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.C2141c.a0(java.lang.String):java.util.List");
    }

    public final void c(RuntimeException runtimeException) {
        String message = runtimeException.getMessage();
        if (message == null) {
            throw runtimeException;
        }
        if (message.length() == 0) {
            throw runtimeException;
        }
        if (!StringsKt.startsWith$default(message, "Cursor window allocation of", false, 2, (Object) null) && !StringsKt.startsWith$default(message, "Could not allocate CursorWindow", false, 2, (Object) null)) {
            throw runtimeException;
        }
        throw new C2140b(message);
    }

    public final synchronized List f0() {
        return a0("identifys");
    }

    public final synchronized List k0() {
        if (this.f19186d < 4) {
            return CollectionsKt.emptyList();
        }
        return a0("identify_interceptor");
    }

    public final synchronized void o0(long j6) {
        p0("events", j6);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        this.f19185c = false;
        this.f19183a.a("Attempt to re-create existing legacy database file " + this.f19184b.getAbsolutePath());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i6, int i7) {
        this.f19186d = i6;
    }

    public final void p0(String str, long j6) {
        try {
            try {
                try {
                    getWritableDatabase().delete(str, "id = ?", new String[]{String.valueOf(j6)});
                } catch (StackOverflowError e6) {
                    C2459b.f21719c.a().a("remove events from " + str + " failed: " + e6.getMessage());
                    a();
                }
            } catch (SQLiteException e7) {
                C2459b.f21719c.a().a("remove events from " + str + " failed: " + e7.getMessage());
                a();
            }
        } finally {
            close();
        }
    }

    public final synchronized void q0(long j6) {
        p0("identifys", j6);
    }

    public final synchronized void r0(long j6) {
        if (this.f19186d < 4) {
            return;
        }
        p0("identify_interceptor", j6);
    }

    public final synchronized void s0(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        t0("long_store", key);
    }

    public final void t0(String str, String str2) {
        try {
            try {
                getWritableDatabase().delete(str, "key = ?", new String[]{str2});
            } catch (SQLiteException e6) {
                C2459b.f21719c.a().a("remove value from " + str + " failed: " + e6.getMessage());
                a();
            } catch (StackOverflowError e7) {
                C2459b.f21719c.a().a("remove value from " + str + " failed: " + e7.getMessage());
                a();
            }
        } finally {
            close();
        }
    }
}
