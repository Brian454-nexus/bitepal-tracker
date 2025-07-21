package X2;

import android.content.ContentValues;
import kotlin.jvm.internal.Intrinsics;
import w2.InterfaceC2241a;

/* renamed from: X2.b, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0818b implements InterfaceC2241a {
    @Override // w2.InterfaceC2241a
    public void a(A2.g db) {
        Intrinsics.checkNotNullParameter(db, "db");
        db.n("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
        db.F("WorkSpec", 3, contentValues, "last_enqueue_time = 0 AND interval_duration <> 0 ", new Object[0]);
    }
}
