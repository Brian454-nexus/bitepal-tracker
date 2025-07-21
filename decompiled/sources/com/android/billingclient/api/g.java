package com.android.billingclient.api;

import L3.H0;
import com.google.android.gms.internal.play_billing.zzco;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final zzco f11924a;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public zzco f11925a;

        public /* synthetic */ a(H0 h02) {
        }

        public g a() {
            if (this.f11925a != null) {
                return new g(this, null);
            }
            throw new IllegalArgumentException("Product list must be set to a non empty list.");
        }

        public a b(List list) {
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("Product list cannot be empty.");
            }
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                if (!"play_pass_subs".equals(bVar.c())) {
                    hashSet.add(bVar.c());
                }
            }
            if (hashSet.size() > 1) {
                throw new IllegalArgumentException("All products should be of the same product type.");
            }
            this.f11925a = zzco.zzk(list);
            return this;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f11926a;

        /* renamed from: b, reason: collision with root package name */
        public final String f11927b;

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static class a {

            /* renamed from: a, reason: collision with root package name */
            public String f11928a;

            /* renamed from: b, reason: collision with root package name */
            public String f11929b;

            public /* synthetic */ a(H0 h02) {
            }

            public b a() {
                if ("first_party".equals(this.f11929b)) {
                    throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
                }
                if (this.f11928a == null) {
                    throw new IllegalArgumentException("Product id must be provided.");
                }
                if (this.f11929b != null) {
                    return new b(this, null);
                }
                throw new IllegalArgumentException("Product type must be provided.");
            }

            public a b(String str) {
                this.f11928a = str;
                return this;
            }

            public a c(String str) {
                this.f11929b = str;
                return this;
            }
        }

        public /* synthetic */ b(a aVar, H0 h02) {
            this.f11926a = aVar.f11928a;
            this.f11927b = aVar.f11929b;
        }

        public static a a() {
            return new a(null);
        }

        public final String b() {
            return this.f11926a;
        }

        public final String c() {
            return this.f11927b;
        }
    }

    public /* synthetic */ g(a aVar, H0 h02) {
        this.f11924a = aVar.f11925a;
    }

    public static a a() {
        return new a(null);
    }

    public final zzco b() {
        return this.f11924a;
    }

    public final String c() {
        return ((b) this.f11924a.get(0)).c();
    }
}
