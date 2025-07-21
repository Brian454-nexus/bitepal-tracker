package q1;

import S1.h;
import Z0.q;

/* renamed from: q1.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface InterfaceC2007a {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC2007a f18630a = new C0236a();

    /* renamed from: q1.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class C0236a implements InterfaceC2007a {
        @Override // q1.InterfaceC2007a
        public N1.a a(q qVar) {
            String str = qVar.f6990n;
            if (str != null) {
                char c6 = 65535;
                switch (str.hashCode()) {
                    case -1354451219:
                        if (str.equals("application/vnd.dvb.ait")) {
                            c6 = 0;
                            break;
                        }
                        break;
                    case -1348231605:
                        if (str.equals("application/x-icy")) {
                            c6 = 1;
                            break;
                        }
                        break;
                    case -1248341703:
                        if (str.equals("application/id3")) {
                            c6 = 2;
                            break;
                        }
                        break;
                    case 1154383568:
                        if (str.equals("application/x-emsg")) {
                            c6 = 3;
                            break;
                        }
                        break;
                    case 1652648887:
                        if (str.equals("application/x-scte35")) {
                            c6 = 4;
                            break;
                        }
                        break;
                }
                switch (c6) {
                    case 0:
                        return new O1.b();
                    case 1:
                        return new R1.a();
                    case 2:
                        return new h();
                    case 3:
                        return new P1.b();
                    case 4:
                        return new U1.c();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }

        @Override // q1.InterfaceC2007a
        public boolean b(q qVar) {
            String str = qVar.f6990n;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
        }
    }

    N1.a a(q qVar);

    boolean b(q qVar);
}
