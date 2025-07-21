package k5;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.IntCompanionObject;
import n5.l;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class c implements h {

    /* renamed from: a, reason: collision with root package name */
    public final int f16843a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16844b;

    /* renamed from: c, reason: collision with root package name */
    public j5.d f16845c;

    public c() {
        this(IntCompanionObject.MIN_VALUE, IntCompanionObject.MIN_VALUE);
    }

    @Override // g5.l
    public void a() {
    }

    @Override // k5.h
    public final void e(g gVar) {
    }

    @Override // g5.l
    public void f() {
    }

    @Override // k5.h
    public void h(Drawable drawable) {
    }

    @Override // k5.h
    public final void i(j5.d dVar) {
        this.f16845c = dVar;
    }

    @Override // g5.l
    public void j() {
    }

    @Override // k5.h
    public void k(Drawable drawable) {
    }

    @Override // k5.h
    public final j5.d l() {
        return this.f16845c;
    }

    @Override // k5.h
    public final void n(g gVar) {
        gVar.f(this.f16843a, this.f16844b);
    }

    public c(int i6, int i7) {
        if (l.u(i6, i7)) {
            this.f16843a = i6;
            this.f16844b = i7;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + i6 + " and height: " + i7);
    }
}
