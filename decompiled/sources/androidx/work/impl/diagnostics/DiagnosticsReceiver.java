package androidx.work.impl.diagnostics;

import W2.k;
import W2.m;
import W2.v;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f10330a = k.i("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        k.e().a(f10330a, "Requesting diagnostics");
        try {
            v.e(context).b(m.e(DiagnosticsWorker.class));
        } catch (IllegalStateException e6) {
            k.e().d(f10330a, "WorkManager is not initialized", e6);
        }
    }
}
