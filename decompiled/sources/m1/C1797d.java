package m1;

import E1.InterfaceC0314p;
import E1.InterfaceC0315q;
import Z0.q;
import Z0.x;
import Z0.y;
import android.net.Uri;
import android.text.TextUtils;
import b2.C1084h;
import b2.s;
import c1.AbstractC1119a;
import c1.C1111E;
import h1.v1;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import k2.C1668b;
import k2.C1671e;
import k2.C1674h;
import k2.C1676j;
import k2.J;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: m1.d, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1797d implements h {

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f17239f = {8, 13, 11, 2, 0, 1, 7};

    /* renamed from: b, reason: collision with root package name */
    public final int f17240b;

    /* renamed from: c, reason: collision with root package name */
    public s.a f17241c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f17242d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f17243e;

    public C1797d() {
        this(0, true);
    }

    public static void e(int i6, List list) {
        if (C6.g.i(f17239f, i6) == -1 || list.contains(Integer.valueOf(i6))) {
            return;
        }
        list.add(Integer.valueOf(i6));
    }

    public static Y1.h h(s.a aVar, boolean z6, C1111E c1111e, Z0.q qVar, List list) {
        int i6 = k(qVar) ? 4 : 0;
        if (!z6) {
            aVar = s.a.f10491a;
            i6 |= 32;
        }
        s.a aVar2 = aVar;
        int i7 = i6;
        if (list == null) {
            list = z6.w.w();
        }
        return new Y1.h(aVar2, i7, c1111e, null, list, null);
    }

    public static J i(int i6, boolean z6, Z0.q qVar, List list, C1111E c1111e, s.a aVar, boolean z7) {
        int i7;
        int i8 = i6 | 16;
        if (list != null) {
            i8 = i6 | 48;
        } else {
            list = z6 ? Collections.singletonList(new q.b().o0("application/cea-608").K()) : Collections.EMPTY_LIST;
        }
        String str = qVar.f6986j;
        if (!TextUtils.isEmpty(str)) {
            if (!y.b(str, "audio/mp4a-latm")) {
                i8 |= 2;
            }
            if (!y.b(str, "video/avc")) {
                i8 |= 4;
            }
        }
        if (z7) {
            i7 = 0;
        } else {
            aVar = s.a.f10491a;
            i7 = 1;
        }
        return new J(2, i7, aVar, c1111e, new C1676j(i8, list), 112800);
    }

    public static boolean k(Z0.q qVar) {
        x xVar = qVar.f6987k;
        if (xVar == null) {
            return false;
        }
        for (int i6 = 0; i6 < xVar.f(); i6++) {
            if (xVar.e(i6) instanceof t) {
                return !((t) r2).f17411c.isEmpty();
            }
        }
        return false;
    }

    public static boolean m(InterfaceC0314p interfaceC0314p, InterfaceC0315q interfaceC0315q) {
        try {
            boolean i6 = interfaceC0314p.i(interfaceC0315q);
            interfaceC0315q.o();
            return i6;
        } catch (EOFException unused) {
            interfaceC0315q.o();
            return false;
        } catch (Throwable th) {
            interfaceC0315q.o();
            throw th;
        }
    }

    @Override // m1.h
    public Z0.q c(Z0.q qVar) {
        String str;
        if (!this.f17242d || !this.f17241c.b(qVar)) {
            return qVar;
        }
        q.b S5 = qVar.a().o0("application/x-media3-cues").S(this.f17241c.d(qVar));
        StringBuilder sb = new StringBuilder();
        sb.append(qVar.f6990n);
        if (qVar.f6986j != null) {
            str = " " + qVar.f6986j;
        } else {
            str = "";
        }
        sb.append(str);
        return S5.O(sb.toString()).s0(LongCompanionObject.MAX_VALUE).K();
    }

    @Override // m1.h
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public C1795b d(Uri uri, Z0.q qVar, List list, C1111E c1111e, Map map, InterfaceC0315q interfaceC0315q, v1 v1Var) {
        int a6 = Z0.o.a(qVar.f6990n);
        int b6 = Z0.o.b(map);
        int c6 = Z0.o.c(uri);
        int[] iArr = f17239f;
        ArrayList arrayList = new ArrayList(iArr.length);
        e(a6, arrayList);
        e(b6, arrayList);
        e(c6, arrayList);
        for (int i6 : iArr) {
            e(i6, arrayList);
        }
        interfaceC0315q.o();
        InterfaceC0314p interfaceC0314p = null;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            int intValue = ((Integer) arrayList.get(i7)).intValue();
            InterfaceC0314p interfaceC0314p2 = (InterfaceC0314p) AbstractC1119a.e(g(intValue, qVar, list, c1111e));
            if (m(interfaceC0314p2, interfaceC0315q)) {
                return new C1795b(interfaceC0314p2, qVar, c1111e, this.f17241c, this.f17242d);
            }
            if (interfaceC0314p == null && (intValue == a6 || intValue == b6 || intValue == c6 || intValue == 11)) {
                interfaceC0314p = interfaceC0314p2;
            }
        }
        return new C1795b((InterfaceC0314p) AbstractC1119a.e(interfaceC0314p), qVar, c1111e, this.f17241c, this.f17242d);
    }

    public final InterfaceC0314p g(int i6, Z0.q qVar, List list, C1111E c1111e) {
        if (i6 == 0) {
            return new C1668b();
        }
        if (i6 == 1) {
            return new C1671e();
        }
        if (i6 == 2) {
            return new C1674h();
        }
        if (i6 == 7) {
            return new X1.f(0, 0L);
        }
        if (i6 == 8) {
            return h(this.f17241c, this.f17242d, c1111e, qVar, list);
        }
        if (i6 == 11) {
            return i(this.f17240b, this.f17243e, qVar, list, c1111e, this.f17241c, this.f17242d);
        }
        if (i6 != 13) {
            return null;
        }
        return new w(qVar.f6980d, c1111e, this.f17241c, this.f17242d);
    }

    @Override // m1.h
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public C1797d b(boolean z6) {
        this.f17242d = z6;
        return this;
    }

    @Override // m1.h
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public C1797d a(s.a aVar) {
        this.f17241c = aVar;
        return this;
    }

    public C1797d(int i6, boolean z6) {
        this.f17240b = i6;
        this.f17243e = z6;
        this.f17241c = new C1084h();
    }
}
