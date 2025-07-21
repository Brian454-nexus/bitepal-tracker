package com.braze.events.internal;

import com.braze.models.inappmessage.IInAppMessage;
import com.braze.support.JsonUtils;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final com.braze.triggers.events.b f12287a;

    /* renamed from: b, reason: collision with root package name */
    public final com.braze.triggers.actions.h f12288b;

    /* renamed from: c, reason: collision with root package name */
    public final IInAppMessage f12289c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12290d;

    public m(com.braze.triggers.events.b triggerEvent, com.braze.triggers.actions.h triggeredAction, IInAppMessage inAppMessage, String str) {
        Intrinsics.checkNotNullParameter(triggerEvent, "triggerEvent");
        Intrinsics.checkNotNullParameter(triggeredAction, "triggeredAction");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        this.f12287a = triggerEvent;
        this.f12288b = triggeredAction;
        this.f12289c = inAppMessage;
        this.f12290d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.areEqual(this.f12287a, mVar.f12287a) && Intrinsics.areEqual(this.f12288b, mVar.f12288b) && Intrinsics.areEqual(this.f12289c, mVar.f12289c) && Intrinsics.areEqual(this.f12290d, mVar.f12290d);
    }

    public final int hashCode() {
        int hashCode = (this.f12289c.hashCode() + ((this.f12288b.hashCode() + (this.f12287a.hashCode() * 31)) * 31)) * 31;
        String str = this.f12290d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return StringsKt.trimIndent("\n             " + JsonUtils.getPrettyPrintedString(this.f12289c.getJsonObject()) + "\n             Triggered Action Id: " + this.f12288b.f13020a + "\n             Trigger Event: " + this.f12287a + "\n             User Id: " + this.f12290d + "\n        ");
    }
}
