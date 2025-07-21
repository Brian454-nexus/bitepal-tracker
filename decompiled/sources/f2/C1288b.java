package f2;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import b1.C1076a;
import b2.C1081e;
import b2.s;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import c1.AbstractC1133o;
import c1.C1144z;
import c1.InterfaceC1125g;
import com.amazon.a.a.o.b.f;
import com.android.installreferrer.api.InstallReferrerClient;
import f2.c;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.IntCompanionObject;
import y6.e;

/* renamed from: f2.b, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1288b implements s {

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f14036g = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: a, reason: collision with root package name */
    public final boolean f14037a;

    /* renamed from: b, reason: collision with root package name */
    public final C1287a f14038b;

    /* renamed from: d, reason: collision with root package name */
    public Map f14040d;

    /* renamed from: e, reason: collision with root package name */
    public float f14041e = -3.4028235E38f;

    /* renamed from: f, reason: collision with root package name */
    public float f14042f = -3.4028235E38f;

    /* renamed from: c, reason: collision with root package name */
    public final C1144z f14039c = new C1144z();

    public C1288b(List list) {
        if (list == null || list.isEmpty()) {
            this.f14037a = false;
            this.f14038b = null;
            return;
        }
        this.f14037a = true;
        String I6 = AbstractC1117K.I((byte[]) list.get(0));
        AbstractC1119a.a(I6.startsWith("Format:"));
        this.f14038b = (C1287a) AbstractC1119a.e(C1287a.a(I6));
        k(new C1144z((byte[]) list.get(1)), e.c);
    }

    public static int e(long j6, List list, List list2) {
        int i6;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                i6 = 0;
                break;
            }
            if (((Long) list.get(size)).longValue() == j6) {
                return size;
            }
            if (((Long) list.get(size)).longValue() < j6) {
                i6 = size + 1;
                break;
            }
            size--;
        }
        list.add(i6, Long.valueOf(j6));
        list2.add(i6, i6 == 0 ? new ArrayList() : new ArrayList((Collection) list2.get(i6 - 1)));
        return i6;
    }

    public static float f(int i6) {
        if (i6 == 0) {
            return 0.05f;
        }
        if (i6 != 1) {
            return i6 != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    public static C1076a g(String str, c cVar, c.b bVar, float f6, float f7) {
        SpannableString spannableString = new SpannableString(str);
        C1076a.b o6 = new C1076a.b().o(spannableString);
        if (cVar != null) {
            if (cVar.f14045c != null) {
                spannableString.setSpan(new ForegroundColorSpan(cVar.f14045c.intValue()), 0, spannableString.length(), 33);
            }
            if (cVar.f14052j == 3 && cVar.f14046d != null) {
                spannableString.setSpan(new BackgroundColorSpan(cVar.f14046d.intValue()), 0, spannableString.length(), 33);
            }
            float f8 = cVar.f14047e;
            if (f8 != -3.4028235E38f && f7 != -3.4028235E38f) {
                o6.q(f8 / f7, 1);
            }
            boolean z6 = cVar.f14048f;
            if (z6 && cVar.f14049g) {
                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
            } else if (z6) {
                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
            } else if (cVar.f14049g) {
                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
            }
            if (cVar.f14050h) {
                spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 33);
            }
            if (cVar.f14051i) {
                spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
            }
        }
        int i6 = bVar.f14068a;
        if (i6 == -1) {
            i6 = cVar != null ? cVar.f14044b : -1;
        }
        o6.p(q(i6)).l(p(i6)).i(o(i6));
        PointF pointF = bVar.f14069b;
        if (pointF == null || f7 == -3.4028235E38f || f6 == -3.4028235E38f) {
            o6.k(f(o6.d()));
            o6.h(f(o6.c()), 0);
        } else {
            o6.k(pointF.x / f6);
            o6.h(bVar.f14069b.y / f7, 0);
        }
        return o6.a();
    }

    public static Map m(C1144z c1144z, Charset charset) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c.a aVar = null;
        while (true) {
            String s6 = c1144z.s(charset);
            if (s6 == null || (c1144z.a() != 0 && c1144z.h(charset) == '[')) {
                break;
            }
            if (s6.startsWith("Format:")) {
                aVar = c.a.a(s6);
            } else if (s6.startsWith("Style:")) {
                if (aVar == null) {
                    AbstractC1133o.h("SsaParser", "Skipping 'Style:' line before 'Format:' line: " + s6);
                } else {
                    c b6 = c.b(s6, aVar);
                    if (b6 != null) {
                        linkedHashMap.put(b6.f14043a, b6);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    public static long n(String str) {
        Matcher matcher = f14036g.matcher(str.trim());
        if (matcher.matches()) {
            return (Long.parseLong((String) AbstractC1117K.i(matcher.group(1))) * 3600000000L) + (Long.parseLong((String) AbstractC1117K.i(matcher.group(2))) * 60000000) + (Long.parseLong((String) AbstractC1117K.i(matcher.group(3))) * 1000000) + (Long.parseLong((String) AbstractC1117K.i(matcher.group(4))) * 10000);
        }
        return -9223372036854775807L;
    }

    public static int o(int i6) {
        switch (i6) {
            case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                return IntCompanionObject.MIN_VALUE;
            case 0:
            default:
                AbstractC1133o.h("SsaParser", "Unknown alignment: " + i6);
                return IntCompanionObject.MIN_VALUE;
            case 1:
            case 2:
            case 3:
                return 2;
            case 4:
            case 5:
            case 6:
                return 1;
            case 7:
            case 8:
            case 9:
                return 0;
        }
    }

    public static int p(int i6) {
        switch (i6) {
            case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                return IntCompanionObject.MIN_VALUE;
            case 0:
            default:
                AbstractC1133o.h("SsaParser", "Unknown alignment: " + i6);
                return IntCompanionObject.MIN_VALUE;
            case 1:
            case 4:
            case 7:
                return 0;
            case 2:
            case 5:
            case 8:
                return 1;
            case 3:
            case 6:
            case 9:
                return 2;
        }
    }

    public static Layout.Alignment q(int i6) {
        switch (i6) {
            case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                return null;
            case 0:
            default:
                AbstractC1133o.h("SsaParser", "Unknown alignment: " + i6);
                return null;
            case 1:
            case 4:
            case 7:
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 5:
            case 8:
                return Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 6:
            case 9:
                return Layout.Alignment.ALIGN_OPPOSITE;
        }
    }

    @Override // b2.s
    public void c(byte[] bArr, int i6, int i7, s.b bVar, InterfaceC1125g interfaceC1125g) {
        long j6;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.f14039c.R(bArr, i6 + i7);
        this.f14039c.T(i6);
        Charset h6 = h(this.f14039c);
        if (!this.f14037a) {
            k(this.f14039c, h6);
        }
        j(this.f14039c, arrayList, arrayList2, h6);
        long j7 = -9223372036854775807L;
        ArrayList arrayList3 = (bVar.f10493a == -9223372036854775807L || !bVar.f10494b) ? null : new ArrayList();
        int i8 = 0;
        while (i8 < arrayList.size()) {
            List list = (List) arrayList.get(i8);
            if (list.isEmpty() && i8 != 0) {
                j6 = j7;
            } else {
                if (i8 == arrayList.size() - 1) {
                    throw new IllegalStateException();
                }
                long longValue = ((Long) arrayList2.get(i8)).longValue();
                long longValue2 = ((Long) arrayList2.get(i8 + 1)).longValue() - ((Long) arrayList2.get(i8)).longValue();
                j6 = j7;
                long j8 = bVar.f10493a;
                if (j8 == j6 || longValue >= j8) {
                    interfaceC1125g.accept(new C1081e(list, longValue, longValue2));
                } else if (arrayList3 != null) {
                    arrayList3.add(new C1081e(list, longValue, longValue2));
                }
            }
            i8++;
            j7 = j6;
        }
        if (arrayList3 != null) {
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                interfaceC1125g.accept((C1081e) it.next());
            }
        }
    }

    @Override // b2.s
    public int d() {
        return 1;
    }

    public final Charset h(C1144z c1144z) {
        Charset O5 = c1144z.O();
        return O5 != null ? O5 : e.c;
    }

    public final void i(String str, C1287a c1287a, List list, List list2) {
        int i6;
        AbstractC1119a.a(str.startsWith("Dialogue:"));
        String[] split = str.substring(9).split(f.f11248a, c1287a.f14035e);
        if (split.length != c1287a.f14035e) {
            AbstractC1133o.h("SsaParser", "Skipping dialogue line with fewer columns than format: " + str);
            return;
        }
        long n6 = n(split[c1287a.f14031a]);
        if (n6 == -9223372036854775807L) {
            AbstractC1133o.h("SsaParser", "Skipping invalid timing: " + str);
            return;
        }
        long n7 = n(split[c1287a.f14032b]);
        if (n7 == -9223372036854775807L) {
            AbstractC1133o.h("SsaParser", "Skipping invalid timing: " + str);
            return;
        }
        Map map = this.f14040d;
        c cVar = (map == null || (i6 = c1287a.f14033c) == -1) ? null : (c) map.get(split[i6].trim());
        String str2 = split[c1287a.f14034d];
        C1076a g6 = g(c.b.d(str2).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " "), cVar, c.b.b(str2), this.f14041e, this.f14042f);
        int e6 = e(n7, list2, list);
        for (int e7 = e(n6, list2, list); e7 < e6; e7++) {
            ((List) list.get(e7)).add(g6);
        }
    }

    public final void j(C1144z c1144z, List list, List list2, Charset charset) {
        C1287a c1287a = this.f14037a ? this.f14038b : null;
        while (true) {
            String s6 = c1144z.s(charset);
            if (s6 == null) {
                return;
            }
            if (s6.startsWith("Format:")) {
                c1287a = C1287a.a(s6);
            } else if (s6.startsWith("Dialogue:")) {
                if (c1287a == null) {
                    AbstractC1133o.h("SsaParser", "Skipping dialogue line before complete format: " + s6);
                } else {
                    i(s6, c1287a, list, list2);
                }
            }
        }
    }

    public final void k(C1144z c1144z, Charset charset) {
        while (true) {
            String s6 = c1144z.s(charset);
            if (s6 == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(s6)) {
                l(c1144z, charset);
            } else if ("[V4+ Styles]".equalsIgnoreCase(s6)) {
                this.f14040d = m(c1144z, charset);
            } else if ("[V4 Styles]".equalsIgnoreCase(s6)) {
                AbstractC1133o.f("SsaParser", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(s6)) {
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:3:0x0006  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(c1.C1144z r5, java.nio.charset.Charset r6) {
        /*
            r4 = this;
        L0:
            java.lang.String r0 = r5.s(r6)
            if (r0 == 0) goto L59
            int r1 = r5.a()
            if (r1 == 0) goto L14
            char r1 = r5.h(r6)
            r2 = 91
            if (r1 == r2) goto L59
        L14:
            java.lang.String r1 = ":"
            java.lang.String[] r0 = r0.split(r1)
            int r1 = r0.length
            r2 = 2
            if (r1 == r2) goto L1f
            goto L0
        L1f:
            r1 = 0
            r1 = r0[r1]
            java.lang.String r1 = r1.trim()
            java.lang.String r1 = y6.c.e(r1)
            r1.getClass()
            r2 = 1
            java.lang.String r3 = "playresx"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L4c
            java.lang.String r3 = "playresy"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L3f
            goto L0
        L3f:
            r0 = r0[r2]     // Catch: java.lang.NumberFormatException -> L0
            java.lang.String r0 = r0.trim()     // Catch: java.lang.NumberFormatException -> L0
            float r0 = java.lang.Float.parseFloat(r0)     // Catch: java.lang.NumberFormatException -> L0
            r4.f14042f = r0     // Catch: java.lang.NumberFormatException -> L0
            goto L0
        L4c:
            r0 = r0[r2]     // Catch: java.lang.NumberFormatException -> L0
            java.lang.String r0 = r0.trim()     // Catch: java.lang.NumberFormatException -> L0
            float r0 = java.lang.Float.parseFloat(r0)     // Catch: java.lang.NumberFormatException -> L0
            r4.f14041e = r0     // Catch: java.lang.NumberFormatException -> L0
            goto L0
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.C1288b.l(c1.z, java.nio.charset.Charset):void");
    }
}
