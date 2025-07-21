package y0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class e implements d {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f21174a;

    /* renamed from: b, reason: collision with root package name */
    public int f21175b;

    public e(int i6) {
        if (i6 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f21174a = new Object[i6];
    }

    @Override // y0.d
    public boolean a(Object instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        if (c(instance)) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i6 = this.f21175b;
        Object[] objArr = this.f21174a;
        if (i6 >= objArr.length) {
            return false;
        }
        objArr[i6] = instance;
        this.f21175b = i6 + 1;
        return true;
    }

    @Override // y0.d
    public Object b() {
        int i6 = this.f21175b;
        if (i6 <= 0) {
            return null;
        }
        int i7 = i6 - 1;
        Object obj = this.f21174a[i7];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        this.f21174a[i7] = null;
        this.f21175b--;
        return obj;
    }

    public final boolean c(Object obj) {
        int i6 = this.f21175b;
        for (int i7 = 0; i7 < i6; i7++) {
            if (this.f21174a[i7] == obj) {
                return true;
            }
        }
        return false;
    }
}
