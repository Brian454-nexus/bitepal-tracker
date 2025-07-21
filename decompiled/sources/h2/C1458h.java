package h2;

import b2.k;
import c1.AbstractC1117K;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: h2.h, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1458h implements k {

    /* renamed from: a, reason: collision with root package name */
    public final C1453c f15286a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f15287b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f15288c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f15289d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f15290e;

    public C1458h(C1453c c1453c, Map map, Map map2, Map map3) {
        this.f15286a = c1453c;
        this.f15289d = map2;
        this.f15290e = map3;
        this.f15288c = map != null ? Collections.unmodifiableMap(map) : Collections.EMPTY_MAP;
        this.f15287b = c1453c.j();
    }

    @Override // b2.k
    public int a(long j6) {
        int d6 = AbstractC1117K.d(this.f15287b, j6, false, false);
        if (d6 < this.f15287b.length) {
            return d6;
        }
        return -1;
    }

    @Override // b2.k
    public long b(int i6) {
        return this.f15287b[i6];
    }

    @Override // b2.k
    public List c(long j6) {
        return this.f15286a.h(j6, this.f15288c, this.f15289d, this.f15290e);
    }

    @Override // b2.k
    public int d() {
        return this.f15287b.length;
    }
}
