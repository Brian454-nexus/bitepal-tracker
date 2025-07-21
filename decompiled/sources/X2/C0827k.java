package X2;

import kotlin.jvm.internal.Intrinsics;
import w2.AbstractC2242b;

/* renamed from: X2.k, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0827k extends AbstractC2242b {

    /* renamed from: c, reason: collision with root package name */
    public static final C0827k f6171c = new C0827k();

    public C0827k() {
        super(4, 5);
    }

    @Override // w2.AbstractC2242b
    public void a(A2.g db) {
        Intrinsics.checkNotNullParameter(db, "db");
        db.n("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
        db.n("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
    }
}
