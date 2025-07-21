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

/* renamed from: w3.c, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C2245c {

    /* renamed from: a, reason: collision with root package name */
    public final C1839a f20143a;

    /* renamed from: b, reason: collision with root package name */
    public final C2248f f20144b;

    /* renamed from: c, reason: collision with root package name */
    public final J3.a f20145c;

    /* renamed from: d, reason: collision with root package name */
    public final C2248f f20146d;

    /* renamed from: e, reason: collision with root package name */
    public final List f20147e;

    /* renamed from: w3.c$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a extends ContinuationImpl {

        /* renamed from: j, reason: collision with root package name */
        public Object f20148j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f20149k;

        /* renamed from: m, reason: collision with root package name */
        public int f20151m;

        public a(Continuation continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(Object obj) {
            this.f20149k = obj;
            this.f20151m |= IntCompanionObject.MIN_VALUE;
            return C2245c.this.c(this);
        }
    }

    public C2245c(C1839a amplitude, o3.c configuration) {
        Intrinsics.checkNotNullParameter(amplitude, "amplitude");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f20143a = amplitude;
        ArrayList arrayList = new ArrayList();
        this.f20147e = arrayList;
        this.f20144b = a(configuration, "amplitude-disk-queue", "amplitude-android-" + configuration.b());
        this.f20146d = a(configuration, "amplitude-identify-intercept-disk-queue", "amplitude-identify-intercept-" + configuration.b());
        J3.f b6 = b(amplitude, configuration);
        arrayList.add(b6.g());
        this.f20145c = new J3.a(b6);
    }

    public final C2248f a(o3.c cVar, String str, String str2) {
        File dir = cVar.C().getDir(str, 0);
        List list = this.f20147e;
        Intrinsics.checkNotNull(dir);
        list.add(dir);
        SharedPreferences sharedPreferences = cVar.C().getSharedPreferences(str2, 0);
        String b6 = cVar.b();
        InterfaceC2355a a6 = cVar.m().a(this.f20143a);
        Intrinsics.checkNotNull(sharedPreferences);
        return new C2248f(b6, a6, sharedPreferences, dir, this.f20143a.o());
    }

    public final J3.f b(C1839a c1839a, o3.c cVar) {
        File dir = cVar.C().getDir("amplitude-kotlin-" + cVar.l(), 0);
        String l6 = cVar.l();
        String b6 = cVar.b();
        l j6 = cVar.j();
        InterfaceC2355a a6 = c1839a != null ? cVar.m().a(c1839a) : null;
        String str = "amplitude-identity-" + cVar.l();
        Intrinsics.checkNotNull(dir);
        return new J3.f(l6, b6, null, j6, dir, str, a6, 4, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0080, code lost:
    
        if (r2.d(r0) == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(kotlin.coroutines.Continuation r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof w3.C2245c.a
            if (r0 == 0) goto L13
            r0 = r9
            w3.c$a r0 = (w3.C2245c.a) r0
            int r1 = r0.f20151m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20151m = r1
            goto L18
        L13:
            w3.c$a r0 = new w3.c$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f20149k
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f20151m
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L42
            if (r2 == r5) goto L3a
            if (r2 != r4) goto L32
            java.lang.Object r0 = r0.f20148j
            w3.c r0 = (w3.C2245c) r0
            kotlin.ResultKt.throwOnFailure(r9)
            goto Lac
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3a:
            java.lang.Object r2 = r0.f20148j
            w3.c r2 = (w3.C2245c) r2
            kotlin.ResultKt.throwOnFailure(r9)
            goto L84
        L42:
            kotlin.ResultKt.throwOnFailure(r9)
            u3.e r9 = new u3.e
            J3.a r2 = r8.f20145c
            o3.a r6 = r8.f20143a
            J3.k r6 = r6.r()
            o3.a r7 = r8.f20143a
            y3.a r7 = r7.s()
            r9.<init>(r2, r6, r7)
            r9.a()
            o3.a r9 = r8.f20143a
            B3.f r9 = r9.u()
            boolean r2 = r9 instanceof w3.C2248f
            if (r2 == 0) goto L68
            w3.f r9 = (w3.C2248f) r9
            goto L69
        L68:
            r9 = r3
        L69:
            if (r9 == 0) goto L83
            u3.a r2 = new u3.a
            w3.f r6 = r8.f20144b
            o3.a r7 = r8.f20143a
            y3.a r7 = r7.s()
            r2.<init>(r6, r9, r7)
            r0.f20148j = r8
            r0.f20151m = r5
            java.lang.Object r9 = r2.d(r0)
            if (r9 != r1) goto L83
            goto Laa
        L83:
            r2 = r8
        L84:
            o3.a r9 = r2.f20143a
            B3.f r9 = r9.q()
            boolean r5 = r9 instanceof w3.C2248f
            if (r5 == 0) goto L91
            r3 = r9
            w3.f r3 = (w3.C2248f) r3
        L91:
            if (r3 == 0) goto Lad
            u3.a r9 = new u3.a
            w3.f r5 = r2.f20146d
            o3.a r6 = r2.f20143a
            y3.a r6 = r6.s()
            r9.<init>(r5, r3, r6)
            r0.f20148j = r2
            r0.f20151m = r4
            java.lang.Object r9 = r9.d(r0)
            if (r9 != r1) goto Lab
        Laa:
            return r1
        Lab:
            r0 = r2
        Lac:
            r2 = r0
        Lad:
            java.util.List r9 = r2.f20147e
            java.util.Iterator r9 = r9.iterator()
        Lb3:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto Lcc
            java.lang.Object r0 = r9.next()
            java.io.File r0 = (java.io.File) r0
            java.lang.String[] r1 = r0.list()
            if (r1 == 0) goto Lb3
            int r1 = r1.length
            if (r1 != 0) goto Lb3
            r0.delete()
            goto Lb3
        Lcc:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: w3.C2245c.c(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
