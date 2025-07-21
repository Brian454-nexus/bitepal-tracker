package b2;

import c1.AbstractC1119a;
import java.util.List;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class q extends f1.g implements k {

    /* renamed from: e, reason: collision with root package name */
    public k f10488e;

    /* renamed from: f, reason: collision with root package name */
    public long f10489f;

    @Override // b2.k
    public int a(long j6) {
        return ((k) AbstractC1119a.e(this.f10488e)).a(j6 - this.f10489f);
    }

    @Override // b2.k
    public long b(int i6) {
        return ((k) AbstractC1119a.e(this.f10488e)).b(i6) + this.f10489f;
    }

    @Override // b2.k
    public List c(long j6) {
        return ((k) AbstractC1119a.e(this.f10488e)).c(j6 - this.f10489f);
    }

    @Override // b2.k
    public int d() {
        return ((k) AbstractC1119a.e(this.f10488e)).d();
    }

    @Override // f1.g, f1.AbstractC1285a
    public void f() {
        super.f();
        this.f10488e = null;
    }

    public void o(long j6, k kVar, long j7) {
        this.f14013b = j6;
        this.f10488e = kVar;
        if (j7 != LongCompanionObject.MAX_VALUE) {
            j6 = j7;
        }
        this.f10489f = j6;
    }
}
