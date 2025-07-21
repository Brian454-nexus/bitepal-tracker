package y1;

import Z0.q;
import b2.C1084h;
import b2.l;
import b2.s;
import c2.C1145a;
import java.util.Objects;

/* renamed from: y1.g, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface InterfaceC2350g {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC2350g f21183a = new a();

    /* renamed from: y1.g$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements InterfaceC2350g {

        /* renamed from: b, reason: collision with root package name */
        public final C1084h f21184b = new C1084h();

        @Override // y1.InterfaceC2350g
        public l a(q qVar) {
            String str = qVar.f6990n;
            if (str != null) {
                char c6 = 65535;
                switch (str.hashCode()) {
                    case 930165504:
                        if (str.equals("application/x-mp4-cea-608")) {
                            c6 = 0;
                            break;
                        }
                        break;
                    case 1566015601:
                        if (str.equals("application/cea-608")) {
                            c6 = 1;
                            break;
                        }
                        break;
                    case 1566016562:
                        if (str.equals("application/cea-708")) {
                            c6 = 2;
                            break;
                        }
                        break;
                }
                switch (c6) {
                    case 0:
                    case 1:
                        return new C1145a(str, qVar.f6971G, 16000L);
                    case 2:
                        return new c2.c(qVar.f6971G, qVar.f6993q);
                }
            }
            if (!this.f21184b.b(qVar)) {
                throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
            }
            s c7 = this.f21184b.c(qVar);
            return new C2345b(c7.getClass().getSimpleName() + "Decoder", c7);
        }

        @Override // y1.InterfaceC2350g
        public boolean b(q qVar) {
            String str = qVar.f6990n;
            return this.f21184b.b(qVar) || Objects.equals(str, "application/cea-608") || Objects.equals(str, "application/x-mp4-cea-608") || Objects.equals(str, "application/cea-708");
        }
    }

    l a(q qVar);

    boolean b(q qVar);
}
