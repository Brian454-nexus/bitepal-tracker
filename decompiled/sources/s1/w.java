package s1;

import android.net.Uri;
import c1.AbstractC1117K;
import java.util.HashMap;
import z6.w;
import z6.y;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final y f18843a;

    /* renamed from: b, reason: collision with root package name */
    public final z6.w f18844b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18845c;

    /* renamed from: d, reason: collision with root package name */
    public final String f18846d;

    /* renamed from: e, reason: collision with root package name */
    public final String f18847e;

    /* renamed from: f, reason: collision with root package name */
    public final int f18848f;

    /* renamed from: g, reason: collision with root package name */
    public final Uri f18849g;

    /* renamed from: h, reason: collision with root package name */
    public final String f18850h;

    /* renamed from: i, reason: collision with root package name */
    public final String f18851i;

    /* renamed from: j, reason: collision with root package name */
    public final String f18852j;

    /* renamed from: k, reason: collision with root package name */
    public final String f18853k;

    /* renamed from: l, reason: collision with root package name */
    public final String f18854l;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final HashMap f18855a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        public final w.a f18856b = new w.a();

        /* renamed from: c, reason: collision with root package name */
        public int f18857c = -1;

        /* renamed from: d, reason: collision with root package name */
        public String f18858d;

        /* renamed from: e, reason: collision with root package name */
        public String f18859e;

        /* renamed from: f, reason: collision with root package name */
        public String f18860f;

        /* renamed from: g, reason: collision with root package name */
        public Uri f18861g;

        /* renamed from: h, reason: collision with root package name */
        public String f18862h;

        /* renamed from: i, reason: collision with root package name */
        public String f18863i;

        /* renamed from: j, reason: collision with root package name */
        public String f18864j;

        /* renamed from: k, reason: collision with root package name */
        public String f18865k;

        /* renamed from: l, reason: collision with root package name */
        public String f18866l;

        public b m(String str, String str2) {
            this.f18855a.put(str, str2);
            return this;
        }

        public b n(C2041a c2041a) {
            this.f18856b.h(c2041a);
            return this;
        }

        public w o() {
            return new w(this);
        }

        public b p(int i6) {
            this.f18857c = i6;
            return this;
        }

        public b q(String str) {
            this.f18862h = str;
            return this;
        }

        public b r(String str) {
            this.f18865k = str;
            return this;
        }

        public b s(String str) {
            this.f18863i = str;
            return this;
        }

        public b t(String str) {
            this.f18859e = str;
            return this;
        }

        public b u(String str) {
            this.f18866l = str;
            return this;
        }

        public b v(String str) {
            this.f18864j = str;
            return this;
        }

        public b w(String str) {
            this.f18858d = str;
            return this;
        }

        public b x(String str) {
            this.f18860f = str;
            return this;
        }

        public b y(Uri uri) {
            this.f18861g = uri;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w.class == obj.getClass()) {
            w wVar = (w) obj;
            if (this.f18848f == wVar.f18848f && this.f18843a.equals(wVar.f18843a) && this.f18844b.equals(wVar.f18844b) && AbstractC1117K.c(this.f18846d, wVar.f18846d) && AbstractC1117K.c(this.f18845c, wVar.f18845c) && AbstractC1117K.c(this.f18847e, wVar.f18847e) && AbstractC1117K.c(this.f18854l, wVar.f18854l) && AbstractC1117K.c(this.f18849g, wVar.f18849g) && AbstractC1117K.c(this.f18852j, wVar.f18852j) && AbstractC1117K.c(this.f18853k, wVar.f18853k) && AbstractC1117K.c(this.f18850h, wVar.f18850h) && AbstractC1117K.c(this.f18851i, wVar.f18851i)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((217 + this.f18843a.hashCode()) * 31) + this.f18844b.hashCode()) * 31;
        String str = this.f18846d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f18845c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f18847e;
        int hashCode4 = (((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f18848f) * 31;
        String str4 = this.f18854l;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Uri uri = this.f18849g;
        int hashCode6 = (hashCode5 + (uri == null ? 0 : uri.hashCode())) * 31;
        String str5 = this.f18852j;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f18853k;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f18850h;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f18851i;
        return hashCode9 + (str8 != null ? str8.hashCode() : 0);
    }

    public w(b bVar) {
        this.f18843a = y.c(bVar.f18855a);
        this.f18844b = bVar.f18856b.k();
        this.f18845c = (String) AbstractC1117K.i(bVar.f18858d);
        this.f18846d = (String) AbstractC1117K.i(bVar.f18859e);
        this.f18847e = (String) AbstractC1117K.i(bVar.f18860f);
        this.f18849g = bVar.f18861g;
        this.f18850h = bVar.f18862h;
        this.f18848f = bVar.f18857c;
        this.f18851i = bVar.f18863i;
        this.f18852j = bVar.f18865k;
        this.f18853k = bVar.f18866l;
        this.f18854l = bVar.f18864j;
    }
}
