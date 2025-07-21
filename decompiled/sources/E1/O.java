package E1;

import Z0.InterfaceC0837i;
import c1.C1144z;
import java.util.Arrays;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface O {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f927a;

        /* renamed from: b, reason: collision with root package name */
        public final byte[] f928b;

        /* renamed from: c, reason: collision with root package name */
        public final int f929c;

        /* renamed from: d, reason: collision with root package name */
        public final int f930d;

        public a(int i6, byte[] bArr, int i7, int i8) {
            this.f927a = i6;
            this.f928b = bArr;
            this.f929c = i7;
            this.f930d = i8;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f927a == aVar.f927a && this.f929c == aVar.f929c && this.f930d == aVar.f930d && Arrays.equals(this.f928b, aVar.f928b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f927a * 31) + Arrays.hashCode(this.f928b)) * 31) + this.f929c) * 31) + this.f930d;
        }
    }

    default void a(C1144z c1144z, int i6) {
        b(c1144z, i6, 0);
    }

    void b(C1144z c1144z, int i6, int i7);

    default int c(InterfaceC0837i interfaceC0837i, int i6, boolean z6) {
        return d(interfaceC0837i, i6, z6, 0);
    }

    int d(InterfaceC0837i interfaceC0837i, int i6, boolean z6, int i7);

    void e(Z0.q qVar);

    void f(long j6, int i6, int i7, int i8, a aVar);
}
