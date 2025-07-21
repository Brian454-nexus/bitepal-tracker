package X;

import X.C0807p;
import android.location.Location;
import java.io.File;

/* renamed from: X.f, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0797f extends C0807p.b {

    /* renamed from: a, reason: collision with root package name */
    public final long f5864a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5865b;

    /* renamed from: c, reason: collision with root package name */
    public final Location f5866c;

    /* renamed from: d, reason: collision with root package name */
    public final File f5867d;

    /* renamed from: X.f$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends C0807p.b.a {

        /* renamed from: a, reason: collision with root package name */
        public Long f5868a;

        /* renamed from: b, reason: collision with root package name */
        public Long f5869b;

        /* renamed from: c, reason: collision with root package name */
        public Location f5870c;

        /* renamed from: d, reason: collision with root package name */
        public File f5871d;

        @Override // X.C0807p.b.a
        public C0807p.b c() {
            String str = "";
            if (this.f5868a == null) {
                str = " fileSizeLimit";
            }
            if (this.f5869b == null) {
                str = str + " durationLimitMillis";
            }
            if (this.f5871d == null) {
                str = str + " file";
            }
            if (str.isEmpty()) {
                return new C0797f(this.f5868a.longValue(), this.f5869b.longValue(), this.f5870c, this.f5871d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // X.C0807p.b.a
        public C0807p.b.a d(File file) {
            if (file == null) {
                throw new NullPointerException("Null file");
            }
            this.f5871d = file;
            return this;
        }

        @Override // X.r.b.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public C0807p.b.a a(long j6) {
            this.f5869b = Long.valueOf(j6);
            return this;
        }

        @Override // X.r.b.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C0807p.b.a b(long j6) {
            this.f5868a = Long.valueOf(j6);
            return this;
        }
    }

    @Override // X.r.b
    public long a() {
        return this.f5865b;
    }

    @Override // X.r.b
    public long b() {
        return this.f5864a;
    }

    @Override // X.r.b
    public Location c() {
        return this.f5866c;
    }

    @Override // X.C0807p.b
    public File d() {
        return this.f5867d;
    }

    public boolean equals(Object obj) {
        Location location;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0807p.b) {
            C0807p.b bVar = (C0807p.b) obj;
            if (this.f5864a == bVar.b() && this.f5865b == bVar.a() && ((location = this.f5866c) != null ? location.equals(bVar.c()) : bVar.c() == null) && this.f5867d.equals(bVar.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j6 = this.f5864a;
        long j7 = this.f5865b;
        int i6 = (((((int) (j6 ^ (j6 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j7 >>> 32) ^ j7))) * 1000003;
        Location location = this.f5866c;
        return ((i6 ^ (location == null ? 0 : location.hashCode())) * 1000003) ^ this.f5867d.hashCode();
    }

    public String toString() {
        return "FileOutputOptionsInternal{fileSizeLimit=" + this.f5864a + ", durationLimitMillis=" + this.f5865b + ", location=" + this.f5866c + ", file=" + this.f5867d + "}";
    }

    public C0797f(long j6, long j7, Location location, File file) {
        this.f5864a = j6;
        this.f5865b = j7;
        this.f5866c = location;
        this.f5867d = file;
    }
}
