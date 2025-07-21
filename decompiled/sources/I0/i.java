package I0;

import ga.J;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f2601a = new i();

    public final h a(w storage, J0.b bVar, List migrations, J scope) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        d dVar = bVar;
        if (bVar == null) {
            dVar = new J0.a();
        }
        return new j(storage, CollectionsKt.listOf(g.f2584a.b(migrations)), dVar, scope);
    }
}
