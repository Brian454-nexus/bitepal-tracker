package v2;

import A2.h;
import android.database.Cursor;
import java.util.Iterator;
import java.util.List;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import w2.AbstractC2242b;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class w extends h.a {

    /* renamed from: g, reason: collision with root package name */
    public static final a f19529g = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public f f19530c;

    /* renamed from: d, reason: collision with root package name */
    public final b f19531d;

    /* renamed from: e, reason: collision with root package name */
    public final String f19532e;

    /* renamed from: f, reason: collision with root package name */
    public final String f19533f;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(A2.g db) {
            Intrinsics.checkNotNullParameter(db, "db");
            Cursor K5 = db.K("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
            try {
                boolean z6 = false;
                if (K5.moveToFirst()) {
                    if (K5.getInt(0) == 0) {
                        z6 = true;
                    }
                }
                CloseableKt.closeFinally(K5, null);
                return z6;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(K5, th);
                    throw th2;
                }
            }
        }

        public final boolean b(A2.g db) {
            Intrinsics.checkNotNullParameter(db, "db");
            Cursor K5 = db.K("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
            try {
                boolean z6 = false;
                if (K5.moveToFirst()) {
                    if (K5.getInt(0) != 0) {
                        z6 = true;
                    }
                }
                CloseableKt.closeFinally(K5, null);
                return z6;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(K5, th);
                    throw th2;
                }
            }
        }

        public a() {
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f19534a;

        public b(int i6) {
            this.f19534a = i6;
        }

        public abstract void a(A2.g gVar);

        public abstract void b(A2.g gVar);

        public abstract void c(A2.g gVar);

        public abstract void d(A2.g gVar);

        public abstract void e(A2.g gVar);

        public abstract void f(A2.g gVar);

        public abstract c g(A2.g gVar);
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f19535a;

        /* renamed from: b, reason: collision with root package name */
        public final String f19536b;

        public c(boolean z6, String str) {
            this.f19535a = z6;
            this.f19536b = str;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(f configuration, b delegate, String identityHash, String legacyHash) {
        super(delegate.f19534a);
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(identityHash, "identityHash");
        Intrinsics.checkNotNullParameter(legacyHash, "legacyHash");
        this.f19530c = configuration;
        this.f19531d = delegate;
        this.f19532e = identityHash;
        this.f19533f = legacyHash;
    }

    @Override // A2.h.a
    public void b(A2.g db) {
        Intrinsics.checkNotNullParameter(db, "db");
        super.b(db);
    }

    @Override // A2.h.a
    public void d(A2.g db) {
        Intrinsics.checkNotNullParameter(db, "db");
        boolean a6 = f19529g.a(db);
        this.f19531d.a(db);
        if (!a6) {
            c g6 = this.f19531d.g(db);
            if (!g6.f19535a) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + g6.f19536b);
            }
        }
        j(db);
        this.f19531d.c(db);
    }

    @Override // A2.h.a
    public void e(A2.g db, int i6, int i7) {
        Intrinsics.checkNotNullParameter(db, "db");
        g(db, i6, i7);
    }

    @Override // A2.h.a
    public void f(A2.g db) {
        Intrinsics.checkNotNullParameter(db, "db");
        super.f(db);
        h(db);
        this.f19531d.d(db);
        this.f19530c = null;
    }

    @Override // A2.h.a
    public void g(A2.g db, int i6, int i7) {
        List d6;
        Intrinsics.checkNotNullParameter(db, "db");
        f fVar = this.f19530c;
        if (fVar == null || (d6 = fVar.f19411d.d(i6, i7)) == null) {
            f fVar2 = this.f19530c;
            if (fVar2 != null && !fVar2.a(i6, i7)) {
                this.f19531d.b(db);
                this.f19531d.a(db);
                return;
            }
            throw new IllegalStateException("A migration from " + i6 + " to " + i7 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
        }
        this.f19531d.f(db);
        Iterator it = d6.iterator();
        while (it.hasNext()) {
            ((AbstractC2242b) it.next()).a(db);
        }
        c g6 = this.f19531d.g(db);
        if (g6.f19535a) {
            this.f19531d.e(db);
            j(db);
        } else {
            throw new IllegalStateException("Migration didn't properly handle: " + g6.f19536b);
        }
    }

    public final void h(A2.g gVar) {
        if (!f19529g.b(gVar)) {
            c g6 = this.f19531d.g(gVar);
            if (g6.f19535a) {
                this.f19531d.e(gVar);
                j(gVar);
                return;
            } else {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + g6.f19536b);
            }
        }
        Cursor g02 = gVar.g0(new A2.a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
        try {
            String string = g02.moveToFirst() ? g02.getString(0) : null;
            CloseableKt.closeFinally(g02, null);
            if (Intrinsics.areEqual(this.f19532e, string) || Intrinsics.areEqual(this.f19533f, string)) {
                return;
            }
            throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + this.f19532e + ", found: " + string);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(g02, th);
                throw th2;
            }
        }
    }

    public final void i(A2.g gVar) {
        gVar.n("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    public final void j(A2.g gVar) {
        i(gVar);
        gVar.n(v.a(this.f19532e));
    }
}
