package p1;

import android.content.Context;
import c1.AbstractC1117K;
import c1.AbstractC1133o;
import p1.C1901b;
import p1.I;
import p1.k;

/* renamed from: p1.j, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1909j implements k.b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f18182a;

    /* renamed from: b, reason: collision with root package name */
    public int f18183b = 0;

    /* renamed from: c, reason: collision with root package name */
    public boolean f18184c = true;

    public C1909j(Context context) {
        this.f18182a = context;
    }

    @Override // p1.k.b
    public k a(k.a aVar) {
        int i6;
        if (AbstractC1117K.f10560a < 23 || !((i6 = this.f18183b) == 1 || (i6 == 0 && b()))) {
            return new I.b().a(aVar);
        }
        int k6 = Z0.y.k(aVar.f18187c.f6990n);
        AbstractC1133o.f("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + AbstractC1117K.r0(k6));
        C1901b.C0233b c0233b = new C1901b.C0233b(k6);
        c0233b.e(this.f18184c);
        return c0233b.a(aVar);
    }

    public final boolean b() {
        int i6 = AbstractC1117K.f10560a;
        if (i6 >= 31) {
            return true;
        }
        Context context = this.f18182a;
        return context != null && i6 >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen");
    }
}
