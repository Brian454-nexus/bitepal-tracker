package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import I5.a;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import x5.p;
import x5.u;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static /* synthetic */ void a() {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i6 = intent.getExtras().getInt("attemptNumber");
        u.f(context);
        p.a d6 = p.a().b(queryParameter).d(a.b(intValue));
        if (queryParameter2 != null) {
            d6.c(Base64.decode(queryParameter2, 0));
        }
        u.c().e().m(d6.a(), i6, new Runnable() { // from class: E5.a
            @Override // java.lang.Runnable
            public final void run() {
                AlarmManagerSchedulerBroadcastReceiver.a();
            }
        });
    }
}
