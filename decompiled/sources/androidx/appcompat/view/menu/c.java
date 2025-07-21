package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.h;
import java.util.ArrayList;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class c extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public d f7945a;

    /* renamed from: b, reason: collision with root package name */
    public int f7946b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7947c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f7948d;

    /* renamed from: e, reason: collision with root package name */
    public final LayoutInflater f7949e;

    /* renamed from: f, reason: collision with root package name */
    public final int f7950f;

    public c(d dVar, LayoutInflater layoutInflater, boolean z6, int i6) {
        this.f7948d = z6;
        this.f7949e = layoutInflater;
        this.f7945a = dVar;
        this.f7950f = i6;
        a();
    }

    public void a() {
        e t6 = this.f7945a.t();
        if (t6 != null) {
            ArrayList v6 = this.f7945a.v();
            int size = v6.size();
            for (int i6 = 0; i6 < size; i6++) {
                if (((e) v6.get(i6)) == t6) {
                    this.f7946b = i6;
                    return;
                }
            }
        }
        this.f7946b = -1;
    }

    public d b() {
        return this.f7945a;
    }

    @Override // android.widget.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public e getItem(int i6) {
        ArrayList v6 = this.f7948d ? this.f7945a.v() : this.f7945a.A();
        int i7 = this.f7946b;
        if (i7 >= 0 && i6 >= i7) {
            i6++;
        }
        return (e) v6.get(i6);
    }

    public void d(boolean z6) {
        this.f7947c = z6;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f7946b < 0 ? (this.f7948d ? this.f7945a.v() : this.f7945a.A()).size() : r0.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i6) {
        return i6;
    }

    @Override // android.widget.Adapter
    public View getView(int i6, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f7949e.inflate(this.f7950f, viewGroup, false);
        }
        int groupId = getItem(i6).getGroupId();
        int i7 = i6 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f7945a.B() && groupId != (i7 >= 0 ? getItem(i7).getGroupId() : groupId));
        h.a aVar = (h.a) view;
        if (this.f7947c) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.d(getItem(i6), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
