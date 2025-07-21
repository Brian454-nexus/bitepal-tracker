package f3;

import android.database.Cursor;
import f3.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import v2.AbstractC2162A;
import x2.AbstractC2267a;
import x2.AbstractC2268b;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    public final v2.u f14093a;

    /* renamed from: b, reason: collision with root package name */
    public final v2.i f14094b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC2162A f14095c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC2162A f14096d;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a extends v2.i {
        public a(v2.u uVar) {
            super(uVar);
        }

        @Override // v2.AbstractC2162A
        public String e() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
        }

        @Override // v2.i
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(A2.k kVar, i iVar) {
            String str = iVar.f14090a;
            if (str == null) {
                kVar.Q(1);
            } else {
                kVar.b(1, str);
            }
            kVar.A(2, iVar.a());
            kVar.A(3, iVar.f14092c);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class b extends AbstractC2162A {
        public b(v2.u uVar) {
            super(uVar);
        }

        @Override // v2.AbstractC2162A
        public String e() {
            return "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class c extends AbstractC2162A {
        public c(v2.u uVar) {
            super(uVar);
        }

        @Override // v2.AbstractC2162A
        public String e() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public k(v2.u uVar) {
        this.f14093a = uVar;
        this.f14094b = new a(uVar);
        this.f14095c = new b(uVar);
        this.f14096d = new c(uVar);
    }

    public static List h() {
        return Collections.EMPTY_LIST;
    }

    @Override // f3.j
    public List a() {
        v2.x D6 = v2.x.D("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.f14093a.d();
        Cursor b6 = AbstractC2268b.b(this.f14093a, D6, false, null);
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

    @Override // f3.j
    public void b(m mVar) {
        j.a.b(this, mVar);
    }

    @Override // f3.j
    public void c(i iVar) {
        this.f14093a.d();
        this.f14093a.e();
        try {
            this.f14094b.j(iVar);
            this.f14093a.B();
        } finally {
            this.f14093a.i();
        }
    }

    @Override // f3.j
    public void d(String str, int i6) {
        this.f14093a.d();
        A2.k b6 = this.f14095c.b();
        if (str == null) {
            b6.Q(1);
        } else {
            b6.b(1, str);
        }
        b6.A(2, i6);
        this.f14093a.e();
        try {
            b6.p();
            this.f14093a.B();
        } finally {
            this.f14093a.i();
            this.f14095c.h(b6);
        }
    }

    @Override // f3.j
    public i e(m mVar) {
        return j.a.a(this, mVar);
    }

    @Override // f3.j
    public void f(String str) {
        this.f14093a.d();
        A2.k b6 = this.f14096d.b();
        if (str == null) {
            b6.Q(1);
        } else {
            b6.b(1, str);
        }
        this.f14093a.e();
        try {
            b6.p();
            this.f14093a.B();
        } finally {
            this.f14093a.i();
            this.f14096d.h(b6);
        }
    }

    @Override // f3.j
    public i g(String str, int i6) {
        v2.x D6 = v2.x.D("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?", 2);
        if (str == null) {
            D6.Q(1);
        } else {
            D6.b(1, str);
        }
        D6.A(2, i6);
        this.f14093a.d();
        i iVar = null;
        String string = null;
        Cursor b6 = AbstractC2268b.b(this.f14093a, D6, false, null);
        try {
            int d6 = AbstractC2267a.d(b6, "work_spec_id");
            int d7 = AbstractC2267a.d(b6, "generation");
            int d8 = AbstractC2267a.d(b6, "system_id");
            if (b6.moveToFirst()) {
                if (!b6.isNull(d6)) {
                    string = b6.getString(d6);
                }
                iVar = new i(string, b6.getInt(d7), b6.getInt(d8));
            }
            return iVar;
        } finally {
            b6.close();
            D6.R();
        }
    }
}
