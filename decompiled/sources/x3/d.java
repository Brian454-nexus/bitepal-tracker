package x3;

import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class d implements K3.b {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f20525a;

    public d(SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        this.f20525a = sharedPreferences;
    }

    @Override // K3.b
    public void a(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f20525a.edit().remove(key).commit();
    }

    @Override // K3.b
    public long getLong(String key, long j6) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f20525a.getLong(key, j6);
    }

    @Override // K3.b
    public boolean putLong(String key, long j6) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f20525a.edit().putLong(key, j6).commit();
    }
}
