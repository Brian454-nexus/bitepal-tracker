package y5;

import java.util.Arrays;
import y5.f;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a extends f {

    /* renamed from: a, reason: collision with root package name */
    public final Iterable f21251a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f21252b;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends f.a {

        /* renamed from: a, reason: collision with root package name */
        public Iterable f21253a;

        /* renamed from: b, reason: collision with root package name */
        public byte[] f21254b;

        @Override // y5.f.a
        public f a() {
            String str = "";
            if (this.f21253a == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new a(this.f21253a, this.f21254b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // y5.f.a
        public f.a b(Iterable iterable) {
            if (iterable == null) {
                throw new NullPointerException("Null events");
            }
            this.f21253a = iterable;
            return this;
        }

        @Override // y5.f.a
        public f.a c(byte[] bArr) {
            this.f21254b = bArr;
            return this;
        }
    }

    @Override // y5.f
    public Iterable b() {
        return this.f21251a;
    }

    @Override // y5.f
    public byte[] c() {
        return this.f21252b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f21251a.equals(fVar.b())) {
                if (Arrays.equals(this.f21252b, fVar instanceof a ? ((a) fVar).f21252b : fVar.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f21251a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f21252b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f21251a + ", extras=" + Arrays.toString(this.f21252b) + "}";
    }

    public a(Iterable iterable, byte[] bArr) {
        this.f21251a = iterable;
        this.f21252b = bArr;
    }
}
