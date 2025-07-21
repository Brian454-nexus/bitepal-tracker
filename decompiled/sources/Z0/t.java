package Z0;

import c1.AbstractC1117K;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class t {

    /* renamed from: c, reason: collision with root package name */
    public static final String f7052c = AbstractC1117K.x0(0);

    /* renamed from: d, reason: collision with root package name */
    public static final String f7053d = AbstractC1117K.x0(1);

    /* renamed from: a, reason: collision with root package name */
    public final String f7054a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7055b;

    public t(String str, String str2) {
        this.f7054a = AbstractC1117K.L0(str);
        this.f7055b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            t tVar = (t) obj;
            if (AbstractC1117K.c(this.f7054a, tVar.f7054a) && AbstractC1117K.c(this.f7055b, tVar.f7055b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f7055b.hashCode() * 31;
        String str = this.f7054a;
        return hashCode + (str != null ? str.hashCode() : 0);
    }
}
