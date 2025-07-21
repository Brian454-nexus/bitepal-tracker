package n5;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public Class f17792a;

    /* renamed from: b, reason: collision with root package name */
    public Class f17793b;

    /* renamed from: c, reason: collision with root package name */
    public Class f17794c;

    public j() {
    }

    public void a(Class cls, Class cls2, Class cls3) {
        this.f17792a = cls;
        this.f17793b = cls2;
        this.f17794c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        return this.f17792a.equals(jVar.f17792a) && this.f17793b.equals(jVar.f17793b) && l.e(this.f17794c, jVar.f17794c);
    }

    public int hashCode() {
        int hashCode = ((this.f17792a.hashCode() * 31) + this.f17793b.hashCode()) * 31;
        Class cls = this.f17794c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f17792a + ", second=" + this.f17793b + '}';
    }

    public j(Class cls, Class cls2, Class cls3) {
        a(cls, cls2, cls3);
    }
}
