package T4;

import java.security.MessageDigest;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class n implements R4.f {

    /* renamed from: b, reason: collision with root package name */
    public final Object f5082b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5083c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5084d;

    /* renamed from: e, reason: collision with root package name */
    public final Class f5085e;

    /* renamed from: f, reason: collision with root package name */
    public final Class f5086f;

    /* renamed from: g, reason: collision with root package name */
    public final R4.f f5087g;

    /* renamed from: h, reason: collision with root package name */
    public final Map f5088h;

    /* renamed from: i, reason: collision with root package name */
    public final R4.h f5089i;

    /* renamed from: j, reason: collision with root package name */
    public int f5090j;

    public n(Object obj, R4.f fVar, int i6, int i7, Map map, Class cls, Class cls2, R4.h hVar) {
        this.f5082b = n5.k.d(obj);
        this.f5087g = (R4.f) n5.k.e(fVar, "Signature must not be null");
        this.f5083c = i6;
        this.f5084d = i7;
        this.f5088h = (Map) n5.k.d(map);
        this.f5085e = (Class) n5.k.e(cls, "Resource class must not be null");
        this.f5086f = (Class) n5.k.e(cls2, "Transcode class must not be null");
        this.f5089i = (R4.h) n5.k.d(hVar);
    }

    @Override // R4.f
    public void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // R4.f
    public boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.f5082b.equals(nVar.f5082b) && this.f5087g.equals(nVar.f5087g) && this.f5084d == nVar.f5084d && this.f5083c == nVar.f5083c && this.f5088h.equals(nVar.f5088h) && this.f5085e.equals(nVar.f5085e) && this.f5086f.equals(nVar.f5086f) && this.f5089i.equals(nVar.f5089i)) {
                return true;
            }
        }
        return false;
    }

    @Override // R4.f
    public int hashCode() {
        if (this.f5090j == 0) {
            int hashCode = this.f5082b.hashCode();
            this.f5090j = hashCode;
            int hashCode2 = (((((hashCode * 31) + this.f5087g.hashCode()) * 31) + this.f5083c) * 31) + this.f5084d;
            this.f5090j = hashCode2;
            int hashCode3 = (hashCode2 * 31) + this.f5088h.hashCode();
            this.f5090j = hashCode3;
            int hashCode4 = (hashCode3 * 31) + this.f5085e.hashCode();
            this.f5090j = hashCode4;
            int hashCode5 = (hashCode4 * 31) + this.f5086f.hashCode();
            this.f5090j = hashCode5;
            this.f5090j = (hashCode5 * 31) + this.f5089i.hashCode();
        }
        return this.f5090j;
    }

    public String toString() {
        return "EngineKey{model=" + this.f5082b + ", width=" + this.f5083c + ", height=" + this.f5084d + ", resourceClass=" + this.f5085e + ", transcodeClass=" + this.f5086f + ", signature=" + this.f5087g + ", hashCode=" + this.f5090j + ", transformations=" + this.f5088h + ", options=" + this.f5089i + '}';
    }
}
