package x3;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import kotlin.jvm.internal.Intrinsics;
import y3.InterfaceC2355a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final Context f20531a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2355a f20532b;

    /* renamed from: c, reason: collision with root package name */
    public final a f20533c;

    /* renamed from: d, reason: collision with root package name */
    public ConnectivityManager.NetworkCallback f20534d;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface a {
        void a();

        void b();
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Network f20535a;

        /* renamed from: b, reason: collision with root package name */
        public final a f20536b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f20537c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f20538d;

        public b(Network network, a networkCallback, boolean z6, boolean z7) {
            Intrinsics.checkNotNullParameter(network, "network");
            Intrinsics.checkNotNullParameter(networkCallback, "networkCallback");
            this.f20535a = network;
            this.f20536b = networkCallback;
            this.f20537c = z6;
            this.f20538d = z7;
            a();
        }

        public static /* synthetic */ void c(b bVar, Network network, boolean z6, boolean z7, int i6, Object obj) {
            if ((i6 & 2) != 0) {
                z6 = bVar.f20537c;
            }
            if ((i6 & 4) != 0) {
                z7 = bVar.f20538d;
            }
            bVar.b(network, z6, z7);
        }

        public final void a() {
            if (!this.f20537c || this.f20538d) {
                this.f20536b.b();
            } else {
                this.f20536b.a();
            }
        }

        public final void b(Network network, boolean z6, boolean z7) {
            Intrinsics.checkNotNullParameter(network, "network");
            if (Intrinsics.areEqual(this.f20535a, network)) {
                boolean z8 = (this.f20537c == z6 && this.f20538d == z7) ? false : true;
                this.f20537c = z6;
                this.f20538d = z7;
                if (z8) {
                    a();
                }
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c extends ConnectivityManager.NetworkCallback {

        /* renamed from: a, reason: collision with root package name */
        public b f20539a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ConnectivityManager f20540b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ g f20541c;

        public c(ConnectivityManager connectivityManager, g gVar) {
            this.f20540b = connectivityManager;
            this.f20541c = gVar;
        }

        public final boolean a(NetworkCapabilities networkCapabilities) {
            return networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            Intrinsics.checkNotNullParameter(network, "network");
            NetworkCapabilities networkCapabilities = this.f20540b.getNetworkCapabilities(network);
            this.f20539a = new b(network, this.f20541c.f20533c, networkCapabilities != null ? a(networkCapabilities) : true, false);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onBlockedStatusChanged(Network network, boolean z6) {
            Intrinsics.checkNotNullParameter(network, "network");
            b bVar = this.f20539a;
            if (bVar != null) {
                b.c(bVar, network, false, z6, 2, null);
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            Intrinsics.checkNotNullParameter(network, "network");
            Intrinsics.checkNotNullParameter(networkCapabilities, "networkCapabilities");
            b bVar = this.f20539a;
            if (bVar != null) {
                b.c(bVar, network, a(networkCapabilities), false, 4, null);
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            Intrinsics.checkNotNullParameter(network, "network");
            b bVar = this.f20539a;
            if (bVar != null) {
                b.c(bVar, network, false, false, 4, null);
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onUnavailable() {
            this.f20541c.f20533c.b();
        }
    }

    public g(Context context, InterfaceC2355a logger, a networkCallback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(networkCallback, "networkCallback");
        this.f20531a = context;
        this.f20532b = logger;
        this.f20533c = networkCallback;
    }

    public final void b() {
        Object systemService = this.f20531a.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        NetworkRequest build = new NetworkRequest.Builder().addCapability(12).build();
        c cVar = new c(connectivityManager, this);
        connectivityManager.registerNetworkCallback(build, cVar);
        this.f20534d = cVar;
    }

    public final void c() {
        if (!f.f20528c.a(this.f20531a)) {
            this.f20532b.b("ACCESS_NETWORK_STATE permission not granted, skipping network listener setup");
            return;
        }
        try {
            b();
        } catch (Throwable th) {
            this.f20532b.e("Error starting network listener: " + th.getMessage());
        }
    }
}
