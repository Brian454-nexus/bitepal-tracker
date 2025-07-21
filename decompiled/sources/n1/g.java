package n1;

import Z0.F;
import Z0.q;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class g extends h {

    /* renamed from: n, reason: collision with root package name */
    public static final g f17537n;

    /* renamed from: d, reason: collision with root package name */
    public final List f17538d;

    /* renamed from: e, reason: collision with root package name */
    public final List f17539e;

    /* renamed from: f, reason: collision with root package name */
    public final List f17540f;

    /* renamed from: g, reason: collision with root package name */
    public final List f17541g;

    /* renamed from: h, reason: collision with root package name */
    public final List f17542h;

    /* renamed from: i, reason: collision with root package name */
    public final List f17543i;

    /* renamed from: j, reason: collision with root package name */
    public final q f17544j;

    /* renamed from: k, reason: collision with root package name */
    public final List f17545k;

    /* renamed from: l, reason: collision with root package name */
    public final Map f17546l;

    /* renamed from: m, reason: collision with root package name */
    public final List f17547m;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f17548a;

        /* renamed from: b, reason: collision with root package name */
        public final q f17549b;

        /* renamed from: c, reason: collision with root package name */
        public final String f17550c;

        /* renamed from: d, reason: collision with root package name */
        public final String f17551d;

        public a(Uri uri, q qVar, String str, String str2) {
            this.f17548a = uri;
            this.f17549b = qVar;
            this.f17550c = str;
            this.f17551d = str2;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f17552a;

        /* renamed from: b, reason: collision with root package name */
        public final q f17553b;

        /* renamed from: c, reason: collision with root package name */
        public final String f17554c;

        /* renamed from: d, reason: collision with root package name */
        public final String f17555d;

        /* renamed from: e, reason: collision with root package name */
        public final String f17556e;

        /* renamed from: f, reason: collision with root package name */
        public final String f17557f;

        public b(Uri uri, q qVar, String str, String str2, String str3, String str4) {
            this.f17552a = uri;
            this.f17553b = qVar;
            this.f17554c = str;
            this.f17555d = str2;
            this.f17556e = str3;
            this.f17557f = str4;
        }

        public static b b(Uri uri) {
            return new b(uri, new q.b().a0("0").Q("application/x-mpegURL").K(), null, null, null, null);
        }

        public b a(q qVar) {
            return new b(this.f17552a, qVar, this.f17554c, this.f17555d, this.f17556e, this.f17557f);
        }
    }

    static {
        List list = Collections.EMPTY_LIST;
        f17537n = new g("", list, list, list, list, list, list, null, list, false, Collections.EMPTY_MAP, list);
    }

    public g(String str, List list, List list2, List list3, List list4, List list5, List list6, q qVar, List list7, boolean z6, Map map, List list8) {
        super(str, list, z6);
        this.f17538d = Collections.unmodifiableList(f(list2, list3, list4, list5, list6));
        this.f17539e = Collections.unmodifiableList(list2);
        this.f17540f = Collections.unmodifiableList(list3);
        this.f17541g = Collections.unmodifiableList(list4);
        this.f17542h = Collections.unmodifiableList(list5);
        this.f17543i = Collections.unmodifiableList(list6);
        this.f17544j = qVar;
        this.f17545k = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.f17546l = Collections.unmodifiableMap(map);
        this.f17547m = Collections.unmodifiableList(list8);
    }

    public static void b(List list, List list2) {
        for (int i6 = 0; i6 < list.size(); i6++) {
            Uri uri = ((a) list.get(i6)).f17548a;
            if (uri != null && !list2.contains(uri)) {
                list2.add(uri);
            }
        }
    }

    public static List d(List list, int i6, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i7 = 0; i7 < list.size(); i7++) {
            Object obj = list.get(i7);
            int i8 = 0;
            while (true) {
                if (i8 < list2.size()) {
                    F f6 = (F) list2.get(i8);
                    if (f6.f6650b == i6 && f6.f6651c == i7) {
                        arrayList.add(obj);
                        break;
                    }
                    i8++;
                }
            }
        }
        return arrayList;
    }

    public static g e(String str) {
        List singletonList = Collections.singletonList(b.b(Uri.parse(str)));
        List list = Collections.EMPTY_LIST;
        return new g("", list, singletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
    }

    public static List f(List list, List list2, List list3, List list4, List list5) {
        ArrayList arrayList = new ArrayList();
        for (int i6 = 0; i6 < list.size(); i6++) {
            Uri uri = ((b) list.get(i6)).f17552a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(list2, arrayList);
        b(list3, arrayList);
        b(list4, arrayList);
        b(list5, arrayList);
        return arrayList;
    }

    @Override // r1.InterfaceC2021a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public g a(List list) {
        String str = this.f17558a;
        List list2 = this.f17559b;
        List d6 = d(this.f17539e, 0, list);
        List list3 = Collections.EMPTY_LIST;
        return new g(str, list2, d6, list3, d(this.f17541g, 1, list), d(this.f17542h, 2, list), list3, this.f17544j, this.f17545k, this.f17560c, this.f17546l, this.f17547m);
    }
}
