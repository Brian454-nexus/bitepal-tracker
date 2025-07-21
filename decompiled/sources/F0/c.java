package F0;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class c extends a {

    /* renamed from: i, reason: collision with root package name */
    public int f1554i;

    /* renamed from: j, reason: collision with root package name */
    public int f1555j;

    /* renamed from: k, reason: collision with root package name */
    public LayoutInflater f1556k;

    public c(Context context, int i6, Cursor cursor, boolean z6) {
        super(context, cursor, z6);
        this.f1555j = i6;
        this.f1554i = i6;
        this.f1556k = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // F0.a
    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f1556k.inflate(this.f1555j, viewGroup, false);
    }

    @Override // F0.a
    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f1556k.inflate(this.f1554i, viewGroup, false);
    }
}
