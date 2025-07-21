package androidx.work.impl.background.systemalarm;

import W2.k;
import X2.InterfaceC0821e;
import X2.v;
import X2.w;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.d;
import f3.m;
import f3.u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class a implements InterfaceC0821e {

    /* renamed from: e, reason: collision with root package name */
    public static final String f10287e = k.i("CommandHandler");

    /* renamed from: a, reason: collision with root package name */
    public final Context f10288a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f10289b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final Object f10290c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final w f10291d;

    public a(Context context, w wVar) {
        this.f10288a = context;
        this.f10291d = wVar;
    }

    public static Intent a(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    public static Intent c(Context context, m mVar) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        return q(intent, mVar);
    }

    public static Intent d(Context context, m mVar, boolean z6) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z6);
        return q(intent, mVar);
    }

    public static Intent e(Context context, m mVar) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        return q(intent, mVar);
    }

    public static Intent f(Context context, m mVar) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        return q(intent, mVar);
    }

    public static boolean m(Bundle bundle, String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    public static m p(Intent intent) {
        return new m(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    public static Intent q(Intent intent, m mVar) {
        intent.putExtra("KEY_WORKSPEC_ID", mVar.b());
        intent.putExtra("KEY_WORKSPEC_GENERATION", mVar.a());
        return intent;
    }

    @Override // X2.InterfaceC0821e
    public void b(m mVar, boolean z6) {
        synchronized (this.f10290c) {
            try {
                c cVar = (c) this.f10289b.remove(mVar);
                this.f10291d.b(mVar);
                if (cVar != null) {
                    cVar.h(z6);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(Intent intent, int i6, d dVar) {
        k.e().a(f10287e, "Handling constraints changed " + intent);
        new b(this.f10288a, i6, dVar).a();
    }

    public final void h(Intent intent, int i6, d dVar) {
        synchronized (this.f10290c) {
            try {
                m p6 = p(intent);
                k e6 = k.e();
                String str = f10287e;
                e6.a(str, "Handing delay met for " + p6);
                if (this.f10289b.containsKey(p6)) {
                    k.e().a(str, "WorkSpec " + p6 + " is is already being handled for ACTION_DELAY_MET");
                } else {
                    c cVar = new c(this.f10288a, i6, dVar, this.f10291d.d(p6));
                    this.f10289b.put(p6, cVar);
                    cVar.g();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(Intent intent, int i6) {
        m p6 = p(intent);
        boolean z6 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
        k.e().a(f10287e, "Handling onExecutionCompleted " + intent + ", " + i6);
        b(p6, z6);
    }

    public final void j(Intent intent, int i6, d dVar) {
        k.e().a(f10287e, "Handling reschedule " + intent + ", " + i6);
        dVar.g().v();
    }

    public final void k(Intent intent, int i6, d dVar) {
        m p6 = p(intent);
        k e6 = k.e();
        String str = f10287e;
        e6.a(str, "Handling schedule work for " + p6);
        WorkDatabase r6 = dVar.g().r();
        r6.e();
        try {
            u n6 = r6.J().n(p6.b());
            if (n6 == null) {
                k.e().k(str, "Skipping scheduling " + p6 + " because it's no longer in the DB");
                return;
            }
            if (n6.f14118b.b()) {
                k.e().k(str, "Skipping scheduling " + p6 + "because it is finished.");
                return;
            }
            long c6 = n6.c();
            if (n6.h()) {
                k.e().a(str, "Opportunistically setting an alarm for " + p6 + "at " + c6);
                Z2.a.c(this.f10288a, r6, p6, c6);
                dVar.f().a().execute(new d.b(dVar, a(this.f10288a), i6));
            } else {
                k.e().a(str, "Setting up Alarms for " + p6 + "at " + c6);
                Z2.a.c(this.f10288a, r6, p6, c6);
            }
            r6.B();
        } finally {
            r6.i();
        }
    }

    public final void l(Intent intent, d dVar) {
        List<v> c6;
        Bundle extras = intent.getExtras();
        String string = extras.getString("KEY_WORKSPEC_ID");
        if (extras.containsKey("KEY_WORKSPEC_GENERATION")) {
            int i6 = extras.getInt("KEY_WORKSPEC_GENERATION");
            c6 = new ArrayList(1);
            v b6 = this.f10291d.b(new m(string, i6));
            if (b6 != null) {
                c6.add(b6);
            }
        } else {
            c6 = this.f10291d.c(string);
        }
        for (v vVar : c6) {
            k.e().a(f10287e, "Handing stopWork work for " + string);
            dVar.g().A(vVar);
            Z2.a.a(this.f10288a, dVar.g().r(), vVar.a());
            dVar.b(vVar.a(), false);
        }
    }

    public boolean n() {
        boolean z6;
        synchronized (this.f10290c) {
            z6 = !this.f10289b.isEmpty();
        }
        return z6;
    }

    public void o(Intent intent, int i6, d dVar) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            g(intent, i6, dVar);
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            j(intent, i6, dVar);
            return;
        }
        if (!m(intent.getExtras(), "KEY_WORKSPEC_ID")) {
            k.e().c(f10287e, "Invalid request for " + action + " , requires KEY_WORKSPEC_ID .");
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            k(intent, i6, dVar);
            return;
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            h(intent, i6, dVar);
            return;
        }
        if ("ACTION_STOP_WORK".equals(action)) {
            l(intent, dVar);
            return;
        }
        if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
            i(intent, i6);
            return;
        }
        k.e().k(f10287e, "Ignoring intent " + intent);
    }
}
