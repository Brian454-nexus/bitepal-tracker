package A;

import A.i;
import java.util.Objects;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class n implements i.a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f14a;

    public n(Object obj) {
        this.f14a = obj;
    }

    @Override // A.i.a
    public void a(long j6) {
    }

    public boolean equals(Object obj) {
        if (obj instanceof n) {
            return Objects.equals(this.f14a, ((n) obj).f14a);
        }
        return false;
    }

    public int hashCode() {
        return this.f14a.hashCode();
    }
}
