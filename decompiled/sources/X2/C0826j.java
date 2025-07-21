package X2;

import kotlin.jvm.internal.Intrinsics;
import w2.AbstractC2242b;

/* renamed from: X2.j, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0826j extends AbstractC2242b {

    /* renamed from: c, reason: collision with root package name */
    public static final C0826j f6170c = new C0826j();

    public C0826j() {
        super(3, 4);
    }

    @Override // w2.AbstractC2242b
    public void a(A2.g db) {
        Intrinsics.checkNotNullParameter(db, "db");
        db.n("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
    }
}
