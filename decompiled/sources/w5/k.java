package w5;

import java.util.List;
import w5.u;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class k extends u {

    /* renamed from: a, reason: collision with root package name */
    public final long f20299a;

    /* renamed from: b, reason: collision with root package name */
    public final long f20300b;

    /* renamed from: c, reason: collision with root package name */
    public final o f20301c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f20302d;

    /* renamed from: e, reason: collision with root package name */
    public final String f20303e;

    /* renamed from: f, reason: collision with root package name */
    public final List f20304f;

    /* renamed from: g, reason: collision with root package name */
    public final x f20305g;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends u.a {

        /* renamed from: a, reason: collision with root package name */
        public Long f20306a;

        /* renamed from: b, reason: collision with root package name */
        public Long f20307b;

        /* renamed from: c, reason: collision with root package name */
        public o f20308c;

        /* renamed from: d, reason: collision with root package name */
        public Integer f20309d;

        /* renamed from: e, reason: collision with root package name */
        public String f20310e;

        /* renamed from: f, reason: collision with root package name */
        public List f20311f;

        /* renamed from: g, reason: collision with root package name */
        public x f20312g;

        @Override // w5.u.a
        public u a() {
            String str = "";
            if (this.f20306a == null) {
                str = " requestTimeMs";
            }
            if (this.f20307b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new k(this.f20306a.longValue(), this.f20307b.longValue(), this.f20308c, this.f20309d, this.f20310e, this.f20311f, this.f20312g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // w5.u.a
        public u.a b(o oVar) {
            this.f20308c = oVar;
            return this;
        }

        @Override // w5.u.a
        public u.a c(List list) {
            this.f20311f = list;
            return this;
        }

        @Override // w5.u.a
        public u.a d(Integer num) {
            this.f20309d = num;
            return this;
        }

        @Override // w5.u.a
        public u.a e(String str) {
            this.f20310e = str;
            return this;
        }

        @Override // w5.u.a
        public u.a f(x xVar) {
            this.f20312g = xVar;
            return this;
        }

        @Override // w5.u.a
        public u.a g(long j6) {
            this.f20306a = Long.valueOf(j6);
            return this;
        }

        @Override // w5.u.a
        public u.a h(long j6) {
            this.f20307b = Long.valueOf(j6);
            return this;
        }
    }

    @Override // w5.u
    public o b() {
        return this.f20301c;
    }

    @Override // w5.u
    public List c() {
        return this.f20304f;
    }

    @Override // w5.u
    public Integer d() {
        return this.f20302d;
    }

    @Override // w5.u
    public String e() {
        return this.f20303e;
    }

    public boolean equals(Object obj) {
        o oVar;
        Integer num;
        String str;
        List list;
        x xVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (this.f20299a == uVar.g() && this.f20300b == uVar.h() && ((oVar = this.f20301c) != null ? oVar.equals(uVar.b()) : uVar.b() == null) && ((num = this.f20302d) != null ? num.equals(uVar.d()) : uVar.d() == null) && ((str = this.f20303e) != null ? str.equals(uVar.e()) : uVar.e() == null) && ((list = this.f20304f) != null ? list.equals(uVar.c()) : uVar.c() == null) && ((xVar = this.f20305g) != null ? xVar.equals(uVar.f()) : uVar.f() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // w5.u
    public x f() {
        return this.f20305g;
    }

    @Override // w5.u
    public long g() {
        return this.f20299a;
    }

    @Override // w5.u
    public long h() {
        return this.f20300b;
    }

    public int hashCode() {
        long j6 = this.f20299a;
        long j7 = this.f20300b;
        int i6 = (((((int) (j6 ^ (j6 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j7 >>> 32) ^ j7))) * 1000003;
        o oVar = this.f20301c;
        int hashCode = (i6 ^ (oVar == null ? 0 : oVar.hashCode())) * 1000003;
        Integer num = this.f20302d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f20303e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f20304f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        x xVar = this.f20305g;
        return hashCode4 ^ (xVar != null ? xVar.hashCode() : 0);
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f20299a + ", requestUptimeMs=" + this.f20300b + ", clientInfo=" + this.f20301c + ", logSource=" + this.f20302d + ", logSourceName=" + this.f20303e + ", logEvents=" + this.f20304f + ", qosTier=" + this.f20305g + "}";
    }

    public k(long j6, long j7, o oVar, Integer num, String str, List list, x xVar) {
        this.f20299a = j6;
        this.f20300b = j7;
        this.f20301c = oVar;
        this.f20302d = num;
        this.f20303e = str;
        this.f20304f = list;
        this.f20305g = xVar;
    }
}
