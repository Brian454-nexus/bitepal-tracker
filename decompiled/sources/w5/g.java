package w5;

import java.util.Arrays;
import w5.q;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class g extends q {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f20273a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f20274b;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends q.a {

        /* renamed from: a, reason: collision with root package name */
        public byte[] f20275a;

        /* renamed from: b, reason: collision with root package name */
        public byte[] f20276b;

        @Override // w5.q.a
        public q a() {
            return new g(this.f20275a, this.f20276b);
        }

        @Override // w5.q.a
        public q.a b(byte[] bArr) {
            this.f20275a = bArr;
            return this;
        }

        @Override // w5.q.a
        public q.a c(byte[] bArr) {
            this.f20276b = bArr;
            return this;
        }
    }

    @Override // w5.q
    public byte[] b() {
        return this.f20273a;
    }

    @Override // w5.q
    public byte[] c() {
        return this.f20274b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            boolean z6 = qVar instanceof g;
            if (Arrays.equals(this.f20273a, z6 ? ((g) qVar).f20273a : qVar.b())) {
                if (Arrays.equals(this.f20274b, z6 ? ((g) qVar).f20274b : qVar.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((Arrays.hashCode(this.f20273a) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f20274b);
    }

    public String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.f20273a) + ", encryptedBlob=" + Arrays.toString(this.f20274b) + "}";
    }

    public g(byte[] bArr, byte[] bArr2) {
        this.f20273a = bArr;
        this.f20274b = bArr2;
    }
}
