package w1;

import c1.AbstractC1119a;
import g1.C1343l0;
import java.util.List;
import kotlin.jvm.internal.LongCompanionObject;
import z6.w;

/* renamed from: w1.i, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C2224i implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final z6.w f20056a;

    /* renamed from: b, reason: collision with root package name */
    public long f20057b;

    /* renamed from: w1.i$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a implements c0 {

        /* renamed from: a, reason: collision with root package name */
        public final c0 f20058a;

        /* renamed from: b, reason: collision with root package name */
        public final z6.w f20059b;

        public a(c0 c0Var, List list) {
            this.f20058a = c0Var;
            this.f20059b = z6.w.s(list);
        }

        public z6.w a() {
            return this.f20059b;
        }

        @Override // w1.c0
        public boolean b(C1343l0 c1343l0) {
            return this.f20058a.b(c1343l0);
        }

        @Override // w1.c0
        public long d() {
            return this.f20058a.d();
        }

        @Override // w1.c0
        public boolean e() {
            return this.f20058a.e();
        }

        @Override // w1.c0
        public long f() {
            return this.f20058a.f();
        }

        @Override // w1.c0
        public void h(long j6) {
            this.f20058a.h(j6);
        }
    }

    public C2224i(List list, List list2) {
        w.a o6 = z6.w.o();
        AbstractC1119a.a(list.size() == list2.size());
        for (int i6 = 0; i6 < list.size(); i6++) {
            o6.h(new a((c0) list.get(i6), (List) list2.get(i6)));
        }
        this.f20056a = o6.k();
        this.f20057b = -9223372036854775807L;
    }

    @Override // w1.c0
    public boolean b(C1343l0 c1343l0) {
        boolean z6;
        boolean z7 = false;
        do {
            long d6 = d();
            if (d6 == Long.MIN_VALUE) {
                return z7;
            }
            z6 = false;
            for (int i6 = 0; i6 < this.f20056a.size(); i6++) {
                long d7 = ((a) this.f20056a.get(i6)).d();
                boolean z8 = d7 != Long.MIN_VALUE && d7 <= c1343l0.f14722a;
                if (d7 == d6 || z8) {
                    z6 |= ((a) this.f20056a.get(i6)).b(c1343l0);
                }
            }
            z7 |= z6;
        } while (z6);
        return z7;
    }

    @Override // w1.c0
    public long d() {
        long j6 = Long.MAX_VALUE;
        for (int i6 = 0; i6 < this.f20056a.size(); i6++) {
            long d6 = ((a) this.f20056a.get(i6)).d();
            if (d6 != Long.MIN_VALUE) {
                j6 = Math.min(j6, d6);
            }
        }
        if (j6 == LongCompanionObject.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j6;
    }

    @Override // w1.c0
    public boolean e() {
        for (int i6 = 0; i6 < this.f20056a.size(); i6++) {
            if (((a) this.f20056a.get(i6)).e()) {
                return true;
            }
        }
        return false;
    }

    @Override // w1.c0
    public long f() {
        long j6 = Long.MAX_VALUE;
        long j7 = Long.MAX_VALUE;
        for (int i6 = 0; i6 < this.f20056a.size(); i6++) {
            a aVar = (a) this.f20056a.get(i6);
            long f6 = aVar.f();
            if ((aVar.a().contains(1) || aVar.a().contains(2) || aVar.a().contains(4)) && f6 != Long.MIN_VALUE) {
                j6 = Math.min(j6, f6);
            }
            if (f6 != Long.MIN_VALUE) {
                j7 = Math.min(j7, f6);
            }
        }
        if (j6 != LongCompanionObject.MAX_VALUE) {
            this.f20057b = j6;
            return j6;
        }
        if (j7 == LongCompanionObject.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j8 = this.f20057b;
        return j8 != -9223372036854775807L ? j8 : j7;
    }

    @Override // w1.c0
    public void h(long j6) {
        for (int i6 = 0; i6 < this.f20056a.size(); i6++) {
            ((a) this.f20056a.get(i6)).h(j6);
        }
    }
}
