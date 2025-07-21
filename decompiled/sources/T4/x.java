package T4;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class x implements R4.f {

    /* renamed from: j, reason: collision with root package name */
    public static final n5.h f5128j = new n5.h(50);

    /* renamed from: b, reason: collision with root package name */
    public final U4.b f5129b;

    /* renamed from: c, reason: collision with root package name */
    public final R4.f f5130c;

    /* renamed from: d, reason: collision with root package name */
    public final R4.f f5131d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5132e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5133f;

    /* renamed from: g, reason: collision with root package name */
    public final Class f5134g;

    /* renamed from: h, reason: collision with root package name */
    public final R4.h f5135h;

    /* renamed from: i, reason: collision with root package name */
    public final R4.l f5136i;

    public x(U4.b bVar, R4.f fVar, R4.f fVar2, int i6, int i7, R4.l lVar, Class cls, R4.h hVar) {
        this.f5129b = bVar;
        this.f5130c = fVar;
        this.f5131d = fVar2;
        this.f5132e = i6;
        this.f5133f = i7;
        this.f5136i = lVar;
        this.f5134g = cls;
        this.f5135h = hVar;
    }

    @Override // R4.f
    public void a(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f5129b.c(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f5132e).putInt(this.f5133f).array();
        this.f5131d.a(messageDigest);
        this.f5130c.a(messageDigest);
        messageDigest.update(bArr);
        R4.l lVar = this.f5136i;
        if (lVar != null) {
            lVar.a(messageDigest);
        }
        this.f5135h.a(messageDigest);
        messageDigest.update(c());
        this.f5129b.put(bArr);
    }

    public final byte[] c() {
        n5.h hVar = f5128j;
        byte[] bArr = (byte[]) hVar.g(this.f5134g);
        if (bArr != null) {
            return bArr;
        }
        byte[] bytes = this.f5134g.getName().getBytes(R4.f.f4618a);
        hVar.k(this.f5134g, bytes);
        return bytes;
    }

    @Override // R4.f
    public boolean equals(Object obj) {
        if (obj instanceof x) {
            x xVar = (x) obj;
            if (this.f5133f == xVar.f5133f && this.f5132e == xVar.f5132e && n5.l.e(this.f5136i, xVar.f5136i) && this.f5134g.equals(xVar.f5134g) && this.f5130c.equals(xVar.f5130c) && this.f5131d.equals(xVar.f5131d) && this.f5135h.equals(xVar.f5135h)) {
                return true;
            }
        }
        return false;
    }

    @Override // R4.f
    public int hashCode() {
        int hashCode = (((((this.f5130c.hashCode() * 31) + this.f5131d.hashCode()) * 31) + this.f5132e) * 31) + this.f5133f;
        R4.l lVar = this.f5136i;
        if (lVar != null) {
            hashCode = (hashCode * 31) + lVar.hashCode();
        }
        return (((hashCode * 31) + this.f5134g.hashCode()) * 31) + this.f5135h.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f5130c + ", signature=" + this.f5131d + ", width=" + this.f5132e + ", height=" + this.f5133f + ", decodedResourceClass=" + this.f5134g + ", transformation='" + this.f5136i + "', options=" + this.f5135h + '}';
    }
}
