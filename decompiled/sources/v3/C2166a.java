package v3;

import kotlin.jvm.internal.Intrinsics;
import n3.C1821a;
import n3.C1825e;

/* renamed from: v3.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C2166a extends D3.e {

    /* renamed from: b, reason: collision with root package name */
    public B3.a f19559b;

    /* renamed from: c, reason: collision with root package name */
    public C1821a f19560c;

    @Override // D3.f
    public void a(B3.a amplitude) {
        Intrinsics.checkNotNullParameter(amplitude, "amplitude");
        super.a(amplitude);
        C1821a a6 = C1821a.f17742c.a(amplitude.m().l());
        this.f19560c = a6;
        if (a6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("connector");
            a6 = null;
        }
        a6.d().b(new C1825e(amplitude.w().c(), amplitude.w().b(), null, 4, null));
    }

    @Override // D3.f
    public void d(B3.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f19559b = aVar;
    }

    @Override // D3.e
    public void e(String str) {
        C1821a c1821a = this.f19560c;
        if (c1821a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("connector");
            c1821a = null;
        }
        c1821a.d().a().b(str).commit();
    }

    @Override // D3.e
    public void f(String str) {
        C1821a c1821a = this.f19560c;
        if (c1821a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("connector");
            c1821a = null;
        }
        c1821a.d().a().a(str).commit();
    }
}
