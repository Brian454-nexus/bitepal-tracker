package f3;

import android.database.Cursor;
import f3.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import v2.AbstractC2162A;
import x2.AbstractC2268b;

/* renamed from: f3.A, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1289A implements z {

    /* renamed from: a, reason: collision with root package name */
    public final v2.u f14070a;

    /* renamed from: b, reason: collision with root package name */
    public final v2.i f14071b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC2162A f14072c;

    /* renamed from: f3.A$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a extends v2.i {
        public a(v2.u uVar) {
            super(uVar);
        }

        @Override // v2.AbstractC2162A
        public String e() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // v2.i
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(A2.k kVar, y yVar) {
            if (yVar.a() == null) {
                kVar.Q(1);
            } else {
                kVar.b(1, yVar.a());
            }
            if (yVar.b() == null) {
                kVar.Q(2);
            } else {
                kVar.b(2, yVar.b());
            }
        }
    }

    /* renamed from: f3.A$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class b extends AbstractC2162A {
        public b(v2.u uVar) {
            super(uVar);
        }

        @Override // v2.AbstractC2162A
        public String e() {
            return "DELETE FROM worktag WHERE work_spec_id=?";
        }
    }

    public C1289A(v2.u uVar) {
        this.f14070a = uVar;
        this.f14071b = new a(uVar);
        this.f14072c = new b(uVar);
    }

    public static List e() {
        return Collections.EMPTY_LIST;
    }

    @Override // f3.z
    public void a(y yVar) {
        this.f14070a.d();
        this.f14070a.e();
        try {
            this.f14071b.j(yVar);
            this.f14070a.B();
        } finally {
            this.f14070a.i();
        }
    }

    @Override // f3.z
    public List b(String str) {
        v2.x D6 = v2.x.D("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            D6.Q(1);
        } else {
            D6.b(1, str);
        }
        this.f14070a.d();
        Cursor b6 = AbstractC2268b.b(this.f14070a, D6, false, null);
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

    @Override // f3.z
    public void c(String str, Set set) {
        z.a.a(this, str, set);
    }

    @Override // f3.z
    public void d(String str) {
        this.f14070a.d();
        A2.k b6 = this.f14072c.b();
        if (str == null) {
            b6.Q(1);
        } else {
            b6.b(1, str);
        }
        this.f14070a.e();
        try {
            b6.p();
            this.f14070a.B();
        } finally {
            this.f14070a.i();
            this.f14072c.h(b6);
        }
    }
}
