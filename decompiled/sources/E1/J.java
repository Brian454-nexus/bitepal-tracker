package E1;

import c1.AbstractC1119a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface J {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final K f911a;

        /* renamed from: b, reason: collision with root package name */
        public final K f912b;

        public a(K k6) {
            this(k6, k6);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f911a.equals(aVar.f911a) && this.f912b.equals(aVar.f912b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f911a.hashCode() * 31) + this.f912b.hashCode();
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append(this.f911a);
            if (this.f911a.equals(this.f912b)) {
                str = "";
            } else {
                str = ", " + this.f912b;
            }
            sb.append(str);
            sb.append("]");
            return sb.toString();
        }

        public a(K k6, K k7) {
            this.f911a = (K) AbstractC1119a.e(k6);
            this.f912b = (K) AbstractC1119a.e(k7);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b implements J {

        /* renamed from: a, reason: collision with root package name */
        public final long f913a;

        /* renamed from: b, reason: collision with root package name */
        public final a f914b;

        public b(long j6) {
            this(j6, 0L);
        }

        @Override // E1.J
        public boolean f() {
            return false;
        }

        @Override // E1.J
        public a j(long j6) {
            return this.f914b;
        }

        @Override // E1.J
        public long l() {
            return this.f913a;
        }

        public b(long j6, long j7) {
            this.f913a = j6;
            this.f914b = new a(j7 == 0 ? K.f915c : new K(0L, j7));
        }
    }

    boolean f();

    a j(long j6);

    long l();
}
