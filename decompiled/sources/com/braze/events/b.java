package com.braze.events;

import com.braze.support.BrazeLogger;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class b {
    public final Set a(final Class cls, final HashSet hashSet) {
        Intrinsics.checkNotNull(hashSet, "null cannot be cast to non-null type kotlin.collections.Set<com.braze.events.IEventSubscriber<T of com.braze.events.EventMessenger.Companion.getCastSubscriberSet>>");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, true, new Function0() { // from class: W3.a0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.events.b.a(cls, hashSet);
            }
        }, 3, (Object) null);
        return hashSet;
    }

    public static final String a(Class cls, Set set) {
        return "Triggering " + cls.getName() + " on " + set.size() + " subscribers.";
    }

    public static final HashSet a(ConcurrentHashMap concurrentHashMap, Class cls, ReentrantLock reentrantLock) {
        reentrantLock.lock();
        try {
            CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) concurrentHashMap.get(cls);
            if (copyOnWriteArraySet == null) {
                return new HashSet();
            }
            HashSet hashSet = new HashSet(copyOnWriteArraySet);
            ArrayList arrayList = new ArrayList();
            for (Object obj : copyOnWriteArraySet) {
                if (obj instanceof IFireOnceEventSubscriber) {
                    arrayList.add(obj);
                }
            }
            copyOnWriteArraySet.removeAll(CollectionsKt.toSet(arrayList));
            concurrentHashMap.put(cls, copyOnWriteArraySet);
            return hashSet;
        } finally {
            reentrantLock.unlock();
        }
    }
}
