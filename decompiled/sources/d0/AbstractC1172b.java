package d0;

import F.AbstractC0335i0;
import I.InterfaceC0423d0;
import I.T0;
import X.AbstractC0792a;
import a0.AbstractC0976a;
import a0.C0989n;
import android.util.Range;
import android.util.Rational;
import e0.AbstractC1218a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: d0.b, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC1172b {
    public static /* synthetic */ int a(int i6, Integer num, Integer num2) {
        int abs = Math.abs(num.intValue() - i6) - Math.abs(num2.intValue() - i6);
        return (int) (abs == 0 ? Math.signum(num.intValue() - num2.intValue()) : Math.signum(abs));
    }

    public static AbstractC1218a b(AbstractC1175e abstractC1175e, T0 t02, AbstractC0976a abstractC0976a, AbstractC0792a abstractC0792a) {
        InterfaceC0423d0.a d6 = abstractC1175e.d();
        return (AbstractC1218a) (d6 != null ? new C1173c(abstractC1175e.a(), abstractC1175e.b(), t02, abstractC0792a, abstractC0976a, d6) : new C1174d(abstractC1175e.a(), abstractC1175e.b(), t02, abstractC0792a, abstractC0976a)).get();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static d0.AbstractC1175e c(X.AbstractC0808q r8, Z.g r9) {
        /*
            int r0 = r8.c()
            java.lang.String r0 = X.AbstractC0808q.e(r0)
            int r1 = r8.c()
            int r1 = X.AbstractC0808q.f(r1)
            if (r9 == 0) goto Lca
            I.d0$a r2 = r9.j()
            if (r2 == 0) goto Lca
            I.d0$a r9 = r9.j()
            java.lang.String r2 = r9.e()
            int r3 = r9.f()
            java.lang.String r4 = "audio/none"
            boolean r4 = java.util.Objects.equals(r2, r4)
            java.lang.String r5 = ")]"
            java.lang.String r6 = "AudioConfigUtil"
            java.lang.String r7 = "(profile: "
            if (r4 == 0) goto L51
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "EncoderProfiles contains undefined AUDIO mime type so cannot be used. May rely on fallback defaults to derive settings [chosen mime type: "
            r8.append(r9)
            r8.append(r0)
            r8.append(r7)
            r8.append(r1)
            r8.append(r5)
            java.lang.String r8 = r8.toString()
            F.AbstractC0335i0.a(r6, r8)
            goto Lca
        L51:
            int r8 = r8.c()
            r4 = -1
            if (r8 != r4) goto L78
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "MediaSpec contains OUTPUT_FORMAT_AUTO. Using EncoderProfiles to derive AUDIO settings [mime type: "
            r8.append(r0)
            r8.append(r2)
            r8.append(r7)
            r8.append(r3)
            r8.append(r5)
            java.lang.String r8 = r8.toString()
            F.AbstractC0335i0.a(r6, r8)
            r0 = r2
            r1 = r3
            goto Lcb
        L78:
            boolean r8 = java.util.Objects.equals(r0, r2)
            if (r8 == 0) goto L9f
            if (r1 != r3) goto L9f
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "MediaSpec audio mime/profile matches EncoderProfiles. Using EncoderProfiles to derive AUDIO settings [mime type: "
            r8.append(r0)
            r8.append(r2)
            r8.append(r7)
            r8.append(r1)
            r8.append(r5)
            java.lang.String r8 = r8.toString()
            F.AbstractC0335i0.a(r6, r8)
            r0 = r2
            goto Lcb
        L9f:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "MediaSpec audio mime or profile does not match EncoderProfiles, so EncoderProfiles settings cannot be used. May rely on fallback defaults to derive AUDIO settings [EncoderProfiles mime type: "
            r8.append(r9)
            r8.append(r2)
            r8.append(r7)
            r8.append(r3)
            java.lang.String r9 = "), chosen mime type: "
            r8.append(r9)
            r8.append(r0)
            r8.append(r7)
            r8.append(r1)
            r8.append(r5)
            java.lang.String r8 = r8.toString()
            F.AbstractC0335i0.a(r6, r8)
        Lca:
            r9 = 0
        Lcb:
            d0.e$a r8 = d0.AbstractC1175e.c(r0)
            java.lang.Object r8 = r8.a(r1)
            d0.e$a r8 = (d0.AbstractC1175e.a) r8
            if (r9 == 0) goto Lda
            r8.c(r9)
        Lda:
            d0.e r8 = r8.b()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.AbstractC1172b.c(X.q, Z.g):d0.e");
    }

    public static AbstractC0976a d(AbstractC1175e abstractC1175e, AbstractC0792a abstractC0792a) {
        InterfaceC0423d0.a d6 = abstractC1175e.d();
        return (AbstractC0976a) (d6 != null ? new C1176f(abstractC0792a, d6) : new C1177g(abstractC0792a)).get();
    }

    public static int e(AbstractC0792a abstractC0792a) {
        int e6 = abstractC0792a.e();
        if (e6 == -1) {
            AbstractC0335i0.a("AudioConfigUtil", "Using default AUDIO source: 5");
            return 5;
        }
        AbstractC0335i0.a("AudioConfigUtil", "Using provided AUDIO source: " + e6);
        return e6;
    }

    public static int f(AbstractC0792a abstractC0792a) {
        int f6 = abstractC0792a.f();
        if (f6 == -1) {
            AbstractC0335i0.a("AudioConfigUtil", "Using default AUDIO source format: 2");
            return 2;
        }
        AbstractC0335i0.a("AudioConfigUtil", "Using provided AUDIO source format: " + f6);
        return f6;
    }

    public static int g(int i6, int i7, int i8, int i9, int i10, Range range) {
        int doubleValue = (int) (i6 * new Rational(i7, i8).doubleValue() * new Rational(i9, i10).doubleValue());
        String format = AbstractC0335i0.f("AudioConfigUtil") ? String.format("Base Bitrate(%dbps) * Channel Count Ratio(%d / %d) * Sample Rate Ratio(%d / %d) = %d", Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(doubleValue)) : "";
        if (!AbstractC0792a.f5835a.equals(range)) {
            Integer num = (Integer) range.clamp(Integer.valueOf(doubleValue));
            doubleValue = num.intValue();
            if (AbstractC0335i0.f("AudioConfigUtil")) {
                format = format + String.format("\nClamped to range %s -> %dbps", range, num);
            }
        }
        AbstractC0335i0.a("AudioConfigUtil", format);
        return doubleValue;
    }

    public static int h(Range range, int i6, int i7, final int i8) {
        ArrayList arrayList = null;
        int i9 = 0;
        int i10 = i8;
        while (true) {
            if (!range.contains((Range) Integer.valueOf(i10))) {
                AbstractC0335i0.a("AudioConfigUtil", "Sample rate " + i10 + "Hz is not in target range " + range);
            } else {
                if (C0989n.o(i10, i6, i7)) {
                    return i10;
                }
                AbstractC0335i0.a("AudioConfigUtil", "Sample rate " + i10 + "Hz is not supported by audio source with channel count " + i6 + " and source format " + i7);
            }
            if (arrayList == null) {
                AbstractC0335i0.a("AudioConfigUtil", "Trying common sample rates in proximity order to target " + i8 + "Hz");
                arrayList = new ArrayList(AbstractC0976a.f7551a);
                Collections.sort(arrayList, new Comparator() { // from class: d0.a
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return AbstractC1172b.a(i8, (Integer) obj, (Integer) obj2);
                    }
                });
            }
            if (i9 >= arrayList.size()) {
                AbstractC0335i0.a("AudioConfigUtil", "No sample rate found in target range or supported by audio source. Falling back to default sample rate of 44100Hz");
                return 44100;
            }
            i10 = ((Integer) arrayList.get(i9)).intValue();
            i9++;
        }
    }
}
