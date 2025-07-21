package X2;

import kotlin.jvm.internal.Intrinsics;
import w2.AbstractC2242b;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class m extends AbstractC2242b {

    /* renamed from: c, reason: collision with root package name */
    public static final m f6173c = new m();

    public m() {
        super(7, 8);
    }

    @Override // w2.AbstractC2242b
    public void a(A2.g db) {
        Intrinsics.checkNotNullParameter(db, "db");
        db.n("\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ");
    }
}
