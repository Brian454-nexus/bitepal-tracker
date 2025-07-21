package com.android.billingclient.api;

import L3.C0511b;
import L3.C0533m;
import L3.C0537o;
import L3.C0539p;
import L3.C0552w;
import L3.C0554x;
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
import L3.O0;
import L3.T;
import android.app.Activity;
import android.content.Context;
import com.android.billingclient.api.e;
import com.google.android.gms.internal.play_billing.zze;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.ExecutorService;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class a {

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.android.billingclient.api.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public @interface InterfaceC0180a {
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public volatile e f11822a;

        /* renamed from: b, reason: collision with root package name */
        public final Context f11823b;

        /* renamed from: c, reason: collision with root package name */
        public volatile InterfaceC0550v f11824c;

        /* renamed from: d, reason: collision with root package name */
        public volatile InterfaceC0556y f11825d;

        /* renamed from: e, reason: collision with root package name */
        public volatile boolean f11826e;

        /* renamed from: f, reason: collision with root package name */
        public volatile boolean f11827f;

        public /* synthetic */ b(Context context, O0 o02) {
            this.f11823b = context;
        }

        public a a() {
            if (this.f11823b == null) {
                throw new IllegalArgumentException("Please provide a valid Context.");
            }
            if (this.f11824c == null) {
                if (this.f11825d != null) {
                    throw new IllegalArgumentException("Please provide a valid listener for Google Play Billing purchases updates when enabling User Choice Billing.");
                }
                if (!this.f11826e && !this.f11827f) {
                    throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
                }
                Context context = this.f11823b;
                return g() ? new l(null, context, null, null) : new com.android.billingclient.api.b(null, context, null, null);
            }
            if (this.f11822a == null || !this.f11822a.a()) {
                throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
            }
            if (this.f11824c == null) {
                e eVar = this.f11822a;
                Context context2 = this.f11823b;
                return g() ? new l(null, eVar, context2, null, null, null) : new com.android.billingclient.api.b(null, eVar, context2, null, null, null);
            }
            if (this.f11825d == null) {
                e eVar2 = this.f11822a;
                Context context3 = this.f11823b;
                InterfaceC0550v interfaceC0550v = this.f11824c;
                return g() ? new l((String) null, eVar2, context3, interfaceC0550v, (T) null, (InterfaceC0545s0) null, (ExecutorService) null) : new com.android.billingclient.api.b((String) null, eVar2, context3, interfaceC0550v, (T) null, (InterfaceC0545s0) null, (ExecutorService) null);
            }
            e eVar3 = this.f11822a;
            Context context4 = this.f11823b;
            InterfaceC0550v interfaceC0550v2 = this.f11824c;
            InterfaceC0556y interfaceC0556y = this.f11825d;
            return g() ? new l((String) null, eVar3, context4, interfaceC0550v2, interfaceC0556y, (InterfaceC0545s0) null, (ExecutorService) null) : new com.android.billingclient.api.b((String) null, eVar3, context4, interfaceC0550v2, interfaceC0556y, (InterfaceC0545s0) null, (ExecutorService) null);
        }

        public b b() {
            this.f11826e = true;
            return this;
        }

        public b c() {
            e.a c6 = e.c();
            c6.b();
            d(c6.a());
            return this;
        }

        public b d(e eVar) {
            this.f11822a = eVar;
            return this;
        }

        public b e(InterfaceC0556y interfaceC0556y) {
            this.f11825d = interfaceC0556y;
            return this;
        }

        public b f(InterfaceC0550v interfaceC0550v) {
            this.f11824c = interfaceC0550v;
            return this;
        }

        public final boolean g() {
            try {
                return this.f11823b.getPackageManager().getApplicationInfo(this.f11823b.getPackageName(), 128).metaData.getBoolean("com.google.android.play.billingclient.enableBillingOverridesTesting", false);
            } catch (Exception e6) {
                zze.zzm("BillingClient", "Unable to retrieve metadata value for enableBillingOverridesTesting.", e6);
                return false;
            }
        }
    }

    public static b j(Context context) {
        return new b(context, null);
    }

    public abstract void a(C0511b c0511b, InterfaceC0513c interfaceC0513c);

    public abstract void b(C0533m c0533m, InterfaceC0535n interfaceC0535n);

    public abstract void c(InterfaceC0521g interfaceC0521g);

    public abstract void d();

    public abstract void e(C0537o c0537o, InterfaceC0529k interfaceC0529k);

    public abstract void f(InterfaceC0515d interfaceC0515d);

    public abstract d g(String str);

    public abstract boolean h();

    public abstract d i(Activity activity, c cVar);

    public abstract void k(g gVar, InterfaceC0544s interfaceC0544s);

    public abstract void l(C0552w c0552w, InterfaceC0546t interfaceC0546t);

    public abstract void m(C0554x c0554x, InterfaceC0548u interfaceC0548u);

    public abstract d n(Activity activity, InterfaceC0517e interfaceC0517e);

    public abstract d o(Activity activity, C0539p c0539p, InterfaceC0541q interfaceC0541q);

    public abstract void p(InterfaceC0525i interfaceC0525i);
}
