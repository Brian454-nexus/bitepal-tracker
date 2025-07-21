package x3;

import y3.InterfaceC2355a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f20542a = new h();

    public static /* synthetic */ boolean b(h hVar, InterfaceC2355a interfaceC2355a, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            interfaceC2355a = null;
        }
        return hVar.a(interfaceC2355a);
    }

    public final boolean a(InterfaceC2355a interfaceC2355a) {
        l lVar = l.f20552a;
        return lVar.a("androidx.compose.ui.node.Owner", interfaceC2355a) && lVar.a("com.amplitude.android.internal.locators.ComposeViewTargetLocator", interfaceC2355a);
    }
}
