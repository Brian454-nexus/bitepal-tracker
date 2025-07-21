package androidx.work.impl.workers;

import W2.k;
import X2.E;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import androidx.work.impl.WorkDatabase;
import f3.j;
import f3.o;
import f3.v;
import f3.z;
import j3.AbstractC1650d;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/work/impl/workers/DiagnosticsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/c$a;", "p", "()Landroidx/work/c$a;", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(@NotNull Context context, @NotNull WorkerParameters parameters) {
        super(context, parameters);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
    }

    @Override // androidx.work.Worker
    public c.a p() {
        String str;
        String str2;
        String d6;
        String str3;
        String str4;
        String d7;
        String str5;
        String str6;
        String d8;
        E m6 = E.m(a());
        Intrinsics.checkNotNullExpressionValue(m6, "getInstance(applicationContext)");
        WorkDatabase r6 = m6.r();
        Intrinsics.checkNotNullExpressionValue(r6, "workManager.workDatabase");
        v J6 = r6.J();
        o H6 = r6.H();
        z K5 = r6.K();
        j G6 = r6.G();
        List e6 = J6.e(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L));
        List i6 = J6.i();
        List t6 = J6.t(200);
        if (!e6.isEmpty()) {
            k e7 = k.e();
            str5 = AbstractC1650d.f16203a;
            e7.f(str5, "Recently completed work:\n\n");
            k e8 = k.e();
            str6 = AbstractC1650d.f16203a;
            d8 = AbstractC1650d.d(H6, K5, G6, e6);
            e8.f(str6, d8);
        }
        if (!i6.isEmpty()) {
            k e9 = k.e();
            str3 = AbstractC1650d.f16203a;
            e9.f(str3, "Running work:\n\n");
            k e10 = k.e();
            str4 = AbstractC1650d.f16203a;
            d7 = AbstractC1650d.d(H6, K5, G6, i6);
            e10.f(str4, d7);
        }
        if (!t6.isEmpty()) {
            k e11 = k.e();
            str = AbstractC1650d.f16203a;
            e11.f(str, "Enqueued work:\n\n");
            k e12 = k.e();
            str2 = AbstractC1650d.f16203a;
            d6 = AbstractC1650d.d(H6, K5, G6, t6);
            e12.f(str2, d6);
        }
        c.a c6 = c.a.c();
        Intrinsics.checkNotNullExpressionValue(c6, "success()");
        return c6;
    }
}
