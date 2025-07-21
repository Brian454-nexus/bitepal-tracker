package m1;

import E1.I;
import E1.InterfaceC0314p;
import E1.InterfaceC0315q;
import E1.J;
import E1.O;
import Z0.q;
import Z0.z;
import android.text.TextUtils;
import b2.s;
import c1.AbstractC1119a;
import c1.C1111E;
import c1.C1144z;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class w implements InterfaceC0314p {

    /* renamed from: i, reason: collision with root package name */
    public static final Pattern f17419i = Pattern.compile("LOCAL:([^,]+)");

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f17420j = Pattern.compile("MPEGTS:(-?\\d+)");

    /* renamed from: a, reason: collision with root package name */
    public final String f17421a;

    /* renamed from: b, reason: collision with root package name */
    public final C1111E f17422b;

    /* renamed from: d, reason: collision with root package name */
    public final s.a f17424d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f17425e;

    /* renamed from: f, reason: collision with root package name */
    public E1.r f17426f;

    /* renamed from: h, reason: collision with root package name */
    public int f17428h;

    /* renamed from: c, reason: collision with root package name */
    public final C1144z f17423c = new C1144z();

    /* renamed from: g, reason: collision with root package name */
    public byte[] f17427g = new byte[1024];

    public w(String str, C1111E c1111e, s.a aVar, boolean z6) {
        this.f17421a = str;
        this.f17422b = c1111e;
        this.f17424d = aVar;
        this.f17425e = z6;
    }

    @Override // E1.InterfaceC0314p
    public void a(long j6, long j7) {
        throw new IllegalStateException();
    }

    public final O b(long j6) {
        O a6 = this.f17426f.a(0, 3);
        a6.e(new q.b().o0("text/vtt").e0(this.f17421a).s0(j6).K());
        this.f17426f.k();
        return a6;
    }

    @Override // E1.InterfaceC0314p
    public void c(E1.r rVar) {
        this.f17426f = this.f17425e ? new b2.u(rVar, this.f17424d) : rVar;
        rVar.n(new J.b(-9223372036854775807L));
    }

    public final void e() {
        C1144z c1144z = new C1144z(this.f17427g);
        j2.h.e(c1144z);
        long j6 = 0;
        long j7 = 0;
        for (String r6 = c1144z.r(); !TextUtils.isEmpty(r6); r6 = c1144z.r()) {
            if (r6.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher = f17419i.matcher(r6);
                if (!matcher.find()) {
                    throw z.a("X-TIMESTAMP-MAP doesn't contain local timestamp: " + r6, null);
                }
                Matcher matcher2 = f17420j.matcher(r6);
                if (!matcher2.find()) {
                    throw z.a("X-TIMESTAMP-MAP doesn't contain media timestamp: " + r6, null);
                }
                j7 = j2.h.d((String) AbstractC1119a.e(matcher.group(1)));
                j6 = C1111E.h(Long.parseLong((String) AbstractC1119a.e(matcher2.group(1))));
            }
        }
        Matcher a6 = j2.h.a(c1144z);
        if (a6 == null) {
            b(0L);
            return;
        }
        long d6 = j2.h.d((String) AbstractC1119a.e(a6.group(1)));
        long b6 = this.f17422b.b(C1111E.l((j6 + d6) - j7));
        O b7 = b(b6 - d6);
        this.f17423c.R(this.f17427g, this.f17428h);
        b7.a(this.f17423c, this.f17428h);
        b7.f(b6, 1, this.f17428h, 0, null);
    }

    @Override // E1.InterfaceC0314p
    public int g(InterfaceC0315q interfaceC0315q, I i6) {
        AbstractC1119a.e(this.f17426f);
        int a6 = (int) interfaceC0315q.a();
        int i7 = this.f17428h;
        byte[] bArr = this.f17427g;
        if (i7 == bArr.length) {
            this.f17427g = Arrays.copyOf(bArr, ((a6 != -1 ? a6 : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.f17427g;
        int i8 = this.f17428h;
        int read = interfaceC0315q.read(bArr2, i8, bArr2.length - i8);
        if (read != -1) {
            int i9 = this.f17428h + read;
            this.f17428h = i9;
            if (a6 == -1 || i9 != a6) {
                return 0;
            }
        }
        e();
        return -1;
    }

    @Override // E1.InterfaceC0314p
    public boolean i(InterfaceC0315q interfaceC0315q) {
        interfaceC0315q.g(this.f17427g, 0, 6, false);
        this.f17423c.R(this.f17427g, 6);
        if (j2.h.b(this.f17423c)) {
            return true;
        }
        interfaceC0315q.g(this.f17427g, 6, 3, false);
        this.f17423c.R(this.f17427g, 9);
        return j2.h.b(this.f17423c);
    }

    @Override // E1.InterfaceC0314p
    public void release() {
    }
}
