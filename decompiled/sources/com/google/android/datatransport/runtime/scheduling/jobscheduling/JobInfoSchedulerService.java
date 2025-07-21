package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import I5.a;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import x5.p;
import x5.u;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class JobInfoSchedulerService extends JobService {
    @Override // android.app.job.JobService
    public boolean onStartJob(final JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i6 = jobParameters.getExtras().getInt("priority");
        int i7 = jobParameters.getExtras().getInt("attemptNumber");
        u.f(getApplicationContext());
        p.a d6 = p.a().b(string).d(a.b(i6));
        if (string2 != null) {
            d6.c(Base64.decode(string2, 0));
        }
        u.c().e().m(d6.a(), i7, new Runnable() { // from class: E5.e
            @Override // java.lang.Runnable
            public final void run() {
                JobInfoSchedulerService.this.jobFinished(jobParameters, false);
            }
        });
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
