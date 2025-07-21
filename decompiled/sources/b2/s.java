package b2;

import c1.InterfaceC1125g;
import java.util.Objects;
import z6.w;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface s {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f10491a = new C0159a();

        /* renamed from: b2.s$a$a, reason: collision with other inner class name */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public class C0159a implements a {
            @Override // b2.s.a
            public boolean b(Z0.q qVar) {
                return false;
            }

            @Override // b2.s.a
            public s c(Z0.q qVar) {
                throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
            }

            @Override // b2.s.a
            public int d(Z0.q qVar) {
                return 1;
            }
        }

        boolean b(Z0.q qVar);

        s c(Z0.q qVar);

        int d(Z0.q qVar);
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b {

        /* renamed from: c, reason: collision with root package name */
        public static final b f10492c = new b(-9223372036854775807L, false);

        /* renamed from: a, reason: collision with root package name */
        public final long f10493a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f10494b;

        public b(long j6, boolean z6) {
            this.f10493a = j6;
            this.f10494b = z6;
        }

        public static b b() {
            return f10492c;
        }

        public static b c(long j6) {
            return new b(j6, true);
        }
    }

    default void a() {
    }

    default k b(byte[] bArr, int i6, int i7) {
        final w.a o6 = z6.w.o();
        b bVar = b.f10492c;
        Objects.requireNonNull(o6);
        c(bArr, i6, i7, bVar, new InterfaceC1125g() { // from class: b2.r
            @Override // c1.InterfaceC1125g
            public final void accept(Object obj) {
                o6.h((C1081e) obj);
            }
        });
        return new C1083g(o6.k());
    }

    void c(byte[] bArr, int i6, int i7, b bVar, InterfaceC1125g interfaceC1125g);

    int d();
}
