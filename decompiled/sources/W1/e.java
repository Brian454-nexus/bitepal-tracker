package W1;

import E1.C0305g;
import E1.I;
import E1.InterfaceC0314p;
import E1.InterfaceC0315q;
import E1.J;
import E1.O;
import E1.P;
import E1.r;
import E1.u;
import Z0.AbstractC0835g;
import Z0.C0836h;
import Z0.C0841m;
import Z0.z;
import android.util.Pair;
import android.util.SparseArray;
import b2.s;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import c1.AbstractC1133o;
import c1.C1134p;
import c1.C1144z;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class e implements InterfaceC0314p {

    /* renamed from: e0, reason: collision with root package name */
    public static final u f5410e0 = new u() { // from class: W1.d
        @Override // E1.u
        public final InterfaceC0314p[] c() {
            return e.b();
        }
    };

    /* renamed from: f0, reason: collision with root package name */
    public static final byte[] f5411f0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: g0, reason: collision with root package name */
    public static final byte[] f5412g0 = AbstractC1117K.s0("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* renamed from: h0, reason: collision with root package name */
    public static final byte[] f5413h0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};

    /* renamed from: i0, reason: collision with root package name */
    public static final byte[] f5414i0 = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};

    /* renamed from: j0, reason: collision with root package name */
    public static final UUID f5415j0 = new UUID(72057594037932032L, -9223371306706625679L);

    /* renamed from: k0, reason: collision with root package name */
    public static final Map f5416k0;

    /* renamed from: A, reason: collision with root package name */
    public boolean f5417A;

    /* renamed from: B, reason: collision with root package name */
    public long f5418B;

    /* renamed from: C, reason: collision with root package name */
    public long f5419C;

    /* renamed from: D, reason: collision with root package name */
    public long f5420D;

    /* renamed from: E, reason: collision with root package name */
    public C1134p f5421E;

    /* renamed from: F, reason: collision with root package name */
    public C1134p f5422F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f5423G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f5424H;

    /* renamed from: I, reason: collision with root package name */
    public int f5425I;

    /* renamed from: J, reason: collision with root package name */
    public long f5426J;

    /* renamed from: K, reason: collision with root package name */
    public long f5427K;

    /* renamed from: L, reason: collision with root package name */
    public int f5428L;

    /* renamed from: M, reason: collision with root package name */
    public int f5429M;

    /* renamed from: N, reason: collision with root package name */
    public int[] f5430N;

    /* renamed from: O, reason: collision with root package name */
    public int f5431O;

    /* renamed from: P, reason: collision with root package name */
    public int f5432P;

    /* renamed from: Q, reason: collision with root package name */
    public int f5433Q;

    /* renamed from: R, reason: collision with root package name */
    public int f5434R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f5435S;

    /* renamed from: T, reason: collision with root package name */
    public long f5436T;

    /* renamed from: U, reason: collision with root package name */
    public int f5437U;

    /* renamed from: V, reason: collision with root package name */
    public int f5438V;

    /* renamed from: W, reason: collision with root package name */
    public int f5439W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f5440X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f5441Y;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f5442Z;

    /* renamed from: a, reason: collision with root package name */
    public final W1.c f5443a;

    /* renamed from: a0, reason: collision with root package name */
    public int f5444a0;

    /* renamed from: b, reason: collision with root package name */
    public final g f5445b;

    /* renamed from: b0, reason: collision with root package name */
    public byte f5446b0;

    /* renamed from: c, reason: collision with root package name */
    public final SparseArray f5447c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f5448c0;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5449d;

    /* renamed from: d0, reason: collision with root package name */
    public r f5450d0;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f5451e;

    /* renamed from: f, reason: collision with root package name */
    public final s.a f5452f;

    /* renamed from: g, reason: collision with root package name */
    public final C1144z f5453g;

    /* renamed from: h, reason: collision with root package name */
    public final C1144z f5454h;

    /* renamed from: i, reason: collision with root package name */
    public final C1144z f5455i;

    /* renamed from: j, reason: collision with root package name */
    public final C1144z f5456j;

    /* renamed from: k, reason: collision with root package name */
    public final C1144z f5457k;

    /* renamed from: l, reason: collision with root package name */
    public final C1144z f5458l;

    /* renamed from: m, reason: collision with root package name */
    public final C1144z f5459m;

    /* renamed from: n, reason: collision with root package name */
    public final C1144z f5460n;

    /* renamed from: o, reason: collision with root package name */
    public final C1144z f5461o;

    /* renamed from: p, reason: collision with root package name */
    public final C1144z f5462p;

    /* renamed from: q, reason: collision with root package name */
    public ByteBuffer f5463q;

    /* renamed from: r, reason: collision with root package name */
    public long f5464r;

    /* renamed from: s, reason: collision with root package name */
    public long f5465s;

    /* renamed from: t, reason: collision with root package name */
    public long f5466t;

    /* renamed from: u, reason: collision with root package name */
    public long f5467u;

    /* renamed from: v, reason: collision with root package name */
    public long f5468v;

    /* renamed from: w, reason: collision with root package name */
    public c f5469w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f5470x;

    /* renamed from: y, reason: collision with root package name */
    public int f5471y;

    /* renamed from: z, reason: collision with root package name */
    public long f5472z;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public final class b implements W1.b {
        public b() {
        }

        @Override // W1.b
        public void a(int i6) {
            e.this.q(i6);
        }

        @Override // W1.b
        public int b(int i6) {
            return e.this.w(i6);
        }

        @Override // W1.b
        public boolean c(int i6) {
            return e.this.B(i6);
        }

        @Override // W1.b
        public void d(int i6, String str) {
            e.this.I(i6, str);
        }

        @Override // W1.b
        public void e(int i6, double d6) {
            e.this.t(i6, d6);
        }

        @Override // W1.b
        public void f(int i6, int i7, InterfaceC0315q interfaceC0315q) {
            e.this.n(i6, i7, interfaceC0315q);
        }

        @Override // W1.b
        public void g(int i6, long j6, long j7) {
            e.this.H(i6, j6, j7);
        }

        @Override // W1.b
        public void h(int i6, long j6) {
            e.this.z(i6, j6);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c {

        /* renamed from: O, reason: collision with root package name */
        public byte[] f5488O;

        /* renamed from: U, reason: collision with root package name */
        public P f5494U;

        /* renamed from: V, reason: collision with root package name */
        public boolean f5495V;

        /* renamed from: Y, reason: collision with root package name */
        public O f5498Y;

        /* renamed from: Z, reason: collision with root package name */
        public int f5499Z;

        /* renamed from: a, reason: collision with root package name */
        public String f5500a;

        /* renamed from: b, reason: collision with root package name */
        public String f5501b;

        /* renamed from: c, reason: collision with root package name */
        public int f5502c;

        /* renamed from: d, reason: collision with root package name */
        public int f5503d;

        /* renamed from: e, reason: collision with root package name */
        public int f5504e;

        /* renamed from: f, reason: collision with root package name */
        public int f5505f;

        /* renamed from: g, reason: collision with root package name */
        public int f5506g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f5507h;

        /* renamed from: i, reason: collision with root package name */
        public byte[] f5508i;

        /* renamed from: j, reason: collision with root package name */
        public O.a f5509j;

        /* renamed from: k, reason: collision with root package name */
        public byte[] f5510k;

        /* renamed from: l, reason: collision with root package name */
        public C0841m f5511l;

        /* renamed from: m, reason: collision with root package name */
        public int f5512m = -1;

        /* renamed from: n, reason: collision with root package name */
        public int f5513n = -1;

        /* renamed from: o, reason: collision with root package name */
        public int f5514o = -1;

        /* renamed from: p, reason: collision with root package name */
        public int f5515p = -1;

        /* renamed from: q, reason: collision with root package name */
        public int f5516q = -1;

        /* renamed from: r, reason: collision with root package name */
        public int f5517r = 0;

        /* renamed from: s, reason: collision with root package name */
        public int f5518s = -1;

        /* renamed from: t, reason: collision with root package name */
        public float f5519t = 0.0f;

        /* renamed from: u, reason: collision with root package name */
        public float f5520u = 0.0f;

        /* renamed from: v, reason: collision with root package name */
        public float f5521v = 0.0f;

        /* renamed from: w, reason: collision with root package name */
        public byte[] f5522w = null;

        /* renamed from: x, reason: collision with root package name */
        public int f5523x = -1;

        /* renamed from: y, reason: collision with root package name */
        public boolean f5524y = false;

        /* renamed from: z, reason: collision with root package name */
        public int f5525z = -1;

        /* renamed from: A, reason: collision with root package name */
        public int f5474A = -1;

        /* renamed from: B, reason: collision with root package name */
        public int f5475B = -1;

        /* renamed from: C, reason: collision with root package name */
        public int f5476C = 1000;

        /* renamed from: D, reason: collision with root package name */
        public int f5477D = 200;

        /* renamed from: E, reason: collision with root package name */
        public float f5478E = -1.0f;

        /* renamed from: F, reason: collision with root package name */
        public float f5479F = -1.0f;

        /* renamed from: G, reason: collision with root package name */
        public float f5480G = -1.0f;

        /* renamed from: H, reason: collision with root package name */
        public float f5481H = -1.0f;

        /* renamed from: I, reason: collision with root package name */
        public float f5482I = -1.0f;

        /* renamed from: J, reason: collision with root package name */
        public float f5483J = -1.0f;

        /* renamed from: K, reason: collision with root package name */
        public float f5484K = -1.0f;

        /* renamed from: L, reason: collision with root package name */
        public float f5485L = -1.0f;

        /* renamed from: M, reason: collision with root package name */
        public float f5486M = -1.0f;

        /* renamed from: N, reason: collision with root package name */
        public float f5487N = -1.0f;

        /* renamed from: P, reason: collision with root package name */
        public int f5489P = 1;

        /* renamed from: Q, reason: collision with root package name */
        public int f5490Q = -1;

        /* renamed from: R, reason: collision with root package name */
        public int f5491R = 8000;

        /* renamed from: S, reason: collision with root package name */
        public long f5492S = 0;

        /* renamed from: T, reason: collision with root package name */
        public long f5493T = 0;

        /* renamed from: W, reason: collision with root package name */
        public boolean f5496W = true;

        /* renamed from: X, reason: collision with root package name */
        public String f5497X = "eng";

        public static Pair k(C1144z c1144z) {
            try {
                c1144z.U(16);
                long w6 = c1144z.w();
                if (w6 == 1482049860) {
                    return new Pair("video/divx", null);
                }
                if (w6 == 859189832) {
                    return new Pair("video/3gpp", null);
                }
                if (w6 != 826496599) {
                    AbstractC1133o.h("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                    return new Pair("video/x-unknown", null);
                }
                byte[] e6 = c1144z.e();
                for (int f6 = c1144z.f() + 20; f6 < e6.length - 4; f6++) {
                    if (e6[f6] == 0 && e6[f6 + 1] == 0 && e6[f6 + 2] == 1 && e6[f6 + 3] == 15) {
                        return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(e6, f6, e6.length)));
                    }
                }
                throw z.a("Failed to find FourCC VC1 initialization data", null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw z.a("Error parsing FourCC private data", null);
            }
        }

        public static boolean l(C1144z c1144z) {
            try {
                int y6 = c1144z.y();
                if (y6 == 1) {
                    return true;
                }
                if (y6 == 65534) {
                    c1144z.T(24);
                    if (c1144z.z() == e.f5415j0.getMostSignificantBits()) {
                        if (c1144z.z() == e.f5415j0.getLeastSignificantBits()) {
                            return true;
                        }
                    }
                }
                return false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw z.a("Error parsing MS/ACM codec private", null);
            }
        }

        public static List m(byte[] bArr) {
            int i6;
            int i7;
            try {
                if (bArr[0] != 2) {
                    throw z.a("Error parsing vorbis codec private", null);
                }
                int i8 = 0;
                int i9 = 1;
                while (true) {
                    i6 = bArr[i9];
                    if ((i6 & 255) != 255) {
                        break;
                    }
                    i8 += 255;
                    i9++;
                }
                int i10 = i9 + 1;
                int i11 = i8 + (i6 & 255);
                int i12 = 0;
                while (true) {
                    i7 = bArr[i10];
                    if ((i7 & 255) != 255) {
                        break;
                    }
                    i12 += 255;
                    i10++;
                }
                int i13 = i10 + 1;
                int i14 = i12 + (i7 & 255);
                if (bArr[i13] != 1) {
                    throw z.a("Error parsing vorbis codec private", null);
                }
                byte[] bArr2 = new byte[i11];
                System.arraycopy(bArr, i13, bArr2, 0, i11);
                int i15 = i13 + i11;
                if (bArr[i15] != 3) {
                    throw z.a("Error parsing vorbis codec private", null);
                }
                int i16 = i15 + i14;
                if (bArr[i16] != 5) {
                    throw z.a("Error parsing vorbis codec private", null);
                }
                byte[] bArr3 = new byte[bArr.length - i16];
                System.arraycopy(bArr, i16, bArr3, 0, bArr.length - i16);
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(bArr2);
                arrayList.add(bArr3);
                return arrayList;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw z.a("Error parsing vorbis codec private", null);
            }
        }

        public final void f() {
            AbstractC1119a.e(this.f5498Y);
        }

        public final byte[] g(String str) {
            byte[] bArr = this.f5510k;
            if (bArr != null) {
                return bArr;
            }
            throw z.a("Missing CodecPrivate for codec " + str, null);
        }

        public final byte[] h() {
            if (this.f5478E == -1.0f || this.f5479F == -1.0f || this.f5480G == -1.0f || this.f5481H == -1.0f || this.f5482I == -1.0f || this.f5483J == -1.0f || this.f5484K == -1.0f || this.f5485L == -1.0f || this.f5486M == -1.0f || this.f5487N == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            order.put((byte) 0);
            order.putShort((short) ((this.f5478E * 50000.0f) + 0.5f));
            order.putShort((short) ((this.f5479F * 50000.0f) + 0.5f));
            order.putShort((short) ((this.f5480G * 50000.0f) + 0.5f));
            order.putShort((short) ((this.f5481H * 50000.0f) + 0.5f));
            order.putShort((short) ((this.f5482I * 50000.0f) + 0.5f));
            order.putShort((short) ((this.f5483J * 50000.0f) + 0.5f));
            order.putShort((short) ((this.f5484K * 50000.0f) + 0.5f));
            order.putShort((short) ((this.f5485L * 50000.0f) + 0.5f));
            order.putShort((short) (this.f5486M + 0.5f));
            order.putShort((short) (this.f5487N + 0.5f));
            order.putShort((short) this.f5476C);
            order.putShort((short) this.f5477D);
            return bArr;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to find 'out' block for switch in B:4:0x01dd. Please report as an issue. */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0439  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0452  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0461  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x059e  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0473  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x0454  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void i(E1.r r19, int r20) {
            /*
                Method dump skipped, instructions count: 1716
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: W1.e.c.i(E1.r, int):void");
        }

        public void j() {
            P p6 = this.f5494U;
            if (p6 != null) {
                p6.a(this.f5498Y, this.f5509j);
            }
        }

        public void n() {
            P p6 = this.f5494U;
            if (p6 != null) {
                p6.b();
            }
        }

        public final boolean o(boolean z6) {
            return "A_OPUS".equals(this.f5501b) ? z6 : this.f5505f > 0;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        f5416k0 = Collections.unmodifiableMap(hashMap);
    }

    public e(s.a aVar, int i6) {
        this(new W1.a(), i6, aVar);
    }

    public static boolean A(String str) {
        str.getClass();
        char c6 = 65535;
        switch (str.hashCode()) {
            case -2095576542:
                if (str.equals("V_MPEG4/ISO/AP")) {
                    c6 = 0;
                    break;
                }
                break;
            case -2095575984:
                if (str.equals("V_MPEG4/ISO/SP")) {
                    c6 = 1;
                    break;
                }
                break;
            case -1985379776:
                if (str.equals("A_MS/ACM")) {
                    c6 = 2;
                    break;
                }
                break;
            case -1784763192:
                if (str.equals("A_TRUEHD")) {
                    c6 = 3;
                    break;
                }
                break;
            case -1730367663:
                if (str.equals("A_VORBIS")) {
                    c6 = 4;
                    break;
                }
                break;
            case -1482641358:
                if (str.equals("A_MPEG/L2")) {
                    c6 = 5;
                    break;
                }
                break;
            case -1482641357:
                if (str.equals("A_MPEG/L3")) {
                    c6 = 6;
                    break;
                }
                break;
            case -1373388978:
                if (str.equals("V_MS/VFW/FOURCC")) {
                    c6 = 7;
                    break;
                }
                break;
            case -933872740:
                if (str.equals("S_DVBSUB")) {
                    c6 = '\b';
                    break;
                }
                break;
            case -538363189:
                if (str.equals("V_MPEG4/ISO/ASP")) {
                    c6 = '\t';
                    break;
                }
                break;
            case -538363109:
                if (str.equals("V_MPEG4/ISO/AVC")) {
                    c6 = '\n';
                    break;
                }
                break;
            case -425012669:
                if (str.equals("S_VOBSUB")) {
                    c6 = 11;
                    break;
                }
                break;
            case -356037306:
                if (str.equals("A_DTS/LOSSLESS")) {
                    c6 = '\f';
                    break;
                }
                break;
            case 62923557:
                if (str.equals("A_AAC")) {
                    c6 = '\r';
                    break;
                }
                break;
            case 62923603:
                if (str.equals("A_AC3")) {
                    c6 = 14;
                    break;
                }
                break;
            case 62927045:
                if (str.equals("A_DTS")) {
                    c6 = 15;
                    break;
                }
                break;
            case 82318131:
                if (str.equals("V_AV1")) {
                    c6 = 16;
                    break;
                }
                break;
            case 82338133:
                if (str.equals("V_VP8")) {
                    c6 = 17;
                    break;
                }
                break;
            case 82338134:
                if (str.equals("V_VP9")) {
                    c6 = 18;
                    break;
                }
                break;
            case 99146302:
                if (str.equals("S_HDMV/PGS")) {
                    c6 = 19;
                    break;
                }
                break;
            case 444813526:
                if (str.equals("V_THEORA")) {
                    c6 = 20;
                    break;
                }
                break;
            case 542569478:
                if (str.equals("A_DTS/EXPRESS")) {
                    c6 = 21;
                    break;
                }
                break;
            case 635596514:
                if (str.equals("A_PCM/FLOAT/IEEE")) {
                    c6 = 22;
                    break;
                }
                break;
            case 725948237:
                if (str.equals("A_PCM/INT/BIG")) {
                    c6 = 23;
                    break;
                }
                break;
            case 725957860:
                if (str.equals("A_PCM/INT/LIT")) {
                    c6 = 24;
                    break;
                }
                break;
            case 738597099:
                if (str.equals("S_TEXT/ASS")) {
                    c6 = 25;
                    break;
                }
                break;
            case 855502857:
                if (str.equals("V_MPEGH/ISO/HEVC")) {
                    c6 = 26;
                    break;
                }
                break;
            case 1045209816:
                if (str.equals("S_TEXT/WEBVTT")) {
                    c6 = 27;
                    break;
                }
                break;
            case 1422270023:
                if (str.equals("S_TEXT/UTF8")) {
                    c6 = 28;
                    break;
                }
                break;
            case 1809237540:
                if (str.equals("V_MPEG2")) {
                    c6 = 29;
                    break;
                }
                break;
            case 1950749482:
                if (str.equals("A_EAC3")) {
                    c6 = 30;
                    break;
                }
                break;
            case 1950789798:
                if (str.equals("A_FLAC")) {
                    c6 = 31;
                    break;
                }
                break;
            case 1951062397:
                if (str.equals("A_OPUS")) {
                    c6 = ' ';
                    break;
                }
                break;
        }
        switch (c6) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
            case '\n':
            case 11:
            case '\f':
            case '\r':
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case ' ':
                return true;
            default:
                return false;
        }
    }

    public static void G(String str, long j6, byte[] bArr) {
        byte[] u6;
        int i6;
        str.getClass();
        char c6 = 65535;
        switch (str.hashCode()) {
            case 738597099:
                if (str.equals("S_TEXT/ASS")) {
                    c6 = 0;
                    break;
                }
                break;
            case 1045209816:
                if (str.equals("S_TEXT/WEBVTT")) {
                    c6 = 1;
                    break;
                }
                break;
            case 1422270023:
                if (str.equals("S_TEXT/UTF8")) {
                    c6 = 2;
                    break;
                }
                break;
        }
        switch (c6) {
            case 0:
                u6 = u(j6, "%01d:%02d:%02d:%02d", 10000L);
                i6 = 21;
                break;
            case 1:
                u6 = u(j6, "%02d:%02d:%02d.%03d", 1000L);
                i6 = 25;
                break;
            case 2:
                u6 = u(j6, "%02d:%02d:%02d,%03d", 1000L);
                i6 = 19;
                break;
            default:
                throw new IllegalArgumentException();
        }
        System.arraycopy(u6, 0, bArr, i6, u6.length);
    }

    public static /* synthetic */ InterfaceC0314p[] b() {
        return new InterfaceC0314p[]{new e(s.a.f10491a, 2)};
    }

    private void m() {
        AbstractC1119a.i(this.f5450d0);
    }

    public static int[] r(int[] iArr, int i6) {
        return iArr == null ? new int[i6] : iArr.length >= i6 ? iArr : new int[Math.max(iArr.length * 2, i6)];
    }

    public static byte[] u(long j6, String str, long j7) {
        AbstractC1119a.a(j6 != -9223372036854775807L);
        int i6 = (int) (j6 / 3600000000L);
        long j8 = j6 - (i6 * 3600000000L);
        int i7 = (int) (j8 / 60000000);
        long j9 = j8 - (i7 * 60000000);
        int i8 = (int) (j9 / 1000000);
        return AbstractC1117K.s0(String.format(Locale.US, str, Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf((int) ((j9 - (i8 * 1000000)) / j7))));
    }

    public boolean B(int i6) {
        return i6 == 357149030 || i6 == 524531317 || i6 == 475249515 || i6 == 374648427;
    }

    public final boolean C(I i6, long j6) {
        if (this.f5417A) {
            this.f5419C = j6;
            i6.f910a = this.f5418B;
            this.f5417A = false;
            return true;
        }
        if (this.f5470x) {
            long j7 = this.f5419C;
            if (j7 != -1) {
                i6.f910a = j7;
                this.f5419C = -1L;
                return true;
            }
        }
        return false;
    }

    public final void D(InterfaceC0315q interfaceC0315q, int i6) {
        if (this.f5455i.g() >= i6) {
            return;
        }
        if (this.f5455i.b() < i6) {
            C1144z c1144z = this.f5455i;
            c1144z.c(Math.max(c1144z.b() * 2, i6));
        }
        interfaceC0315q.readFully(this.f5455i.e(), this.f5455i.g(), i6 - this.f5455i.g());
        this.f5455i.S(i6);
    }

    public final void E() {
        this.f5437U = 0;
        this.f5438V = 0;
        this.f5439W = 0;
        this.f5440X = false;
        this.f5441Y = false;
        this.f5442Z = false;
        this.f5444a0 = 0;
        this.f5446b0 = (byte) 0;
        this.f5448c0 = false;
        this.f5458l.P(0);
    }

    public final long F(long j6) {
        long j7 = this.f5466t;
        if (j7 != -9223372036854775807L) {
            return AbstractC1117K.W0(j6, j7, 1000L);
        }
        throw z.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    public void H(int i6, long j6, long j7) {
        m();
        if (i6 == 160) {
            this.f5435S = false;
            this.f5436T = 0L;
            return;
        }
        if (i6 == 174) {
            this.f5469w = new c();
            return;
        }
        if (i6 == 187) {
            this.f5423G = false;
            return;
        }
        if (i6 == 19899) {
            this.f5471y = -1;
            this.f5472z = -1L;
            return;
        }
        if (i6 == 20533) {
            v(i6).f5507h = true;
            return;
        }
        if (i6 == 21968) {
            v(i6).f5524y = true;
            return;
        }
        if (i6 == 408125543) {
            long j8 = this.f5465s;
            if (j8 != -1 && j8 != j6) {
                throw z.a("Multiple Segment elements not supported", null);
            }
            this.f5465s = j6;
            this.f5464r = j7;
            return;
        }
        if (i6 == 475249515) {
            this.f5421E = new C1134p();
            this.f5422F = new C1134p();
        } else if (i6 == 524531317 && !this.f5470x) {
            if (this.f5449d && this.f5418B != -1) {
                this.f5417A = true;
            } else {
                this.f5450d0.n(new J.b(this.f5468v));
                this.f5470x = true;
            }
        }
    }

    public void I(int i6, String str) {
        if (i6 == 134) {
            v(i6).f5501b = str;
            return;
        }
        if (i6 != 17026) {
            if (i6 == 21358) {
                v(i6).f5500a = str;
                return;
            } else {
                if (i6 != 2274716) {
                    return;
                }
                v(i6).f5497X = str;
                return;
            }
        }
        if ("webm".equals(str) || "matroska".equals(str)) {
            return;
        }
        throw z.a("DocType " + str + " not supported", null);
    }

    public final int J(InterfaceC0315q interfaceC0315q, c cVar, int i6, boolean z6) {
        int i7;
        if ("S_TEXT/UTF8".equals(cVar.f5501b)) {
            K(interfaceC0315q, f5411f0, i6);
            return s();
        }
        if ("S_TEXT/ASS".equals(cVar.f5501b)) {
            K(interfaceC0315q, f5413h0, i6);
            return s();
        }
        if ("S_TEXT/WEBVTT".equals(cVar.f5501b)) {
            K(interfaceC0315q, f5414i0, i6);
            return s();
        }
        O o6 = cVar.f5498Y;
        if (!this.f5440X) {
            if (cVar.f5507h) {
                this.f5433Q &= -1073741825;
                if (!this.f5441Y) {
                    interfaceC0315q.readFully(this.f5455i.e(), 0, 1);
                    this.f5437U++;
                    if ((this.f5455i.e()[0] & ByteCompanionObject.MIN_VALUE) == 128) {
                        throw z.a("Extension bit is set in signal byte", null);
                    }
                    this.f5446b0 = this.f5455i.e()[0];
                    this.f5441Y = true;
                }
                byte b6 = this.f5446b0;
                if ((b6 & 1) == 1) {
                    boolean z7 = (b6 & 2) == 2;
                    this.f5433Q |= 1073741824;
                    if (!this.f5448c0) {
                        interfaceC0315q.readFully(this.f5460n.e(), 0, 8);
                        this.f5437U += 8;
                        this.f5448c0 = true;
                        this.f5455i.e()[0] = (byte) ((z7 ? 128 : 0) | 8);
                        this.f5455i.T(0);
                        o6.b(this.f5455i, 1, 1);
                        this.f5438V++;
                        this.f5460n.T(0);
                        o6.b(this.f5460n, 8, 1);
                        this.f5438V += 8;
                    }
                    if (z7) {
                        if (!this.f5442Z) {
                            interfaceC0315q.readFully(this.f5455i.e(), 0, 1);
                            this.f5437U++;
                            this.f5455i.T(0);
                            this.f5444a0 = this.f5455i.G();
                            this.f5442Z = true;
                        }
                        int i8 = this.f5444a0 * 4;
                        this.f5455i.P(i8);
                        interfaceC0315q.readFully(this.f5455i.e(), 0, i8);
                        this.f5437U += i8;
                        short s6 = (short) ((this.f5444a0 / 2) + 1);
                        int i9 = (s6 * 6) + 2;
                        ByteBuffer byteBuffer = this.f5463q;
                        if (byteBuffer == null || byteBuffer.capacity() < i9) {
                            this.f5463q = ByteBuffer.allocate(i9);
                        }
                        this.f5463q.position(0);
                        this.f5463q.putShort(s6);
                        int i10 = 0;
                        int i11 = 0;
                        while (true) {
                            i7 = this.f5444a0;
                            if (i10 >= i7) {
                                break;
                            }
                            int K5 = this.f5455i.K();
                            if (i10 % 2 == 0) {
                                this.f5463q.putShort((short) (K5 - i11));
                            } else {
                                this.f5463q.putInt(K5 - i11);
                            }
                            i10++;
                            i11 = K5;
                        }
                        int i12 = (i6 - this.f5437U) - i11;
                        if (i7 % 2 == 1) {
                            this.f5463q.putInt(i12);
                        } else {
                            this.f5463q.putShort((short) i12);
                            this.f5463q.putInt(0);
                        }
                        this.f5461o.R(this.f5463q.array(), i9);
                        o6.b(this.f5461o, i9, 1);
                        this.f5438V += i9;
                    }
                }
            } else {
                byte[] bArr = cVar.f5508i;
                if (bArr != null) {
                    this.f5458l.R(bArr, bArr.length);
                }
            }
            if (cVar.o(z6)) {
                this.f5433Q |= 268435456;
                this.f5462p.P(0);
                int g6 = (this.f5458l.g() + i6) - this.f5437U;
                this.f5455i.P(4);
                this.f5455i.e()[0] = (byte) ((g6 >> 24) & 255);
                this.f5455i.e()[1] = (byte) ((g6 >> 16) & 255);
                this.f5455i.e()[2] = (byte) ((g6 >> 8) & 255);
                this.f5455i.e()[3] = (byte) (g6 & 255);
                o6.b(this.f5455i, 4, 2);
                this.f5438V += 4;
            }
            this.f5440X = true;
        }
        int g7 = i6 + this.f5458l.g();
        if (!"V_MPEG4/ISO/AVC".equals(cVar.f5501b) && !"V_MPEGH/ISO/HEVC".equals(cVar.f5501b)) {
            if (cVar.f5494U != null) {
                AbstractC1119a.g(this.f5458l.g() == 0);
                cVar.f5494U.d(interfaceC0315q);
            }
            while (true) {
                int i13 = this.f5437U;
                if (i13 >= g7) {
                    break;
                }
                int L5 = L(interfaceC0315q, o6, g7 - i13);
                this.f5437U += L5;
                this.f5438V += L5;
            }
        } else {
            byte[] e6 = this.f5454h.e();
            e6[0] = 0;
            e6[1] = 0;
            e6[2] = 0;
            int i14 = cVar.f5499Z;
            int i15 = 4 - i14;
            while (this.f5437U < g7) {
                int i16 = this.f5439W;
                if (i16 == 0) {
                    M(interfaceC0315q, e6, i15, i14);
                    this.f5437U += i14;
                    this.f5454h.T(0);
                    this.f5439W = this.f5454h.K();
                    this.f5453g.T(0);
                    o6.a(this.f5453g, 4);
                    this.f5438V += 4;
                } else {
                    int L6 = L(interfaceC0315q, o6, i16);
                    this.f5437U += L6;
                    this.f5438V += L6;
                    this.f5439W -= L6;
                }
            }
        }
        if ("A_VORBIS".equals(cVar.f5501b)) {
            this.f5456j.T(0);
            o6.a(this.f5456j, 4);
            this.f5438V += 4;
        }
        return s();
    }

    public final void K(InterfaceC0315q interfaceC0315q, byte[] bArr, int i6) {
        int length = bArr.length + i6;
        if (this.f5459m.b() < length) {
            this.f5459m.Q(Arrays.copyOf(bArr, length + i6));
        } else {
            System.arraycopy(bArr, 0, this.f5459m.e(), 0, bArr.length);
        }
        interfaceC0315q.readFully(this.f5459m.e(), bArr.length, i6);
        this.f5459m.T(0);
        this.f5459m.S(length);
    }

    public final int L(InterfaceC0315q interfaceC0315q, O o6, int i6) {
        int a6 = this.f5458l.a();
        if (a6 <= 0) {
            return o6.c(interfaceC0315q, i6, false);
        }
        int min = Math.min(i6, a6);
        o6.a(this.f5458l, min);
        return min;
    }

    public final void M(InterfaceC0315q interfaceC0315q, byte[] bArr, int i6, int i7) {
        int min = Math.min(i7, this.f5458l.a());
        interfaceC0315q.readFully(bArr, i6 + min, i7 - min);
        if (min > 0) {
            this.f5458l.l(bArr, i6, min);
        }
    }

    @Override // E1.InterfaceC0314p
    public void a(long j6, long j7) {
        this.f5420D = -9223372036854775807L;
        this.f5425I = 0;
        this.f5443a.a();
        this.f5445b.e();
        E();
        for (int i6 = 0; i6 < this.f5447c.size(); i6++) {
            ((c) this.f5447c.valueAt(i6)).n();
        }
    }

    @Override // E1.InterfaceC0314p
    public final void c(r rVar) {
        this.f5450d0 = rVar;
        if (this.f5451e) {
            rVar = new b2.u(rVar, this.f5452f);
        }
        this.f5450d0 = rVar;
    }

    @Override // E1.InterfaceC0314p
    public final int g(InterfaceC0315q interfaceC0315q, I i6) {
        this.f5424H = false;
        boolean z6 = true;
        while (z6 && !this.f5424H) {
            z6 = this.f5443a.b(interfaceC0315q);
            if (z6 && C(i6, interfaceC0315q.getPosition())) {
                return 1;
            }
        }
        if (z6) {
            return 0;
        }
        for (int i7 = 0; i7 < this.f5447c.size(); i7++) {
            c cVar = (c) this.f5447c.valueAt(i7);
            cVar.f();
            cVar.j();
        }
        return -1;
    }

    @Override // E1.InterfaceC0314p
    public final boolean i(InterfaceC0315q interfaceC0315q) {
        return new f().b(interfaceC0315q);
    }

    public final void k(int i6) {
        if (this.f5421E == null || this.f5422F == null) {
            throw z.a("Element " + i6 + " must be in a Cues", null);
        }
    }

    public final void l(int i6) {
        if (this.f5469w != null) {
            return;
        }
        throw z.a("Element " + i6 + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x0244, code lost:
    
        throw Z0.z.a("EBML lacing sample size out of range.", null);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void n(int r24, int r25, E1.InterfaceC0315q r26) {
        /*
            Method dump skipped, instructions count: 773
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: W1.e.n(int, int, E1.q):void");
    }

    public final J o(C1134p c1134p, C1134p c1134p2) {
        int i6;
        if (this.f5465s == -1 || this.f5468v == -9223372036854775807L || c1134p == null || c1134p.c() == 0 || c1134p2 == null || c1134p2.c() != c1134p.c()) {
            return new J.b(this.f5468v);
        }
        int c6 = c1134p.c();
        int[] iArr = new int[c6];
        long[] jArr = new long[c6];
        long[] jArr2 = new long[c6];
        long[] jArr3 = new long[c6];
        int i7 = 0;
        for (int i8 = 0; i8 < c6; i8++) {
            jArr3[i8] = c1134p.b(i8);
            jArr[i8] = this.f5465s + c1134p2.b(i8);
        }
        while (true) {
            i6 = c6 - 1;
            if (i7 >= i6) {
                break;
            }
            int i9 = i7 + 1;
            iArr[i7] = (int) (jArr[i9] - jArr[i7]);
            jArr2[i7] = jArr3[i9] - jArr3[i7];
            i7 = i9;
        }
        iArr[i6] = (int) ((this.f5465s + this.f5464r) - jArr[i6]);
        long j6 = this.f5468v - jArr3[i6];
        jArr2[i6] = j6;
        if (j6 <= 0) {
            AbstractC1133o.h("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j6);
            iArr = Arrays.copyOf(iArr, i6);
            jArr = Arrays.copyOf(jArr, i6);
            jArr2 = Arrays.copyOf(jArr2, i6);
            jArr3 = Arrays.copyOf(jArr3, i6);
        }
        return new C0305g(iArr, jArr, jArr2, jArr3);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(W1.e.c r18, long r19, int r21, int r22, int r23) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            E1.P r2 = r1.f5494U
            r9 = 1
            if (r2 == 0) goto L1c
            r3 = r2
            E1.O r2 = r1.f5498Y
            E1.O$a r8 = r1.f5509j
            r5 = r21
            r6 = r22
            r7 = r23
            r1 = r3
            r3 = r19
            r1.c(r2, r3, r5, r6, r7, r8)
            goto Lc8
        L1c:
            java.lang.String r2 = "S_TEXT/UTF8"
            java.lang.String r3 = r1.f5501b
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L3a
            java.lang.String r2 = "S_TEXT/ASS"
            java.lang.String r3 = r1.f5501b
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L3a
            java.lang.String r2 = "S_TEXT/WEBVTT"
            java.lang.String r3 = r1.f5501b
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L56
        L3a:
            int r2 = r0.f5429M
            java.lang.String r3 = "MatroskaExtractor"
            if (r2 <= r9) goto L46
            java.lang.String r2 = "Skipping subtitle sample in laced block."
            c1.AbstractC1133o.h(r3, r2)
            goto L56
        L46:
            long r4 = r0.f5427K
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 != 0) goto L59
            java.lang.String r2 = "Skipping subtitle sample with no duration."
            c1.AbstractC1133o.h(r3, r2)
        L56:
            r2 = r22
            goto L98
        L59:
            java.lang.String r2 = r1.f5501b
            c1.z r3 = r0.f5459m
            byte[] r3 = r3.e()
            G(r2, r4, r3)
            c1.z r2 = r0.f5459m
            int r2 = r2.f()
        L6a:
            c1.z r3 = r0.f5459m
            int r3 = r3.g()
            if (r2 >= r3) goto L85
            c1.z r3 = r0.f5459m
            byte[] r3 = r3.e()
            r3 = r3[r2]
            if (r3 != 0) goto L82
            c1.z r3 = r0.f5459m
            r3.S(r2)
            goto L85
        L82:
            int r2 = r2 + 1
            goto L6a
        L85:
            E1.O r2 = r1.f5498Y
            c1.z r3 = r0.f5459m
            int r4 = r3.g()
            r2.a(r3, r4)
            c1.z r2 = r0.f5459m
            int r2 = r2.g()
            int r2 = r22 + r2
        L98:
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            r3 = r21 & r3
            if (r3 == 0) goto Lb8
            int r3 = r0.f5429M
            if (r3 <= r9) goto La9
            c1.z r3 = r0.f5462p
            r4 = 0
            r3.P(r4)
            goto Lb8
        La9:
            c1.z r3 = r0.f5462p
            int r3 = r3.g()
            E1.O r4 = r1.f5498Y
            c1.z r5 = r0.f5462p
            r6 = 2
            r4.b(r5, r3, r6)
            int r2 = r2 + r3
        Lb8:
            r14 = r2
            E1.O r10 = r1.f5498Y
            E1.O$a r1 = r1.f5509j
            r11 = r19
            r13 = r21
            r15 = r23
            r16 = r1
            r10.f(r11, r13, r14, r15, r16)
        Lc8:
            r0.f5424H = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: W1.e.p(W1.e$c, long, int, int, int):void");
    }

    public void q(int i6) {
        m();
        if (i6 == 160) {
            if (this.f5425I != 2) {
                return;
            }
            c cVar = (c) this.f5447c.get(this.f5431O);
            cVar.f();
            if (this.f5436T > 0 && "A_OPUS".equals(cVar.f5501b)) {
                this.f5462p.Q(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.f5436T).array());
            }
            int i7 = 0;
            for (int i8 = 0; i8 < this.f5429M; i8++) {
                i7 += this.f5430N[i8];
            }
            int i9 = 0;
            while (i9 < this.f5429M) {
                long j6 = this.f5426J + ((cVar.f5504e * i9) / 1000);
                int i10 = this.f5433Q;
                if (i9 == 0 && !this.f5435S) {
                    i10 |= 1;
                }
                int i11 = this.f5430N[i9];
                int i12 = i7 - i11;
                p(cVar, j6, i10, i11, i12);
                i9++;
                i7 = i12;
            }
            this.f5425I = 0;
            return;
        }
        if (i6 == 174) {
            c cVar2 = (c) AbstractC1119a.i(this.f5469w);
            String str = cVar2.f5501b;
            if (str == null) {
                throw z.a("CodecId is missing in TrackEntry element", null);
            }
            if (A(str)) {
                cVar2.i(this.f5450d0, cVar2.f5502c);
                this.f5447c.put(cVar2.f5502c, cVar2);
            }
            this.f5469w = null;
            return;
        }
        if (i6 == 19899) {
            int i13 = this.f5471y;
            if (i13 != -1) {
                long j7 = this.f5472z;
                if (j7 != -1) {
                    if (i13 == 475249515) {
                        this.f5418B = j7;
                        return;
                    }
                    return;
                }
            }
            throw z.a("Mandatory element SeekID or SeekPosition not found", null);
        }
        if (i6 == 25152) {
            l(i6);
            c cVar3 = this.f5469w;
            if (cVar3.f5507h) {
                if (cVar3.f5509j == null) {
                    throw z.a("Encrypted Track found but ContentEncKeyID was not found", null);
                }
                cVar3.f5511l = new C0841m(new C0841m.b(AbstractC0835g.f6879a, "video/webm", this.f5469w.f5509j.f928b));
                return;
            }
            return;
        }
        if (i6 == 28032) {
            l(i6);
            c cVar4 = this.f5469w;
            if (cVar4.f5507h && cVar4.f5508i != null) {
                throw z.a("Combining encryption and compression is not supported", null);
            }
            return;
        }
        if (i6 == 357149030) {
            if (this.f5466t == -9223372036854775807L) {
                this.f5466t = 1000000L;
            }
            long j8 = this.f5467u;
            if (j8 != -9223372036854775807L) {
                this.f5468v = F(j8);
                return;
            }
            return;
        }
        if (i6 == 374648427) {
            if (this.f5447c.size() == 0) {
                throw z.a("No valid tracks were found", null);
            }
            this.f5450d0.k();
        } else {
            if (i6 != 475249515) {
                return;
            }
            if (!this.f5470x) {
                this.f5450d0.n(o(this.f5421E, this.f5422F));
                this.f5470x = true;
            }
            this.f5421E = null;
            this.f5422F = null;
        }
    }

    @Override // E1.InterfaceC0314p
    public final void release() {
    }

    public final int s() {
        int i6 = this.f5438V;
        E();
        return i6;
    }

    public void t(int i6, double d6) {
        if (i6 == 181) {
            v(i6).f5491R = (int) d6;
            return;
        }
        if (i6 == 17545) {
            this.f5467u = (long) d6;
            return;
        }
        switch (i6) {
            case 21969:
                v(i6).f5478E = (float) d6;
                return;
            case 21970:
                v(i6).f5479F = (float) d6;
                return;
            case 21971:
                v(i6).f5480G = (float) d6;
                return;
            case 21972:
                v(i6).f5481H = (float) d6;
                return;
            case 21973:
                v(i6).f5482I = (float) d6;
                return;
            case 21974:
                v(i6).f5483J = (float) d6;
                return;
            case 21975:
                v(i6).f5484K = (float) d6;
                return;
            case 21976:
                v(i6).f5485L = (float) d6;
                return;
            case 21977:
                v(i6).f5486M = (float) d6;
                return;
            case 21978:
                v(i6).f5487N = (float) d6;
                return;
            default:
                switch (i6) {
                    case 30323:
                        v(i6).f5519t = (float) d6;
                        return;
                    case 30324:
                        v(i6).f5520u = (float) d6;
                        return;
                    case 30325:
                        v(i6).f5521v = (float) d6;
                        return;
                    default:
                        return;
                }
        }
    }

    public c v(int i6) {
        l(i6);
        return this.f5469w;
    }

    public int w(int i6) {
        switch (i6) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 238:
            case 241:
            case 251:
            case 16871:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21938:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30114:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 165:
            case 16877:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    public void x(c cVar, InterfaceC0315q interfaceC0315q, int i6) {
        if (cVar.f5506g != 1685485123 && cVar.f5506g != 1685480259) {
            interfaceC0315q.p(i6);
            return;
        }
        byte[] bArr = new byte[i6];
        cVar.f5488O = bArr;
        interfaceC0315q.readFully(bArr, 0, i6);
    }

    public void y(c cVar, int i6, InterfaceC0315q interfaceC0315q, int i7) {
        if (i6 != 4 || !"V_VP9".equals(cVar.f5501b)) {
            interfaceC0315q.p(i7);
        } else {
            this.f5462p.P(i7);
            interfaceC0315q.readFully(this.f5462p.e(), 0, i7);
        }
    }

    public void z(int i6, long j6) {
        if (i6 == 20529) {
            if (j6 == 0) {
                return;
            }
            throw z.a("ContentEncodingOrder " + j6 + " not supported", null);
        }
        if (i6 == 20530) {
            if (j6 == 1) {
                return;
            }
            throw z.a("ContentEncodingScope " + j6 + " not supported", null);
        }
        switch (i6) {
            case 131:
                v(i6).f5503d = (int) j6;
                return;
            case 136:
                v(i6).f5496W = j6 == 1;
                return;
            case 155:
                this.f5427K = F(j6);
                return;
            case 159:
                v(i6).f5489P = (int) j6;
                return;
            case 176:
                v(i6).f5512m = (int) j6;
                return;
            case 179:
                k(i6);
                this.f5421E.a(F(j6));
                return;
            case 186:
                v(i6).f5513n = (int) j6;
                return;
            case 215:
                v(i6).f5502c = (int) j6;
                return;
            case 231:
                this.f5420D = F(j6);
                return;
            case 238:
                this.f5434R = (int) j6;
                return;
            case 241:
                if (this.f5423G) {
                    return;
                }
                k(i6);
                this.f5422F.a(j6);
                this.f5423G = true;
                return;
            case 251:
                this.f5435S = true;
                return;
            case 16871:
                v(i6).f5506g = (int) j6;
                return;
            case 16980:
                if (j6 == 3) {
                    return;
                }
                throw z.a("ContentCompAlgo " + j6 + " not supported", null);
            case 17029:
                if (j6 < 1 || j6 > 2) {
                    throw z.a("DocTypeReadVersion " + j6 + " not supported", null);
                }
                return;
            case 17143:
                if (j6 == 1) {
                    return;
                }
                throw z.a("EBMLReadVersion " + j6 + " not supported", null);
            case 18401:
                if (j6 == 5) {
                    return;
                }
                throw z.a("ContentEncAlgo " + j6 + " not supported", null);
            case 18408:
                if (j6 == 1) {
                    return;
                }
                throw z.a("AESSettingsCipherMode " + j6 + " not supported", null);
            case 21420:
                this.f5472z = j6 + this.f5465s;
                return;
            case 21432:
                int i7 = (int) j6;
                l(i6);
                if (i7 == 0) {
                    this.f5469w.f5523x = 0;
                    return;
                }
                if (i7 == 1) {
                    this.f5469w.f5523x = 2;
                    return;
                } else if (i7 == 3) {
                    this.f5469w.f5523x = 1;
                    return;
                } else {
                    if (i7 != 15) {
                        return;
                    }
                    this.f5469w.f5523x = 3;
                    return;
                }
            case 21680:
                v(i6).f5515p = (int) j6;
                return;
            case 21682:
                v(i6).f5517r = (int) j6;
                return;
            case 21690:
                v(i6).f5516q = (int) j6;
                return;
            case 21930:
                v(i6).f5495V = j6 == 1;
                return;
            case 21938:
                l(i6);
                c cVar = this.f5469w;
                cVar.f5524y = true;
                cVar.f5514o = (int) j6;
                return;
            case 21998:
                v(i6).f5505f = (int) j6;
                return;
            case 22186:
                v(i6).f5492S = j6;
                return;
            case 22203:
                v(i6).f5493T = j6;
                return;
            case 25188:
                v(i6).f5490Q = (int) j6;
                return;
            case 30114:
                this.f5436T = j6;
                return;
            case 30321:
                l(i6);
                int i8 = (int) j6;
                if (i8 == 0) {
                    this.f5469w.f5518s = 0;
                    return;
                }
                if (i8 == 1) {
                    this.f5469w.f5518s = 1;
                    return;
                } else if (i8 == 2) {
                    this.f5469w.f5518s = 2;
                    return;
                } else {
                    if (i8 != 3) {
                        return;
                    }
                    this.f5469w.f5518s = 3;
                    return;
                }
            case 2352003:
                v(i6).f5504e = (int) j6;
                return;
            case 2807729:
                this.f5466t = j6;
                return;
            default:
                switch (i6) {
                    case 21945:
                        l(i6);
                        int i9 = (int) j6;
                        if (i9 == 1) {
                            this.f5469w.f5475B = 2;
                            return;
                        } else {
                            if (i9 != 2) {
                                return;
                            }
                            this.f5469w.f5475B = 1;
                            return;
                        }
                    case 21946:
                        l(i6);
                        int k6 = C0836h.k((int) j6);
                        if (k6 != -1) {
                            this.f5469w.f5474A = k6;
                            return;
                        }
                        return;
                    case 21947:
                        l(i6);
                        this.f5469w.f5524y = true;
                        int j7 = C0836h.j((int) j6);
                        if (j7 != -1) {
                            this.f5469w.f5525z = j7;
                            return;
                        }
                        return;
                    case 21948:
                        v(i6).f5476C = (int) j6;
                        return;
                    case 21949:
                        v(i6).f5477D = (int) j6;
                        return;
                    default:
                        return;
                }
        }
    }

    public e(W1.c cVar, int i6, s.a aVar) {
        this.f5465s = -1L;
        this.f5466t = -9223372036854775807L;
        this.f5467u = -9223372036854775807L;
        this.f5468v = -9223372036854775807L;
        this.f5418B = -1L;
        this.f5419C = -1L;
        this.f5420D = -9223372036854775807L;
        this.f5443a = cVar;
        cVar.c(new b());
        this.f5452f = aVar;
        this.f5449d = (i6 & 1) == 0;
        this.f5451e = (i6 & 2) == 0;
        this.f5445b = new g();
        this.f5447c = new SparseArray();
        this.f5455i = new C1144z(4);
        this.f5456j = new C1144z(ByteBuffer.allocate(4).putInt(-1).array());
        this.f5457k = new C1144z(4);
        this.f5453g = new C1144z(d1.d.f13379a);
        this.f5454h = new C1144z(4);
        this.f5458l = new C1144z();
        this.f5459m = new C1144z();
        this.f5460n = new C1144z(8);
        this.f5461o = new C1144z();
        this.f5462p = new C1144z();
        this.f5430N = new int[1];
    }
}
