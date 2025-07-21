package f5;

import R4.h;
import T4.v;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import e5.C1273c;

/* renamed from: f5.c, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1305c implements InterfaceC1307e {

    /* renamed from: a, reason: collision with root package name */
    public final U4.d f14223a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1307e f14224b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1307e f14225c;

    public C1305c(U4.d dVar, InterfaceC1307e interfaceC1307e, InterfaceC1307e interfaceC1307e2) {
        this.f14223a = dVar;
        this.f14224b = interfaceC1307e;
        this.f14225c = interfaceC1307e2;
    }

    public static v b(v vVar) {
        return vVar;
    }

    @Override // f5.InterfaceC1307e
    public v a(v vVar, h hVar) {
        Drawable drawable = (Drawable) vVar.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f14224b.a(a5.g.e(((BitmapDrawable) drawable).getBitmap(), this.f14223a), hVar);
        }
        if (drawable instanceof C1273c) {
            return this.f14225c.a(b(vVar), hVar);
        }
        return null;
    }
}
