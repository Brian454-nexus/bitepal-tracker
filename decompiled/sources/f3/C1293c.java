package f3;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import x2.AbstractC2268b;

/* renamed from: f3.c, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1293c implements InterfaceC1292b {

    /* renamed from: a, reason: collision with root package name */
    public final v2.u f14082a;

    /* renamed from: b, reason: collision with root package name */
    public final v2.i f14083b;

    /* renamed from: f3.c$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a extends v2.i {
        public a(v2.u uVar) {
            super(uVar);
        }

        @Override // v2.AbstractC2162A
        public String e() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        @Override // v2.i
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(A2.k kVar, C1291a c1291a) {
            if (c1291a.b() == null) {
                kVar.Q(1);
            } else {
                kVar.b(1, c1291a.b());
            }
            if (c1291a.a() == null) {
                kVar.Q(2);
            } else {
                kVar.b(2, c1291a.a());
            }
        }
    }

    public C1293c(v2.u uVar) {
        this.f14082a = uVar;
        this.f14083b = new a(uVar);
    }

    public static List e() {
        return Collections.EMPTY_LIST;
    }

    @Override // f3.InterfaceC1292b
    public void a(C1291a c1291a) {
        this.f14082a.d();
        this.f14082a.e();
        try {
            this.f14083b.j(c1291a);
            this.f14082a.B();
        } finally {
            this.f14082a.i();
        }
    }

    @Override // f3.InterfaceC1292b
    public List b(String str) {
        v2.x D6 = v2.x.D("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            D6.Q(1);
        } else {
            D6.b(1, str);
        }
        this.f14082a.d();
        Cursor b6 = AbstractC2268b.b(this.f14082a, D6, false, null);
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

    @Override // f3.InterfaceC1292b
    public boolean c(String str) {
        v2.x D6 = v2.x.D("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            D6.Q(1);
        } else {
            D6.b(1, str);
        }
        this.f14082a.d();
        boolean z6 = false;
        Cursor b6 = AbstractC2268b.b(this.f14082a, D6, false, null);
        try {
            if (b6.moveToFirst()) {
                z6 = b6.getInt(0) != 0;
            }
            return z6;
        } finally {
            b6.close();
            D6.R();
        }
    }

    @Override // f3.InterfaceC1292b
    public boolean d(String str) {
        v2.x D6 = v2.x.D("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            D6.Q(1);
        } else {
            D6.b(1, str);
        }
        this.f14082a.d();
        boolean z6 = false;
        Cursor b6 = AbstractC2268b.b(this.f14082a, D6, false, null);
        try {
            if (b6.moveToFirst()) {
                z6 = b6.getInt(0) != 0;
            }
            return z6;
        } finally {
            b6.close();
            D6.R();
        }
    }
}
