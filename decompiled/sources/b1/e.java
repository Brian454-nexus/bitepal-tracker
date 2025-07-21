package b1;

import android.os.Bundle;
import c1.AbstractC1117K;
import c1.AbstractC1119a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public static final String f10454c = AbstractC1117K.x0(0);

    /* renamed from: d, reason: collision with root package name */
    public static final String f10455d = AbstractC1117K.x0(1);

    /* renamed from: a, reason: collision with root package name */
    public final String f10456a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10457b;

    public e(String str, int i6) {
        this.f10456a = str;
        this.f10457b = i6;
    }

    public static e a(Bundle bundle) {
        return new e((String) AbstractC1119a.e(bundle.getString(f10454c)), bundle.getInt(f10455d));
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putString(f10454c, this.f10456a);
        bundle.putInt(f10455d, this.f10457b);
        return bundle;
    }
}
