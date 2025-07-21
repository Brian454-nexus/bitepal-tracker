package E5;

import E5.f;
import java.util.Set;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class c extends f.b {

    /* renamed from: a, reason: collision with root package name */
    public final long f1156a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1157b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f1158c;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends f.b.a {

        /* renamed from: a, reason: collision with root package name */
        public Long f1159a;

        /* renamed from: b, reason: collision with root package name */
        public Long f1160b;

        /* renamed from: c, reason: collision with root package name */
        public Set f1161c;

        @Override // E5.f.b.a
        public f.b a() {
            String str = "";
            if (this.f1159a == null) {
                str = " delta";
            }
            if (this.f1160b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f1161c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new c(this.f1159a.longValue(), this.f1160b.longValue(), this.f1161c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // E5.f.b.a
        public f.b.a b(long j6) {
            this.f1159a = Long.valueOf(j6);
            return this;
        }

        @Override // E5.f.b.a
        public f.b.a c(Set set) {
            if (set == null) {
                throw new NullPointerException("Null flags");
            }
            this.f1161c = set;
            return this;
        }

        @Override // E5.f.b.a
        public f.b.a d(long j6) {
            this.f1160b = Long.valueOf(j6);
            return this;
        }
    }

    @Override // E5.f.b
    public long b() {
        return this.f1156a;
    }

    @Override // E5.f.b
    public Set c() {
        return this.f1158c;
    }

    @Override // E5.f.b
    public long d() {
        return this.f1157b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f.b) {
            f.b bVar = (f.b) obj;
            if (this.f1156a == bVar.b() && this.f1157b == bVar.d() && this.f1158c.equals(bVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j6 = this.f1156a;
        int i6 = (((int) (j6 ^ (j6 >>> 32))) ^ 1000003) * 1000003;
        long j7 = this.f1157b;
        return ((i6 ^ ((int) ((j7 >>> 32) ^ j7))) * 1000003) ^ this.f1158c.hashCode();
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f1156a + ", maxAllowedDelay=" + this.f1157b + ", flags=" + this.f1158c + "}";
    }

    public c(long j6, long j7, Set set) {
        this.f1156a = j6;
        this.f1157b = j7;
        this.f1158c = set;
    }
}
