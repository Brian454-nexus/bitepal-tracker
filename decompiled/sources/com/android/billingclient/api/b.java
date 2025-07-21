package com.android.billingclient.api;

import L3.AbstractC0543r0;
import L3.C0511b;
import L3.C0533m;
import L3.C0537o;
import L3.C0539p;
import L3.C0551v0;
import L3.C0552w;
import L3.C0554x;
import L3.E0;
import L3.G0;
import L3.InterfaceC0513c;
import L3.InterfaceC0515d;
import L3.InterfaceC0517e;
import L3.InterfaceC0521g;
import L3.InterfaceC0525i;
import L3.InterfaceC0529k;
import L3.InterfaceC0535n;
import L3.InterfaceC0541q;
import L3.InterfaceC0544s;
import L3.InterfaceC0545s0;
import L3.InterfaceC0546t;
import L3.InterfaceC0548u;
import L3.InterfaceC0550v;
import L3.InterfaceC0556y;
import L3.InterfaceC0557y0;
import L3.M;
import L3.N;
import L3.N0;
import L3.O;
import L3.P;
import L3.T;
import L3.U;
import L3.V;
import L3.W;
import L3.X;
import L3.Y;
import android.R;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.View;
import com.android.billingclient.BuildConfig;
import com.android.billingclient.api.g;
import com.google.android.gms.internal.play_billing.zzan;
import com.google.android.gms.internal.play_billing.zzbe;
import com.google.android.gms.internal.play_billing.zzco;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzev;
import com.google.android.gms.internal.play_billing.zzfb;
import com.google.android.gms.internal.play_billing.zzjx;
import com.google.android.gms.internal.play_billing.zzjz;
import com.google.android.gms.internal.play_billing.zzkb;
import com.google.android.gms.internal.play_billing.zzkd;
import com.google.android.gms.internal.play_billing.zzke;
import com.google.android.gms.internal.play_billing.zzki;
import com.google.android.gms.internal.play_billing.zzks;
import com.google.android.gms.internal.play_billing.zzku;
import com.google.android.gms.internal.play_billing.zzky;
import com.google.android.gms.internal.play_billing.zzlb;
import com.google.android.gms.internal.play_billing.zzlv;
import com.google.android.gms.internal.play_billing.zzlx;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.json.JSONException;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class b extends a {

    /* renamed from: A */
    public boolean f11828A;

    /* renamed from: B */
    public e f11829B;

    /* renamed from: C */
    public boolean f11830C;

    /* renamed from: D */
    public ExecutorService f11831D;

    /* renamed from: E */
    public volatile zzev f11832E;

    /* renamed from: F */
    public final Long f11833F;

    /* renamed from: a */
    public final Object f11834a;

    /* renamed from: b */
    public volatile int f11835b;

    /* renamed from: c */
    public final String f11836c;

    /* renamed from: d */
    public final Handler f11837d;

    /* renamed from: e */
    public volatile N0 f11838e;

    /* renamed from: f */
    public Context f11839f;

    /* renamed from: g */
    public InterfaceC0545s0 f11840g;

    /* renamed from: h */
    public volatile zzan f11841h;

    /* renamed from: i */
    public volatile i f11842i;

    /* renamed from: j */
    public boolean f11843j;

    /* renamed from: k */
    public boolean f11844k;

    /* renamed from: l */
    public int f11845l;

    /* renamed from: m */
    public boolean f11846m;

    /* renamed from: n */
    public boolean f11847n;

    /* renamed from: o */
    public boolean f11848o;

    /* renamed from: p */
    public boolean f11849p;

    /* renamed from: q */
    public boolean f11850q;

    /* renamed from: r */
    public boolean f11851r;

    /* renamed from: s */
    public boolean f11852s;

    /* renamed from: t */
    public boolean f11853t;

    /* renamed from: u */
    public boolean f11854u;

    /* renamed from: v */
    public boolean f11855v;

    /* renamed from: w */
    public boolean f11856w;

    /* renamed from: x */
    public boolean f11857x;

    /* renamed from: y */
    public boolean f11858y;

    /* renamed from: z */
    public boolean f11859z;

    public b(Context context, e eVar, InterfaceC0550v interfaceC0550v, String str, String str2, InterfaceC0556y interfaceC0556y, InterfaceC0545s0 interfaceC0545s0, ExecutorService executorService) {
        this.f11834a = new Object();
        this.f11835b = 0;
        this.f11837d = new Handler(Looper.getMainLooper());
        this.f11845l = 0;
        this.f11833F = Long.valueOf(new Random().nextLong());
        this.f11836c = str;
        q(context, interfaceC0550v, eVar, interfaceC0556y, str, null);
    }

    public static /* bridge */ /* synthetic */ boolean A0(b bVar) {
        boolean z6;
        synchronized (bVar.f11834a) {
            z6 = true;
            if (bVar.f11835b != 1) {
                z6 = false;
            }
        }
        return z6;
    }

    public static String T() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return BuildConfig.VERSION_NAME;
        }
    }

    public static final String e0(int i6) {
        return i6 != 0 ? i6 != 1 ? i6 != 2 ? "CLOSED" : "CONNECTED" : "CONNECTING" : "DISCONNECTED";
    }

    public static Future u(Callable callable, long j6, final Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            final Future submit = executorService.submit(callable);
            handler.postDelayed(new Runnable() { // from class: L3.E
                @Override // java.lang.Runnable
                public final void run() {
                    Future future = submit;
                    if (future.isDone() || future.isCancelled()) {
                        return;
                    }
                    Runnable runnable2 = runnable;
                    future.cancel(true);
                    zze.zzl("BillingClient", "Async task is taking too long, cancel it!");
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            }, (long) (j6 * 0.95d));
            return submit;
        } catch (Exception e6) {
            zze.zzm("BillingClient", "Async task throws exception!", e6);
            return null;
        }
    }

    public final Handler G0() {
        return Looper.myLooper() == null ? this.f11837d : new Handler(Looper.myLooper());
    }

    public final Y H0(String str) {
        zzan zzanVar;
        zze.zzk("BillingClient", "Querying purchase history, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        Bundle zzd = zze.zzd(this.f11848o, this.f11856w, this.f11829B.a(), this.f11829B.b(), this.f11836c, this.f11833F.longValue());
        String str2 = null;
        while (this.f11846m) {
            try {
                synchronized (this.f11834a) {
                    zzanVar = this.f11841h;
                }
                if (zzanVar == null) {
                    return g0(m.f11963m, 119, "Service reset to null", null);
                }
                Bundle zzh = zzanVar.zzh(6, this.f11839f.getPackageName(), str, str2, zzd);
                G0 a6 = o.a(zzh, "BillingClient", "getPurchaseHistory()");
                d a7 = a6.a();
                if (a7 != m.f11962l) {
                    N0(a6.b(), 11, a7);
                    return new Y(a7, null);
                }
                ArrayList<String> stringArrayList = zzh.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = zzh.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = zzh.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                boolean z6 = false;
                for (int i6 = 0; i6 < stringArrayList2.size(); i6++) {
                    String str3 = stringArrayList2.get(i6);
                    String str4 = stringArrayList3.get(i6);
                    zze.zzk("BillingClient", "Purchase record found for sku : ".concat(String.valueOf(stringArrayList.get(i6))));
                    try {
                        PurchaseHistoryRecord purchaseHistoryRecord = new PurchaseHistoryRecord(str3, str4);
                        if (TextUtils.isEmpty(purchaseHistoryRecord.e())) {
                            zze.zzl("BillingClient", "BUG: empty/null token!");
                            z6 = true;
                        }
                        arrayList.add(purchaseHistoryRecord);
                    } catch (JSONException e6) {
                        return g0(m.f11961k, 51, "Got an exception trying to decode the purchase!", e6);
                    }
                }
                if (z6) {
                    N0(26, 11, m.f11961k);
                }
                str2 = zzh.getString("INAPP_CONTINUATION_TOKEN");
                zze.zzk("BillingClient", "Continuation token: ".concat(String.valueOf(str2)));
                if (TextUtils.isEmpty(str2)) {
                    return new Y(m.f11962l, arrayList);
                }
            } catch (DeadObjectException e7) {
                return g0(m.f11963m, 59, "Got exception trying to get purchase history", e7);
            } catch (Exception e8) {
                return g0(m.f11961k, 59, "Got exception trying to get purchase history", e8);
            }
        }
        zze.zzl("BillingClient", "getPurchaseHistory is not supported on current device");
        return new Y(m.f11967q, null);
    }

    public final d I0() {
        zze.zzk("BillingClient", "Service connection is valid. No need to re-initialize.");
        zzkb zzc = zzkd.zzc();
        zzc.zzn(6);
        zzlv zzc2 = zzlx.zzc();
        zzc2.zza(true);
        zzc.zzm(zzc2);
        X((zzkd) zzc.zzf());
        return m.f11962l;
    }

    public final void K0(InterfaceC0529k interfaceC0529k, d dVar, int i6, Exception exc) {
        zze.zzm("BillingClient", "getBillingConfig got an exception.", exc);
        O0(i6, 13, dVar, AbstractC0543r0.a(exc));
        interfaceC0529k.a(dVar, null);
    }

    public final void L0(InterfaceC0517e interfaceC0517e, d dVar, int i6, Exception exc) {
        O0(i6, 16, dVar, AbstractC0543r0.a(exc));
        interfaceC0517e.a(dVar);
    }

    public final void M0(int i6, int i7, Exception exc) {
        zzjz zzjzVar;
        zze.zzm("BillingClient", "showInAppMessages error.", exc);
        InterfaceC0545s0 interfaceC0545s0 = this.f11840g;
        String a6 = AbstractC0543r0.a(exc);
        try {
            zzke zzc = zzki.zzc();
            zzc.zzn(i6);
            zzc.zzo(i7);
            if (a6 != null) {
                zzc.zza(a6);
            }
            zzjx zzc2 = zzjz.zzc();
            zzc2.zza(zzc);
            zzc2.zzn(30);
            zzjzVar = (zzjz) zzc2.zzf();
        } catch (Throwable th) {
            zze.zzm("BillingLogger", "Unable to create logging payload", th);
            zzjzVar = null;
        }
        interfaceC0545s0.d(zzjzVar);
    }

    public final void N0(int i6, int i7, d dVar) {
        try {
            W(AbstractC0543r0.b(i6, i7, dVar));
        } catch (Throwable th) {
            zze.zzm("BillingClient", "Unable to log.", th);
        }
    }

    public final void O0(int i6, int i7, d dVar, String str) {
        try {
            W(AbstractC0543r0.c(i6, i7, dVar, str));
        } catch (Throwable th) {
            zze.zzm("BillingClient", "Unable to log.", th);
        }
    }

    public final void P0(int i6) {
        try {
            X(AbstractC0543r0.d(i6));
        } catch (Throwable th) {
            zze.zzm("BillingClient", "Unable to log.", th);
        }
    }

    public final d R() {
        int[] iArr = {0, 3};
        synchronized (this.f11834a) {
            for (int i6 = 0; i6 < 2; i6++) {
                if (this.f11835b == iArr[i6]) {
                    return m.f11963m;
                }
            }
            return m.f11961k;
        }
    }

    public final /* synthetic */ Bundle R0(int i6, String str, String str2, c cVar, Bundle bundle) {
        zzan zzanVar;
        try {
            synchronized (this.f11834a) {
                zzanVar = this.f11841h;
            }
            return zzanVar == null ? zze.zzn(m.f11963m, 119) : zzanVar.zzg(i6, this.f11839f.getPackageName(), str, str2, (String) null, bundle);
        } catch (DeadObjectException e6) {
            return zze.zzo(m.f11963m, 5, AbstractC0543r0.a(e6));
        } catch (Exception e7) {
            return zze.zzo(m.f11961k, 5, AbstractC0543r0.a(e7));
        }
    }

    public final String S(g gVar) {
        if (TextUtils.isEmpty(null)) {
            return this.f11839f.getPackageName();
        }
        return null;
    }

    public final /* synthetic */ Bundle S0(String str, String str2) {
        zzan zzanVar;
        try {
            synchronized (this.f11834a) {
                zzanVar = this.f11841h;
            }
            return zzanVar == null ? zze.zzn(m.f11963m, 119) : zzanVar.zzf(3, this.f11839f.getPackageName(), str, str2, (String) null);
        } catch (DeadObjectException e6) {
            return zze.zzo(m.f11963m, 5, AbstractC0543r0.a(e6));
        } catch (Exception e7) {
            return zze.zzo(m.f11961k, 5, AbstractC0543r0.a(e7));
        }
    }

    public final synchronized ExecutorService U() {
        try {
            if (this.f11831D == null) {
                this.f11831D = Executors.newFixedThreadPool(zze.zza, new M(this));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f11831D;
    }

    /* JADX WARN: Finally extract failed */
    public final void V(C0533m c0533m, InterfaceC0535n interfaceC0535n) {
        zzan zzanVar;
        int zza;
        String str;
        String a6 = c0533m.a();
        try {
            zze.zzk("BillingClient", "Consuming purchase with token: " + a6);
            synchronized (this.f11834a) {
                try {
                    try {
                        zzanVar = this.f11841h;
                    } catch (Throwable th) {
                        th = th;
                        while (true) {
                            try {
                                break;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                        throw th;
                    }
                } catch (DeadObjectException e6) {
                    e = e6;
                    m0(interfaceC0535n, a6, m.f11963m, 29, "Error consuming purchase!", e);
                    return;
                } catch (Exception e7) {
                    e = e7;
                    m0(interfaceC0535n, a6, m.f11961k, 29, "Error consuming purchase!", e);
                    return;
                }
            }
            if (zzanVar == null) {
                try {
                    m0(interfaceC0535n, a6, m.f11963m, 119, "Service has been reset to null.", null);
                    return;
                } catch (DeadObjectException e8) {
                    e = e8;
                    m0(interfaceC0535n, a6, m.f11963m, 29, "Error consuming purchase!", e);
                    return;
                } catch (Exception e9) {
                    e = e9;
                    m0(interfaceC0535n, a6, m.f11961k, 29, "Error consuming purchase!", e);
                    return;
                }
            }
            if (this.f11848o) {
                String packageName = this.f11839f.getPackageName();
                boolean z6 = this.f11848o;
                String str2 = this.f11836c;
                long longValue = this.f11833F.longValue();
                Bundle bundle = new Bundle();
                if (z6) {
                    zze.zzc(bundle, str2, longValue);
                }
                Bundle zze = zzanVar.zze(9, packageName, a6, bundle);
                zza = zze.getInt("RESPONSE_CODE");
                str = zze.zzh(zze, "BillingClient");
            } else {
                zza = zzanVar.zza(3, this.f11839f.getPackageName(), a6);
                str = "";
            }
            d a7 = m.a(zza, str);
            if (zza == 0) {
                zze.zzk("BillingClient", "Successfully consumed purchase.");
                interfaceC0535n.a(a7, a6);
            } else {
                m0(interfaceC0535n, a6, a7, 23, "Error consuming purchase with token. Response code: " + zza, null);
            }
        } catch (DeadObjectException e10) {
            e = e10;
        } catch (Exception e11) {
            e = e11;
        }
    }

    public final X V0(g gVar) {
        zzan zzanVar;
        ArrayList arrayList = new ArrayList();
        String c6 = gVar.c();
        zzco b6 = gVar.b();
        int size = b6.size();
        int i6 = 0;
        while (i6 < size) {
            int i7 = i6 + 20;
            ArrayList arrayList2 = new ArrayList(b6.subList(i6, i7 > size ? size : i7));
            ArrayList<String> arrayList3 = new ArrayList<>();
            int size2 = arrayList2.size();
            for (int i8 = 0; i8 < size2; i8++) {
                arrayList3.add(((g.b) arrayList2.get(i8)).b());
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList3);
            bundle.putString("playBillingLibraryVersion", this.f11836c);
            try {
                synchronized (this.f11834a) {
                    zzanVar = this.f11841h;
                }
                if (zzanVar == null) {
                    return f0(m.f11963m, 119, "Service has been reset to null.", null);
                }
                boolean z6 = true;
                int i9 = true != this.f11857x ? 17 : 20;
                String packageName = this.f11839f.getPackageName();
                boolean d02 = d0();
                String str = this.f11836c;
                S(gVar);
                S(gVar);
                S(gVar);
                S(gVar);
                long longValue = this.f11833F.longValue();
                Bundle bundle2 = new Bundle();
                zze.zzc(bundle2, str, longValue);
                bundle2.putBoolean(com.amazon.a.a.o.b.ac, true);
                bundle2.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
                if (d02) {
                    bundle2.putBoolean("enablePendingPurchaseForSubscriptions", true);
                }
                ArrayList<String> arrayList4 = new ArrayList<>();
                ArrayList<String> arrayList5 = new ArrayList<>();
                int size3 = arrayList2.size();
                int i10 = 0;
                boolean z7 = false;
                boolean z8 = false;
                while (i10 < size3) {
                    g.b bVar = (g.b) arrayList2.get(i10);
                    boolean z9 = z6;
                    arrayList4.add(null);
                    z7 |= !TextUtils.isEmpty(null);
                    String c7 = bVar.c();
                    zzan zzanVar2 = zzanVar;
                    if (c7.equals("first_party")) {
                        zzbe.zzc((Object) null, "Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
                        arrayList5.add(null);
                        z8 = z9;
                    }
                    i10++;
                    zzanVar = zzanVar2;
                    z6 = z9;
                }
                zzan zzanVar3 = zzanVar;
                if (z7) {
                    bundle2.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList4);
                }
                if (!arrayList5.isEmpty()) {
                    bundle2.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList5);
                }
                if (z8 && !TextUtils.isEmpty(null)) {
                    bundle2.putString("accountName", null);
                }
                Bundle zzl = zzanVar3.zzl(i9, packageName, c6, bundle, bundle2);
                if (zzl == null) {
                    return f0(m.f11946C, 44, "queryProductDetailsAsync got empty product details response.", null);
                }
                if (!zzl.containsKey("DETAILS_LIST")) {
                    int zzb = zze.zzb(zzl, "BillingClient");
                    String zzh = zze.zzh(zzl, "BillingClient");
                    if (zzb == 0) {
                        return f0(m.a(6, zzh), 45, "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.", null);
                    }
                    return f0(m.a(zzb, zzh), 23, "getSkuDetails() failed for queryProductDetailsAsync. Response code: " + zzb, null);
                }
                ArrayList<String> stringArrayList = zzl.getStringArrayList("DETAILS_LIST");
                if (stringArrayList == null) {
                    return f0(m.f11946C, 46, "queryProductDetailsAsync got null response list", null);
                }
                for (int i11 = 0; i11 < stringArrayList.size(); i11++) {
                    try {
                        f fVar = new f(stringArrayList.get(i11));
                        zze.zzk("BillingClient", "Got product details: ".concat(fVar.toString()));
                        arrayList.add(fVar);
                    } catch (JSONException e6) {
                        return f0(m.a(6, "Error trying to decode SkuDetails."), 47, "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e6);
                    }
                }
                i6 = i7;
            } catch (DeadObjectException e7) {
                return f0(m.f11963m, 43, "queryProductDetailsAsync got a remote exception (try to reconnect).", e7);
            } catch (Exception e8) {
                return f0(m.f11961k, 43, "queryProductDetailsAsync got a remote exception (try to reconnect).", e8);
            }
        }
        return new X(0, "", arrayList);
    }

    public final void W(zzjz zzjzVar) {
        try {
            this.f11840g.e(zzjzVar, this.f11845l);
        } catch (Throwable th) {
            zze.zzm("BillingClient", "Unable to log.", th);
        }
    }

    public final void X(zzkd zzkdVar) {
        try {
            this.f11840g.f(zzkdVar, this.f11845l);
        } catch (Throwable th) {
            zze.zzm("BillingClient", "Unable to log.", th);
        }
    }

    public final void Y(String str, final InterfaceC0546t interfaceC0546t) {
        if (!h()) {
            d dVar = m.f11963m;
            N0(2, 11, dVar);
            interfaceC0546t.a(dVar, null);
        } else if (u(new O(this, str, interfaceC0546t), 30000L, new Runnable() { // from class: L3.H
            @Override // java.lang.Runnable
            public final void run() {
                com.android.billingclient.api.b.this.w0(interfaceC0546t);
            }
        }, G0(), U()) == null) {
            d R5 = R();
            N0(25, 11, R5);
            interfaceC0546t.a(R5, null);
        }
    }

    public final InterfaceC0545s0 Y0() {
        return this.f11840g;
    }

    public final void Z(String str, final InterfaceC0548u interfaceC0548u) {
        if (!h()) {
            d dVar = m.f11963m;
            N0(2, 9, dVar);
            interfaceC0548u.onQueryPurchasesResponse(dVar, zzco.zzl());
        } else {
            if (TextUtils.isEmpty(str)) {
                zze.zzl("BillingClient", "Please provide a valid product type.");
                d dVar2 = m.f11958h;
                N0(50, 9, dVar2);
                interfaceC0548u.onQueryPurchasesResponse(dVar2, zzco.zzl());
                return;
            }
            if (u(new N(this, str, interfaceC0548u), 30000L, new Runnable() { // from class: L3.B
                @Override // java.lang.Runnable
                public final void run() {
                    com.android.billingclient.api.b.this.x0(interfaceC0548u);
                }
            }, G0(), U()) == null) {
                d R5 = R();
                N0(25, 9, R5);
                interfaceC0548u.onQueryPurchasesResponse(R5, zzco.zzl());
            }
        }
    }

    @Override // com.android.billingclient.api.a
    public void a(final C0511b c0511b, final InterfaceC0513c interfaceC0513c) {
        if (!h()) {
            d dVar = m.f11963m;
            N0(2, 3, dVar);
            interfaceC0513c.a(dVar);
            return;
        }
        if (TextUtils.isEmpty(c0511b.a())) {
            zze.zzl("BillingClient", "Please provide a valid purchase token.");
            d dVar2 = m.f11960j;
            N0(26, 3, dVar2);
            interfaceC0513c.a(dVar2);
            return;
        }
        if (!this.f11848o) {
            d dVar3 = m.f11952b;
            N0(27, 3, dVar3);
            interfaceC0513c.a(dVar3);
        } else if (u(new Callable() { // from class: L3.T0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                com.android.billingclient.api.b.this.f1(interfaceC0513c, c0511b);
                return null;
            }
        }, 30000L, new Runnable() { // from class: L3.U0
            @Override // java.lang.Runnable
            public final void run() {
                com.android.billingclient.api.b.this.p0(interfaceC0513c);
            }
        }, G0(), U()) == null) {
            d R5 = R();
            N0(25, 3, R5);
            interfaceC0513c.a(R5);
        }
    }

    public final void a0(int i6) {
        synchronized (this.f11834a) {
            try {
                if (this.f11835b == 3) {
                    return;
                }
                zze.zzk("BillingClient", "Setting clientState from " + e0(this.f11835b) + " to " + e0(i6));
                this.f11835b = i6;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final d a1(final d dVar) {
        if (Thread.interrupted()) {
            return dVar;
        }
        this.f11837d.post(new Runnable() { // from class: L3.P0
            @Override // java.lang.Runnable
            public final void run() {
                com.android.billingclient.api.b.this.q0(dVar);
            }
        });
        return dVar;
    }

    @Override // com.android.billingclient.api.a
    public void b(final C0533m c0533m, final InterfaceC0535n interfaceC0535n) {
        if (!h()) {
            d dVar = m.f11963m;
            N0(2, 4, dVar);
            interfaceC0535n.a(dVar, c0533m.a());
        } else if (u(new Callable() { // from class: L3.F
            @Override // java.util.concurrent.Callable
            public final Object call() {
                com.android.billingclient.api.b.this.g1(c0533m, interfaceC0535n);
                return null;
            }
        }, 30000L, new Runnable() { // from class: L3.G
            @Override // java.lang.Runnable
            public final void run() {
                com.android.billingclient.api.b.this.r0(interfaceC0535n, c0533m);
            }
        }, G0(), U()) == null) {
            d R5 = R();
            N0(25, 4, R5);
            interfaceC0535n.a(R5, c0533m.a());
        }
    }

    public final synchronized void b0() {
        ExecutorService executorService = this.f11831D;
        if (executorService != null) {
            executorService.shutdownNow();
            this.f11831D = null;
            this.f11832E = null;
        }
    }

    @Override // com.android.billingclient.api.a
    public void c(final InterfaceC0521g interfaceC0521g) {
        if (!h()) {
            n0(interfaceC0521g, m.f11963m, 2, null);
            return;
        }
        if (!this.f11858y) {
            zze.zzl("BillingClient", "Current client doesn't support alternative billing only.");
            n0(interfaceC0521g, m.f11948E, 66, null);
        } else if (u(new Callable() { // from class: L3.X0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                com.android.billingclient.api.b.this.k1(interfaceC0521g);
                return null;
            }
        }, 30000L, new Runnable() { // from class: L3.Y0
            @Override // java.lang.Runnable
            public final void run() {
                com.android.billingclient.api.b.this.s0(interfaceC0521g);
            }
        }, G0(), U()) == null) {
            n0(interfaceC0521g, R(), 25, null);
        }
    }

    public final void c0() {
        synchronized (this.f11834a) {
            if (this.f11842i != null) {
                try {
                    this.f11839f.unbindService(this.f11842i);
                } catch (Throwable th) {
                    try {
                        zze.zzm("BillingClient", "There was an exception while unbinding service!", th);
                        this.f11841h = null;
                        this.f11842i = null;
                    } finally {
                        this.f11841h = null;
                        this.f11842i = null;
                    }
                }
            }
        }
    }

    public final synchronized zzev c1() {
        try {
            if (this.f11832E == null) {
                this.f11832E = zzfb.zza(U());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f11832E;
    }

    @Override // com.android.billingclient.api.a
    public void d() {
        P0(12);
        synchronized (this.f11834a) {
            try {
                if (this.f11838e != null) {
                    this.f11838e.f();
                }
            } finally {
                zze.zzk("BillingClient", "Unbinding from service.");
                c0();
                b0();
            }
            try {
                zze.zzk("BillingClient", "Unbinding from service.");
                c0();
            } catch (Throwable th) {
                zze.zzm("BillingClient", "There was an exception while unbinding from the service while ending connection!", th);
            }
            try {
                b0();
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    public final boolean d0() {
        return this.f11856w && this.f11829B.b();
    }

    @Override // com.android.billingclient.api.a
    public void e(C0537o c0537o, final InterfaceC0529k interfaceC0529k) {
        if (!h()) {
            zze.zzl("BillingClient", "Service disconnected.");
            d dVar = m.f11963m;
            N0(2, 13, dVar);
            interfaceC0529k.a(dVar, null);
            return;
        }
        if (!this.f11855v) {
            zze.zzl("BillingClient", "Current client doesn't support get billing config.");
            d dVar2 = m.f11944A;
            N0(32, 13, dVar2);
            interfaceC0529k.a(dVar2, null);
            return;
        }
        if (u(new Callable() { // from class: L3.V0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                com.android.billingclient.api.b.this.h1(interfaceC0529k);
                return null;
            }
        }, 30000L, new Runnable() { // from class: L3.W0
            @Override // java.lang.Runnable
            public final void run() {
                com.android.billingclient.api.b.this.t0(interfaceC0529k);
            }
        }, G0(), U()) == null) {
            d R5 = R();
            N0(25, 13, R5);
            interfaceC0529k.a(R5, null);
        }
    }

    @Override // com.android.billingclient.api.a
    public void f(final InterfaceC0515d interfaceC0515d) {
        if (!h()) {
            l0(interfaceC0515d, m.f11963m, 2, null);
            return;
        }
        if (!this.f11858y) {
            zze.zzl("BillingClient", "Current client doesn't support alternative billing only.");
            l0(interfaceC0515d, m.f11948E, 66, null);
        } else if (u(new Callable() { // from class: L3.C
            @Override // java.util.concurrent.Callable
            public final Object call() {
                com.android.billingclient.api.b.this.l1(interfaceC0515d);
                return null;
            }
        }, 30000L, new Runnable() { // from class: L3.D
            @Override // java.lang.Runnable
            public final void run() {
                com.android.billingclient.api.b.this.u0(interfaceC0515d);
            }
        }, G0(), U()) == null) {
            l0(interfaceC0515d, R(), 25, null);
        }
    }

    public final X f0(d dVar, int i6, String str, Exception exc) {
        zze.zzm("BillingClient", str, exc);
        O0(i6, 7, dVar, AbstractC0543r0.a(exc));
        return new X(dVar.b(), dVar.a(), new ArrayList());
    }

    public final /* synthetic */ Object f1(InterfaceC0513c interfaceC0513c, C0511b c0511b) {
        zzan zzanVar;
        try {
            synchronized (this.f11834a) {
                zzanVar = this.f11841h;
            }
            if (zzanVar == null) {
                k0(interfaceC0513c, m.f11963m, 119, null);
                return null;
            }
            String packageName = this.f11839f.getPackageName();
            String a6 = c0511b.a();
            String str = this.f11836c;
            long longValue = this.f11833F.longValue();
            Bundle bundle = new Bundle();
            zze.zzc(bundle, str, longValue);
            Bundle zzd = zzanVar.zzd(9, packageName, a6, bundle);
            interfaceC0513c.a(m.a(zze.zzb(zzd, "BillingClient"), zze.zzh(zzd, "BillingClient")));
            return null;
        } catch (DeadObjectException e6) {
            k0(interfaceC0513c, m.f11963m, 28, e6);
            return null;
        } catch (Exception e7) {
            k0(interfaceC0513c, m.f11961k, 28, e7);
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.android.billingclient.api.a
    public final d g(String str) {
        char c6;
        if (!h()) {
            d dVar = m.f11963m;
            if (dVar.b() != 0) {
                N0(2, 5, dVar);
                return dVar;
            }
            P0(5);
            return dVar;
        }
        d dVar2 = m.f11951a;
        switch (str.hashCode()) {
            case -422092961:
                if (str.equals("subscriptionsUpdate")) {
                    c6 = 1;
                    break;
                }
                c6 = 65535;
                break;
            case 96321:
                if (str.equals("aaa")) {
                    c6 = 4;
                    break;
                }
                c6 = 65535;
                break;
            case 97314:
                if (str.equals("bbb")) {
                    c6 = 3;
                    break;
                }
                c6 = 65535;
                break;
            case 98307:
                if (str.equals("ccc")) {
                    c6 = 6;
                    break;
                }
                c6 = 65535;
                break;
            case 99300:
                if (str.equals("ddd")) {
                    c6 = 5;
                    break;
                }
                c6 = 65535;
                break;
            case 100293:
                if (str.equals("eee")) {
                    c6 = 7;
                    break;
                }
                c6 = 65535;
                break;
            case 101286:
                if (str.equals("fff")) {
                    c6 = '\b';
                    break;
                }
                c6 = 65535;
                break;
            case 102279:
                if (str.equals("ggg")) {
                    c6 = '\t';
                    break;
                }
                c6 = 65535;
                break;
            case 103272:
                if (str.equals("hhh")) {
                    c6 = '\n';
                    break;
                }
                c6 = 65535;
                break;
            case 104265:
                if (str.equals("iii")) {
                    c6 = 11;
                    break;
                }
                c6 = 65535;
                break;
            case 105258:
                if (str.equals("jjj")) {
                    c6 = '\f';
                    break;
                }
                c6 = 65535;
                break;
            case 106251:
                if (str.equals("kkk")) {
                    c6 = '\r';
                    break;
                }
                c6 = 65535;
                break;
            case 107244:
                if (str.equals("lll")) {
                    c6 = 14;
                    break;
                }
                c6 = 65535;
                break;
            case 207616302:
                if (str.equals("priceChangeConfirmation")) {
                    c6 = 2;
                    break;
                }
                c6 = 65535;
                break;
            case 1987365622:
                if (str.equals("subscriptions")) {
                    c6 = 0;
                    break;
                }
                c6 = 65535;
                break;
            default:
                c6 = 65535;
                break;
        }
        switch (c6) {
            case 0:
                d dVar3 = this.f11843j ? m.f11962l : m.f11965o;
                j0(dVar3, 9, 2);
                return dVar3;
            case 1:
                d dVar4 = this.f11844k ? m.f11962l : m.f11966p;
                j0(dVar4, 10, 3);
                return dVar4;
            case 2:
                d dVar5 = this.f11847n ? m.f11962l : m.f11968r;
                j0(dVar5, 35, 4);
                return dVar5;
            case 3:
                d dVar6 = this.f11850q ? m.f11962l : m.f11973w;
                j0(dVar6, 30, 5);
                return dVar6;
            case 4:
                d dVar7 = this.f11852s ? m.f11962l : m.f11969s;
                j0(dVar7, 31, 6);
                return dVar7;
            case 5:
                d dVar8 = this.f11851r ? m.f11962l : m.f11971u;
                j0(dVar8, 21, 7);
                return dVar8;
            case 6:
                d dVar9 = this.f11853t ? m.f11962l : m.f11970t;
                j0(dVar9, 19, 8);
                return dVar9;
            case 7:
                d dVar10 = this.f11853t ? m.f11962l : m.f11970t;
                j0(dVar10, 61, 9);
                return dVar10;
            case '\b':
                d dVar11 = this.f11854u ? m.f11962l : m.f11972v;
                j0(dVar11, 20, 10);
                return dVar11;
            case '\t':
                d dVar12 = this.f11855v ? m.f11962l : m.f11944A;
                j0(dVar12, 32, 11);
                return dVar12;
            case '\n':
                d dVar13 = this.f11855v ? m.f11962l : m.f11945B;
                j0(dVar13, 33, 12);
                return dVar13;
            case 11:
                d dVar14 = this.f11857x ? m.f11962l : m.f11947D;
                j0(dVar14, 60, 13);
                return dVar14;
            case '\f':
                d dVar15 = this.f11858y ? m.f11962l : m.f11948E;
                j0(dVar15, 66, 14);
                return dVar15;
            case '\r':
                d dVar16 = this.f11859z ? m.f11962l : m.f11974x;
                j0(dVar16, 103, 18);
                return dVar16;
            case 14:
                d dVar17 = this.f11828A ? m.f11962l : m.f11975y;
                j0(dVar17, 116, 19);
                return dVar17;
            default:
                zze.zzl("BillingClient", "Unsupported feature: ".concat(str));
                d dVar18 = m.f11976z;
                j0(dVar18, 34, 1);
                return dVar18;
        }
    }

    public final Y g0(d dVar, int i6, String str, Exception exc) {
        zze.zzm("BillingClient", str, exc);
        O0(i6, 11, dVar, AbstractC0543r0.a(exc));
        return new Y(dVar, null);
    }

    public final /* synthetic */ Object g1(C0533m c0533m, InterfaceC0535n interfaceC0535n) {
        V(c0533m, interfaceC0535n);
        return null;
    }

    @Override // com.android.billingclient.api.a
    public final boolean h() {
        boolean z6;
        synchronized (this.f11834a) {
            try {
                z6 = false;
                if (this.f11835b == 2 && this.f11841h != null && this.f11842i != null) {
                    z6 = true;
                }
            } finally {
            }
        }
        return z6;
    }

    public final E0 h0(int i6, d dVar, int i7, String str, Exception exc) {
        O0(i7, 9, dVar, AbstractC0543r0.a(exc));
        zze.zzm("BillingClient", str, exc);
        return new E0(dVar, null);
    }

    public final /* synthetic */ Object h1(InterfaceC0529k interfaceC0529k) {
        zzan zzanVar;
        try {
            synchronized (this.f11834a) {
                zzanVar = this.f11841h;
            }
            if (zzanVar == null) {
                K0(interfaceC0529k, m.f11963m, 119, null);
            } else {
                String packageName = this.f11839f.getPackageName();
                String str = this.f11836c;
                long longValue = this.f11833F.longValue();
                Bundle bundle = new Bundle();
                zze.zzc(bundle, str, longValue);
                zzanVar.zzp(18, packageName, bundle, new k(interfaceC0529k, this.f11840g, this.f11845l, null));
            }
        } catch (DeadObjectException e6) {
            K0(interfaceC0529k, m.f11963m, 62, e6);
        } catch (Exception e7) {
            K0(interfaceC0529k, m.f11961k, 62, e7);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x04e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x040b  */
    @Override // com.android.billingclient.api.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.android.billingclient.api.d i(android.app.Activity r29, final com.android.billingclient.api.c r30) {
        /*
            Method dump skipped, instructions count: 1359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.b.i(android.app.Activity, com.android.billingclient.api.c):com.android.billingclient.api.d");
    }

    public final E0 i0(String str, int i6) {
        zzan zzanVar;
        b bVar = this;
        zze.zzk("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        Bundle zzd = zze.zzd(bVar.f11848o, bVar.f11856w, bVar.f11829B.a(), bVar.f11829B.b(), bVar.f11836c, bVar.f11833F.longValue());
        String str2 = null;
        do {
            try {
                synchronized (bVar.f11834a) {
                    zzanVar = bVar.f11841h;
                }
                if (zzanVar == null) {
                    return bVar.h0(9, m.f11963m, 119, "Service has been reset to null", null);
                }
                Bundle zzj = bVar.f11848o ? zzanVar.zzj(true != bVar.f11856w ? 9 : 19, bVar.f11839f.getPackageName(), str, str2, zzd) : zzanVar.zzi(3, bVar.f11839f.getPackageName(), str, str2);
                G0 a6 = o.a(zzj, "BillingClient", "getPurchase()");
                d a7 = a6.a();
                if (a7 != m.f11962l) {
                    return bVar.h0(9, a7, a6.b(), "Purchase bundle invalid", null);
                }
                ArrayList<String> stringArrayList = zzj.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = zzj.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = zzj.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                boolean z6 = false;
                for (int i7 = 0; i7 < stringArrayList2.size(); i7++) {
                    String str3 = stringArrayList2.get(i7);
                    String str4 = stringArrayList3.get(i7);
                    zze.zzk("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList.get(i7))));
                    try {
                        Purchase purchase = new Purchase(str3, str4);
                        if (TextUtils.isEmpty(purchase.j())) {
                            zze.zzl("BillingClient", "BUG: empty/null token!");
                            z6 = true;
                        }
                        arrayList.add(purchase);
                    } catch (JSONException e6) {
                        return h0(9, m.f11961k, 51, "Got an exception trying to decode the purchase!", e6);
                    }
                }
                bVar = this;
                if (z6) {
                    bVar.N0(26, 9, m.f11961k);
                }
                str2 = zzj.getString("INAPP_CONTINUATION_TOKEN");
                zze.zzk("BillingClient", "Continuation token: ".concat(String.valueOf(str2)));
            } catch (DeadObjectException e7) {
                return h0(9, m.f11963m, 52, "Got exception trying to get purchases try to reconnect", e7);
            } catch (Exception e8) {
                return bVar.h0(9, m.f11961k, 52, "Got exception trying to get purchases try to reconnect", e8);
            }
        } while (!TextUtils.isEmpty(str2));
        return new E0(m.f11962l, arrayList);
    }

    public final /* synthetic */ Object i1(Bundle bundle, Activity activity, ResultReceiver resultReceiver) {
        zzan zzanVar;
        try {
            synchronized (this.f11834a) {
                zzanVar = this.f11841h;
            }
            if (zzanVar == null) {
                M0(-1, 119, null);
            } else {
                zzanVar.zzt(12, this.f11839f.getPackageName(), bundle, new W(new WeakReference(activity), resultReceiver, null));
            }
        } catch (DeadObjectException e6) {
            M0(-1, 118, e6);
        } catch (Exception e7) {
            M0(6, 118, e7);
        }
        return null;
    }

    public final void j0(d dVar, int i6, int i7) {
        zzjz zzjzVar = null;
        if (dVar.b() == 0) {
            int i8 = AbstractC0543r0.f3300a;
            try {
                zzkb zzc = zzkd.zzc();
                zzc.zzn(5);
                zzky zzc2 = zzlb.zzc();
                zzc2.zza(i7);
                zzc.zza(zzc2.zzf());
                zzjzVar = (zzkd) zzc.zzf();
            } catch (Exception e6) {
                zze.zzm("BillingLogger", "Unable to create logging payload", e6);
            }
            X(zzjzVar);
            return;
        }
        int i9 = AbstractC0543r0.f3300a;
        try {
            zzjx zzc3 = zzjz.zzc();
            zzke zzc4 = zzki.zzc();
            zzc4.zzn(dVar.b());
            zzc4.zzm(dVar.a());
            zzc4.zzo(i6);
            zzc3.zza(zzc4);
            zzc3.zzn(5);
            zzky zzc5 = zzlb.zzc();
            zzc5.zza(i7);
            zzc3.zzm(zzc5.zzf());
            zzjzVar = (zzjz) zzc3.zzf();
        } catch (Exception e7) {
            zze.zzm("BillingLogger", "Unable to create logging payload", e7);
        }
        W(zzjzVar);
    }

    @Override // com.android.billingclient.api.a
    public void k(final g gVar, final InterfaceC0544s interfaceC0544s) {
        if (!h()) {
            d dVar = m.f11963m;
            N0(2, 7, dVar);
            interfaceC0544s.onProductDetailsResponse(dVar, new ArrayList());
        } else {
            if (!this.f11854u) {
                zze.zzl("BillingClient", "Querying product details is not supported.");
                d dVar2 = m.f11972v;
                N0(20, 7, dVar2);
                interfaceC0544s.onProductDetailsResponse(dVar2, new ArrayList());
                return;
            }
            if (u(new Callable() { // from class: L3.I
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    X V02 = com.android.billingclient.api.b.this.V0(gVar);
                    interfaceC0544s.onProductDetailsResponse(com.android.billingclient.api.m.a(V02.a(), V02.b()), V02.c());
                    return null;
                }
            }, 30000L, new Runnable() { // from class: L3.J
                @Override // java.lang.Runnable
                public final void run() {
                    com.android.billingclient.api.b.this.v0(interfaceC0544s);
                }
            }, G0(), U()) == null) {
                d R5 = R();
                N0(25, 7, R5);
                interfaceC0544s.onProductDetailsResponse(R5, new ArrayList());
            }
        }
    }

    public final void k0(InterfaceC0513c interfaceC0513c, d dVar, int i6, Exception exc) {
        zze.zzm("BillingClient", "Error in acknowledge purchase!", exc);
        O0(i6, 3, dVar, AbstractC0543r0.a(exc));
        interfaceC0513c.a(dVar);
    }

    public final /* synthetic */ Void k1(InterfaceC0521g interfaceC0521g) {
        zzan zzanVar;
        try {
            synchronized (this.f11834a) {
                zzanVar = this.f11841h;
            }
            if (zzanVar == null) {
                n0(interfaceC0521g, m.f11963m, 119, null);
            } else {
                zzanVar.zzm(21, this.f11839f.getPackageName(), zze.zze(this.f11836c, this.f11833F.longValue()), new U(interfaceC0521g, this.f11840g, this.f11845l, null));
            }
        } catch (DeadObjectException e6) {
            n0(interfaceC0521g, m.f11963m, 70, e6);
        } catch (Exception e7) {
            n0(interfaceC0521g, m.f11961k, 70, e7);
        }
        return null;
    }

    @Override // com.android.billingclient.api.a
    public final void l(C0552w c0552w, InterfaceC0546t interfaceC0546t) {
        Y(c0552w.b(), interfaceC0546t);
    }

    public final void l0(InterfaceC0515d interfaceC0515d, d dVar, int i6, Exception exc) {
        O0(i6, 14, dVar, AbstractC0543r0.a(exc));
        interfaceC0515d.a(dVar);
    }

    public final /* synthetic */ Void l1(InterfaceC0515d interfaceC0515d) {
        zzan zzanVar;
        try {
            synchronized (this.f11834a) {
                zzanVar = this.f11841h;
            }
            if (zzanVar == null) {
                l0(interfaceC0515d, m.f11963m, 119, null);
            } else {
                zzanVar.zzr(21, this.f11839f.getPackageName(), zze.zze(this.f11836c, this.f11833F.longValue()), new V(interfaceC0515d, this.f11840g, this.f11845l, null));
            }
        } catch (DeadObjectException e6) {
            l0(interfaceC0515d, m.f11963m, 69, e6);
        } catch (Exception e7) {
            l0(interfaceC0515d, m.f11961k, 69, e7);
        }
        return null;
    }

    @Override // com.android.billingclient.api.a
    public final void m(C0554x c0554x, InterfaceC0548u interfaceC0548u) {
        Z(c0554x.b(), interfaceC0548u);
    }

    public final void m0(InterfaceC0535n interfaceC0535n, String str, d dVar, int i6, String str2, Exception exc) {
        zze.zzm("BillingClient", str2, exc);
        O0(i6, 4, dVar, AbstractC0543r0.a(exc));
        interfaceC0535n.a(dVar, str);
    }

    @Override // com.android.billingclient.api.a
    public d n(final Activity activity, final InterfaceC0517e interfaceC0517e) {
        if (activity == null) {
            throw new IllegalArgumentException("Please provide a valid activity.");
        }
        if (!h()) {
            d dVar = m.f11963m;
            N0(2, 16, dVar);
            return dVar;
        }
        if (!this.f11858y) {
            zze.zzl("BillingClient", "Current Play Store version doesn't support alternative billing only.");
            d dVar2 = m.f11948E;
            N0(66, 16, dVar2);
            return dVar2;
        }
        final h hVar = new h(this, this.f11837d, interfaceC0517e);
        if (u(new Callable() { // from class: L3.R0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                com.android.billingclient.api.b.this.s(interfaceC0517e, activity, hVar);
                return null;
            }
        }, 30000L, new Runnable() { // from class: L3.S0
            @Override // java.lang.Runnable
            public final void run() {
                com.android.billingclient.api.b.this.y0(interfaceC0517e);
            }
        }, this.f11837d, U()) != null) {
            return m.f11962l;
        }
        d R5 = R();
        N0(25, 16, R5);
        return R5;
    }

    public final void n0(InterfaceC0521g interfaceC0521g, d dVar, int i6, Exception exc) {
        O0(i6, 15, dVar, AbstractC0543r0.a(exc));
        interfaceC0521g.a(dVar, null);
    }

    @Override // com.android.billingclient.api.a
    public final d o(final Activity activity, C0539p c0539p, InterfaceC0541q interfaceC0541q) {
        if (!h()) {
            zze.zzl("BillingClient", "Service disconnected.");
            return m.f11963m;
        }
        if (!this.f11850q) {
            zze.zzl("BillingClient", "Current client doesn't support showing in-app messages.");
            return m.f11973w;
        }
        View findViewById = activity.findViewById(R.id.content);
        IBinder windowToken = findViewById.getWindowToken();
        Rect rect = new Rect();
        findViewById.getGlobalVisibleRect(rect);
        final Bundle bundle = new Bundle();
        androidx.core.app.f.a(bundle, "KEY_WINDOW_TOKEN", windowToken);
        bundle.putInt("KEY_DIMEN_LEFT", rect.left);
        bundle.putInt("KEY_DIMEN_TOP", rect.top);
        bundle.putInt("KEY_DIMEN_RIGHT", rect.right);
        bundle.putInt("KEY_DIMEN_BOTTOM", rect.bottom);
        bundle.putString("playBillingLibraryVersion", this.f11836c);
        bundle.putIntegerArrayList("KEY_CATEGORY_IDS", c0539p.b());
        final P p6 = new P(this, this.f11837d, interfaceC0541q);
        u(new Callable() { // from class: L3.K
            @Override // java.util.concurrent.Callable
            public final Object call() {
                com.android.billingclient.api.b.this.i1(bundle, activity, p6);
                return null;
            }
        }, 5000L, null, this.f11837d, U());
        return m.f11962l;
    }

    @Override // com.android.billingclient.api.a
    public void p(InterfaceC0525i interfaceC0525i) {
        d dVar;
        synchronized (this.f11834a) {
            try {
                if (h()) {
                    dVar = I0();
                } else if (this.f11835b == 1) {
                    zze.zzl("BillingClient", "Client is already in the process of connecting to billing service.");
                    dVar = m.f11955e;
                    N0(37, 6, dVar);
                } else if (this.f11835b == 3) {
                    zze.zzl("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                    dVar = m.f11963m;
                    N0(38, 6, dVar);
                } else {
                    a0(1);
                    c0();
                    zze.zzk("BillingClient", "Starting in-app billing setup.");
                    this.f11842i = new i(this, interfaceC0525i, null);
                    Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                    intent.setPackage("com.android.vending");
                    List<ResolveInfo> queryIntentServices = this.f11839f.getPackageManager().queryIntentServices(intent, 0);
                    int i6 = 41;
                    if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                        ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                        i6 = 40;
                        if (serviceInfo != null) {
                            String str = serviceInfo.packageName;
                            String str2 = serviceInfo.name;
                            if (!Objects.equals(str, "com.android.vending") || str2 == null) {
                                zze.zzl("BillingClient", "The device doesn't have valid Play Store.");
                            } else {
                                ComponentName componentName = new ComponentName(str, str2);
                                Intent intent2 = new Intent(intent);
                                intent2.setComponent(componentName);
                                intent2.putExtra("playBillingLibraryVersion", this.f11836c);
                                synchronized (this.f11834a) {
                                    try {
                                        if (this.f11835b == 2) {
                                            dVar = I0();
                                        } else if (this.f11835b != 1) {
                                            zze.zzl("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                            dVar = m.f11963m;
                                            N0(117, 6, dVar);
                                        } else {
                                            i iVar = this.f11842i;
                                            if (this.f11839f.bindService(intent2, iVar, 1)) {
                                                zze.zzk("BillingClient", "Service was bonded successfully.");
                                                dVar = null;
                                            } else {
                                                zze.zzl("BillingClient", "Connection to Billing service is blocked.");
                                                i6 = 39;
                                            }
                                        }
                                    } finally {
                                    }
                                }
                            }
                        } else {
                            zze.zzl("BillingClient", "The device doesn't have valid Play Store.");
                        }
                    }
                    a0(0);
                    zze.zzk("BillingClient", "Billing service unavailable on device.");
                    dVar = m.f11953c;
                    N0(i6, 6, dVar);
                }
            } finally {
            }
        }
        if (dVar != null) {
            interfaceC0525i.onBillingSetupFinished(dVar);
        }
    }

    public final /* synthetic */ void p0(InterfaceC0513c interfaceC0513c) {
        d dVar = m.f11964n;
        N0(24, 3, dVar);
        interfaceC0513c.a(dVar);
    }

    public final void q(Context context, InterfaceC0550v interfaceC0550v, e eVar, InterfaceC0556y interfaceC0556y, String str, InterfaceC0545s0 interfaceC0545s0) {
        this.f11839f = context.getApplicationContext();
        zzks zzc = zzku.zzc();
        zzc.zzo(str);
        zzc.zzn(this.f11839f.getPackageName());
        zzc.zzm(this.f11833F.longValue());
        if (interfaceC0545s0 != null) {
            this.f11840g = interfaceC0545s0;
        } else {
            this.f11840g = new C0551v0(this.f11839f, zzc.zzf());
        }
        if (interfaceC0550v == null) {
            zze.zzl("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f11838e = new N0(this.f11839f, interfaceC0550v, null, null, interfaceC0556y, this.f11840g);
        this.f11829B = eVar;
        this.f11830C = interfaceC0556y != null;
    }

    public final /* synthetic */ void q0(d dVar) {
        if (this.f11838e.d() != null) {
            this.f11838e.d().onPurchasesUpdated(dVar, null);
        } else {
            zze.zzl("BillingClient", "No valid listener is set in BroadcastManager");
        }
    }

    public final void r(Context context, InterfaceC0550v interfaceC0550v, e eVar, T t6, String str, InterfaceC0545s0 interfaceC0545s0) {
        this.f11839f = context.getApplicationContext();
        zzks zzc = zzku.zzc();
        zzc.zzo(str);
        zzc.zzn(this.f11839f.getPackageName());
        zzc.zzm(this.f11833F.longValue());
        if (interfaceC0545s0 != null) {
            this.f11840g = interfaceC0545s0;
        } else {
            this.f11840g = new C0551v0(this.f11839f, zzc.zzf());
        }
        if (interfaceC0550v == null) {
            zze.zzl("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f11838e = new N0(this.f11839f, interfaceC0550v, null, t6, null, this.f11840g);
        this.f11829B = eVar;
        this.f11830C = t6 != null;
        this.f11839f.getPackageName();
    }

    public final /* synthetic */ void r0(InterfaceC0535n interfaceC0535n, C0533m c0533m) {
        d dVar = m.f11964n;
        N0(24, 4, dVar);
        interfaceC0535n.a(dVar, c0533m.a());
    }

    public final /* synthetic */ Void s(InterfaceC0517e interfaceC0517e, Activity activity, ResultReceiver resultReceiver) {
        zzan zzanVar;
        try {
            synchronized (this.f11834a) {
                zzanVar = this.f11841h;
            }
            if (zzanVar == null) {
                L0(interfaceC0517e, m.f11963m, 119, null);
            } else {
                zzanVar.zzo(21, this.f11839f.getPackageName(), zze.zze(this.f11836c, this.f11833F.longValue()), new j(new WeakReference(activity), resultReceiver, null));
            }
        } catch (DeadObjectException e6) {
            L0(interfaceC0517e, m.f11963m, 74, e6);
        } catch (Exception e7) {
            L0(interfaceC0517e, m.f11961k, 74, e7);
        }
        return null;
    }

    public final /* synthetic */ void s0(InterfaceC0521g interfaceC0521g) {
        n0(interfaceC0521g, m.f11964n, 24, null);
    }

    public final /* synthetic */ void t0(InterfaceC0529k interfaceC0529k) {
        d dVar = m.f11964n;
        N0(24, 13, dVar);
        interfaceC0529k.a(dVar, null);
    }

    public final /* synthetic */ void u0(InterfaceC0515d interfaceC0515d) {
        l0(interfaceC0515d, m.f11964n, 24, null);
    }

    public final /* synthetic */ void v0(InterfaceC0544s interfaceC0544s) {
        d dVar = m.f11964n;
        N0(24, 7, dVar);
        interfaceC0544s.onProductDetailsResponse(dVar, new ArrayList());
    }

    public final /* synthetic */ void w0(InterfaceC0546t interfaceC0546t) {
        d dVar = m.f11964n;
        N0(24, 11, dVar);
        interfaceC0546t.a(dVar, null);
    }

    public final /* synthetic */ void x0(InterfaceC0548u interfaceC0548u) {
        d dVar = m.f11964n;
        N0(24, 9, dVar);
        interfaceC0548u.onQueryPurchasesResponse(dVar, zzco.zzl());
    }

    public final /* synthetic */ void y0(InterfaceC0517e interfaceC0517e) {
        L0(interfaceC0517e, m.f11964n, 24, null);
    }

    public b(String str, Context context, InterfaceC0545s0 interfaceC0545s0, ExecutorService executorService) {
        this.f11834a = new Object();
        this.f11835b = 0;
        this.f11837d = new Handler(Looper.getMainLooper());
        this.f11845l = 0;
        Long valueOf = Long.valueOf(new Random().nextLong());
        this.f11833F = valueOf;
        String T5 = T();
        this.f11836c = T5;
        this.f11839f = context.getApplicationContext();
        zzks zzc = zzku.zzc();
        zzc.zzo(T5);
        zzc.zzn(this.f11839f.getPackageName());
        zzc.zzm(valueOf.longValue());
        this.f11840g = new C0551v0(this.f11839f, zzc.zzf());
        this.f11839f.getPackageName();
    }

    public b(String str, e eVar, Context context, InterfaceC0557y0 interfaceC0557y0, InterfaceC0545s0 interfaceC0545s0, ExecutorService executorService) {
        this.f11834a = new Object();
        this.f11835b = 0;
        this.f11837d = new Handler(Looper.getMainLooper());
        this.f11845l = 0;
        Long valueOf = Long.valueOf(new Random().nextLong());
        this.f11833F = valueOf;
        this.f11836c = T();
        this.f11839f = context.getApplicationContext();
        zzks zzc = zzku.zzc();
        zzc.zzo(T());
        zzc.zzn(this.f11839f.getPackageName());
        zzc.zzm(valueOf.longValue());
        this.f11840g = new C0551v0(this.f11839f, zzc.zzf());
        zze.zzl("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f11838e = new N0(this.f11839f, null, null, null, null, this.f11840g);
        this.f11829B = eVar;
        this.f11839f.getPackageName();
    }

    public b(String str, e eVar, Context context, InterfaceC0550v interfaceC0550v, T t6, InterfaceC0545s0 interfaceC0545s0, ExecutorService executorService) {
        String T5 = T();
        this.f11834a = new Object();
        this.f11835b = 0;
        this.f11837d = new Handler(Looper.getMainLooper());
        this.f11845l = 0;
        this.f11833F = Long.valueOf(new Random().nextLong());
        this.f11836c = T5;
        r(context, interfaceC0550v, eVar, null, T5, null);
    }

    public b(String str, e eVar, Context context, InterfaceC0550v interfaceC0550v, InterfaceC0556y interfaceC0556y, InterfaceC0545s0 interfaceC0545s0, ExecutorService executorService) {
        this(context, eVar, interfaceC0550v, T(), null, interfaceC0556y, null, null);
    }
}
