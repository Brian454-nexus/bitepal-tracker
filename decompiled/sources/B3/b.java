package B3;

import G3.m;
import J3.l;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class b {

    /* renamed from: x, reason: collision with root package name */
    public static final a f341x = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f342a;

    /* renamed from: b, reason: collision with root package name */
    public int f343b;

    /* renamed from: c, reason: collision with root package name */
    public int f344c;

    /* renamed from: d, reason: collision with root package name */
    public String f345d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f346e;

    /* renamed from: f, reason: collision with root package name */
    public final g f347f;

    /* renamed from: g, reason: collision with root package name */
    public final c f348g;

    /* renamed from: h, reason: collision with root package name */
    public Integer f349h;

    /* renamed from: i, reason: collision with root package name */
    public String f350i;

    /* renamed from: j, reason: collision with root package name */
    public Function3 f351j;

    /* renamed from: k, reason: collision with root package name */
    public int f352k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f353l;

    /* renamed from: m, reason: collision with root package name */
    public d f354m;

    /* renamed from: n, reason: collision with root package name */
    public String f355n;

    /* renamed from: o, reason: collision with root package name */
    public C3.e f356o;

    /* renamed from: p, reason: collision with root package name */
    public C3.d f357p;

    /* renamed from: q, reason: collision with root package name */
    public long f358q;

    /* renamed from: r, reason: collision with root package name */
    public g f359r;

    /* renamed from: s, reason: collision with root package name */
    public l f360s;

    /* renamed from: t, reason: collision with root package name */
    public Boolean f361t;

    /* renamed from: u, reason: collision with root package name */
    public String f362u;

    /* renamed from: v, reason: collision with root package name */
    public Long f363v;

    /* renamed from: w, reason: collision with root package name */
    public H3.f f364w;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public b(String apiKey, int i6, int i7, String instanceName, boolean z6, g storageProvider, c loggerProvider, Integer num, String str, Function3 function3, int i8, boolean z7, d serverZone, String str2, C3.e eVar, C3.d dVar, long j6, g identifyInterceptStorageProvider, l identityStorageProvider, Boolean bool, String str3, Long l6, H3.f fVar) {
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(instanceName, "instanceName");
        Intrinsics.checkNotNullParameter(storageProvider, "storageProvider");
        Intrinsics.checkNotNullParameter(loggerProvider, "loggerProvider");
        Intrinsics.checkNotNullParameter(serverZone, "serverZone");
        Intrinsics.checkNotNullParameter(identifyInterceptStorageProvider, "identifyInterceptStorageProvider");
        Intrinsics.checkNotNullParameter(identityStorageProvider, "identityStorageProvider");
        this.f342a = apiKey;
        this.f343b = i6;
        this.f344c = i7;
        this.f345d = instanceName;
        this.f346e = z6;
        this.f347f = storageProvider;
        this.f348g = loggerProvider;
        this.f349h = num;
        this.f350i = str;
        this.f351j = function3;
        this.f352k = i8;
        this.f353l = z7;
        this.f354m = serverZone;
        this.f355n = str2;
        this.f356o = eVar;
        this.f357p = dVar;
        this.f358q = j6;
        this.f359r = identifyInterceptStorageProvider;
        this.f360s = identityStorageProvider;
        this.f361t = bool;
        this.f362u = str3;
        this.f363v = l6;
        this.f364w = fVar;
    }

    public final String a() {
        String s6 = s();
        if (s6 != null) {
            return s6;
        }
        d t6 = t();
        d dVar = d.f366b;
        return (t6 == dVar && w()) ? "https://api.eu.amplitude.com/batch" : t() == dVar ? "https://api.eu.amplitude.com/2/httpapi" : w() ? "https://api2.amplitude.com/batch" : "https://api2.amplitude.com/2/httpapi";
    }

    public final String b() {
        return this.f342a;
    }

    public abstract Function3 c();

    public abstract int d();

    public abstract int e();

    public abstract int f();

    public abstract H3.f g();

    public abstract long h();

    public abstract g i();

    public abstract l j();

    public abstract C3.d k();

    public abstract String l();

    public abstract c m();

    public abstract Integer n();

    public abstract Boolean o();

    public abstract boolean p();

    public abstract String q();

    public abstract C3.e r();

    public abstract String s();

    public abstract d t();

    public abstract Long u();

    public abstract g v();

    public abstract boolean w();

    public final boolean x() {
        Integer n6 = n();
        return n6 == null || n6.intValue() > 0;
    }

    public final boolean y() {
        return !StringsKt.isBlank(this.f342a) && f() > 0 && d() > 0 && x();
    }

    public abstract void z(Boolean bool);

    public /* synthetic */ b(String str, int i6, int i7, String str2, boolean z6, g gVar, c cVar, Integer num, String str3, Function3 function3, int i8, boolean z7, d dVar, String str4, C3.e eVar, C3.d dVar2, long j6, g gVar2, l lVar, Boolean bool, String str5, Long l6, H3.f fVar, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i9 & 2) != 0 ? 30 : i6, (i9 & 4) != 0 ? 30000 : i7, (i9 & 8) != 0 ? "$default_instance" : str2, (i9 & 16) != 0 ? false : z6, (i9 & 32) != 0 ? new m() : gVar, (i9 & 64) != 0 ? new G3.b() : cVar, (i9 & 128) != 0 ? null : num, (i9 & 256) != 0 ? null : str3, (i9 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? null : function3, (i9 & 1024) != 0 ? 5 : i8, (i9 & 2048) == 0 ? z7 : false, (i9 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? d.f365a : dVar, (i9 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? null : str4, (i9 & 16384) != 0 ? null : eVar, (i9 & 32768) != 0 ? null : dVar2, (i9 & 65536) != 0 ? 30000L : j6, (i9 & 131072) != 0 ? new m() : gVar2, (i9 & 262144) != 0 ? new J3.d() : lVar, (i9 & 524288) != 0 ? Boolean.FALSE : bool, (i9 & 1048576) != 0 ? null : str5, (i9 & 2097152) != 0 ? null : l6, (i9 & 4194304) != 0 ? null : fVar);
    }
}
