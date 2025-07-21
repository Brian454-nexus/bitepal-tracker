package p;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import kotlin.io.ConstantsKt;
import n0.AbstractC1809a;
import r0.AbstractC2019a;

/* renamed from: p.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C1885a implements s0.b {

    /* renamed from: a, reason: collision with root package name */
    public final int f18048a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18049b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18050c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18051d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f18052e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f18053f;

    /* renamed from: g, reason: collision with root package name */
    public Intent f18054g;

    /* renamed from: h, reason: collision with root package name */
    public char f18055h;

    /* renamed from: j, reason: collision with root package name */
    public char f18057j;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f18059l;

    /* renamed from: n, reason: collision with root package name */
    public Context f18061n;

    /* renamed from: o, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f18062o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f18063p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f18064q;

    /* renamed from: i, reason: collision with root package name */
    public int f18056i = ConstantsKt.DEFAULT_BLOCK_SIZE;

    /* renamed from: k, reason: collision with root package name */
    public int f18058k = ConstantsKt.DEFAULT_BLOCK_SIZE;

    /* renamed from: m, reason: collision with root package name */
    public int f18060m = 0;

    /* renamed from: r, reason: collision with root package name */
    public ColorStateList f18065r = null;

    /* renamed from: s, reason: collision with root package name */
    public PorterDuff.Mode f18066s = null;

    /* renamed from: t, reason: collision with root package name */
    public boolean f18067t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f18068u = false;

    /* renamed from: v, reason: collision with root package name */
    public int f18069v = 16;

    public C1885a(Context context, int i6, int i7, int i8, int i9, CharSequence charSequence) {
        this.f18061n = context;
        this.f18048a = i7;
        this.f18049b = i6;
        this.f18050c = i8;
        this.f18051d = i9;
        this.f18052e = charSequence;
    }

    public final void a() {
        Drawable drawable = this.f18059l;
        if (drawable != null) {
            if (this.f18067t || this.f18068u) {
                Drawable j6 = AbstractC2019a.j(drawable);
                this.f18059l = j6;
                Drawable mutate = j6.mutate();
                this.f18059l = mutate;
                if (this.f18067t) {
                    AbstractC2019a.g(mutate, this.f18065r);
                }
                if (this.f18068u) {
                    AbstractC2019a.h(this.f18059l, this.f18066s);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public s0.b setActionView(int i6) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public s0.b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public s0.b setShowAsActionFlags(int i6) {
        setShowAsAction(i6);
        return this;
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f18058k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f18057j;
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f18063p;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f18049b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f18059l;
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f18065r;
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f18066s;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f18054g;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f18048a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f18056i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f18055h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f18051d;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f18052e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f18053f;
        return charSequence != null ? charSequence : this.f18052e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f18064q;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f18069v & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f18069v & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f18069v & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f18069v & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c6) {
        this.f18057j = Character.toLowerCase(c6);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z6) {
        this.f18069v = (z6 ? 1 : 0) | (this.f18069v & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z6) {
        this.f18069v = (z6 ? 2 : 0) | (this.f18069v & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z6) {
        this.f18069v = (z6 ? 16 : 0) | (this.f18069v & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f18059l = drawable;
        this.f18060m = 0;
        a();
        return this;
    }

    @Override // s0.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f18065r = colorStateList;
        this.f18067t = true;
        a();
        return this;
    }

    @Override // s0.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f18066s = mode;
        this.f18068u = true;
        a();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f18054g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c6) {
        this.f18055h = c6;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f18062o = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c6, char c7) {
        this.f18055h = c6;
        this.f18057j = Character.toLowerCase(c7);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i6) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f18052e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f18053f = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z6) {
        this.f18069v = (this.f18069v & 8) | (z6 ? 0 : 8);
        return this;
    }

    @Override // s0.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c6, int i6) {
        this.f18057j = Character.toLowerCase(c6);
        this.f18058k = KeyEvent.normalizeMetaState(i6);
        return this;
    }

    @Override // android.view.MenuItem
    public s0.b setContentDescription(CharSequence charSequence) {
        this.f18063p = charSequence;
        return this;
    }

    @Override // s0.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c6, int i6) {
        this.f18055h = c6;
        this.f18056i = KeyEvent.normalizeMetaState(i6);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i6) {
        this.f18052e = this.f18061n.getResources().getString(i6);
        return this;
    }

    @Override // android.view.MenuItem
    public s0.b setTooltipText(CharSequence charSequence) {
        this.f18064q = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c6, char c7, int i6, int i7) {
        this.f18055h = c6;
        this.f18056i = KeyEvent.normalizeMetaState(i6);
        this.f18057j = Character.toLowerCase(c7);
        this.f18058k = KeyEvent.normalizeMetaState(i7);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i6) {
        this.f18060m = i6;
        this.f18059l = AbstractC1809a.getDrawable(this.f18061n, i6);
        a();
        return this;
    }
}
