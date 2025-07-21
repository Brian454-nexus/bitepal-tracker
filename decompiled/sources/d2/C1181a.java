package d2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import b1.C1076a;
import b2.C1081e;
import b2.s;
import c1.AbstractC1117K;
import c1.AbstractC1133o;
import c1.C1143y;
import c1.C1144z;
import c1.InterfaceC1125g;
import java.util.ArrayList;
import java.util.List;
import z6.w;

/* renamed from: d2.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1181a implements s {

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f13427h = {0, 7, 8, 15};

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f13428i = {0, 119, -120, -1};

    /* renamed from: j, reason: collision with root package name */
    public static final byte[] f13429j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a, reason: collision with root package name */
    public final Paint f13430a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f13431b;

    /* renamed from: c, reason: collision with root package name */
    public final Canvas f13432c;

    /* renamed from: d, reason: collision with root package name */
    public final b f13433d;

    /* renamed from: e, reason: collision with root package name */
    public final C0189a f13434e;

    /* renamed from: f, reason: collision with root package name */
    public final h f13435f;

    /* renamed from: g, reason: collision with root package name */
    public Bitmap f13436g;

    /* renamed from: d2.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class C0189a {

        /* renamed from: a, reason: collision with root package name */
        public final int f13437a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f13438b;

        /* renamed from: c, reason: collision with root package name */
        public final int[] f13439c;

        /* renamed from: d, reason: collision with root package name */
        public final int[] f13440d;

        public C0189a(int i6, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f13437a = i6;
            this.f13438b = iArr;
            this.f13439c = iArr2;
            this.f13440d = iArr3;
        }
    }

    /* renamed from: d2.a$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f13441a;

        /* renamed from: b, reason: collision with root package name */
        public final int f13442b;

        /* renamed from: c, reason: collision with root package name */
        public final int f13443c;

        /* renamed from: d, reason: collision with root package name */
        public final int f13444d;

        /* renamed from: e, reason: collision with root package name */
        public final int f13445e;

        /* renamed from: f, reason: collision with root package name */
        public final int f13446f;

        public b(int i6, int i7, int i8, int i9, int i10, int i11) {
            this.f13441a = i6;
            this.f13442b = i7;
            this.f13443c = i8;
            this.f13444d = i9;
            this.f13445e = i10;
            this.f13446f = i11;
        }
    }

    /* renamed from: d2.a$c */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f13447a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f13448b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f13449c;

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f13450d;

        public c(int i6, boolean z6, byte[] bArr, byte[] bArr2) {
            this.f13447a = i6;
            this.f13448b = z6;
            this.f13449c = bArr;
            this.f13450d = bArr2;
        }
    }

    /* renamed from: d2.a$d */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f13451a;

        /* renamed from: b, reason: collision with root package name */
        public final int f13452b;

        /* renamed from: c, reason: collision with root package name */
        public final int f13453c;

        /* renamed from: d, reason: collision with root package name */
        public final SparseArray f13454d;

        public d(int i6, int i7, int i8, SparseArray sparseArray) {
            this.f13451a = i6;
            this.f13452b = i7;
            this.f13453c = i8;
            this.f13454d = sparseArray;
        }
    }

    /* renamed from: d2.a$e */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final int f13455a;

        /* renamed from: b, reason: collision with root package name */
        public final int f13456b;

        public e(int i6, int i7) {
            this.f13455a = i6;
            this.f13456b = i7;
        }
    }

    /* renamed from: d2.a$f */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public final int f13457a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f13458b;

        /* renamed from: c, reason: collision with root package name */
        public final int f13459c;

        /* renamed from: d, reason: collision with root package name */
        public final int f13460d;

        /* renamed from: e, reason: collision with root package name */
        public final int f13461e;

        /* renamed from: f, reason: collision with root package name */
        public final int f13462f;

        /* renamed from: g, reason: collision with root package name */
        public final int f13463g;

        /* renamed from: h, reason: collision with root package name */
        public final int f13464h;

        /* renamed from: i, reason: collision with root package name */
        public final int f13465i;

        /* renamed from: j, reason: collision with root package name */
        public final int f13466j;

        /* renamed from: k, reason: collision with root package name */
        public final SparseArray f13467k;

        public f(int i6, boolean z6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, SparseArray sparseArray) {
            this.f13457a = i6;
            this.f13458b = z6;
            this.f13459c = i7;
            this.f13460d = i8;
            this.f13461e = i9;
            this.f13462f = i10;
            this.f13463g = i11;
            this.f13464h = i12;
            this.f13465i = i13;
            this.f13466j = i14;
            this.f13467k = sparseArray;
        }

        public void a(f fVar) {
            SparseArray sparseArray = fVar.f13467k;
            for (int i6 = 0; i6 < sparseArray.size(); i6++) {
                this.f13467k.put(sparseArray.keyAt(i6), (g) sparseArray.valueAt(i6));
            }
        }
    }

    /* renamed from: d2.a$g */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        public final int f13468a;

        /* renamed from: b, reason: collision with root package name */
        public final int f13469b;

        /* renamed from: c, reason: collision with root package name */
        public final int f13470c;

        /* renamed from: d, reason: collision with root package name */
        public final int f13471d;

        /* renamed from: e, reason: collision with root package name */
        public final int f13472e;

        /* renamed from: f, reason: collision with root package name */
        public final int f13473f;

        public g(int i6, int i7, int i8, int i9, int i10, int i11) {
            this.f13468a = i6;
            this.f13469b = i7;
            this.f13470c = i8;
            this.f13471d = i9;
            this.f13472e = i10;
            this.f13473f = i11;
        }
    }

    /* renamed from: d2.a$h */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class h {

        /* renamed from: a, reason: collision with root package name */
        public final int f13474a;

        /* renamed from: b, reason: collision with root package name */
        public final int f13475b;

        /* renamed from: c, reason: collision with root package name */
        public final SparseArray f13476c = new SparseArray();

        /* renamed from: d, reason: collision with root package name */
        public final SparseArray f13477d = new SparseArray();

        /* renamed from: e, reason: collision with root package name */
        public final SparseArray f13478e = new SparseArray();

        /* renamed from: f, reason: collision with root package name */
        public final SparseArray f13479f = new SparseArray();

        /* renamed from: g, reason: collision with root package name */
        public final SparseArray f13480g = new SparseArray();

        /* renamed from: h, reason: collision with root package name */
        public b f13481h;

        /* renamed from: i, reason: collision with root package name */
        public d f13482i;

        public h(int i6, int i7) {
            this.f13474a = i6;
            this.f13475b = i7;
        }

        public void a() {
            this.f13476c.clear();
            this.f13477d.clear();
            this.f13478e.clear();
            this.f13479f.clear();
            this.f13480g.clear();
            this.f13481h = null;
            this.f13482i = null;
        }
    }

    public C1181a(List list) {
        C1144z c1144z = new C1144z((byte[]) list.get(0));
        int M5 = c1144z.M();
        int M6 = c1144z.M();
        Paint paint = new Paint();
        this.f13430a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f13431b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f13432c = new Canvas();
        this.f13433d = new b(719, 575, 0, 719, 0, 575);
        this.f13434e = new C0189a(0, f(), g(), h());
        this.f13435f = new h(M5, M6);
    }

    public static byte[] e(int i6, int i7, C1143y c1143y) {
        byte[] bArr = new byte[i6];
        for (int i8 = 0; i8 < i6; i8++) {
            bArr[i8] = (byte) c1143y.h(i7);
        }
        return bArr;
    }

    public static int[] f() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    public static int[] g() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i6 = 1; i6 < 16; i6++) {
            if (i6 < 8) {
                iArr[i6] = i(255, (i6 & 1) != 0 ? 255 : 0, (i6 & 2) != 0 ? 255 : 0, (i6 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i6] = i(255, (i6 & 1) != 0 ? 127 : 0, (i6 & 2) != 0 ? 127 : 0, (i6 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static int[] h() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i6 = 0; i6 < 256; i6++) {
            if (i6 < 8) {
                iArr[i6] = i(63, (i6 & 1) != 0 ? 255 : 0, (i6 & 2) != 0 ? 255 : 0, (i6 & 4) == 0 ? 0 : 255);
            } else {
                int i7 = i6 & 136;
                if (i7 == 0) {
                    iArr[i6] = i(255, ((i6 & 1) != 0 ? 85 : 0) + ((i6 & 16) != 0 ? 170 : 0), ((i6 & 2) != 0 ? 85 : 0) + ((i6 & 32) != 0 ? 170 : 0), ((i6 & 4) == 0 ? 0 : 85) + ((i6 & 64) == 0 ? 0 : 170));
                } else if (i7 == 8) {
                    iArr[i6] = i(127, ((i6 & 1) != 0 ? 85 : 0) + ((i6 & 16) != 0 ? 170 : 0), ((i6 & 2) != 0 ? 85 : 0) + ((i6 & 32) != 0 ? 170 : 0), ((i6 & 4) == 0 ? 0 : 85) + ((i6 & 64) == 0 ? 0 : 170));
                } else if (i7 == 128) {
                    iArr[i6] = i(255, ((i6 & 1) != 0 ? 43 : 0) + 127 + ((i6 & 16) != 0 ? 85 : 0), ((i6 & 2) != 0 ? 43 : 0) + 127 + ((i6 & 32) != 0 ? 85 : 0), ((i6 & 4) == 0 ? 0 : 43) + 127 + ((i6 & 64) == 0 ? 0 : 85));
                } else if (i7 == 136) {
                    iArr[i6] = i(255, ((i6 & 1) != 0 ? 43 : 0) + ((i6 & 16) != 0 ? 85 : 0), ((i6 & 2) != 0 ? 43 : 0) + ((i6 & 32) != 0 ? 85 : 0), ((i6 & 4) == 0 ? 0 : 43) + ((i6 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int i(int i6, int i7, int i8, int i9) {
        return (i6 << 24) | (i7 << 16) | (i8 << 8) | i9;
    }

    public static int j(C1143y c1143y, int[] iArr, byte[] bArr, int i6, int i7, Paint paint, Canvas canvas) {
        boolean z6;
        int i8;
        int h6;
        int h7;
        boolean z7 = false;
        while (true) {
            int h8 = c1143y.h(2);
            if (h8 != 0) {
                z6 = z7;
                i8 = 1;
            } else {
                if (c1143y.g()) {
                    h6 = c1143y.h(3) + 3;
                    h7 = c1143y.h(2);
                } else {
                    if (c1143y.g()) {
                        z6 = z7;
                        i8 = 1;
                    } else {
                        int h9 = c1143y.h(2);
                        if (h9 == 0) {
                            z6 = true;
                        } else if (h9 == 1) {
                            z6 = z7;
                            i8 = 2;
                        } else if (h9 == 2) {
                            h6 = c1143y.h(4) + 12;
                            h7 = c1143y.h(2);
                        } else if (h9 != 3) {
                            z6 = z7;
                        } else {
                            h6 = c1143y.h(8) + 29;
                            h7 = c1143y.h(2);
                        }
                        h8 = 0;
                        i8 = 0;
                    }
                    h8 = 0;
                }
                z6 = z7;
                i8 = h6;
                h8 = h7;
            }
            if (i8 != 0 && paint != null) {
                if (bArr != null) {
                    h8 = bArr[h8];
                }
                paint.setColor(iArr[h8]);
                canvas.drawRect(i6, i7, i6 + i8, 1 + i7, paint);
            }
            i6 += i8;
            if (z6) {
                return i6;
            }
            z7 = z6;
        }
    }

    public static int k(C1143y c1143y, int[] iArr, byte[] bArr, int i6, int i7, Paint paint, Canvas canvas) {
        boolean z6;
        int i8;
        int h6;
        int h7;
        boolean z7 = false;
        while (true) {
            int h8 = c1143y.h(4);
            if (h8 != 0) {
                z6 = z7;
                i8 = 1;
            } else if (c1143y.g()) {
                if (c1143y.g()) {
                    int h9 = c1143y.h(2);
                    if (h9 == 0) {
                        z6 = z7;
                        i8 = 1;
                        h8 = 0;
                    } else if (h9 == 1) {
                        h8 = 0;
                        i8 = 2;
                        z6 = z7;
                    } else if (h9 == 2) {
                        h6 = c1143y.h(4) + 9;
                        h7 = c1143y.h(4);
                    } else if (h9 != 3) {
                        z6 = z7;
                        h8 = 0;
                        i8 = 0;
                    } else {
                        h6 = c1143y.h(8) + 25;
                        h7 = c1143y.h(4);
                    }
                } else {
                    h6 = c1143y.h(2) + 4;
                    h7 = c1143y.h(4);
                }
                z6 = z7;
                i8 = h6;
                h8 = h7;
            } else {
                int h10 = c1143y.h(3);
                if (h10 != 0) {
                    z6 = z7;
                    i8 = h10 + 2;
                    h8 = 0;
                } else {
                    z6 = true;
                    h8 = 0;
                    i8 = 0;
                }
            }
            if (i8 != 0 && paint != null) {
                if (bArr != null) {
                    h8 = bArr[h8];
                }
                paint.setColor(iArr[h8]);
                canvas.drawRect(i6, i7, i6 + i8, 1 + i7, paint);
            }
            i6 += i8;
            if (z6) {
                return i6;
            }
            z7 = z6;
        }
    }

    public static int l(C1143y c1143y, int[] iArr, byte[] bArr, int i6, int i7, Paint paint, Canvas canvas) {
        boolean z6;
        int h6;
        boolean z7 = false;
        while (true) {
            int h7 = c1143y.h(8);
            if (h7 != 0) {
                z6 = z7;
                h6 = 1;
            } else if (c1143y.g()) {
                z6 = z7;
                h6 = c1143y.h(7);
                h7 = c1143y.h(8);
            } else {
                int h8 = c1143y.h(7);
                if (h8 != 0) {
                    z6 = z7;
                    h6 = h8;
                    h7 = 0;
                } else {
                    z6 = true;
                    h7 = 0;
                    h6 = 0;
                }
            }
            if (h6 != 0 && paint != null) {
                if (bArr != null) {
                    h7 = bArr[h7];
                }
                paint.setColor(iArr[h7]);
                canvas.drawRect(i6, i7, i6 + h6, 1 + i7, paint);
            }
            i6 += h6;
            if (z6) {
                return i6;
            }
            z7 = z6;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0020. Please report as an issue. */
    public static void m(byte[] bArr, int[] iArr, int i6, int i7, int i8, Paint paint, Canvas canvas) {
        int[] iArr2;
        Paint paint2;
        Canvas canvas2;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        C1143y c1143y = new C1143y(bArr);
        byte[] bArr5 = null;
        byte[] bArr6 = null;
        int i9 = i7;
        int i10 = i8;
        byte[] bArr7 = null;
        while (c1143y.b() != 0) {
            int h6 = c1143y.h(8);
            if (h6 != 240) {
                switch (h6) {
                    case 16:
                        iArr2 = iArr;
                        Paint paint3 = paint;
                        canvas2 = canvas;
                        if (i6 != 3) {
                            if (i6 != 2) {
                                bArr2 = null;
                                paint2 = paint3;
                                i9 = j(c1143y, iArr2, bArr2, i9, i10, paint2, canvas2);
                                c1143y.c();
                                break;
                            } else {
                                bArr3 = bArr6 == null ? f13427h : bArr6;
                            }
                        } else {
                            bArr3 = bArr7 == null ? f13428i : bArr7;
                        }
                        paint2 = paint3;
                        bArr2 = bArr3;
                        i9 = j(c1143y, iArr2, bArr2, i9, i10, paint2, canvas2);
                        c1143y.c();
                    case 17:
                        iArr2 = iArr;
                        Paint paint4 = paint;
                        canvas2 = canvas;
                        if (i6 == 3) {
                            bArr4 = bArr5 == null ? f13429j : bArr5;
                        } else {
                            bArr4 = null;
                        }
                        paint2 = paint4;
                        i9 = k(c1143y, iArr2, bArr4, i9, i10, paint2, canvas2);
                        c1143y.c();
                        break;
                    case 18:
                        iArr2 = iArr;
                        paint2 = paint;
                        canvas2 = canvas;
                        i9 = l(c1143y, iArr2, null, i9, i10, paint2, canvas2);
                        break;
                    default:
                        switch (h6) {
                            case 32:
                                bArr6 = e(4, 4, c1143y);
                                break;
                            case 33:
                                bArr7 = e(4, 8, c1143y);
                                break;
                            case 34:
                                bArr5 = e(16, 8, c1143y);
                                break;
                        }
                        iArr2 = iArr;
                        paint2 = paint;
                        canvas2 = canvas;
                        break;
                }
            } else {
                iArr2 = iArr;
                paint2 = paint;
                canvas2 = canvas;
                i10 += 2;
                i9 = i7;
            }
            iArr = iArr2;
            paint = paint2;
            canvas = canvas2;
        }
    }

    public static void n(c cVar, C0189a c0189a, int i6, int i7, int i8, Paint paint, Canvas canvas) {
        int[] iArr = i6 == 3 ? c0189a.f13440d : i6 == 2 ? c0189a.f13439c : c0189a.f13438b;
        m(cVar.f13449c, iArr, i6, i7, i8, paint, canvas);
        m(cVar.f13450d, iArr, i6, i7, i8 + 1, paint, canvas);
    }

    public static C0189a p(C1143y c1143y, int i6) {
        int h6;
        int i7;
        int h7;
        int i8;
        int i9;
        int i10 = 8;
        int h8 = c1143y.h(8);
        c1143y.r(8);
        int i11 = 2;
        int i12 = i6 - 2;
        int[] f6 = f();
        int[] g6 = g();
        int[] h9 = h();
        while (i12 > 0) {
            int h10 = c1143y.h(i10);
            int h11 = c1143y.h(i10);
            int[] iArr = (h11 & 128) != 0 ? f6 : (h11 & 64) != 0 ? g6 : h9;
            if ((h11 & 1) != 0) {
                i8 = c1143y.h(i10);
                i9 = c1143y.h(i10);
                h6 = c1143y.h(i10);
                h7 = c1143y.h(i10);
                i7 = i12 - 6;
            } else {
                int h12 = c1143y.h(6) << i11;
                int h13 = c1143y.h(4) << 4;
                h6 = c1143y.h(4) << 4;
                i7 = i12 - 4;
                h7 = c1143y.h(i11) << 6;
                i8 = h12;
                i9 = h13;
            }
            if (i8 == 0) {
                h7 = 255;
                i9 = 0;
                h6 = 0;
            }
            double d6 = i8;
            double d7 = i9 - 128;
            double d8 = h6 - 128;
            iArr[h10] = i((byte) (255 - (h7 & 255)), AbstractC1117K.p((int) (d6 + (1.402d * d7)), 0, 255), AbstractC1117K.p((int) ((d6 - (0.34414d * d8)) - (d7 * 0.71414d)), 0, 255), AbstractC1117K.p((int) (d6 + (d8 * 1.772d)), 0, 255));
            i12 = i7;
            h8 = h8;
            i10 = 8;
            i11 = 2;
        }
        return new C0189a(h8, f6, g6, h9);
    }

    public static b q(C1143y c1143y) {
        int i6;
        int i7;
        int i8;
        int i9;
        c1143y.r(4);
        boolean g6 = c1143y.g();
        c1143y.r(3);
        int h6 = c1143y.h(16);
        int h7 = c1143y.h(16);
        if (g6) {
            int h8 = c1143y.h(16);
            int h9 = c1143y.h(16);
            int h10 = c1143y.h(16);
            i9 = c1143y.h(16);
            i8 = h9;
            i7 = h10;
            i6 = h8;
        } else {
            i6 = 0;
            i7 = 0;
            i8 = h6;
            i9 = h7;
        }
        return new b(h6, h7, i6, i8, i7, i9);
    }

    public static c r(C1143y c1143y) {
        byte[] bArr;
        int h6 = c1143y.h(16);
        c1143y.r(4);
        int h7 = c1143y.h(2);
        boolean g6 = c1143y.g();
        c1143y.r(1);
        byte[] bArr2 = AbstractC1117K.f10565f;
        if (h7 == 1) {
            c1143y.r(c1143y.h(8) * 16);
        } else if (h7 == 0) {
            int h8 = c1143y.h(16);
            int h9 = c1143y.h(16);
            if (h8 > 0) {
                bArr2 = new byte[h8];
                c1143y.k(bArr2, 0, h8);
            }
            if (h9 > 0) {
                bArr = new byte[h9];
                c1143y.k(bArr, 0, h9);
                return new c(h6, g6, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new c(h6, g6, bArr2, bArr);
    }

    public static d s(C1143y c1143y, int i6) {
        int h6 = c1143y.h(8);
        int h7 = c1143y.h(4);
        int h8 = c1143y.h(2);
        c1143y.r(2);
        int i7 = i6 - 2;
        SparseArray sparseArray = new SparseArray();
        while (i7 > 0) {
            int h9 = c1143y.h(8);
            c1143y.r(8);
            i7 -= 6;
            sparseArray.put(h9, new e(c1143y.h(16), c1143y.h(16)));
        }
        return new d(h6, h7, h8, sparseArray);
    }

    public static f t(C1143y c1143y, int i6) {
        int i7;
        int i8;
        int i9;
        char c6;
        int h6 = c1143y.h(8);
        int i10 = 4;
        c1143y.r(4);
        boolean g6 = c1143y.g();
        c1143y.r(3);
        int i11 = 16;
        int h7 = c1143y.h(16);
        int h8 = c1143y.h(16);
        int h9 = c1143y.h(3);
        int h10 = c1143y.h(3);
        int i12 = 2;
        c1143y.r(2);
        int h11 = c1143y.h(8);
        int h12 = c1143y.h(8);
        int h13 = c1143y.h(4);
        int h14 = c1143y.h(2);
        c1143y.r(2);
        int i13 = i6 - 10;
        SparseArray sparseArray = new SparseArray();
        while (i13 > 0) {
            int h15 = c1143y.h(i11);
            int h16 = c1143y.h(i12);
            int h17 = c1143y.h(i12);
            int h18 = c1143y.h(12);
            c1143y.r(i10);
            int h19 = c1143y.h(12);
            int i14 = i13 - 6;
            if (h16 != 1) {
                i7 = 2;
                if (h16 != 2) {
                    i9 = 0;
                    i8 = 0;
                    i13 = i14;
                    c6 = '\b';
                    sparseArray.put(h15, new g(h16, h17, h18, h19, i9, i8));
                    i11 = 16;
                    i12 = i7;
                    i10 = 4;
                }
            } else {
                i7 = 2;
            }
            c6 = '\b';
            i13 -= 8;
            i9 = c1143y.h(8);
            i8 = c1143y.h(8);
            sparseArray.put(h15, new g(h16, h17, h18, h19, i9, i8));
            i11 = 16;
            i12 = i7;
            i10 = 4;
        }
        return new f(h6, g6, h7, h8, h9, h10, h11, h12, h13, h14, sparseArray);
    }

    public static void u(C1143y c1143y, h hVar) {
        f fVar;
        int h6 = c1143y.h(8);
        int h7 = c1143y.h(16);
        int h8 = c1143y.h(16);
        int d6 = c1143y.d() + h8;
        if (h8 * 8 > c1143y.b()) {
            AbstractC1133o.h("DvbParser", "Data field length exceeds limit");
            c1143y.r(c1143y.b());
            return;
        }
        switch (h6) {
            case 16:
                if (h7 == hVar.f13474a) {
                    d dVar = hVar.f13482i;
                    d s6 = s(c1143y, h8);
                    if (s6.f13453c == 0) {
                        if (dVar != null && dVar.f13452b != s6.f13452b) {
                            hVar.f13482i = s6;
                            break;
                        }
                    } else {
                        hVar.f13482i = s6;
                        hVar.f13476c.clear();
                        hVar.f13477d.clear();
                        hVar.f13478e.clear();
                        break;
                    }
                }
                break;
            case 17:
                d dVar2 = hVar.f13482i;
                if (h7 == hVar.f13474a && dVar2 != null) {
                    f t6 = t(c1143y, h8);
                    if (dVar2.f13453c == 0 && (fVar = (f) hVar.f13476c.get(t6.f13457a)) != null) {
                        t6.a(fVar);
                    }
                    hVar.f13476c.put(t6.f13457a, t6);
                    break;
                }
                break;
            case 18:
                if (h7 != hVar.f13474a) {
                    if (h7 == hVar.f13475b) {
                        C0189a p6 = p(c1143y, h8);
                        hVar.f13479f.put(p6.f13437a, p6);
                        break;
                    }
                } else {
                    C0189a p7 = p(c1143y, h8);
                    hVar.f13477d.put(p7.f13437a, p7);
                    break;
                }
                break;
            case 19:
                if (h7 != hVar.f13474a) {
                    if (h7 == hVar.f13475b) {
                        c r6 = r(c1143y);
                        hVar.f13480g.put(r6.f13447a, r6);
                        break;
                    }
                } else {
                    c r7 = r(c1143y);
                    hVar.f13478e.put(r7.f13447a, r7);
                    break;
                }
                break;
            case 20:
                if (h7 == hVar.f13474a) {
                    hVar.f13481h = q(c1143y);
                    break;
                }
                break;
        }
        c1143y.s(d6 - c1143y.d());
    }

    @Override // b2.s
    public void a() {
        this.f13435f.a();
    }

    @Override // b2.s
    public void c(byte[] bArr, int i6, int i7, s.b bVar, InterfaceC1125g interfaceC1125g) {
        C1143y c1143y = new C1143y(bArr, i7 + i6);
        c1143y.p(i6);
        interfaceC1125g.accept(o(c1143y));
    }

    @Override // b2.s
    public int d() {
        return 2;
    }

    public final C1081e o(C1143y c1143y) {
        SparseArray sparseArray;
        int i6;
        while (c1143y.b() >= 48 && c1143y.h(8) == 15) {
            u(c1143y, this.f13435f);
        }
        h hVar = this.f13435f;
        d dVar = hVar.f13482i;
        if (dVar == null) {
            return new C1081e(w.w(), -9223372036854775807L, -9223372036854775807L);
        }
        b bVar = hVar.f13481h;
        if (bVar == null) {
            bVar = this.f13433d;
        }
        Bitmap bitmap = this.f13436g;
        if (bitmap == null || bVar.f13441a + 1 != bitmap.getWidth() || bVar.f13442b + 1 != this.f13436g.getHeight()) {
            Bitmap createBitmap = Bitmap.createBitmap(bVar.f13441a + 1, bVar.f13442b + 1, Bitmap.Config.ARGB_8888);
            this.f13436g = createBitmap;
            this.f13432c.setBitmap(createBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray2 = dVar.f13454d;
        int i7 = 0;
        while (i7 < sparseArray2.size()) {
            this.f13432c.save();
            e eVar = (e) sparseArray2.valueAt(i7);
            f fVar = (f) this.f13435f.f13476c.get(sparseArray2.keyAt(i7));
            int i8 = eVar.f13455a + bVar.f13443c;
            int i9 = eVar.f13456b + bVar.f13445e;
            this.f13432c.clipRect(i8, i9, Math.min(fVar.f13459c + i8, bVar.f13444d), Math.min(fVar.f13460d + i9, bVar.f13446f));
            C0189a c0189a = (C0189a) this.f13435f.f13477d.get(fVar.f13463g);
            if (c0189a == null && (c0189a = (C0189a) this.f13435f.f13479f.get(fVar.f13463g)) == null) {
                c0189a = this.f13434e;
            }
            C0189a c0189a2 = c0189a;
            SparseArray sparseArray3 = fVar.f13467k;
            int i10 = 0;
            while (i10 < sparseArray3.size()) {
                int keyAt = sparseArray3.keyAt(i10);
                g gVar = (g) sparseArray3.valueAt(i10);
                c cVar = (c) this.f13435f.f13478e.get(keyAt);
                if (cVar == null) {
                    cVar = (c) this.f13435f.f13480g.get(keyAt);
                }
                if (cVar != null) {
                    sparseArray = sparseArray2;
                    i6 = i10;
                    n(cVar, c0189a2, fVar.f13462f, gVar.f13470c + i8, gVar.f13471d + i9, cVar.f13448b ? null : this.f13430a, this.f13432c);
                } else {
                    sparseArray = sparseArray2;
                    i6 = i10;
                }
                i10 = i6 + 1;
                sparseArray2 = sparseArray;
            }
            SparseArray sparseArray4 = sparseArray2;
            if (fVar.f13458b) {
                int i11 = fVar.f13462f;
                this.f13431b.setColor(i11 == 3 ? c0189a2.f13440d[fVar.f13464h] : i11 == 2 ? c0189a2.f13439c[fVar.f13465i] : c0189a2.f13438b[fVar.f13466j]);
                this.f13432c.drawRect(i8, i9, fVar.f13459c + i8, fVar.f13460d + i9, this.f13431b);
            }
            arrayList.add(new C1076a.b().f(Bitmap.createBitmap(this.f13436g, i8, i9, fVar.f13459c, fVar.f13460d)).k(i8 / bVar.f13441a).l(0).h(i9 / bVar.f13442b, 0).i(0).n(fVar.f13459c / bVar.f13441a).g(fVar.f13460d / bVar.f13442b).a());
            this.f13432c.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f13432c.restore();
            i7++;
            sparseArray2 = sparseArray4;
        }
        return new C1081e(arrayList, -9223372036854775807L, -9223372036854775807L);
    }
}
