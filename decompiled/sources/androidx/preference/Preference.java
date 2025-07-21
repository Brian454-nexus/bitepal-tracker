package androidx.preference;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import java.util.List;
import kotlin.jvm.internal.IntCompanionObject;
import n2.AbstractC1814a;
import n2.AbstractC1815b;
import n2.AbstractC1816c;
import n2.AbstractC1818e;
import n2.AbstractC1820g;
import p0.AbstractC1895i;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class Preference implements Comparable<Preference> {

    /* renamed from: A, reason: collision with root package name */
    public List f9506A;

    /* renamed from: B, reason: collision with root package name */
    public b f9507B;

    /* renamed from: C, reason: collision with root package name */
    public final View.OnClickListener f9508C;

    /* renamed from: a, reason: collision with root package name */
    public final Context f9509a;

    /* renamed from: b, reason: collision with root package name */
    public int f9510b;

    /* renamed from: c, reason: collision with root package name */
    public int f9511c;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f9512d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f9513e;

    /* renamed from: f, reason: collision with root package name */
    public int f9514f;

    /* renamed from: g, reason: collision with root package name */
    public String f9515g;

    /* renamed from: h, reason: collision with root package name */
    public Intent f9516h;

    /* renamed from: i, reason: collision with root package name */
    public String f9517i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f9518j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f9519k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f9520l;

    /* renamed from: m, reason: collision with root package name */
    public String f9521m;

    /* renamed from: n, reason: collision with root package name */
    public Object f9522n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f9523o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f9524p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f9525q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f9526r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f9527s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f9528t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f9529u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f9530v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f9531w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f9532x;

    /* renamed from: y, reason: collision with root package name */
    public int f9533y;

    /* renamed from: z, reason: collision with root package name */
    public int f9534z;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Preference.this.y(view);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface b {
        CharSequence a(Preference preference);
    }

    public Preference(Context context, AttributeSet attributeSet, int i6, int i7) {
        this.f9510b = IntCompanionObject.MAX_VALUE;
        this.f9511c = 0;
        this.f9518j = true;
        this.f9519k = true;
        this.f9520l = true;
        this.f9523o = true;
        this.f9524p = true;
        this.f9525q = true;
        this.f9526r = true;
        this.f9527s = true;
        this.f9529u = true;
        this.f9532x = true;
        int i8 = AbstractC1818e.f17631a;
        this.f9533y = i8;
        this.f9508C = new a();
        this.f9509a = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1820g.f17649I, i6, i7);
        this.f9514f = AbstractC1895i.e(obtainStyledAttributes, AbstractC1820g.f17703g0, AbstractC1820g.f17651J, 0);
        this.f9515g = AbstractC1895i.f(obtainStyledAttributes, AbstractC1820g.f17709j0, AbstractC1820g.f17663P);
        this.f9512d = AbstractC1895i.g(obtainStyledAttributes, AbstractC1820g.f17725r0, AbstractC1820g.f17659N);
        this.f9513e = AbstractC1895i.g(obtainStyledAttributes, AbstractC1820g.f17723q0, AbstractC1820g.f17665Q);
        this.f9510b = AbstractC1895i.d(obtainStyledAttributes, AbstractC1820g.f17713l0, AbstractC1820g.f17667R, IntCompanionObject.MAX_VALUE);
        this.f9517i = AbstractC1895i.f(obtainStyledAttributes, AbstractC1820g.f17701f0, AbstractC1820g.f17677W);
        this.f9533y = AbstractC1895i.e(obtainStyledAttributes, AbstractC1820g.f17711k0, AbstractC1820g.f17657M, i8);
        this.f9534z = AbstractC1895i.e(obtainStyledAttributes, AbstractC1820g.f17727s0, AbstractC1820g.f17669S, 0);
        this.f9518j = AbstractC1895i.b(obtainStyledAttributes, AbstractC1820g.f17698e0, AbstractC1820g.f17655L, true);
        this.f9519k = AbstractC1895i.b(obtainStyledAttributes, AbstractC1820g.f17717n0, AbstractC1820g.f17661O, true);
        this.f9520l = AbstractC1895i.b(obtainStyledAttributes, AbstractC1820g.f17715m0, AbstractC1820g.f17653K, true);
        this.f9521m = AbstractC1895i.f(obtainStyledAttributes, AbstractC1820g.f17692c0, AbstractC1820g.f17671T);
        int i9 = AbstractC1820g.f17683Z;
        this.f9526r = AbstractC1895i.b(obtainStyledAttributes, i9, i9, this.f9519k);
        int i10 = AbstractC1820g.f17686a0;
        this.f9527s = AbstractC1895i.b(obtainStyledAttributes, i10, i10, this.f9519k);
        int i11 = AbstractC1820g.f17689b0;
        if (obtainStyledAttributes.hasValue(i11)) {
            this.f9522n = v(obtainStyledAttributes, i11);
        } else {
            int i12 = AbstractC1820g.f17673U;
            if (obtainStyledAttributes.hasValue(i12)) {
                this.f9522n = v(obtainStyledAttributes, i12);
            }
        }
        this.f9532x = AbstractC1895i.b(obtainStyledAttributes, AbstractC1820g.f17719o0, AbstractC1820g.f17675V, true);
        int i13 = AbstractC1820g.f17721p0;
        boolean hasValue = obtainStyledAttributes.hasValue(i13);
        this.f9528t = hasValue;
        if (hasValue) {
            this.f9529u = AbstractC1895i.b(obtainStyledAttributes, i13, AbstractC1820g.f17679X, true);
        }
        this.f9530v = AbstractC1895i.b(obtainStyledAttributes, AbstractC1820g.f17705h0, AbstractC1820g.f17681Y, false);
        int i14 = AbstractC1820g.f17707i0;
        this.f9525q = AbstractC1895i.b(obtainStyledAttributes, i14, i14, true);
        int i15 = AbstractC1820g.f17695d0;
        this.f9531w = AbstractC1895i.b(obtainStyledAttributes, i15, i15, false);
        obtainStyledAttributes.recycle();
    }

    public boolean A(int i6) {
        if (!E()) {
            return false;
        }
        if (i6 == h(~i6)) {
            return true;
        }
        j();
        Object obj = null;
        obj.getClass();
        throw null;
    }

    public boolean B(String str) {
        if (!E()) {
            return false;
        }
        Object obj = null;
        if (TextUtils.equals(str, i(null))) {
            return true;
        }
        j();
        obj.getClass();
        throw null;
    }

    public final void C(b bVar) {
        this.f9507B = bVar;
        r();
    }

    public boolean D() {
        return !p();
    }

    public boolean E() {
        return false;
    }

    public boolean a(Object obj) {
        return true;
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(Preference preference) {
        int i6 = this.f9510b;
        int i7 = preference.f9510b;
        if (i6 != i7) {
            return i6 - i7;
        }
        CharSequence charSequence = this.f9512d;
        CharSequence charSequence2 = preference.f9512d;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.f9512d.toString());
    }

    public Context c() {
        return this.f9509a;
    }

    public StringBuilder d() {
        StringBuilder sb = new StringBuilder();
        CharSequence n6 = n();
        if (!TextUtils.isEmpty(n6)) {
            sb.append(n6);
            sb.append(' ');
        }
        CharSequence l6 = l();
        if (!TextUtils.isEmpty(l6)) {
            sb.append(l6);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb;
    }

    public String e() {
        return this.f9517i;
    }

    public Intent f() {
        return this.f9516h;
    }

    public boolean g(boolean z6) {
        if (!E()) {
            return z6;
        }
        j();
        Object obj = null;
        obj.getClass();
        throw null;
    }

    public int h(int i6) {
        if (!E()) {
            return i6;
        }
        j();
        Object obj = null;
        obj.getClass();
        throw null;
    }

    public String i(String str) {
        if (!E()) {
            return str;
        }
        j();
        Object obj = null;
        obj.getClass();
        throw null;
    }

    public AbstractC1814a j() {
        return null;
    }

    public AbstractC1815b k() {
        return null;
    }

    public CharSequence l() {
        return m() != null ? m().a(this) : this.f9513e;
    }

    public final b m() {
        return this.f9507B;
    }

    public CharSequence n() {
        return this.f9512d;
    }

    public boolean o() {
        return !TextUtils.isEmpty(this.f9515g);
    }

    public boolean p() {
        return this.f9518j && this.f9523o && this.f9524p;
    }

    public boolean q() {
        return this.f9519k;
    }

    public void r() {
    }

    public void s(boolean z6) {
        List list = this.f9506A;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((Preference) list.get(i6)).u(this, z6);
        }
    }

    public void t() {
    }

    public String toString() {
        return d().toString();
    }

    public void u(Preference preference, boolean z6) {
        if (this.f9523o == z6) {
            this.f9523o = !z6;
            s(D());
            r();
        }
    }

    public Object v(TypedArray typedArray, int i6) {
        return null;
    }

    public void w(Preference preference, boolean z6) {
        if (this.f9524p == z6) {
            this.f9524p = !z6;
            s(D());
            r();
        }
    }

    public void x() {
        if (p() && q()) {
            t();
            k();
            if (this.f9516h != null) {
                c().startActivity(this.f9516h);
            }
        }
    }

    public void y(View view) {
        x();
    }

    public boolean z(boolean z6) {
        if (!E()) {
            return false;
        }
        if (z6 == g(!z6)) {
            return true;
        }
        j();
        Object obj = null;
        obj.getClass();
        throw null;
    }

    public Preference(Context context, AttributeSet attributeSet, int i6) {
        this(context, attributeSet, i6, 0);
    }

    public Preference(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1895i.a(context, AbstractC1816c.f17626g, R.attr.preferenceStyle));
    }
}
