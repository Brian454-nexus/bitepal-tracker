package d3;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import i3.InterfaceC1511b;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: d3.c, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1184c extends AbstractC1186e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1184c(Context context, InterfaceC1511b taskExecutor) {
        super(context, taskExecutor);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
    }

    @Override // d3.AbstractC1186e
    public IntentFilter j() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // d3.AbstractC1186e
    public void k(Intent intent) {
        String str;
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (intent.getAction() == null) {
            return;
        }
        W2.k e6 = W2.k.e();
        str = AbstractC1185d.f13484a;
        e6.a(str, "Received " + intent.getAction());
        String action = intent.getAction();
        if (action != null) {
            int hashCode = action.hashCode();
            if (hashCode == -1980154005) {
                if (action.equals("android.intent.action.BATTERY_OKAY")) {
                    g(Boolean.TRUE);
                }
            } else if (hashCode == 490310653 && action.equals("android.intent.action.BATTERY_LOW")) {
                g(Boolean.FALSE);
            }
        }
    }

    @Override // d3.AbstractC1189h
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public Boolean e() {
        String str;
        Intent registerReceiver = d().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            W2.k e6 = W2.k.e();
            str = AbstractC1185d.f13484a;
            e6.c(str, "getInitialState - null intent received");
            return Boolean.FALSE;
        }
        int intExtra = registerReceiver.getIntExtra("status", -1);
        float intExtra2 = registerReceiver.getIntExtra("level", -1) / registerReceiver.getIntExtra("scale", -1);
        boolean z6 = true;
        if (intExtra != 1 && intExtra2 <= 0.15f) {
            z6 = false;
        }
        return Boolean.valueOf(z6);
    }
}
