package b1;

import android.os.Bundle;
import c1.AbstractC1117K;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class g {

    /* renamed from: d, reason: collision with root package name */
    public static final String f10458d = AbstractC1117K.x0(0);

    /* renamed from: e, reason: collision with root package name */
    public static final String f10459e = AbstractC1117K.x0(1);

    /* renamed from: f, reason: collision with root package name */
    public static final String f10460f = AbstractC1117K.x0(2);

    /* renamed from: a, reason: collision with root package name */
    public int f10461a;

    /* renamed from: b, reason: collision with root package name */
    public int f10462b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10463c;

    public g(int i6, int i7, int i8) {
        this.f10461a = i6;
        this.f10462b = i7;
        this.f10463c = i8;
    }

    public static g a(Bundle bundle) {
        return new g(bundle.getInt(f10458d), bundle.getInt(f10459e), bundle.getInt(f10460f));
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt(f10458d, this.f10461a);
        bundle.putInt(f10459e, this.f10462b);
        bundle.putInt(f10460f, this.f10463c);
        return bundle;
    }
}
