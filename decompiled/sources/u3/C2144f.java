package u3;

import android.content.SharedPreferences;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import o3.C1839a;
import w3.EnumC2250h;
import y3.InterfaceC2355a;

/* renamed from: u3.f, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C2144f {

    /* renamed from: a, reason: collision with root package name */
    public final C1839a f19192a;

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f19193b;

    /* renamed from: c, reason: collision with root package name */
    public final o3.c f19194c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC2355a f19195d;

    /* renamed from: e, reason: collision with root package name */
    public final int f19196e;

    /* renamed from: u3.f$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a extends ContinuationImpl {

        /* renamed from: j, reason: collision with root package name */
        public Object f19197j;

        /* renamed from: k, reason: collision with root package name */
        public Object f19198k;

        /* renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f19199l;

        /* renamed from: n, reason: collision with root package name */
        public int f19201n;

        public a(Continuation continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19199l = obj;
            this.f19201n |= IntCompanionObject.MIN_VALUE;
            return C2144f.this.b(this);
        }
    }

    public C2144f(C1839a amplitude) {
        Intrinsics.checkNotNullParameter(amplitude, "amplitude");
        this.f19192a = amplitude;
        B3.b m6 = amplitude.m();
        Intrinsics.checkNotNull(m6, "null cannot be cast to non-null type com.amplitude.android.Configuration");
        o3.c cVar = (o3.c) m6;
        this.f19194c = cVar;
        this.f19195d = amplitude.s();
        SharedPreferences sharedPreferences = cVar.C().getSharedPreferences("amplitude-android-" + cVar.l(), 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        this.f19193b = sharedPreferences;
        this.f19196e = sharedPreferences.getInt("storage_version", 0);
    }

    public final Object a(Continuation continuation) {
        int i6 = this.f19196e;
        EnumC2250h enumC2250h = EnumC2250h.f20176b;
        if (i6 >= enumC2250h.b()) {
            this.f19192a.s().b("Storage already at version " + enumC2250h.b());
            return Unit.INSTANCE;
        }
        this.f19195d.b("Migrating storage to version " + enumC2250h.b());
        Object b6 = b(continuation);
        return b6 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? b6 : Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0087, code lost:
    
        if (r8.a(r0) == r1) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(kotlin.coroutines.Continuation r8) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.C2144f.b(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
