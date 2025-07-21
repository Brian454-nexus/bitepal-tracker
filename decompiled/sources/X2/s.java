package X2;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import w2.AbstractC2242b;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class s extends AbstractC2242b {

    /* renamed from: c, reason: collision with root package name */
    public final Context f6199c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Context mContext, int i6, int i7) {
        super(i6, i7);
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.f6199c = mContext;
    }

    @Override // w2.AbstractC2242b
    public void a(A2.g db) {
        Intrinsics.checkNotNullParameter(db, "db");
        if (this.f20142b >= 10) {
            db.C("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
        } else {
            this.f6199c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
        }
    }
}
