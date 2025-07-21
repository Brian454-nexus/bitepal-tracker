package com.android.billingclient.api;

import L3.AbstractC0543r0;
import L3.C0511b;
import L3.C0520f0;
import L3.C0528j0;
import L3.C0530k0;
import L3.C0533m;
import L3.InterfaceC0513c;
import L3.InterfaceC0525i;
import L3.InterfaceC0535n;
import L3.InterfaceC0544s;
import L3.InterfaceC0545s0;
import L3.InterfaceC0550v;
import L3.InterfaceC0556y;
import L3.InterfaceC0557y0;
import L3.ServiceConnectionC0534m0;
import L3.T;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.google.android.gms.internal.play_billing.zzav;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzel;
import com.google.android.gms.internal.play_billing.zzeu;
import com.google.android.gms.internal.play_billing.zzew;
import com.google.android.gms.internal.play_billing.zzfb;
import com.google.android.gms.internal.play_billing.zzjz;
import com.google.android.gms.internal.play_billing.zzkd;
import com.google.android.gms.internal.play_billing.zzr;
import com.google.android.gms.internal.play_billing.zzv;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class l extends b {

    /* renamed from: G */
    public final Context f11939G;

    /* renamed from: H */
    public volatile int f11940H;

    /* renamed from: I */
    public volatile zzav f11941I;

    /* renamed from: J */
    public volatile ServiceConnectionC0534m0 f11942J;

    /* renamed from: K */
    public volatile zzew f11943K;

    public l(String str, Context context, InterfaceC0545s0 interfaceC0545s0, ExecutorService executorService) {
        super(null, context, null, null);
        this.f11940H = 0;
        this.f11939G = context;
    }

    public static final boolean A1(int i6) {
        return i6 > 0;
    }

    public final d B1(int i6, int i7) {
        d a6 = m.a(i7, "Billing override value was set by a license tester.");
        D1(105, i6, a6);
        return a6;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [L3.f0] */
    public final zzeu C1(final int i6) {
        if (r1()) {
            return zzv.zza((C0520f0) new Object() { // from class: L3.f0
                public final Object a(zzr zzrVar) {
                    return com.android.billingclient.api.l.this.t1(i6, zzrVar);
                }
            });
        }
        zze.zzl("BillingClientTesting", "Billing Override Service is not ready.");
        D1(106, 28, m.a(-1, "Billing Override Service connection is disconnected."));
        return zzel.zza(0);
    }

    public final void D1(int i6, int i7, d dVar) {
        zzjz b6 = AbstractC0543r0.b(i6, i7, dVar);
        Objects.requireNonNull(b6, "ApiFailure should not be null");
        Y0().d(b6);
    }

    public final void E1(int i6) {
        zzkd d6 = AbstractC0543r0.d(i6);
        Objects.requireNonNull(d6, "ApiSuccess should not be null");
        Y0().g(d6);
    }

    public final void F1(int i6, Consumer consumer, Runnable runnable) {
        zzel.zzc(zzel.zzb(C1(i6), 28500L, TimeUnit.MILLISECONDS, x1()), new C0528j0(this, i6, consumer, runnable), c1());
    }

    public final /* synthetic */ d G1(Activity activity, c cVar) {
        return super.i(activity, cVar);
    }

    @Override // com.android.billingclient.api.b, com.android.billingclient.api.a
    public final void a(final C0511b c0511b, final InterfaceC0513c interfaceC0513c) {
        Objects.requireNonNull(interfaceC0513c);
        F1(3, new Consumer() { // from class: L3.g0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                InterfaceC0513c.this.a((com.android.billingclient.api.d) obj);
            }
        }, new Runnable() { // from class: L3.h0
            @Override // java.lang.Runnable
            public final void run() {
                com.android.billingclient.api.l.this.m1(c0511b, interfaceC0513c);
            }
        });
    }

    @Override // com.android.billingclient.api.b, com.android.billingclient.api.a
    public final void b(final C0533m c0533m, final InterfaceC0535n interfaceC0535n) {
        F1(4, new Consumer() { // from class: L3.d0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                InterfaceC0535n.this.a((com.android.billingclient.api.d) obj, c0533m.a());
            }
        }, new Runnable() { // from class: L3.e0
            @Override // java.lang.Runnable
            public final void run() {
                com.android.billingclient.api.l.this.n1(c0533m, interfaceC0535n);
            }
        });
    }

    @Override // com.android.billingclient.api.b, com.android.billingclient.api.a
    public final void d() {
        y1();
        super.d();
    }

    @Override // com.android.billingclient.api.b, com.android.billingclient.api.a
    public final d i(final Activity activity, final c cVar) {
        Consumer consumer = new Consumer() { // from class: L3.i0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                com.android.billingclient.api.l.this.o1((com.android.billingclient.api.d) obj);
            }
        };
        Callable callable = new Callable() { // from class: L3.b0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return com.android.billingclient.api.l.this.G1(activity, cVar);
            }
        };
        int w12 = w1(C1(2));
        if (A1(w12)) {
            d B12 = B1(2, w12);
            consumer.accept(B12);
            return B12;
        }
        try {
            return (d) callable.call();
        } catch (Exception e6) {
            d dVar = m.f11961k;
            D1(115, 2, dVar);
            zze.zzm("BillingClientTesting", "An internal error occurred.", e6);
            return dVar;
        }
    }

    @Override // com.android.billingclient.api.b, com.android.billingclient.api.a
    public final void k(final g gVar, final InterfaceC0544s interfaceC0544s) {
        F1(7, new Consumer() { // from class: L3.a0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ArrayList arrayList = new ArrayList();
                InterfaceC0544s.this.onProductDetailsResponse((com.android.billingclient.api.d) obj, arrayList);
            }
        }, new Runnable() { // from class: L3.c0
            @Override // java.lang.Runnable
            public final void run() {
                com.android.billingclient.api.l.this.p1(gVar, interfaceC0544s);
            }
        });
    }

    public final /* synthetic */ void m1(C0511b c0511b, InterfaceC0513c interfaceC0513c) {
        super.a(c0511b, interfaceC0513c);
    }

    public final /* synthetic */ void n1(C0533m c0533m, InterfaceC0535n interfaceC0535n) {
        super.b(c0533m, interfaceC0535n);
    }

    public final /* synthetic */ void o1(d dVar) {
        super.a1(dVar);
    }

    @Override // com.android.billingclient.api.b, com.android.billingclient.api.a
    public final void p(InterfaceC0525i interfaceC0525i) {
        z1();
        super.p(interfaceC0525i);
    }

    public final /* synthetic */ void p1(g gVar, InterfaceC0544s interfaceC0544s) {
        super.k(gVar, interfaceC0544s);
    }

    public final synchronized boolean r1() {
        if (this.f11940H == 2 && this.f11941I != null) {
            if (this.f11942J != null) {
                return true;
            }
        }
        return false;
    }

    public final /* synthetic */ Object t1(int i6, zzr zzrVar) {
        String str;
        try {
            if (this.f11941I == null) {
                throw null;
            }
            zzav zzavVar = this.f11941I;
            String packageName = this.f11939G.getPackageName();
            switch (i6) {
                case 2:
                    str = "LAUNCH_BILLING_FLOW";
                    break;
                case 3:
                    str = "ACKNOWLEDGE_PURCHASE";
                    break;
                case 4:
                    str = "CONSUME_ASYNC";
                    break;
                case 5:
                    str = "IS_FEATURE_SUPPORTED";
                    break;
                case 6:
                    str = "START_CONNECTION";
                    break;
                case 7:
                    str = "QUERY_PRODUCT_DETAILS_ASYNC";
                    break;
                default:
                    str = "QUERY_SKU_DETAILS_ASYNC";
                    break;
            }
            zzavVar.zza(packageName, str, new C0530k0(zzrVar));
            return "billingOverrideService.getBillingOverride";
        } catch (Exception e6) {
            D1(107, 28, m.f11950G);
            zze.zzm("BillingClientTesting", "An error occurred while retrieving billing override.", e6);
            zzrVar.zzb(0);
            return "billingOverrideService.getBillingOverride";
        }
    }

    public final int w1(zzeu zzeuVar) {
        try {
            return ((Integer) zzeuVar.get(28500L, TimeUnit.MILLISECONDS)).intValue();
        } catch (TimeoutException e6) {
            D1(114, 28, m.f11950G);
            zze.zzm("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", e6);
            return 0;
        } catch (Exception e7) {
            if (e7 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            D1(107, 28, m.f11950G);
            zze.zzm("BillingClientTesting", "An error occurred while retrieving billing override.", e7);
            return 0;
        }
    }

    public final synchronized zzew x1() {
        try {
            if (this.f11943K == null) {
                this.f11943K = zzfb.zzb(Executors.newSingleThreadScheduledExecutor());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f11943K;
    }

    public final synchronized void y1() {
        E1(27);
        try {
            try {
                if (this.f11942J != null && this.f11941I != null) {
                    zze.zzk("BillingClientTesting", "Unbinding from Billing Override Service.");
                    this.f11939G.unbindService(this.f11942J);
                    this.f11942J = new ServiceConnectionC0534m0(this, null);
                }
                this.f11941I = null;
                if (this.f11943K != null) {
                    this.f11943K.shutdownNow();
                    this.f11943K = null;
                }
            } catch (RuntimeException e6) {
                zze.zzm("BillingClientTesting", "There was an exception while ending Billing Override Service connection!", e6);
            }
            this.f11940H = 3;
        } catch (Throwable th) {
            this.f11940H = 3;
            throw th;
        }
    }

    public final synchronized void z1() {
        if (r1()) {
            zze.zzk("BillingClientTesting", "Billing Override Service connection is valid. No need to re-initialize.");
            E1(26);
            return;
        }
        int i6 = 1;
        if (this.f11940H == 1) {
            zze.zzl("BillingClientTesting", "Client is already in the process of connecting to Billing Override Service.");
            return;
        }
        if (this.f11940H == 3) {
            zze.zzl("BillingClientTesting", "Billing Override Service Client was already closed and can't be reused. Please create another instance.");
            D1(38, 26, m.a(-1, "Billing Override Service connection is disconnected."));
            return;
        }
        this.f11940H = 1;
        zze.zzk("BillingClientTesting", "Starting Billing Override Service setup.");
        this.f11942J = new ServiceConnectionC0534m0(this, null);
        Intent intent = new Intent("com.google.android.apps.play.billingtestcompanion.BillingOverrideService.BIND");
        intent.setPackage("com.google.android.apps.play.billingtestcompanion");
        List<ResolveInfo> queryIntentServices = this.f11939G.getPackageManager().queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            i6 = 41;
        } else {
            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
            if (serviceInfo != null) {
                String str = serviceInfo.packageName;
                String str2 = serviceInfo.name;
                if (!Objects.equals(str, "com.google.android.apps.play.billingtestcompanion") || str2 == null) {
                    zze.zzl("BillingClientTesting", "The device doesn't have valid Play Billing Lab.");
                } else {
                    ComponentName componentName = new ComponentName(str, str2);
                    Intent intent2 = new Intent(intent);
                    intent2.setComponent(componentName);
                    if (this.f11939G.bindService(intent2, this.f11942J, 1)) {
                        zze.zzk("BillingClientTesting", "Billing Override Service was bonded successfully.");
                        return;
                    }
                    zze.zzl("BillingClientTesting", "Connection to Billing Override Service is blocked.");
                }
                i6 = 39;
            }
        }
        this.f11940H = 0;
        zze.zzk("BillingClientTesting", "Billing Override Service unavailable on device.");
        D1(i6, 26, m.a(2, "Billing Override Service unavailable on device."));
    }

    public l(String str, e eVar, Context context, InterfaceC0557y0 interfaceC0557y0, InterfaceC0545s0 interfaceC0545s0, ExecutorService executorService) {
        super(null, eVar, context, null, null, null);
        this.f11940H = 0;
        this.f11939G = context;
    }

    public l(String str, e eVar, Context context, InterfaceC0550v interfaceC0550v, T t6, InterfaceC0545s0 interfaceC0545s0, ExecutorService executorService) {
        super((String) null, eVar, context, interfaceC0550v, (T) null, (InterfaceC0545s0) null, (ExecutorService) null);
        this.f11940H = 0;
        this.f11939G = context;
    }

    public l(String str, e eVar, Context context, InterfaceC0550v interfaceC0550v, InterfaceC0556y interfaceC0556y, InterfaceC0545s0 interfaceC0545s0, ExecutorService executorService) {
        super((String) null, eVar, context, interfaceC0550v, interfaceC0556y, (InterfaceC0545s0) null, (ExecutorService) null);
        this.f11940H = 0;
        this.f11939G = context;
    }
}
