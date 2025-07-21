package E5;

import E5.c;
import android.app.job.JobInfo;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class f {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public H5.a f1167a;

        /* renamed from: b, reason: collision with root package name */
        public Map f1168b = new HashMap();

        public a a(u5.f fVar, b bVar) {
            this.f1168b.put(fVar, bVar);
            return this;
        }

        public f b() {
            if (this.f1167a == null) {
                throw new NullPointerException("missing required property: clock");
            }
            if (this.f1168b.keySet().size() < u5.f.values().length) {
                throw new IllegalStateException("Not all priorities have been configured");
            }
            Map map = this.f1168b;
            this.f1168b = new HashMap();
            return f.d(this.f1167a, map);
        }

        public a c(H5.a aVar) {
            this.f1167a = aVar;
            return this;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class b {

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static abstract class a {
            public abstract b a();

            public abstract a b(long j6);

            public abstract a c(Set set);

            public abstract a d(long j6);
        }

        public static a a() {
            return new c.b().c(Collections.EMPTY_SET);
        }

        public abstract long b();

        public abstract Set c();

        public abstract long d();
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    public static a b() {
        return new a();
    }

    public static f d(H5.a aVar, Map map) {
        return new E5.b(aVar, map);
    }

    public static f f(H5.a aVar) {
        return b().a(u5.f.DEFAULT, b.a().b(30000L).d(86400000L).a()).a(u5.f.HIGHEST, b.a().b(1000L).d(86400000L).a()).a(u5.f.VERY_LOW, b.a().b(86400000L).d(86400000L).c(i(c.DEVICE_IDLE)).a()).c(aVar).b();
    }

    public static Set i(Object... objArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(objArr)));
    }

    public final long a(int i6, long j6) {
        return (long) (Math.pow(3.0d, i6 - 1) * j6 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j6 > 1 ? j6 : 2L) * r7)));
    }

    public JobInfo.Builder c(JobInfo.Builder builder, u5.f fVar, long j6, int i6) {
        builder.setMinimumLatency(g(fVar, j6, i6));
        j(builder, ((b) h().get(fVar)).c());
        return builder;
    }

    public abstract H5.a e();

    public long g(u5.f fVar, long j6, int i6) {
        long a6 = j6 - e().a();
        b bVar = (b) h().get(fVar);
        return Math.min(Math.max(a(i6, bVar.b()), a6), bVar.d());
    }

    public abstract Map h();

    public final void j(JobInfo.Builder builder, Set set) {
        if (set.contains(c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }
}
