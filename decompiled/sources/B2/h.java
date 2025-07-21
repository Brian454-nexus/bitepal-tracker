package B2;

import A2.k;
import android.database.sqlite.SQLiteStatement;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class h extends g implements k {

    /* renamed from: b, reason: collision with root package name */
    public final SQLiteStatement f314b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(SQLiteStatement delegate) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f314b = delegate;
    }

    @Override // A2.k
    public long l0() {
        return this.f314b.executeInsert();
    }

    @Override // A2.k
    public int p() {
        return this.f314b.executeUpdateDelete();
    }
}
