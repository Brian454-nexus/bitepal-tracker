package j2;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: j2.c, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1646c {

    /* renamed from: f, reason: collision with root package name */
    public int f16154f;

    /* renamed from: h, reason: collision with root package name */
    public int f16156h;

    /* renamed from: o, reason: collision with root package name */
    public float f16163o;

    /* renamed from: a, reason: collision with root package name */
    public String f16149a = "";

    /* renamed from: b, reason: collision with root package name */
    public String f16150b = "";

    /* renamed from: c, reason: collision with root package name */
    public Set f16151c = Collections.EMPTY_SET;

    /* renamed from: d, reason: collision with root package name */
    public String f16152d = "";

    /* renamed from: e, reason: collision with root package name */
    public String f16153e = null;

    /* renamed from: g, reason: collision with root package name */
    public boolean f16155g = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f16157i = false;

    /* renamed from: j, reason: collision with root package name */
    public int f16158j = -1;

    /* renamed from: k, reason: collision with root package name */
    public int f16159k = -1;

    /* renamed from: l, reason: collision with root package name */
    public int f16160l = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f16161m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f16162n = -1;

    /* renamed from: p, reason: collision with root package name */
    public int f16164p = -1;

    /* renamed from: q, reason: collision with root package name */
    public boolean f16165q = false;

    public static int B(int i6, String str, String str2, int i7) {
        if (str.isEmpty() || i6 == -1) {
            return i6;
        }
        if (str.equals(str2)) {
            return i6 + i7;
        }
        return -1;
    }

    public C1646c A(boolean z6) {
        this.f16159k = z6 ? 1 : 0;
        return this;
    }

    public int a() {
        if (this.f16157i) {
            return this.f16156h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public boolean b() {
        return this.f16165q;
    }

    public int c() {
        if (this.f16155g) {
            return this.f16154f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public String d() {
        return this.f16153e;
    }

    public float e() {
        return this.f16163o;
    }

    public int f() {
        return this.f16162n;
    }

    public int g() {
        return this.f16164p;
    }

    public int h(String str, String str2, Set set, String str3) {
        if (this.f16149a.isEmpty() && this.f16150b.isEmpty() && this.f16151c.isEmpty() && this.f16152d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int B6 = B(B(B(0, this.f16149a, str, 1073741824), this.f16150b, str2, 2), this.f16152d, str3, 4);
        if (B6 == -1 || !set.containsAll(this.f16151c)) {
            return 0;
        }
        return B6 + (this.f16151c.size() * 4);
    }

    public int i() {
        int i6 = this.f16160l;
        if (i6 == -1 && this.f16161m == -1) {
            return -1;
        }
        return (i6 == 1 ? 1 : 0) | (this.f16161m == 1 ? 2 : 0);
    }

    public boolean j() {
        return this.f16157i;
    }

    public boolean k() {
        return this.f16155g;
    }

    public boolean l() {
        return this.f16158j == 1;
    }

    public boolean m() {
        return this.f16159k == 1;
    }

    public C1646c n(int i6) {
        this.f16156h = i6;
        this.f16157i = true;
        return this;
    }

    public C1646c o(boolean z6) {
        this.f16160l = z6 ? 1 : 0;
        return this;
    }

    public C1646c p(boolean z6) {
        this.f16165q = z6;
        return this;
    }

    public C1646c q(int i6) {
        this.f16154f = i6;
        this.f16155g = true;
        return this;
    }

    public C1646c r(String str) {
        this.f16153e = str == null ? null : y6.c.e(str);
        return this;
    }

    public C1646c s(float f6) {
        this.f16163o = f6;
        return this;
    }

    public C1646c t(int i6) {
        this.f16162n = i6;
        return this;
    }

    public C1646c u(boolean z6) {
        this.f16161m = z6 ? 1 : 0;
        return this;
    }

    public C1646c v(int i6) {
        this.f16164p = i6;
        return this;
    }

    public void w(String[] strArr) {
        this.f16151c = new HashSet(Arrays.asList(strArr));
    }

    public void x(String str) {
        this.f16149a = str;
    }

    public void y(String str) {
        this.f16150b = str;
    }

    public void z(String str) {
        this.f16152d = str;
    }
}
