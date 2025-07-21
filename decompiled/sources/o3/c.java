package o3;

import J3.l;
import android.content.Context;
import java.io.File;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import w3.C2247e;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class c extends B3.b {

    /* renamed from: h0, reason: collision with root package name */
    public static final a f17897h0 = new a(null);

    /* renamed from: A, reason: collision with root package name */
    public int f17898A;

    /* renamed from: B, reason: collision with root package name */
    public String f17899B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f17900C;

    /* renamed from: D, reason: collision with root package name */
    public B3.g f17901D;

    /* renamed from: E, reason: collision with root package name */
    public B3.c f17902E;

    /* renamed from: F, reason: collision with root package name */
    public Integer f17903F;

    /* renamed from: G, reason: collision with root package name */
    public String f17904G;

    /* renamed from: H, reason: collision with root package name */
    public Function3 f17905H;

    /* renamed from: I, reason: collision with root package name */
    public int f17906I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f17907J;

    /* renamed from: K, reason: collision with root package name */
    public B3.d f17908K;

    /* renamed from: L, reason: collision with root package name */
    public String f17909L;

    /* renamed from: M, reason: collision with root package name */
    public C3.e f17910M;

    /* renamed from: N, reason: collision with root package name */
    public C3.d f17911N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f17912O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f17913P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f17914Q;

    /* renamed from: R, reason: collision with root package name */
    public g f17915R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f17916S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f17917T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f17918U;

    /* renamed from: V, reason: collision with root package name */
    public long f17919V;

    /* renamed from: W, reason: collision with root package name */
    public long f17920W;

    /* renamed from: X, reason: collision with root package name */
    public B3.g f17921X;

    /* renamed from: Y, reason: collision with root package name */
    public l f17922Y;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f17923Z;

    /* renamed from: a0, reason: collision with root package name */
    public Boolean f17924a0;

    /* renamed from: b0, reason: collision with root package name */
    public String f17925b0;

    /* renamed from: c0, reason: collision with root package name */
    public Long f17926c0;

    /* renamed from: d0, reason: collision with root package name */
    public H3.f f17927d0;

    /* renamed from: e0, reason: collision with root package name */
    public File f17928e0;

    /* renamed from: f0, reason: collision with root package name */
    public Set f17929f0;

    /* renamed from: g0, reason: collision with root package name */
    public d f17930g0;

    /* renamed from: y, reason: collision with root package name */
    public final Context f17931y;

    /* renamed from: z, reason: collision with root package name */
    public int f17932z;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends Lambda implements Function1 {
        public b() {
            super(1);
        }

        public final void a(d $receiver) {
            Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
            c.this.j0($receiver);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((d) obj);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: o3.c$c, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class C0229c extends Lambda implements Function1 {
        public C0229c() {
            super(1);
        }

        public final void a(d addPropertyChangeListener) {
            Intrinsics.checkNotNullParameter(addPropertyChangeListener, "$this$addPropertyChangeListener");
            c.this.j0(addPropertyChangeListener);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((d) obj);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ c(String str, Context context, int i6, int i7, String str2, boolean z6, B3.g gVar, B3.c cVar, Integer num, String str3, Function3 function3, int i8, boolean z7, B3.d dVar, String str4, C3.e eVar, C3.d dVar2, boolean z8, boolean z9, boolean z10, g gVar2, boolean z11, boolean z12, boolean z13, long j6, Set set, long j7, B3.g gVar3, l lVar, boolean z14, Boolean bool, String str5, Long l6, H3.f fVar, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, context, (i9 & 4) != 0 ? 30 : i6, (i9 & 8) != 0 ? 30000 : i7, (i9 & 16) != 0 ? "$default_instance" : str2, (i9 & 32) != 0 ? false : z6, (i9 & 64) != 0 ? C2247e.f20161a.b() : gVar, (i9 & 128) != 0 ? new x3.e() : cVar, (i9 & 256) != 0 ? null : num, (i9 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? null : str3, (i9 & 1024) != 0 ? null : function3, (i9 & 2048) != 0 ? 5 : i8, (i9 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? false : z7, (i9 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? B3.d.f365a : dVar, (i9 & 16384) != 0 ? null : str4, (i9 & 32768) != 0 ? null : eVar, (i9 & 65536) != 0 ? null : dVar2, (i9 & 131072) != 0 ? false : z8, (i9 & 262144) != 0 ? false : z9, (i9 & 524288) != 0 ? false : z10, (i9 & 1048576) != 0 ? new g() : gVar2, (i9 & 2097152) != 0 ? false : z11, (i9 & 4194304) == 0 ? z12 : false, (i9 & 8388608) != 0 ? true : z13, (i9 & 16777216) != 0 ? 300000L : j6, (i9 & 33554432) != 0 ? SetsKt.setOf(EnumC1840b.f17890a) : set, (i9 & 67108864) != 0 ? 30000L : j7, (i9 & 134217728) != 0 ? C2247e.f20161a.d() : gVar3, (i9 & 268435456) != 0 ? C2247e.f20161a.g() : lVar, (i9 & 536870912) == 0 ? z14 : true, (i9 & 1073741824) != 0 ? Boolean.FALSE : bool, (i9 & IntCompanionObject.MIN_VALUE) != 0 ? null : str5, (i10 & 1) != 0 ? null : l6, (i10 & 2) != 0 ? null : fVar);
    }

    public final Set B() {
        return this.f17929f0;
    }

    public final Context C() {
        return this.f17931y;
    }

    public final d D() {
        return this.f17930g0;
    }

    public String E() {
        return this.f17925b0;
    }

    public final boolean F() {
        return this.f17916S;
    }

    public final boolean G() {
        return this.f17918U;
    }

    public final boolean H() {
        return this.f17917T;
    }

    public final boolean I() {
        return this.f17923Z;
    }

    public final long J() {
        return this.f17919V;
    }

    public final boolean K() {
        return this.f17914Q;
    }

    public final File L() {
        if (this.f17928e0 == null) {
            File file = new File(this.f17931y.getDir("amplitude", 0), this.f17931y.getPackageName() + '/' + l() + "/analytics/");
            this.f17928e0 = file;
            file.mkdirs();
        }
        File file2 = this.f17928e0;
        Intrinsics.checkNotNull(file2);
        return file2;
    }

    public final g M() {
        return this.f17915R;
    }

    public final boolean N() {
        return this.f17912O;
    }

    public final boolean O() {
        return this.f17913P;
    }

    public final void P(d value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f17930g0 = value;
        this.f17929f0 = value.c();
        value.a(new C0229c());
    }

    public final void Q(boolean z6) {
        this.f17916S = z6;
    }

    public final void R(boolean z6) {
        this.f17918U = z6;
    }

    public void S(int i6) {
        this.f17898A = i6;
    }

    public void T(int i6) {
        this.f17906I = i6;
    }

    public void U(int i6) {
        this.f17932z = i6;
    }

    public void V(long j6) {
        this.f17920W = j6;
    }

    public void W(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f17899B = str;
    }

    public final void X(boolean z6) {
        this.f17917T = z6;
    }

    public final void Y(boolean z6) {
        this.f17923Z = z6;
    }

    public void Z(Integer num) {
        this.f17903F = num;
    }

    public final void a0(long j6) {
        this.f17919V = j6;
    }

    public void b0(boolean z6) {
        this.f17900C = z6;
    }

    @Override // B3.b
    public Function3 c() {
        return this.f17905H;
    }

    public void c0(String str) {
        this.f17904G = str;
    }

    @Override // B3.b
    public int d() {
        return this.f17898A;
    }

    public void d0(String str) {
        this.f17909L = str;
    }

    @Override // B3.b
    public int e() {
        return this.f17906I;
    }

    public void e0(B3.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<set-?>");
        this.f17908K = dVar;
    }

    @Override // B3.b
    public int f() {
        return this.f17932z;
    }

    public final void f0(g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<set-?>");
        this.f17915R = gVar;
    }

    @Override // B3.b
    public H3.f g() {
        return this.f17927d0;
    }

    public final void g0(boolean z6) {
        this.f17912O = z6;
    }

    @Override // B3.b
    public long h() {
        return this.f17920W;
    }

    public final void h0(boolean z6) {
        this.f17913P = z6;
    }

    @Override // B3.b
    public B3.g i() {
        return this.f17921X;
    }

    public void i0(boolean z6) {
        this.f17907J = z6;
    }

    @Override // B3.b
    public l j() {
        return this.f17922Y;
    }

    public final void j0(d dVar) {
        this.f17929f0 = dVar.c();
    }

    @Override // B3.b
    public C3.d k() {
        return this.f17911N;
    }

    @Override // B3.b
    public String l() {
        return this.f17899B;
    }

    @Override // B3.b
    public B3.c m() {
        return this.f17902E;
    }

    @Override // B3.b
    public Integer n() {
        return this.f17903F;
    }

    @Override // B3.b
    public Boolean o() {
        return this.f17924a0;
    }

    @Override // B3.b
    public boolean p() {
        return this.f17900C;
    }

    @Override // B3.b
    public String q() {
        return this.f17904G;
    }

    @Override // B3.b
    public C3.e r() {
        return this.f17910M;
    }

    @Override // B3.b
    public String s() {
        return this.f17909L;
    }

    @Override // B3.b
    public B3.d t() {
        return this.f17908K;
    }

    @Override // B3.b
    public Long u() {
        return this.f17926c0;
    }

    @Override // B3.b
    public B3.g v() {
        return this.f17901D;
    }

    @Override // B3.b
    public boolean w() {
        return this.f17907J;
    }

    @Override // B3.b
    public void z(Boolean bool) {
        this.f17924a0 = bool;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String apiKey, Context context, int i6, int i7, String instanceName, boolean z6, B3.g storageProvider, B3.c loggerProvider, Integer num, String str, Function3 function3, int i8, boolean z7, B3.d serverZone, String str2, C3.e eVar, C3.d dVar, boolean z8, boolean z9, boolean z10, g trackingOptions, boolean z11, boolean z12, boolean z13, long j6, Set autocapture, long j7, B3.g identifyInterceptStorageProvider, l identityStorageProvider, boolean z14, Boolean bool, String str3, Long l6, H3.f fVar) {
        super(apiKey, i6, i7, instanceName, z6, storageProvider, loggerProvider, num, str, function3, i8, z7, serverZone, str2, eVar, dVar, j7, identifyInterceptStorageProvider, identityStorageProvider, bool, str3, l6, null, 4194304, null);
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(instanceName, "instanceName");
        Intrinsics.checkNotNullParameter(storageProvider, "storageProvider");
        Intrinsics.checkNotNullParameter(loggerProvider, "loggerProvider");
        Intrinsics.checkNotNullParameter(serverZone, "serverZone");
        Intrinsics.checkNotNullParameter(trackingOptions, "trackingOptions");
        Intrinsics.checkNotNullParameter(autocapture, "autocapture");
        Intrinsics.checkNotNullParameter(identifyInterceptStorageProvider, "identifyInterceptStorageProvider");
        Intrinsics.checkNotNullParameter(identityStorageProvider, "identityStorageProvider");
        this.f17931y = context;
        this.f17932z = i6;
        this.f17898A = i7;
        this.f17899B = instanceName;
        this.f17900C = z6;
        this.f17901D = storageProvider;
        this.f17902E = loggerProvider;
        this.f17903F = num;
        this.f17904G = str;
        this.f17905H = function3;
        this.f17906I = i8;
        this.f17907J = z7;
        this.f17908K = serverZone;
        this.f17909L = str2;
        this.f17910M = eVar;
        this.f17911N = dVar;
        this.f17912O = z8;
        this.f17913P = z9;
        this.f17914Q = z10;
        this.f17915R = trackingOptions;
        this.f17916S = z11;
        this.f17917T = z12;
        this.f17918U = z13;
        this.f17919V = j6;
        this.f17920W = j7;
        this.f17921X = identifyInterceptStorageProvider;
        this.f17922Y = identityStorageProvider;
        this.f17923Z = z14;
        this.f17924a0 = bool;
        this.f17925b0 = str3;
        this.f17926c0 = l6;
        this.f17927d0 = fVar;
        this.f17929f0 = CollectionsKt.toMutableSet(autocapture);
        this.f17930g0 = new d(new b());
    }
}
