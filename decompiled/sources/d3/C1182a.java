package d3;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import i3.InterfaceC1511b;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: d3.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1182a extends AbstractC1186e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1182a(Context context, InterfaceC1511b taskExecutor) {
        super(context, taskExecutor);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
    }

    @Override // d3.AbstractC1186e
    public IntentFilter j() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        return intentFilter;
    }

    @Override // d3.AbstractC1186e
    public void k(Intent intent) {
        String str;
        Intrinsics.checkNotNullParameter(intent, "intent");
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        W2.k e6 = W2.k.e();
        str = AbstractC1183b.f13483a;
        e6.a(str, "Received " + action);
        switch (action.hashCode()) {
            case -1886648615:
                if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                    g(Boolean.FALSE);
                    return;
                }
                return;
            case -54942926:
                if (action.equals("android.os.action.DISCHARGING")) {
                    g(Boolean.FALSE);
                    return;
                }
                return;
            case 948344062:
                if (action.equals("android.os.action.CHARGING")) {
                    g(Boolean.TRUE);
                    return;
                }
                return;
            case 1019184907:
                if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                    g(Boolean.TRUE);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // d3.AbstractC1189h
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public Boolean e() {
        String str;
        Intent registerReceiver = d().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            return Boolean.valueOf(m(registerReceiver));
        }
        W2.k e6 = W2.k.e();
        str = AbstractC1183b.f13483a;
        e6.c(str, "getInitialState - null intent received");
        return Boolean.FALSE;
    }

    public final boolean m(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }
}
