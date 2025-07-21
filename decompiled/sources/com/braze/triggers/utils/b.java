package com.braze.triggers.utils;

import com.braze.triggers.actions.g;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final Comparator f13109b = new Comparator() { // from class: u4.a
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return com.braze.triggers.utils.b.a((com.braze.triggers.actions.a) obj, (com.braze.triggers.actions.a) obj2);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final PriorityQueue f13110a;

    public b(ArrayList fallbackActions) {
        Intrinsics.checkNotNullParameter(fallbackActions, "fallbackActions");
        PriorityQueue priorityQueue = new PriorityQueue(12, f13109b);
        this.f13110a = priorityQueue;
        priorityQueue.addAll(fallbackActions);
    }

    public static final int a(com.braze.triggers.actions.a actionA, com.braze.triggers.actions.a actionB) {
        Intrinsics.checkNotNullParameter(actionA, "actionA");
        Intrinsics.checkNotNullParameter(actionB, "actionB");
        g gVar = (g) actionA;
        int i6 = gVar.f13021b.f13047c;
        g gVar2 = (g) actionB;
        int i7 = gVar2.f13021b.f13047c;
        if (i6 > i7) {
            return -1;
        }
        if (i6 < i7) {
            return 1;
        }
        return gVar.f13020a.compareTo(gVar2.f13020a);
    }
}
