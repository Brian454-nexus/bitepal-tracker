package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.d;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class j extends d implements SubMenu {

    /* renamed from: B, reason: collision with root package name */
    public d f8044B;

    /* renamed from: C, reason: collision with root package name */
    public e f8045C;

    public j(Context context, d dVar, e eVar) {
        super(context);
        this.f8044B = dVar;
        this.f8045C = eVar;
    }

    @Override // androidx.appcompat.view.menu.d
    public boolean B() {
        return this.f8044B.B();
    }

    @Override // androidx.appcompat.view.menu.d
    public boolean C() {
        return this.f8044B.C();
    }

    @Override // androidx.appcompat.view.menu.d
    public boolean D() {
        return this.f8044B.D();
    }

    @Override // androidx.appcompat.view.menu.d
    public void L(d.a aVar) {
        this.f8044B.L(aVar);
    }

    public Menu W() {
        return this.f8044B;
    }

    @Override // androidx.appcompat.view.menu.d
    public boolean e(e eVar) {
        return this.f8044B.e(eVar);
    }

    @Override // androidx.appcompat.view.menu.d
    public boolean g(d dVar, MenuItem menuItem) {
        return super.g(dVar, menuItem) || this.f8044B.g(dVar, menuItem);
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.f8045C;
    }

    @Override // androidx.appcompat.view.menu.d
    public boolean j(e eVar) {
        return this.f8044B.j(eVar);
    }

    @Override // androidx.appcompat.view.menu.d, android.view.Menu
    public void setGroupDividerEnabled(boolean z6) {
        this.f8044B.setGroupDividerEnabled(z6);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.O(drawable);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.R(charSequence);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.S(view);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f8045C.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.d, android.view.Menu
    public void setQwertyMode(boolean z6) {
        this.f8044B.setQwertyMode(z6);
    }

    @Override // androidx.appcompat.view.menu.d
    public d z() {
        return this.f8044B.z();
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i6) {
        return (SubMenu) super.N(i6);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i6) {
        return (SubMenu) super.Q(i6);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i6) {
        this.f8045C.setIcon(i6);
        return this;
    }
}
