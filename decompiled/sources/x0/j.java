package x0;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class j implements Spannable {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final TextPaint f20392a;

        /* renamed from: b, reason: collision with root package name */
        public final TextDirectionHeuristic f20393b;

        /* renamed from: c, reason: collision with root package name */
        public final int f20394c;

        /* renamed from: d, reason: collision with root package name */
        public final int f20395d;

        /* renamed from: e, reason: collision with root package name */
        public final PrecomputedText.Params f20396e;

        /* renamed from: x0.j$a$a, reason: collision with other inner class name */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static class C0270a {

            /* renamed from: a, reason: collision with root package name */
            public final TextPaint f20397a;

            /* renamed from: c, reason: collision with root package name */
            public int f20399c = 1;

            /* renamed from: d, reason: collision with root package name */
            public int f20400d = 1;

            /* renamed from: b, reason: collision with root package name */
            public TextDirectionHeuristic f20398b = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            public C0270a(TextPaint textPaint) {
                this.f20397a = textPaint;
            }

            public a a() {
                return new a(this.f20397a, this.f20398b, this.f20399c, this.f20400d);
            }

            public C0270a b(int i6) {
                this.f20399c = i6;
                return this;
            }

            public C0270a c(int i6) {
                this.f20400d = i6;
                return this;
            }

            public C0270a d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f20398b = textDirectionHeuristic;
                return this;
            }
        }

        public a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i6, int i7) {
            PrecomputedText.Params.Builder breakStrategy;
            PrecomputedText.Params.Builder hyphenationFrequency;
            PrecomputedText.Params.Builder textDirection;
            PrecomputedText.Params build;
            if (Build.VERSION.SDK_INT >= 29) {
                breakStrategy = i.a(textPaint).setBreakStrategy(i6);
                hyphenationFrequency = breakStrategy.setHyphenationFrequency(i7);
                textDirection = hyphenationFrequency.setTextDirection(textDirectionHeuristic);
                build = textDirection.build();
                this.f20396e = build;
            } else {
                this.f20396e = null;
            }
            this.f20392a = textPaint;
            this.f20393b = textDirectionHeuristic;
            this.f20394c = i6;
            this.f20395d = i7;
        }

        public boolean a(a aVar) {
            if (this.f20394c == aVar.b() && this.f20395d == aVar.c() && this.f20392a.getTextSize() == aVar.e().getTextSize() && this.f20392a.getTextScaleX() == aVar.e().getTextScaleX() && this.f20392a.getTextSkewX() == aVar.e().getTextSkewX() && this.f20392a.getLetterSpacing() == aVar.e().getLetterSpacing() && TextUtils.equals(this.f20392a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()) && this.f20392a.getFlags() == aVar.e().getFlags() && this.f20392a.getTextLocales().equals(aVar.e().getTextLocales())) {
                return this.f20392a.getTypeface() == null ? aVar.e().getTypeface() == null : this.f20392a.getTypeface().equals(aVar.e().getTypeface());
            }
            return false;
        }

        public int b() {
            return this.f20394c;
        }

        public int c() {
            return this.f20395d;
        }

        public TextDirectionHeuristic d() {
            return this.f20393b;
        }

        public TextPaint e() {
            return this.f20392a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return a(aVar) && this.f20393b == aVar.d();
        }

        public int hashCode() {
            return y0.b.b(Float.valueOf(this.f20392a.getTextSize()), Float.valueOf(this.f20392a.getTextScaleX()), Float.valueOf(this.f20392a.getTextSkewX()), Float.valueOf(this.f20392a.getLetterSpacing()), Integer.valueOf(this.f20392a.getFlags()), this.f20392a.getTextLocales(), this.f20392a.getTypeface(), Boolean.valueOf(this.f20392a.isElegantTextHeight()), this.f20393b, Integer.valueOf(this.f20394c), Integer.valueOf(this.f20395d));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.f20392a.getTextSize());
            sb.append(", textScaleX=" + this.f20392a.getTextScaleX());
            sb.append(", textSkewX=" + this.f20392a.getTextSkewX());
            sb.append(", letterSpacing=" + this.f20392a.getLetterSpacing());
            sb.append(", elegantTextHeight=" + this.f20392a.isElegantTextHeight());
            sb.append(", textLocale=" + this.f20392a.getTextLocales());
            sb.append(", typeface=" + this.f20392a.getTypeface());
            sb.append(", variationSettings=" + this.f20392a.getFontVariationSettings());
            sb.append(", textDir=" + this.f20393b);
            sb.append(", breakStrategy=" + this.f20394c);
            sb.append(", hyphenationFrequency=" + this.f20395d);
            sb.append("}");
            return sb.toString();
        }

        public a(PrecomputedText.Params params) {
            TextPaint textPaint;
            TextDirectionHeuristic textDirection;
            int breakStrategy;
            int hyphenationFrequency;
            textPaint = params.getTextPaint();
            this.f20392a = textPaint;
            textDirection = params.getTextDirection();
            this.f20393b = textDirection;
            breakStrategy = params.getBreakStrategy();
            this.f20394c = breakStrategy;
            hyphenationFrequency = params.getHyphenationFrequency();
            this.f20395d = hyphenationFrequency;
            this.f20396e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}
