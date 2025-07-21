package com.braze.managers;

import com.braze.support.BrazeLogger;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final com.braze.storage.v f12570a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f12571b;

    public z(com.braze.storage.v brazeEventStorageProvider) {
        Intrinsics.checkNotNullParameter(brazeEventStorageProvider, "brazeEventStorageProvider");
        this.f12570a = brazeEventStorageProvider;
    }

    public static final String b(com.braze.models.i iVar) {
        return "Storage manager is closed. Not adding event: " + iVar;
    }

    public final void a(final com.braze.models.i event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.f12571b) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: Z3.U3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.managers.z.b(com.braze.models.i.this);
                }
            }, 6, (Object) null);
        } else {
            this.f12570a.a(event);
        }
    }

    public static final String b() {
        return "Started offline event recovery task.";
    }

    public final void a(final LinkedHashSet events) {
        Intrinsics.checkNotNullParameter(events, "events");
        if (this.f12571b) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: Z3.V3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.managers.z.a(events);
                }
            }, 6, (Object) null);
        } else {
            this.f12570a.a(events);
        }
    }

    public static final String a(Set set) {
        return "Storage manager is closed. Not deleting events: " + set;
    }

    public final void a(com.braze.events.d internalEventPublisher) {
        Intrinsics.checkNotNullParameter(internalEventPublisher, "internalEventPublisher");
        if (this.f12571b) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: Z3.R3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.managers.z.a();
                }
            }, 6, (Object) null);
            return;
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.S3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.managers.z.b();
            }
        }, 7, (Object) null);
        final List events = CollectionsKt.toList(this.f12570a.c());
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: Z3.T3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.managers.z.a(events);
            }
        }, 6, (Object) null);
        Intrinsics.checkNotNullParameter(events, "events");
        internalEventPublisher.b(new com.braze.events.internal.dispatchmanager.c(com.braze.events.internal.dispatchmanager.b.f12266b, events, null, null, 12), com.braze.events.internal.dispatchmanager.c.class);
    }

    public static final String a() {
        return "Storage manager is closed. Not starting offline recovery.";
    }

    public static final String a(List list) {
        return "Adding events to dispatch from storage: " + list;
    }
}
