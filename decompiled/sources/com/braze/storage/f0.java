package com.braze.storage;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.support.BrazeLogger;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f12914a;

    public f0(Context context, String str, String str2) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f12914a = com.braze.managers.c.a(context, str, str2, new StringBuilder("com.appboy.storage.appboy_event_storage"), 0);
    }

    public static final String a(String str) {
        return com.braze.j.a("Deleting event from storage with uid ", str);
    }

    public static final String c(com.braze.models.i iVar) {
        return "Adding event to storage with uid " + ((com.braze.models.outgoing.event.b) iVar).f12610d;
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [T, java.lang.String] */
    public final Collection b() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Map<String, ?> all = this.f12914a.getAll();
        Intrinsics.checkNotNullExpressionValue(all, "getAll(...)");
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            final String key = entry.getKey();
            Object value = entry.getValue();
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = "";
            try {
                Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.String");
                objectRef.element = (String) value;
                Intrinsics.checkNotNull(key);
                com.braze.models.i e6 = com.braze.models.outgoing.event.b.f12605g.e((String) value, key);
                if (e6 != null) {
                    linkedHashSet.add(e6);
                }
            } catch (Exception e7) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e7, false, new Function0() { // from class: o4.r
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.storage.f0.a(Ref.ObjectRef.this, key);
                    }
                }, 4, (Object) null);
                SharedPreferences.Editor edit = this.f12914a.edit();
                edit.remove(key);
                edit.apply();
                Unit unit = Unit.INSTANCE;
            }
        }
        return linkedHashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final String a(Ref.ObjectRef objectRef, String str) {
        return "Could not create BrazeEvent from [serialized event string=" + ((String) objectRef.element) + ", unique identifier=" + str + "] ... Deleting!";
    }

    public final void a(final com.braze.models.i event) {
        Intrinsics.checkNotNullParameter(event, "event");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: o4.s
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.storage.f0.c(com.braze.models.i.this);
            }
        }, 7, (Object) null);
        SharedPreferences.Editor edit = this.f12914a.edit();
        String str = ((com.braze.models.outgoing.event.b) event).f12610d;
        event.getClass();
        String jSONObject = ((com.braze.models.outgoing.event.b) event).getKey().toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
        edit.putString(str, jSONObject).apply();
    }

    public final void a(Set events) {
        Intrinsics.checkNotNullParameter(events, "events");
        SharedPreferences.Editor edit = this.f12914a.edit();
        Iterator it = events.iterator();
        while (it.hasNext()) {
            final String str = ((com.braze.models.outgoing.event.b) ((com.braze.models.i) it.next())).f12610d;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: o4.t
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.storage.f0.a(str);
                }
            }, 7, (Object) null);
            edit.remove(str);
        }
        edit.apply();
    }
}
