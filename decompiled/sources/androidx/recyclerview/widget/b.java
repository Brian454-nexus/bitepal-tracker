package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import u2.InterfaceC2138d;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class b implements InterfaceC2138d {

    /* renamed from: a, reason: collision with root package name */
    public final RecyclerView.h f9895a;

    public b(RecyclerView.h hVar) {
        this.f9895a = hVar;
    }

    @Override // u2.InterfaceC2138d
    public void a(int i6, int i7) {
        this.f9895a.notifyItemMoved(i6, i7);
    }

    @Override // u2.InterfaceC2138d
    public void b(int i6, int i7) {
        this.f9895a.notifyItemRangeInserted(i6, i7);
    }

    @Override // u2.InterfaceC2138d
    public void c(int i6, int i7) {
        this.f9895a.notifyItemRangeRemoved(i6, i7);
    }

    @Override // u2.InterfaceC2138d
    public void d(int i6, int i7, Object obj) {
        this.f9895a.notifyItemRangeChanged(i6, i7, obj);
    }
}
