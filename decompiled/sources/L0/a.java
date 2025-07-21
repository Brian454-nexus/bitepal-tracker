package L0;

import android.content.Context;
import ga.J;
import ga.K;
import ga.Q0;
import ga.Y;
import ga.u0;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.properties.ReadOnlyProperty;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class a {

    /* renamed from: L0.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class C0057a extends Lambda implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final C0057a f3084a = new C0057a();

        public C0057a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke(Context it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return CollectionsKt.emptyList();
        }
    }

    public static final ReadOnlyProperty a(String name, J0.b bVar, Function1 produceMigrations, J scope) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(produceMigrations, "produceMigrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        return new c(name, bVar, produceMigrations, scope);
    }

    public static /* synthetic */ ReadOnlyProperty b(String str, J0.b bVar, Function1 function1, J j6, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            bVar = null;
        }
        if ((i6 & 4) != 0) {
            function1 = C0057a.f3084a;
        }
        if ((i6 & 8) != 0) {
            j6 = K.a(Y.b().plus(Q0.b((u0) null, 1, (Object) null)));
        }
        return a(str, bVar, function1, j6);
    }
}
