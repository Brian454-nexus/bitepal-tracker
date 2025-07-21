package androidx.work.impl.background.systemjob;

import W2.k;
import X2.E;
import X2.InterfaceC0821e;
import X2.v;
import X2.w;
import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.net.Network;
import android.net.Uri;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.WorkerParameters;
import f3.m;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class SystemJobService extends JobService implements InterfaceC0821e {

    /* renamed from: d, reason: collision with root package name */
    public static final String f10326d = k.i("SystemJobService");

    /* renamed from: a, reason: collision with root package name */
    public E f10327a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f10328b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final w f10329c = new w();

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {
        public static String[] a(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentAuthorities();
        }

        public static Uri[] b(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentUris();
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b {
        public static Network a(JobParameters jobParameters) {
            return jobParameters.getNetwork();
        }
    }

    public static m a(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new m(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // X2.InterfaceC0821e
    public void b(m mVar, boolean z6) {
        JobParameters jobParameters;
        k.e().a(f10326d, mVar.b() + " executed on JobScheduler");
        synchronized (this.f10328b) {
            jobParameters = (JobParameters) this.f10328b.remove(mVar);
        }
        this.f10329c.b(mVar);
        if (jobParameters != null) {
            jobFinished(jobParameters, z6);
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            E m6 = E.m(getApplicationContext());
            this.f10327a = m6;
            m6.o().g(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            k.e().k(f10326d, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        E e6 = this.f10327a;
        if (e6 != null) {
            e6.o().l(this);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        if (this.f10327a == null) {
            k.e().a(f10326d, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        m a6 = a(jobParameters);
        if (a6 == null) {
            k.e().c(f10326d, "WorkSpec id not found!");
            return false;
        }
        synchronized (this.f10328b) {
            try {
                if (this.f10328b.containsKey(a6)) {
                    k.e().a(f10326d, "Job is already being executed by SystemJobService: " + a6);
                    return false;
                }
                k.e().a(f10326d, "onStartJob for " + a6);
                this.f10328b.put(a6, jobParameters);
                int i6 = Build.VERSION.SDK_INT;
                WorkerParameters.a aVar = new WorkerParameters.a();
                if (a.b(jobParameters) != null) {
                    aVar.f10228b = Arrays.asList(a.b(jobParameters));
                }
                if (a.a(jobParameters) != null) {
                    aVar.f10227a = Arrays.asList(a.a(jobParameters));
                }
                if (i6 >= 28) {
                    aVar.f10229c = b.a(jobParameters);
                }
                this.f10327a.y(this.f10329c.d(a6), aVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        if (this.f10327a == null) {
            k.e().a(f10326d, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        m a6 = a(jobParameters);
        if (a6 == null) {
            k.e().c(f10326d, "WorkSpec id not found!");
            return false;
        }
        k.e().a(f10326d, "onStopJob for " + a6);
        synchronized (this.f10328b) {
            this.f10328b.remove(a6);
        }
        v b6 = this.f10329c.b(a6);
        if (b6 != null) {
            this.f10327a.A(b6);
        }
        return !this.f10327a.o().j(a6.b());
    }
}
