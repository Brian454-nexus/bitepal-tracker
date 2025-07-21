package B2;

import A2.i;
import android.database.sqlite.SQLiteProgram;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class g implements i {

    /* renamed from: a, reason: collision with root package name */
    public final SQLiteProgram f313a;

    public g(SQLiteProgram delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f313a = delegate;
    }

    @Override // A2.i
    public void A(int i6, long j6) {
        this.f313a.bindLong(i6, j6);
    }

    @Override // A2.i
    public void H(int i6, byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f313a.bindBlob(i6, value);
    }

    @Override // A2.i
    public void Q(int i6) {
        this.f313a.bindNull(i6);
    }

    @Override // A2.i
    public void b(int i6, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f313a.bindString(i6, value);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f313a.close();
    }

    @Override // A2.i
    public void t(int i6, double d6) {
        this.f313a.bindDouble(i6, d6);
    }
}
