package s2;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import kotlin.io.ConstantsKt;

/* renamed from: s2.c, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC2058c {
    public static int a(int i6) {
        return ((i6 + 7) & (-8)) / 8;
    }

    public static byte[] b(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static RuntimeException c(String str) {
        return new IllegalStateException(str);
    }

    public static byte[] d(InputStream inputStream, int i6) {
        byte[] bArr = new byte[i6];
        int i7 = 0;
        while (i7 < i6) {
            int read = inputStream.read(bArr, i7, i6 - i7);
            if (read < 0) {
                throw c("Not enough bytes to read: " + i6);
            }
            i7 += read;
        }
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        if (r0.finished() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0067, code lost:
    
        throw c("Inflater did not finish");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] e(java.io.InputStream r8, int r9, int r10) {
        /*
            java.util.zip.Inflater r0 = new java.util.zip.Inflater
            r0.<init>()
            byte[] r1 = new byte[r10]     // Catch: java.lang.Throwable -> L2e
            r2 = 2048(0x800, float:2.87E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L2e
            r3 = 0
            r4 = r3
            r5 = r4
        Le:
            boolean r6 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L55
            boolean r6 = r0.needsDictionary()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L55
            if (r4 >= r9) goto L55
            int r6 = r8.read(r2)     // Catch: java.lang.Throwable -> L2e
            if (r6 < 0) goto L3a
            r0.setInput(r2, r3, r6)     // Catch: java.lang.Throwable -> L2e
            int r7 = r10 - r5
            int r7 = r0.inflate(r1, r5, r7)     // Catch: java.lang.Throwable -> L2e java.util.zip.DataFormatException -> L30
            int r5 = r5 + r7
            int r4 = r4 + r6
            goto Le
        L2e:
            r8 = move-exception
            goto L86
        L30:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L2e
            java.lang.RuntimeException r8 = c(r8)     // Catch: java.lang.Throwable -> L2e
            throw r8     // Catch: java.lang.Throwable -> L2e
        L3a:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "Invalid zip data. Stream ended after $totalBytesRead bytes. Expected "
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = " bytes"
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.RuntimeException r8 = c(r8)     // Catch: java.lang.Throwable -> L2e
            throw r8     // Catch: java.lang.Throwable -> L2e
        L55:
            if (r4 != r9) goto L68
            boolean r8 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r8 == 0) goto L61
            r0.end()
            return r1
        L61:
            java.lang.String r8 = "Inflater did not finish"
            java.lang.RuntimeException r8 = c(r8)     // Catch: java.lang.Throwable -> L2e
            throw r8     // Catch: java.lang.Throwable -> L2e
        L68:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "Didn't read enough bytes during decompression. expected="
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = " actual="
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            r8.append(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.RuntimeException r8 = c(r8)     // Catch: java.lang.Throwable -> L2e
            throw r8     // Catch: java.lang.Throwable -> L2e
        L86:
            r0.end()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: s2.AbstractC2058c.e(java.io.InputStream, int, int):byte[]");
    }

    public static String f(InputStream inputStream, int i6) {
        return new String(d(inputStream, i6), StandardCharsets.UTF_8);
    }

    public static long g(InputStream inputStream, int i6) {
        byte[] d6 = d(inputStream, i6);
        long j6 = 0;
        for (int i7 = 0; i7 < i6; i7++) {
            j6 += (d6[i7] & 255) << (i7 * 8);
        }
        return j6;
    }

    public static int h(InputStream inputStream) {
        return (int) g(inputStream, 2);
    }

    public static long i(InputStream inputStream) {
        return g(inputStream, 4);
    }

    public static int j(InputStream inputStream) {
        return (int) g(inputStream, 1);
    }

    public static int k(String str) {
        return str.getBytes(StandardCharsets.UTF_8).length;
    }

    public static void l(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[ConstantsKt.MINIMUM_BLOCK_SIZE];
        while (true) {
            int read = inputStream.read(bArr);
            if (read <= 0) {
                return;
            } else {
                outputStream.write(bArr, 0, read);
            }
        }
    }

    public static void m(OutputStream outputStream, byte[] bArr) {
        q(outputStream, bArr.length);
        byte[] b6 = b(bArr);
        q(outputStream, b6.length);
        outputStream.write(b6);
    }

    public static void n(OutputStream outputStream, String str) {
        outputStream.write(str.getBytes(StandardCharsets.UTF_8));
    }

    public static void o(OutputStream outputStream, long j6, int i6) {
        byte[] bArr = new byte[i6];
        for (int i7 = 0; i7 < i6; i7++) {
            bArr[i7] = (byte) ((j6 >> (i7 * 8)) & 255);
        }
        outputStream.write(bArr);
    }

    public static void p(OutputStream outputStream, int i6) {
        o(outputStream, i6, 2);
    }

    public static void q(OutputStream outputStream, long j6) {
        o(outputStream, j6, 4);
    }

    public static void r(OutputStream outputStream, int i6) {
        o(outputStream, i6, 1);
    }
}
