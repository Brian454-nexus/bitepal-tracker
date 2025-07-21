package X2;

import android.content.Context;
import g3.AbstractC1380l;
import g3.C1385q;
import kotlin.jvm.internal.Intrinsics;
import w2.AbstractC2242b;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class F extends AbstractC2242b {

    /* renamed from: c, reason: collision with root package name */
    public final Context f6110c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(Context context) {
        super(9, 10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f6110c = context;
    }

    @Override // w2.AbstractC2242b
    public void a(A2.g db) {
        Intrinsics.checkNotNullParameter(db, "db");
        db.n("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        C1385q.c(this.f6110c, db);
        AbstractC1380l.c(this.f6110c, db);
    }
}
