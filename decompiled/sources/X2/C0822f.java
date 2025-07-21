package X2;

import kotlin.jvm.internal.Intrinsics;
import w2.AbstractC2242b;

/* renamed from: X2.f, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0822f extends AbstractC2242b {

    /* renamed from: c, reason: collision with root package name */
    public static final C0822f f6166c = new C0822f();

    public C0822f() {
        super(11, 12);
    }

    @Override // w2.AbstractC2242b
    public void a(A2.g db) {
        Intrinsics.checkNotNullParameter(db, "db");
        db.n("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
    }
}
