package y;

import I.AbstractC0416a;
import I.O0;
import I.Q0;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.IntCompanionObject;
import z.C2362A;
import z.C2375g;

/* renamed from: y.e1, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C2298e1 {

    /* renamed from: g, reason: collision with root package name */
    public final String f20972g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC2299f f20973h;

    /* renamed from: i, reason: collision with root package name */
    public final C2362A f20974i;

    /* renamed from: j, reason: collision with root package name */
    public final C.f f20975j;

    /* renamed from: k, reason: collision with root package name */
    public final int f20976k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f20977l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f20978m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f20979n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f20980o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f20981p;

    /* renamed from: q, reason: collision with root package name */
    public I.R0 f20982q;

    /* renamed from: s, reason: collision with root package name */
    public final D0 f20984s;

    /* renamed from: v, reason: collision with root package name */
    public final E0 f20987v;

    /* renamed from: a, reason: collision with root package name */
    public final List f20966a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final List f20967b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final List f20968c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final Map f20969d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final List f20970e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final List f20971f = new ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public List f20983r = new ArrayList();

    /* renamed from: t, reason: collision with root package name */
    public final C.s f20985t = new C.s();

    /* renamed from: u, reason: collision with root package name */
    public final C.p f20986u = new C.p();

    /* renamed from: y.e1$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {
        public static Size[] a(StreamConfigurationMap streamConfigurationMap, int i6) {
            return streamConfigurationMap.getHighResolutionOutputSizes(i6);
        }
    }

    /* renamed from: y.e1$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class b {
        public static b c(int i6, int i7) {
            return new C2296e(i6, i7);
        }

        public abstract int a();

        public abstract int b();
    }

    public C2298e1(Context context, String str, z.N n6, InterfaceC2299f interfaceC2299f) {
        this.f20977l = false;
        this.f20978m = false;
        this.f20979n = false;
        this.f20980o = false;
        this.f20981p = false;
        String str2 = (String) y0.g.f(str);
        this.f20972g = str2;
        this.f20973h = (InterfaceC2299f) y0.g.f(interfaceC2299f);
        this.f20975j = new C.f();
        this.f20984s = D0.c(context);
        try {
            C2362A c6 = n6.c(str2);
            this.f20974i = c6;
            Integer num = (Integer) c6.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            this.f20976k = num != null ? num.intValue() : 2;
            int[] iArr = (int[]) c6.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i6 : iArr) {
                    if (i6 == 3) {
                        this.f20977l = true;
                    } else if (i6 == 6) {
                        this.f20978m = true;
                    } else if (Build.VERSION.SDK_INT >= 31 && i6 == 16) {
                        this.f20981p = true;
                    }
                }
            }
            E0 e02 = new E0(this.f20974i);
            this.f20987v = e02;
            j();
            if (this.f20981p) {
                l();
            }
            boolean hasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent");
            this.f20979n = hasSystemFeature;
            if (hasSystemFeature) {
                h();
            }
            if (e02.d()) {
                g();
            }
            boolean h6 = AbstractC2292c1.h(this.f20974i);
            this.f20980o = h6;
            if (h6) {
                i();
            }
            k();
            b();
        } catch (C2375g e6) {
            throw AbstractC2326r0.a(e6);
        }
    }

    public static Range d(Range range, Range range2, Range range3) {
        double t6 = t(range2.intersect(range));
        double t7 = t(range3.intersect(range));
        double t8 = t7 / t(range3);
        double t9 = t6 / t(range2);
        return (t7 <= t6 ? t7 != t6 ? t9 >= 0.5d || t8 <= t9 : t8 <= t9 && (t8 != t9 || ((Integer) range3.getLower()).intValue() <= ((Integer) range2.getLower()).intValue()) : t8 < 0.5d && t8 < t9) ? range2 : range3;
    }

    public static int o(C2362A c2362a, int i6, Size size) {
        try {
            return (int) (1.0E9d / ((StreamConfigurationMap) c2362a.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputMinFrameDuration(i6, size));
        } catch (Exception unused) {
            return 0;
        }
    }

    public static int s(Range range, Range range2) {
        y0.g.i((range.contains((Range) range2.getUpper()) || range.contains((Range) range2.getLower())) ? false : true, "Ranges must not intersect");
        return ((Integer) range.getLower()).intValue() > ((Integer) range2.getUpper()).intValue() ? ((Integer) range.getLower()).intValue() - ((Integer) range2.getUpper()).intValue() : ((Integer) range2.getLower()).intValue() - ((Integer) range.getUpper()).intValue();
    }

    public static int t(Range range) {
        return (((Integer) range.getUpper()).intValue() - ((Integer) range.getLower()).intValue()) + 1;
    }

    public static int x(Map map) {
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            if (((F.C) it.next()).a() == 10) {
                return 10;
            }
        }
        return 8;
    }

    public final Pair A(int i6, List list, List list2, List list3, List list4, int i7, Map map, Map map2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC0416a abstractC0416a = (AbstractC0416a) it.next();
            arrayList.add(abstractC0416a.g());
            if (map != null) {
                map.put(Integer.valueOf(arrayList.size() - 1), abstractC0416a);
            }
        }
        for (int i8 = 0; i8 < list2.size(); i8++) {
            Size size = (Size) list2.get(i8);
            I.Y0 y02 = (I.Y0) list3.get(((Integer) list4.get(i8)).intValue());
            int q6 = y02.q();
            arrayList.add(I.Q0.h(i6, q6, size, D(q6)));
            if (map2 != null) {
                map2.put(Integer.valueOf(arrayList.size() - 1), y02);
            }
            i7 = C(i7, y02.q(), size);
        }
        return new Pair(arrayList, Integer.valueOf(i7));
    }

    public final Range B(List list, List list2, List list3) {
        Iterator it = list.iterator();
        Range range = null;
        while (it.hasNext()) {
            range = E(((AbstractC0416a) it.next()).h(), range);
        }
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            range = E(((I.Y0) list2.get(((Integer) it2.next()).intValue())).J(null), range);
        }
        return range;
    }

    public final int C(int i6, int i7, Size size) {
        return Math.min(i6, o(this.f20974i, i7, size));
    }

    public I.R0 D(int i6) {
        if (!this.f20983r.contains(Integer.valueOf(i6))) {
            K(this.f20982q.j(), S.d.f4641e, i6);
            K(this.f20982q.h(), S.d.f4643g, i6);
            J(this.f20982q.d(), i6);
            L(this.f20982q.l(), i6);
            this.f20983r.add(Integer.valueOf(i6));
        }
        return this.f20982q;
    }

    public final Range E(Range range, Range range2) {
        if (range2 == null) {
            return range;
        }
        if (range != null) {
            try {
                return range2.intersect(range);
            } catch (IllegalArgumentException unused) {
            }
        }
        return range2;
    }

    public final List F(List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int M5 = ((I.Y0) it.next()).M(0);
            if (!arrayList2.contains(Integer.valueOf(M5))) {
                arrayList2.add(Integer.valueOf(M5));
            }
        }
        Collections.sort(arrayList2);
        Collections.reverse(arrayList2);
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            int intValue = ((Integer) it2.next()).intValue();
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                I.Y0 y02 = (I.Y0) it3.next();
                if (intValue == y02.M(0)) {
                    arrayList.add(Integer.valueOf(list.indexOf(y02)));
                }
            }
        }
        return arrayList;
    }

    public final boolean G(b bVar, List list, Map map) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC0416a) it.next()).g());
        }
        L.e eVar = new L.e();
        for (I.Y0 y02 : map.keySet()) {
            List list2 = (List) map.get(y02);
            y0.g.b((list2 == null || list2.isEmpty()) ? false : true, "No available output size is found for " + y02 + ".");
            Size size = (Size) Collections.min(list2, eVar);
            int q6 = y02.q();
            arrayList.add(I.Q0.h(bVar.a(), q6, size, D(q6)));
        }
        return c(bVar, arrayList);
    }

    public final void H() {
        this.f20984s.g();
        if (this.f20982q == null) {
            k();
        } else {
            this.f20982q = I.R0.a(this.f20982q.b(), this.f20982q.j(), this.f20984s.f(), this.f20982q.h(), this.f20982q.f(), this.f20982q.d(), this.f20982q.l());
        }
    }

    public I.Q0 I(int i6, int i7, Size size) {
        return I.Q0.h(i6, i7, size, D(i7));
    }

    public final void J(Map map, int i6) {
        Size p6 = p(this.f20974i.b().c(), i6, true);
        if (p6 != null) {
            map.put(Integer.valueOf(i6), p6);
        }
    }

    public final void K(Map map, Size size, int i6) {
        if (this.f20979n) {
            Size p6 = p(this.f20974i.b().c(), i6, false);
            Integer valueOf = Integer.valueOf(i6);
            if (p6 != null) {
                size = (Size) Collections.min(Arrays.asList(size, p6), new L.e());
            }
            map.put(valueOf, size);
        }
    }

    public final void L(Map map, int i6) {
        CameraCharacteristics.Key key;
        if (Build.VERSION.SDK_INT < 31 || !this.f20981p) {
            return;
        }
        C2362A c2362a = this.f20974i;
        key = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION;
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) c2362a.a(key);
        if (streamConfigurationMap == null) {
            return;
        }
        map.put(Integer.valueOf(i6), p(streamConfigurationMap, i6, true));
    }

    public List a(List list, int i6) {
        Rational rational;
        int a6 = this.f20985t.a(this.f20972g, this.f20974i);
        if (a6 == 0) {
            rational = L.a.f3013a;
        } else if (a6 == 1) {
            rational = L.a.f3015c;
        } else if (a6 != 2) {
            rational = null;
        } else {
            Size c6 = D(256).c(256);
            rational = new Rational(c6.getWidth(), c6.getHeight());
        }
        if (rational != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Size size = (Size) it.next();
                if (L.a.a(size, rational)) {
                    arrayList.add(size);
                } else {
                    arrayList2.add(size);
                }
            }
            arrayList2.addAll(0, arrayList);
            list = arrayList2;
        }
        return this.f20986u.a(I.Q0.e(i6), list);
    }

    public final void b() {
    }

    public boolean c(b bVar, List list) {
        Iterator it = z(bVar).iterator();
        boolean z6 = false;
        while (it.hasNext()) {
            z6 = ((I.P0) it.next()).d(list) != null;
            if (z6) {
                break;
            }
        }
        return z6;
    }

    public final b e(int i6, Map map) {
        int x6 = x(map);
        if (i6 == 0 || x6 != 10) {
            return b.c(i6, x6);
        }
        throw new IllegalArgumentException(String.format("Camera device id is %s. 10 bit dynamic range is not currently supported in %s camera mode.", this.f20972g, I.F.a(i6)));
    }

    public final Map f(Map map, b bVar, Range range) {
        HashMap hashMap = new HashMap();
        for (I.Y0 y02 : map.keySet()) {
            ArrayList arrayList = new ArrayList();
            HashMap hashMap2 = new HashMap();
            for (Size size : (List) map.get(y02)) {
                int q6 = y02.q();
                Q0.a c6 = I.Q0.h(bVar.a(), q6, size, D(q6)).c();
                int o6 = range != null ? o(this.f20974i, q6, size) : IntCompanionObject.MAX_VALUE;
                Set set = (Set) hashMap2.get(c6);
                if (set == null) {
                    set = new HashSet();
                    hashMap2.put(c6, set);
                }
                if (!set.contains(Integer.valueOf(o6))) {
                    arrayList.add(size);
                    set.add(Integer.valueOf(o6));
                }
            }
            hashMap.put(y02, arrayList);
        }
        return hashMap;
    }

    public final void g() {
        this.f20970e.addAll(V0.b());
    }

    public final void h() {
        this.f20968c.addAll(V0.d());
    }

    public final void i() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.f20971f.addAll(V0.j());
        }
    }

    public final void j() {
        this.f20966a.addAll(V0.a(this.f20976k, this.f20977l, this.f20978m));
        this.f20966a.addAll(this.f20975j.a(this.f20972g, this.f20976k));
    }

    public final void k() {
        this.f20982q = I.R0.a(S.d.f4639c, new HashMap(), this.f20984s.f(), new HashMap(), u(), new HashMap(), new HashMap());
    }

    public final void l() {
        this.f20967b.addAll(V0.k());
    }

    public final List m(List list) {
        Iterator it = list.iterator();
        int i6 = 1;
        while (it.hasNext()) {
            i6 *= ((List) it.next()).size();
        }
        if (i6 == 0) {
            throw new IllegalArgumentException("Failed to find supported resolutions.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < i6; i7++) {
            arrayList.add(new ArrayList());
        }
        int size = i6 / ((List) list.get(0)).size();
        int i8 = i6;
        for (int i9 = 0; i9 < list.size(); i9++) {
            List list2 = (List) list.get(i9);
            for (int i10 = 0; i10 < i6; i10++) {
                ((List) arrayList.get(i10)).add((Size) list2.get((i10 % i8) / size));
            }
            if (i9 < list.size() - 1) {
                i8 = size;
                size /= ((List) list.get(i9 + 1)).size();
            }
        }
        return arrayList;
    }

    public final Range n(Range range, int i6) {
        if (range != null) {
            Range range2 = I.O0.f2327a;
            if (!range.equals(range2)) {
                Range[] rangeArr = (Range[]) this.f20974i.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
                if (rangeArr == null) {
                    return range2;
                }
                Range range3 = new Range(Integer.valueOf(Math.min(((Integer) range.getLower()).intValue(), i6)), Integer.valueOf(Math.min(((Integer) range.getUpper()).intValue(), i6)));
                int i7 = 0;
                for (Range range4 : rangeArr) {
                    if (i6 >= ((Integer) range4.getLower()).intValue()) {
                        if (range2.equals(I.O0.f2327a)) {
                            range2 = range4;
                        }
                        if (range4.equals(range3)) {
                            return range4;
                        }
                        try {
                            int t6 = t(range4.intersect(range3));
                            if (i7 == 0) {
                                i7 = t6;
                            } else {
                                if (t6 >= i7) {
                                    range2 = d(range3, range2, range4);
                                    i7 = t(range3.intersect(range2));
                                }
                                range4 = range2;
                            }
                        } catch (IllegalArgumentException unused) {
                            if (i7 == 0) {
                                if (s(range4, range3) >= s(range2, range3)) {
                                    if (s(range4, range3) == s(range2, range3)) {
                                        if (((Integer) range4.getLower()).intValue() <= ((Integer) range2.getUpper()).intValue() && t(range4) >= t(range2)) {
                                        }
                                    }
                                }
                            }
                        }
                        range2 = range4;
                    }
                }
                return range2;
            }
        }
        return I.O0.f2327a;
    }

    public final Size p(StreamConfigurationMap streamConfigurationMap, int i6, boolean z6) {
        Size[] a6;
        Size[] outputSizes = i6 == 34 ? streamConfigurationMap.getOutputSizes(SurfaceTexture.class) : streamConfigurationMap.getOutputSizes(i6);
        if (outputSizes == null || outputSizes.length == 0) {
            return null;
        }
        L.e eVar = new L.e();
        Size size = (Size) Collections.max(Arrays.asList(outputSizes), eVar);
        Size size2 = S.d.f4637a;
        if (z6 && (a6 = a.a(streamConfigurationMap, i6)) != null && a6.length > 0) {
            size2 = (Size) Collections.max(Arrays.asList(a6), eVar);
        }
        return (Size) Collections.max(Arrays.asList(size, size2), eVar);
    }

    public final int q(List list) {
        Iterator it = list.iterator();
        int i6 = IntCompanionObject.MAX_VALUE;
        while (it.hasNext()) {
            AbstractC0416a abstractC0416a = (AbstractC0416a) it.next();
            i6 = C(i6, abstractC0416a.d(), abstractC0416a.f());
        }
        return i6;
    }

    public List r(b bVar, List list) {
        if (!AbstractC2292c1.n(bVar)) {
            return null;
        }
        Iterator it = this.f20971f.iterator();
        while (it.hasNext()) {
            List d6 = ((I.P0) it.next()).d(list);
            if (d6 != null) {
                return d6;
            }
        }
        return null;
    }

    public final Size u() {
        try {
            int parseInt = Integer.parseInt(this.f20972g);
            CamcorderProfile a6 = this.f20973h.b(parseInt, 1) ? this.f20973h.a(parseInt, 1) : null;
            return a6 != null ? new Size(a6.videoFrameWidth, a6.videoFrameHeight) : v(parseInt);
        } catch (NumberFormatException unused) {
            return w();
        }
    }

    public final Size v(int i6) {
        Size size = S.d.f4640d;
        CamcorderProfile a6 = this.f20973h.b(i6, 10) ? this.f20973h.a(i6, 10) : this.f20973h.b(i6, 8) ? this.f20973h.a(i6, 8) : this.f20973h.b(i6, 12) ? this.f20973h.a(i6, 12) : this.f20973h.b(i6, 6) ? this.f20973h.a(i6, 6) : this.f20973h.b(i6, 5) ? this.f20973h.a(i6, 5) : this.f20973h.b(i6, 4) ? this.f20973h.a(i6, 4) : null;
        return a6 != null ? new Size(a6.videoFrameWidth, a6.videoFrameHeight) : size;
    }

    public final Size w() {
        Size[] outputSizes = this.f20974i.b().c().getOutputSizes(MediaRecorder.class);
        if (outputSizes == null) {
            return S.d.f4640d;
        }
        Arrays.sort(outputSizes, new L.e(true));
        for (Size size : outputSizes) {
            int width = size.getWidth();
            Size size2 = S.d.f4642f;
            if (width <= size2.getWidth() && size.getHeight() <= size2.getHeight()) {
                return size;
            }
        }
        return S.d.f4640d;
    }

    public Pair y(int i6, List list, Map map) {
        int i7;
        Map map2;
        Map map3;
        HashMap hashMap;
        List list2;
        Map map4;
        List list3;
        String str;
        String str2;
        int i8;
        Map map5;
        List list4;
        List list5;
        HashMap hashMap2;
        boolean z6;
        H();
        List<I.Y0> arrayList = new ArrayList(map.keySet());
        List F6 = F(arrayList);
        Map g6 = this.f20987v.g(list, arrayList, F6);
        int i9 = i6;
        b e6 = e(i9, g6);
        boolean G6 = G(e6, list, map);
        String str3 = " New configs: ";
        String str4 = "No supported surface combination is found for camera device - Id : ";
        if (!G6) {
            throw new IllegalArgumentException("No supported surface combination is found for camera device - Id : " + this.f20972g + ".  May be attempting to bind too many use cases. Existing surfaces: " + list + " New configs: " + arrayList);
        }
        Range B6 = B(list, arrayList, F6);
        Map f6 = f(map, e6, B6);
        List arrayList2 = new ArrayList();
        Iterator it = F6.iterator();
        while (it.hasNext()) {
            I.Y0 y02 = (I.Y0) arrayList.get(((Integer) it.next()).intValue());
            arrayList2.add(a((List) f6.get(y02), y02.q()));
            f6 = f6;
        }
        List m6 = m(arrayList2);
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        Map hashMap5 = new HashMap();
        Map hashMap6 = new HashMap();
        boolean d6 = AbstractC2292c1.d(list, arrayList);
        HashMap hashMap7 = hashMap4;
        int q6 = q(list);
        if (!this.f20980o || d6) {
            i7 = q6;
            map2 = hashMap5;
            map3 = hashMap6;
            hashMap = hashMap7;
            list2 = null;
        } else {
            Iterator it2 = m6.iterator();
            List list6 = null;
            while (true) {
                if (!it2.hasNext()) {
                    Map map6 = hashMap6;
                    i7 = q6;
                    map2 = hashMap5;
                    map3 = map6;
                    z6 = G6;
                    hashMap = hashMap7;
                    break;
                }
                z6 = G6;
                hashMap = hashMap7;
                Pair A6 = A(i9, list, (List) it2.next(), arrayList, F6, q6, hashMap5, hashMap6);
                Map map7 = hashMap6;
                i7 = q6;
                map2 = hashMap5;
                map3 = map7;
                list6 = r(e6, (List) A6.first);
                if (list6 != null && !AbstractC2292c1.a(map2, map3, list6)) {
                    list6 = null;
                }
                if (list6 != null) {
                    if (AbstractC2292c1.c(this.f20974i, list6)) {
                        break;
                    }
                    list6 = null;
                }
                map2.clear();
                map3.clear();
                hashMap5 = map2;
                q6 = i7;
                hashMap6 = map3;
                i9 = i6;
                hashMap7 = hashMap;
                G6 = z6;
            }
            if (list6 == null && !z6) {
                throw new IllegalArgumentException("No supported surface combination is found for camera device - Id : " + this.f20972g + ".  May be attempting to bind too many use cases. Existing surfaces: " + list + " New configs: " + arrayList);
            }
            list2 = list6;
        }
        Iterator it3 = m6.iterator();
        int i10 = IntCompanionObject.MAX_VALUE;
        int i11 = Integer.MAX_VALUE;
        int i12 = Integer.MAX_VALUE;
        boolean z7 = false;
        boolean z8 = false;
        List list7 = null;
        List list8 = null;
        while (true) {
            if (!it3.hasNext()) {
                map4 = map3;
                list3 = list2;
                str = str3;
                str2 = str4;
                i8 = i12;
                map5 = map2;
                list4 = list7;
                break;
            }
            List list9 = (List) it3.next();
            Map map8 = map2;
            int i13 = i7;
            str = str3;
            map4 = map3;
            int i14 = i11;
            list3 = list2;
            int i15 = i10;
            str2 = str4;
            map5 = map8;
            Pair A7 = A(i6, list, list9, arrayList, F6, i13, null, null);
            List list10 = (List) A7.first;
            int intValue = ((Integer) A7.second).intValue();
            boolean z9 = B6 == null || i13 <= intValue || intValue >= ((Integer) B6.getLower()).intValue();
            if (!z7 && c(e6, list10)) {
                if (i14 == i15 || i14 < intValue) {
                    list7 = list9;
                    i14 = intValue;
                }
                if (z9) {
                    if (z8) {
                        list4 = list9;
                        i11 = intValue;
                        i8 = i12;
                        break;
                    }
                    list7 = list9;
                    i14 = intValue;
                    z7 = true;
                }
            }
            if (list3 == null || z8 || r(e6, list10) == null) {
                i12 = i12;
            } else {
                int i16 = i12;
                if (i16 != i15 && i16 >= intValue) {
                    i12 = i16;
                } else {
                    list8 = list9;
                    i12 = intValue;
                }
                if (!z9) {
                    continue;
                } else {
                    if (z7) {
                        i8 = intValue;
                        list4 = list7;
                        list5 = list9;
                        i11 = i14;
                        break;
                    }
                    list8 = list9;
                    i12 = intValue;
                    z8 = true;
                }
            }
            i7 = i13;
            i10 = i15;
            i11 = i14;
            map2 = map5;
            str4 = str2;
            list2 = list3;
            str3 = str;
            map3 = map4;
        }
        list5 = list8;
        if (list4 == null) {
            throw new IllegalArgumentException(str2 + this.f20972g + " and Hardware level: " + this.f20976k + ". May be the specified resolution is too large and not supported. Existing surfaces: " + list + str + arrayList);
        }
        Range n6 = B6 != null ? n(B6, i11) : null;
        for (I.Y0 y03 : arrayList) {
            O0.a d7 = I.O0.a((Size) list4.get(F6.indexOf(Integer.valueOf(arrayList.indexOf(y03))))).b((F.C) y0.g.f((F.C) g6.get(y03))).d(AbstractC2292c1.e(y03));
            if (n6 != null) {
                d7.c(n6);
            }
            hashMap.put(y03, d7.a());
        }
        if (list3 != null && i11 == i8 && list4.size() == list5.size()) {
            for (int i17 = 0; i17 < list4.size(); i17++) {
                if (((Size) list4.get(i17)).equals(list5.get(i17))) {
                }
            }
            hashMap2 = hashMap3;
            if (!AbstractC2292c1.k(this.f20974i, list, hashMap, hashMap2)) {
                AbstractC2292c1.l(hashMap, hashMap2, map5, map4, list3);
            }
            return new Pair(hashMap, hashMap2);
        }
        hashMap2 = hashMap3;
        return new Pair(hashMap, hashMap2);
    }

    public final List z(b bVar) {
        if (this.f20969d.containsKey(bVar)) {
            return (List) this.f20969d.get(bVar);
        }
        List arrayList = new ArrayList();
        if (bVar.b() == 8) {
            int a6 = bVar.a();
            if (a6 == 1) {
                arrayList = this.f20968c;
            } else if (a6 != 2) {
                arrayList.addAll(this.f20966a);
            } else {
                arrayList.addAll(this.f20967b);
                arrayList.addAll(this.f20966a);
            }
        } else if (bVar.b() == 10 && bVar.a() == 0) {
            arrayList.addAll(this.f20970e);
        }
        this.f20969d.put(bVar, arrayList);
        return arrayList;
    }
}
