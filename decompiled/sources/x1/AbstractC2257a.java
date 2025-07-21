package x1;

import Z0.q;
import c1.AbstractC1119a;
import e1.C1252j;
import e1.InterfaceC1248f;

/* renamed from: x1.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC2257a extends m {

    /* renamed from: k, reason: collision with root package name */
    public final long f20401k;

    /* renamed from: l, reason: collision with root package name */
    public final long f20402l;

    /* renamed from: m, reason: collision with root package name */
    public C2259c f20403m;

    /* renamed from: n, reason: collision with root package name */
    public int[] f20404n;

    public AbstractC2257a(InterfaceC1248f interfaceC1248f, C1252j c1252j, q qVar, int i6, Object obj, long j6, long j7, long j8, long j9, long j10) {
        super(interfaceC1248f, c1252j, qVar, i6, obj, j6, j7, j10);
        this.f20401k = j8;
        this.f20402l = j9;
    }

    public final int i(int i6) {
        return ((int[]) AbstractC1119a.i(this.f20404n))[i6];
    }

    public final C2259c j() {
        return (C2259c) AbstractC1119a.i(this.f20403m);
    }

    public void k(C2259c c2259c) {
        this.f20403m = c2259c;
        this.f20404n = c2259c.b();
    }
}
