package k1;

import Z0.F;
import android.net.Uri;
import c1.AbstractC1117K;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import r1.InterfaceC2021a;

/* renamed from: k1.c, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C1659c implements InterfaceC2021a {

    /* renamed from: a, reason: collision with root package name */
    public final long f16316a;

    /* renamed from: b, reason: collision with root package name */
    public final long f16317b;

    /* renamed from: c, reason: collision with root package name */
    public final long f16318c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f16319d;

    /* renamed from: e, reason: collision with root package name */
    public final long f16320e;

    /* renamed from: f, reason: collision with root package name */
    public final long f16321f;

    /* renamed from: g, reason: collision with root package name */
    public final long f16322g;

    /* renamed from: h, reason: collision with root package name */
    public final long f16323h;

    /* renamed from: i, reason: collision with root package name */
    public final o f16324i;

    /* renamed from: j, reason: collision with root package name */
    public final l f16325j;

    /* renamed from: k, reason: collision with root package name */
    public final Uri f16326k;

    /* renamed from: l, reason: collision with root package name */
    public final h f16327l;

    /* renamed from: m, reason: collision with root package name */
    public final List f16328m;

    public C1659c(long j6, long j7, long j8, boolean z6, long j9, long j10, long j11, long j12, h hVar, o oVar, l lVar, Uri uri, List list) {
        this.f16316a = j6;
        this.f16317b = j7;
        this.f16318c = j8;
        this.f16319d = z6;
        this.f16320e = j9;
        this.f16321f = j10;
        this.f16322g = j11;
        this.f16323h = j12;
        this.f16327l = hVar;
        this.f16324i = oVar;
        this.f16326k = uri;
        this.f16325j = lVar;
        this.f16328m = list == null ? Collections.EMPTY_LIST : list;
    }

    public static ArrayList c(List list, LinkedList linkedList) {
        F f6 = (F) linkedList.poll();
        int i6 = f6.f6649a;
        ArrayList arrayList = new ArrayList();
        do {
            int i7 = f6.f6650b;
            C1657a c1657a = (C1657a) list.get(i7);
            List list2 = c1657a.f16308c;
            ArrayList arrayList2 = new ArrayList();
            do {
                arrayList2.add((j) list2.get(f6.f6651c));
                f6 = (F) linkedList.poll();
                if (f6.f6649a != i6) {
                    break;
                }
            } while (f6.f6650b == i7);
            arrayList.add(new C1657a(c1657a.f16306a, c1657a.f16307b, arrayList2, c1657a.f16309d, c1657a.f16310e, c1657a.f16311f));
        } while (f6.f6649a == i6);
        linkedList.addFirst(f6);
        return arrayList;
    }

    @Override // r1.InterfaceC2021a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C1659c a(List list) {
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new F(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j6 = 0;
        int i6 = 0;
        while (true) {
            if (i6 >= e()) {
                break;
            }
            if (((F) linkedList.peek()).f6649a != i6) {
                long f6 = f(i6);
                if (f6 != -9223372036854775807L) {
                    j6 += f6;
                }
            } else {
                g d6 = d(i6);
                arrayList.add(new g(d6.f16351a, d6.f16352b - j6, c(d6.f16353c, linkedList), d6.f16354d));
            }
            i6++;
        }
        long j7 = this.f16317b;
        return new C1659c(this.f16316a, j7 != -9223372036854775807L ? j7 - j6 : -9223372036854775807L, this.f16318c, this.f16319d, this.f16320e, this.f16321f, this.f16322g, this.f16323h, this.f16327l, this.f16324i, this.f16325j, this.f16326k, arrayList);
    }

    public final g d(int i6) {
        return (g) this.f16328m.get(i6);
    }

    public final int e() {
        return this.f16328m.size();
    }

    public final long f(int i6) {
        long j6;
        long j7;
        if (i6 == this.f16328m.size() - 1) {
            j6 = this.f16317b;
            if (j6 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j7 = ((g) this.f16328m.get(i6)).f16352b;
        } else {
            j6 = ((g) this.f16328m.get(i6 + 1)).f16352b;
            j7 = ((g) this.f16328m.get(i6)).f16352b;
        }
        return j6 - j7;
    }

    public final long g(int i6) {
        return AbstractC1117K.J0(f(i6));
    }
}
