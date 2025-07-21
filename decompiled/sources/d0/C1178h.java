package d0;

import I.InterfaceC0423d0;
import d0.AbstractC1175e;

/* renamed from: d0.h, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1178h extends AbstractC1175e {

    /* renamed from: a, reason: collision with root package name */
    public final String f13342a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13343b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0423d0.a f13344c;

    /* renamed from: d0.h$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends AbstractC1175e.a {

        /* renamed from: a, reason: collision with root package name */
        public String f13345a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f13346b;

        /* renamed from: c, reason: collision with root package name */
        public InterfaceC0423d0.a f13347c;

        @Override // d0.AbstractC1175e.a
        public AbstractC1175e b() {
            String str = "";
            if (this.f13345a == null) {
                str = " mimeType";
            }
            if (this.f13346b == null) {
                str = str + " profile";
            }
            if (str.isEmpty()) {
                return new C1178h(this.f13345a, this.f13346b.intValue(), this.f13347c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // d0.AbstractC1175e.a
        public AbstractC1175e.a c(InterfaceC0423d0.a aVar) {
            this.f13347c = aVar;
            return this;
        }

        public AbstractC1175e.a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null mimeType");
            }
            this.f13345a = str;
            return this;
        }

        @Override // d0.j.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public AbstractC1175e.a a(int i6) {
            this.f13346b = Integer.valueOf(i6);
            return this;
        }
    }

    @Override // d0.j
    public String a() {
        return this.f13342a;
    }

    @Override // d0.j
    public int b() {
        return this.f13343b;
    }

    @Override // d0.AbstractC1175e
    public InterfaceC0423d0.a d() {
        return this.f13344c;
    }

    public boolean equals(Object obj) {
        InterfaceC0423d0.a aVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1175e) {
            AbstractC1175e abstractC1175e = (AbstractC1175e) obj;
            if (this.f13342a.equals(abstractC1175e.a()) && this.f13343b == abstractC1175e.b() && ((aVar = this.f13344c) != null ? aVar.equals(abstractC1175e.d()) : abstractC1175e.d() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((this.f13342a.hashCode() ^ 1000003) * 1000003) ^ this.f13343b) * 1000003;
        InterfaceC0423d0.a aVar = this.f13344c;
        return hashCode ^ (aVar == null ? 0 : aVar.hashCode());
    }

    public String toString() {
        return "AudioMimeInfo{mimeType=" + this.f13342a + ", profile=" + this.f13343b + ", compatibleAudioProfile=" + this.f13344c + "}";
    }

    public C1178h(String str, int i6, InterfaceC0423d0.a aVar) {
        this.f13342a = str;
        this.f13343b = i6;
        this.f13344c = aVar;
    }
}
