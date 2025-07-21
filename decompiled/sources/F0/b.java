package F0;

import android.database.Cursor;
import android.widget.Filter;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class b extends Filter {

    /* renamed from: a, reason: collision with root package name */
    public a f1553a;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface a {
        void a(Cursor cursor);

        Cursor b();

        CharSequence c(Cursor cursor);

        Cursor d(CharSequence charSequence);
    }

    public b(a aVar) {
        this.f1553a = aVar;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return this.f1553a.c((Cursor) obj);
    }

    @Override // android.widget.Filter
    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor d6 = this.f1553a.d(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (d6 != null) {
            filterResults.count = d6.getCount();
            filterResults.values = d6;
            return filterResults;
        }
        filterResults.count = 0;
        filterResults.values = null;
        return filterResults;
    }

    @Override // android.widget.Filter
    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor b6 = this.f1553a.b();
        Object obj = filterResults.values;
        if (obj == null || obj == b6) {
            return;
        }
        this.f1553a.a((Cursor) obj);
    }
}
