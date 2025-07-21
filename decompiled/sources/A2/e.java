package A2;

import android.database.Cursor;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f181a = new e();

    public static final void a(Cursor cursor, Bundle extras) {
        Intrinsics.checkNotNullParameter(cursor, "cursor");
        Intrinsics.checkNotNullParameter(extras, "extras");
        cursor.setExtras(extras);
    }
}
