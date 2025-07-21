package b1;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.IntCompanionObject;
import y6.k;

/* renamed from: b1.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1076a {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f10410a;

    /* renamed from: b, reason: collision with root package name */
    public final Layout.Alignment f10411b;

    /* renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f10412c;

    /* renamed from: d, reason: collision with root package name */
    public final Bitmap f10413d;

    /* renamed from: e, reason: collision with root package name */
    public final float f10414e;

    /* renamed from: f, reason: collision with root package name */
    public final int f10415f;

    /* renamed from: g, reason: collision with root package name */
    public final int f10416g;

    /* renamed from: h, reason: collision with root package name */
    public final float f10417h;

    /* renamed from: i, reason: collision with root package name */
    public final int f10418i;

    /* renamed from: j, reason: collision with root package name */
    public final float f10419j;

    /* renamed from: k, reason: collision with root package name */
    public final float f10420k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f10421l;

    /* renamed from: m, reason: collision with root package name */
    public final int f10422m;

    /* renamed from: n, reason: collision with root package name */
    public final int f10423n;

    /* renamed from: o, reason: collision with root package name */
    public final float f10424o;

    /* renamed from: p, reason: collision with root package name */
    public final int f10425p;

    /* renamed from: q, reason: collision with root package name */
    public final float f10426q;

    /* renamed from: r, reason: collision with root package name */
    public static final C1076a f10401r = new b().o("").a();

    /* renamed from: s, reason: collision with root package name */
    public static final String f10402s = AbstractC1117K.x0(0);

    /* renamed from: t, reason: collision with root package name */
    public static final String f10403t = AbstractC1117K.x0(17);

    /* renamed from: u, reason: collision with root package name */
    public static final String f10404u = AbstractC1117K.x0(1);

    /* renamed from: v, reason: collision with root package name */
    public static final String f10405v = AbstractC1117K.x0(2);

    /* renamed from: w, reason: collision with root package name */
    public static final String f10406w = AbstractC1117K.x0(3);

    /* renamed from: x, reason: collision with root package name */
    public static final String f10407x = AbstractC1117K.x0(18);

    /* renamed from: y, reason: collision with root package name */
    public static final String f10408y = AbstractC1117K.x0(4);

    /* renamed from: z, reason: collision with root package name */
    public static final String f10409z = AbstractC1117K.x0(5);

    /* renamed from: A, reason: collision with root package name */
    public static final String f10390A = AbstractC1117K.x0(6);

    /* renamed from: B, reason: collision with root package name */
    public static final String f10391B = AbstractC1117K.x0(7);

    /* renamed from: C, reason: collision with root package name */
    public static final String f10392C = AbstractC1117K.x0(8);

    /* renamed from: D, reason: collision with root package name */
    public static final String f10393D = AbstractC1117K.x0(9);

    /* renamed from: E, reason: collision with root package name */
    public static final String f10394E = AbstractC1117K.x0(10);

    /* renamed from: F, reason: collision with root package name */
    public static final String f10395F = AbstractC1117K.x0(11);

    /* renamed from: G, reason: collision with root package name */
    public static final String f10396G = AbstractC1117K.x0(12);

    /* renamed from: H, reason: collision with root package name */
    public static final String f10397H = AbstractC1117K.x0(13);

    /* renamed from: I, reason: collision with root package name */
    public static final String f10398I = AbstractC1117K.x0(14);

    /* renamed from: J, reason: collision with root package name */
    public static final String f10399J = AbstractC1117K.x0(15);

    /* renamed from: K, reason: collision with root package name */
    public static final String f10400K = AbstractC1117K.x0(16);

    /* renamed from: b1.a$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public CharSequence f10427a;

        /* renamed from: b, reason: collision with root package name */
        public Bitmap f10428b;

        /* renamed from: c, reason: collision with root package name */
        public Layout.Alignment f10429c;

        /* renamed from: d, reason: collision with root package name */
        public Layout.Alignment f10430d;

        /* renamed from: e, reason: collision with root package name */
        public float f10431e;

        /* renamed from: f, reason: collision with root package name */
        public int f10432f;

        /* renamed from: g, reason: collision with root package name */
        public int f10433g;

        /* renamed from: h, reason: collision with root package name */
        public float f10434h;

        /* renamed from: i, reason: collision with root package name */
        public int f10435i;

        /* renamed from: j, reason: collision with root package name */
        public int f10436j;

        /* renamed from: k, reason: collision with root package name */
        public float f10437k;

        /* renamed from: l, reason: collision with root package name */
        public float f10438l;

        /* renamed from: m, reason: collision with root package name */
        public float f10439m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f10440n;

        /* renamed from: o, reason: collision with root package name */
        public int f10441o;

        /* renamed from: p, reason: collision with root package name */
        public int f10442p;

        /* renamed from: q, reason: collision with root package name */
        public float f10443q;

        public C1076a a() {
            return new C1076a(this.f10427a, this.f10429c, this.f10430d, this.f10428b, this.f10431e, this.f10432f, this.f10433g, this.f10434h, this.f10435i, this.f10436j, this.f10437k, this.f10438l, this.f10439m, this.f10440n, this.f10441o, this.f10442p, this.f10443q);
        }

        public b b() {
            this.f10440n = false;
            return this;
        }

        public int c() {
            return this.f10433g;
        }

        public int d() {
            return this.f10435i;
        }

        public CharSequence e() {
            return this.f10427a;
        }

        public b f(Bitmap bitmap) {
            this.f10428b = bitmap;
            return this;
        }

        public b g(float f6) {
            this.f10439m = f6;
            return this;
        }

        public b h(float f6, int i6) {
            this.f10431e = f6;
            this.f10432f = i6;
            return this;
        }

        public b i(int i6) {
            this.f10433g = i6;
            return this;
        }

        public b j(Layout.Alignment alignment) {
            this.f10430d = alignment;
            return this;
        }

        public b k(float f6) {
            this.f10434h = f6;
            return this;
        }

        public b l(int i6) {
            this.f10435i = i6;
            return this;
        }

        public b m(float f6) {
            this.f10443q = f6;
            return this;
        }

        public b n(float f6) {
            this.f10438l = f6;
            return this;
        }

        public b o(CharSequence charSequence) {
            this.f10427a = charSequence;
            return this;
        }

        public b p(Layout.Alignment alignment) {
            this.f10429c = alignment;
            return this;
        }

        public b q(float f6, int i6) {
            this.f10437k = f6;
            this.f10436j = i6;
            return this;
        }

        public b r(int i6) {
            this.f10442p = i6;
            return this;
        }

        public b s(int i6) {
            this.f10441o = i6;
            this.f10440n = true;
            return this;
        }

        public b() {
            this.f10427a = null;
            this.f10428b = null;
            this.f10429c = null;
            this.f10430d = null;
            this.f10431e = -3.4028235E38f;
            this.f10432f = IntCompanionObject.MIN_VALUE;
            this.f10433g = IntCompanionObject.MIN_VALUE;
            this.f10434h = -3.4028235E38f;
            this.f10435i = IntCompanionObject.MIN_VALUE;
            this.f10436j = IntCompanionObject.MIN_VALUE;
            this.f10437k = -3.4028235E38f;
            this.f10438l = -3.4028235E38f;
            this.f10439m = -3.4028235E38f;
            this.f10440n = false;
            this.f10441o = -16777216;
            this.f10442p = IntCompanionObject.MIN_VALUE;
        }

        public b(C1076a c1076a) {
            this.f10427a = c1076a.f10410a;
            this.f10428b = c1076a.f10413d;
            this.f10429c = c1076a.f10411b;
            this.f10430d = c1076a.f10412c;
            this.f10431e = c1076a.f10414e;
            this.f10432f = c1076a.f10415f;
            this.f10433g = c1076a.f10416g;
            this.f10434h = c1076a.f10417h;
            this.f10435i = c1076a.f10418i;
            this.f10436j = c1076a.f10423n;
            this.f10437k = c1076a.f10424o;
            this.f10438l = c1076a.f10419j;
            this.f10439m = c1076a.f10420k;
            this.f10440n = c1076a.f10421l;
            this.f10441o = c1076a.f10422m;
            this.f10442p = c1076a.f10425p;
            this.f10443q = c1076a.f10426q;
        }
    }

    public static C1076a b(Bundle bundle) {
        b bVar = new b();
        CharSequence charSequence = bundle.getCharSequence(f10402s);
        if (charSequence != null) {
            bVar.o(charSequence);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(f10403t);
            if (parcelableArrayList != null) {
                SpannableString valueOf = SpannableString.valueOf(charSequence);
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    c.c((Bundle) it.next(), valueOf);
                }
                bVar.o(valueOf);
            }
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(f10404u);
        if (alignment != null) {
            bVar.p(alignment);
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(f10405v);
        if (alignment2 != null) {
            bVar.j(alignment2);
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(f10406w);
        if (bitmap != null) {
            bVar.f(bitmap);
        } else {
            byte[] byteArray = bundle.getByteArray(f10407x);
            if (byteArray != null) {
                bVar.f(BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length));
            }
        }
        String str = f10408y;
        if (bundle.containsKey(str)) {
            String str2 = f10409z;
            if (bundle.containsKey(str2)) {
                bVar.h(bundle.getFloat(str), bundle.getInt(str2));
            }
        }
        String str3 = f10390A;
        if (bundle.containsKey(str3)) {
            bVar.i(bundle.getInt(str3));
        }
        String str4 = f10391B;
        if (bundle.containsKey(str4)) {
            bVar.k(bundle.getFloat(str4));
        }
        String str5 = f10392C;
        if (bundle.containsKey(str5)) {
            bVar.l(bundle.getInt(str5));
        }
        String str6 = f10394E;
        if (bundle.containsKey(str6)) {
            String str7 = f10393D;
            if (bundle.containsKey(str7)) {
                bVar.q(bundle.getFloat(str6), bundle.getInt(str7));
            }
        }
        String str8 = f10395F;
        if (bundle.containsKey(str8)) {
            bVar.n(bundle.getFloat(str8));
        }
        String str9 = f10396G;
        if (bundle.containsKey(str9)) {
            bVar.g(bundle.getFloat(str9));
        }
        String str10 = f10397H;
        if (bundle.containsKey(str10)) {
            bVar.s(bundle.getInt(str10));
        }
        if (!bundle.getBoolean(f10398I, false)) {
            bVar.b();
        }
        String str11 = f10399J;
        if (bundle.containsKey(str11)) {
            bVar.r(bundle.getInt(str11));
        }
        String str12 = f10400K;
        if (bundle.containsKey(str12)) {
            bVar.m(bundle.getFloat(str12));
        }
        return bVar.a();
    }

    public b a() {
        return new b();
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f10410a;
        if (charSequence != null) {
            bundle.putCharSequence(f10402s, charSequence);
            CharSequence charSequence2 = this.f10410a;
            if (charSequence2 instanceof Spanned) {
                ArrayList<? extends Parcelable> a6 = c.a((Spanned) charSequence2);
                if (!a6.isEmpty()) {
                    bundle.putParcelableArrayList(f10403t, a6);
                }
            }
        }
        bundle.putSerializable(f10404u, this.f10411b);
        bundle.putSerializable(f10405v, this.f10412c);
        bundle.putFloat(f10408y, this.f10414e);
        bundle.putInt(f10409z, this.f10415f);
        bundle.putInt(f10390A, this.f10416g);
        bundle.putFloat(f10391B, this.f10417h);
        bundle.putInt(f10392C, this.f10418i);
        bundle.putInt(f10393D, this.f10423n);
        bundle.putFloat(f10394E, this.f10424o);
        bundle.putFloat(f10395F, this.f10419j);
        bundle.putFloat(f10396G, this.f10420k);
        bundle.putBoolean(f10398I, this.f10421l);
        bundle.putInt(f10397H, this.f10422m);
        bundle.putInt(f10399J, this.f10425p);
        bundle.putFloat(f10400K, this.f10426q);
        return bundle;
    }

    public Bundle d() {
        Bundle c6 = c();
        if (this.f10413d != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            AbstractC1119a.g(this.f10413d.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
            c6.putByteArray(f10407x, byteArrayOutputStream.toByteArray());
        }
        return c6;
    }

    public boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj != null && C1076a.class == obj.getClass()) {
            C1076a c1076a = (C1076a) obj;
            if (TextUtils.equals(this.f10410a, c1076a.f10410a) && this.f10411b == c1076a.f10411b && this.f10412c == c1076a.f10412c && ((bitmap = this.f10413d) != null ? !((bitmap2 = c1076a.f10413d) == null || !bitmap.sameAs(bitmap2)) : c1076a.f10413d == null) && this.f10414e == c1076a.f10414e && this.f10415f == c1076a.f10415f && this.f10416g == c1076a.f10416g && this.f10417h == c1076a.f10417h && this.f10418i == c1076a.f10418i && this.f10419j == c1076a.f10419j && this.f10420k == c1076a.f10420k && this.f10421l == c1076a.f10421l && this.f10422m == c1076a.f10422m && this.f10423n == c1076a.f10423n && this.f10424o == c1076a.f10424o && this.f10425p == c1076a.f10425p && this.f10426q == c1076a.f10426q) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return k.b(new Object[]{this.f10410a, this.f10411b, this.f10412c, this.f10413d, Float.valueOf(this.f10414e), Integer.valueOf(this.f10415f), Integer.valueOf(this.f10416g), Float.valueOf(this.f10417h), Integer.valueOf(this.f10418i), Float.valueOf(this.f10419j), Float.valueOf(this.f10420k), Boolean.valueOf(this.f10421l), Integer.valueOf(this.f10422m), Integer.valueOf(this.f10423n), Float.valueOf(this.f10424o), Integer.valueOf(this.f10425p), Float.valueOf(this.f10426q)});
    }

    public C1076a(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f6, int i6, int i7, float f7, int i8, int i9, float f8, float f9, float f10, boolean z6, int i10, int i11, float f11) {
        if (charSequence == null) {
            AbstractC1119a.e(bitmap);
        } else {
            AbstractC1119a.a(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f10410a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f10410a = charSequence.toString();
        } else {
            this.f10410a = null;
        }
        this.f10411b = alignment;
        this.f10412c = alignment2;
        this.f10413d = bitmap;
        this.f10414e = f6;
        this.f10415f = i6;
        this.f10416g = i7;
        this.f10417h = f7;
        this.f10418i = i8;
        this.f10419j = f9;
        this.f10420k = f10;
        this.f10421l = z6;
        this.f10422m = i10;
        this.f10423n = i9;
        this.f10424o = f8;
        this.f10425p = i11;
        this.f10426q = f11;
    }
}
