package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import i.AbstractC1468a;
import i.AbstractC1471d;
import i.AbstractC1474g;
import i.AbstractC1476i;
import k.AbstractC1653a;
import p.C1885a;
import q.InterfaceC1994s;
import q.S;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class d implements InterfaceC1994s {

    /* renamed from: a, reason: collision with root package name */
    public Toolbar f8341a;

    /* renamed from: b, reason: collision with root package name */
    public int f8342b;

    /* renamed from: c, reason: collision with root package name */
    public View f8343c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f8344d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f8345e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f8346f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8347g;

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f8348h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f8349i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f8350j;

    /* renamed from: k, reason: collision with root package name */
    public Window.Callback f8351k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f8352l;

    /* renamed from: m, reason: collision with root package name */
    public int f8353m;

    /* renamed from: n, reason: collision with root package name */
    public int f8354n;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f8355o;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final C1885a f8356a;

        public a() {
            this.f8356a = new C1885a(d.this.f8341a.getContext(), 0, R.id.home, 0, 0, d.this.f8348h);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d dVar = d.this;
            Window.Callback callback = dVar.f8351k;
            if (callback == null || !dVar.f8352l) {
                return;
            }
            callback.onMenuItemSelected(0, this.f8356a);
        }
    }

    public d(Toolbar toolbar, boolean z6) {
        this(toolbar, z6, AbstractC1474g.f15444a, AbstractC1471d.f15392n);
    }

    @Override // q.InterfaceC1994s
    public void a(CharSequence charSequence) {
        if (this.f8347g) {
            return;
        }
        o(charSequence);
    }

    @Override // q.InterfaceC1994s
    public void b(int i6) {
        i(i6 != 0 ? AbstractC1653a.b(e(), i6) : null);
    }

    @Override // q.InterfaceC1994s
    public void c(Window.Callback callback) {
        this.f8351k = callback;
    }

    public final int d() {
        if (this.f8341a.getNavigationIcon() == null) {
            return 11;
        }
        this.f8355o = this.f8341a.getNavigationIcon();
        return 15;
    }

    public Context e() {
        return this.f8341a.getContext();
    }

    public void f(View view) {
        View view2 = this.f8343c;
        if (view2 != null && (this.f8342b & 16) != 0) {
            this.f8341a.removeView(view2);
        }
        this.f8343c = view;
        if (view == null || (this.f8342b & 16) == 0) {
            return;
        }
        this.f8341a.addView(view);
    }

    public void g(int i6) {
        if (i6 == this.f8354n) {
            return;
        }
        this.f8354n = i6;
        if (TextUtils.isEmpty(this.f8341a.getNavigationContentDescription())) {
            j(this.f8354n);
        }
    }

    @Override // q.InterfaceC1994s
    public CharSequence getTitle() {
        return this.f8341a.getTitle();
    }

    public void h(int i6) {
        View view;
        int i7 = this.f8342b ^ i6;
        this.f8342b = i6;
        if (i7 != 0) {
            if ((i7 & 4) != 0) {
                if ((i6 & 4) != 0) {
                    p();
                }
                q();
            }
            if ((i7 & 3) != 0) {
                r();
            }
            if ((i7 & 8) != 0) {
                if ((i6 & 8) != 0) {
                    this.f8341a.setTitle(this.f8348h);
                    this.f8341a.setSubtitle(this.f8349i);
                } else {
                    this.f8341a.setTitle((CharSequence) null);
                    this.f8341a.setSubtitle((CharSequence) null);
                }
            }
            if ((i7 & 16) == 0 || (view = this.f8343c) == null) {
                return;
            }
            if ((i6 & 16) != 0) {
                this.f8341a.addView(view);
            } else {
                this.f8341a.removeView(view);
            }
        }
    }

    public void i(Drawable drawable) {
        this.f8345e = drawable;
        r();
    }

    public void j(int i6) {
        k(i6 == 0 ? null : e().getString(i6));
    }

    public void k(CharSequence charSequence) {
        this.f8350j = charSequence;
        p();
    }

    public void l(Drawable drawable) {
        this.f8346f = drawable;
        q();
    }

    public void m(CharSequence charSequence) {
        this.f8349i = charSequence;
        if ((this.f8342b & 8) != 0) {
            this.f8341a.setSubtitle(charSequence);
        }
    }

    public void n(CharSequence charSequence) {
        this.f8347g = true;
        o(charSequence);
    }

    public final void o(CharSequence charSequence) {
        this.f8348h = charSequence;
        if ((this.f8342b & 8) != 0) {
            this.f8341a.setTitle(charSequence);
        }
    }

    public final void p() {
        if ((this.f8342b & 4) != 0) {
            if (TextUtils.isEmpty(this.f8350j)) {
                this.f8341a.setNavigationContentDescription(this.f8354n);
            } else {
                this.f8341a.setNavigationContentDescription(this.f8350j);
            }
        }
    }

    public final void q() {
        if ((this.f8342b & 4) == 0) {
            this.f8341a.setNavigationIcon((Drawable) null);
            return;
        }
        Toolbar toolbar = this.f8341a;
        Drawable drawable = this.f8346f;
        if (drawable == null) {
            drawable = this.f8355o;
        }
        toolbar.setNavigationIcon(drawable);
    }

    public final void r() {
        Drawable drawable;
        int i6 = this.f8342b;
        if ((i6 & 2) == 0) {
            drawable = null;
        } else if ((i6 & 1) != 0) {
            drawable = this.f8345e;
            if (drawable == null) {
                drawable = this.f8344d;
            }
        } else {
            drawable = this.f8344d;
        }
        this.f8341a.setLogo(drawable);
    }

    @Override // q.InterfaceC1994s
    public void setIcon(int i6) {
        setIcon(i6 != 0 ? AbstractC1653a.b(e(), i6) : null);
    }

    public d(Toolbar toolbar, boolean z6, int i6, int i7) {
        Drawable drawable;
        this.f8353m = 0;
        this.f8354n = 0;
        this.f8341a = toolbar;
        this.f8348h = toolbar.getTitle();
        this.f8349i = toolbar.getSubtitle();
        this.f8347g = this.f8348h != null;
        this.f8346f = toolbar.getNavigationIcon();
        S r6 = S.r(toolbar.getContext(), null, AbstractC1476i.f15561a, AbstractC1468a.f15329c, 0);
        this.f8355o = r6.f(AbstractC1476i.f15606j);
        if (z6) {
            CharSequence n6 = r6.n(AbstractC1476i.f15631p);
            if (!TextUtils.isEmpty(n6)) {
                n(n6);
            }
            CharSequence n7 = r6.n(AbstractC1476i.f15623n);
            if (!TextUtils.isEmpty(n7)) {
                m(n7);
            }
            Drawable f6 = r6.f(AbstractC1476i.f15615l);
            if (f6 != null) {
                i(f6);
            }
            Drawable f7 = r6.f(AbstractC1476i.f15611k);
            if (f7 != null) {
                setIcon(f7);
            }
            if (this.f8346f == null && (drawable = this.f8355o) != null) {
                l(drawable);
            }
            h(r6.i(AbstractC1476i.f15596h, 0));
            int l6 = r6.l(AbstractC1476i.f15591g, 0);
            if (l6 != 0) {
                f(LayoutInflater.from(this.f8341a.getContext()).inflate(l6, (ViewGroup) this.f8341a, false));
                h(this.f8342b | 16);
            }
            int k6 = r6.k(AbstractC1476i.f15601i, 0);
            if (k6 > 0) {
                ViewGroup.LayoutParams layoutParams = this.f8341a.getLayoutParams();
                layoutParams.height = k6;
                this.f8341a.setLayoutParams(layoutParams);
            }
            int d6 = r6.d(AbstractC1476i.f15586f, -1);
            int d7 = r6.d(AbstractC1476i.f15581e, -1);
            if (d6 >= 0 || d7 >= 0) {
                this.f8341a.C(Math.max(d6, 0), Math.max(d7, 0));
            }
            int l7 = r6.l(AbstractC1476i.f15635q, 0);
            if (l7 != 0) {
                Toolbar toolbar2 = this.f8341a;
                toolbar2.E(toolbar2.getContext(), l7);
            }
            int l8 = r6.l(AbstractC1476i.f15627o, 0);
            if (l8 != 0) {
                Toolbar toolbar3 = this.f8341a;
                toolbar3.D(toolbar3.getContext(), l8);
            }
            int l9 = r6.l(AbstractC1476i.f15619m, 0);
            if (l9 != 0) {
                this.f8341a.setPopupTheme(l9);
            }
        } else {
            this.f8342b = d();
        }
        r6.s();
        g(i6);
        this.f8350j = this.f8341a.getNavigationContentDescription();
        this.f8341a.setNavigationOnClickListener(new a());
    }

    @Override // q.InterfaceC1994s
    public void setIcon(Drawable drawable) {
        this.f8344d = drawable;
        r();
    }
}
