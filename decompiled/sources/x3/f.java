package x3;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import kotlin.ExceptionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import y3.InterfaceC2355a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    public static final a f20528c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final Context f20529a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2355a f20530b;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0;
        }

        public a() {
        }
    }

    public f(Context context, InterfaceC2355a logger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f20529a = context;
        this.f20530b = logger;
        if (f20528c.a(context)) {
            return;
        }
        logger.e("No ACCESS_NETWORK_STATE permission, offline mode is not supported. To enable, add <uses-permission android:name=\"android.permission.ACCESS_NETWORK_STATE\" /> to your AndroidManifest.xml. Learn more at https://www.docs.developers.amplitude.com/data/sdks/android-kotlin/#offline-mode");
    }

    public final boolean a(NetworkCapabilities networkCapabilities) {
        return networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(0);
    }

    public final boolean b() {
        NetworkCapabilities networkCapabilities;
        if (!f20528c.a(this.f20529a)) {
            return true;
        }
        try {
            Object systemService = this.f20529a.getSystemService("connectivity");
            if (!(systemService instanceof ConnectivityManager)) {
                this.f20530b.b("Service is not an instance of ConnectivityManager. Offline mode is not supported");
                return true;
            }
            Network activeNetwork = ((ConnectivityManager) systemService).getActiveNetwork();
            if (activeNetwork == null || (networkCapabilities = ((ConnectivityManager) systemService).getNetworkCapabilities(activeNetwork)) == null) {
                return false;
            }
            return a(networkCapabilities);
        } catch (Throwable th) {
            this.f20530b.e("Error checking network connectivity: " + th.getMessage());
            this.f20530b.e(ExceptionsKt.stackTraceToString(th));
            return true;
        }
    }
}
