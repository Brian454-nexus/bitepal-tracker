package v1;

import Y1.t;
import Z0.F;
import Z0.q;
import android.net.Uri;
import c1.AbstractC1113G;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import r1.InterfaceC2021a;

/* renamed from: v1.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C2161a implements InterfaceC2021a {

    /* renamed from: a, reason: collision with root package name */
    public final int f19296a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19297b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19298c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f19299d;

    /* renamed from: e, reason: collision with root package name */
    public final C0255a f19300e;

    /* renamed from: f, reason: collision with root package name */
    public final b[] f19301f;

    /* renamed from: g, reason: collision with root package name */
    public final long f19302g;

    /* renamed from: h, reason: collision with root package name */
    public final long f19303h;

    /* renamed from: v1.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class C0255a {

        /* renamed from: a, reason: collision with root package name */
        public final UUID f19304a;

        /* renamed from: b, reason: collision with root package name */
        public final byte[] f19305b;

        /* renamed from: c, reason: collision with root package name */
        public final t[] f19306c;

        public C0255a(UUID uuid, byte[] bArr, t[] tVarArr) {
            this.f19304a = uuid;
            this.f19305b = bArr;
            this.f19306c = tVarArr;
        }
    }

    public C2161a(int i6, int i7, long j6, long j7, long j8, int i8, boolean z6, C0255a c0255a, b[] bVarArr) {
        this(i6, i7, j7 == 0 ? -9223372036854775807L : AbstractC1117K.W0(j7, 1000000L, j6), j8 != 0 ? AbstractC1117K.W0(j8, 1000000L, j6) : -9223372036854775807L, i8, z6, c0255a, bVarArr);
    }

    @Override // r1.InterfaceC2021a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C2161a a(List list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        b bVar = null;
        int i6 = 0;
        while (i6 < arrayList.size()) {
            F f6 = (F) arrayList.get(i6);
            b bVar2 = this.f19301f[f6.f6650b];
            if (bVar2 != bVar && bVar != null) {
                arrayList2.add(bVar.b((q[]) arrayList3.toArray(new q[0])));
                arrayList3.clear();
            }
            arrayList3.add(bVar2.f19316j[f6.f6651c]);
            i6++;
            bVar = bVar2;
        }
        if (bVar != null) {
            arrayList2.add(bVar.b((q[]) arrayList3.toArray(new q[0])));
        }
        return new C2161a(this.f19296a, this.f19297b, this.f19302g, this.f19303h, this.f19298c, this.f19299d, this.f19300e, (b[]) arrayList2.toArray(new b[0]));
    }

    /* renamed from: v1.a$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f19307a;

        /* renamed from: b, reason: collision with root package name */
        public final String f19308b;

        /* renamed from: c, reason: collision with root package name */
        public final long f19309c;

        /* renamed from: d, reason: collision with root package name */
        public final String f19310d;

        /* renamed from: e, reason: collision with root package name */
        public final int f19311e;

        /* renamed from: f, reason: collision with root package name */
        public final int f19312f;

        /* renamed from: g, reason: collision with root package name */
        public final int f19313g;

        /* renamed from: h, reason: collision with root package name */
        public final int f19314h;

        /* renamed from: i, reason: collision with root package name */
        public final String f19315i;

        /* renamed from: j, reason: collision with root package name */
        public final q[] f19316j;

        /* renamed from: k, reason: collision with root package name */
        public final int f19317k;

        /* renamed from: l, reason: collision with root package name */
        public final String f19318l;

        /* renamed from: m, reason: collision with root package name */
        public final String f19319m;

        /* renamed from: n, reason: collision with root package name */
        public final List f19320n;

        /* renamed from: o, reason: collision with root package name */
        public final long[] f19321o;

        /* renamed from: p, reason: collision with root package name */
        public final long f19322p;

        public b(String str, String str2, int i6, String str3, long j6, String str4, int i7, int i8, int i9, int i10, String str5, q[] qVarArr, List list, long j7) {
            this(str, str2, i6, str3, j6, str4, i7, i8, i9, i10, str5, qVarArr, list, AbstractC1117K.X0(list, 1000000L, j6), AbstractC1117K.W0(j7, 1000000L, j6));
        }

        public Uri a(int i6, int i7) {
            AbstractC1119a.g(this.f19316j != null);
            AbstractC1119a.g(this.f19320n != null);
            AbstractC1119a.g(i7 < this.f19320n.size());
            String num = Integer.toString(this.f19316j[i6].f6985i);
            String l6 = ((Long) this.f19320n.get(i7)).toString();
            return AbstractC1113G.f(this.f19318l, this.f19319m.replace("{bitrate}", num).replace("{Bitrate}", num).replace("{start time}", l6).replace("{start_time}", l6));
        }

        public b b(q[] qVarArr) {
            return new b(this.f19318l, this.f19319m, this.f19307a, this.f19308b, this.f19309c, this.f19310d, this.f19311e, this.f19312f, this.f19313g, this.f19314h, this.f19315i, qVarArr, this.f19320n, this.f19321o, this.f19322p);
        }

        public long c(int i6) {
            if (i6 == this.f19317k - 1) {
                return this.f19322p;
            }
            long[] jArr = this.f19321o;
            return jArr[i6 + 1] - jArr[i6];
        }

        public int d(long j6) {
            return AbstractC1117K.h(this.f19321o, j6, true, true);
        }

        public long e(int i6) {
            return this.f19321o[i6];
        }

        public b(String str, String str2, int i6, String str3, long j6, String str4, int i7, int i8, int i9, int i10, String str5, q[] qVarArr, List list, long[] jArr, long j7) {
            this.f19318l = str;
            this.f19319m = str2;
            this.f19307a = i6;
            this.f19308b = str3;
            this.f19309c = j6;
            this.f19310d = str4;
            this.f19311e = i7;
            this.f19312f = i8;
            this.f19313g = i9;
            this.f19314h = i10;
            this.f19315i = str5;
            this.f19316j = qVarArr;
            this.f19320n = list;
            this.f19321o = jArr;
            this.f19322p = j7;
            this.f19317k = list.size();
        }
    }

    public C2161a(int i6, int i7, long j6, long j7, int i8, boolean z6, C0255a c0255a, b[] bVarArr) {
        this.f19296a = i6;
        this.f19297b = i7;
        this.f19302g = j6;
        this.f19303h = j7;
        this.f19298c = i8;
        this.f19299d = z6;
        this.f19300e = c0255a;
        this.f19301f = bVarArr;
    }
}
