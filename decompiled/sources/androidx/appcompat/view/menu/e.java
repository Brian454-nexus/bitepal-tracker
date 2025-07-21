package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.h;
import i.AbstractC1474g;
import k.AbstractC1653a;
import kotlin.io.ConstantsKt;
import r0.AbstractC2019a;
import z0.AbstractC2416b;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class e implements s0.b {

    /* renamed from: A, reason: collision with root package name */
    public View f7978A;

    /* renamed from: B, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f7979B;

    /* renamed from: D, reason: collision with root package name */
    public ContextMenu.ContextMenuInfo f7981D;

    /* renamed from: a, reason: collision with root package name */
    public final int f7982a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7983b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7984c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7985d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f7986e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f7987f;

    /* renamed from: g, reason: collision with root package name */
    public Intent f7988g;

    /* renamed from: h, reason: collision with root package name */
    public char f7989h;

    /* renamed from: j, reason: collision with root package name */
    public char f7991j;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f7993l;

    /* renamed from: n, reason: collision with root package name */
    public d f7995n;

    /* renamed from: o, reason: collision with root package name */
    public j f7996o;

    /* renamed from: p, reason: collision with root package name */
    public Runnable f7997p;

    /* renamed from: q, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f7998q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f7999r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f8000s;

    /* renamed from: z, reason: collision with root package name */
    public int f8007z;

    /* renamed from: i, reason: collision with root package name */
    public int f7990i = ConstantsKt.DEFAULT_BLOCK_SIZE;

    /* renamed from: k, reason: collision with root package name */
    public int f7992k = ConstantsKt.DEFAULT_BLOCK_SIZE;

    /* renamed from: m, reason: collision with root package name */
    public int f7994m = 0;

    /* renamed from: t, reason: collision with root package name */
    public ColorStateList f8001t = null;

    /* renamed from: u, reason: collision with root package name */
    public PorterDuff.Mode f8002u = null;

    /* renamed from: v, reason: collision with root package name */
    public boolean f8003v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f8004w = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f8005x = false;

    /* renamed from: y, reason: collision with root package name */
    public int f8006y = 16;

    /* renamed from: C, reason: collision with root package name */
    public boolean f7980C = false;

    public e(d dVar, int i6, int i7, int i8, int i9, CharSequence charSequence, int i10) {
        this.f7995n = dVar;
        this.f7982a = i7;
        this.f7983b = i6;
        this.f7984c = i8;
        this.f7985d = i9;
        this.f7986e = charSequence;
        this.f8007z = i10;
    }

    public static void b(StringBuilder sb, int i6, int i7, String str) {
        if ((i6 & i7) == i7) {
            sb.append(str);
        }
    }

    public boolean A() {
        return (this.f8007z & 4) == 4;
    }

    public void a() {
        this.f7995n.E(this);
    }

    public final Drawable c(Drawable drawable) {
        if (drawable != null && this.f8005x && (this.f8003v || this.f8004w)) {
            drawable = AbstractC2019a.j(drawable).mutate();
            if (this.f8003v) {
                AbstractC2019a.g(drawable, this.f8001t);
            }
            if (this.f8004w) {
                AbstractC2019a.h(drawable, this.f8002u);
            }
            this.f8005x = false;
        }
        return drawable;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f8007z & 8) == 0) {
            return false;
        }
        if (this.f7978A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f7979B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f7995n.e(this);
        }
        return false;
    }

    public int d() {
        return this.f7985d;
    }

    public char e() {
        return this.f7995n.C() ? this.f7991j : this.f7989h;
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        if (!i()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f7979B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f7995n.j(this);
        }
        return false;
    }

    public String f() {
        char e6 = e();
        if (e6 == 0) {
            return "";
        }
        Resources resources = this.f7995n.s().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f7995n.s()).hasPermanentMenuKey()) {
            sb.append(resources.getString(AbstractC1474g.f15454k));
        }
        int i6 = this.f7995n.C() ? this.f7992k : this.f7990i;
        b(sb, i6, 65536, resources.getString(AbstractC1474g.f15450g));
        b(sb, i6, ConstantsKt.DEFAULT_BLOCK_SIZE, resources.getString(AbstractC1474g.f15446c));
        b(sb, i6, 2, resources.getString(AbstractC1474g.f15445b));
        b(sb, i6, 1, resources.getString(AbstractC1474g.f15451h));
        b(sb, i6, 4, resources.getString(AbstractC1474g.f15453j));
        b(sb, i6, 8, resources.getString(AbstractC1474g.f15449f));
        if (e6 == '\b') {
            sb.append(resources.getString(AbstractC1474g.f15447d));
        } else if (e6 == '\n') {
            sb.append(resources.getString(AbstractC1474g.f15448e));
        } else if (e6 != ' ') {
            sb.append(e6);
        } else {
            sb.append(resources.getString(AbstractC1474g.f15452i));
        }
        return sb.toString();
    }

    public AbstractC2416b g() {
        return null;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View view = this.f7978A;
        if (view != null) {
            return view;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f7992k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f7991j;
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f7999r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f7983b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f7993l;
        if (drawable != null) {
            return c(drawable);
        }
        if (this.f7994m == 0) {
            return null;
        }
        Drawable b6 = AbstractC1653a.b(this.f7995n.s(), this.f7994m);
        this.f7994m = 0;
        this.f7993l = b6;
        return c(b6);
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f8001t;
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f8002u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f7988g;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f7982a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f7981D;
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f7990i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f7989h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f7984c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f7996o;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f7986e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f7987f;
        return charSequence != null ? charSequence : this.f7986e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f8000s;
    }

    public CharSequence h(h.a aVar) {
        return (aVar == null || !aVar.c()) ? getTitle() : getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f7996o != null;
    }

    public boolean i() {
        return ((this.f8007z & 8) == 0 || this.f7978A == null) ? false : true;
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f7980C;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f8006y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f8006y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f8006y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f8006y & 8) == 0;
    }

    public boolean j() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f7998q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        d dVar = this.f7995n;
        if (dVar.g(dVar, this)) {
            return true;
        }
        Runnable runnable = this.f7997p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f7988g == null) {
            return false;
        }
        try {
            this.f7995n.s().startActivity(this.f7988g);
            return true;
        } catch (ActivityNotFoundException e6) {
            Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e6);
            return false;
        }
    }

    public boolean k() {
        return (this.f8006y & 32) == 32;
    }

    public boolean l() {
        return (this.f8006y & 4) != 0;
    }

    public boolean m() {
        return (this.f8007z & 1) == 1;
    }

    public boolean n() {
        return (this.f8007z & 2) == 2;
    }

    @Override // android.view.MenuItem
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public s0.b setActionView(int i6) {
        Context s6 = this.f7995n.s();
        setActionView(LayoutInflater.from(s6).inflate(i6, (ViewGroup) new LinearLayout(s6), false));
        return this;
    }

    @Override // android.view.MenuItem
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public s0.b setActionView(View view) {
        int i6;
        this.f7978A = view;
        if (view != null && view.getId() == -1 && (i6 = this.f7982a) > 0) {
            view.setId(i6);
        }
        this.f7995n.E(this);
        return this;
    }

    public void q(boolean z6) {
        this.f7980C = z6;
        this.f7995n.G(false);
    }

    public void r(boolean z6) {
        int i6 = this.f8006y;
        int i7 = (z6 ? 2 : 0) | (i6 & (-3));
        this.f8006y = i7;
        if (i6 != i7) {
            this.f7995n.G(false);
        }
    }

    public void s(boolean z6) {
        this.f8006y = (z6 ? 4 : 0) | (this.f8006y & (-5));
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c6) {
        if (this.f7991j == c6) {
            return this;
        }
        this.f7991j = Character.toLowerCase(c6);
        this.f7995n.G(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z6) {
        int i6 = this.f8006y;
        int i7 = (z6 ? 1 : 0) | (i6 & (-2));
        this.f8006y = i7;
        if (i6 != i7) {
            this.f7995n.G(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z6) {
        if ((this.f8006y & 4) != 0) {
            this.f7995n.M(this);
            return this;
        }
        r(z6);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z6) {
        if (z6) {
            this.f8006y |= 16;
        } else {
            this.f8006y &= -17;
        }
        this.f7995n.G(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f7994m = 0;
        this.f7993l = drawable;
        this.f8005x = true;
        this.f7995n.G(false);
        return this;
    }

    @Override // s0.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f8001t = colorStateList;
        this.f8003v = true;
        this.f8005x = true;
        this.f7995n.G(false);
        return this;
    }

    @Override // s0.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f8002u = mode;
        this.f8004w = true;
        this.f8005x = true;
        this.f7995n.G(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f7988g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c6) {
        if (this.f7989h == c6) {
            return this;
        }
        this.f7989h = c6;
        this.f7995n.G(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f7979B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f7998q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c6, char c7) {
        this.f7989h = c6;
        this.f7991j = Character.toLowerCase(c7);
        this.f7995n.G(false);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i6) {
        int i7 = i6 & 3;
        if (i7 != 0 && i7 != 1 && i7 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f8007z = i6;
        this.f7995n.E(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f7986e = charSequence;
        this.f7995n.G(false);
        j jVar = this.f7996o;
        if (jVar != null) {
            jVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f7987f = charSequence;
        this.f7995n.G(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z6) {
        if (x(z6)) {
            this.f7995n.F(this);
        }
        return this;
    }

    public void t(boolean z6) {
        if (z6) {
            this.f8006y |= 32;
        } else {
            this.f8006y &= -33;
        }
    }

    public String toString() {
        CharSequence charSequence = this.f7986e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public void u(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f7981D = contextMenuInfo;
    }

    @Override // android.view.MenuItem
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public s0.b setShowAsActionFlags(int i6) {
        setShowAsAction(i6);
        return this;
    }

    public void w(j jVar) {
        this.f7996o = jVar;
        jVar.setHeaderTitle(getTitle());
    }

    public boolean x(boolean z6) {
        int i6 = this.f8006y;
        int i7 = (z6 ? 0 : 8) | (i6 & (-9));
        this.f8006y = i7;
        return i6 != i7;
    }

    public boolean y() {
        return this.f7995n.w();
    }

    public boolean z() {
        return this.f7995n.D() && e() != 0;
    }

    @Override // android.view.MenuItem
    public s0.b setContentDescription(CharSequence charSequence) {
        this.f7999r = charSequence;
        this.f7995n.G(false);
        return this;
    }

    @Override // android.view.MenuItem
    public s0.b setTooltipText(CharSequence charSequence) {
        this.f8000s = charSequence;
        this.f7995n.G(false);
        return this;
    }

    @Override // s0.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c6, int i6) {
        if (this.f7991j == c6 && this.f7992k == i6) {
            return this;
        }
        this.f7991j = Character.toLowerCase(c6);
        this.f7992k = KeyEvent.normalizeMetaState(i6);
        this.f7995n.G(false);
        return this;
    }

    @Override // s0.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c6, int i6) {
        if (this.f7989h == c6 && this.f7990i == i6) {
            return this;
        }
        this.f7989h = c6;
        this.f7990i = KeyEvent.normalizeMetaState(i6);
        this.f7995n.G(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c6, char c7, int i6, int i7) {
        this.f7989h = c6;
        this.f7990i = KeyEvent.normalizeMetaState(i6);
        this.f7991j = Character.toLowerCase(c7);
        this.f7992k = KeyEvent.normalizeMetaState(i7);
        this.f7995n.G(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i6) {
        this.f7993l = null;
        this.f7994m = i6;
        this.f8005x = true;
        this.f7995n.G(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i6) {
        return setTitle(this.f7995n.s().getString(i6));
    }
}
