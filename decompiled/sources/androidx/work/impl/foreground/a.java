package androidx.work.impl.foreground;

import W2.f;
import W2.k;
import X2.E;
import X2.InterfaceC0821e;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import b3.C1089e;
import b3.InterfaceC1087c;
import b3.InterfaceC1088d;
import f3.m;
import f3.u;
import f3.x;
import i3.InterfaceC1511b;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class a implements InterfaceC1087c, InterfaceC0821e {

    /* renamed from: k, reason: collision with root package name */
    public static final String f10346k = k.i("SystemFgDispatcher");

    /* renamed from: a, reason: collision with root package name */
    public Context f10347a;

    /* renamed from: b, reason: collision with root package name */
    public E f10348b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1511b f10349c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f10350d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public m f10351e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f10352f;

    /* renamed from: g, reason: collision with root package name */
    public final Map f10353g;

    /* renamed from: h, reason: collision with root package name */
    public final Set f10354h;

    /* renamed from: i, reason: collision with root package name */
    public final InterfaceC1088d f10355i;

    /* renamed from: j, reason: collision with root package name */
    public b f10356j;

    /* renamed from: androidx.work.impl.foreground.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class RunnableC0156a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f10357a;

        public RunnableC0156a(String str) {
            this.f10357a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            u h6 = a.this.f10348b.o().h(this.f10357a);
            if (h6 == null || !h6.h()) {
                return;
            }
            synchronized (a.this.f10350d) {
                a.this.f10353g.put(x.a(h6), h6);
                a.this.f10354h.add(h6);
                a aVar = a.this;
                aVar.f10355i.b(aVar.f10354h);
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface b {
        void b(int i6, int i7, Notification notification);

        void c(int i6, Notification notification);

        void d(int i6);

        void stop();
    }

    public a(Context context) {
        this.f10347a = context;
        E m6 = E.m(context);
        this.f10348b = m6;
        this.f10349c = m6.s();
        this.f10351e = null;
        this.f10352f = new LinkedHashMap();
        this.f10354h = new HashSet();
        this.f10353g = new HashMap();
        this.f10355i = new C1089e(this.f10348b.q(), this);
        this.f10348b.o().g(this);
    }

    public static Intent d(Context context, m mVar, f fVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", fVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", fVar.a());
        intent.putExtra("KEY_NOTIFICATION", fVar.b());
        intent.putExtra("KEY_WORKSPEC_ID", mVar.b());
        intent.putExtra("KEY_GENERATION", mVar.a());
        return intent;
    }

    public static Intent e(Context context, m mVar, f fVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", mVar.b());
        intent.putExtra("KEY_GENERATION", mVar.a());
        intent.putExtra("KEY_NOTIFICATION_ID", fVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", fVar.a());
        intent.putExtra("KEY_NOTIFICATION", fVar.b());
        return intent;
    }

    public static Intent g(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    @Override // X2.InterfaceC0821e
    public void b(m mVar, boolean z6) {
        Map.Entry entry;
        synchronized (this.f10350d) {
            try {
                u uVar = (u) this.f10353g.remove(mVar);
                if (uVar != null ? this.f10354h.remove(uVar) : false) {
                    this.f10355i.b(this.f10354h);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        f fVar = (f) this.f10352f.remove(mVar);
        if (mVar.equals(this.f10351e) && this.f10352f.size() > 0) {
            Iterator it = this.f10352f.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.f10351e = (m) entry.getKey();
            if (this.f10356j != null) {
                f fVar2 = (f) entry.getValue();
                this.f10356j.b(fVar2.c(), fVar2.a(), fVar2.b());
                this.f10356j.d(fVar2.c());
            }
        }
        b bVar = this.f10356j;
        if (fVar == null || bVar == null) {
            return;
        }
        k.e().a(f10346k, "Removing Notification (id: " + fVar.c() + ", workSpecId: " + mVar + ", notificationType: " + fVar.a());
        bVar.d(fVar.c());
    }

    @Override // b3.InterfaceC1087c
    public void c(List list) {
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            u uVar = (u) it.next();
            String str = uVar.f14117a;
            k.e().a(f10346k, "Constraints unmet for WorkSpec " + str);
            this.f10348b.z(x.a(uVar));
        }
    }

    @Override // b3.InterfaceC1087c
    public void f(List list) {
    }

    public final void h(Intent intent) {
        k.e().f(f10346k, "Stopping foreground work for " + intent);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return;
        }
        this.f10348b.g(UUID.fromString(stringExtra));
    }

    public final void i(Intent intent) {
        int i6 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        m mVar = new m(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        k.e().a(f10346k, "Notifying with (id:" + intExtra + ", workSpecId: " + stringExtra + ", notificationType :" + intExtra2 + ")");
        if (notification == null || this.f10356j == null) {
            return;
        }
        this.f10352f.put(mVar, new f(intExtra, notification, intExtra2));
        if (this.f10351e == null) {
            this.f10351e = mVar;
            this.f10356j.b(intExtra, intExtra2, notification);
            return;
        }
        this.f10356j.c(intExtra, notification);
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator it = this.f10352f.entrySet().iterator();
        while (it.hasNext()) {
            i6 |= ((f) ((Map.Entry) it.next()).getValue()).a();
        }
        f fVar = (f) this.f10352f.get(this.f10351e);
        if (fVar != null) {
            this.f10356j.b(fVar.c(), i6, fVar.b());
        }
    }

    public final void j(Intent intent) {
        k.e().f(f10346k, "Started foreground service " + intent);
        this.f10349c.c(new RunnableC0156a(intent.getStringExtra("KEY_WORKSPEC_ID")));
    }

    public void k(Intent intent) {
        k.e().f(f10346k, "Stopping foreground service");
        b bVar = this.f10356j;
        if (bVar != null) {
            bVar.stop();
        }
    }

    public void l() {
        this.f10356j = null;
        synchronized (this.f10350d) {
            this.f10355i.a();
        }
        this.f10348b.o().l(this);
    }

    public void m(Intent intent) {
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            j(intent);
            i(intent);
        } else if ("ACTION_NOTIFY".equals(action)) {
            i(intent);
        } else if ("ACTION_CANCEL_WORK".equals(action)) {
            h(intent);
        } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
            k(intent);
        }
    }

    public void n(b bVar) {
        if (this.f10356j != null) {
            k.e().c(f10346k, "A callback already exists.");
        } else {
            this.f10356j = bVar;
        }
    }
}
