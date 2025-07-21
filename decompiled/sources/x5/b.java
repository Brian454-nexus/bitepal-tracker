package x5;

import java.util.Arrays;
import java.util.Map;
import x5.i;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class b extends i {

    /* renamed from: a, reason: collision with root package name */
    public final String f20587a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f20588b;

    /* renamed from: c, reason: collision with root package name */
    public final h f20589c;

    /* renamed from: d, reason: collision with root package name */
    public final long f20590d;

    /* renamed from: e, reason: collision with root package name */
    public final long f20591e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f20592f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f20593g;

    /* renamed from: h, reason: collision with root package name */
    public final String f20594h;

    /* renamed from: i, reason: collision with root package name */
    public final byte[] f20595i;

    /* renamed from: j, reason: collision with root package name */
    public final byte[] f20596j;

    /* renamed from: x5.b$b, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class C0274b extends i.a {

        /* renamed from: a, reason: collision with root package name */
        public String f20597a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f20598b;

        /* renamed from: c, reason: collision with root package name */
        public h f20599c;

        /* renamed from: d, reason: collision with root package name */
        public Long f20600d;

        /* renamed from: e, reason: collision with root package name */
        public Long f20601e;

        /* renamed from: f, reason: collision with root package name */
        public Map f20602f;

        /* renamed from: g, reason: collision with root package name */
        public Integer f20603g;

        /* renamed from: h, reason: collision with root package name */
        public String f20604h;

        /* renamed from: i, reason: collision with root package name */
        public byte[] f20605i;

        /* renamed from: j, reason: collision with root package name */
        public byte[] f20606j;

        @Override // x5.i.a
        public i d() {
            String str = "";
            if (this.f20597a == null) {
                str = " transportName";
            }
            if (this.f20599c == null) {
                str = str + " encodedPayload";
            }
            if (this.f20600d == null) {
                str = str + " eventMillis";
            }
            if (this.f20601e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f20602f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new b(this.f20597a, this.f20598b, this.f20599c, this.f20600d.longValue(), this.f20601e.longValue(), this.f20602f, this.f20603g, this.f20604h, this.f20605i, this.f20606j);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // x5.i.a
        public Map e() {
            Map map = this.f20602f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // x5.i.a
        public i.a f(Map map) {
            if (map == null) {
                throw new NullPointerException("Null autoMetadata");
            }
            this.f20602f = map;
            return this;
        }

        @Override // x5.i.a
        public i.a g(Integer num) {
            this.f20598b = num;
            return this;
        }

        @Override // x5.i.a
        public i.a h(h hVar) {
            if (hVar == null) {
                throw new NullPointerException("Null encodedPayload");
            }
            this.f20599c = hVar;
            return this;
        }

        @Override // x5.i.a
        public i.a i(long j6) {
            this.f20600d = Long.valueOf(j6);
            return this;
        }

        @Override // x5.i.a
        public i.a j(byte[] bArr) {
            this.f20605i = bArr;
            return this;
        }

        @Override // x5.i.a
        public i.a k(byte[] bArr) {
            this.f20606j = bArr;
            return this;
        }

        @Override // x5.i.a
        public i.a l(Integer num) {
            this.f20603g = num;
            return this;
        }

        @Override // x5.i.a
        public i.a m(String str) {
            this.f20604h = str;
            return this;
        }

        @Override // x5.i.a
        public i.a n(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f20597a = str;
            return this;
        }

        @Override // x5.i.a
        public i.a o(long j6) {
            this.f20601e = Long.valueOf(j6);
            return this;
        }
    }

    @Override // x5.i
    public Map c() {
        return this.f20592f;
    }

    @Override // x5.i
    public Integer d() {
        return this.f20588b;
    }

    @Override // x5.i
    public h e() {
        return this.f20589c;
    }

    public boolean equals(Object obj) {
        Integer num;
        Integer num2;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f20587a.equals(iVar.n()) && ((num = this.f20588b) != null ? num.equals(iVar.d()) : iVar.d() == null) && this.f20589c.equals(iVar.e()) && this.f20590d == iVar.f() && this.f20591e == iVar.o() && this.f20592f.equals(iVar.c()) && ((num2 = this.f20593g) != null ? num2.equals(iVar.l()) : iVar.l() == null) && ((str = this.f20594h) != null ? str.equals(iVar.m()) : iVar.m() == null)) {
                boolean z6 = iVar instanceof b;
                if (Arrays.equals(this.f20595i, z6 ? ((b) iVar).f20595i : iVar.g())) {
                    if (Arrays.equals(this.f20596j, z6 ? ((b) iVar).f20596j : iVar.h())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // x5.i
    public long f() {
        return this.f20590d;
    }

    @Override // x5.i
    public byte[] g() {
        return this.f20595i;
    }

    @Override // x5.i
    public byte[] h() {
        return this.f20596j;
    }

    public int hashCode() {
        int hashCode = (this.f20587a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f20588b;
        int hashCode2 = (((hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f20589c.hashCode()) * 1000003;
        long j6 = this.f20590d;
        int i6 = (hashCode2 ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003;
        long j7 = this.f20591e;
        int hashCode3 = (((i6 ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003) ^ this.f20592f.hashCode()) * 1000003;
        Integer num2 = this.f20593g;
        int hashCode4 = (hashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str = this.f20594h;
        return ((((hashCode4 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ Arrays.hashCode(this.f20595i)) * 1000003) ^ Arrays.hashCode(this.f20596j);
    }

    @Override // x5.i
    public Integer l() {
        return this.f20593g;
    }

    @Override // x5.i
    public String m() {
        return this.f20594h;
    }

    @Override // x5.i
    public String n() {
        return this.f20587a;
    }

    @Override // x5.i
    public long o() {
        return this.f20591e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f20587a + ", code=" + this.f20588b + ", encodedPayload=" + this.f20589c + ", eventMillis=" + this.f20590d + ", uptimeMillis=" + this.f20591e + ", autoMetadata=" + this.f20592f + ", productId=" + this.f20593g + ", pseudonymousId=" + this.f20594h + ", experimentIdsClear=" + Arrays.toString(this.f20595i) + ", experimentIdsEncrypted=" + Arrays.toString(this.f20596j) + "}";
    }

    public b(String str, Integer num, h hVar, long j6, long j7, Map map, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.f20587a = str;
        this.f20588b = num;
        this.f20589c = hVar;
        this.f20590d = j6;
        this.f20591e = j7;
        this.f20592f = map;
        this.f20593g = num2;
        this.f20594h = str2;
        this.f20595i = bArr;
        this.f20596j = bArr2;
    }
}
