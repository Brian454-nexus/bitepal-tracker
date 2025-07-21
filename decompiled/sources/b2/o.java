package b2;

import E1.E;
import E1.I;
import E1.InterfaceC0314p;
import E1.InterfaceC0315q;
import E1.O;
import Z0.z;
import b2.s;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import c1.C1144z;
import c1.InterfaceC1125g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class o implements InterfaceC0314p {

    /* renamed from: a, reason: collision with root package name */
    public final s f10474a;

    /* renamed from: c, reason: collision with root package name */
    public final Z0.q f10476c;

    /* renamed from: g, reason: collision with root package name */
    public O f10480g;

    /* renamed from: h, reason: collision with root package name */
    public int f10481h;

    /* renamed from: b, reason: collision with root package name */
    public final C1080d f10475b = new C1080d();

    /* renamed from: f, reason: collision with root package name */
    public byte[] f10479f = AbstractC1117K.f10565f;

    /* renamed from: e, reason: collision with root package name */
    public final C1144z f10478e = new C1144z();

    /* renamed from: d, reason: collision with root package name */
    public final List f10477d = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public int f10482i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long[] f10483j = AbstractC1117K.f10566g;

    /* renamed from: k, reason: collision with root package name */
    public long f10484k = -9223372036854775807L;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b implements Comparable {

        /* renamed from: a, reason: collision with root package name */
        public final long f10485a;

        /* renamed from: b, reason: collision with root package name */
        public final byte[] f10486b;

        @Override // java.lang.Comparable
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            return Long.compare(this.f10485a, bVar.f10485a);
        }

        public b(long j6, byte[] bArr) {
            this.f10485a = j6;
            this.f10486b = bArr;
        }
    }

    public o(s sVar, Z0.q qVar) {
        this.f10474a = sVar;
        this.f10476c = qVar.a().o0("application/x-media3-cues").O(qVar.f6990n).S(sVar.d()).K();
    }

    public static /* synthetic */ void b(o oVar, C1081e c1081e) {
        oVar.getClass();
        b bVar = new b(c1081e.f10465b, oVar.f10475b.a(c1081e.f10464a, c1081e.f10466c));
        oVar.f10477d.add(bVar);
        long j6 = oVar.f10484k;
        if (j6 == -9223372036854775807L || c1081e.f10465b >= j6) {
            oVar.l(bVar);
        }
    }

    @Override // E1.InterfaceC0314p
    public void a(long j6, long j7) {
        int i6 = this.f10482i;
        AbstractC1119a.g((i6 == 0 || i6 == 5) ? false : true);
        this.f10484k = j7;
        if (this.f10482i == 2) {
            this.f10482i = 1;
        }
        if (this.f10482i == 4) {
            this.f10482i = 3;
        }
    }

    @Override // E1.InterfaceC0314p
    public void c(E1.r rVar) {
        AbstractC1119a.g(this.f10482i == 0);
        O a6 = rVar.a(0, 3);
        this.f10480g = a6;
        a6.e(this.f10476c);
        rVar.k();
        rVar.n(new E(new long[]{0}, new long[]{0}, -9223372036854775807L));
        this.f10482i = 1;
    }

    public final void e() {
        try {
            long j6 = this.f10484k;
            this.f10474a.c(this.f10479f, 0, this.f10481h, j6 != -9223372036854775807L ? s.b.c(j6) : s.b.b(), new InterfaceC1125g() { // from class: b2.n
                @Override // c1.InterfaceC1125g
                public final void accept(Object obj) {
                    o.b(o.this, (C1081e) obj);
                }
            });
            Collections.sort(this.f10477d);
            this.f10483j = new long[this.f10477d.size()];
            for (int i6 = 0; i6 < this.f10477d.size(); i6++) {
                this.f10483j[i6] = ((b) this.f10477d.get(i6)).f10485a;
            }
            this.f10479f = AbstractC1117K.f10565f;
        } catch (RuntimeException e6) {
            throw z.a("SubtitleParser failed.", e6);
        }
    }

    public final boolean f(InterfaceC0315q interfaceC0315q) {
        byte[] bArr = this.f10479f;
        if (bArr.length == this.f10481h) {
            this.f10479f = Arrays.copyOf(bArr, bArr.length + 1024);
        }
        byte[] bArr2 = this.f10479f;
        int i6 = this.f10481h;
        int read = interfaceC0315q.read(bArr2, i6, bArr2.length - i6);
        if (read != -1) {
            this.f10481h += read;
        }
        long a6 = interfaceC0315q.a();
        return (a6 != -1 && ((long) this.f10481h) == a6) || read == -1;
    }

    @Override // E1.InterfaceC0314p
    public int g(InterfaceC0315q interfaceC0315q, I i6) {
        int i7 = this.f10482i;
        AbstractC1119a.g((i7 == 0 || i7 == 5) ? false : true);
        if (this.f10482i == 1) {
            int d6 = interfaceC0315q.a() != -1 ? C6.g.d(interfaceC0315q.a()) : 1024;
            if (d6 > this.f10479f.length) {
                this.f10479f = new byte[d6];
            }
            this.f10481h = 0;
            this.f10482i = 2;
        }
        if (this.f10482i == 2 && f(interfaceC0315q)) {
            e();
            this.f10482i = 4;
        }
        if (this.f10482i == 3 && j(interfaceC0315q)) {
            k();
            this.f10482i = 4;
        }
        return this.f10482i == 4 ? -1 : 0;
    }

    @Override // E1.InterfaceC0314p
    public boolean i(InterfaceC0315q interfaceC0315q) {
        return true;
    }

    public final boolean j(InterfaceC0315q interfaceC0315q) {
        return interfaceC0315q.k((interfaceC0315q.a() > (-1L) ? 1 : (interfaceC0315q.a() == (-1L) ? 0 : -1)) != 0 ? C6.g.d(interfaceC0315q.a()) : 1024) == -1;
    }

    public final void k() {
        long j6 = this.f10484k;
        for (int h6 = j6 == -9223372036854775807L ? 0 : AbstractC1117K.h(this.f10483j, j6, true, true); h6 < this.f10477d.size(); h6++) {
            l((b) this.f10477d.get(h6));
        }
    }

    public final void l(b bVar) {
        AbstractC1119a.i(this.f10480g);
        int length = bVar.f10486b.length;
        this.f10478e.Q(bVar.f10486b);
        this.f10480g.a(this.f10478e, length);
        this.f10480g.f(bVar.f10485a, 1, length, 0, null);
    }

    @Override // E1.InterfaceC0314p
    public void release() {
        if (this.f10482i == 5) {
            return;
        }
        this.f10474a.a();
        this.f10482i = 5;
    }
}
