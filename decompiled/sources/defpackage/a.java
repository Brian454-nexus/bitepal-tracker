package defpackage;

import G9.b;
import G9.c;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a implements c.d {

    /* renamed from: a, reason: collision with root package name */
    public c.b f7522a;

    public a(b binaryMessenger) {
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        new c(binaryMessenger, "braze_banner_view_channel").d(this);
    }

    public void a(Object obj, c.b events) {
        Intrinsics.checkNotNullParameter(events, "events");
        this.f7522a = events;
    }

    public void b(Object obj) {
        this.f7522a = null;
    }

    public final void c(double d6, String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Map mapOf = MapsKt.mapOf(new Pair[]{TuplesKt.to("height", Double.valueOf(d6)), TuplesKt.to("containerId", identifier)});
        c.b bVar = this.f7522a;
        if (bVar != null) {
            bVar.a(mapOf);
        }
    }
}
