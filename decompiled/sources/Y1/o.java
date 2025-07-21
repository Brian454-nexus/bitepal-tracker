package Y1;

import c1.AbstractC1133o;
import c1.C1144z;
import java.nio.ByteBuffer;
import java.util.UUID;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class o {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final UUID f6466a;

        /* renamed from: b, reason: collision with root package name */
        public final int f6467b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f6468c;

        /* renamed from: d, reason: collision with root package name */
        public final UUID[] f6469d;

        public a(UUID uuid, int i6, byte[] bArr, UUID[] uuidArr) {
            this.f6466a = uuid;
            this.f6467b = i6;
            this.f6468c = bArr;
            this.f6469d = uuidArr;
        }
    }

    public static byte[] a(UUID uuid, byte[] bArr) {
        return b(uuid, null, bArr);
    }

    public static byte[] b(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.putInt(length);
        allocate.putInt(1886614376);
        allocate.putInt(uuidArr != null ? 16777216 : 0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr == null || bArr.length == 0) {
            allocate.putInt(0);
        } else {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    public static boolean c(byte[] bArr) {
        return d(bArr) != null;
    }

    public static a d(byte[] bArr) {
        UUID[] uuidArr;
        C1144z c1144z = new C1144z(bArr);
        if (c1144z.g() < 32) {
            return null;
        }
        c1144z.T(0);
        int a6 = c1144z.a();
        int p6 = c1144z.p();
        if (p6 != a6) {
            AbstractC1133o.h("PsshAtomUtil", "Advertised atom size (" + p6 + ") does not match buffer size: " + a6);
            return null;
        }
        int p7 = c1144z.p();
        if (p7 != 1886614376) {
            AbstractC1133o.h("PsshAtomUtil", "Atom type is not pssh: " + p7);
            return null;
        }
        int c6 = Y1.a.c(c1144z.p());
        if (c6 > 1) {
            AbstractC1133o.h("PsshAtomUtil", "Unsupported pssh version: " + c6);
            return null;
        }
        UUID uuid = new UUID(c1144z.z(), c1144z.z());
        if (c6 == 1) {
            int K5 = c1144z.K();
            uuidArr = new UUID[K5];
            for (int i6 = 0; i6 < K5; i6++) {
                uuidArr[i6] = new UUID(c1144z.z(), c1144z.z());
            }
        } else {
            uuidArr = null;
        }
        int K6 = c1144z.K();
        int a7 = c1144z.a();
        if (K6 == a7) {
            byte[] bArr2 = new byte[K6];
            c1144z.l(bArr2, 0, K6);
            return new a(uuid, c6, bArr2, uuidArr);
        }
        AbstractC1133o.h("PsshAtomUtil", "Atom data size (" + K6 + ") does not match the bytes left: " + a7);
        return null;
    }

    public static byte[] e(byte[] bArr, UUID uuid) {
        a d6 = d(bArr);
        if (d6 == null) {
            return null;
        }
        if (uuid.equals(d6.f6466a)) {
            return d6.f6468c;
        }
        AbstractC1133o.h("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + d6.f6466a + ".");
        return null;
    }

    public static UUID f(byte[] bArr) {
        a d6 = d(bArr);
        if (d6 == null) {
            return null;
        }
        return d6.f6466a;
    }

    public static int g(byte[] bArr) {
        a d6 = d(bArr);
        if (d6 == null) {
            return -1;
        }
        return d6.f6467b;
    }
}
