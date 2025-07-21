package L;

import android.graphics.RectF;
import android.util.Rational;
import android.util.Size;
import java.util.Comparator;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Rational f3013a = new Rational(4, 3);

    /* renamed from: b, reason: collision with root package name */
    public static final Rational f3014b = new Rational(3, 4);

    /* renamed from: c, reason: collision with root package name */
    public static final Rational f3015c = new Rational(16, 9);

    /* renamed from: d, reason: collision with root package name */
    public static final Rational f3016d = new Rational(9, 16);

    /* renamed from: L.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class C0055a implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        public final Rational f3017a;

        /* renamed from: b, reason: collision with root package name */
        public final RectF f3018b;

        /* renamed from: c, reason: collision with root package name */
        public final Rational f3019c;

        public C0055a(Rational rational, Rational rational2) {
            this.f3017a = rational;
            this.f3019c = rational2 == null ? new Rational(4, 3) : rational2;
            this.f3018b = d(rational);
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Rational rational, Rational rational2) {
            if (rational.equals(rational2)) {
                return 0;
            }
            RectF d6 = d(rational);
            RectF d7 = d(rational2);
            boolean e6 = e(d6, this.f3018b);
            boolean e7 = e(d7, this.f3018b);
            if (e6 && e7) {
                return (int) Math.signum(b(d6) - b(d7));
            }
            if (e6) {
                return -1;
            }
            if (e7) {
                return 1;
            }
            return -((int) Math.signum(c(d6, this.f3018b) - c(d7, this.f3018b)));
        }

        public final float b(RectF rectF) {
            return rectF.width() * rectF.height();
        }

        public final float c(RectF rectF, RectF rectF2) {
            return (rectF.width() < rectF2.width() ? rectF.width() : rectF2.width()) * (rectF.height() < rectF2.height() ? rectF.height() : rectF2.height());
        }

        public final RectF d(Rational rational) {
            return rational.floatValue() == this.f3019c.floatValue() ? new RectF(0.0f, 0.0f, this.f3019c.getNumerator(), this.f3019c.getDenominator()) : rational.floatValue() > this.f3019c.floatValue() ? new RectF(0.0f, 0.0f, this.f3019c.getNumerator(), (rational.getDenominator() * this.f3019c.getNumerator()) / rational.getNumerator()) : new RectF(0.0f, 0.0f, (rational.getNumerator() * this.f3019c.getDenominator()) / rational.getDenominator(), this.f3019c.getDenominator());
        }

        public final boolean e(RectF rectF, RectF rectF2) {
            return rectF.width() >= rectF2.width() && rectF.height() >= rectF2.height();
        }
    }

    public static boolean a(Size size, Rational rational) {
        return b(size, rational, S.d.f4639c);
    }

    public static boolean b(Size size, Rational rational, Size size2) {
        if (rational == null) {
            return false;
        }
        if (rational.equals(new Rational(size.getWidth(), size.getHeight()))) {
            return true;
        }
        if (S.d.a(size) >= S.d.a(size2)) {
            return c(size, rational);
        }
        return false;
    }

    public static boolean c(Size size, Rational rational) {
        int width = size.getWidth();
        int height = size.getHeight();
        Rational rational2 = new Rational(rational.getDenominator(), rational.getNumerator());
        int i6 = width % 16;
        if (i6 == 0 && height % 16 == 0) {
            return d(Math.max(0, height + (-16)), width, rational) || d(Math.max(0, width + (-16)), height, rational2);
        }
        if (i6 == 0) {
            return d(height, width, rational);
        }
        if (height % 16 == 0) {
            return d(width, height, rational2);
        }
        return false;
    }

    public static boolean d(int i6, int i7, Rational rational) {
        y0.g.a(i7 % 16 == 0);
        double numerator = (i6 * rational.getNumerator()) / rational.getDenominator();
        return numerator > ((double) Math.max(0, i7 + (-16))) && numerator < ((double) (i7 + 16));
    }
}
