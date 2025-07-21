package H3;

import G3.p;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class h extends b {

    /* renamed from: c, reason: collision with root package name */
    public final String f2221c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(JSONObject response) {
        super(g.f2215e, null);
        Intrinsics.checkNotNullParameter(response, "response");
        this.f2221c = p.c(response, "error", "");
    }

    public final String b() {
        return this.f2221c;
    }
}
