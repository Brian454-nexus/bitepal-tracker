package J1;

import E1.AbstractC0303e;
import E1.InterfaceC0315q;
import E1.v;
import E1.y;
import java.util.Objects;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class b extends AbstractC0303e {

    /* renamed from: J1.b$b, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class C0049b implements AbstractC0303e.f {

        /* renamed from: a, reason: collision with root package name */
        public final y f2847a;

        /* renamed from: b, reason: collision with root package name */
        public final int f2848b;

        /* renamed from: c, reason: collision with root package name */
        public final v.a f2849c;

        @Override // E1.AbstractC0303e.f
        public AbstractC0303e.C0023e a(InterfaceC0315q interfaceC0315q, long j6) {
            long position = interfaceC0315q.getPosition();
            long c6 = c(interfaceC0315q);
            long h6 = interfaceC0315q.h();
            interfaceC0315q.j(Math.max(6, this.f2847a.f1087c));
            long c7 = c(interfaceC0315q);
            return (c6 > j6 || c7 <= j6) ? c7 <= j6 ? AbstractC0303e.C0023e.f(c7, interfaceC0315q.h()) : AbstractC0303e.C0023e.d(c6, position) : AbstractC0303e.C0023e.e(h6);
        }

        public final long c(InterfaceC0315q interfaceC0315q) {
            while (interfaceC0315q.h() < interfaceC0315q.a() - 6 && !v.h(interfaceC0315q, this.f2847a, this.f2848b, this.f2849c)) {
                interfaceC0315q.j(1);
            }
            if (interfaceC0315q.h() < interfaceC0315q.a() - 6) {
                return this.f2849c.f1081a;
            }
            interfaceC0315q.j((int) (interfaceC0315q.a() - interfaceC0315q.h()));
            return this.f2847a.f1094j;
        }

        public C0049b(y yVar, int i6) {
            this.f2847a = yVar;
            this.f2848b = i6;
            this.f2849c = new v.a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(final y yVar, int i6, long j6, long j7) {
        super(new AbstractC0303e.d() { // from class: J1.a
            @Override // E1.AbstractC0303e.d
            public final long a(long j8) {
                return y.this.i(j8);
            }
        }, new C0049b(yVar, i6), yVar.f(), 0L, yVar.f1094j, j6, j7, yVar.d(), Math.max(6, yVar.f1087c));
        Objects.requireNonNull(yVar);
    }
}
