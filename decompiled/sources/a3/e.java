package a3;

import W2.k;
import W2.o;
import X2.E;
import X2.t;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import f3.i;
import f3.l;
import f3.m;
import f3.u;
import f3.v;
import f3.x;
import g3.C1379k;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import y0.InterfaceC2343a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class e implements t {

    /* renamed from: e, reason: collision with root package name */
    public static final String f7697e = k.i("SystemJobScheduler");

    /* renamed from: a, reason: collision with root package name */
    public final Context f7698a;

    /* renamed from: b, reason: collision with root package name */
    public final JobScheduler f7699b;

    /* renamed from: c, reason: collision with root package name */
    public final E f7700c;

    /* renamed from: d, reason: collision with root package name */
    public final d f7701d;

    public e(Context context, E e6) {
        this(context, e6, (JobScheduler) context.getSystemService("jobscheduler"), new d(context));
    }

    public static void b(Context context) {
        List g6;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler == null || (g6 = g(context, jobScheduler)) == null || g6.isEmpty()) {
            return;
        }
        Iterator it = g6.iterator();
        while (it.hasNext()) {
            c(jobScheduler, ((JobInfo) it.next()).getId());
        }
    }

    public static void c(JobScheduler jobScheduler, int i6) {
        try {
            jobScheduler.cancel(i6);
        } catch (Throwable th) {
            k.e().d(f7697e, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i6)), th);
        }
    }

    public static List f(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> g6 = g(context, jobScheduler);
        if (g6 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : g6) {
            m h6 = h(jobInfo);
            if (h6 != null && str.equals(h6.b())) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    public static List g(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            k.e().d(f7697e, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : list) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static m h(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new m(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public static boolean i(Context context, E e6) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> g6 = g(context, jobScheduler);
        List a6 = e6.r().G().a();
        boolean z6 = false;
        HashSet hashSet = new HashSet(g6 != null ? g6.size() : 0);
        if (g6 != null && !g6.isEmpty()) {
            for (JobInfo jobInfo : g6) {
                m h6 = h(jobInfo);
                if (h6 != null) {
                    hashSet.add(h6.b());
                } else {
                    c(jobScheduler, jobInfo.getId());
                }
            }
        }
        Iterator it = a6.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (!hashSet.contains((String) it.next())) {
                k.e().a(f7697e, "Reconciling jobs");
                z6 = true;
                break;
            }
        }
        if (!z6) {
            return z6;
        }
        WorkDatabase r6 = e6.r();
        r6.e();
        try {
            v J6 = r6.J();
            Iterator it2 = a6.iterator();
            while (it2.hasNext()) {
                J6.c((String) it2.next(), -1L);
            }
            r6.B();
            r6.i();
            return z6;
        } catch (Throwable th) {
            r6.i();
            throw th;
        }
    }

    @Override // X2.t
    public void a(u... uVarArr) {
        WorkDatabase r6 = this.f7700c.r();
        C1379k c1379k = new C1379k(r6);
        for (u uVar : uVarArr) {
            r6.e();
            try {
                u n6 = r6.J().n(uVar.f14117a);
                if (n6 == null) {
                    k.e().k(f7697e, "Skipping scheduling " + uVar.f14117a + " because it's no longer in the DB");
                    r6.B();
                } else if (n6.f14118b != W2.u.ENQUEUED) {
                    k.e().k(f7697e, "Skipping scheduling " + uVar.f14117a + " because it is no longer enqueued");
                    r6.B();
                } else {
                    m a6 = x.a(uVar);
                    i e6 = r6.G().e(a6);
                    int e7 = e6 != null ? e6.f14092c : c1379k.e(this.f7700c.k().i(), this.f7700c.k().g());
                    if (e6 == null) {
                        this.f7700c.r().G().c(l.a(a6, e7));
                    }
                    j(uVar, e7);
                    r6.B();
                }
            } finally {
                r6.i();
            }
        }
    }

    @Override // X2.t
    public boolean d() {
        return true;
    }

    @Override // X2.t
    public void e(String str) {
        List f6 = f(this.f7698a, this.f7699b, str);
        if (f6 == null || f6.isEmpty()) {
            return;
        }
        Iterator it = f6.iterator();
        while (it.hasNext()) {
            c(this.f7699b, ((Integer) it.next()).intValue());
        }
        this.f7700c.r().G().f(str);
    }

    public void j(u uVar, int i6) {
        JobInfo a6 = this.f7701d.a(uVar, i6);
        k e6 = k.e();
        String str = f7697e;
        e6.a(str, "Scheduling work ID " + uVar.f14117a + "Job ID " + i6);
        try {
            if (this.f7699b.schedule(a6) == 0) {
                k.e().k(str, "Unable to schedule work ID " + uVar.f14117a);
                if (uVar.f14133q && uVar.f14134r == o.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    uVar.f14133q = false;
                    k.e().a(str, String.format("Scheduling a non-expedited job (work ID %s)", uVar.f14117a));
                    j(uVar, i6);
                }
            }
        } catch (IllegalStateException e7) {
            List g6 = g(this.f7698a, this.f7699b);
            String format = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", Integer.valueOf(g6 != null ? g6.size() : 0), Integer.valueOf(this.f7700c.r().J().g().size()), Integer.valueOf(this.f7700c.k().h()));
            k.e().c(f7697e, format);
            IllegalStateException illegalStateException = new IllegalStateException(format, e7);
            InterfaceC2343a l6 = this.f7700c.k().l();
            if (l6 == null) {
                throw illegalStateException;
            }
            l6.accept(illegalStateException);
        } catch (Throwable th) {
            k.e().d(f7697e, "Unable to schedule " + uVar, th);
        }
    }

    public e(Context context, E e6, JobScheduler jobScheduler, d dVar) {
        this.f7698a = context;
        this.f7700c = e6;
        this.f7699b = jobScheduler;
        this.f7701d = dVar;
    }
}
