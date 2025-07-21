package s2;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f18898a = {112, 114, 111, 0};

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f18899b = {112, 114, 109, 0};

    public static void A(InputStream inputStream) {
        AbstractC2058c.h(inputStream);
        int j6 = AbstractC2058c.j(inputStream);
        if (j6 == 6 || j6 == 7) {
            return;
        }
        while (j6 > 0) {
            AbstractC2058c.j(inputStream);
            for (int j7 = AbstractC2058c.j(inputStream); j7 > 0; j7--) {
                AbstractC2058c.h(inputStream);
            }
            j6--;
        }
    }

    public static boolean B(OutputStream outputStream, byte[] bArr, C2057b[] c2057bArr) {
        if (Arrays.equals(bArr, l.f18900a)) {
            N(outputStream, c2057bArr);
            return true;
        }
        if (Arrays.equals(bArr, l.f18901b)) {
            M(outputStream, c2057bArr);
            return true;
        }
        if (Arrays.equals(bArr, l.f18903d)) {
            K(outputStream, c2057bArr);
            return true;
        }
        if (Arrays.equals(bArr, l.f18902c)) {
            L(outputStream, c2057bArr);
            return true;
        }
        if (!Arrays.equals(bArr, l.f18904e)) {
            return false;
        }
        J(outputStream, c2057bArr);
        return true;
    }

    public static void C(OutputStream outputStream, C2057b c2057b) {
        int[] iArr = c2057b.f18881h;
        int length = iArr.length;
        int i6 = 0;
        int i7 = 0;
        while (i6 < length) {
            int i8 = iArr[i6];
            AbstractC2058c.p(outputStream, i8 - i7);
            i6++;
            i7 = i8;
        }
    }

    public static m D(C2057b[] c2057bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            AbstractC2058c.p(byteArrayOutputStream, c2057bArr.length);
            int i6 = 2;
            for (C2057b c2057b : c2057bArr) {
                AbstractC2058c.q(byteArrayOutputStream, c2057b.f18876c);
                AbstractC2058c.q(byteArrayOutputStream, c2057b.f18877d);
                AbstractC2058c.q(byteArrayOutputStream, c2057b.f18880g);
                String j6 = j(c2057b.f18874a, c2057b.f18875b, l.f18900a);
                int k6 = AbstractC2058c.k(j6);
                AbstractC2058c.p(byteArrayOutputStream, k6);
                i6 = i6 + 14 + k6;
                AbstractC2058c.n(byteArrayOutputStream, j6);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (i6 == byteArray.length) {
                m mVar = new m(EnumC2059d.DEX_FILES, i6, byteArray, false);
                byteArrayOutputStream.close();
                return mVar;
            }
            throw AbstractC2058c.c("Expected size " + i6 + ", does not match actual size " + byteArray.length);
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void E(OutputStream outputStream, byte[] bArr) {
        outputStream.write(f18898a);
        outputStream.write(bArr);
    }

    public static void F(OutputStream outputStream, C2057b c2057b) {
        I(outputStream, c2057b);
        C(outputStream, c2057b);
        H(outputStream, c2057b);
    }

    public static void G(OutputStream outputStream, C2057b c2057b, String str) {
        AbstractC2058c.p(outputStream, AbstractC2058c.k(str));
        AbstractC2058c.p(outputStream, c2057b.f18878e);
        AbstractC2058c.q(outputStream, c2057b.f18879f);
        AbstractC2058c.q(outputStream, c2057b.f18876c);
        AbstractC2058c.q(outputStream, c2057b.f18880g);
        AbstractC2058c.n(outputStream, str);
    }

    public static void H(OutputStream outputStream, C2057b c2057b) {
        byte[] bArr = new byte[k(c2057b.f18880g)];
        for (Map.Entry entry : c2057b.f18882i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                z(bArr, 2, intValue, c2057b);
            }
            if ((intValue2 & 4) != 0) {
                z(bArr, 4, intValue, c2057b);
            }
        }
        outputStream.write(bArr);
    }

    public static void I(OutputStream outputStream, C2057b c2057b) {
        int i6 = 0;
        for (Map.Entry entry : c2057b.f18882i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                AbstractC2058c.p(outputStream, intValue - i6);
                AbstractC2058c.p(outputStream, 0);
                i6 = intValue;
            }
        }
    }

    public static void J(OutputStream outputStream, C2057b[] c2057bArr) {
        AbstractC2058c.p(outputStream, c2057bArr.length);
        for (C2057b c2057b : c2057bArr) {
            String j6 = j(c2057b.f18874a, c2057b.f18875b, l.f18904e);
            AbstractC2058c.p(outputStream, AbstractC2058c.k(j6));
            AbstractC2058c.p(outputStream, c2057b.f18882i.size());
            AbstractC2058c.p(outputStream, c2057b.f18881h.length);
            AbstractC2058c.q(outputStream, c2057b.f18876c);
            AbstractC2058c.n(outputStream, j6);
            Iterator it = c2057b.f18882i.keySet().iterator();
            while (it.hasNext()) {
                AbstractC2058c.p(outputStream, ((Integer) it.next()).intValue());
            }
            for (int i6 : c2057b.f18881h) {
                AbstractC2058c.p(outputStream, i6);
            }
        }
    }

    public static void K(OutputStream outputStream, C2057b[] c2057bArr) {
        AbstractC2058c.r(outputStream, c2057bArr.length);
        for (C2057b c2057b : c2057bArr) {
            int size = c2057b.f18882i.size() * 4;
            String j6 = j(c2057b.f18874a, c2057b.f18875b, l.f18903d);
            AbstractC2058c.p(outputStream, AbstractC2058c.k(j6));
            AbstractC2058c.p(outputStream, c2057b.f18881h.length);
            AbstractC2058c.q(outputStream, size);
            AbstractC2058c.q(outputStream, c2057b.f18876c);
            AbstractC2058c.n(outputStream, j6);
            Iterator it = c2057b.f18882i.keySet().iterator();
            while (it.hasNext()) {
                AbstractC2058c.p(outputStream, ((Integer) it.next()).intValue());
                AbstractC2058c.p(outputStream, 0);
            }
            for (int i6 : c2057b.f18881h) {
                AbstractC2058c.p(outputStream, i6);
            }
        }
    }

    public static void L(OutputStream outputStream, C2057b[] c2057bArr) {
        byte[] b6 = b(c2057bArr, l.f18902c);
        AbstractC2058c.r(outputStream, c2057bArr.length);
        AbstractC2058c.m(outputStream, b6);
    }

    public static void M(OutputStream outputStream, C2057b[] c2057bArr) {
        byte[] b6 = b(c2057bArr, l.f18901b);
        AbstractC2058c.r(outputStream, c2057bArr.length);
        AbstractC2058c.m(outputStream, b6);
    }

    public static void N(OutputStream outputStream, C2057b[] c2057bArr) {
        O(outputStream, c2057bArr);
    }

    public static void O(OutputStream outputStream, C2057b[] c2057bArr) {
        int length;
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList.add(D(c2057bArr));
        arrayList.add(c(c2057bArr));
        arrayList.add(d(c2057bArr));
        long length2 = l.f18900a.length + f18898a.length + 4 + (arrayList.size() * 16);
        AbstractC2058c.q(outputStream, arrayList.size());
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            m mVar = (m) arrayList.get(i6);
            AbstractC2058c.q(outputStream, mVar.f18907a.b());
            AbstractC2058c.q(outputStream, length2);
            if (mVar.f18910d) {
                byte[] bArr = mVar.f18909c;
                long length3 = bArr.length;
                byte[] b6 = AbstractC2058c.b(bArr);
                arrayList2.add(b6);
                AbstractC2058c.q(outputStream, b6.length);
                AbstractC2058c.q(outputStream, length3);
                length = b6.length;
            } else {
                arrayList2.add(mVar.f18909c);
                AbstractC2058c.q(outputStream, mVar.f18909c.length);
                AbstractC2058c.q(outputStream, 0L);
                length = mVar.f18909c.length;
            }
            length2 += length;
        }
        for (int i7 = 0; i7 < arrayList2.size(); i7++) {
            outputStream.write((byte[]) arrayList2.get(i7));
        }
    }

    public static int a(C2057b c2057b) {
        Iterator it = c2057b.f18882i.entrySet().iterator();
        int i6 = 0;
        while (it.hasNext()) {
            i6 |= ((Integer) ((Map.Entry) it.next()).getValue()).intValue();
        }
        return i6;
    }

    public static byte[] b(C2057b[] c2057bArr, byte[] bArr) {
        int i6 = 0;
        int i7 = 0;
        for (C2057b c2057b : c2057bArr) {
            i7 += AbstractC2058c.k(j(c2057b.f18874a, c2057b.f18875b, bArr)) + 16 + (c2057b.f18878e * 2) + c2057b.f18879f + k(c2057b.f18880g);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i7);
        if (Arrays.equals(bArr, l.f18902c)) {
            int length = c2057bArr.length;
            while (i6 < length) {
                C2057b c2057b2 = c2057bArr[i6];
                G(byteArrayOutputStream, c2057b2, j(c2057b2.f18874a, c2057b2.f18875b, bArr));
                F(byteArrayOutputStream, c2057b2);
                i6++;
            }
        } else {
            for (C2057b c2057b3 : c2057bArr) {
                G(byteArrayOutputStream, c2057b3, j(c2057b3.f18874a, c2057b3.f18875b, bArr));
            }
            int length2 = c2057bArr.length;
            while (i6 < length2) {
                F(byteArrayOutputStream, c2057bArr[i6]);
                i6++;
            }
        }
        if (byteArrayOutputStream.size() == i7) {
            return byteArrayOutputStream.toByteArray();
        }
        throw AbstractC2058c.c("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i7);
    }

    public static m c(C2057b[] c2057bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i6 = 0;
        for (int i7 = 0; i7 < c2057bArr.length; i7++) {
            try {
                C2057b c2057b = c2057bArr[i7];
                AbstractC2058c.p(byteArrayOutputStream, i7);
                AbstractC2058c.p(byteArrayOutputStream, c2057b.f18878e);
                i6 = i6 + 4 + (c2057b.f18878e * 2);
                C(byteArrayOutputStream, c2057b);
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i6 == byteArray.length) {
            m mVar = new m(EnumC2059d.CLASSES, i6, byteArray, true);
            byteArrayOutputStream.close();
            return mVar;
        }
        throw AbstractC2058c.c("Expected size " + i6 + ", does not match actual size " + byteArray.length);
    }

    public static m d(C2057b[] c2057bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i6 = 0;
        for (int i7 = 0; i7 < c2057bArr.length; i7++) {
            try {
                C2057b c2057b = c2057bArr[i7];
                int a6 = a(c2057b);
                byte[] e6 = e(c2057b);
                byte[] f6 = f(c2057b);
                AbstractC2058c.p(byteArrayOutputStream, i7);
                int length = e6.length + 2 + f6.length;
                AbstractC2058c.q(byteArrayOutputStream, length);
                AbstractC2058c.p(byteArrayOutputStream, a6);
                byteArrayOutputStream.write(e6);
                byteArrayOutputStream.write(f6);
                i6 = i6 + 6 + length;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i6 == byteArray.length) {
            m mVar = new m(EnumC2059d.METHODS, i6, byteArray, true);
            byteArrayOutputStream.close();
            return mVar;
        }
        throw AbstractC2058c.c("Expected size " + i6 + ", does not match actual size " + byteArray.length);
    }

    public static byte[] e(C2057b c2057b) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            H(byteArrayOutputStream, c2057b);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static byte[] f(C2057b c2057b) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            I(byteArrayOutputStream, c2057b);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static String g(String str, String str2) {
        return "!".equals(str2) ? str.replace(":", "!") : ":".equals(str2) ? str.replace("!", ":") : str;
    }

    public static String h(String str) {
        int indexOf = str.indexOf("!");
        if (indexOf < 0) {
            indexOf = str.indexOf(":");
        }
        return indexOf > 0 ? str.substring(indexOf + 1) : str;
    }

    public static C2057b i(C2057b[] c2057bArr, String str) {
        if (c2057bArr.length <= 0) {
            return null;
        }
        String h6 = h(str);
        for (int i6 = 0; i6 < c2057bArr.length; i6++) {
            if (c2057bArr[i6].f18875b.equals(h6)) {
                return c2057bArr[i6];
            }
        }
        return null;
    }

    public static String j(String str, String str2, byte[] bArr) {
        String a6 = l.a(bArr);
        if (str.length() <= 0) {
            return g(str2, a6);
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            return g(str2, a6);
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        return str + l.a(bArr) + str2;
    }

    public static int k(int i6) {
        return y(i6 * 2) / 8;
    }

    public static int l(int i6, int i7, int i8) {
        if (i6 == 1) {
            throw AbstractC2058c.c("HOT methods are not stored in the bitmap");
        }
        if (i6 == 2) {
            return i7;
        }
        if (i6 == 4) {
            return i7 + i8;
        }
        throw AbstractC2058c.c("Unexpected flag: " + i6);
    }

    public static int[] m(InputStream inputStream, int i6) {
        int[] iArr = new int[i6];
        int i7 = 0;
        for (int i8 = 0; i8 < i6; i8++) {
            i7 += AbstractC2058c.h(inputStream);
            iArr[i8] = i7;
        }
        return iArr;
    }

    public static int n(BitSet bitSet, int i6, int i7) {
        int i8 = bitSet.get(l(2, i6, i7)) ? 2 : 0;
        return bitSet.get(l(4, i6, i7)) ? i8 | 4 : i8;
    }

    public static byte[] o(InputStream inputStream, byte[] bArr) {
        if (Arrays.equals(bArr, AbstractC2058c.d(inputStream, bArr.length))) {
            return AbstractC2058c.d(inputStream, l.f18901b.length);
        }
        throw AbstractC2058c.c("Invalid magic");
    }

    public static void p(InputStream inputStream, C2057b c2057b) {
        int available = inputStream.available() - c2057b.f18879f;
        int i6 = 0;
        while (inputStream.available() > available) {
            i6 += AbstractC2058c.h(inputStream);
            c2057b.f18882i.put(Integer.valueOf(i6), 1);
            for (int h6 = AbstractC2058c.h(inputStream); h6 > 0; h6--) {
                A(inputStream);
            }
        }
        if (inputStream.available() != available) {
            throw AbstractC2058c.c("Read too much data during profile line parse");
        }
    }

    public static C2057b[] q(InputStream inputStream, byte[] bArr, byte[] bArr2, C2057b[] c2057bArr) {
        if (Arrays.equals(bArr, l.f18905f)) {
            if (Arrays.equals(l.f18900a, bArr2)) {
                throw AbstractC2058c.c("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            }
            return r(inputStream, bArr, c2057bArr);
        }
        if (Arrays.equals(bArr, l.f18906g)) {
            return t(inputStream, bArr2, c2057bArr);
        }
        throw AbstractC2058c.c("Unsupported meta version");
    }

    public static C2057b[] r(InputStream inputStream, byte[] bArr, C2057b[] c2057bArr) {
        if (!Arrays.equals(bArr, l.f18905f)) {
            throw AbstractC2058c.c("Unsupported meta version");
        }
        int j6 = AbstractC2058c.j(inputStream);
        byte[] e6 = AbstractC2058c.e(inputStream, (int) AbstractC2058c.i(inputStream), (int) AbstractC2058c.i(inputStream));
        if (inputStream.read() > 0) {
            throw AbstractC2058c.c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e6);
        try {
            C2057b[] s6 = s(byteArrayInputStream, j6, c2057bArr);
            byteArrayInputStream.close();
            return s6;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static C2057b[] s(InputStream inputStream, int i6, C2057b[] c2057bArr) {
        if (inputStream.available() == 0) {
            return new C2057b[0];
        }
        if (i6 != c2057bArr.length) {
            throw AbstractC2058c.c("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i6];
        int[] iArr = new int[i6];
        for (int i7 = 0; i7 < i6; i7++) {
            int h6 = AbstractC2058c.h(inputStream);
            iArr[i7] = AbstractC2058c.h(inputStream);
            strArr[i7] = AbstractC2058c.f(inputStream, h6);
        }
        for (int i8 = 0; i8 < i6; i8++) {
            C2057b c2057b = c2057bArr[i8];
            if (!c2057b.f18875b.equals(strArr[i8])) {
                throw AbstractC2058c.c("Order of dexfiles in metadata did not match baseline");
            }
            int i9 = iArr[i8];
            c2057b.f18878e = i9;
            c2057b.f18881h = m(inputStream, i9);
        }
        return c2057bArr;
    }

    public static C2057b[] t(InputStream inputStream, byte[] bArr, C2057b[] c2057bArr) {
        int h6 = AbstractC2058c.h(inputStream);
        byte[] e6 = AbstractC2058c.e(inputStream, (int) AbstractC2058c.i(inputStream), (int) AbstractC2058c.i(inputStream));
        if (inputStream.read() > 0) {
            throw AbstractC2058c.c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e6);
        try {
            C2057b[] u6 = u(byteArrayInputStream, bArr, h6, c2057bArr);
            byteArrayInputStream.close();
            return u6;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static C2057b[] u(InputStream inputStream, byte[] bArr, int i6, C2057b[] c2057bArr) {
        if (inputStream.available() == 0) {
            return new C2057b[0];
        }
        if (i6 != c2057bArr.length) {
            throw AbstractC2058c.c("Mismatched number of dex files found in metadata");
        }
        for (int i7 = 0; i7 < i6; i7++) {
            AbstractC2058c.h(inputStream);
            String f6 = AbstractC2058c.f(inputStream, AbstractC2058c.h(inputStream));
            long i8 = AbstractC2058c.i(inputStream);
            int h6 = AbstractC2058c.h(inputStream);
            C2057b i9 = i(c2057bArr, f6);
            if (i9 == null) {
                throw AbstractC2058c.c("Missing profile key: " + f6);
            }
            i9.f18877d = i8;
            int[] m6 = m(inputStream, h6);
            if (Arrays.equals(bArr, l.f18904e)) {
                i9.f18878e = h6;
                i9.f18881h = m6;
            }
        }
        return c2057bArr;
    }

    public static void v(InputStream inputStream, C2057b c2057b) {
        BitSet valueOf = BitSet.valueOf(AbstractC2058c.d(inputStream, AbstractC2058c.a(c2057b.f18880g * 2)));
        int i6 = 0;
        while (true) {
            int i7 = c2057b.f18880g;
            if (i6 >= i7) {
                return;
            }
            int n6 = n(valueOf, i6, i7);
            if (n6 != 0) {
                Integer num = (Integer) c2057b.f18882i.get(Integer.valueOf(i6));
                if (num == null) {
                    num = 0;
                }
                c2057b.f18882i.put(Integer.valueOf(i6), Integer.valueOf(n6 | num.intValue()));
            }
            i6++;
        }
    }

    public static C2057b[] w(InputStream inputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, l.f18901b)) {
            throw AbstractC2058c.c("Unsupported version");
        }
        int j6 = AbstractC2058c.j(inputStream);
        byte[] e6 = AbstractC2058c.e(inputStream, (int) AbstractC2058c.i(inputStream), (int) AbstractC2058c.i(inputStream));
        if (inputStream.read() > 0) {
            throw AbstractC2058c.c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e6);
        try {
            C2057b[] x6 = x(byteArrayInputStream, str, j6);
            byteArrayInputStream.close();
            return x6;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static C2057b[] x(InputStream inputStream, String str, int i6) {
        if (inputStream.available() == 0) {
            return new C2057b[0];
        }
        C2057b[] c2057bArr = new C2057b[i6];
        for (int i7 = 0; i7 < i6; i7++) {
            int h6 = AbstractC2058c.h(inputStream);
            int h7 = AbstractC2058c.h(inputStream);
            c2057bArr[i7] = new C2057b(str, AbstractC2058c.f(inputStream, h6), AbstractC2058c.i(inputStream), 0L, h7, (int) AbstractC2058c.i(inputStream), (int) AbstractC2058c.i(inputStream), new int[h7], new TreeMap());
        }
        for (int i8 = 0; i8 < i6; i8++) {
            C2057b c2057b = c2057bArr[i8];
            p(inputStream, c2057b);
            c2057b.f18881h = m(inputStream, c2057b.f18878e);
            v(inputStream, c2057b);
        }
        return c2057bArr;
    }

    public static int y(int i6) {
        return (i6 + 7) & (-8);
    }

    public static void z(byte[] bArr, int i6, int i7, C2057b c2057b) {
        int l6 = l(i6, i7, c2057b.f18880g);
        int i8 = l6 / 8;
        bArr[i8] = (byte) ((1 << (l6 % 8)) | bArr[i8]);
    }
}
