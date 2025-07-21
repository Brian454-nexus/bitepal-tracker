package com.braze.triggers.events;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class d extends i {

    /* renamed from: e, reason: collision with root package name */
    public final String f13063e;

    /* renamed from: f, reason: collision with root package name */
    public final String f13064f;

    public d(String str) {
        this.f13063e = i.a(str);
    }

    @Override // com.braze.triggers.events.b
    public final String a() {
        return "iam_click";
    }

    public d(String str, String str2) {
        this.f13063e = i.a(str);
        this.f13064f = str2;
    }
}
