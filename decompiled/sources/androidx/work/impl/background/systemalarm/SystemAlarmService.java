package androidx.work.impl.background.systemalarm;

import W2.k;
import android.content.Intent;
import androidx.lifecycle.AbstractServiceC1063o;
import androidx.work.impl.background.systemalarm.d;
import g3.w;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class SystemAlarmService extends AbstractServiceC1063o implements d.c {

    /* renamed from: d, reason: collision with root package name */
    public static final String f10284d = k.i("SystemAlarmService");

    /* renamed from: b, reason: collision with root package name */
    public d f10285b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10286c;

    @Override // androidx.work.impl.background.systemalarm.d.c
    public void a() {
        this.f10286c = true;
        k.e().a(f10284d, "All commands completed in dispatcher");
        w.a();
        stopSelf();
    }

    public final void e() {
        d dVar = new d(this);
        this.f10285b = dVar;
        dVar.l(this);
    }

    @Override // androidx.lifecycle.AbstractServiceC1063o, android.app.Service
    public void onCreate() {
        super.onCreate();
        e();
        this.f10286c = false;
    }

    @Override // androidx.lifecycle.AbstractServiceC1063o, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f10286c = true;
        this.f10285b.j();
    }

    @Override // androidx.lifecycle.AbstractServiceC1063o, android.app.Service
    public int onStartCommand(Intent intent, int i6, int i7) {
        super.onStartCommand(intent, i6, i7);
        if (this.f10286c) {
            k.e().f(f10284d, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            this.f10285b.j();
            e();
            this.f10286c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f10285b.a(intent, i7);
        return 3;
    }
}
