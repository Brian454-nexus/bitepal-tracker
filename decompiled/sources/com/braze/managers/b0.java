package com.braze.managers;

import android.content.Context;
import com.braze.support.BrazeLogger;
import com.braze.support.ReflectionUtils;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import java.lang.reflect.Method;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12399a;

    /* renamed from: b, reason: collision with root package name */
    public final g0 f12400b;

    /* renamed from: c, reason: collision with root package name */
    public final Lazy f12401c;

    /* renamed from: d, reason: collision with root package name */
    public final Lazy f12402d;

    public b0(Context context, g0 registrationDataProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(registrationDataProvider, "registrationDataProvider");
        this.f12399a = context;
        this.f12400b = registrationDataProvider;
        this.f12401c = LazyKt.lazy(new Function0() { // from class: Z3.k0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(com.braze.managers.b0.c());
            }
        });
        this.f12402d = LazyKt.lazy(new Function0() { // from class: Z3.q0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(com.braze.managers.b0.d());
            }
        });
    }

    public static final String b(String str) {
        return com.braze.j.a("Automatically obtained Firebase Cloud Messaging push token: ", str);
    }

    public static final boolean c() {
        return ReflectionUtils.doesMethodExist("com.google.firebase.iid.FirebaseInstanceId", "getToken", String.class, String.class);
    }

    public static final String d(String str) {
        return com.braze.j.a("Registering for Firebase Cloud Messaging token using sender id: ", str);
    }

    public static final String e() {
        return "Failed to register for Firebase Cloud Messaging";
    }

    public static final String f() {
        return "Firebase Cloud Messaging 'InstanceId' object could not be invoked. Not registering for Firebase Cloud Messaging.";
    }

    public static final String g() {
        return "Firebase Cloud Messaging 'FirebaseInstanceId.getInstance().getToken()' method could not obtained. Not registering for Firebase Cloud Messaging.";
    }

    public static final String h() {
        return "Could not invoke 'getToken()' Not registering for Firebase Cloud Messaging.";
    }

    public static final String i() {
        return "Failed to get push token via instance id";
    }

    public static final String j() {
        return "Firebase Cloud Messaging 'getInstance' method could not obtained. Not registering for Firebase Cloud Messaging.";
    }

    public static final String k() {
        return "Could not call 'getInstance' method. Not registering for Firebase Cloud Messaging.";
    }

    public final void a(String firebaseSenderId) {
        Intrinsics.checkNotNullParameter(firebaseSenderId, "firebaseSenderId");
        try {
            if (((Boolean) this.f12402d.getValue()).booleanValue()) {
                FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new OnCompleteListener() { // from class: Z3.r0
                    public final void onComplete(Task task) {
                        com.braze.managers.b0.a(com.braze.managers.b0.this, task);
                    }
                });
            } else if (((Boolean) this.f12401c.getValue()).booleanValue()) {
                c(firebaseSenderId);
            }
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: Z3.s0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.managers.b0.e();
                }
            }, 4, (Object) null);
        }
    }

    public static final String b() {
        return "Firebase Cloud Messaging requires the Google Play Store to be installed.";
    }

    public static final boolean d() {
        return ReflectionUtils.doesMethodExist("com.google.firebase.messaging.FirebaseMessaging", "getToken", new Class[0]);
    }

    public final void c(final String str) {
        b0 b0Var;
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.f12983V;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: Z3.w0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.managers.b0.d(str);
            }
        }, 6, (Object) null);
        try {
            Method methodQuietly = ReflectionUtils.getMethodQuietly("com.google.firebase.iid.FirebaseInstanceId", "getInstance", (Class<?>[]) new Class[0]);
            if (methodQuietly == null) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.x0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.managers.b0.j();
                    }
                }, 7, (Object) null);
                return;
            }
            Pair<Boolean, Object> invokeMethodQuietly = ReflectionUtils.invokeMethodQuietly(null, methodQuietly, new Object[0]);
            if (!((Boolean) invokeMethodQuietly.getFirst()).booleanValue()) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.y0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.managers.b0.k();
                    }
                }, 7, (Object) null);
                return;
            }
            Object second = invokeMethodQuietly.getSecond();
            if (second == null) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.l0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.managers.b0.f();
                    }
                }, 7, (Object) null);
                return;
            }
            Method methodQuietly2 = ReflectionUtils.getMethodQuietly(second.getClass(), "getToken", (Class<?>[]) new Class[]{String.class, String.class});
            if (methodQuietly2 == null) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.m0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.managers.b0.g();
                    }
                }, 7, (Object) null);
                return;
            }
            Pair<Boolean, Object> invokeMethodQuietly2 = ReflectionUtils.invokeMethodQuietly(second, methodQuietly2, str, "FCM");
            if (!((Boolean) invokeMethodQuietly2.getFirst()).booleanValue()) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.n0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.managers.b0.h();
                    }
                }, 7, (Object) null);
                return;
            }
            final Object second2 = invokeMethodQuietly2.getSecond();
            if (second2 instanceof String) {
                b0Var = this;
                try {
                    BrazeLogger.brazelog$default(brazeLogger, (Object) b0Var, priority, (Throwable) null, false, new Function0() { // from class: Z3.o0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return com.braze.managers.b0.a(second2);
                        }
                    }, 6, (Object) null);
                    ((l0) b0Var.f12400b).a((String) second2);
                } catch (Exception e6) {
                    e = e6;
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) b0Var, BrazeLogger.Priority.f12981E, (Throwable) e, false, new Function0() { // from class: Z3.p0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return com.braze.managers.b0.i();
                        }
                    }, 4, (Object) null);
                }
            }
        } catch (Exception e7) {
            e = e7;
            b0Var = this;
        }
    }

    public static final void a(b0 b0Var, final Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        if (!task.isSuccessful()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) b0Var, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: Z3.u0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.managers.b0.a(task);
                }
            }, 6, (Object) null);
            return;
        }
        final String str = (String) task.getResult();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) b0Var, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: Z3.v0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.managers.b0.b(str);
            }
        }, 6, (Object) null);
        ((l0) b0Var.f12400b).a(str);
    }

    public static final String a(Task task) {
        return "Fetching registration token failed using FirebaseMessaging instance with default Firebase installation with exception " + task.getException();
    }

    public final boolean a() {
        if (com.braze.support.k.b(this.f12399a)) {
            return ((Boolean) this.f12402d.getValue()).booleanValue() || ((Boolean) this.f12401c.getValue()).booleanValue();
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: Z3.t0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.managers.b0.b();
            }
        }, 6, (Object) null);
        return false;
    }

    public static final String a(Object obj) {
        return "Automatically obtained Firebase Cloud Messaging token: " + ((String) obj);
    }
}
