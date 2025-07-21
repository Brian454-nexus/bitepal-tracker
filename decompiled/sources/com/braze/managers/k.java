package com.braze.managers;

import android.content.Context;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.models.IBrazeLocation;
import com.braze.support.BrazeLogger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class k implements f0 {

    /* renamed from: d, reason: collision with root package name */
    public static final j f12439d = new j();

    /* renamed from: a, reason: collision with root package name */
    public final m f12440a;

    /* renamed from: b, reason: collision with root package name */
    public final BrazeConfigurationProvider f12441b;

    /* renamed from: c, reason: collision with root package name */
    public final com.braze.location.b f12442c;

    public k(Context context, m brazeManager, BrazeConfigurationProvider appConfigurationProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        Intrinsics.checkNotNullParameter(appConfigurationProvider, "appConfigurationProvider");
        this.f12440a = brazeManager;
        this.f12441b = appConfigurationProvider;
        this.f12442c = new com.braze.location.b(context, f12439d.a(appConfigurationProvider), appConfigurationProvider);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: Z3.H1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.managers.k.c();
            }
        }, 6, (Object) null);
    }

    public static final String a() {
        return "Location collection enabled via sdk configuration.";
    }

    public static final String b() {
        return "Location collection disabled via sdk configuration.";
    }

    public static final String c() {
        return "***Location API not found. Please include android-sdk-location module***";
    }

    public static final String e() {
        return "Location collection is disabled. Not logging location recorded event.";
    }

    public static final String f() {
        return "Failed to log location recorded event.";
    }

    public final boolean d() {
        if (this.f12441b.isLocationCollectionEnabled()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: Z3.M1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.managers.k.a();
                }
            }, 6, (Object) null);
            return false;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: Z3.N1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.managers.k.b();
            }
        }, 6, (Object) null);
        return true;
    }

    public final boolean g() {
        com.braze.location.b bVar = this.f12442c;
        Function1 locationUpdateCallback = new Function1() { // from class: Z3.I1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.braze.managers.k.a(com.braze.managers.k.this, (IBrazeLocation) obj);
            }
        };
        bVar.getClass();
        Intrinsics.checkNotNullParameter(locationUpdateCallback, "locationUpdateCallback");
        return false;
    }

    public static final String b(IBrazeLocation iBrazeLocation) {
        return "Invoked manualSetUserLocation for " + iBrazeLocation;
    }

    public final boolean a(final IBrazeLocation location) {
        k kVar;
        Intrinsics.checkNotNullParameter(location, "location");
        try {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            kVar = this;
            try {
                BrazeLogger.brazelog$default(brazeLogger, (Object) kVar, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: Z3.J1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.managers.k.b(IBrazeLocation.this);
                    }
                }, 6, (Object) null);
                if (d()) {
                    BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: Z3.K1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return com.braze.managers.k.e();
                        }
                    }, 6, (Object) null);
                    return false;
                }
                com.braze.models.i a6 = com.braze.models.outgoing.event.b.f12605g.a(location);
                if (a6 == null) {
                    return true;
                }
                kVar = this;
                kVar.f12440a.a(a6);
                return true;
            } catch (Exception e6) {
                e = e6;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) kVar, BrazeLogger.Priority.f12981E, (Throwable) e, false, new Function0() { // from class: Z3.L1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.managers.k.f();
                    }
                }, 4, (Object) null);
                return false;
            }
        } catch (Exception e7) {
            e = e7;
            kVar = this;
        }
    }

    public static final Unit a(k kVar, IBrazeLocation it) {
        Intrinsics.checkNotNullParameter(it, "it");
        kVar.a(it);
        return Unit.INSTANCE;
    }
}
