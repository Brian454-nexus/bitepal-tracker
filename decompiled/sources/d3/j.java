package d3;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import b3.C1086b;
import g3.AbstractC1381m;
import g3.AbstractC1383o;
import i3.InterfaceC1511b;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class j extends AbstractC1189h {

    /* renamed from: f, reason: collision with root package name */
    public final ConnectivityManager f13496f;

    /* renamed from: g, reason: collision with root package name */
    public final a f13497g;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a extends ConnectivityManager.NetworkCallback {
        public a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities capabilities) {
            String str;
            Intrinsics.checkNotNullParameter(network, "network");
            Intrinsics.checkNotNullParameter(capabilities, "capabilities");
            W2.k e6 = W2.k.e();
            str = k.f13499a;
            e6.a(str, "Network capabilities changed: " + capabilities);
            j jVar = j.this;
            jVar.g(k.c(jVar.f13496f));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            String str;
            Intrinsics.checkNotNullParameter(network, "network");
            W2.k e6 = W2.k.e();
            str = k.f13499a;
            e6.a(str, "Network connection lost");
            j jVar = j.this;
            jVar.g(k.c(jVar.f13496f));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, InterfaceC1511b taskExecutor) {
        super(context, taskExecutor);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        Object systemService = d().getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f13496f = (ConnectivityManager) systemService;
        this.f13497g = new a();
    }

    @Override // d3.AbstractC1189h
    public void h() {
        String str;
        String str2;
        String str3;
        try {
            W2.k e6 = W2.k.e();
            str3 = k.f13499a;
            e6.a(str3, "Registering network callback");
            AbstractC1383o.a(this.f13496f, this.f13497g);
        } catch (IllegalArgumentException e7) {
            W2.k e8 = W2.k.e();
            str2 = k.f13499a;
            e8.d(str2, "Received exception while registering network callback", e7);
        } catch (SecurityException e9) {
            W2.k e10 = W2.k.e();
            str = k.f13499a;
            e10.d(str, "Received exception while registering network callback", e9);
        }
    }

    @Override // d3.AbstractC1189h
    public void i() {
        String str;
        String str2;
        String str3;
        try {
            W2.k e6 = W2.k.e();
            str3 = k.f13499a;
            e6.a(str3, "Unregistering network callback");
            AbstractC1381m.c(this.f13496f, this.f13497g);
        } catch (IllegalArgumentException e7) {
            W2.k e8 = W2.k.e();
            str2 = k.f13499a;
            e8.d(str2, "Received exception while unregistering network callback", e7);
        } catch (SecurityException e9) {
            W2.k e10 = W2.k.e();
            str = k.f13499a;
            e10.d(str, "Received exception while unregistering network callback", e9);
        }
    }

    @Override // d3.AbstractC1189h
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public C1086b e() {
        return k.c(this.f13496f);
    }
}
