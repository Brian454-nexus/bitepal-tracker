package c2;

import b2.k;
import c1.AbstractC1119a;
import java.util.Collections;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class f implements k {

    /* renamed from: a, reason: collision with root package name */
    public final List f10747a;

    public f(List list) {
        this.f10747a = list;
    }

    @Override // b2.k
    public int a(long j6) {
        return j6 < 0 ? 0 : -1;
    }

    @Override // b2.k
    public long b(int i6) {
        AbstractC1119a.a(i6 == 0);
        return 0L;
    }

    @Override // b2.k
    public List c(long j6) {
        return j6 >= 0 ? this.f10747a : Collections.EMPTY_LIST;
    }

    @Override // b2.k
    public int d() {
        return 1;
    }
}
