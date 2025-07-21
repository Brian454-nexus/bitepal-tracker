package E5;

import F5.InterfaceC0357d;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.zip.Adler32;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class d implements x {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1162a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0357d f1163b;

    /* renamed from: c, reason: collision with root package name */
    public final f f1164c;

    public d(Context context, InterfaceC0357d interfaceC0357d, f fVar) {
        this.f1162a = context;
        this.f1163b = interfaceC0357d;
        this.f1164c = fVar;
    }

    @Override // E5.x
    public void a(x5.p pVar, int i6, boolean z6) {
        ComponentName componentName = new ComponentName(this.f1162a, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f1162a.getSystemService("jobscheduler");
        int c6 = c(pVar);
        if (!z6 && d(jobScheduler, c6, i6)) {
            B5.a.a("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", pVar);
            return;
        }
        long r6 = this.f1163b.r(pVar);
        JobInfo.Builder c7 = this.f1164c.c(new JobInfo.Builder(c6, componentName), pVar.d(), r6, i6);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i6);
        persistableBundle.putString("backendName", pVar.b());
        persistableBundle.putInt("priority", I5.a.a(pVar.d()));
        if (pVar.c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(pVar.c(), 0));
        }
        c7.setExtras(persistableBundle);
        B5.a.b("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", pVar, Integer.valueOf(c6), Long.valueOf(this.f1164c.g(pVar.d(), r6, i6)), Long.valueOf(r6), Integer.valueOf(i6));
        jobScheduler.schedule(c7.build());
    }

    @Override // E5.x
    public void b(x5.p pVar, int i6) {
        a(pVar, i6, false);
    }

    public int c(x5.p pVar) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f1162a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(pVar.b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(I5.a.a(pVar.d())).array());
        if (pVar.c() != null) {
            adler32.update(pVar.c());
        }
        return (int) adler32.getValue();
    }

    public final boolean d(JobScheduler jobScheduler, int i6, int i7) {
        Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            JobInfo next = it.next();
            int i8 = next.getExtras().getInt("attemptNumber");
            if (next.getId() == i6) {
                if (i8 >= i7) {
                    return true;
                }
            }
        }
        return false;
    }
}
