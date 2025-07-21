package o3;

import com.appsflyer.AdRevenueScheme;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static final a f17976b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final String f17977c = g.class.getName();

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f17978d = {"city", AdRevenueScheme.COUNTRY, "dma", "ip_address", "lat_lng", "region"};

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f17979e = {"adid", "city", "ip_address", "lat_lng"};

    /* renamed from: a, reason: collision with root package name */
    public Set f17980a = new HashSet();

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g a() {
            g gVar = new g();
            for (String str : g.f17979e) {
                gVar.t(str);
            }
            return gVar;
        }

        public a() {
        }
    }

    public final boolean A() {
        return D("device_brand");
    }

    public final boolean B() {
        return D("device_manufacturer");
    }

    public final boolean C() {
        return D("device_model");
    }

    public final boolean D(String str) {
        return !this.f17980a.contains(str);
    }

    public final boolean E() {
        return D("ip_address");
    }

    public final boolean F() {
        return D("language");
    }

    public final boolean G() {
        return D("lat_lng");
    }

    public final boolean H() {
        return D("os_name");
    }

    public final boolean I() {
        return D("os_version");
    }

    public final boolean J() {
        return D("platform");
    }

    public final boolean K() {
        return D("version_name");
    }

    public final g c() {
        t("adid");
        return this;
    }

    public final g d() {
        t("api_level");
        return this;
    }

    public final g e() {
        t("app_set_id");
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Intrinsics.areEqual(g.class, obj.getClass())) {
            return Intrinsics.areEqual(((g) obj).f17980a, this.f17980a);
        }
        return false;
    }

    public final g f() {
        t("carrier");
        return this;
    }

    public final g g() {
        t("city");
        return this;
    }

    public final g h() {
        t(AdRevenueScheme.COUNTRY);
        return this;
    }

    public final g i() {
        t("device_brand");
        return this;
    }

    public final g j() {
        t("device_manufacturer");
        return this;
    }

    public final g k() {
        t("device_model");
        return this;
    }

    public final g l() {
        t("dma");
        return this;
    }

    public final g m() {
        t("ip_address");
        return this;
    }

    public final g n() {
        t("language");
        return this;
    }

    public final g o() {
        t("lat_lng");
        return this;
    }

    public final g p() {
        t("os_name");
        return this;
    }

    public final g q() {
        t("os_version");
        return this;
    }

    public final g r() {
        t("platform");
        return this;
    }

    public final g s() {
        t("region");
        return this;
    }

    public final void t(String str) {
        this.f17980a.add(str);
    }

    public final g u() {
        t("version_name");
        return this;
    }

    public final g v(g other) {
        Intrinsics.checkNotNullParameter(other, "other");
        Iterator it = other.f17980a.iterator();
        while (it.hasNext()) {
            t((String) it.next());
        }
        return this;
    }

    public final boolean w() {
        return D("adid");
    }

    public final boolean x() {
        return D("app_set_id");
    }

    public final boolean y() {
        return D("carrier");
    }

    public final boolean z() {
        return D(AdRevenueScheme.COUNTRY);
    }
}
