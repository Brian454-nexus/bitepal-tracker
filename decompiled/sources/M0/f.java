package M0;

import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class f {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f3372a;

        public a(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f3372a = name;
        }

        public final String a() {
            return this.f3372a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return Intrinsics.areEqual(this.f3372a, ((a) obj).f3372a);
            }
            return false;
        }

        public int hashCode() {
            return this.f3372a.hashCode();
        }

        public String toString() {
            return this.f3372a;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {
    }

    public abstract Map a();

    public abstract Object b(a aVar);

    public final c c() {
        return new c(MapsKt.toMutableMap(a()), false);
    }

    public final f d() {
        return new c(MapsKt.toMutableMap(a()), true);
    }
}
