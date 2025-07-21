package i2;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import b1.C1076a;
import b2.C1081e;
import b2.s;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import c1.AbstractC1133o;
import c1.C1144z;
import c1.InterfaceC1125g;
import java.nio.charset.Charset;
import java.util.List;
import y6.e;
import z6.w;

/* renamed from: i2.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1509a implements s {

    /* renamed from: a, reason: collision with root package name */
    public final C1144z f16006a = new C1144z();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f16007b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16008c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16009d;

    /* renamed from: e, reason: collision with root package name */
    public final String f16010e;

    /* renamed from: f, reason: collision with root package name */
    public final float f16011f;

    /* renamed from: g, reason: collision with root package name */
    public final int f16012g;

    public C1509a(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.f16008c = 0;
            this.f16009d = -1;
            this.f16010e = "sans-serif";
            this.f16007b = false;
            this.f16011f = 0.85f;
            this.f16012g = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.f16008c = bArr[24];
        this.f16009d = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f16010e = "Serif".equals(AbstractC1117K.J(bArr, 43, bArr.length - 43)) ? "serif" : "sans-serif";
        int i6 = bArr[25] * 20;
        this.f16012g = i6;
        boolean z6 = (bArr[0] & 32) != 0;
        this.f16007b = z6;
        if (z6) {
            this.f16011f = AbstractC1117K.o(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i6, 0.0f, 0.95f);
        } else {
            this.f16011f = 0.85f;
        }
    }

    public static void f(SpannableStringBuilder spannableStringBuilder, int i6, int i7, int i8, int i9, int i10) {
        if (i6 != i7) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i6 >>> 8) | ((i6 & 255) << 24)), i8, i9, i10 | 33);
        }
    }

    public static void g(SpannableStringBuilder spannableStringBuilder, int i6, int i7, int i8, int i9, int i10) {
        if (i6 != i7) {
            int i11 = i10 | 33;
            boolean z6 = (i6 & 1) != 0;
            boolean z7 = (i6 & 2) != 0;
            if (z6) {
                if (z7) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i8, i9, i11);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i8, i9, i11);
                }
            } else if (z7) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i8, i9, i11);
            }
            boolean z8 = (i6 & 4) != 0;
            if (z8) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i8, i9, i11);
            }
            if (z8 || z6 || z7) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i8, i9, i11);
        }
    }

    public static void h(SpannableStringBuilder spannableStringBuilder, String str, int i6, int i7) {
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i6, i7, 16711713);
        }
    }

    public static String i(C1144z c1144z) {
        AbstractC1119a.a(c1144z.a() >= 2);
        int M5 = c1144z.M();
        if (M5 == 0) {
            return "";
        }
        int f6 = c1144z.f();
        Charset O5 = c1144z.O();
        int f7 = M5 - (c1144z.f() - f6);
        if (O5 == null) {
            O5 = e.c;
        }
        return c1144z.E(f7, O5);
    }

    @Override // b2.s
    public void c(byte[] bArr, int i6, int i7, s.b bVar, InterfaceC1125g interfaceC1125g) {
        this.f16006a.R(bArr, i7 + i6);
        this.f16006a.T(i6);
        String i8 = i(this.f16006a);
        if (i8.isEmpty()) {
            interfaceC1125g.accept(new C1081e(w.w(), -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(i8);
        g(spannableStringBuilder, this.f16008c, 0, 0, spannableStringBuilder.length(), 16711680);
        f(spannableStringBuilder, this.f16009d, -1, 0, spannableStringBuilder.length(), 16711680);
        h(spannableStringBuilder, this.f16010e, 0, spannableStringBuilder.length());
        float f6 = this.f16011f;
        while (this.f16006a.a() >= 8) {
            int f7 = this.f16006a.f();
            int p6 = this.f16006a.p();
            int p7 = this.f16006a.p();
            if (p7 == 1937013100) {
                AbstractC1119a.a(this.f16006a.a() >= 2);
                int M5 = this.f16006a.M();
                for (int i9 = 0; i9 < M5; i9++) {
                    e(this.f16006a, spannableStringBuilder);
                }
            } else if (p7 == 1952608120 && this.f16007b) {
                AbstractC1119a.a(this.f16006a.a() >= 2);
                f6 = AbstractC1117K.o(this.f16006a.M() / this.f16012g, 0.0f, 0.95f);
            }
            this.f16006a.T(f7 + p6);
        }
        interfaceC1125g.accept(new C1081e(w.y(new C1076a.b().o(spannableStringBuilder).h(f6, 0).i(0).a()), -9223372036854775807L, -9223372036854775807L));
    }

    @Override // b2.s
    public int d() {
        return 2;
    }

    public final void e(C1144z c1144z, SpannableStringBuilder spannableStringBuilder) {
        AbstractC1119a.a(c1144z.a() >= 12);
        int M5 = c1144z.M();
        int M6 = c1144z.M();
        c1144z.U(2);
        int G6 = c1144z.G();
        c1144z.U(1);
        int p6 = c1144z.p();
        if (M6 > spannableStringBuilder.length()) {
            AbstractC1133o.h("Tx3gParser", "Truncating styl end (" + M6 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
            M6 = spannableStringBuilder.length();
        }
        int i6 = M6;
        if (M5 < i6) {
            g(spannableStringBuilder, G6, this.f16008c, M5, i6, 0);
            f(spannableStringBuilder, p6, this.f16009d, M5, i6, 0);
            return;
        }
        AbstractC1133o.h("Tx3gParser", "Ignoring styl with start (" + M5 + ") >= end (" + i6 + ").");
    }
}
