package d3;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import b3.C1086b;
import g3.AbstractC1381m;
import g3.AbstractC1382n;
import i3.InterfaceC1511b;
import kotlin.jvm.internal.Intrinsics;
import u0.AbstractC2132a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final String f13499a;

    static {
        String i6 = W2.k.i("NetworkStateTracker");
        Intrinsics.checkNotNullExpressionValue(i6, "tagWithPrefix(\"NetworkStateTracker\")");
        f13499a = i6;
    }

    public static final AbstractC1189h a(Context context, InterfaceC1511b taskExecutor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        return new j(context, taskExecutor);
    }

    public static final C1086b c(ConnectivityManager connectivityManager) {
        Intrinsics.checkNotNullParameter(connectivityManager, "<this>");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z6 = false;
        boolean z7 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        boolean d6 = d(connectivityManager);
        boolean a6 = AbstractC2132a.a(connectivityManager);
        if (activeNetworkInfo != null && !activeNetworkInfo.isRoaming()) {
            z6 = true;
        }
        return new C1086b(z7, d6, a6, z6);
    }

    public static final boolean d(ConnectivityManager connectivityManager) {
        Intrinsics.checkNotNullParameter(connectivityManager, "<this>");
        try {
            NetworkCapabilities a6 = AbstractC1381m.a(connectivityManager, AbstractC1382n.a(connectivityManager));
            if (a6 != null) {
                return AbstractC1381m.b(a6, 16);
            }
            return false;
        } catch (SecurityException e6) {
            W2.k.e().d(f13499a, "Unable to validate active network", e6);
            return false;
        }
    }
}
