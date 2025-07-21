package k1;

import android.net.Uri;
import c1.AbstractC1113G;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final long f16361a;

    /* renamed from: b, reason: collision with root package name */
    public final long f16362b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16363c;

    /* renamed from: d, reason: collision with root package name */
    public int f16364d;

    public i(String str, long j6, long j7) {
        this.f16363c = str == null ? "" : str;
        this.f16361a = j6;
        this.f16362b = j7;
    }

    public i a(i iVar, String str) {
        String c6 = c(str);
        i iVar2 = null;
        if (iVar != null && c6.equals(iVar.c(str))) {
            long j6 = this.f16362b;
            if (j6 != -1) {
                long j7 = this.f16361a;
                if (j7 + j6 == iVar.f16361a) {
                    long j8 = iVar.f16362b;
                    return new i(c6, j7, j8 != -1 ? j6 + j8 : -1L);
                }
            }
            long j9 = iVar.f16362b;
            if (j9 != -1) {
                long j10 = iVar.f16361a;
                if (j10 + j9 == this.f16361a) {
                    iVar2 = new i(c6, j10, j6 != -1 ? j9 + j6 : -1L);
                }
            }
        }
        return iVar2;
    }

    public Uri b(String str) {
        return AbstractC1113G.f(str, this.f16363c);
    }

    public String c(String str) {
        return AbstractC1113G.e(str, this.f16363c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (this.f16361a == iVar.f16361a && this.f16362b == iVar.f16362b && this.f16363c.equals(iVar.f16363c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f16364d == 0) {
            this.f16364d = ((((527 + ((int) this.f16361a)) * 31) + ((int) this.f16362b)) * 31) + this.f16363c.hashCode();
        }
        return this.f16364d;
    }

    public String toString() {
        return "RangedUri(referenceUri=" + this.f16363c + ", start=" + this.f16361a + ", length=" + this.f16362b + ")";
    }
}
