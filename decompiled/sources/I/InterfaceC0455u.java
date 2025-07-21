package I;

import L.i;
import android.hardware.camera2.CaptureResult;

/* renamed from: I.u, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface InterfaceC0455u {

    /* renamed from: I.u$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a implements InterfaceC0455u {
        public static InterfaceC0455u i() {
            return new a();
        }

        @Override // I.InterfaceC0455u
        public S0 a() {
            return S0.b();
        }

        @Override // I.InterfaceC0455u
        public long c() {
            return -1L;
        }

        @Override // I.InterfaceC0455u
        public EnumC0451s d() {
            return EnumC0451s.UNKNOWN;
        }

        @Override // I.InterfaceC0455u
        public EnumC0453t e() {
            return EnumC0453t.UNKNOWN;
        }

        @Override // I.InterfaceC0455u
        public EnumC0446p f() {
            return EnumC0446p.UNKNOWN;
        }

        @Override // I.InterfaceC0455u
        public r h() {
            return r.UNKNOWN;
        }
    }

    S0 a();

    default void b(i.b bVar) {
        bVar.g(e());
    }

    long c();

    EnumC0451s d();

    EnumC0453t e();

    EnumC0446p f();

    default CaptureResult g() {
        return a.i().g();
    }

    r h();
}
