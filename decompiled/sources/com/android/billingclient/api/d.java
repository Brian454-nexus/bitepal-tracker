package com.android.billingclient.api;

import L3.AbstractC0547t0;
import com.google.android.gms.internal.play_billing.zze;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public int f11884a;

    /* renamed from: b, reason: collision with root package name */
    public String f11885b;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f11886a;

        /* renamed from: b, reason: collision with root package name */
        public String f11887b = "";

        public /* synthetic */ a(AbstractC0547t0 abstractC0547t0) {
        }

        public d a() {
            d dVar = new d();
            dVar.f11884a = this.f11886a;
            dVar.f11885b = this.f11887b;
            return dVar;
        }

        public a b(String str) {
            this.f11887b = str;
            return this;
        }

        public a c(int i6) {
            this.f11886a = i6;
            return this;
        }
    }

    public static a c() {
        return new a(null);
    }

    public String a() {
        return this.f11885b;
    }

    public int b() {
        return this.f11884a;
    }

    public String toString() {
        return "Response Code: " + zze.zzi(this.f11884a) + ", Debug Message: " + this.f11885b;
    }
}
