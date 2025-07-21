package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.h;
import java.util.ArrayList;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class a implements g {

    /* renamed from: a, reason: collision with root package name */
    public Context f7899a;

    /* renamed from: b, reason: collision with root package name */
    public Context f7900b;

    /* renamed from: c, reason: collision with root package name */
    public d f7901c;

    /* renamed from: d, reason: collision with root package name */
    public LayoutInflater f7902d;

    /* renamed from: e, reason: collision with root package name */
    public LayoutInflater f7903e;

    /* renamed from: f, reason: collision with root package name */
    public g.a f7904f;

    /* renamed from: g, reason: collision with root package name */
    public int f7905g;

    /* renamed from: h, reason: collision with root package name */
    public int f7906h;

    /* renamed from: i, reason: collision with root package name */
    public h f7907i;

    public a(Context context, int i6, int i7) {
        this.f7899a = context;
        this.f7902d = LayoutInflater.from(context);
        this.f7905g = i6;
        this.f7906h = i7;
    }

    public void a(View view, int i6) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f7907i).addView(view, i6);
    }

    @Override // androidx.appcompat.view.menu.g
    public void b(d dVar, boolean z6) {
        g.a aVar = this.f7904f;
        if (aVar != null) {
            aVar.b(dVar, z6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.g
    public void c(boolean z6) {
        ViewGroup viewGroup = (ViewGroup) this.f7907i;
        if (viewGroup == null) {
            return;
        }
        d dVar = this.f7901c;
        int i6 = 0;
        if (dVar != null) {
            dVar.q();
            ArrayList A6 = this.f7901c.A();
            int size = A6.size();
            int i7 = 0;
            for (int i8 = 0; i8 < size; i8++) {
                e eVar = (e) A6.get(i8);
                if (o(i7, eVar)) {
                    View childAt = viewGroup.getChildAt(i7);
                    e itemData = childAt instanceof h.a ? ((h.a) childAt).getItemData() : null;
                    View n6 = n(eVar, childAt, viewGroup);
                    if (eVar != itemData) {
                        n6.setPressed(false);
                        n6.jumpDrawablesToCurrentState();
                    }
                    if (n6 != childAt) {
                        a(n6, i7);
                    }
                    i7++;
                }
            }
            i6 = i7;
        }
        while (i6 < viewGroup.getChildCount()) {
            if (!l(viewGroup, i6)) {
                i6++;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.g
    public boolean e(d dVar, e eVar) {
        return false;
    }

    public abstract void f(e eVar, h.a aVar);

    @Override // androidx.appcompat.view.menu.g
    public boolean g(d dVar, e eVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.g
    public void h(g.a aVar) {
        this.f7904f = aVar;
    }

    @Override // androidx.appcompat.view.menu.g
    public void i(Context context, d dVar) {
        this.f7900b = context;
        this.f7903e = LayoutInflater.from(context);
        this.f7901c = dVar;
    }

    public h.a j(ViewGroup viewGroup) {
        return (h.a) this.f7902d.inflate(this.f7906h, viewGroup, false);
    }

    @Override // androidx.appcompat.view.menu.g
    public boolean k(j jVar) {
        g.a aVar = this.f7904f;
        if (aVar != null) {
            return aVar.c(jVar);
        }
        return false;
    }

    public boolean l(ViewGroup viewGroup, int i6) {
        viewGroup.removeViewAt(i6);
        return true;
    }

    public g.a m() {
        return this.f7904f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View n(e eVar, View view, ViewGroup viewGroup) {
        h.a j6 = view instanceof h.a ? (h.a) view : j(viewGroup);
        f(eVar, j6);
        return (View) j6;
    }

    public abstract boolean o(int i6, e eVar);
}
