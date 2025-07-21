package x5;

import java.util.Arrays;
import x5.p;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class d extends p {

    /* renamed from: a, reason: collision with root package name */
    public final String f20617a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f20618b;

    /* renamed from: c, reason: collision with root package name */
    public final u5.f f20619c;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends p.a {

        /* renamed from: a, reason: collision with root package name */
        public String f20620a;

        /* renamed from: b, reason: collision with root package name */
        public byte[] f20621b;

        /* renamed from: c, reason: collision with root package name */
        public u5.f f20622c;

        @Override // x5.p.a
        public p a() {
            String str = "";
            if (this.f20620a == null) {
                str = " backendName";
            }
            if (this.f20622c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new d(this.f20620a, this.f20621b, this.f20622c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // x5.p.a
        public p.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.f20620a = str;
            return this;
        }

        @Override // x5.p.a
        public p.a c(byte[] bArr) {
            this.f20621b = bArr;
            return this;
        }

        @Override // x5.p.a
        public p.a d(u5.f fVar) {
            if (fVar == null) {
                throw new NullPointerException("Null priority");
            }
            this.f20622c = fVar;
            return this;
        }
    }

    @Override // x5.p
    public String b() {
        return this.f20617a;
    }

    @Override // x5.p
    public byte[] c() {
        return this.f20618b;
    }

    @Override // x5.p
    public u5.f d() {
        return this.f20619c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (this.f20617a.equals(pVar.b())) {
                if (Arrays.equals(this.f20618b, pVar instanceof d ? ((d) pVar).f20618b : pVar.c()) && this.f20619c.equals(pVar.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f20617a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f20618b)) * 1000003) ^ this.f20619c.hashCode();
    }

    public d(String str, byte[] bArr, u5.f fVar) {
        this.f20617a = str;
        this.f20618b = bArr;
        this.f20619c = fVar;
    }
}
