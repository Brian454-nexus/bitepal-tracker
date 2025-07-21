package com.braze.managers;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.events.SessionStateChangedEvent;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.IntentUtils;
import ga.L;
import ga.u0;
import ga.y0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class r {

    /* renamed from: m, reason: collision with root package name */
    public static final String f12492m = BrazeLogger.getBrazeLogTag((Class<?>) r.class);

    /* renamed from: n, reason: collision with root package name */
    public static final long f12493n;

    /* renamed from: o, reason: collision with root package name */
    public static final long f12494o;

    /* renamed from: a, reason: collision with root package name */
    public final Context f12495a;

    /* renamed from: b, reason: collision with root package name */
    public final com.braze.storage.s f12496b;

    /* renamed from: c, reason: collision with root package name */
    public final com.braze.events.d f12497c;

    /* renamed from: d, reason: collision with root package name */
    public final com.braze.events.e f12498d;

    /* renamed from: e, reason: collision with root package name */
    public final AlarmManager f12499e;

    /* renamed from: f, reason: collision with root package name */
    public final int f12500f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f12501g;

    /* renamed from: h, reason: collision with root package name */
    public final ReentrantLock f12502h;

    /* renamed from: i, reason: collision with root package name */
    public final String f12503i;

    /* renamed from: j, reason: collision with root package name */
    public final p f12504j;

    /* renamed from: k, reason: collision with root package name */
    public ga.u0 f12505k;

    /* renamed from: l, reason: collision with root package name */
    public com.braze.models.l f12506l;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f12493n = timeUnit.toMillis(10L);
        f12494o = timeUnit.toMillis(10L);
    }

    public r(Context applicationContext, com.braze.storage.s sessionStorageManager, com.braze.events.d internalEventPublisher, com.braze.events.e externalEventPublisher, AlarmManager alarmManager, int i6, boolean z6) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(sessionStorageManager, "sessionStorageManager");
        Intrinsics.checkNotNullParameter(internalEventPublisher, "internalEventPublisher");
        Intrinsics.checkNotNullParameter(externalEventPublisher, "externalEventPublisher");
        Intrinsics.checkNotNullParameter(alarmManager, "alarmManager");
        this.f12495a = applicationContext;
        this.f12496b = sessionStorageManager;
        this.f12497c = internalEventPublisher;
        this.f12498d = externalEventPublisher;
        this.f12499e = alarmManager;
        this.f12500f = i6;
        this.f12501g = z6;
        this.f12502h = new ReentrantLock();
        this.f12505k = y0.b((ga.u0) null, 1, (Object) null);
        p pVar = new p(this);
        this.f12504j = pVar;
        String str = applicationContext.getPackageName() + ".intent.BRAZE_SESSION_SHOULD_SEAL";
        this.f12503i = str;
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                applicationContext.registerReceiver(pVar, new IntentFilter(str), 2);
            } else {
                applicationContext.registerReceiver(pVar, new IntentFilter(str));
            }
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: Z3.R2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.managers.r.a(com.braze.managers.r.this);
                }
            }, 4, (Object) null);
            this.f12504j = null;
        }
    }

    public static final String a(r rVar) {
        return "Failed to register dynamic receiver for " + rVar.f12503i;
    }

    public static final String b(com.braze.models.l lVar) {
        return "New session created with ID: " + lVar.f12598a;
    }

    public static final String c(com.braze.models.l lVar) {
        return "Checking if this session needs to be sealed: " + lVar.f12598a;
    }

    public static final String d(com.braze.models.l lVar) {
        return "Session [" + lVar.f12598a + "] being sealed because its end time is over the grace period. Session: " + lVar;
    }

    public static final String e(com.braze.models.l lVar) {
        return "Closed session with id " + lVar.f12598a;
    }

    public static final String j() {
        return "Getting the stored open session";
    }

    public static final String m() {
        return "Failed to unregister session seal receiver.";
    }

    public final boolean f() {
        ReentrantLock reentrantLock = this.f12502h;
        reentrantLock.lock();
        try {
            i();
            final com.braze.models.l lVar = this.f12506l;
            boolean z6 = true;
            if (lVar != null && !lVar.f12601d) {
                if (lVar.f12600c != null) {
                    lVar.f12600c = null;
                } else {
                    z6 = false;
                }
                reentrantLock.unlock();
                return z6;
            }
            h();
            if (lVar != null && lVar.f12601d) {
                try {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.a3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return com.braze.managers.r.a(com.braze.models.l.this);
                        }
                    }, 7, (Object) null);
                    this.f12496b.a(lVar.f12598a.f12603b);
                    reentrantLock.unlock();
                    return z6;
                } catch (Throwable th) {
                    th = th;
                    reentrantLock.unlock();
                    throw th;
                }
            }
            reentrantLock.unlock();
            return z6;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final com.braze.models.o g() {
        ReentrantLock reentrantLock = this.f12502h;
        reentrantLock.lock();
        try {
            i();
            com.braze.models.l lVar = this.f12506l;
            return lVar != null ? lVar.f12598a : null;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void h() {
        final com.braze.models.l lVar = new com.braze.models.l();
        this.f12506l = lVar;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: Z3.T2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.managers.r.b(com.braze.models.l.this);
            }
        }, 6, (Object) null);
        this.f12497c.b(new com.braze.events.internal.y(lVar), com.braze.events.internal.y.class);
        ((com.braze.events.d) this.f12498d).b(new SessionStateChangedEvent(lVar.f12598a.f12603b, SessionStateChangedEvent.ChangeType.SESSION_STARTED), SessionStateChangedEvent.class);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0081, code lost:
    
        if ((r13.toMillis((long) r5) + r14) <= r11) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i() {
        /*
            r16 = this;
            r1 = r16
            java.util.concurrent.locks.ReentrantLock r8 = r1.f12502h
            r8.lock()
            com.braze.models.l r0 = r1.f12506l     // Catch: java.lang.Throwable -> L33
            r9 = 0
            if (r0 != 0) goto L39
            com.braze.support.BrazeLogger r0 = com.braze.support.BrazeLogger.INSTANCE     // Catch: java.lang.Throwable -> L33
            Z3.U2 r5 = new Z3.U2     // Catch: java.lang.Throwable -> L33
            r5.<init>()     // Catch: java.lang.Throwable -> L33
            r6 = 7
            r7 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            com.braze.support.BrazeLogger.brazelog$default(r0, r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L33
            com.braze.storage.s r0 = r1.f12496b     // Catch: java.lang.Throwable -> L33
            com.braze.models.n r0 = r0.c()     // Catch: java.lang.Throwable -> L33
            if (r0 == 0) goto L36
            com.braze.models.l r2 = new com.braze.models.l     // Catch: java.lang.Throwable -> L33
            com.braze.models.o r3 = r0.f12598a     // Catch: java.lang.Throwable -> L33
            double r4 = r0.f12599b     // Catch: java.lang.Throwable -> L33
            java.lang.Double r6 = r0.d()     // Catch: java.lang.Throwable -> L33
            boolean r7 = r0.f12601d     // Catch: java.lang.Throwable -> L33
            r2.<init>(r3, r4, r6, r7)     // Catch: java.lang.Throwable -> L33
            goto L37
        L33:
            r0 = move-exception
            goto Lad
        L36:
            r2 = r9
        L37:
            r1.f12506l = r2     // Catch: java.lang.Throwable -> L33
        L39:
            com.braze.models.l r10 = r1.f12506l     // Catch: java.lang.Throwable -> L33
            if (r10 == 0) goto La9
            com.braze.support.BrazeLogger r0 = com.braze.support.BrazeLogger.INSTANCE     // Catch: java.lang.Throwable -> L33
            Z3.V2 r5 = new Z3.V2     // Catch: java.lang.Throwable -> L33
            r5.<init>()     // Catch: java.lang.Throwable -> L33
            r6 = 7
            r7 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            com.braze.support.BrazeLogger.brazelog$default(r0, r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L33
            java.lang.Double r2 = r10.f12600c     // Catch: java.lang.Throwable -> L33
            if (r2 == 0) goto La7
            boolean r3 = r10.f12601d     // Catch: java.lang.Throwable -> L33
            if (r3 != 0) goto La7
            double r3 = r10.f12599b     // Catch: java.lang.Throwable -> L33
            double r5 = r2.doubleValue()     // Catch: java.lang.Throwable -> L33
            int r2 = r1.f12500f     // Catch: java.lang.Throwable -> L33
            boolean r7 = r1.f12501g     // Catch: java.lang.Throwable -> L33
            long r11 = com.braze.support.DateTimeUtils.nowInMilliseconds()     // Catch: java.lang.Throwable -> L33
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L33
            long r14 = (long) r2     // Catch: java.lang.Throwable -> L33
            long r14 = r13.toMillis(r14)     // Catch: java.lang.Throwable -> L33
            if (r7 == 0) goto L79
            long r2 = (long) r3     // Catch: java.lang.Throwable -> L33
            long r2 = r13.toMillis(r2)     // Catch: java.lang.Throwable -> L33
            long r2 = r2 + r14
            long r4 = com.braze.managers.r.f12494o     // Catch: java.lang.Throwable -> L33
            long r2 = r2 + r4
            int r2 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r2 > 0) goto La7
            goto L83
        L79:
            long r2 = (long) r5     // Catch: java.lang.Throwable -> L33
            long r2 = r13.toMillis(r2)     // Catch: java.lang.Throwable -> L33
            long r2 = r2 + r14
            int r2 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r2 > 0) goto La7
        L83:
            com.braze.support.BrazeLogger$Priority r2 = com.braze.support.BrazeLogger.Priority.f12982I     // Catch: java.lang.Throwable -> L33
            Z3.W2 r5 = new Z3.W2     // Catch: java.lang.Throwable -> L33
            r5.<init>()     // Catch: java.lang.Throwable -> L33
            r6 = 6
            r7 = 0
            r3 = 0
            r4 = 0
            com.braze.support.BrazeLogger.brazelog$default(r0, r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L33
            r1.k()     // Catch: java.lang.Throwable -> L33
            com.braze.storage.s r0 = r1.f12496b     // Catch: java.lang.Throwable -> L33
            com.braze.models.l r2 = r1.f12506l     // Catch: java.lang.Throwable -> L33
            if (r2 == 0) goto L9d
            com.braze.models.o r2 = r2.f12598a     // Catch: java.lang.Throwable -> L33
            goto L9e
        L9d:
            r2 = r9
        L9e:
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L33
            r0.a(r2)     // Catch: java.lang.Throwable -> L33
            r1.f12506l = r9     // Catch: java.lang.Throwable -> L33
        La7:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L33
        La9:
            r8.unlock()
            return
        Lad:
            r8.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.managers.r.i():void");
    }

    public final void k() {
        com.braze.models.l lVar = this.f12506l;
        if (lVar != null) {
            ReentrantLock reentrantLock = this.f12502h;
            reentrantLock.lock();
            try {
                lVar.f12601d = true;
                lVar.f12600c = Double.valueOf(DateTimeUtils.nowInSecondsPrecise());
                this.f12496b.a(lVar);
                this.f12497c.b(new com.braze.events.internal.z(lVar), com.braze.events.internal.z.class);
                ((com.braze.events.d) this.f12498d).b(new SessionStateChangedEvent(lVar.f12598a.f12603b, SessionStateChangedEvent.ChangeType.SESSION_ENDED), SessionStateChangedEvent.class);
                Unit unit = Unit.INSTANCE;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final void l() {
        try {
            p pVar = this.f12504j;
            if (pVar != null) {
                this.f12495a.unregisterReceiver(pVar);
            }
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: Z3.S2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.managers.r.m();
                }
            }, 4, (Object) null);
        }
    }

    public final void n() {
        ReentrantLock reentrantLock = this.f12502h;
        reentrantLock.lock();
        try {
            f();
            final com.braze.models.l lVar = this.f12506l;
            if (lVar != null) {
                lVar.f12600c = Double.valueOf(DateTimeUtils.nowInSecondsPrecise());
                this.f12496b.a(lVar);
                u0.a.b(this.f12505k, (CancellationException) null, 1, (Object) null);
                this.f12505k = ga.i.d(BrazeCoroutineScope.INSTANCE, (CoroutineContext) null, (L) null, new q(this, null), 3, (Object) null);
                d();
                this.f12497c.b(com.braze.events.internal.b0.f12259a, com.braze.events.internal.b0.class);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.X2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.managers.r.e(com.braze.models.l.this);
                    }
                }, 7, (Object) null);
                Unit unit = Unit.INSTANCE;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final String a(com.braze.models.l lVar) {
        return "Clearing completely dispatched sealed session " + lVar.f12598a;
    }

    public static final String b() {
        return "Cancelling session seal alarm";
    }

    public static final String c() {
        return "Failed to cancel session seal alarm";
    }

    public static final String e() {
        return "Failed to create session seal alarm";
    }

    public final void d() {
        com.braze.models.l mutableSession = this.f12506l;
        if (mutableSession != null) {
            int i6 = this.f12500f;
            boolean z6 = this.f12501g;
            Intrinsics.checkNotNullParameter(mutableSession, "mutableSession");
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long millis = timeUnit.toMillis(i6);
            if (z6) {
                millis = Math.max(f12494o, (timeUnit.toMillis((long) mutableSession.f12599b) + millis) - DateTimeUtils.nowInMilliseconds());
            }
            final long j6 = millis;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.b3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.managers.r.a(j6);
                }
            }, 7, (Object) null);
            try {
                Intent intent = new Intent(this.f12503i);
                intent.putExtra("session_id", mutableSession.toString());
                this.f12499e.set(1, DateTimeUtils.nowInMilliseconds() + j6, PendingIntent.getBroadcast(this.f12495a, 0, intent, IntentUtils.getImmutablePendingIntentFlags() | 1073741824));
            } catch (Exception e6) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: Z3.c3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.managers.r.e();
                    }
                }, 4, (Object) null);
            }
        }
    }

    public static final String a(long j6) {
        return "Creating a session seal alarm with a delay of " + j6 + " ms";
    }

    public final void a() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.Y2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.managers.r.b();
            }
        }, 7, (Object) null);
        try {
            Intent intent = new Intent(this.f12503i);
            intent.putExtra("session_id", String.valueOf(this.f12506l));
            this.f12499e.cancel(PendingIntent.getBroadcast(this.f12495a, 0, intent, IntentUtils.getImmutablePendingIntentFlags() | 1073741824));
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: Z3.Z2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.managers.r.c();
                }
            }, 4, (Object) null);
        }
    }
}
