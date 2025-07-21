package com.braze.triggers.events;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class g extends i {

    /* renamed from: e, reason: collision with root package name */
    public final String f13066e;

    public g(String str, com.braze.models.outgoing.event.push.b bVar) {
        this.f13071c = bVar;
        this.f13066e = i.a(str);
    }

    @Override // com.braze.triggers.events.b
    public final String a() {
        return "push_click";
    }
}
