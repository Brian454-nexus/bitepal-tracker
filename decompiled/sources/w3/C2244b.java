package w3;

import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;
import y3.InterfaceC2355a;

/* renamed from: w3.b, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C2244b implements B3.g {
    @Override // B3.g
    public B3.f b(B3.a amplitude, String str) {
        Intrinsics.checkNotNullParameter(amplitude, "amplitude");
        B3.b m6 = amplitude.m();
        Intrinsics.checkNotNull(m6, "null cannot be cast to non-null type com.amplitude.android.Configuration");
        o3.c cVar = (o3.c) m6;
        SharedPreferences sharedPreferences = cVar.C().getSharedPreferences("amplitude-identify-intercept-" + cVar.l(), 0);
        String l6 = cVar.l();
        InterfaceC2355a a6 = cVar.m().a(amplitude);
        Intrinsics.checkNotNull(sharedPreferences);
        return new C2248f(l6, a6, sharedPreferences, C2247e.f20161a.c(cVar), amplitude.o());
    }
}
