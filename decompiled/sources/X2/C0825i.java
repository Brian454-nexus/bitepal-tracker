package X2;

import kotlin.jvm.internal.Intrinsics;
import w2.AbstractC2242b;

/* renamed from: X2.i, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0825i extends AbstractC2242b {

    /* renamed from: c, reason: collision with root package name */
    public static final C0825i f6169c = new C0825i();

    public C0825i() {
        super(1, 2);
    }

    @Override // w2.AbstractC2242b
    public void a(A2.g db) {
        Intrinsics.checkNotNullParameter(db, "db");
        db.n("\n    CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id`\n    INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
        db.n("\n    INSERT INTO SystemIdInfo(work_spec_id, system_id)\n    SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo\n    ");
        db.n("DROP TABLE IF EXISTS alarmInfo");
        db.n("\n                INSERT OR IGNORE INTO worktag(tag, work_spec_id)\n                SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec\n                ");
    }
}
