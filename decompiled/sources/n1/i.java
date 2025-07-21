package n1;

import A1.n;
import Y1.o;
import Z0.AbstractC0835g;
import Z0.C0841m;
import Z0.z;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.io.ConstantsKt;
import n1.f;
import n1.g;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class i implements n.a {

    /* renamed from: a, reason: collision with root package name */
    public final g f17613a;

    /* renamed from: b, reason: collision with root package name */
    public final f f17614b;

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f17589c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f17590d = Pattern.compile("VIDEO=\"(.+?)\"");

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f17591e = Pattern.compile("AUDIO=\"(.+?)\"");

    /* renamed from: f, reason: collision with root package name */
    public static final Pattern f17592f = Pattern.compile("SUBTITLES=\"(.+?)\"");

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f17593g = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f17594h = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* renamed from: i, reason: collision with root package name */
    public static final Pattern f17595i = Pattern.compile("CHANNELS=\"(.+?)\"");

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f17596j = Pattern.compile("CODECS=\"(.+?)\"");

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f17597k = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f17598l = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f17599m = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* renamed from: n, reason: collision with root package name */
    public static final Pattern f17600n = Pattern.compile("DURATION=([\\d\\.]+)\\b");

    /* renamed from: o, reason: collision with root package name */
    public static final Pattern f17601o = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");

    /* renamed from: p, reason: collision with root package name */
    public static final Pattern f17602p = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* renamed from: q, reason: collision with root package name */
    public static final Pattern f17603q = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* renamed from: r, reason: collision with root package name */
    public static final Pattern f17604r = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");

    /* renamed from: s, reason: collision with root package name */
    public static final Pattern f17605s = c("CAN-SKIP-DATERANGES");

    /* renamed from: t, reason: collision with root package name */
    public static final Pattern f17606t = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");

    /* renamed from: u, reason: collision with root package name */
    public static final Pattern f17607u = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: v, reason: collision with root package name */
    public static final Pattern f17608v = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: w, reason: collision with root package name */
    public static final Pattern f17609w = c("CAN-BLOCK-RELOAD");

    /* renamed from: x, reason: collision with root package name */
    public static final Pattern f17610x = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* renamed from: y, reason: collision with root package name */
    public static final Pattern f17611y = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* renamed from: z, reason: collision with root package name */
    public static final Pattern f17612z = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");

    /* renamed from: A, reason: collision with root package name */
    public static final Pattern f17561A = Pattern.compile("LAST-MSN=(\\d+)\\b");

    /* renamed from: B, reason: collision with root package name */
    public static final Pattern f17562B = Pattern.compile("LAST-PART=(\\d+)\\b");

    /* renamed from: C, reason: collision with root package name */
    public static final Pattern f17563C = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");

    /* renamed from: D, reason: collision with root package name */
    public static final Pattern f17564D = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");

    /* renamed from: E, reason: collision with root package name */
    public static final Pattern f17565E = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");

    /* renamed from: F, reason: collision with root package name */
    public static final Pattern f17566F = Pattern.compile("BYTERANGE-START=(\\d+)\\b");

    /* renamed from: G, reason: collision with root package name */
    public static final Pattern f17567G = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");

    /* renamed from: H, reason: collision with root package name */
    public static final Pattern f17568H = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");

    /* renamed from: I, reason: collision with root package name */
    public static final Pattern f17569I = Pattern.compile("KEYFORMAT=\"(.+?)\"");

    /* renamed from: J, reason: collision with root package name */
    public static final Pattern f17570J = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");

    /* renamed from: K, reason: collision with root package name */
    public static final Pattern f17571K = Pattern.compile("URI=\"(.+?)\"");

    /* renamed from: L, reason: collision with root package name */
    public static final Pattern f17572L = Pattern.compile("IV=([^,.*]+)");

    /* renamed from: M, reason: collision with root package name */
    public static final Pattern f17573M = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* renamed from: N, reason: collision with root package name */
    public static final Pattern f17574N = Pattern.compile("TYPE=(PART|MAP)");

    /* renamed from: O, reason: collision with root package name */
    public static final Pattern f17575O = Pattern.compile("LANGUAGE=\"(.+?)\"");

    /* renamed from: P, reason: collision with root package name */
    public static final Pattern f17576P = Pattern.compile("NAME=\"(.+?)\"");

    /* renamed from: Q, reason: collision with root package name */
    public static final Pattern f17577Q = Pattern.compile("GROUP-ID=\"(.+?)\"");

    /* renamed from: R, reason: collision with root package name */
    public static final Pattern f17578R = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");

    /* renamed from: S, reason: collision with root package name */
    public static final Pattern f17579S = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* renamed from: T, reason: collision with root package name */
    public static final Pattern f17580T = c("AUTOSELECT");

    /* renamed from: U, reason: collision with root package name */
    public static final Pattern f17581U = c("DEFAULT");

    /* renamed from: V, reason: collision with root package name */
    public static final Pattern f17582V = c("FORCED");

    /* renamed from: W, reason: collision with root package name */
    public static final Pattern f17583W = c("INDEPENDENT");

    /* renamed from: X, reason: collision with root package name */
    public static final Pattern f17584X = c("GAP");

    /* renamed from: Y, reason: collision with root package name */
    public static final Pattern f17585Y = c("PRECISE");

    /* renamed from: Z, reason: collision with root package name */
    public static final Pattern f17586Z = Pattern.compile("VALUE=\"(.+?)\"");

    /* renamed from: a0, reason: collision with root package name */
    public static final Pattern f17587a0 = Pattern.compile("IMPORT=\"(.+?)\"");

    /* renamed from: b0, reason: collision with root package name */
    public static final Pattern f17588b0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a extends IOException {
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final BufferedReader f17615a;

        /* renamed from: b, reason: collision with root package name */
        public final Queue f17616b;

        /* renamed from: c, reason: collision with root package name */
        public String f17617c;

        public b(Queue queue, BufferedReader bufferedReader) {
            this.f17616b = queue;
            this.f17615a = bufferedReader;
        }

        public boolean a() {
            String trim;
            if (this.f17617c != null) {
                return true;
            }
            if (!this.f17616b.isEmpty()) {
                this.f17617c = (String) AbstractC1119a.e((String) this.f17616b.poll());
                return true;
            }
            do {
                String readLine = this.f17615a.readLine();
                this.f17617c = readLine;
                if (readLine == null) {
                    return false;
                }
                trim = readLine.trim();
                this.f17617c = trim;
            } while (trim.isEmpty());
            return true;
        }

        public String b() {
            if (!a()) {
                throw new NoSuchElementException();
            }
            String str = this.f17617c;
            this.f17617c = null;
            return str;
        }
    }

    public i() {
        this(g.f17537n, null);
    }

    public static long A(String str, Pattern pattern) {
        return new BigDecimal(z(str, pattern, Collections.EMPTY_MAP)).multiply(new BigDecimal(1000000L)).longValue();
    }

    public static String B(String str, Map map) {
        Matcher matcher = f17588b0.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (map.containsKey(group)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement((String) map.get(group)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public static int C(BufferedReader bufferedReader, boolean z6, int i6) {
        while (i6 != -1 && Character.isWhitespace(i6) && (z6 || !AbstractC1117K.D0(i6))) {
            i6 = bufferedReader.read();
        }
        return i6;
    }

    public static boolean b(BufferedReader bufferedReader) {
        int read = bufferedReader.read();
        if (read == 239) {
            if (bufferedReader.read() != 187 || bufferedReader.read() != 191) {
                return false;
            }
            read = bufferedReader.read();
        }
        int C6 = C(bufferedReader, true, read);
        for (int i6 = 0; i6 < 7; i6++) {
            if (C6 != "#EXTM3U".charAt(i6)) {
                return false;
            }
            C6 = bufferedReader.read();
        }
        return AbstractC1117K.D0(C(bufferedReader, false, C6));
    }

    public static Pattern c(String str) {
        return Pattern.compile(str + "=(NO" + com.amazon.a.a.o.b.f.f11250c + "YES)");
    }

    public static C0841m d(String str, C0841m.b[] bVarArr) {
        C0841m.b[] bVarArr2 = new C0841m.b[bVarArr.length];
        for (int i6 = 0; i6 < bVarArr.length; i6++) {
            bVarArr2[i6] = bVarArr[i6].c(null);
        }
        return new C0841m(str, bVarArr2);
    }

    public static String e(long j6, String str, String str2) {
        if (str == null) {
            return null;
        }
        return str2 != null ? str2 : Long.toHexString(j6);
    }

    public static g.b f(ArrayList arrayList, String str) {
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            g.b bVar = (g.b) arrayList.get(i6);
            if (str.equals(bVar.f17555d)) {
                return bVar;
            }
        }
        return null;
    }

    public static g.b g(ArrayList arrayList, String str) {
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            g.b bVar = (g.b) arrayList.get(i6);
            if (str.equals(bVar.f17556e)) {
                return bVar;
            }
        }
        return null;
    }

    public static g.b h(ArrayList arrayList, String str) {
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            g.b bVar = (g.b) arrayList.get(i6);
            if (str.equals(bVar.f17554c)) {
                return bVar;
            }
        }
        return null;
    }

    public static double j(String str, Pattern pattern) {
        return Double.parseDouble(z(str, pattern, Collections.EMPTY_MAP));
    }

    public static C0841m.b k(String str, String str2, Map map) {
        String u6 = u(str, f17570J, "1", map);
        if ("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2)) {
            String z6 = z(str, f17571K, map);
            return new C0841m.b(AbstractC0835g.f6882d, "video/mp4", Base64.decode(z6.substring(z6.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            return new C0841m.b(AbstractC0835g.f6882d, "hls", AbstractC1117K.s0(str));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(u6)) {
            return null;
        }
        String z7 = z(str, f17571K, map);
        byte[] decode = Base64.decode(z7.substring(z7.indexOf(44)), 0);
        UUID uuid = AbstractC0835g.f6883e;
        return new C0841m.b(uuid, "video/mp4", o.a(uuid, decode));
    }

    public static String l(String str) {
        return ("SAMPLE-AES-CENC".equals(str) || "SAMPLE-AES-CTR".equals(str)) ? "cenc" : "cbcs";
    }

    public static int m(String str, Pattern pattern) {
        return Integer.parseInt(z(str, pattern, Collections.EMPTY_MAP));
    }

    public static long n(String str, Pattern pattern) {
        return Long.parseLong(z(str, pattern, Collections.EMPTY_MAP));
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0615  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0608  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x062b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static n1.f o(n1.g r89, n1.f r90, n1.i.b r91, java.lang.String r92) {
        /*
            Method dump skipped, instructions count: 1804
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.i.o(n1.g, n1.f, n1.i$b, java.lang.String):n1.f");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x011a, code lost:
    
        if (r13 > 0) goto L37;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:86:0x031b. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static n1.g p(n1.i.b r40, java.lang.String r41) {
        /*
            Method dump skipped, instructions count: 1200
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.i.p(n1.i$b, java.lang.String):n1.g");
    }

    public static boolean q(String str, Pattern pattern, boolean z6) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? "YES".equals(matcher.group(1)) : z6;
    }

    public static double r(String str, Pattern pattern, double d6) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Double.parseDouble((String) AbstractC1119a.e(matcher.group(1))) : d6;
    }

    public static int s(String str, Pattern pattern, int i6) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Integer.parseInt((String) AbstractC1119a.e(matcher.group(1))) : i6;
    }

    public static long t(String str, Pattern pattern, long j6) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Long.parseLong((String) AbstractC1119a.e(matcher.group(1))) : j6;
    }

    public static String u(String str, Pattern pattern, String str2, Map map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = (String) AbstractC1119a.e(matcher.group(1));
        }
        return (map.isEmpty() || str2 == null) ? str2 : B(str2, map);
    }

    public static String v(String str, Pattern pattern, Map map) {
        return u(str, pattern, null, map);
    }

    public static int w(String str, Map map) {
        String v6 = v(str, f17578R, map);
        if (TextUtils.isEmpty(v6)) {
            return 0;
        }
        String[] d12 = AbstractC1117K.d1(v6, com.amazon.a.a.o.b.f.f11248a);
        int i6 = AbstractC1117K.s(d12, "public.accessibility.describes-video") ? ConstantsKt.MINIMUM_BLOCK_SIZE : 0;
        if (AbstractC1117K.s(d12, "public.accessibility.transcribes-spoken-dialog")) {
            i6 |= ConstantsKt.DEFAULT_BLOCK_SIZE;
        }
        if (AbstractC1117K.s(d12, "public.accessibility.describes-music-and-sound")) {
            i6 |= 1024;
        }
        return AbstractC1117K.s(d12, "public.easy-to-read") ? i6 | ConstantsKt.DEFAULT_BUFFER_SIZE : i6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static int x(String str) {
        boolean q6 = q(str, f17581U, false);
        ?? r02 = q6;
        if (q(str, f17582V, false)) {
            r02 = (q6 ? 1 : 0) | 2;
        }
        return q(str, f17580T, false) ? r02 | 4 : r02;
    }

    public static f.C0222f y(String str) {
        double r6 = r(str, f17604r, -9.223372036854776E18d);
        long j6 = r6 == -9.223372036854776E18d ? -9223372036854775807L : (long) (r6 * 1000000.0d);
        boolean q6 = q(str, f17605s, false);
        double r7 = r(str, f17607u, -9.223372036854776E18d);
        long j7 = r7 == -9.223372036854776E18d ? -9223372036854775807L : (long) (r7 * 1000000.0d);
        double r8 = r(str, f17608v, -9.223372036854776E18d);
        return new f.C0222f(j6, q6, j7, r8 != -9.223372036854776E18d ? (long) (r8 * 1000000.0d) : -9223372036854775807L, q(str, f17609w, false));
    }

    public static String z(String str, Pattern pattern, Map map) {
        String v6 = v(str, pattern, map);
        if (v6 != null) {
            return v6;
        }
        throw z.c("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    @Override // A1.n.a
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public h a(Uri uri, InputStream inputStream) {
        String trim;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            if (!b(bufferedReader)) {
                throw z.c("Input does not start with the #EXTM3U header.", null);
            }
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    AbstractC1117K.m(bufferedReader);
                    throw z.c("Failed to parse the playlist, could not identify any tags.", null);
                }
                trim = readLine.trim();
                if (!trim.isEmpty()) {
                    if (!trim.startsWith("#EXT-X-STREAM-INF")) {
                        if (trim.startsWith("#EXT-X-TARGETDURATION") || trim.startsWith("#EXT-X-MEDIA-SEQUENCE") || trim.startsWith("#EXTINF") || trim.startsWith("#EXT-X-KEY") || trim.startsWith("#EXT-X-BYTERANGE") || trim.equals("#EXT-X-DISCONTINUITY") || trim.equals("#EXT-X-DISCONTINUITY-SEQUENCE") || trim.equals("#EXT-X-ENDLIST")) {
                            break;
                        }
                        arrayDeque.add(trim);
                    } else {
                        arrayDeque.add(trim);
                        return p(new b(arrayDeque, bufferedReader), uri.toString());
                    }
                }
            }
            arrayDeque.add(trim);
            return o(this.f17613a, this.f17614b, new b(arrayDeque, bufferedReader), uri.toString());
        } finally {
            AbstractC1117K.m(bufferedReader);
        }
    }

    public i(g gVar, f fVar) {
        this.f17613a = gVar;
        this.f17614b = fVar;
    }
}
