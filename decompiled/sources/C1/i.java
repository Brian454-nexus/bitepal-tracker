package C1;

import java.util.Arrays;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    public boolean f518c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f519d;

    /* renamed from: f, reason: collision with root package name */
    public int f521f;

    /* renamed from: a, reason: collision with root package name */
    public a f516a = new a();

    /* renamed from: b, reason: collision with root package name */
    public a f517b = new a();

    /* renamed from: e, reason: collision with root package name */
    public long f520e = -9223372036854775807L;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public long f522a;

        /* renamed from: b, reason: collision with root package name */
        public long f523b;

        /* renamed from: c, reason: collision with root package name */
        public long f524c;

        /* renamed from: d, reason: collision with root package name */
        public long f525d;

        /* renamed from: e, reason: collision with root package name */
        public long f526e;

        /* renamed from: f, reason: collision with root package name */
        public long f527f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean[] f528g = new boolean[15];

        /* renamed from: h, reason: collision with root package name */
        public int f529h;

        public static int c(long j6) {
            return (int) (j6 % 15);
        }

        public long a() {
            long j6 = this.f526e;
            if (j6 == 0) {
                return 0L;
            }
            return this.f527f / j6;
        }

        public long b() {
            return this.f527f;
        }

        public boolean d() {
            long j6 = this.f525d;
            if (j6 == 0) {
                return false;
            }
            return this.f528g[c(j6 - 1)];
        }

        public boolean e() {
            return this.f525d > 15 && this.f529h == 0;
        }

        public void f(long j6) {
            long j7 = this.f525d;
            if (j7 == 0) {
                this.f522a = j6;
            } else if (j7 == 1) {
                long j8 = j6 - this.f522a;
                this.f523b = j8;
                this.f527f = j8;
                this.f526e = 1L;
            } else {
                long j9 = j6 - this.f524c;
                int c6 = c(j7);
                if (Math.abs(j9 - this.f523b) <= 1000000) {
                    this.f526e++;
                    this.f527f += j9;
                    boolean[] zArr = this.f528g;
                    if (zArr[c6]) {
                        zArr[c6] = false;
                        this.f529h--;
                    }
                } else {
                    boolean[] zArr2 = this.f528g;
                    if (!zArr2[c6]) {
                        zArr2[c6] = true;
                        this.f529h++;
                    }
                }
            }
            this.f525d++;
            this.f524c = j6;
        }

        public void g() {
            this.f525d = 0L;
            this.f526e = 0L;
            this.f527f = 0L;
            this.f529h = 0;
            Arrays.fill(this.f528g, false);
        }
    }

    public long a() {
        if (e()) {
            return this.f516a.a();
        }
        return -9223372036854775807L;
    }

    public float b() {
        if (e()) {
            return (float) (1.0E9d / this.f516a.a());
        }
        return -1.0f;
    }

    public int c() {
        return this.f521f;
    }

    public long d() {
        if (e()) {
            return this.f516a.b();
        }
        return -9223372036854775807L;
    }

    public boolean e() {
        return this.f516a.e();
    }

    public void f(long j6) {
        this.f516a.f(j6);
        if (this.f516a.e() && !this.f519d) {
            this.f518c = false;
        } else if (this.f520e != -9223372036854775807L) {
            if (!this.f518c || this.f517b.d()) {
                this.f517b.g();
                this.f517b.f(this.f520e);
            }
            this.f518c = true;
            this.f517b.f(j6);
        }
        if (this.f518c && this.f517b.e()) {
            a aVar = this.f516a;
            this.f516a = this.f517b;
            this.f517b = aVar;
            this.f518c = false;
            this.f519d = false;
        }
        this.f520e = j6;
        this.f521f = this.f516a.e() ? 0 : this.f521f + 1;
    }

    public void g() {
        this.f516a.g();
        this.f517b.g();
        this.f518c = false;
        this.f520e = -9223372036854775807L;
        this.f521f = 0;
    }
}
