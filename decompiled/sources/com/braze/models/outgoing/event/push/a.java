package com.braze.models.outgoing.event.push;

import com.braze.enums.e;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a extends com.braze.models.outgoing.event.b {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f12613j = 0;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f12614i;

    public a(JSONObject jSONObject, String str) {
        super(e.f12188i, jSONObject, 0.0d, 12);
        this.f12614i = Intrinsics.areEqual(str, "ab_none");
    }
}
