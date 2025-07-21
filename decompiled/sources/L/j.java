package L;

import L.i;
import java.io.BufferedOutputStream;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class j extends FilterOutputStream {

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f3068g = "Exif\u0000\u0000".getBytes(h.f3034e);

    /* renamed from: a, reason: collision with root package name */
    public final i f3069a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f3070b;

    /* renamed from: c, reason: collision with root package name */
    public final ByteBuffer f3071c;

    /* renamed from: d, reason: collision with root package name */
    public int f3072d;

    /* renamed from: e, reason: collision with root package name */
    public int f3073e;

    /* renamed from: f, reason: collision with root package name */
    public int f3074f;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {
        public static boolean a(short s6) {
            return (s6 < -64 || s6 > -49 || s6 == -60 || s6 == -56 || s6 == -52) ? false : true;
        }
    }

    public j(OutputStream outputStream, i iVar) {
        super(new BufferedOutputStream(outputStream, 65536));
        this.f3070b = new byte[1];
        this.f3071c = ByteBuffer.allocate(4);
        this.f3072d = 0;
        this.f3069a = iVar;
    }

    public final int a(int i6, byte[] bArr, int i7, int i8) {
        int min = Math.min(i8, i6 - this.f3071c.position());
        this.f3071c.put(bArr, i7, min);
        return min;
    }

    public final void c(b bVar) {
        k[][] kVarArr = i.f3048i;
        int[] iArr = new int[kVarArr.length];
        int[] iArr2 = new int[kVarArr.length];
        for (k kVar : i.f3046g) {
            for (int i6 = 0; i6 < i.f3048i.length; i6++) {
                this.f3069a.c(i6).remove(kVar.f3076b);
            }
        }
        if (!this.f3069a.c(1).isEmpty()) {
            this.f3069a.c(0).put(i.f3046g[1].f3076b, h.f(0L, this.f3069a.d()));
        }
        if (!this.f3069a.c(2).isEmpty()) {
            this.f3069a.c(0).put(i.f3046g[2].f3076b, h.f(0L, this.f3069a.d()));
        }
        if (!this.f3069a.c(3).isEmpty()) {
            this.f3069a.c(1).put(i.f3046g[3].f3076b, h.f(0L, this.f3069a.d()));
        }
        for (int i7 = 0; i7 < i.f3048i.length; i7++) {
            Iterator it = this.f3069a.c(i7).entrySet().iterator();
            int i8 = 0;
            while (it.hasNext()) {
                int j6 = ((h) ((Map.Entry) it.next()).getValue()).j();
                if (j6 > 4) {
                    i8 += j6;
                }
            }
            iArr2[i7] = iArr2[i7] + i8;
        }
        int i9 = 8;
        for (int i10 = 0; i10 < i.f3048i.length; i10++) {
            if (!this.f3069a.c(i10).isEmpty()) {
                iArr[i10] = i9;
                i9 += (this.f3069a.c(i10).size() * 12) + 6 + iArr2[i10];
            }
        }
        int i11 = i9 + 8;
        if (!this.f3069a.c(1).isEmpty()) {
            this.f3069a.c(0).put(i.f3046g[1].f3076b, h.f(iArr[1], this.f3069a.d()));
        }
        if (!this.f3069a.c(2).isEmpty()) {
            this.f3069a.c(0).put(i.f3046g[2].f3076b, h.f(iArr[2], this.f3069a.d()));
        }
        if (!this.f3069a.c(3).isEmpty()) {
            this.f3069a.c(1).put(i.f3046g[3].f3076b, h.f(iArr[3], this.f3069a.d()));
        }
        bVar.R(i11);
        bVar.write(f3068g);
        bVar.I(this.f3069a.d() == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        bVar.a(this.f3069a.d());
        bVar.R(42);
        bVar.P(8L);
        for (int i12 = 0; i12 < i.f3048i.length; i12++) {
            if (!this.f3069a.c(i12).isEmpty()) {
                bVar.R(this.f3069a.c(i12).size());
                int size = iArr[i12] + 2 + (this.f3069a.c(i12).size() * 12) + 4;
                for (Map.Entry entry : this.f3069a.c(i12).entrySet()) {
                    int i13 = ((k) y0.g.g((k) ((HashMap) i.b.f3057f.get(i12)).get(entry.getKey()), "Tag not supported: " + ((String) entry.getKey()) + ". Tag needs to be ported from ExifInterface to ExifData.")).f3075a;
                    h hVar = (h) entry.getValue();
                    int j7 = hVar.j();
                    bVar.R(i13);
                    bVar.R(hVar.f3038a);
                    bVar.D(hVar.f3039b);
                    if (j7 > 4) {
                        bVar.P(size);
                        size += j7;
                    } else {
                        bVar.write(hVar.f3041d);
                        if (j7 < 4) {
                            while (j7 < 4) {
                                bVar.c(0);
                                j7++;
                            }
                        }
                    }
                }
                bVar.P(0L);
                Iterator it2 = this.f3069a.c(i12).entrySet().iterator();
                while (it2.hasNext()) {
                    byte[] bArr = ((h) ((Map.Entry) it2.next()).getValue()).f3041d;
                    if (bArr.length > 4) {
                        bVar.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        bVar.a(ByteOrder.BIG_ENDIAN);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x010f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0108, code lost:
    
        if (r9 <= 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x010a, code lost:
    
        ((java.io.FilterOutputStream) r6).out.write(r7, r8, r9);
     */
    @Override // java.io.FilterOutputStream, java.io.OutputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void write(byte[] r7, int r8, int r9) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L.j.write(byte[], int, int):void");
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i6) {
        byte[] bArr = this.f3070b;
        bArr[0] = (byte) (i6 & 255);
        write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }
}
