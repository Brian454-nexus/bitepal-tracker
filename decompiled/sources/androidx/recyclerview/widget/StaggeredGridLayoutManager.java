package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.p {

    /* renamed from: A, reason: collision with root package name */
    public BitSet f9827A;

    /* renamed from: F, reason: collision with root package name */
    public boolean f9832F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f9833G;

    /* renamed from: H, reason: collision with root package name */
    public e f9834H;

    /* renamed from: I, reason: collision with root package name */
    public int f9835I;

    /* renamed from: N, reason: collision with root package name */
    public int[] f9840N;

    /* renamed from: s, reason: collision with root package name */
    public f[] f9843s;

    /* renamed from: t, reason: collision with root package name */
    public k f9844t;

    /* renamed from: u, reason: collision with root package name */
    public k f9845u;

    /* renamed from: v, reason: collision with root package name */
    public int f9846v;

    /* renamed from: w, reason: collision with root package name */
    public int f9847w;

    /* renamed from: x, reason: collision with root package name */
    public final i f9848x;

    /* renamed from: r, reason: collision with root package name */
    public int f9842r = -1;

    /* renamed from: y, reason: collision with root package name */
    public boolean f9849y = false;

    /* renamed from: z, reason: collision with root package name */
    public boolean f9850z = false;

    /* renamed from: B, reason: collision with root package name */
    public int f9828B = -1;

    /* renamed from: C, reason: collision with root package name */
    public int f9829C = IntCompanionObject.MIN_VALUE;

    /* renamed from: D, reason: collision with root package name */
    public d f9830D = new d();

    /* renamed from: E, reason: collision with root package name */
    public int f9831E = 2;

    /* renamed from: J, reason: collision with root package name */
    public final Rect f9836J = new Rect();

    /* renamed from: K, reason: collision with root package name */
    public final b f9837K = new b();

    /* renamed from: L, reason: collision with root package name */
    public boolean f9838L = false;

    /* renamed from: M, reason: collision with root package name */
    public boolean f9839M = true;

    /* renamed from: O, reason: collision with root package name */
    public final Runnable f9841O = new a();

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.O1();
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class b {

        /* renamed from: a, reason: collision with root package name */
        public int f9852a;

        /* renamed from: b, reason: collision with root package name */
        public int f9853b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f9854c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f9855d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f9856e;

        /* renamed from: f, reason: collision with root package name */
        public int[] f9857f;

        public b() {
            c();
        }

        public void a() {
            this.f9853b = this.f9854c ? StaggeredGridLayoutManager.this.f9844t.i() : StaggeredGridLayoutManager.this.f9844t.m();
        }

        public void b(int i6) {
            if (this.f9854c) {
                this.f9853b = StaggeredGridLayoutManager.this.f9844t.i() - i6;
            } else {
                this.f9853b = StaggeredGridLayoutManager.this.f9844t.m() + i6;
            }
        }

        public void c() {
            this.f9852a = -1;
            this.f9853b = IntCompanionObject.MIN_VALUE;
            this.f9854c = false;
            this.f9855d = false;
            this.f9856e = false;
            int[] iArr = this.f9857f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        public void d(f[] fVarArr) {
            int length = fVarArr.length;
            int[] iArr = this.f9857f;
            if (iArr == null || iArr.length < length) {
                this.f9857f = new int[StaggeredGridLayoutManager.this.f9843s.length];
            }
            for (int i6 = 0; i6 < length; i6++) {
                this.f9857f[i6] = fVarArr[i6].p(IntCompanionObject.MIN_VALUE);
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class c extends RecyclerView.q {

        /* renamed from: e, reason: collision with root package name */
        public f f9859e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f9860f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public boolean e() {
            return this.f9860f;
        }

        public c(int i6, int i7) {
            super(i6, i7);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public int f9867a;

        /* renamed from: b, reason: collision with root package name */
        public int f9868b;

        /* renamed from: c, reason: collision with root package name */
        public int f9869c;

        /* renamed from: d, reason: collision with root package name */
        public int[] f9870d;

        /* renamed from: e, reason: collision with root package name */
        public int f9871e;

        /* renamed from: f, reason: collision with root package name */
        public int[] f9872f;

        /* renamed from: g, reason: collision with root package name */
        public List f9873g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f9874h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f9875i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f9876j;

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public e[] newArray(int i6) {
                return new e[i6];
            }
        }

        public e() {
        }

        public void a() {
            this.f9870d = null;
            this.f9869c = 0;
            this.f9867a = -1;
            this.f9868b = -1;
        }

        public void c() {
            this.f9870d = null;
            this.f9869c = 0;
            this.f9871e = 0;
            this.f9872f = null;
            this.f9873g = null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i6) {
            parcel.writeInt(this.f9867a);
            parcel.writeInt(this.f9868b);
            parcel.writeInt(this.f9869c);
            if (this.f9869c > 0) {
                parcel.writeIntArray(this.f9870d);
            }
            parcel.writeInt(this.f9871e);
            if (this.f9871e > 0) {
                parcel.writeIntArray(this.f9872f);
            }
            parcel.writeInt(this.f9874h ? 1 : 0);
            parcel.writeInt(this.f9875i ? 1 : 0);
            parcel.writeInt(this.f9876j ? 1 : 0);
            parcel.writeList(this.f9873g);
        }

        public e(Parcel parcel) {
            this.f9867a = parcel.readInt();
            this.f9868b = parcel.readInt();
            int readInt = parcel.readInt();
            this.f9869c = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f9870d = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f9871e = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f9872f = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f9874h = parcel.readInt() == 1;
            this.f9875i = parcel.readInt() == 1;
            this.f9876j = parcel.readInt() == 1;
            this.f9873g = parcel.readArrayList(d.a.class.getClassLoader());
        }

        public e(e eVar) {
            this.f9869c = eVar.f9869c;
            this.f9867a = eVar.f9867a;
            this.f9868b = eVar.f9868b;
            this.f9870d = eVar.f9870d;
            this.f9871e = eVar.f9871e;
            this.f9872f = eVar.f9872f;
            this.f9874h = eVar.f9874h;
            this.f9875i = eVar.f9875i;
            this.f9876j = eVar.f9876j;
            this.f9873g = eVar.f9873g;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class f {

        /* renamed from: a, reason: collision with root package name */
        public ArrayList f9877a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public int f9878b = IntCompanionObject.MIN_VALUE;

        /* renamed from: c, reason: collision with root package name */
        public int f9879c = IntCompanionObject.MIN_VALUE;

        /* renamed from: d, reason: collision with root package name */
        public int f9880d = 0;

        /* renamed from: e, reason: collision with root package name */
        public final int f9881e;

        public f(int i6) {
            this.f9881e = i6;
        }

        public void a(View view) {
            c n6 = n(view);
            n6.f9859e = this;
            this.f9877a.add(view);
            this.f9879c = IntCompanionObject.MIN_VALUE;
            if (this.f9877a.size() == 1) {
                this.f9878b = IntCompanionObject.MIN_VALUE;
            }
            if (n6.c() || n6.b()) {
                this.f9880d += StaggeredGridLayoutManager.this.f9844t.e(view);
            }
        }

        public void b(boolean z6, int i6) {
            int l6 = z6 ? l(IntCompanionObject.MIN_VALUE) : p(IntCompanionObject.MIN_VALUE);
            e();
            if (l6 == Integer.MIN_VALUE) {
                return;
            }
            if (!z6 || l6 >= StaggeredGridLayoutManager.this.f9844t.i()) {
                if (z6 || l6 <= StaggeredGridLayoutManager.this.f9844t.m()) {
                    if (i6 != Integer.MIN_VALUE) {
                        l6 += i6;
                    }
                    this.f9879c = l6;
                    this.f9878b = l6;
                }
            }
        }

        public void c() {
            d.a f6;
            ArrayList arrayList = this.f9877a;
            View view = (View) arrayList.get(arrayList.size() - 1);
            c n6 = n(view);
            this.f9879c = StaggeredGridLayoutManager.this.f9844t.d(view);
            if (n6.f9860f && (f6 = StaggeredGridLayoutManager.this.f9830D.f(n6.a())) != null && f6.f9864b == 1) {
                this.f9879c += f6.a(this.f9881e);
            }
        }

        public void d() {
            d.a f6;
            View view = (View) this.f9877a.get(0);
            c n6 = n(view);
            this.f9878b = StaggeredGridLayoutManager.this.f9844t.g(view);
            if (n6.f9860f && (f6 = StaggeredGridLayoutManager.this.f9830D.f(n6.a())) != null && f6.f9864b == -1) {
                this.f9878b -= f6.a(this.f9881e);
            }
        }

        public void e() {
            this.f9877a.clear();
            q();
            this.f9880d = 0;
        }

        public int f() {
            return StaggeredGridLayoutManager.this.f9849y ? i(this.f9877a.size() - 1, -1, true) : i(0, this.f9877a.size(), true);
        }

        public int g() {
            return StaggeredGridLayoutManager.this.f9849y ? i(0, this.f9877a.size(), true) : i(this.f9877a.size() - 1, -1, true);
        }

        public int h(int i6, int i7, boolean z6, boolean z7, boolean z8) {
            int m6 = StaggeredGridLayoutManager.this.f9844t.m();
            int i8 = StaggeredGridLayoutManager.this.f9844t.i();
            int i9 = i7 > i6 ? 1 : -1;
            while (i6 != i7) {
                View view = (View) this.f9877a.get(i6);
                int g6 = StaggeredGridLayoutManager.this.f9844t.g(view);
                int d6 = StaggeredGridLayoutManager.this.f9844t.d(view);
                boolean z9 = false;
                boolean z10 = !z8 ? g6 >= i8 : g6 > i8;
                if (!z8 ? d6 > m6 : d6 >= m6) {
                    z9 = true;
                }
                if (z10 && z9) {
                    if (z6 && z7) {
                        if (g6 >= m6 && d6 <= i8) {
                            return StaggeredGridLayoutManager.this.g0(view);
                        }
                    } else {
                        if (z7) {
                            return StaggeredGridLayoutManager.this.g0(view);
                        }
                        if (g6 < m6 || d6 > i8) {
                            return StaggeredGridLayoutManager.this.g0(view);
                        }
                    }
                }
                i6 += i9;
            }
            return -1;
        }

        public int i(int i6, int i7, boolean z6) {
            return h(i6, i7, false, false, z6);
        }

        public int j() {
            return this.f9880d;
        }

        public int k() {
            int i6 = this.f9879c;
            if (i6 != Integer.MIN_VALUE) {
                return i6;
            }
            c();
            return this.f9879c;
        }

        public int l(int i6) {
            int i7 = this.f9879c;
            if (i7 != Integer.MIN_VALUE) {
                return i7;
            }
            if (this.f9877a.size() == 0) {
                return i6;
            }
            c();
            return this.f9879c;
        }

        public View m(int i6, int i7) {
            View view = null;
            if (i7 != -1) {
                int size = this.f9877a.size() - 1;
                while (size >= 0) {
                    View view2 = (View) this.f9877a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f9849y && staggeredGridLayoutManager.g0(view2) >= i6) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f9849y && staggeredGridLayoutManager2.g0(view2) <= i6) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
                return view;
            }
            int size2 = this.f9877a.size();
            int i8 = 0;
            while (i8 < size2) {
                View view3 = (View) this.f9877a.get(i8);
                StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                if (staggeredGridLayoutManager3.f9849y && staggeredGridLayoutManager3.g0(view3) <= i6) {
                    break;
                }
                StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                if ((!staggeredGridLayoutManager4.f9849y && staggeredGridLayoutManager4.g0(view3) >= i6) || !view3.hasFocusable()) {
                    break;
                }
                i8++;
                view = view3;
            }
            return view;
        }

        public c n(View view) {
            return (c) view.getLayoutParams();
        }

        public int o() {
            int i6 = this.f9878b;
            if (i6 != Integer.MIN_VALUE) {
                return i6;
            }
            d();
            return this.f9878b;
        }

        public int p(int i6) {
            int i7 = this.f9878b;
            if (i7 != Integer.MIN_VALUE) {
                return i7;
            }
            if (this.f9877a.size() == 0) {
                return i6;
            }
            d();
            return this.f9878b;
        }

        public void q() {
            this.f9878b = IntCompanionObject.MIN_VALUE;
            this.f9879c = IntCompanionObject.MIN_VALUE;
        }

        public void r(int i6) {
            int i7 = this.f9878b;
            if (i7 != Integer.MIN_VALUE) {
                this.f9878b = i7 + i6;
            }
            int i8 = this.f9879c;
            if (i8 != Integer.MIN_VALUE) {
                this.f9879c = i8 + i6;
            }
        }

        public void s() {
            int size = this.f9877a.size();
            View view = (View) this.f9877a.remove(size - 1);
            c n6 = n(view);
            n6.f9859e = null;
            if (n6.c() || n6.b()) {
                this.f9880d -= StaggeredGridLayoutManager.this.f9844t.e(view);
            }
            if (size == 1) {
                this.f9878b = IntCompanionObject.MIN_VALUE;
            }
            this.f9879c = IntCompanionObject.MIN_VALUE;
        }

        public void t() {
            View view = (View) this.f9877a.remove(0);
            c n6 = n(view);
            n6.f9859e = null;
            if (this.f9877a.size() == 0) {
                this.f9879c = IntCompanionObject.MIN_VALUE;
            }
            if (n6.c() || n6.b()) {
                this.f9880d -= StaggeredGridLayoutManager.this.f9844t.e(view);
            }
            this.f9878b = IntCompanionObject.MIN_VALUE;
        }

        public void u(View view) {
            c n6 = n(view);
            n6.f9859e = this;
            this.f9877a.add(0, view);
            this.f9878b = IntCompanionObject.MIN_VALUE;
            if (this.f9877a.size() == 1) {
                this.f9879c = IntCompanionObject.MIN_VALUE;
            }
            if (n6.c() || n6.b()) {
                this.f9880d += StaggeredGridLayoutManager.this.f9844t.e(view);
            }
        }

        public void v(int i6) {
            this.f9878b = i6;
            this.f9879c = i6;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i6, int i7) {
        RecyclerView.p.d h02 = RecyclerView.p.h0(context, attributeSet, i6, i7);
        D2(h02.f9803a);
        F2(h02.f9804b);
        E2(h02.f9805c);
        this.f9848x = new i();
        W1();
    }

    private void A2() {
        if (this.f9846v == 1 || !p2()) {
            this.f9850z = this.f9849y;
        } else {
            this.f9850z = !this.f9849y;
        }
    }

    private int Q1(RecyclerView.A a6) {
        if (J() == 0) {
            return 0;
        }
        return m.a(a6, this.f9844t, a2(!this.f9839M), Z1(!this.f9839M), this, this.f9839M);
    }

    private int R1(RecyclerView.A a6) {
        if (J() == 0) {
            return 0;
        }
        return m.b(a6, this.f9844t, a2(!this.f9839M), Z1(!this.f9839M), this, this.f9839M, this.f9850z);
    }

    private int S1(RecyclerView.A a6) {
        if (J() == 0) {
            return 0;
        }
        return m.c(a6, this.f9844t, a2(!this.f9839M), Z1(!this.f9839M), this, this.f9839M);
    }

    private int T1(int i6) {
        if (i6 == 1) {
            return (this.f9846v != 1 && p2()) ? 1 : -1;
        }
        if (i6 == 2) {
            return (this.f9846v != 1 && p2()) ? -1 : 1;
        }
        if (i6 == 17) {
            if (this.f9846v == 0) {
                return -1;
            }
            return IntCompanionObject.MIN_VALUE;
        }
        if (i6 == 33) {
            if (this.f9846v == 1) {
                return -1;
            }
            return IntCompanionObject.MIN_VALUE;
        }
        if (i6 == 66) {
            if (this.f9846v == 0) {
                return 1;
            }
            return IntCompanionObject.MIN_VALUE;
        }
        if (i6 == 130 && this.f9846v == 1) {
            return 1;
        }
        return IntCompanionObject.MIN_VALUE;
    }

    private void q2(View view, int i6, int i7, boolean z6) {
        j(view, this.f9836J);
        c cVar = (c) view.getLayoutParams();
        int i8 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
        Rect rect = this.f9836J;
        int N22 = N2(i6, i8 + rect.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int i9 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
        Rect rect2 = this.f9836J;
        int N23 = N2(i7, i9 + rect2.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect2.bottom);
        if (z6 ? F1(view, N22, N23, cVar) : D1(view, N22, N23, cVar)) {
            view.measure(N22, N23);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void A1(Rect rect, int i6, int i7) {
        int n6;
        int n7;
        int d02 = d0() + e0();
        int f02 = f0() + c0();
        if (this.f9846v == 1) {
            n7 = RecyclerView.p.n(i7, rect.height() + f02, a0());
            n6 = RecyclerView.p.n(i6, (this.f9847w * this.f9842r) + d02, b0());
        } else {
            n6 = RecyclerView.p.n(i6, rect.width() + d02, b0());
            n7 = RecyclerView.p.n(i7, (this.f9847w * this.f9842r) + f02, a0());
        }
        z1(n6, n7);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void B0(int i6) {
        super.B0(i6);
        for (int i7 = 0; i7 < this.f9842r; i7++) {
            this.f9843s[i7].r(i6);
        }
    }

    public int B2(int i6, RecyclerView.w wVar, RecyclerView.A a6) {
        if (J() == 0 || i6 == 0) {
            return 0;
        }
        u2(i6, a6);
        int X12 = X1(wVar, this.f9848x, a6);
        if (this.f9848x.f10084b >= X12) {
            i6 = i6 < 0 ? -X12 : X12;
        }
        this.f9844t.r(-i6);
        this.f9832F = this.f9850z;
        i iVar = this.f9848x;
        iVar.f10084b = 0;
        w2(wVar, iVar);
        return i6;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void C0(int i6) {
        super.C0(i6);
        for (int i7 = 0; i7 < this.f9842r; i7++) {
            this.f9843s[i7].r(i6);
        }
    }

    public final void C2(int i6) {
        i iVar = this.f9848x;
        iVar.f10087e = i6;
        iVar.f10086d = this.f9850z != (i6 == -1) ? -1 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q D() {
        return this.f9846v == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void D0(RecyclerView.h hVar, RecyclerView.h hVar2) {
        this.f9830D.b();
        for (int i6 = 0; i6 < this.f9842r; i6++) {
            this.f9843s[i6].e();
        }
    }

    public void D2(int i6) {
        if (i6 != 0 && i6 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        g(null);
        if (i6 == this.f9846v) {
            return;
        }
        this.f9846v = i6;
        k kVar = this.f9844t;
        this.f9844t = this.f9845u;
        this.f9845u = kVar;
        r1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q E(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    public void E2(boolean z6) {
        g(null);
        e eVar = this.f9834H;
        if (eVar != null && eVar.f9874h != z6) {
            eVar.f9874h = z6;
        }
        this.f9849y = z6;
        r1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q F(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    public void F2(int i6) {
        g(null);
        if (i6 != this.f9842r) {
            o2();
            this.f9842r = i6;
            this.f9827A = new BitSet(this.f9842r);
            this.f9843s = new f[this.f9842r];
            for (int i7 = 0; i7 < this.f9842r; i7++) {
                this.f9843s[i7] = new f(i7);
            }
            r1();
        }
    }

    public final void G2(int i6, int i7) {
        for (int i8 = 0; i8 < this.f9842r; i8++) {
            if (!this.f9843s[i8].f9877a.isEmpty()) {
                M2(this.f9843s[i8], i6, i7);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void H0(RecyclerView recyclerView, RecyclerView.w wVar) {
        super.H0(recyclerView, wVar);
        m1(this.f9841O);
        for (int i6 = 0; i6 < this.f9842r; i6++) {
            this.f9843s[i6].e();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean H1() {
        return this.f9834H == null;
    }

    public final boolean H2(RecyclerView.A a6, b bVar) {
        bVar.f9852a = this.f9832F ? c2(a6.b()) : Y1(a6.b());
        bVar.f9853b = IntCompanionObject.MIN_VALUE;
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View I0(View view, int i6, RecyclerView.w wVar, RecyclerView.A a6) {
        View B6;
        View m6;
        if (J() == 0 || (B6 = B(view)) == null) {
            return null;
        }
        A2();
        int T12 = T1(i6);
        if (T12 == Integer.MIN_VALUE) {
            return null;
        }
        c cVar = (c) B6.getLayoutParams();
        boolean z6 = cVar.f9860f;
        f fVar = cVar.f9859e;
        int g22 = T12 == 1 ? g2() : f2();
        K2(g22, a6);
        C2(T12);
        i iVar = this.f9848x;
        iVar.f10085c = iVar.f10086d + g22;
        iVar.f10084b = (int) (this.f9844t.n() * 0.33333334f);
        i iVar2 = this.f9848x;
        iVar2.f10090h = true;
        iVar2.f10083a = false;
        X1(wVar, iVar2, a6);
        this.f9832F = this.f9850z;
        if (!z6 && (m6 = fVar.m(g22, T12)) != null && m6 != B6) {
            return m6;
        }
        if (t2(T12)) {
            for (int i7 = this.f9842r - 1; i7 >= 0; i7--) {
                View m7 = this.f9843s[i7].m(g22, T12);
                if (m7 != null && m7 != B6) {
                    return m7;
                }
            }
        } else {
            for (int i8 = 0; i8 < this.f9842r; i8++) {
                View m8 = this.f9843s[i8].m(g22, T12);
                if (m8 != null && m8 != B6) {
                    return m8;
                }
            }
        }
        boolean z7 = (this.f9849y ^ true) == (T12 == -1);
        if (!z6) {
            View C6 = C(z7 ? fVar.f() : fVar.g());
            if (C6 != null && C6 != B6) {
                return C6;
            }
        }
        if (t2(T12)) {
            for (int i9 = this.f9842r - 1; i9 >= 0; i9--) {
                if (i9 != fVar.f9881e) {
                    View C7 = C(z7 ? this.f9843s[i9].f() : this.f9843s[i9].g());
                    if (C7 != null && C7 != B6) {
                        return C7;
                    }
                }
            }
        } else {
            for (int i10 = 0; i10 < this.f9842r; i10++) {
                View C8 = C(z7 ? this.f9843s[i10].f() : this.f9843s[i10].g());
                if (C8 != null && C8 != B6) {
                    return C8;
                }
            }
        }
        return null;
    }

    public final void I1(View view) {
        for (int i6 = this.f9842r - 1; i6 >= 0; i6--) {
            this.f9843s[i6].a(view);
        }
    }

    public boolean I2(RecyclerView.A a6, b bVar) {
        int i6;
        if (!a6.e() && (i6 = this.f9828B) != -1) {
            if (i6 >= 0 && i6 < a6.b()) {
                e eVar = this.f9834H;
                if (eVar == null || eVar.f9867a == -1 || eVar.f9869c < 1) {
                    View C6 = C(this.f9828B);
                    if (C6 != null) {
                        bVar.f9852a = this.f9850z ? g2() : f2();
                        if (this.f9829C != Integer.MIN_VALUE) {
                            if (bVar.f9854c) {
                                bVar.f9853b = (this.f9844t.i() - this.f9829C) - this.f9844t.d(C6);
                            } else {
                                bVar.f9853b = (this.f9844t.m() + this.f9829C) - this.f9844t.g(C6);
                            }
                            return true;
                        }
                        if (this.f9844t.e(C6) > this.f9844t.n()) {
                            bVar.f9853b = bVar.f9854c ? this.f9844t.i() : this.f9844t.m();
                            return true;
                        }
                        int g6 = this.f9844t.g(C6) - this.f9844t.m();
                        if (g6 < 0) {
                            bVar.f9853b = -g6;
                            return true;
                        }
                        int i7 = this.f9844t.i() - this.f9844t.d(C6);
                        if (i7 < 0) {
                            bVar.f9853b = i7;
                            return true;
                        }
                        bVar.f9853b = IntCompanionObject.MIN_VALUE;
                    } else {
                        int i8 = this.f9828B;
                        bVar.f9852a = i8;
                        int i9 = this.f9829C;
                        if (i9 == Integer.MIN_VALUE) {
                            bVar.f9854c = N1(i8) == 1;
                            bVar.a();
                        } else {
                            bVar.b(i9);
                        }
                        bVar.f9855d = true;
                    }
                } else {
                    bVar.f9853b = IntCompanionObject.MIN_VALUE;
                    bVar.f9852a = this.f9828B;
                }
                return true;
            }
            this.f9828B = -1;
            this.f9829C = IntCompanionObject.MIN_VALUE;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void J0(AccessibilityEvent accessibilityEvent) {
        super.J0(accessibilityEvent);
        if (J() > 0) {
            View a22 = a2(false);
            View Z12 = Z1(false);
            if (a22 == null || Z12 == null) {
                return;
            }
            int g02 = g0(a22);
            int g03 = g0(Z12);
            if (g02 < g03) {
                accessibilityEvent.setFromIndex(g02);
                accessibilityEvent.setToIndex(g03);
            } else {
                accessibilityEvent.setFromIndex(g03);
                accessibilityEvent.setToIndex(g02);
            }
        }
    }

    public final void J1(b bVar) {
        e eVar = this.f9834H;
        int i6 = eVar.f9869c;
        if (i6 > 0) {
            if (i6 == this.f9842r) {
                for (int i7 = 0; i7 < this.f9842r; i7++) {
                    this.f9843s[i7].e();
                    e eVar2 = this.f9834H;
                    int i8 = eVar2.f9870d[i7];
                    if (i8 != Integer.MIN_VALUE) {
                        i8 += eVar2.f9875i ? this.f9844t.i() : this.f9844t.m();
                    }
                    this.f9843s[i7].v(i8);
                }
            } else {
                eVar.c();
                e eVar3 = this.f9834H;
                eVar3.f9867a = eVar3.f9868b;
            }
        }
        e eVar4 = this.f9834H;
        this.f9833G = eVar4.f9876j;
        E2(eVar4.f9874h);
        A2();
        e eVar5 = this.f9834H;
        int i9 = eVar5.f9867a;
        if (i9 != -1) {
            this.f9828B = i9;
            bVar.f9854c = eVar5.f9875i;
        } else {
            bVar.f9854c = this.f9850z;
        }
        if (eVar5.f9871e > 1) {
            d dVar = this.f9830D;
            dVar.f9861a = eVar5.f9872f;
            dVar.f9862b = eVar5.f9873g;
        }
    }

    public void J2(RecyclerView.A a6, b bVar) {
        if (I2(a6, bVar) || H2(a6, bVar)) {
            return;
        }
        bVar.a();
        bVar.f9852a = 0;
    }

    public boolean K1() {
        int l6 = this.f9843s[0].l(IntCompanionObject.MIN_VALUE);
        for (int i6 = 1; i6 < this.f9842r; i6++) {
            if (this.f9843s[i6].l(IntCompanionObject.MIN_VALUE) != l6) {
                return false;
            }
        }
        return true;
    }

    public final void K2(int i6, RecyclerView.A a6) {
        int i7;
        int i8;
        int c6;
        i iVar = this.f9848x;
        boolean z6 = false;
        iVar.f10084b = 0;
        iVar.f10085c = i6;
        if (!w0() || (c6 = a6.c()) == -1) {
            i7 = 0;
            i8 = 0;
        } else {
            if (this.f9850z == (c6 < i6)) {
                i7 = this.f9844t.n();
                i8 = 0;
            } else {
                i8 = this.f9844t.n();
                i7 = 0;
            }
        }
        if (M()) {
            this.f9848x.f10088f = this.f9844t.m() - i8;
            this.f9848x.f10089g = this.f9844t.i() + i7;
        } else {
            this.f9848x.f10089g = this.f9844t.h() + i7;
            this.f9848x.f10088f = -i8;
        }
        i iVar2 = this.f9848x;
        iVar2.f10090h = false;
        iVar2.f10083a = true;
        if (this.f9844t.k() == 0 && this.f9844t.h() == 0) {
            z6 = true;
        }
        iVar2.f10091i = z6;
    }

    public boolean L1() {
        int p6 = this.f9843s[0].p(IntCompanionObject.MIN_VALUE);
        for (int i6 = 1; i6 < this.f9842r; i6++) {
            if (this.f9843s[i6].p(IntCompanionObject.MIN_VALUE) != p6) {
                return false;
            }
        }
        return true;
    }

    public void L2(int i6) {
        this.f9847w = i6 / this.f9842r;
        this.f9835I = View.MeasureSpec.makeMeasureSpec(i6, this.f9845u.k());
    }

    public final void M1(View view, c cVar, i iVar) {
        if (iVar.f10087e == 1) {
            if (cVar.f9860f) {
                I1(view);
                return;
            } else {
                cVar.f9859e.a(view);
                return;
            }
        }
        if (cVar.f9860f) {
            v2(view);
        } else {
            cVar.f9859e.u(view);
        }
    }

    public final void M2(f fVar, int i6, int i7) {
        int j6 = fVar.j();
        if (i6 == -1) {
            if (fVar.o() + j6 <= i7) {
                this.f9827A.set(fVar.f9881e, false);
            }
        } else if (fVar.k() - j6 >= i7) {
            this.f9827A.set(fVar.f9881e, false);
        }
    }

    public final int N1(int i6) {
        if (J() == 0) {
            return this.f9850z ? 1 : -1;
        }
        return (i6 < f2()) != this.f9850z ? -1 : 1;
    }

    public final int N2(int i6, int i7, int i8) {
        int mode;
        return (!(i7 == 0 && i8 == 0) && ((mode = View.MeasureSpec.getMode(i6)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i6) - i7) - i8), mode) : i6;
    }

    public boolean O1() {
        int f22;
        int g22;
        if (J() == 0 || this.f9831E == 0 || !q0()) {
            return false;
        }
        if (this.f9850z) {
            f22 = g2();
            g22 = f2();
        } else {
            f22 = f2();
            g22 = g2();
        }
        if (f22 == 0 && n2() != null) {
            this.f9830D.b();
            s1();
            r1();
            return true;
        }
        if (!this.f9838L) {
            return false;
        }
        int i6 = this.f9850z ? -1 : 1;
        int i7 = g22 + 1;
        d.a e6 = this.f9830D.e(f22, i7, i6, true);
        if (e6 == null) {
            this.f9838L = false;
            this.f9830D.d(i7);
            return false;
        }
        d.a e7 = this.f9830D.e(f22, e6.f9863a, i6 * (-1), true);
        if (e7 == null) {
            this.f9830D.d(e6.f9863a);
        } else {
            this.f9830D.d(e7.f9863a + 1);
        }
        s1();
        r1();
        return true;
    }

    public final boolean P1(f fVar) {
        if (this.f9850z) {
            if (fVar.k() < this.f9844t.i()) {
                ArrayList arrayList = fVar.f9877a;
                return !fVar.n((View) arrayList.get(arrayList.size() - 1)).f9860f;
            }
        } else if (fVar.o() > this.f9844t.m()) {
            return !fVar.n((View) fVar.f9877a.get(0)).f9860f;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Q0(RecyclerView recyclerView, int i6, int i7) {
        m2(i6, i7, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void R0(RecyclerView recyclerView) {
        this.f9830D.b();
        r1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void S0(RecyclerView recyclerView, int i6, int i7, int i8) {
        m2(i6, i7, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void T0(RecyclerView recyclerView, int i6, int i7) {
        m2(i6, i7, 2);
    }

    public final d.a U1(int i6) {
        d.a aVar = new d.a();
        aVar.f9865c = new int[this.f9842r];
        for (int i7 = 0; i7 < this.f9842r; i7++) {
            aVar.f9865c[i7] = i6 - this.f9843s[i7].l(i6);
        }
        return aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void V0(RecyclerView recyclerView, int i6, int i7, Object obj) {
        m2(i6, i7, 4);
    }

    public final d.a V1(int i6) {
        d.a aVar = new d.a();
        aVar.f9865c = new int[this.f9842r];
        for (int i7 = 0; i7 < this.f9842r; i7++) {
            aVar.f9865c[i7] = this.f9843s[i7].p(i6) - i6;
        }
        return aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void W0(RecyclerView.w wVar, RecyclerView.A a6) {
        s2(wVar, a6, true);
    }

    public final void W1() {
        this.f9844t = k.b(this, this.f9846v);
        this.f9845u = k.b(this, 1 - this.f9846v);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void X0(RecyclerView.A a6) {
        super.X0(a6);
        this.f9828B = -1;
        this.f9829C = IntCompanionObject.MIN_VALUE;
        this.f9834H = null;
        this.f9837K.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v5 */
    public final int X1(RecyclerView.w wVar, i iVar, RecyclerView.A a6) {
        f fVar;
        int k22;
        int e6;
        int m6;
        int e7;
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        StaggeredGridLayoutManager staggeredGridLayoutManager2 = this;
        ?? r8 = 0;
        staggeredGridLayoutManager2.f9827A.set(0, staggeredGridLayoutManager2.f9842r, true);
        int i6 = staggeredGridLayoutManager2.f9848x.f10091i ? iVar.f10087e == 1 ? IntCompanionObject.MAX_VALUE : IntCompanionObject.MIN_VALUE : iVar.f10087e == 1 ? iVar.f10089g + iVar.f10084b : iVar.f10088f - iVar.f10084b;
        staggeredGridLayoutManager2.G2(iVar.f10087e, i6);
        int i7 = staggeredGridLayoutManager2.f9850z ? staggeredGridLayoutManager2.f9844t.i() : staggeredGridLayoutManager2.f9844t.m();
        boolean z6 = false;
        StaggeredGridLayoutManager staggeredGridLayoutManager3 = staggeredGridLayoutManager2;
        while (iVar.a(a6) && (staggeredGridLayoutManager3.f9848x.f10091i || !staggeredGridLayoutManager3.f9827A.isEmpty())) {
            View b6 = iVar.b(wVar);
            c cVar = (c) b6.getLayoutParams();
            int a7 = cVar.a();
            int g6 = staggeredGridLayoutManager3.f9830D.g(a7);
            boolean z7 = g6 == -1 ? true : r8;
            if (z7) {
                fVar = cVar.f9860f ? staggeredGridLayoutManager3.f9843s[r8] : staggeredGridLayoutManager3.l2(iVar);
                staggeredGridLayoutManager3.f9830D.n(a7, fVar);
            } else {
                fVar = staggeredGridLayoutManager3.f9843s[g6];
            }
            f fVar2 = fVar;
            cVar.f9859e = fVar2;
            if (iVar.f10087e == 1) {
                staggeredGridLayoutManager3.d(b6);
            } else {
                staggeredGridLayoutManager3.e(b6, r8);
            }
            staggeredGridLayoutManager3.r2(b6, cVar, r8);
            if (iVar.f10087e == 1) {
                e6 = cVar.f9860f ? staggeredGridLayoutManager3.h2(i7) : fVar2.l(i7);
                k22 = staggeredGridLayoutManager3.f9844t.e(b6) + e6;
                if (z7 && cVar.f9860f) {
                    d.a U12 = staggeredGridLayoutManager3.U1(e6);
                    U12.f9864b = -1;
                    U12.f9863a = a7;
                    staggeredGridLayoutManager3.f9830D.a(U12);
                }
            } else {
                k22 = cVar.f9860f ? staggeredGridLayoutManager3.k2(i7) : fVar2.p(i7);
                e6 = k22 - staggeredGridLayoutManager3.f9844t.e(b6);
                if (z7 && cVar.f9860f) {
                    d.a V12 = staggeredGridLayoutManager3.V1(k22);
                    V12.f9864b = 1;
                    V12.f9863a = a7;
                    staggeredGridLayoutManager3.f9830D.a(V12);
                }
            }
            if (cVar.f9860f && iVar.f10086d == -1) {
                if (z7) {
                    staggeredGridLayoutManager3.f9838L = true;
                } else {
                    if (!(iVar.f10087e == 1 ? staggeredGridLayoutManager3.K1() : staggeredGridLayoutManager3.L1())) {
                        d.a f6 = staggeredGridLayoutManager3.f9830D.f(a7);
                        if (f6 != null) {
                            f6.f9866d = true;
                        }
                        staggeredGridLayoutManager3.f9838L = true;
                    }
                }
            }
            staggeredGridLayoutManager3.M1(b6, cVar, iVar);
            if (staggeredGridLayoutManager3.p2() && staggeredGridLayoutManager3.f9846v == 1) {
                e7 = cVar.f9860f ? staggeredGridLayoutManager3.f9845u.i() : staggeredGridLayoutManager3.f9845u.i() - (((staggeredGridLayoutManager3.f9842r - 1) - fVar2.f9881e) * staggeredGridLayoutManager3.f9847w);
                m6 = e7 - staggeredGridLayoutManager3.f9845u.e(b6);
            } else {
                m6 = cVar.f9860f ? staggeredGridLayoutManager3.f9845u.m() : (fVar2.f9881e * staggeredGridLayoutManager3.f9847w) + staggeredGridLayoutManager3.f9845u.m();
                e7 = staggeredGridLayoutManager3.f9845u.e(b6) + m6;
            }
            int i8 = e7;
            int i9 = m6;
            if (staggeredGridLayoutManager3.f9846v == 1) {
                staggeredGridLayoutManager3.y0(b6, i9, e6, i8, k22);
                staggeredGridLayoutManager = this;
            } else {
                staggeredGridLayoutManager3.y0(b6, e6, i9, k22, i8);
                staggeredGridLayoutManager = staggeredGridLayoutManager3;
            }
            if (cVar.f9860f) {
                staggeredGridLayoutManager.G2(staggeredGridLayoutManager.f9848x.f10087e, i6);
            } else {
                staggeredGridLayoutManager.M2(fVar2, staggeredGridLayoutManager.f9848x.f10087e, i6);
            }
            staggeredGridLayoutManager.w2(wVar, staggeredGridLayoutManager.f9848x);
            if (staggeredGridLayoutManager.f9848x.f10090h && b6.hasFocusable()) {
                if (cVar.f9860f) {
                    staggeredGridLayoutManager.f9827A.clear();
                } else {
                    staggeredGridLayoutManager.f9827A.set(fVar2.f9881e, false);
                }
            }
            z6 = true;
            r8 = 0;
            staggeredGridLayoutManager3 = staggeredGridLayoutManager;
        }
        if (!z6) {
            staggeredGridLayoutManager3.w2(wVar, staggeredGridLayoutManager3.f9848x);
        }
        int m7 = staggeredGridLayoutManager3.f9848x.f10087e == -1 ? staggeredGridLayoutManager3.f9844t.m() - staggeredGridLayoutManager3.k2(staggeredGridLayoutManager3.f9844t.m()) : staggeredGridLayoutManager3.h2(staggeredGridLayoutManager3.f9844t.i()) - staggeredGridLayoutManager3.f9844t.i();
        if (m7 > 0) {
            return Math.min(iVar.f10084b, m7);
        }
        return 0;
    }

    public final int Y1(int i6) {
        int J6 = J();
        for (int i7 = 0; i7 < J6; i7++) {
            int g02 = g0(I(i7));
            if (g02 >= 0 && g02 < i6) {
                return g02;
            }
        }
        return 0;
    }

    public View Z1(boolean z6) {
        int m6 = this.f9844t.m();
        int i6 = this.f9844t.i();
        View view = null;
        for (int J6 = J() - 1; J6 >= 0; J6--) {
            View I6 = I(J6);
            int g6 = this.f9844t.g(I6);
            int d6 = this.f9844t.d(I6);
            if (d6 > m6 && g6 < i6) {
                if (d6 <= i6 || !z6) {
                    return I6;
                }
                if (view == null) {
                    view = I6;
                }
            }
        }
        return view;
    }

    public View a2(boolean z6) {
        int m6 = this.f9844t.m();
        int i6 = this.f9844t.i();
        int J6 = J();
        View view = null;
        for (int i7 = 0; i7 < J6; i7++) {
            View I6 = I(i7);
            int g6 = this.f9844t.g(I6);
            if (this.f9844t.d(I6) > m6 && g6 < i6) {
                if (g6 >= m6 || !z6) {
                    return I6;
                }
                if (view == null) {
                    view = I6;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void b1(Parcelable parcelable) {
        if (parcelable instanceof e) {
            e eVar = (e) parcelable;
            this.f9834H = eVar;
            if (this.f9828B != -1) {
                eVar.a();
                this.f9834H.c();
            }
            r1();
        }
    }

    public int b2() {
        View Z12 = this.f9850z ? Z1(true) : a2(true);
        if (Z12 == null) {
            return -1;
        }
        return g0(Z12);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public Parcelable c1() {
        int p6;
        int m6;
        int[] iArr;
        if (this.f9834H != null) {
            return new e(this.f9834H);
        }
        e eVar = new e();
        eVar.f9874h = this.f9849y;
        eVar.f9875i = this.f9832F;
        eVar.f9876j = this.f9833G;
        d dVar = this.f9830D;
        if (dVar == null || (iArr = dVar.f9861a) == null) {
            eVar.f9871e = 0;
        } else {
            eVar.f9872f = iArr;
            eVar.f9871e = iArr.length;
            eVar.f9873g = dVar.f9862b;
        }
        if (J() <= 0) {
            eVar.f9867a = -1;
            eVar.f9868b = -1;
            eVar.f9869c = 0;
            return eVar;
        }
        eVar.f9867a = this.f9832F ? g2() : f2();
        eVar.f9868b = b2();
        int i6 = this.f9842r;
        eVar.f9869c = i6;
        eVar.f9870d = new int[i6];
        for (int i7 = 0; i7 < this.f9842r; i7++) {
            if (this.f9832F) {
                p6 = this.f9843s[i7].l(IntCompanionObject.MIN_VALUE);
                if (p6 != Integer.MIN_VALUE) {
                    m6 = this.f9844t.i();
                    p6 -= m6;
                    eVar.f9870d[i7] = p6;
                } else {
                    eVar.f9870d[i7] = p6;
                }
            } else {
                p6 = this.f9843s[i7].p(IntCompanionObject.MIN_VALUE);
                if (p6 != Integer.MIN_VALUE) {
                    m6 = this.f9844t.m();
                    p6 -= m6;
                    eVar.f9870d[i7] = p6;
                } else {
                    eVar.f9870d[i7] = p6;
                }
            }
        }
        return eVar;
    }

    public final int c2(int i6) {
        for (int J6 = J() - 1; J6 >= 0; J6--) {
            int g02 = g0(I(J6));
            if (g02 >= 0 && g02 < i6) {
                return g02;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void d1(int i6) {
        if (i6 == 0) {
            O1();
        }
    }

    public final void d2(RecyclerView.w wVar, RecyclerView.A a6, boolean z6) {
        int i6;
        int h22 = h2(IntCompanionObject.MIN_VALUE);
        if (h22 != Integer.MIN_VALUE && (i6 = this.f9844t.i() - h22) > 0) {
            int i7 = i6 - (-B2(-i6, wVar, a6));
            if (!z6 || i7 <= 0) {
                return;
            }
            this.f9844t.r(i7);
        }
    }

    public final void e2(RecyclerView.w wVar, RecyclerView.A a6, boolean z6) {
        int m6;
        int k22 = k2(IntCompanionObject.MAX_VALUE);
        if (k22 != Integer.MAX_VALUE && (m6 = k22 - this.f9844t.m()) > 0) {
            int B22 = m6 - B2(m6, wVar, a6);
            if (!z6 || B22 <= 0) {
                return;
            }
            this.f9844t.r(-B22);
        }
    }

    public int f2() {
        if (J() == 0) {
            return 0;
        }
        return g0(I(0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void g(String str) {
        if (this.f9834H == null) {
            super.g(str);
        }
    }

    public int g2() {
        int J6 = J();
        if (J6 == 0) {
            return 0;
        }
        return g0(I(J6 - 1));
    }

    public final int h2(int i6) {
        int l6 = this.f9843s[0].l(i6);
        for (int i7 = 1; i7 < this.f9842r; i7++) {
            int l7 = this.f9843s[i7].l(i6);
            if (l7 > l6) {
                l6 = l7;
            }
        }
        return l6;
    }

    public final int i2(int i6) {
        int p6 = this.f9843s[0].p(i6);
        for (int i7 = 1; i7 < this.f9842r; i7++) {
            int p7 = this.f9843s[i7].p(i6);
            if (p7 > p6) {
                p6 = p7;
            }
        }
        return p6;
    }

    public final int j2(int i6) {
        int l6 = this.f9843s[0].l(i6);
        for (int i7 = 1; i7 < this.f9842r; i7++) {
            int l7 = this.f9843s[i7].l(i6);
            if (l7 < l6) {
                l6 = l7;
            }
        }
        return l6;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean k() {
        return this.f9846v == 0;
    }

    public final int k2(int i6) {
        int p6 = this.f9843s[0].p(i6);
        for (int i7 = 1; i7 < this.f9842r; i7++) {
            int p7 = this.f9843s[i7].p(i6);
            if (p7 < p6) {
                p6 = p7;
            }
        }
        return p6;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean l() {
        return this.f9846v == 1;
    }

    public final f l2(i iVar) {
        int i6;
        int i7;
        int i8;
        if (t2(iVar.f10087e)) {
            i7 = this.f9842r - 1;
            i6 = -1;
            i8 = -1;
        } else {
            i6 = this.f9842r;
            i7 = 0;
            i8 = 1;
        }
        f fVar = null;
        if (iVar.f10087e == 1) {
            int m6 = this.f9844t.m();
            int i9 = IntCompanionObject.MAX_VALUE;
            while (i7 != i6) {
                f fVar2 = this.f9843s[i7];
                int l6 = fVar2.l(m6);
                if (l6 < i9) {
                    fVar = fVar2;
                    i9 = l6;
                }
                i7 += i8;
            }
            return fVar;
        }
        int i10 = this.f9844t.i();
        int i11 = IntCompanionObject.MIN_VALUE;
        while (i7 != i6) {
            f fVar3 = this.f9843s[i7];
            int p6 = fVar3.p(i10);
            if (p6 > i11) {
                fVar = fVar3;
                i11 = p6;
            }
            i7 += i8;
        }
        return fVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean m(RecyclerView.q qVar) {
        return qVar instanceof c;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f9850z
            if (r0 == 0) goto L9
            int r0 = r6.g2()
            goto Ld
        L9:
            int r0 = r6.f2()
        Ld:
            r1 = 8
            if (r9 != r1) goto L1b
            if (r7 >= r8) goto L17
            int r2 = r8 + 1
        L15:
            r3 = r7
            goto L1e
        L17:
            int r2 = r7 + 1
            r3 = r8
            goto L1e
        L1b:
            int r2 = r7 + r8
            goto L15
        L1e:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r6.f9830D
            r4.h(r3)
            r4 = 1
            if (r9 == r4) goto L3d
            r5 = 2
            if (r9 == r5) goto L37
            if (r9 == r1) goto L2c
            goto L42
        L2c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f9830D
            r9.k(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r6.f9830D
            r7.j(r8, r4)
            goto L42
        L37:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f9830D
            r9.k(r7, r8)
            goto L42
        L3d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f9830D
            r9.j(r7, r8)
        L42:
            if (r2 > r0) goto L45
            goto L57
        L45:
            boolean r7 = r6.f9850z
            if (r7 == 0) goto L4e
            int r7 = r6.f2()
            goto L52
        L4e:
            int r7 = r6.g2()
        L52:
            if (r3 > r7) goto L57
            r6.r1()
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m2(int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View n2() {
        /*
            r12 = this;
            int r0 = r12.J()
            int r1 = r0 + (-1)
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f9842r
            r2.<init>(r3)
            int r3 = r12.f9842r
            r4 = 0
            r5 = 1
            r2.set(r4, r3, r5)
            int r3 = r12.f9846v
            r6 = -1
            if (r3 != r5) goto L21
            boolean r3 = r12.p2()
            if (r3 == 0) goto L21
            r3 = r5
            goto L22
        L21:
            r3 = r6
        L22:
            boolean r7 = r12.f9850z
            if (r7 == 0) goto L28
            r0 = r6
            goto L29
        L28:
            r1 = r4
        L29:
            if (r1 >= r0) goto L2c
            r6 = r5
        L2c:
            if (r1 == r0) goto La4
            android.view.View r7 = r12.I(r1)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f9859e
            int r9 = r9.f9881e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L52
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f9859e
            boolean r9 = r12.P1(r9)
            if (r9 == 0) goto L4b
            goto La1
        L4b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f9859e
            int r9 = r9.f9881e
            r2.clear(r9)
        L52:
            boolean r9 = r8.f9860f
            if (r9 == 0) goto L57
            goto La2
        L57:
            int r9 = r1 + r6
            if (r9 == r0) goto La2
            android.view.View r9 = r12.I(r9)
            boolean r10 = r12.f9850z
            if (r10 == 0) goto L75
            androidx.recyclerview.widget.k r10 = r12.f9844t
            int r10 = r10.d(r7)
            androidx.recyclerview.widget.k r11 = r12.f9844t
            int r11 = r11.d(r9)
            if (r10 >= r11) goto L72
            goto La1
        L72:
            if (r10 != r11) goto La2
            goto L86
        L75:
            androidx.recyclerview.widget.k r10 = r12.f9844t
            int r10 = r10.g(r7)
            androidx.recyclerview.widget.k r11 = r12.f9844t
            int r11 = r11.g(r9)
            if (r10 <= r11) goto L84
            goto La1
        L84:
            if (r10 != r11) goto La2
        L86:
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r8 = r8.f9859e
            int r8 = r8.f9881e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r9.f9859e
            int r9 = r9.f9881e
            int r8 = r8 - r9
            if (r8 >= 0) goto L99
            r8 = r5
            goto L9a
        L99:
            r8 = r4
        L9a:
            if (r3 >= 0) goto L9e
            r9 = r5
            goto L9f
        L9e:
            r9 = r4
        L9f:
            if (r8 == r9) goto La2
        La1:
            return r7
        La2:
            int r1 = r1 + r6
            goto L2c
        La4:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.n2():android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void o(int i6, int i7, RecyclerView.A a6, RecyclerView.p.c cVar) {
        int l6;
        int i8;
        if (this.f9846v != 0) {
            i6 = i7;
        }
        if (J() == 0 || i6 == 0) {
            return;
        }
        u2(i6, a6);
        int[] iArr = this.f9840N;
        if (iArr == null || iArr.length < this.f9842r) {
            this.f9840N = new int[this.f9842r];
        }
        int i9 = 0;
        for (int i10 = 0; i10 < this.f9842r; i10++) {
            i iVar = this.f9848x;
            if (iVar.f10086d == -1) {
                l6 = iVar.f10088f;
                i8 = this.f9843s[i10].p(l6);
            } else {
                l6 = this.f9843s[i10].l(iVar.f10089g);
                i8 = this.f9848x.f10089g;
            }
            int i11 = l6 - i8;
            if (i11 >= 0) {
                this.f9840N[i9] = i11;
                i9++;
            }
        }
        Arrays.sort(this.f9840N, 0, i9);
        for (int i12 = 0; i12 < i9 && this.f9848x.a(a6); i12++) {
            cVar.a(this.f9848x.f10085c, this.f9840N[i12]);
            i iVar2 = this.f9848x;
            iVar2.f10085c += iVar2.f10086d;
        }
    }

    public void o2() {
        this.f9830D.b();
        r1();
    }

    public boolean p2() {
        return Y() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int q(RecyclerView.A a6) {
        return Q1(a6);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int r(RecyclerView.A a6) {
        return R1(a6);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean r0() {
        return this.f9831E != 0;
    }

    public final void r2(View view, c cVar, boolean z6) {
        if (cVar.f9860f) {
            if (this.f9846v == 1) {
                q2(view, this.f9835I, RecyclerView.p.K(W(), X(), f0() + c0(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z6);
                return;
            } else {
                q2(view, RecyclerView.p.K(n0(), o0(), d0() + e0(), ((ViewGroup.MarginLayoutParams) cVar).width, true), this.f9835I, z6);
                return;
            }
        }
        if (this.f9846v == 1) {
            q2(view, RecyclerView.p.K(this.f9847w, o0(), 0, ((ViewGroup.MarginLayoutParams) cVar).width, false), RecyclerView.p.K(W(), X(), f0() + c0(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z6);
        } else {
            q2(view, RecyclerView.p.K(n0(), o0(), d0() + e0(), ((ViewGroup.MarginLayoutParams) cVar).width, true), RecyclerView.p.K(this.f9847w, X(), 0, ((ViewGroup.MarginLayoutParams) cVar).height, false), z6);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int s(RecyclerView.A a6) {
        return S1(a6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0152, code lost:
    
        if (O1() != false) goto L87;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s2(androidx.recyclerview.widget.RecyclerView.w r9, androidx.recyclerview.widget.RecyclerView.A r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.s2(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$A, boolean):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int t(RecyclerView.A a6) {
        return Q1(a6);
    }

    public final boolean t2(int i6) {
        if (this.f9846v == 0) {
            return (i6 == -1) != this.f9850z;
        }
        return ((i6 == -1) == this.f9850z) == p2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int u(RecyclerView.A a6) {
        return R1(a6);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int u1(int i6, RecyclerView.w wVar, RecyclerView.A a6) {
        return B2(i6, wVar, a6);
    }

    public void u2(int i6, RecyclerView.A a6) {
        int f22;
        int i7;
        if (i6 > 0) {
            f22 = g2();
            i7 = 1;
        } else {
            f22 = f2();
            i7 = -1;
        }
        this.f9848x.f10083a = true;
        K2(f22, a6);
        C2(i7);
        i iVar = this.f9848x;
        iVar.f10085c = f22 + iVar.f10086d;
        iVar.f10084b = Math.abs(i6);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int v(RecyclerView.A a6) {
        return S1(a6);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void v1(int i6) {
        e eVar = this.f9834H;
        if (eVar != null && eVar.f9867a != i6) {
            eVar.a();
        }
        this.f9828B = i6;
        this.f9829C = IntCompanionObject.MIN_VALUE;
        r1();
    }

    public final void v2(View view) {
        for (int i6 = this.f9842r - 1; i6 >= 0; i6--) {
            this.f9843s[i6].u(view);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int w1(int i6, RecyclerView.w wVar, RecyclerView.A a6) {
        return B2(i6, wVar, a6);
    }

    public final void w2(RecyclerView.w wVar, i iVar) {
        if (!iVar.f10083a || iVar.f10091i) {
            return;
        }
        if (iVar.f10084b == 0) {
            if (iVar.f10087e == -1) {
                x2(wVar, iVar.f10089g);
                return;
            } else {
                y2(wVar, iVar.f10088f);
                return;
            }
        }
        if (iVar.f10087e != -1) {
            int j22 = j2(iVar.f10089g) - iVar.f10089g;
            y2(wVar, j22 < 0 ? iVar.f10088f : Math.min(j22, iVar.f10084b) + iVar.f10088f);
        } else {
            int i6 = iVar.f10088f;
            int i22 = i6 - i2(i6);
            x2(wVar, i22 < 0 ? iVar.f10089g : iVar.f10089g - Math.min(i22, iVar.f10084b));
        }
    }

    public final void x2(RecyclerView.w wVar, int i6) {
        for (int J6 = J() - 1; J6 >= 0; J6--) {
            View I6 = I(J6);
            if (this.f9844t.g(I6) < i6 || this.f9844t.q(I6) < i6) {
                return;
            }
            c cVar = (c) I6.getLayoutParams();
            if (cVar.f9860f) {
                for (int i7 = 0; i7 < this.f9842r; i7++) {
                    if (this.f9843s[i7].f9877a.size() == 1) {
                        return;
                    }
                }
                for (int i8 = 0; i8 < this.f9842r; i8++) {
                    this.f9843s[i8].s();
                }
            } else if (cVar.f9859e.f9877a.size() == 1) {
                return;
            } else {
                cVar.f9859e.s();
            }
            k1(I6, wVar);
        }
    }

    public final void y2(RecyclerView.w wVar, int i6) {
        while (J() > 0) {
            View I6 = I(0);
            if (this.f9844t.d(I6) > i6 || this.f9844t.p(I6) > i6) {
                return;
            }
            c cVar = (c) I6.getLayoutParams();
            if (cVar.f9860f) {
                for (int i7 = 0; i7 < this.f9842r; i7++) {
                    if (this.f9843s[i7].f9877a.size() == 1) {
                        return;
                    }
                }
                for (int i8 = 0; i8 < this.f9842r; i8++) {
                    this.f9843s[i8].t();
                }
            } else if (cVar.f9859e.f9877a.size() == 1) {
                return;
            } else {
                cVar.f9859e.t();
            }
            k1(I6, wVar);
        }
    }

    public final void z2() {
        if (this.f9845u.k() == 1073741824) {
            return;
        }
        int J6 = J();
        float f6 = 0.0f;
        for (int i6 = 0; i6 < J6; i6++) {
            View I6 = I(i6);
            float e6 = this.f9845u.e(I6);
            if (e6 >= f6) {
                if (((c) I6.getLayoutParams()).e()) {
                    e6 = (e6 * 1.0f) / this.f9842r;
                }
                f6 = Math.max(f6, e6);
            }
        }
        int i7 = this.f9847w;
        int round = Math.round(f6 * this.f9842r);
        if (this.f9845u.k() == Integer.MIN_VALUE) {
            round = Math.min(round, this.f9845u.n());
        }
        L2(round);
        if (this.f9847w == i7) {
            return;
        }
        for (int i8 = 0; i8 < J6; i8++) {
            View I7 = I(i8);
            c cVar = (c) I7.getLayoutParams();
            if (!cVar.f9860f) {
                if (p2() && this.f9846v == 1) {
                    int i9 = this.f9842r;
                    int i10 = cVar.f9859e.f9881e;
                    I7.offsetLeftAndRight(((-((i9 - 1) - i10)) * this.f9847w) - ((-((i9 - 1) - i10)) * i7));
                } else {
                    int i11 = cVar.f9859e.f9881e;
                    int i12 = this.f9847w * i11;
                    int i13 = i11 * i7;
                    if (this.f9846v == 1) {
                        I7.offsetLeftAndRight(i12 - i13);
                    } else {
                        I7.offsetTopAndBottom(i12 - i13);
                    }
                }
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public int[] f9861a;

        /* renamed from: b, reason: collision with root package name */
        public List f9862b;

        public void a(a aVar) {
            if (this.f9862b == null) {
                this.f9862b = new ArrayList();
            }
            int size = this.f9862b.size();
            for (int i6 = 0; i6 < size; i6++) {
                a aVar2 = (a) this.f9862b.get(i6);
                if (aVar2.f9863a == aVar.f9863a) {
                    this.f9862b.remove(i6);
                }
                if (aVar2.f9863a >= aVar.f9863a) {
                    this.f9862b.add(i6, aVar);
                    return;
                }
            }
            this.f9862b.add(aVar);
        }

        public void b() {
            int[] iArr = this.f9861a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f9862b = null;
        }

        public void c(int i6) {
            int[] iArr = this.f9861a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i6, 10) + 1];
                this.f9861a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i6 >= iArr.length) {
                int[] iArr3 = new int[o(i6)];
                this.f9861a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f9861a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        public int d(int i6) {
            List list = this.f9862b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (((a) this.f9862b.get(size)).f9863a >= i6) {
                        this.f9862b.remove(size);
                    }
                }
            }
            return h(i6);
        }

        public a e(int i6, int i7, int i8, boolean z6) {
            List list = this.f9862b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i9 = 0; i9 < size; i9++) {
                a aVar = (a) this.f9862b.get(i9);
                int i10 = aVar.f9863a;
                if (i10 >= i7) {
                    return null;
                }
                if (i10 >= i6 && (i8 == 0 || aVar.f9864b == i8 || (z6 && aVar.f9866d))) {
                    return aVar;
                }
            }
            return null;
        }

        public a f(int i6) {
            List list = this.f9862b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = (a) this.f9862b.get(size);
                if (aVar.f9863a == i6) {
                    return aVar;
                }
            }
            return null;
        }

        public int g(int i6) {
            int[] iArr = this.f9861a;
            if (iArr == null || i6 >= iArr.length) {
                return -1;
            }
            return iArr[i6];
        }

        public int h(int i6) {
            int[] iArr = this.f9861a;
            if (iArr == null || i6 >= iArr.length) {
                return -1;
            }
            int i7 = i(i6);
            if (i7 == -1) {
                int[] iArr2 = this.f9861a;
                Arrays.fill(iArr2, i6, iArr2.length, -1);
                return this.f9861a.length;
            }
            int min = Math.min(i7 + 1, this.f9861a.length);
            Arrays.fill(this.f9861a, i6, min, -1);
            return min;
        }

        public final int i(int i6) {
            if (this.f9862b == null) {
                return -1;
            }
            a f6 = f(i6);
            if (f6 != null) {
                this.f9862b.remove(f6);
            }
            int size = this.f9862b.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size) {
                    i7 = -1;
                    break;
                }
                if (((a) this.f9862b.get(i7)).f9863a >= i6) {
                    break;
                }
                i7++;
            }
            if (i7 == -1) {
                return -1;
            }
            a aVar = (a) this.f9862b.get(i7);
            this.f9862b.remove(i7);
            return aVar.f9863a;
        }

        public void j(int i6, int i7) {
            int[] iArr = this.f9861a;
            if (iArr == null || i6 >= iArr.length) {
                return;
            }
            int i8 = i6 + i7;
            c(i8);
            int[] iArr2 = this.f9861a;
            System.arraycopy(iArr2, i6, iArr2, i8, (iArr2.length - i6) - i7);
            Arrays.fill(this.f9861a, i6, i8, -1);
            l(i6, i7);
        }

        public void k(int i6, int i7) {
            int[] iArr = this.f9861a;
            if (iArr == null || i6 >= iArr.length) {
                return;
            }
            int i8 = i6 + i7;
            c(i8);
            int[] iArr2 = this.f9861a;
            System.arraycopy(iArr2, i8, iArr2, i6, (iArr2.length - i6) - i7);
            int[] iArr3 = this.f9861a;
            Arrays.fill(iArr3, iArr3.length - i7, iArr3.length, -1);
            m(i6, i7);
        }

        public final void l(int i6, int i7) {
            List list = this.f9862b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = (a) this.f9862b.get(size);
                int i8 = aVar.f9863a;
                if (i8 >= i6) {
                    aVar.f9863a = i8 + i7;
                }
            }
        }

        public final void m(int i6, int i7) {
            List list = this.f9862b;
            if (list == null) {
                return;
            }
            int i8 = i6 + i7;
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = (a) this.f9862b.get(size);
                int i9 = aVar.f9863a;
                if (i9 >= i6) {
                    if (i9 < i8) {
                        this.f9862b.remove(size);
                    } else {
                        aVar.f9863a = i9 - i7;
                    }
                }
            }
        }

        public void n(int i6, f fVar) {
            c(i6);
            this.f9861a[i6] = fVar.f9881e;
        }

        public int o(int i6) {
            int length = this.f9861a.length;
            while (length <= i6) {
                length *= 2;
            }
            return length;
        }

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0145a();

            /* renamed from: a, reason: collision with root package name */
            public int f9863a;

            /* renamed from: b, reason: collision with root package name */
            public int f9864b;

            /* renamed from: c, reason: collision with root package name */
            public int[] f9865c;

            /* renamed from: d, reason: collision with root package name */
            public boolean f9866d;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a, reason: collision with other inner class name */
            /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
            public class C0145a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public a createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public a[] newArray(int i6) {
                    return new a[i6];
                }
            }

            public a(Parcel parcel) {
                this.f9863a = parcel.readInt();
                this.f9864b = parcel.readInt();
                this.f9866d = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f9865c = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            public int a(int i6) {
                int[] iArr = this.f9865c;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i6];
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f9863a + ", mGapDir=" + this.f9864b + ", mHasUnwantedGapAfter=" + this.f9866d + ", mGapPerSpan=" + Arrays.toString(this.f9865c) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i6) {
                parcel.writeInt(this.f9863a);
                parcel.writeInt(this.f9864b);
                parcel.writeInt(this.f9866d ? 1 : 0);
                int[] iArr = this.f9865c;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f9865c);
                }
            }

            public a() {
            }
        }
    }
}
