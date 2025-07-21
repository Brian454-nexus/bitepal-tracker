package A2;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface h extends Closeable {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class a {

        /* renamed from: b, reason: collision with root package name */
        public static final C0003a f183b = new C0003a(null);

        /* renamed from: a, reason: collision with root package name */
        public final int f184a;

        /* renamed from: A2.h$a$a, reason: collision with other inner class name */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class C0003a {
            public /* synthetic */ C0003a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public C0003a() {
            }
        }

        public a(int i6) {
            this.f184a = i6;
        }

        public final void a(String str) {
            if (StringsKt.equals(str, ":memory:", true)) {
                return;
            }
            int length = str.length() - 1;
            int i6 = 0;
            boolean z6 = false;
            while (i6 <= length) {
                boolean z7 = Intrinsics.compare((int) str.charAt(!z6 ? i6 : length), 32) <= 0;
                if (z6) {
                    if (!z7) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z7) {
                    i6++;
                } else {
                    z6 = true;
                }
            }
            if (str.subSequence(i6, length + 1).toString().length() == 0) {
                return;
            }
            Log.w("SupportSQLite", "deleting the database file: " + str);
            try {
                A2.b.a(new File(str));
            } catch (Exception e6) {
                Log.w("SupportSQLite", "delete failed: ", e6);
            }
        }

        public void b(g db) {
            Intrinsics.checkNotNullParameter(db, "db");
        }

        public void c(g db) {
            Intrinsics.checkNotNullParameter(db, "db");
            Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + db + ".path");
            if (!db.isOpen()) {
                String U5 = db.U();
                if (U5 != null) {
                    a(U5);
                    return;
                }
                return;
            }
            List list = null;
            try {
                try {
                    list = db.m();
                } catch (SQLiteException unused) {
                }
                try {
                    db.close();
                } catch (IOException unused2) {
                    if (list != null) {
                        return;
                    }
                }
            } finally {
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        Object obj = ((Pair) it.next()).second;
                        Intrinsics.checkNotNullExpressionValue(obj, "p.second");
                        a((String) obj);
                    }
                } else {
                    String U6 = db.U();
                    if (U6 != null) {
                        a(U6);
                    }
                }
            }
        }

        public abstract void d(g gVar);

        public abstract void e(g gVar, int i6, int i7);

        public void f(g db) {
            Intrinsics.checkNotNullParameter(db, "db");
        }

        public abstract void g(g gVar, int i6, int i7);
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {

        /* renamed from: f, reason: collision with root package name */
        public static final C0004b f185f = new C0004b(null);

        /* renamed from: a, reason: collision with root package name */
        public final Context f186a;

        /* renamed from: b, reason: collision with root package name */
        public final String f187b;

        /* renamed from: c, reason: collision with root package name */
        public final a f188c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f189d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f190e;

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static class a {

            /* renamed from: a, reason: collision with root package name */
            public final Context f191a;

            /* renamed from: b, reason: collision with root package name */
            public String f192b;

            /* renamed from: c, reason: collision with root package name */
            public a f193c;

            /* renamed from: d, reason: collision with root package name */
            public boolean f194d;

            /* renamed from: e, reason: collision with root package name */
            public boolean f195e;

            public a(Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                this.f191a = context;
            }

            public a a(boolean z6) {
                this.f195e = z6;
                return this;
            }

            public b b() {
                String str;
                a aVar = this.f193c;
                if (aVar == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                }
                if (this.f194d && ((str = this.f192b) == null || str.length() == 0)) {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                }
                return new b(this.f191a, this.f192b, aVar, this.f194d, this.f195e);
            }

            public a c(a callback) {
                Intrinsics.checkNotNullParameter(callback, "callback");
                this.f193c = callback;
                return this;
            }

            public a d(String str) {
                this.f192b = str;
                return this;
            }

            public a e(boolean z6) {
                this.f194d = z6;
                return this;
            }
        }

        /* renamed from: A2.h$b$b, reason: collision with other inner class name */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class C0004b {
            public /* synthetic */ C0004b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                return new a(context);
            }

            public C0004b() {
            }
        }

        public b(Context context, String str, a callback, boolean z6, boolean z7) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f186a = context;
            this.f187b = str;
            this.f188c = callback;
            this.f189d = z6;
            this.f190e = z7;
        }

        public static final a a(Context context) {
            return f185f.a(context);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface c {
        h a(b bVar);
    }

    g J();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z6);
}
