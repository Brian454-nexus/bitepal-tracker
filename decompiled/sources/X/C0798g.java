package X;

import X.AbstractC0808q;

/* renamed from: X.g, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0798g extends AbstractC0808q {

    /* renamed from: a, reason: collision with root package name */
    public final y0 f5877a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0792a f5878b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5879c;

    /* renamed from: X.g$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends AbstractC0808q.a {

        /* renamed from: a, reason: collision with root package name */
        public y0 f5880a;

        /* renamed from: b, reason: collision with root package name */
        public AbstractC0792a f5881b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f5882c;

        @Override // X.AbstractC0808q.a
        public AbstractC0808q a() {
            String str = "";
            if (this.f5880a == null) {
                str = " videoSpec";
            }
            if (this.f5881b == null) {
                str = str + " audioSpec";
            }
            if (this.f5882c == null) {
                str = str + " outputFormat";
            }
            if (str.isEmpty()) {
                return new C0798g(this.f5880a, this.f5881b, this.f5882c.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // X.AbstractC0808q.a
        public y0 c() {
            y0 y0Var = this.f5880a;
            if (y0Var != null) {
                return y0Var;
            }
            throw new IllegalStateException("Property \"videoSpec\" has not been set");
        }

        @Override // X.AbstractC0808q.a
        public AbstractC0808q.a d(AbstractC0792a abstractC0792a) {
            if (abstractC0792a == null) {
                throw new NullPointerException("Null audioSpec");
            }
            this.f5881b = abstractC0792a;
            return this;
        }

        @Override // X.AbstractC0808q.a
        public AbstractC0808q.a e(int i6) {
            this.f5882c = Integer.valueOf(i6);
            return this;
        }

        @Override // X.AbstractC0808q.a
        public AbstractC0808q.a f(y0 y0Var) {
            if (y0Var == null) {
                throw new NullPointerException("Null videoSpec");
            }
            this.f5880a = y0Var;
            return this;
        }

        public b() {
        }

        public b(AbstractC0808q abstractC0808q) {
            this.f5880a = abstractC0808q.d();
            this.f5881b = abstractC0808q.b();
            this.f5882c = Integer.valueOf(abstractC0808q.c());
        }
    }

    @Override // X.AbstractC0808q
    public AbstractC0792a b() {
        return this.f5878b;
    }

    @Override // X.AbstractC0808q
    public int c() {
        return this.f5879c;
    }

    @Override // X.AbstractC0808q
    public y0 d() {
        return this.f5877a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0808q) {
            AbstractC0808q abstractC0808q = (AbstractC0808q) obj;
            if (this.f5877a.equals(abstractC0808q.d()) && this.f5878b.equals(abstractC0808q.b()) && this.f5879c == abstractC0808q.c()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f5877a.hashCode() ^ 1000003) * 1000003) ^ this.f5878b.hashCode()) * 1000003) ^ this.f5879c;
    }

    @Override // X.AbstractC0808q
    public AbstractC0808q.a i() {
        return new b(this);
    }

    public String toString() {
        return "MediaSpec{videoSpec=" + this.f5877a + ", audioSpec=" + this.f5878b + ", outputFormat=" + this.f5879c + "}";
    }

    public C0798g(y0 y0Var, AbstractC0792a abstractC0792a, int i6) {
        this.f5877a = y0Var;
        this.f5878b = abstractC0792a;
        this.f5879c = i6;
    }
}
