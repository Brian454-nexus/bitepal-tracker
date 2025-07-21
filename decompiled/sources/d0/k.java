package d0;

import F.AbstractC0335i0;
import F.C;
import I.InterfaceC0423d0;
import I.T0;
import X.AbstractC0808q;
import X.y0;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import d0.n;
import e0.m0;
import e0.n0;
import f0.AbstractC1283a;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.io.ConstantsKt;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final Map f13354a;

    static {
        HashMap hashMap = new HashMap();
        f13354a = hashMap;
        HashMap hashMap2 = new HashMap();
        n0 n0Var = n0.f13771a;
        hashMap2.put(1, n0Var);
        n0 n0Var2 = n0.f13773c;
        hashMap2.put(2, n0Var2);
        Integer valueOf = Integer.valueOf(ConstantsKt.DEFAULT_BLOCK_SIZE);
        n0 n0Var3 = n0.f13774d;
        hashMap2.put(valueOf, n0Var3);
        Integer valueOf2 = Integer.valueOf(ConstantsKt.DEFAULT_BUFFER_SIZE);
        hashMap2.put(valueOf2, n0Var3);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(1, n0Var);
        hashMap3.put(2, n0Var2);
        hashMap3.put(valueOf, n0Var3);
        hashMap3.put(valueOf2, n0Var3);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(1, n0Var);
        hashMap4.put(4, n0Var2);
        hashMap4.put(valueOf, n0Var3);
        hashMap4.put(16384, n0Var3);
        hashMap4.put(2, n0Var);
        hashMap4.put(8, n0Var2);
        hashMap4.put(valueOf2, n0Var3);
        hashMap4.put(32768, n0Var3);
        HashMap hashMap5 = new HashMap();
        hashMap5.put(256, n0Var2);
        hashMap5.put(Integer.valueOf(ConstantsKt.MINIMUM_BLOCK_SIZE), n0.f13772b);
        hashMap.put("video/hevc", hashMap2);
        hashMap.put("video/av01", hashMap3);
        hashMap.put("video/x-vnd.on2.vp9", hashMap4);
        hashMap.put("video/dolby-vision", hashMap5);
    }

    public static String a(C c6) {
        int b6 = c6.b();
        if (b6 == 1) {
            return "video/avc";
        }
        if (b6 == 3 || b6 == 4 || b6 == 5) {
            return "video/hevc";
        }
        if (b6 == 6) {
            return "video/dolby-vision";
        }
        throw new UnsupportedOperationException("Unsupported dynamic range: " + c6 + "\nNo supported default mime type available.");
    }

    public static n0 b(String str, int i6) {
        n0 n0Var;
        Map map = (Map) f13354a.get(str);
        if (map != null && (n0Var = (n0) map.get(Integer.valueOf(i6))) != null) {
            return n0Var;
        }
        AbstractC0335i0.l("VideoConfigUtil", String.format("Unsupported mime type %s or profile level %d. Data space is unspecified.", str, Integer.valueOf(i6)));
        return n0.f13771a;
    }

    public static m0 c(n nVar, T0 t02, y0 y0Var, Size size, C c6, Range range) {
        InterfaceC0423d0.c d6 = nVar.d();
        return (m0) (d6 != null ? new m(nVar.a(), t02, y0Var, size, d6, c6, range) : new l(nVar.a(), t02, y0Var, size, c6, range)).get();
    }

    public static n d(AbstractC0808q abstractC0808q, C c6, Z.g gVar) {
        y0.g.i(c6.e(), "Dynamic range must be a fully specified dynamic range [provided dynamic range: " + c6 + "]");
        String h6 = AbstractC0808q.h(abstractC0808q.c());
        if (gVar != null) {
            Set c7 = AbstractC1283a.c(c6);
            Set b6 = AbstractC1283a.b(c6);
            for (InterfaceC0423d0.c cVar : gVar.d()) {
                if (c7.contains(Integer.valueOf(cVar.g())) && b6.contains(Integer.valueOf(cVar.b()))) {
                    String i6 = cVar.i();
                    if (Objects.equals(h6, i6)) {
                        AbstractC0335i0.a("VideoConfigUtil", "MediaSpec video mime matches EncoderProfiles. Using EncoderProfiles to derive VIDEO settings [mime type: " + h6 + "]");
                    } else if (abstractC0808q.c() == -1) {
                        AbstractC0335i0.a("VideoConfigUtil", "MediaSpec contains OUTPUT_FORMAT_AUTO. Using CamcorderProfile to derive VIDEO settings [mime type: " + h6 + ", dynamic range: " + c6 + "]");
                    }
                    h6 = i6;
                    break;
                }
            }
        }
        cVar = null;
        if (cVar == null) {
            if (abstractC0808q.c() == -1) {
                h6 = a(c6);
            }
            if (gVar == null) {
                AbstractC0335i0.a("VideoConfigUtil", "No EncoderProfiles present. May rely on fallback defaults to derive VIDEO settings [chosen mime type: " + h6 + ", dynamic range: " + c6 + "]");
            } else {
                AbstractC0335i0.a("VideoConfigUtil", "No video EncoderProfile is compatible with requested output format and dynamic range. May rely on fallback defaults to derive VIDEO settings [chosen mime type: " + h6 + ", dynamic range: " + c6 + "]");
            }
        }
        n.a c8 = n.c(h6);
        if (cVar != null) {
            c8.c(cVar);
        }
        return c8.b();
    }

    public static int e(int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, Range range) {
        int doubleValue = (int) (i6 * new Rational(i7, i8).doubleValue() * new Rational(i9, i10).doubleValue() * new Rational(i11, i12).doubleValue() * new Rational(i13, i14).doubleValue());
        String format = AbstractC0335i0.f("VideoConfigUtil") ? String.format("Base Bitrate(%dbps) * Bit Depth Ratio (%d / %d) * Frame Rate Ratio(%d / %d) * Width Ratio(%d / %d) * Height Ratio(%d / %d) = %d", Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(doubleValue)) : "";
        if (!y0.f6024b.equals(range)) {
            Integer num = (Integer) range.clamp(Integer.valueOf(doubleValue));
            int intValue = num.intValue();
            if (AbstractC0335i0.f("VideoConfigUtil")) {
                format = format + String.format("\nClamped to range %s -> %dbps", range, num);
            }
            doubleValue = intValue;
        }
        AbstractC0335i0.a("VideoConfigUtil", format);
        return doubleValue;
    }
}
