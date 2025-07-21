package com.android.billingclient.api;

import L3.G0;
import android.os.Bundle;
import com.android.billingclient.api.d;
import com.google.android.gms.internal.play_billing.zze;
import java.util.ArrayList;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class o {
    public static G0 a(Bundle bundle, String str, String str2) {
        d dVar = m.f11961k;
        if (bundle == null) {
            zze.zzl("BillingClient", String.format("%s got null owned items list", str2));
            return new G0(dVar, 54);
        }
        int zzb = zze.zzb(bundle, "BillingClient");
        String zzh = zze.zzh(bundle, "BillingClient");
        d.a c6 = d.c();
        c6.c(zzb);
        c6.b(zzh);
        d a6 = c6.a();
        if (zzb != 0) {
            zze.zzl("BillingClient", String.format("%s failed. Response code: %s", str2, Integer.valueOf(zzb)));
            return new G0(a6, 23);
        }
        if (!bundle.containsKey("INAPP_PURCHASE_ITEM_LIST") || !bundle.containsKey("INAPP_PURCHASE_DATA_LIST") || !bundle.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
            zze.zzl("BillingClient", String.format("Bundle returned from %s doesn't contain required fields.", str2));
            return new G0(dVar, 55);
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        if (stringArrayList == null) {
            zze.zzl("BillingClient", String.format("Bundle returned from %s contains null SKUs list.", str2));
            return new G0(dVar, 56);
        }
        if (stringArrayList2 == null) {
            zze.zzl("BillingClient", String.format("Bundle returned from %s contains null purchases list.", str2));
            return new G0(dVar, 57);
        }
        if (stringArrayList3 != null) {
            return new G0(m.f11962l, 1);
        }
        zze.zzl("BillingClient", String.format("Bundle returned from %s contains null signatures list.", str2));
        return new G0(dVar, 58);
    }
}
