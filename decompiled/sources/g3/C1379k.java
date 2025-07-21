package g3;

import androidx.work.impl.WorkDatabase;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: g3.k, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1379k {

    /* renamed from: a, reason: collision with root package name */
    public final WorkDatabase f14879a;

    public C1379k(WorkDatabase workDatabase) {
        Intrinsics.checkNotNullParameter(workDatabase, "workDatabase");
        this.f14879a = workDatabase;
    }

    public static final Integer d(C1379k this$0) {
        int d6;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d6 = AbstractC1380l.d(this$0.f14879a, "next_alarm_manager_id");
        return Integer.valueOf(d6);
    }

    public static final Integer f(C1379k this$0, int i6, int i7) {
        int d6;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d6 = AbstractC1380l.d(this$0.f14879a, "next_job_scheduler_id");
        if (i6 > d6 || d6 > i7) {
            AbstractC1380l.e(this$0.f14879a, "next_job_scheduler_id", i6 + 1);
        } else {
            i6 = d6;
        }
        return Integer.valueOf(i6);
    }

    public final int c() {
        Object z6 = this.f14879a.z(new Callable() { // from class: g3.i
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer d6;
                d6 = C1379k.d(C1379k.this);
                return d6;
            }
        });
        Intrinsics.checkNotNullExpressionValue(z6, "workDatabase.runInTransa…ANAGER_ID_KEY)\n        })");
        return ((Number) z6).intValue();
    }

    public final int e(final int i6, final int i7) {
        Object z6 = this.f14879a.z(new Callable() { // from class: g3.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer f6;
                f6 = C1379k.f(C1379k.this, i6, i7);
                return f6;
            }
        });
        Intrinsics.checkNotNullExpressionValue(z6, "workDatabase.runInTransa…            id\n        })");
        return ((Number) z6).intValue();
    }
}
