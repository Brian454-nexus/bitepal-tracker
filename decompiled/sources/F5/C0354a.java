package F5;

import F5.AbstractC0358e;

/* renamed from: F5.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0354a extends AbstractC0358e {

    /* renamed from: b, reason: collision with root package name */
    public final long f1676b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1677c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1678d;

    /* renamed from: e, reason: collision with root package name */
    public final long f1679e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1680f;

    /* renamed from: F5.a$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends AbstractC0358e.a {

        /* renamed from: a, reason: collision with root package name */
        public Long f1681a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f1682b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f1683c;

        /* renamed from: d, reason: collision with root package name */
        public Long f1684d;

        /* renamed from: e, reason: collision with root package name */
        public Integer f1685e;

        @Override // F5.AbstractC0358e.a
        public AbstractC0358e a() {
            String str = "";
            if (this.f1681a == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.f1682b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f1683c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f1684d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f1685e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new C0354a(this.f1681a.longValue(), this.f1682b.intValue(), this.f1683c.intValue(), this.f1684d.longValue(), this.f1685e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // F5.AbstractC0358e.a
        public AbstractC0358e.a b(int i6) {
            this.f1683c = Integer.valueOf(i6);
            return this;
        }

        @Override // F5.AbstractC0358e.a
        public AbstractC0358e.a c(long j6) {
            this.f1684d = Long.valueOf(j6);
            return this;
        }

        @Override // F5.AbstractC0358e.a
        public AbstractC0358e.a d(int i6) {
            this.f1682b = Integer.valueOf(i6);
            return this;
        }

        @Override // F5.AbstractC0358e.a
        public AbstractC0358e.a e(int i6) {
            this.f1685e = Integer.valueOf(i6);
            return this;
        }

        @Override // F5.AbstractC0358e.a
        public AbstractC0358e.a f(long j6) {
            this.f1681a = Long.valueOf(j6);
            return this;
        }
    }

    @Override // F5.AbstractC0358e
    public int b() {
        return this.f1678d;
    }

    @Override // F5.AbstractC0358e
    public long c() {
        return this.f1679e;
    }

    @Override // F5.AbstractC0358e
    public int d() {
        return this.f1677c;
    }

    @Override // F5.AbstractC0358e
    public int e() {
        return this.f1680f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0358e) {
            AbstractC0358e abstractC0358e = (AbstractC0358e) obj;
            if (this.f1676b == abstractC0358e.f() && this.f1677c == abstractC0358e.d() && this.f1678d == abstractC0358e.b() && this.f1679e == abstractC0358e.c() && this.f1680f == abstractC0358e.e()) {
                return true;
            }
        }
        return false;
    }

    @Override // F5.AbstractC0358e
    public long f() {
        return this.f1676b;
    }

    public int hashCode() {
        long j6 = this.f1676b;
        int i6 = (((((((int) (j6 ^ (j6 >>> 32))) ^ 1000003) * 1000003) ^ this.f1677c) * 1000003) ^ this.f1678d) * 1000003;
        long j7 = this.f1679e;
        return ((i6 ^ ((int) ((j7 >>> 32) ^ j7))) * 1000003) ^ this.f1680f;
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f1676b + ", loadBatchSize=" + this.f1677c + ", criticalSectionEnterTimeoutMs=" + this.f1678d + ", eventCleanUpAge=" + this.f1679e + ", maxBlobByteSizePerRow=" + this.f1680f + "}";
    }

    public C0354a(long j6, int i6, int i7, long j7, int i8) {
        this.f1676b = j6;
        this.f1677c = i6;
        this.f1678d = i7;
        this.f1679e = j7;
        this.f1680f = i8;
    }
}
