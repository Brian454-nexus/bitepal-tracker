package X2;

import kotlin.jvm.internal.Intrinsics;
import v2.u;

/* renamed from: X2.c, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0819c extends u.b {

    /* renamed from: a, reason: collision with root package name */
    public static final C0819c f6164a = new C0819c();

    @Override // v2.u.b
    public void c(A2.g db) {
        Intrinsics.checkNotNullParameter(db, "db");
        super.c(db);
        db.h();
        try {
            db.n(e());
            db.B();
        } finally {
            db.M();
        }
    }

    public final long d() {
        long j6;
        long currentTimeMillis = System.currentTimeMillis();
        j6 = z.f6215a;
        return currentTimeMillis - j6;
    }

    public final String e() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + d() + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }
}
