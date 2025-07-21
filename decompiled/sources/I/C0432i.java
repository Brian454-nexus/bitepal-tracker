package I;

import I.L0;
import java.util.List;

/* renamed from: I.i, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0432i extends L0.e {

    /* renamed from: a, reason: collision with root package name */
    public final W f2455a;

    /* renamed from: b, reason: collision with root package name */
    public final List f2456b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2457c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2458d;

    /* renamed from: e, reason: collision with root package name */
    public final F.C f2459e;

    /* renamed from: I.i$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends L0.e.a {

        /* renamed from: a, reason: collision with root package name */
        public W f2460a;

        /* renamed from: b, reason: collision with root package name */
        public List f2461b;

        /* renamed from: c, reason: collision with root package name */
        public String f2462c;

        /* renamed from: d, reason: collision with root package name */
        public Integer f2463d;

        /* renamed from: e, reason: collision with root package name */
        public F.C f2464e;

        @Override // I.L0.e.a
        public L0.e a() {
            String str = "";
            if (this.f2460a == null) {
                str = " surface";
            }
            if (this.f2461b == null) {
                str = str + " sharedSurfaces";
            }
            if (this.f2463d == null) {
                str = str + " surfaceGroupId";
            }
            if (this.f2464e == null) {
                str = str + " dynamicRange";
            }
            if (str.isEmpty()) {
                return new C0432i(this.f2460a, this.f2461b, this.f2462c, this.f2463d.intValue(), this.f2464e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // I.L0.e.a
        public L0.e.a b(F.C c6) {
            if (c6 == null) {
                throw new NullPointerException("Null dynamicRange");
            }
            this.f2464e = c6;
            return this;
        }

        @Override // I.L0.e.a
        public L0.e.a c(String str) {
            this.f2462c = str;
            return this;
        }

        @Override // I.L0.e.a
        public L0.e.a d(List list) {
            if (list == null) {
                throw new NullPointerException("Null sharedSurfaces");
            }
            this.f2461b = list;
            return this;
        }

        @Override // I.L0.e.a
        public L0.e.a e(int i6) {
            this.f2463d = Integer.valueOf(i6);
            return this;
        }

        public L0.e.a f(W w6) {
            if (w6 == null) {
                throw new NullPointerException("Null surface");
            }
            this.f2460a = w6;
            return this;
        }
    }

    @Override // I.L0.e
    public F.C b() {
        return this.f2459e;
    }

    @Override // I.L0.e
    public String c() {
        return this.f2457c;
    }

    @Override // I.L0.e
    public List d() {
        return this.f2456b;
    }

    @Override // I.L0.e
    public W e() {
        return this.f2455a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof L0.e) {
            L0.e eVar = (L0.e) obj;
            if (this.f2455a.equals(eVar.e()) && this.f2456b.equals(eVar.d()) && ((str = this.f2457c) != null ? str.equals(eVar.c()) : eVar.c() == null) && this.f2458d == eVar.f() && this.f2459e.equals(eVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // I.L0.e
    public int f() {
        return this.f2458d;
    }

    public int hashCode() {
        int hashCode = (((this.f2455a.hashCode() ^ 1000003) * 1000003) ^ this.f2456b.hashCode()) * 1000003;
        String str = this.f2457c;
        return ((((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f2458d) * 1000003) ^ this.f2459e.hashCode();
    }

    public String toString() {
        return "OutputConfig{surface=" + this.f2455a + ", sharedSurfaces=" + this.f2456b + ", physicalCameraId=" + this.f2457c + ", surfaceGroupId=" + this.f2458d + ", dynamicRange=" + this.f2459e + "}";
    }

    public C0432i(W w6, List list, String str, int i6, F.C c6) {
        this.f2455a = w6;
        this.f2456b = list;
        this.f2457c = str;
        this.f2458d = i6;
        this.f2459e = c6;
    }
}
