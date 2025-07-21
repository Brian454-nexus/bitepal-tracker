package w5;

import java.util.Arrays;
import w5.t;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class j extends t {

    /* renamed from: a, reason: collision with root package name */
    public final long f20281a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f20282b;

    /* renamed from: c, reason: collision with root package name */
    public final p f20283c;

    /* renamed from: d, reason: collision with root package name */
    public final long f20284d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f20285e;

    /* renamed from: f, reason: collision with root package name */
    public final String f20286f;

    /* renamed from: g, reason: collision with root package name */
    public final long f20287g;

    /* renamed from: h, reason: collision with root package name */
    public final w f20288h;

    /* renamed from: i, reason: collision with root package name */
    public final q f20289i;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends t.a {

        /* renamed from: a, reason: collision with root package name */
        public Long f20290a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f20291b;

        /* renamed from: c, reason: collision with root package name */
        public p f20292c;

        /* renamed from: d, reason: collision with root package name */
        public Long f20293d;

        /* renamed from: e, reason: collision with root package name */
        public byte[] f20294e;

        /* renamed from: f, reason: collision with root package name */
        public String f20295f;

        /* renamed from: g, reason: collision with root package name */
        public Long f20296g;

        /* renamed from: h, reason: collision with root package name */
        public w f20297h;

        /* renamed from: i, reason: collision with root package name */
        public q f20298i;

        @Override // w5.t.a
        public t a() {
            String str = "";
            if (this.f20290a == null) {
                str = " eventTimeMs";
            }
            if (this.f20293d == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f20296g == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new j(this.f20290a.longValue(), this.f20291b, this.f20292c, this.f20293d.longValue(), this.f20294e, this.f20295f, this.f20296g.longValue(), this.f20297h, this.f20298i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // w5.t.a
        public t.a b(p pVar) {
            this.f20292c = pVar;
            return this;
        }

        @Override // w5.t.a
        public t.a c(Integer num) {
            this.f20291b = num;
            return this;
        }

        @Override // w5.t.a
        public t.a d(long j6) {
            this.f20290a = Long.valueOf(j6);
            return this;
        }

        @Override // w5.t.a
        public t.a e(long j6) {
            this.f20293d = Long.valueOf(j6);
            return this;
        }

        @Override // w5.t.a
        public t.a f(q qVar) {
            this.f20298i = qVar;
            return this;
        }

        @Override // w5.t.a
        public t.a g(w wVar) {
            this.f20297h = wVar;
            return this;
        }

        @Override // w5.t.a
        public t.a h(byte[] bArr) {
            this.f20294e = bArr;
            return this;
        }

        @Override // w5.t.a
        public t.a i(String str) {
            this.f20295f = str;
            return this;
        }

        @Override // w5.t.a
        public t.a j(long j6) {
            this.f20296g = Long.valueOf(j6);
            return this;
        }
    }

    @Override // w5.t
    public p b() {
        return this.f20283c;
    }

    @Override // w5.t
    public Integer c() {
        return this.f20282b;
    }

    @Override // w5.t
    public long d() {
        return this.f20281a;
    }

    @Override // w5.t
    public long e() {
        return this.f20284d;
    }

    public boolean equals(Object obj) {
        Integer num;
        p pVar;
        String str;
        w wVar;
        q qVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof t) {
            t tVar = (t) obj;
            if (this.f20281a == tVar.d() && ((num = this.f20282b) != null ? num.equals(tVar.c()) : tVar.c() == null) && ((pVar = this.f20283c) != null ? pVar.equals(tVar.b()) : tVar.b() == null) && this.f20284d == tVar.e()) {
                if (Arrays.equals(this.f20285e, tVar instanceof j ? ((j) tVar).f20285e : tVar.h()) && ((str = this.f20286f) != null ? str.equals(tVar.i()) : tVar.i() == null) && this.f20287g == tVar.j() && ((wVar = this.f20288h) != null ? wVar.equals(tVar.g()) : tVar.g() == null) && ((qVar = this.f20289i) != null ? qVar.equals(tVar.f()) : tVar.f() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // w5.t
    public q f() {
        return this.f20289i;
    }

    @Override // w5.t
    public w g() {
        return this.f20288h;
    }

    @Override // w5.t
    public byte[] h() {
        return this.f20285e;
    }

    public int hashCode() {
        long j6 = this.f20281a;
        int i6 = (((int) (j6 ^ (j6 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f20282b;
        int hashCode = (i6 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        p pVar = this.f20283c;
        int hashCode2 = pVar == null ? 0 : pVar.hashCode();
        long j7 = this.f20284d;
        int hashCode3 = (((((hashCode ^ hashCode2) * 1000003) ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f20285e)) * 1000003;
        String str = this.f20286f;
        int hashCode4 = str == null ? 0 : str.hashCode();
        long j8 = this.f20287g;
        int i7 = (((hashCode3 ^ hashCode4) * 1000003) ^ ((int) ((j8 >>> 32) ^ j8))) * 1000003;
        w wVar = this.f20288h;
        int hashCode5 = (i7 ^ (wVar == null ? 0 : wVar.hashCode())) * 1000003;
        q qVar = this.f20289i;
        return hashCode5 ^ (qVar != null ? qVar.hashCode() : 0);
    }

    @Override // w5.t
    public String i() {
        return this.f20286f;
    }

    @Override // w5.t
    public long j() {
        return this.f20287g;
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f20281a + ", eventCode=" + this.f20282b + ", complianceData=" + this.f20283c + ", eventUptimeMs=" + this.f20284d + ", sourceExtension=" + Arrays.toString(this.f20285e) + ", sourceExtensionJsonProto3=" + this.f20286f + ", timezoneOffsetSeconds=" + this.f20287g + ", networkConnectionInfo=" + this.f20288h + ", experimentIds=" + this.f20289i + "}";
    }

    public j(long j6, Integer num, p pVar, long j7, byte[] bArr, String str, long j8, w wVar, q qVar) {
        this.f20281a = j6;
        this.f20282b = num;
        this.f20283c = pVar;
        this.f20284d = j7;
        this.f20285e = bArr;
        this.f20286f = str;
        this.f20287g = j8;
        this.f20288h = wVar;
        this.f20289i = qVar;
    }
}
