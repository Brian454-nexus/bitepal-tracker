package A;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.Objects;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class k extends j {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final OutputConfiguration f9a;

        /* renamed from: b, reason: collision with root package name */
        public String f10b;

        /* renamed from: c, reason: collision with root package name */
        public long f11c = 1;

        public a(OutputConfiguration outputConfiguration) {
            this.f9a = outputConfiguration;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Objects.equals(this.f9a, aVar.f9a) && this.f11c == aVar.f11c && Objects.equals(this.f10b, aVar.f10b);
        }

        public int hashCode() {
            int hashCode = this.f9a.hashCode() ^ 31;
            int i6 = (hashCode << 5) - hashCode;
            String str = this.f10b;
            int hashCode2 = (str == null ? 0 : str.hashCode()) ^ i6;
            return Long.hashCode(this.f11c) ^ ((hashCode2 << 5) - hashCode2);
        }
    }

    public k(int i6, Surface surface) {
        this(new a(new OutputConfiguration(i6, surface)));
    }

    public static k h(OutputConfiguration outputConfiguration) {
        return new k(new a(outputConfiguration));
    }

    @Override // A.i.a
    public void b(Surface surface) {
        ((OutputConfiguration) g()).addSurface(surface);
    }

    @Override // A.i.a
    public void c(long j6) {
        ((a) this.f14a).f11c = j6;
    }

    @Override // A.i.a
    public String d() {
        return ((a) this.f14a).f10b;
    }

    @Override // A.i.a
    public void e() {
        ((OutputConfiguration) g()).enableSurfaceSharing();
    }

    @Override // A.i.a
    public void f(String str) {
        ((a) this.f14a).f10b = str;
    }

    @Override // A.j, A.i.a
    public Object g() {
        y0.g.a(this.f14a instanceof a);
        return ((a) this.f14a).f9a;
    }

    public k(Object obj) {
        super(obj);
    }
}
