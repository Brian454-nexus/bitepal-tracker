package I0;

import ja.K;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final ja.u f2748a;

    public k() {
        z zVar = z.f2790b;
        Intrinsics.checkNotNull(zVar, "null cannot be cast to non-null type androidx.datastore.core.State<T of androidx.datastore.core.DataStoreInMemoryCache>");
        this.f2748a = K.a(zVar);
    }

    public final v a() {
        return (v) this.f2748a.getValue();
    }

    public final ja.e b() {
        return this.f2748a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        if (r6.a() > r2.a()) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final I0.v c(I0.v r6) {
        /*
            r5 = this;
            java.lang.String r0 = "newState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            ja.u r0 = r5.f2748a
        L7:
            java.lang.Object r1 = r0.getValue()
            r2 = r1
            I0.v r2 = (I0.v) r2
            boolean r3 = r2 instanceof I0.q
            if (r3 == 0) goto L14
            r3 = 1
            goto L1a
        L14:
            I0.z r3 = I0.z.f2790b
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
        L1a:
            if (r3 == 0) goto L1d
            goto L2b
        L1d:
            boolean r3 = r2 instanceof I0.e
            if (r3 == 0) goto L2d
            int r3 = r6.a()
            int r4 = r2.a()
            if (r3 <= r4) goto L31
        L2b:
            r2 = r6
            goto L31
        L2d:
            boolean r3 = r2 instanceof I0.l
            if (r3 == 0) goto L38
        L31:
            boolean r1 = r0.d(r1, r2)
            if (r1 == 0) goto L7
            return r2
        L38:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.k.c(I0.v):I0.v");
    }
}
