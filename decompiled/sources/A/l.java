package A;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.Objects;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class l extends k {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final OutputConfiguration f12a;

        /* renamed from: b, reason: collision with root package name */
        public long f13b = 1;

        public a(OutputConfiguration outputConfiguration) {
            this.f12a = outputConfiguration;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Objects.equals(this.f12a, aVar.f12a) && this.f13b == aVar.f13b;
        }

        public int hashCode() {
            int hashCode = this.f12a.hashCode() ^ 31;
            return Long.hashCode(this.f13b) ^ ((hashCode << 5) - hashCode);
        }
    }

    public l(int i6, Surface surface) {
        this(new a(new OutputConfiguration(i6, surface)));
    }

    public static l i(OutputConfiguration outputConfiguration) {
        return new l(new a(outputConfiguration));
    }

    @Override // A.k, A.i.a
    public void c(long j6) {
        ((a) this.f14a).f13b = j6;
    }

    @Override // A.k, A.i.a
    public String d() {
        return null;
    }

    @Override // A.k, A.i.a
    public void f(String str) {
        ((OutputConfiguration) g()).setPhysicalCameraId(str);
    }

    @Override // A.k, A.j, A.i.a
    public Object g() {
        y0.g.a(this.f14a instanceof a);
        return ((a) this.f14a).f12a;
    }

    public l(Object obj) {
        super(obj);
    }
}
