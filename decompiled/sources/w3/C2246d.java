package w3;

import J3.l;
import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import o3.C1839a;
import y3.InterfaceC2355a;

/* renamed from: w3.d, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C2246d {

    /* renamed from: a, reason: collision with root package name */
    public final C1839a f20152a;

    /* renamed from: b, reason: collision with root package name */
    public final C2248f f20153b;

    /* renamed from: c, reason: collision with root package name */
    public final J3.a f20154c;

    /* renamed from: d, reason: collision with root package name */
    public final C2248f f20155d;

    /* renamed from: e, reason: collision with root package name */
    public final List f20156e;

    /* renamed from: w3.d$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a extends ContinuationImpl {

        /* renamed from: j, reason: collision with root package name */
        public Object f20157j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f20158k;

        /* renamed from: m, reason: collision with root package name */
        public int f20160m;

        public a(Continuation continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(Object obj) {
            this.f20158k = obj;
            this.f20160m |= IntCompanionObject.MIN_VALUE;
            return C2246d.this.c(this);
        }
    }

    public C2246d(C1839a amplitude, o3.c configuration) {
        Intrinsics.checkNotNullParameter(amplitude, "amplitude");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f20152a = amplitude;
        ArrayList arrayList = new ArrayList();
        this.f20156e = arrayList;
        this.f20153b = a(configuration, "amplitude-disk-queue", "amplitude-android-" + configuration.l());
        this.f20155d = a(configuration, "amplitude-identify-intercept-disk-queue", "amplitude-identify-intercept-" + configuration.l());
        J3.f b6 = b(amplitude, configuration);
        arrayList.add(b6.g());
        this.f20154c = new J3.a(b6);
    }

    public final C2248f a(o3.c cVar, String str, String str2) {
        File dir = cVar.C().getDir(str, 0);
        List list = this.f20156e;
        Intrinsics.checkNotNull(dir);
        list.add(dir);
        SharedPreferences sharedPreferences = cVar.C().getSharedPreferences(str2, 0);
        String l6 = cVar.l();
        InterfaceC2355a a6 = cVar.m().a(this.f20152a);
        Intrinsics.checkNotNull(sharedPreferences);
        return new C2248f(l6, a6, sharedPreferences, dir, this.f20152a.o());
    }

    public final J3.f b(C1839a c1839a, o3.c cVar) {
        File dir = cVar.C().getDir("amplitude-kotlin-" + cVar.l(), 0);
        String l6 = cVar.l();
        String b6 = cVar.b();
        l j6 = cVar.j();
        InterfaceC2355a a6 = cVar.m().a(c1839a);
        String str = "amplitude-identity-" + cVar.l();
        Intrinsics.checkNotNull(dir);
        return new J3.f(l6, b6, null, j6, dir, str, a6, 4, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0092, code lost:
    
        if (r2.d(r0) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(kotlin.coroutines.Continuation r9) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w3.C2246d.c(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
