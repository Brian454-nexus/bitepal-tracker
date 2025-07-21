package X2;

import kotlin.jvm.internal.Intrinsics;
import w2.AbstractC2242b;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class n extends AbstractC2242b {

    /* renamed from: c, reason: collision with root package name */
    public static final n f6174c = new n();

    public n() {
        super(8, 9);
    }

    @Override // w2.AbstractC2242b
    public void a(A2.g db) {
        Intrinsics.checkNotNullParameter(db, "db");
        db.n("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
    }
}
