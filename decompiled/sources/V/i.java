package V;

import I.A;
import I.AbstractC0429g0;
import I.N;
import V.d;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class i extends AbstractC0429g0 {

    /* renamed from: c, reason: collision with root package name */
    public final d.a f5288c;

    public i(A a6, d.a aVar) {
        super(a6);
        this.f5288c = aVar;
    }

    @Override // I.AbstractC0429g0, I.A
    public D6.g c(List list, int i6, int i7) {
        y0.g.b(list.size() == 1, "Only support one capture config.");
        return N.f.c(Collections.singletonList(this.f5288c.a(n((N) list.get(0)), o((N) list.get(0)))));
    }

    public final int n(N n6) {
        Integer num = (Integer) n6.f().e(N.f2294j, 100);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    public final int o(N n6) {
        Integer num = (Integer) n6.f().e(N.f2293i, 0);
        Objects.requireNonNull(num);
        return num.intValue();
    }
}
