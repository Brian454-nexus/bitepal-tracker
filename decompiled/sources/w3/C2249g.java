package w3;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import o3.C1839a;
import u3.C2141c;
import u3.C2142d;
import u3.C2145g;

/* renamed from: w3.g, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C2249g {

    /* renamed from: a, reason: collision with root package name */
    public final C1839a f20174a;

    /* renamed from: b, reason: collision with root package name */
    public final C2141c f20175b;

    public C2249g(C1839a amplitude) {
        Intrinsics.checkNotNullParameter(amplitude, "amplitude");
        this.f20174a = amplitude;
        this.f20175b = C2142d.f19187a.b(amplitude);
    }

    public final Object a(Continuation continuation) {
        Object g6 = new C2145g(this.f20174a, this.f20175b).g(continuation);
        return g6 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? g6 : Unit.INSTANCE;
    }
}
