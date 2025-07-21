package Q4;

import Q4.a;
import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.io.ConstantsKt;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class e implements a {

    /* renamed from: u, reason: collision with root package name */
    public static final String f4542u = "e";

    /* renamed from: a, reason: collision with root package name */
    public int[] f4543a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f4544b;

    /* renamed from: c, reason: collision with root package name */
    public final a.InterfaceC0077a f4545c;

    /* renamed from: d, reason: collision with root package name */
    public ByteBuffer f4546d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f4547e;

    /* renamed from: f, reason: collision with root package name */
    public short[] f4548f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f4549g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f4550h;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f4551i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f4552j;

    /* renamed from: k, reason: collision with root package name */
    public int f4553k;

    /* renamed from: l, reason: collision with root package name */
    public c f4554l;

    /* renamed from: m, reason: collision with root package name */
    public Bitmap f4555m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4556n;

    /* renamed from: o, reason: collision with root package name */
    public int f4557o;

    /* renamed from: p, reason: collision with root package name */
    public int f4558p;

    /* renamed from: q, reason: collision with root package name */
    public int f4559q;

    /* renamed from: r, reason: collision with root package name */
    public int f4560r;

    /* renamed from: s, reason: collision with root package name */
    public Boolean f4561s;

    /* renamed from: t, reason: collision with root package name */
    public Bitmap.Config f4562t;

    public e(a.InterfaceC0077a interfaceC0077a, c cVar, ByteBuffer byteBuffer, int i6) {
        this(interfaceC0077a);
        q(cVar, byteBuffer, i6);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e A[Catch: all -> 0x000e, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x003d, B:13:0x0047, B:15:0x004e, B:16:0x0058, B:18:0x0069, B:19:0x0075, B:22:0x007e, B:24:0x0082, B:26:0x008a, B:27:0x00a0, B:31:0x00a4, B:33:0x00a8, B:35:0x00ba, B:37:0x00be, B:38:0x00c2, B:41:0x007a, B:43:0x00c8, B:45:0x00d0, B:48:0x0011, B:50:0x0019, B:51:0x003b), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069 A[Catch: all -> 0x000e, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x003d, B:13:0x0047, B:15:0x004e, B:16:0x0058, B:18:0x0069, B:19:0x0075, B:22:0x007e, B:24:0x0082, B:26:0x008a, B:27:0x00a0, B:31:0x00a4, B:33:0x00a8, B:35:0x00ba, B:37:0x00be, B:38:0x00c2, B:41:0x007a, B:43:0x00c8, B:45:0x00d0, B:48:0x0011, B:50:0x0019, B:51:0x003b), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0082 A[Catch: all -> 0x000e, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x003d, B:13:0x0047, B:15:0x004e, B:16:0x0058, B:18:0x0069, B:19:0x0075, B:22:0x007e, B:24:0x0082, B:26:0x008a, B:27:0x00a0, B:31:0x00a4, B:33:0x00a8, B:35:0x00ba, B:37:0x00be, B:38:0x00c2, B:41:0x007a, B:43:0x00c8, B:45:0x00d0, B:48:0x0011, B:50:0x0019, B:51:0x003b), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a4 A[Catch: all -> 0x000e, TRY_ENTER, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x003d, B:13:0x0047, B:15:0x004e, B:16:0x0058, B:18:0x0069, B:19:0x0075, B:22:0x007e, B:24:0x0082, B:26:0x008a, B:27:0x00a0, B:31:0x00a4, B:33:0x00a8, B:35:0x00ba, B:37:0x00be, B:38:0x00c2, B:41:0x007a, B:43:0x00c8, B:45:0x00d0, B:48:0x0011, B:50:0x0019, B:51:0x003b), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007a A[Catch: all -> 0x000e, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x003d, B:13:0x0047, B:15:0x004e, B:16:0x0058, B:18:0x0069, B:19:0x0075, B:22:0x007e, B:24:0x0082, B:26:0x008a, B:27:0x00a0, B:31:0x00a4, B:33:0x00a8, B:35:0x00ba, B:37:0x00be, B:38:0x00c2, B:41:0x007a, B:43:0x00c8, B:45:0x00d0, B:48:0x0011, B:50:0x0019, B:51:0x003b), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d0 A[Catch: all -> 0x000e, TRY_LEAVE, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x003d, B:13:0x0047, B:15:0x004e, B:16:0x0058, B:18:0x0069, B:19:0x0075, B:22:0x007e, B:24:0x0082, B:26:0x008a, B:27:0x00a0, B:31:0x00a4, B:33:0x00a8, B:35:0x00ba, B:37:0x00be, B:38:0x00c2, B:41:0x007a, B:43:0x00c8, B:45:0x00d0, B:48:0x0011, B:50:0x0019, B:51:0x003b), top: B:2:0x0001 }] */
    @Override // Q4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized android.graphics.Bitmap a() {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q4.e.a():android.graphics.Bitmap");
    }

    @Override // Q4.a
    public void b() {
        this.f4553k = (this.f4553k + 1) % this.f4554l.f4527c;
    }

    @Override // Q4.a
    public int c() {
        return this.f4554l.f4527c;
    }

    @Override // Q4.a
    public void clear() {
        this.f4554l = null;
        byte[] bArr = this.f4551i;
        if (bArr != null) {
            this.f4545c.d(bArr);
        }
        int[] iArr = this.f4552j;
        if (iArr != null) {
            this.f4545c.f(iArr);
        }
        Bitmap bitmap = this.f4555m;
        if (bitmap != null) {
            this.f4545c.c(bitmap);
        }
        this.f4555m = null;
        this.f4546d = null;
        this.f4561s = null;
        byte[] bArr2 = this.f4547e;
        if (bArr2 != null) {
            this.f4545c.d(bArr2);
        }
    }

    @Override // Q4.a
    public int d() {
        int i6;
        if (this.f4554l.f4527c <= 0 || (i6 = this.f4553k) < 0) {
            return 0;
        }
        return m(i6);
    }

    @Override // Q4.a
    public void e(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.f4562t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    @Override // Q4.a
    public void f() {
        this.f4553k = -1;
    }

    @Override // Q4.a
    public int g() {
        return this.f4553k;
    }

    @Override // Q4.a
    public ByteBuffer getData() {
        return this.f4546d;
    }

    @Override // Q4.a
    public int h() {
        return this.f4546d.limit() + this.f4551i.length + (this.f4552j.length * 4);
    }

    public final int i(int i6, int i7, int i8) {
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = i6; i14 < this.f4558p + i6; i14++) {
            byte[] bArr = this.f4551i;
            if (i14 >= bArr.length || i14 >= i7) {
                break;
            }
            int i15 = this.f4543a[bArr[i14] & 255];
            if (i15 != 0) {
                i9 += (i15 >> 24) & 255;
                i10 += (i15 >> 16) & 255;
                i11 += (i15 >> 8) & 255;
                i12 += i15 & 255;
                i13++;
            }
        }
        int i16 = i6 + i8;
        for (int i17 = i16; i17 < this.f4558p + i16; i17++) {
            byte[] bArr2 = this.f4551i;
            if (i17 >= bArr2.length || i17 >= i7) {
                break;
            }
            int i18 = this.f4543a[bArr2[i17] & 255];
            if (i18 != 0) {
                i9 += (i18 >> 24) & 255;
                i10 += (i18 >> 16) & 255;
                i11 += (i18 >> 8) & 255;
                i12 += i18 & 255;
                i13++;
            }
        }
        if (i13 == 0) {
            return 0;
        }
        return ((i9 / i13) << 24) | ((i10 / i13) << 16) | ((i11 / i13) << 8) | (i12 / i13);
    }

    public final void j(b bVar) {
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr = this.f4552j;
        int i10 = bVar.f4517d;
        int i11 = this.f4558p;
        int i12 = i10 / i11;
        int i13 = bVar.f4515b / i11;
        int i14 = bVar.f4516c / i11;
        int i15 = bVar.f4514a / i11;
        boolean z6 = this.f4553k == 0;
        int i16 = this.f4560r;
        int i17 = this.f4559q;
        byte[] bArr = this.f4551i;
        int[] iArr2 = this.f4543a;
        Boolean bool = this.f4561s;
        int i18 = 8;
        int i19 = 0;
        int i20 = 0;
        int i21 = 1;
        while (i20 < i12) {
            int[] iArr3 = iArr;
            if (bVar.f4518e) {
                if (i19 >= i12) {
                    int i22 = i21 + 1;
                    i6 = i12;
                    if (i22 == 2) {
                        i21 = i22;
                        i19 = 4;
                    } else if (i22 == 3) {
                        i21 = i22;
                        i18 = 4;
                        i19 = 2;
                    } else if (i22 != 4) {
                        i21 = i22;
                    } else {
                        i21 = i22;
                        i19 = 1;
                        i18 = 2;
                    }
                } else {
                    i6 = i12;
                }
                i7 = i19 + i18;
            } else {
                i6 = i12;
                i7 = i19;
                i19 = i20;
            }
            int i23 = i19 + i13;
            boolean z7 = i11 == 1;
            if (i23 < i17) {
                int i24 = i23 * i16;
                int i25 = i24 + i15;
                int i26 = i25 + i14;
                int i27 = i24 + i16;
                if (i27 < i26) {
                    i26 = i27;
                }
                i8 = i7;
                int i28 = i20 * i11 * bVar.f4516c;
                if (z7) {
                    int i29 = i25;
                    while (i29 < i26) {
                        int i30 = i29;
                        int i31 = iArr2[bArr[i28] & 255];
                        if (i31 != 0) {
                            iArr3[i30] = i31;
                        } else if (z6 && bool == null) {
                            bool = Boolean.TRUE;
                        }
                        i28 += i11;
                        i29 = i30 + 1;
                    }
                } else {
                    int i32 = ((i26 - i25) * i11) + i28;
                    i9 = i11;
                    int i33 = i25;
                    while (i33 < i26) {
                        int i34 = i26;
                        int i35 = i(i28, i32, bVar.f4516c);
                        if (i35 != 0) {
                            iArr3[i33] = i35;
                        } else if (z6 && bool == null) {
                            bool = Boolean.TRUE;
                        }
                        i28 += i9;
                        i33++;
                        i26 = i34;
                    }
                    i20++;
                    i11 = i9;
                    iArr = iArr3;
                    i12 = i6;
                    i19 = i8;
                }
            } else {
                i8 = i7;
            }
            i9 = i11;
            i20++;
            i11 = i9;
            iArr = iArr3;
            i12 = i6;
            i19 = i8;
        }
        if (this.f4561s == null) {
            this.f4561s = Boolean.valueOf(bool == null ? false : bool.booleanValue());
        }
    }

    public final void k(b bVar) {
        b bVar2 = bVar;
        int[] iArr = this.f4552j;
        int i6 = bVar2.f4517d;
        int i7 = bVar2.f4515b;
        int i8 = bVar2.f4516c;
        int i9 = bVar2.f4514a;
        boolean z6 = this.f4553k == 0;
        int i10 = this.f4560r;
        byte[] bArr = this.f4551i;
        int[] iArr2 = this.f4543a;
        int i11 = 0;
        byte b6 = -1;
        while (i11 < i6) {
            int i12 = (i11 + i7) * i10;
            int i13 = i12 + i9;
            int i14 = i13 + i8;
            int i15 = i12 + i10;
            if (i15 < i14) {
                i14 = i15;
            }
            int i16 = bVar2.f4516c * i11;
            int i17 = i13;
            while (i17 < i14) {
                byte b7 = bArr[i16];
                int[] iArr3 = iArr;
                int i18 = b7 & 255;
                if (i18 != b6) {
                    int i19 = iArr2[i18];
                    if (i19 != 0) {
                        iArr3[i17] = i19;
                    } else {
                        b6 = b7;
                    }
                }
                i16++;
                i17++;
                iArr = iArr3;
            }
            i11++;
            bVar2 = bVar;
        }
        Boolean bool = this.f4561s;
        this.f4561s = Boolean.valueOf((bool != null && bool.booleanValue()) || (this.f4561s == null && z6 && b6 != -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v15, types: [short] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final void l(b bVar) {
        int i6;
        int i7;
        byte[] bArr;
        short s6;
        e eVar = this;
        if (bVar != null) {
            eVar.f4546d.position(bVar.f4523j);
        }
        if (bVar == null) {
            c cVar = eVar.f4554l;
            i6 = cVar.f4530f;
            i7 = cVar.f4531g;
        } else {
            i6 = bVar.f4516c;
            i7 = bVar.f4517d;
        }
        int i8 = i6 * i7;
        byte[] bArr2 = eVar.f4551i;
        if (bArr2 == null || bArr2.length < i8) {
            eVar.f4551i = eVar.f4545c.e(i8);
        }
        byte[] bArr3 = eVar.f4551i;
        if (eVar.f4548f == null) {
            eVar.f4548f = new short[ConstantsKt.DEFAULT_BLOCK_SIZE];
        }
        short[] sArr = eVar.f4548f;
        if (eVar.f4549g == null) {
            eVar.f4549g = new byte[ConstantsKt.DEFAULT_BLOCK_SIZE];
        }
        byte[] bArr4 = eVar.f4549g;
        if (eVar.f4550h == null) {
            eVar.f4550h = new byte[4097];
        }
        byte[] bArr5 = eVar.f4550h;
        int p6 = eVar.p();
        int i9 = 1 << p6;
        int i10 = i9 + 1;
        int i11 = i9 + 2;
        int i12 = p6 + 1;
        int i13 = (1 << i12) - 1;
        byte b6 = 0;
        for (int i14 = 0; i14 < i9; i14++) {
            sArr[i14] = 0;
            bArr4[i14] = (byte) i14;
        }
        byte[] bArr6 = eVar.f4547e;
        int i15 = i12;
        int i16 = i11;
        int i17 = i13;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = -1;
        while (true) {
            if (i18 >= i8) {
                break;
            }
            if (i19 == 0) {
                i19 = eVar.o();
                if (i19 <= 0) {
                    eVar.f4557o = 3;
                    break;
                }
                i20 = b6;
            }
            i22 += (bArr6[i20] & 255) << i21;
            i20++;
            i19--;
            int i27 = i21 + 8;
            int i28 = i16;
            int i29 = i15;
            int i30 = i26;
            short[] sArr2 = sArr;
            int i31 = i24;
            while (true) {
                bArr = bArr4;
                if (i27 < i29) {
                    i16 = i28;
                    i24 = i31;
                    break;
                }
                int i32 = i22 & i17;
                i22 >>= i29;
                i27 -= i29;
                if (i32 == i9) {
                    i29 = i12;
                    i28 = i11;
                    i17 = i13;
                    bArr4 = bArr;
                    i30 = -1;
                } else {
                    if (i32 == i10) {
                        i24 = i31;
                        i16 = i28;
                        break;
                    }
                    byte[] bArr7 = bArr5;
                    if (i30 == -1) {
                        bArr3[i23] = bArr[i32];
                        i23++;
                        i18++;
                        i30 = i32;
                        i31 = i30;
                        bArr4 = bArr;
                        bArr5 = bArr7;
                    } else {
                        if (i32 >= i28) {
                            bArr7[i25] = (byte) i31;
                            i25++;
                            s6 = i30;
                        } else {
                            s6 = i32;
                        }
                        while (s6 >= i9) {
                            bArr7[i25] = bArr[s6];
                            i25++;
                            s6 = sArr2[s6];
                        }
                        int i33 = bArr[s6] & 255;
                        byte b7 = (byte) i33;
                        bArr3[i23] = b7;
                        while (true) {
                            i23++;
                            i18++;
                            if (i25 <= 0) {
                                break;
                            }
                            i25--;
                            bArr3[i23] = bArr7[i25];
                        }
                        if (i28 < 4096) {
                            sArr2[i28] = (short) i30;
                            bArr[i28] = b7;
                            i28++;
                            if ((i28 & i17) == 0 && i28 < 4096) {
                                i29++;
                                i17 += i28;
                            }
                        }
                        i30 = i32;
                        bArr4 = bArr;
                        bArr5 = bArr7;
                        i31 = i33;
                    }
                }
            }
            i21 = i27;
            sArr = sArr2;
            bArr4 = bArr;
            b6 = 0;
            i26 = i30;
            i15 = i29;
            eVar = this;
        }
        Arrays.fill(bArr3, i23, i8, b6);
    }

    public int m(int i6) {
        if (i6 < 0) {
            return -1;
        }
        c cVar = this.f4554l;
        if (i6 < cVar.f4527c) {
            return ((b) cVar.f4529e.get(i6)).f4522i;
        }
        return -1;
    }

    public final Bitmap n() {
        Boolean bool = this.f4561s;
        Bitmap a6 = this.f4545c.a(this.f4560r, this.f4559q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f4562t);
        a6.setHasAlpha(true);
        return a6;
    }

    public final int o() {
        int p6 = p();
        if (p6 <= 0) {
            return p6;
        }
        ByteBuffer byteBuffer = this.f4546d;
        byteBuffer.get(this.f4547e, 0, Math.min(p6, byteBuffer.remaining()));
        return p6;
    }

    public final int p() {
        return this.f4546d.get() & 255;
    }

    public synchronized void q(c cVar, ByteBuffer byteBuffer, int i6) {
        try {
            if (i6 <= 0) {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i6);
            }
            int highestOneBit = Integer.highestOneBit(i6);
            this.f4557o = 0;
            this.f4554l = cVar;
            this.f4553k = -1;
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f4546d = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            this.f4546d.order(ByteOrder.LITTLE_ENDIAN);
            this.f4556n = false;
            Iterator it = cVar.f4529e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((b) it.next()).f4520g == 3) {
                    this.f4556n = true;
                    break;
                }
            }
            this.f4558p = highestOneBit;
            int i7 = cVar.f4530f;
            this.f4560r = i7 / highestOneBit;
            int i8 = cVar.f4531g;
            this.f4559q = i8 / highestOneBit;
            this.f4551i = this.f4545c.e(i7 * i8);
            this.f4552j = this.f4545c.b(this.f4560r * this.f4559q);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final Bitmap r(b bVar, b bVar2) {
        int i6;
        int i7;
        Bitmap bitmap;
        int[] iArr = this.f4552j;
        int i8 = 0;
        if (bVar2 == null) {
            Bitmap bitmap2 = this.f4555m;
            if (bitmap2 != null) {
                this.f4545c.c(bitmap2);
            }
            this.f4555m = null;
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && bVar2.f4520g == 3 && this.f4555m == null) {
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && (i7 = bVar2.f4520g) > 0) {
            if (i7 == 2) {
                if (!bVar.f4519f) {
                    c cVar = this.f4554l;
                    int i9 = cVar.f4536l;
                    if (bVar.f4524k == null || cVar.f4534j != bVar.f4521h) {
                        i8 = i9;
                    }
                }
                int i10 = bVar2.f4517d;
                int i11 = this.f4558p;
                int i12 = i10 / i11;
                int i13 = bVar2.f4515b / i11;
                int i14 = bVar2.f4516c / i11;
                int i15 = bVar2.f4514a / i11;
                int i16 = this.f4560r;
                int i17 = (i13 * i16) + i15;
                int i18 = (i12 * i16) + i17;
                while (i17 < i18) {
                    int i19 = i17 + i14;
                    for (int i20 = i17; i20 < i19; i20++) {
                        iArr[i20] = i8;
                    }
                    i17 += this.f4560r;
                }
            } else if (i7 == 3 && (bitmap = this.f4555m) != null) {
                int i21 = this.f4560r;
                bitmap.getPixels(iArr, 0, i21, 0, 0, i21, this.f4559q);
            }
        }
        l(bVar);
        if (bVar.f4518e || this.f4558p != 1) {
            j(bVar);
        } else {
            k(bVar);
        }
        if (this.f4556n && ((i6 = bVar.f4520g) == 0 || i6 == 1)) {
            if (this.f4555m == null) {
                this.f4555m = n();
            }
            Bitmap bitmap3 = this.f4555m;
            int i22 = this.f4560r;
            bitmap3.setPixels(iArr, 0, i22, 0, 0, i22, this.f4559q);
        }
        Bitmap n6 = n();
        int i23 = this.f4560r;
        n6.setPixels(iArr, 0, i23, 0, 0, i23, this.f4559q);
        return n6;
    }

    public e(a.InterfaceC0077a interfaceC0077a) {
        this.f4544b = new int[256];
        this.f4562t = Bitmap.Config.ARGB_8888;
        this.f4545c = interfaceC0077a;
        this.f4554l = new c();
    }
}
