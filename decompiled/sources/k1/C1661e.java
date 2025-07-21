package k1;

import c1.AbstractC1117K;

/* renamed from: k1.e, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1661e {

    /* renamed from: a, reason: collision with root package name */
    public final String f16343a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16344b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16345c;

    public C1661e(String str, String str2, String str3) {
        this.f16343a = str;
        this.f16344b = str2;
        this.f16345c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1661e.class == obj.getClass()) {
            C1661e c1661e = (C1661e) obj;
            if (AbstractC1117K.c(this.f16343a, c1661e.f16343a) && AbstractC1117K.c(this.f16344b, c1661e.f16344b) && AbstractC1117K.c(this.f16345c, c1661e.f16345c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f16343a.hashCode() * 31;
        String str = this.f16344b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f16345c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
