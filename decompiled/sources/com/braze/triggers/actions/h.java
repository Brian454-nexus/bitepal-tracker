package com.braze.triggers.actions;

import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class h extends g {

    /* renamed from: f, reason: collision with root package name */
    public HashMap f13025f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(JSONObject json) {
        super(json);
        Intrinsics.checkNotNullParameter(json, "json");
        this.f13025f = new LinkedHashMap();
    }
}
