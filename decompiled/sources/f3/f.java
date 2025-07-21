package f3;

import android.database.Cursor;
import java.util.Collections;
import java.util.List;
import x2.AbstractC2268b;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    public final v2.u f14087a;

    /* renamed from: b, reason: collision with root package name */
    public final v2.i f14088b;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a extends v2.i {
        public a(v2.u uVar) {
            super(uVar);
        }

        @Override // v2.AbstractC2162A
        public String e() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        @Override // v2.i
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(A2.k kVar, C1294d c1294d) {
            if (c1294d.a() == null) {
                kVar.Q(1);
            } else {
                kVar.b(1, c1294d.a());
            }
            if (c1294d.b() == null) {
                kVar.Q(2);
            } else {
                kVar.A(2, c1294d.b().longValue());
            }
        }
    }

    public f(v2.u uVar) {
        this.f14087a = uVar;
        this.f14088b = new a(uVar);
    }

    public static List c() {
        return Collections.EMPTY_LIST;
    }

    @Override // f3.e
    public Long a(String str) {
        v2.x D6 = v2.x.D("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            D6.Q(1);
        } else {
            D6.b(1, str);
        }
        this.f14087a.d();
        Long l6 = null;
        Cursor b6 = AbstractC2268b.b(this.f14087a, D6, false, null);
        try {
            if (b6.moveToFirst() && !b6.isNull(0)) {
                l6 = Long.valueOf(b6.getLong(0));
            }
            return l6;
        } finally {
            b6.close();
            D6.R();
        }
    }

    @Override // f3.e
    public void b(C1294d c1294d) {
        this.f14087a.d();
        this.f14087a.e();
        try {
            this.f14088b.j(c1294d);
            this.f14087a.B();
        } finally {
            this.f14087a.i();
        }
    }
}
