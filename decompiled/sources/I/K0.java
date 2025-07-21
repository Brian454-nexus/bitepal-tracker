package I;

import android.util.Range;
import android.util.Rational;
import androidx.lifecycle.AbstractC1065q;
import androidx.lifecycle.C1067t;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class K0 extends AbstractC0431h0 {

    /* renamed from: b, reason: collision with root package name */
    public final D f2269b;

    /* renamed from: c, reason: collision with root package name */
    public final J0 f2270c;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements F.D {
        public a() {
        }

        @Override // F.D
        public Range a() {
            return new Range(0, 0);
        }

        @Override // F.D
        public Rational b() {
            return Rational.ZERO;
        }
    }

    public K0(D d6, J0 j02) {
        super(d6);
        this.f2269b = d6;
        this.f2270c = j02;
    }

    @Override // I.D
    public D b() {
        return this.f2269b;
    }

    @Override // F.r
    public F.D e() {
        return !this.f2270c.p(7) ? new a() : this.f2269b.e();
    }

    @Override // F.r
    public AbstractC1065q n() {
        return !this.f2270c.p(0) ? new C1067t(O.f.e(1.0f, 1.0f, 1.0f, 0.0f)) : this.f2269b.n();
    }
}
