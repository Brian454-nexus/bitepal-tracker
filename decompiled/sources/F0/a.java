package F0;

import F0.b;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1543a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1544b;

    /* renamed from: c, reason: collision with root package name */
    public Cursor f1545c;

    /* renamed from: d, reason: collision with root package name */
    public Context f1546d;

    /* renamed from: e, reason: collision with root package name */
    public int f1547e;

    /* renamed from: f, reason: collision with root package name */
    public C0028a f1548f;

    /* renamed from: g, reason: collision with root package name */
    public DataSetObserver f1549g;

    /* renamed from: h, reason: collision with root package name */
    public F0.b f1550h;

    /* renamed from: F0.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class C0028a extends ContentObserver {
        public C0028a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z6) {
            a.this.i();
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class b extends DataSetObserver {
        public b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            a aVar = a.this;
            aVar.f1543a = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            a aVar = a.this;
            aVar.f1543a = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z6) {
        f(context, cursor, z6 ? 1 : 2);
    }

    @Override // F0.b.a
    public void a(Cursor cursor) {
        Cursor j6 = j(cursor);
        if (j6 != null) {
            j6.close();
        }
    }

    @Override // F0.b.a
    public Cursor b() {
        return this.f1545c;
    }

    @Override // F0.b.a
    public abstract CharSequence c(Cursor cursor);

    public abstract void e(View view, Context context, Cursor cursor);

    public void f(Context context, Cursor cursor, int i6) {
        if ((i6 & 1) == 1) {
            i6 |= 2;
            this.f1544b = true;
        } else {
            this.f1544b = false;
        }
        boolean z6 = cursor != null;
        this.f1545c = cursor;
        this.f1543a = z6;
        this.f1546d = context;
        this.f1547e = z6 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i6 & 2) == 2) {
            this.f1548f = new C0028a();
            this.f1549g = new b();
        } else {
            this.f1548f = null;
            this.f1549g = null;
        }
        if (z6) {
            C0028a c0028a = this.f1548f;
            if (c0028a != null) {
                cursor.registerContentObserver(c0028a);
            }
            DataSetObserver dataSetObserver = this.f1549g;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract View g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f1543a || (cursor = this.f1545c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i6, View view, ViewGroup viewGroup) {
        if (!this.f1543a) {
            return null;
        }
        this.f1545c.moveToPosition(i6);
        if (view == null) {
            view = g(this.f1546d, this.f1545c, viewGroup);
        }
        e(view, this.f1546d, this.f1545c);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f1550h == null) {
            this.f1550h = new F0.b(this);
        }
        return this.f1550h;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i6) {
        Cursor cursor;
        if (!this.f1543a || (cursor = this.f1545c) == null) {
            return null;
        }
        cursor.moveToPosition(i6);
        return this.f1545c;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i6) {
        Cursor cursor;
        if (this.f1543a && (cursor = this.f1545c) != null && cursor.moveToPosition(i6)) {
            return this.f1545c.getLong(this.f1547e);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i6, View view, ViewGroup viewGroup) {
        if (!this.f1543a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (this.f1545c.moveToPosition(i6)) {
            if (view == null) {
                view = h(this.f1546d, this.f1545c, viewGroup);
            }
            e(view, this.f1546d, this.f1545c);
            return view;
        }
        throw new IllegalStateException("couldn't move cursor to position " + i6);
    }

    public abstract View h(Context context, Cursor cursor, ViewGroup viewGroup);

    public void i() {
        Cursor cursor;
        if (!this.f1544b || (cursor = this.f1545c) == null || cursor.isClosed()) {
            return;
        }
        this.f1543a = this.f1545c.requery();
    }

    public Cursor j(Cursor cursor) {
        Cursor cursor2 = this.f1545c;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0028a c0028a = this.f1548f;
            if (c0028a != null) {
                cursor2.unregisterContentObserver(c0028a);
            }
            DataSetObserver dataSetObserver = this.f1549g;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1545c = cursor;
        if (cursor == null) {
            this.f1547e = -1;
            this.f1543a = false;
            notifyDataSetInvalidated();
            return cursor2;
        }
        C0028a c0028a2 = this.f1548f;
        if (c0028a2 != null) {
            cursor.registerContentObserver(c0028a2);
        }
        DataSetObserver dataSetObserver2 = this.f1549g;
        if (dataSetObserver2 != null) {
            cursor.registerDataSetObserver(dataSetObserver2);
        }
        this.f1547e = cursor.getColumnIndexOrThrow("_id");
        this.f1543a = true;
        notifyDataSetChanged();
        return cursor2;
    }
}
