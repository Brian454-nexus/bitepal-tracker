package com.android.billingclient.api;

import L3.AbstractC0542q0;
import android.text.TextUtils;
import com.android.billingclient.api.c;
import com.android.billingclient.api.f;
import com.google.android.gms.internal.play_billing.zzbe;
import com.google.android.gms.internal.play_billing.zzco;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f11860a;

    /* renamed from: b, reason: collision with root package name */
    public String f11861b;

    /* renamed from: c, reason: collision with root package name */
    public String f11862c;

    /* renamed from: d, reason: collision with root package name */
    public C0181c f11863d;

    /* renamed from: e, reason: collision with root package name */
    public zzco f11864e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f11865f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f11866g;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public String f11867a;

        /* renamed from: b, reason: collision with root package name */
        public String f11868b;

        /* renamed from: c, reason: collision with root package name */
        public List f11869c;

        /* renamed from: d, reason: collision with root package name */
        public ArrayList f11870d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f11871e;

        /* renamed from: f, reason: collision with root package name */
        public C0181c.a f11872f;

        public /* synthetic */ a(AbstractC0542q0 abstractC0542q0) {
            C0181c.a a6 = C0181c.a();
            C0181c.a.e(a6);
            this.f11872f = a6;
        }

        public c a() {
            ArrayList arrayList = this.f11870d;
            boolean z6 = (arrayList == null || arrayList.isEmpty()) ? false : true;
            List list = this.f11869c;
            boolean z7 = (list == null || list.isEmpty()) ? false : true;
            if (!z6 && !z7) {
                throw new IllegalArgumentException("Details of the products must be provided.");
            }
            if (z6 && z7) {
                throw new IllegalArgumentException("Set SkuDetails or ProductDetailsParams, not both.");
            }
            AbstractC0542q0 abstractC0542q0 = null;
            if (!z6) {
                this.f11869c.forEach(new Consumer() { // from class: L3.p0
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        if (((c.b) obj) == null) {
                            throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
                        }
                    }
                });
            } else {
                if (this.f11870d.contains(null)) {
                    throw new IllegalArgumentException("SKU cannot be null.");
                }
                if (this.f11870d.size() > 1) {
                    android.support.v4.media.session.b.a(this.f11870d.get(0));
                    throw null;
                }
            }
            c cVar = new c(abstractC0542q0);
            if (z6) {
                android.support.v4.media.session.b.a(this.f11870d.get(0));
                throw null;
            }
            cVar.f11860a = z7 && !((b) this.f11869c.get(0)).b().h().isEmpty();
            cVar.f11861b = this.f11867a;
            cVar.f11862c = this.f11868b;
            cVar.f11863d = this.f11872f.a();
            ArrayList arrayList2 = this.f11870d;
            cVar.f11865f = arrayList2 != null ? new ArrayList(arrayList2) : new ArrayList();
            cVar.f11866g = this.f11871e;
            List list2 = this.f11869c;
            cVar.f11864e = list2 != null ? zzco.zzk(list2) : zzco.zzl();
            return cVar;
        }

        public a b(boolean z6) {
            this.f11871e = z6;
            return this;
        }

        public a c(String str) {
            this.f11867a = str;
            return this;
        }

        public a d(String str) {
            this.f11868b = str;
            return this;
        }

        public a e(List list) {
            this.f11869c = new ArrayList(list);
            return this;
        }

        public a f(C0181c c0181c) {
            this.f11872f = C0181c.c(c0181c);
            return this;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final f f11873a;

        /* renamed from: b, reason: collision with root package name */
        public final String f11874b;

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static class a {

            /* renamed from: a, reason: collision with root package name */
            public f f11875a;

            /* renamed from: b, reason: collision with root package name */
            public String f11876b;

            public /* synthetic */ a(AbstractC0542q0 abstractC0542q0) {
            }

            public b a() {
                zzbe.zzc(this.f11875a, "ProductDetails is required for constructing ProductDetailsParams.");
                if (this.f11875a.f() != null) {
                    zzbe.zzc(this.f11876b, "offerToken is required for constructing ProductDetailsParams for subscriptions.");
                }
                return new b(this, null);
            }

            public a b(String str) {
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("offerToken can not be empty");
                }
                this.f11876b = str;
                return this;
            }

            public a c(f fVar) {
                this.f11875a = fVar;
                if (fVar.c() != null) {
                    fVar.c().getClass();
                    f.b c6 = fVar.c();
                    if (c6.e() != null) {
                        this.f11876b = c6.e();
                    }
                }
                return this;
            }
        }

        public /* synthetic */ b(a aVar, AbstractC0542q0 abstractC0542q0) {
            this.f11873a = aVar.f11875a;
            this.f11874b = aVar.f11876b;
        }

        public static a a() {
            return new a(null);
        }

        public final f b() {
            return this.f11873a;
        }

        public final String c() {
            return this.f11874b;
        }
    }

    /* renamed from: com.android.billingclient.api.c$c, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class C0181c {

        /* renamed from: a, reason: collision with root package name */
        public String f11877a;

        /* renamed from: b, reason: collision with root package name */
        public String f11878b;

        /* renamed from: c, reason: collision with root package name */
        public int f11879c = 0;

        /* renamed from: com.android.billingclient.api.c$c$a */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static class a {

            /* renamed from: a, reason: collision with root package name */
            public String f11880a;

            /* renamed from: b, reason: collision with root package name */
            public String f11881b;

            /* renamed from: c, reason: collision with root package name */
            public boolean f11882c;

            /* renamed from: d, reason: collision with root package name */
            public int f11883d = 0;

            public /* synthetic */ a(AbstractC0542q0 abstractC0542q0) {
            }

            public static /* synthetic */ a e(a aVar) {
                aVar.f11882c = true;
                return aVar;
            }

            public C0181c a() {
                boolean z6 = true;
                AbstractC0542q0 abstractC0542q0 = null;
                if (TextUtils.isEmpty(this.f11880a) && TextUtils.isEmpty(null)) {
                    z6 = false;
                }
                boolean isEmpty = TextUtils.isEmpty(this.f11881b);
                if (z6 && !isEmpty) {
                    throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                }
                if (!this.f11882c && !z6 && isEmpty) {
                    throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                }
                C0181c c0181c = new C0181c(abstractC0542q0);
                c0181c.f11877a = this.f11880a;
                c0181c.f11879c = this.f11883d;
                c0181c.f11878b = this.f11881b;
                return c0181c;
            }

            public a b(String str) {
                this.f11880a = str;
                return this;
            }

            public a c(String str) {
                this.f11881b = str;
                return this;
            }

            public a d(int i6) {
                this.f11883d = i6;
                return this;
            }

            public final a f(String str) {
                this.f11880a = str;
                return this;
            }
        }

        public /* synthetic */ C0181c(AbstractC0542q0 abstractC0542q0) {
        }

        public static a a() {
            return new a(null);
        }

        public static /* bridge */ /* synthetic */ a c(C0181c c0181c) {
            a a6 = a();
            a6.f(c0181c.f11877a);
            a6.d(c0181c.f11879c);
            a6.c(c0181c.f11878b);
            return a6;
        }

        public final int b() {
            return this.f11879c;
        }

        public final String d() {
            return this.f11877a;
        }

        public final String e() {
            return this.f11878b;
        }
    }

    public /* synthetic */ c(AbstractC0542q0 abstractC0542q0) {
    }

    public static a a() {
        return new a(null);
    }

    public final int b() {
        return this.f11863d.b();
    }

    public final d c() {
        if (this.f11864e.isEmpty()) {
            return m.f11962l;
        }
        b bVar = (b) this.f11864e.get(0);
        for (int i6 = 1; i6 < this.f11864e.size(); i6++) {
            b bVar2 = (b) this.f11864e.get(i6);
            if (!bVar2.b().e().equals(bVar.b().e()) && !bVar2.b().e().equals("play_pass_subs")) {
                return m.a(5, "All products should have same ProductType.");
            }
        }
        String h6 = bVar.b().h();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        zzco zzcoVar = this.f11864e;
        int size = zzcoVar.size();
        for (int i7 = 0; i7 < size; i7++) {
            b bVar3 = (b) zzcoVar.get(i7);
            bVar3.b().e().equals("subs");
            if (hashSet.contains(bVar3.b().d())) {
                return m.a(5, String.format("ProductId can not be duplicated. Invalid product id: %s.", bVar3.b().d()));
            }
            hashSet.add(bVar3.b().d());
            if (!bVar.b().e().equals("play_pass_subs") && !bVar3.b().e().equals("play_pass_subs") && !h6.equals(bVar3.b().h())) {
                return m.a(5, "All products must have the same package name.");
            }
        }
        Iterator it = hashSet2.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (hashSet.contains(str)) {
                return m.a(5, String.format("OldProductId must not be one of the products to be purchased. Invalid old product id: %s.", str));
            }
        }
        f.b c6 = bVar.b().c();
        return (c6 == null || c6.d() == null) ? m.f11962l : m.a(5, "Both autoPayDetails and autoPayBalanceThreshold is required for constructing ProductDetailsParams for autopay.");
    }

    public final String d() {
        return this.f11861b;
    }

    public final String e() {
        return this.f11862c;
    }

    public final String f() {
        return this.f11863d.d();
    }

    public final String g() {
        return this.f11863d.e();
    }

    public final ArrayList h() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f11865f);
        return arrayList;
    }

    public final List i() {
        return this.f11864e;
    }

    public final boolean q() {
        return this.f11866g;
    }

    public final boolean r() {
        Stream convert;
        if (this.f11861b != null || this.f11862c != null || this.f11863d.e() != null || this.f11863d.b() != 0) {
            return true;
        }
        convert = Stream.VivifiedWrapper.convert(this.f11864e.stream());
        return convert.anyMatch(new Predicate() { // from class: L3.o0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return false;
            }
        }) || this.f11860a || this.f11866g;
    }
}
