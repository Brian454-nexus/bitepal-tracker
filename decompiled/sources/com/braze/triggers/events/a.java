package com.braze.triggers.events;

import com.braze.models.outgoing.BrazeProperties;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a extends j {

    /* renamed from: f, reason: collision with root package name */
    public final String f13062f;

    public a(String str, BrazeProperties brazeProperties, com.braze.models.i iVar) {
        super(brazeProperties, iVar);
        this.f13062f = str;
    }

    @Override // com.braze.triggers.events.b
    public final String a() {
        return "custom_event";
    }
}
