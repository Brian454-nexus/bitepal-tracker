package com.amazon.a.a.c;

import com.amazon.a.a.c.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class e<EventType extends a> implements Comparator<c<EventType>> {

    /* renamed from: a, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f10878a = new com.amazon.a.a.o.c("EventListenerNotificationQueue");

    /* renamed from: b, reason: collision with root package name */
    private List<c<EventType>> f10879b = new ArrayList();

    public void a(c<EventType> cVar) {
        if (com.amazon.a.a.o.c.f11253a) {
            f10878a.a("Adding listener: " + cVar);
        }
        this.f10879b.add(cVar);
        Collections.sort(this.f10879b, this);
    }

    public void a(EventType eventtype) {
        for (c<EventType> cVar : this.f10879b) {
            if (com.amazon.a.a.o.c.f11253a) {
                f10878a.a("Notifying listener: " + cVar);
            }
            cVar.a(eventtype);
        }
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(c<EventType> cVar, c<EventType> cVar2) {
        return cVar.b().compareTo(cVar2.b());
    }
}
