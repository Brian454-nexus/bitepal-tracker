package com.braze.storage;

import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.support.BrazeLogger;
import ga.L;
import java.util.Collection;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final f0 f12961a;

    /* renamed from: b, reason: collision with root package name */
    public final com.braze.events.d f12962b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f12963c;

    public v(f0 storage, com.braze.events.d eventPublisher) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(eventPublisher, "eventPublisher");
        this.f12961a = storage;
        this.f12962b = eventPublisher;
    }

    public static final String a(String str) {
        return com.braze.j.a("Storage provider is closed. Failed to ", str);
    }

    public static final String b() {
        return "Failed to get all events from storage.";
    }

    public static final String d() {
        return "Failed to log storage exception";
    }

    public final Collection c() {
        if (this.f12963c) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: o4.x0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.storage.v.a();
                }
            }, 6, (Object) null);
            return SetsKt.emptySet();
        }
        try {
            return this.f12961a.b();
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: o4.y0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.storage.v.b();
                }
            }, 4, (Object) null);
            a(e6);
            return SetsKt.emptySet();
        }
    }

    public static final String a() {
        return "Storage provider is closed. Not getting all events.";
    }

    public final void a(final com.braze.models.i event) {
        Intrinsics.checkNotNullParameter(event, "event");
        a("add event " + event, new Function0() { // from class: o4.z0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.storage.v.a(com.braze.storage.v.this, event);
            }
        });
    }

    public static final Unit a(v vVar, com.braze.models.i iVar) {
        vVar.f12961a.a(iVar);
        return Unit.INSTANCE;
    }

    public final void a(final Set events) {
        Intrinsics.checkNotNullParameter(events, "events");
        a("delete events " + events, new Function0() { // from class: o4.C0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.storage.v.a(com.braze.storage.v.this, events);
            }
        });
    }

    public static final Unit a(v vVar, Set set) {
        vVar.f12961a.a(set);
        return Unit.INSTANCE;
    }

    public final void a(Exception exc) {
        try {
            this.f12962b.b(new com.braze.exceptions.b("A storage exception has occurred!", exc), com.braze.exceptions.b.class);
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: o4.A0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.storage.v.d();
                }
            }, 4, (Object) null);
        }
    }

    public final void a(final String str, Function0 function0) {
        if (this.f12963c) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: o4.B0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.storage.v.a(str);
                }
            }, 6, (Object) null);
        } else {
            ga.i.d(BrazeCoroutineScope.INSTANCE, (CoroutineContext) null, (L) null, new u(function0, this, str, null), 3, (Object) null);
        }
    }
}
