package X2;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import g3.AbstractC1384p;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final String f6200a = W2.k.i("Schedulers");

    public static t a(Context context, E e6) {
        a3.e eVar = new a3.e(context, e6);
        AbstractC1384p.a(context, SystemJobService.class, true);
        W2.k.e().a(f6200a, "Created SystemJobScheduler and enabled SystemJobService");
        return eVar;
    }

    public static void b(androidx.work.a aVar, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        f3.v J6 = workDatabase.J();
        workDatabase.e();
        try {
            List f6 = J6.f(aVar.h());
            List t6 = J6.t(200);
            if (f6 != null && f6.size() > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                Iterator it = f6.iterator();
                while (it.hasNext()) {
                    J6.c(((f3.u) it.next()).f14117a, currentTimeMillis);
                }
            }
            workDatabase.B();
            workDatabase.i();
            if (f6 != null && f6.size() > 0) {
                f3.u[] uVarArr = (f3.u[]) f6.toArray(new f3.u[f6.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    t tVar = (t) it2.next();
                    if (tVar.d()) {
                        tVar.a(uVarArr);
                    }
                }
            }
            if (t6 == null || t6.size() <= 0) {
                return;
            }
            f3.u[] uVarArr2 = (f3.u[]) t6.toArray(new f3.u[t6.size()]);
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                t tVar2 = (t) it3.next();
                if (!tVar2.d()) {
                    tVar2.a(uVarArr2);
                }
            }
        } catch (Throwable th) {
            workDatabase.i();
            throw th;
        }
    }
}
