package v2;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final u f19432a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f19433b;

    public m(u database) {
        Intrinsics.checkNotNullParameter(database, "database");
        this.f19432a = database;
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        Intrinsics.checkNotNullExpressionValue(newSetFromMap, "newSetFromMap(IdentityHashMap())");
        this.f19433b = newSetFromMap;
    }
}
