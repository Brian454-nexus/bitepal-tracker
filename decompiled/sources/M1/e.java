package M1;

import E1.A;
import E1.J;
import E1.K;
import E1.O;
import E1.r;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class e implements r {

    /* renamed from: a, reason: collision with root package name */
    public final long f3396a;

    /* renamed from: b, reason: collision with root package name */
    public final r f3397b;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a extends A {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ J f3398b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(J j6, J j7) {
            super(j6);
            this.f3398b = j7;
        }

        @Override // E1.A, E1.J
        public J.a j(long j6) {
            J.a j7 = this.f3398b.j(j6);
            K k6 = j7.f911a;
            K k7 = new K(k6.f916a, k6.f917b + e.this.f3396a);
            K k8 = j7.f912b;
            return new J.a(k7, new K(k8.f916a, k8.f917b + e.this.f3396a));
        }
    }

    public e(long j6, r rVar) {
        this.f3396a = j6;
        this.f3397b = rVar;
    }

    @Override // E1.r
    public O a(int i6, int i7) {
        return this.f3397b.a(i6, i7);
    }

    @Override // E1.r
    public void k() {
        this.f3397b.k();
    }

    @Override // E1.r
    public void n(J j6) {
        this.f3397b.n(new a(j6, j6));
    }
}
