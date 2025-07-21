package L3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.internal.play_billing.zzco;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzgw;
import com.google.android.gms.internal.play_billing.zzjz;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class M0 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3204a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3205b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ N0 f3206c;

    public M0(N0 n02, boolean z6) {
        this.f3206c = n02;
        this.f3205b = z6;
    }

    public final synchronized void a(Context context, IntentFilter intentFilter) {
        try {
            if (this.f3204a) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, true != this.f3205b ? 4 : 2);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.f3204a = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(Context context, IntentFilter intentFilter, String str) {
        M0 m02;
        try {
            try {
                if (this.f3204a) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    m02 = this;
                    context.registerReceiver(m02, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != this.f3205b ? 4 : 2);
                } else {
                    m02 = this;
                    context.registerReceiver(this, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                }
                m02.f3204a = true;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final synchronized void c(Context context) {
        if (!this.f3204a) {
            zze.zzl("BillingBroadcastManager", "Receiver is not registered.");
        } else {
            context.unregisterReceiver(this);
            this.f3204a = false;
        }
    }

    public final void d(Bundle bundle, com.android.billingclient.api.d dVar, int i6) {
        InterfaceC0545s0 interfaceC0545s0;
        InterfaceC0545s0 interfaceC0545s02;
        try {
            if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") != null) {
                interfaceC0545s02 = this.f3206c.f3213d;
                interfaceC0545s02.d(zzjz.zzC(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD"), zzgw.zza()));
            } else {
                interfaceC0545s0 = this.f3206c.f3213d;
                interfaceC0545s0.d(AbstractC0543r0.b(23, i6, dVar));
            }
        } catch (Throwable unused) {
            zze.zzl("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        InterfaceC0550v interfaceC0550v;
        InterfaceC0545s0 interfaceC0545s0;
        InterfaceC0556y interfaceC0556y;
        InterfaceC0545s0 interfaceC0545s02;
        InterfaceC0550v interfaceC0550v2;
        InterfaceC0545s0 interfaceC0545s03;
        InterfaceC0550v interfaceC0550v3;
        InterfaceC0556y interfaceC0556y2;
        InterfaceC0556y interfaceC0556y3;
        InterfaceC0545s0 interfaceC0545s04;
        InterfaceC0545s0 interfaceC0545s05;
        InterfaceC0550v interfaceC0550v4;
        InterfaceC0550v interfaceC0550v5;
        InterfaceC0545s0 interfaceC0545s06;
        InterfaceC0550v interfaceC0550v6;
        InterfaceC0550v interfaceC0550v7;
        Bundle extras = intent.getExtras();
        if (extras == null) {
            zze.zzl("BillingBroadcastManager", "Bundle is null.");
            interfaceC0545s06 = this.f3206c.f3213d;
            com.android.billingclient.api.d dVar = com.android.billingclient.api.m.f11961k;
            interfaceC0545s06.d(AbstractC0543r0.b(11, 1, dVar));
            N0 n02 = this.f3206c;
            interfaceC0550v6 = n02.f3211b;
            if (interfaceC0550v6 != null) {
                interfaceC0550v7 = n02.f3211b;
                interfaceC0550v7.onPurchasesUpdated(dVar, null);
                return;
            }
            return;
        }
        com.android.billingclient.api.d zzf = zze.zzf(intent, "BillingBroadcastManager");
        String action = intent.getAction();
        int i6 = true == Objects.equals(extras.getString("INTENT_SOURCE"), "LAUNCH_BILLING_FLOW") ? 2 : 1;
        if (action.equals("com.android.vending.billing.PURCHASES_UPDATED") || action.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
            List zzj = zze.zzj(extras);
            if (zzf.b() == 0) {
                interfaceC0545s0 = this.f3206c.f3213d;
                interfaceC0545s0.g(AbstractC0543r0.d(i6));
            } else {
                d(extras, zzf, i6);
            }
            interfaceC0550v = this.f3206c.f3211b;
            interfaceC0550v.onPurchasesUpdated(zzf, zzj);
            return;
        }
        if (action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
            if (zzf.b() != 0) {
                d(extras, zzf, i6);
                interfaceC0550v5 = this.f3206c.f3211b;
                interfaceC0550v5.onPurchasesUpdated(zzf, zzco.zzl());
                return;
            }
            N0 n03 = this.f3206c;
            N0.a(n03);
            interfaceC0556y = n03.f3212c;
            if (interfaceC0556y == null) {
                zze.zzl("BillingBroadcastManager", "AlternativeBillingListener and UserChoiceBillingListener is null.");
                interfaceC0545s02 = this.f3206c.f3213d;
                com.android.billingclient.api.d dVar2 = com.android.billingclient.api.m.f11961k;
                interfaceC0545s02.d(AbstractC0543r0.b(77, i6, dVar2));
                interfaceC0550v2 = this.f3206c.f3211b;
                interfaceC0550v2.onPurchasesUpdated(dVar2, zzco.zzl());
                return;
            }
            String string = extras.getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
            if (string == null) {
                zze.zzl("BillingBroadcastManager", "Couldn't find alternative billing user choice data in bundle.");
                interfaceC0545s05 = this.f3206c.f3213d;
                com.android.billingclient.api.d dVar3 = com.android.billingclient.api.m.f11961k;
                interfaceC0545s05.d(AbstractC0543r0.b(16, i6, dVar3));
                interfaceC0550v4 = this.f3206c.f3211b;
                interfaceC0550v4.onPurchasesUpdated(dVar3, zzco.zzl());
                return;
            }
            try {
                interfaceC0556y2 = this.f3206c.f3212c;
                if (interfaceC0556y2 != null) {
                    C0558z c0558z = new C0558z(string);
                    interfaceC0556y3 = this.f3206c.f3212c;
                    interfaceC0556y3.a(c0558z);
                    interfaceC0545s04 = this.f3206c.f3213d;
                    interfaceC0545s04.g(AbstractC0543r0.d(i6));
                    return;
                }
                JSONArray optJSONArray = new JSONObject(string).optJSONArray("products");
                ArrayList arrayList = new ArrayList();
                if (optJSONArray != null) {
                    for (int i7 = 0; i7 < optJSONArray.length(); i7++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i7);
                        if (optJSONObject != null) {
                            arrayList.add(new C0532l0(optJSONObject, null));
                        }
                    }
                }
                N0.a(this.f3206c);
                throw null;
            } catch (JSONException unused) {
                zze.zzl("BillingBroadcastManager", String.format("Error when parsing invalid user choice data: [%s]", string));
                interfaceC0545s03 = this.f3206c.f3213d;
                com.android.billingclient.api.d dVar4 = com.android.billingclient.api.m.f11961k;
                interfaceC0545s03.d(AbstractC0543r0.b(17, i6, dVar4));
                interfaceC0550v3 = this.f3206c.f3211b;
                interfaceC0550v3.onPurchasesUpdated(dVar4, zzco.zzl());
            }
        }
    }
}
