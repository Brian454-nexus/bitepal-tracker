package Q2;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final List f4488a;

    public j(List displayFeatures) {
        Intrinsics.checkNotNullParameter(displayFeatures, "displayFeatures");
        this.f4488a = displayFeatures;
    }

    public final List a() {
        return this.f4488a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(j.class, obj.getClass())) {
            return false;
        }
        return Intrinsics.areEqual(this.f4488a, ((j) obj).f4488a);
    }

    public int hashCode() {
        return this.f4488a.hashCode();
    }

    public String toString() {
        return CollectionsKt.joinToString$default(this.f4488a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", 0, (CharSequence) null, (Function1) null, 56, (Object) null);
    }
}
