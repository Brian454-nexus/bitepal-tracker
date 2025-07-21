package a3;

import W2.b;
import W2.k;
import W2.l;
import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.background.systemjob.SystemJobService;
import f3.u;
import java.util.Iterator;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    public static final String f7694b = k.i("SystemJobInfoConverter");

    /* renamed from: a, reason: collision with root package name */
    public final ComponentName f7695a;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7696a;

        static {
            int[] iArr = new int[l.values().length];
            f7696a = iArr;
            try {
                iArr[l.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7696a[l.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7696a[l.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7696a[l.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7696a[l.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public d(Context context) {
        this.f7695a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }

    public static JobInfo.TriggerContentUri b(b.c cVar) {
        return new JobInfo.TriggerContentUri(cVar.a(), cVar.b() ? 1 : 0);
    }

    public static int c(l lVar) {
        int i6 = a.f7696a[lVar.ordinal()];
        if (i6 == 1) {
            return 0;
        }
        if (i6 == 2) {
            return 1;
        }
        if (i6 == 3) {
            return 2;
        }
        if (i6 == 4) {
            return 3;
        }
        if (i6 == 5) {
            return 4;
        }
        k.e().a(f7694b, "API version too low. Cannot convert network type value " + lVar);
        return 1;
    }

    public static void d(JobInfo.Builder builder, l lVar) {
        if (Build.VERSION.SDK_INT < 30 || lVar != l.TEMPORARILY_UNMETERED) {
            builder.setRequiredNetworkType(c(lVar));
        } else {
            builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
    }

    public JobInfo a(u uVar, int i6) {
        W2.b bVar = uVar.f14126j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", uVar.f14117a);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", uVar.f());
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", uVar.j());
        JobInfo.Builder extras = new JobInfo.Builder(i6, this.f7695a).setRequiresCharging(bVar.g()).setRequiresDeviceIdle(bVar.h()).setExtras(persistableBundle);
        d(extras, bVar.d());
        if (!bVar.h()) {
            extras.setBackoffCriteria(uVar.f14129m, uVar.f14128l == W2.a.LINEAR ? 0 : 1);
        }
        long max = Math.max(uVar.c() - System.currentTimeMillis(), 0L);
        if (Build.VERSION.SDK_INT <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!uVar.f14133q) {
            extras.setImportantWhileForeground(true);
        }
        if (bVar.e()) {
            Iterator it = bVar.c().iterator();
            while (it.hasNext()) {
                extras.addTriggerContentUri(b((b.c) it.next()));
            }
            extras.setTriggerContentUpdateDelay(bVar.b());
            extras.setTriggerContentMaxDelay(bVar.a());
        }
        extras.setPersisted(false);
        int i7 = Build.VERSION.SDK_INT;
        extras.setRequiresBatteryNotLow(bVar.f());
        extras.setRequiresStorageNotLow(bVar.i());
        boolean z6 = uVar.f14127k > 0;
        boolean z7 = max > 0;
        if (i7 >= 31 && uVar.f14133q && !z6 && !z7) {
            extras.setExpedited(true);
        }
        return extras.build();
    }
}
