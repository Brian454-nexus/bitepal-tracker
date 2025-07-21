package f3;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import x2.AbstractC2268b;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class p implements o {

    /* renamed from: a, reason: collision with root package name */
    public final v2.u f14104a;

    /* renamed from: b, reason: collision with root package name */
    public final v2.i f14105b;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a extends v2.i {
        public a(v2.u uVar) {
            super(uVar);
        }

        @Override // v2.AbstractC2162A
        public String e() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // v2.i
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(A2.k kVar, n nVar) {
            if (nVar.a() == null) {
                kVar.Q(1);
            } else {
                kVar.b(1, nVar.a());
            }
            if (nVar.b() == null) {
                kVar.Q(2);
            } else {
                kVar.b(2, nVar.b());
            }
        }
    }

    public p(v2.u uVar) {
        this.f14104a = uVar;
        this.f14105b = new a(uVar);
    }

    public static List c() {
        return Collections.EMPTY_LIST;
    }

    @Override // f3.o
    public void a(n nVar) {
        this.f14104a.d();
        this.f14104a.e();
        try {
            this.f14105b.j(nVar);
            this.f14104a.B();
        } finally {
            this.f14104a.i();
        }
    }

    @Override // f3.o
    public List b(String str) {
        v2.x D6 = v2.x.D("SELECT name FROM workname WHERE work_spec_id=?", 1);
        if (str == null) {
            D6.Q(1);
        } else {
            D6.b(1, str);
        }
        this.f14104a.d();
        Cursor b6 = AbstractC2268b.b(this.f14104a, D6, false, null);
        try {
            ArrayList arrayList = new ArrayList(b6.getCount());
            while (b6.moveToNext()) {
                arrayList.add(b6.isNull(0) ? null : b6.getString(0));
            }
            return arrayList;
        } finally {
            b6.close();
            D6.R();
        }
    }
}
