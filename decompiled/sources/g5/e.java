package g5;

import android.content.Context;
import android.util.Log;
import g5.InterfaceC1388b;
import n0.AbstractC1809a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class e implements c {
    @Override // g5.c
    public InterfaceC1388b a(Context context, InterfaceC1388b.a aVar) {
        boolean z6 = AbstractC1809a.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z6 ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        return z6 ? new d(context, aVar) : new n();
    }
}
