package k1;

import c1.AbstractC1117K;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f16356a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16357b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16358c;

    /* renamed from: d, reason: collision with root package name */
    public final String f16359d;

    /* renamed from: e, reason: collision with root package name */
    public final String f16360e;

    public h(String str, String str2, String str3, String str4, String str5) {
        this.f16356a = str;
        this.f16357b = str2;
        this.f16358c = str3;
        this.f16359d = str4;
        this.f16360e = str5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return AbstractC1117K.c(this.f16356a, hVar.f16356a) && AbstractC1117K.c(this.f16357b, hVar.f16357b) && AbstractC1117K.c(this.f16358c, hVar.f16358c) && AbstractC1117K.c(this.f16359d, hVar.f16359d) && AbstractC1117K.c(this.f16360e, hVar.f16360e);
    }

    public int hashCode() {
        String str = this.f16356a;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f16357b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f16358c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f16359d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f16360e;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
