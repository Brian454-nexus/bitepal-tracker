package A1;

import A1.k;
import A1.l;
import Z0.z;
import e1.C1249g;
import e1.C1258p;
import e1.C1261s;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class j implements k {

    /* renamed from: a, reason: collision with root package name */
    public final int f126a;

    public j() {
        this(-1);
    }

    @Override // A1.k
    public long a(k.c cVar) {
        IOException iOException = cVar.f135c;
        if ((iOException instanceof z) || (iOException instanceof FileNotFoundException) || (iOException instanceof C1258p) || (iOException instanceof l.h) || C1249g.a(iOException)) {
            return -9223372036854775807L;
        }
        return Math.min((cVar.f136d - 1) * 1000, 5000);
    }

    @Override // A1.k
    public k.b c(k.a aVar, k.c cVar) {
        if (!e(cVar.f135c)) {
            return null;
        }
        if (aVar.a(1)) {
            return new k.b(1, 300000L);
        }
        if (aVar.a(2)) {
            return new k.b(2, 60000L);
        }
        return null;
    }

    @Override // A1.k
    public int d(int i6) {
        int i7 = this.f126a;
        return i7 == -1 ? i6 == 7 ? 6 : 3 : i7;
    }

    public boolean e(IOException iOException) {
        if (!(iOException instanceof C1261s)) {
            return false;
        }
        int i6 = ((C1261s) iOException).f13888d;
        return i6 == 403 || i6 == 404 || i6 == 410 || i6 == 416 || i6 == 500 || i6 == 503;
    }

    public j(int i6) {
        this.f126a = i6;
    }
}
