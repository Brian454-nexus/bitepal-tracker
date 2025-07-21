package E1;

import java.io.EOFException;

/* renamed from: E1.s, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC0316s {
    public static void a(boolean z6, String str) {
        if (!z6) {
            throw Z0.z.a(str, null);
        }
    }

    public static boolean b(InterfaceC0315q interfaceC0315q, byte[] bArr, int i6, int i7, boolean z6) {
        try {
            return interfaceC0315q.g(bArr, i6, i7, z6);
        } catch (EOFException e6) {
            if (z6) {
                return false;
            }
            throw e6;
        }
    }

    public static int c(InterfaceC0315q interfaceC0315q, byte[] bArr, int i6, int i7) {
        int i8 = 0;
        while (i8 < i7) {
            int m6 = interfaceC0315q.m(bArr, i6 + i8, i7 - i8);
            if (m6 == -1) {
                break;
            }
            i8 += m6;
        }
        return i8;
    }

    public static boolean d(InterfaceC0315q interfaceC0315q, byte[] bArr, int i6, int i7) {
        try {
            interfaceC0315q.readFully(bArr, i6, i7);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean e(InterfaceC0315q interfaceC0315q, int i6) {
        try {
            interfaceC0315q.p(i6);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
