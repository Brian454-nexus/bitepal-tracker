package b1;

import android.os.Bundle;
import android.text.Spannable;
import android.text.Spanned;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import java.util.ArrayList;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final String f10449a = AbstractC1117K.x0(0);

    /* renamed from: b, reason: collision with root package name */
    public static final String f10450b = AbstractC1117K.x0(1);

    /* renamed from: c, reason: collision with root package name */
    public static final String f10451c = AbstractC1117K.x0(2);

    /* renamed from: d, reason: collision with root package name */
    public static final String f10452d = AbstractC1117K.x0(3);

    /* renamed from: e, reason: collision with root package name */
    public static final String f10453e = AbstractC1117K.x0(4);

    public static ArrayList a(Spanned spanned) {
        ArrayList arrayList = new ArrayList();
        for (e eVar : (e[]) spanned.getSpans(0, spanned.length(), e.class)) {
            arrayList.add(b(spanned, eVar, 1, eVar.b()));
        }
        for (g gVar : (g[]) spanned.getSpans(0, spanned.length(), g.class)) {
            arrayList.add(b(spanned, gVar, 2, gVar.b()));
        }
        for (d dVar : (d[]) spanned.getSpans(0, spanned.length(), d.class)) {
            arrayList.add(b(spanned, dVar, 3, null));
        }
        return arrayList;
    }

    public static Bundle b(Spanned spanned, Object obj, int i6, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f10449a, spanned.getSpanStart(obj));
        bundle2.putInt(f10450b, spanned.getSpanEnd(obj));
        bundle2.putInt(f10451c, spanned.getSpanFlags(obj));
        bundle2.putInt(f10452d, i6);
        if (bundle != null) {
            bundle2.putBundle(f10453e, bundle);
        }
        return bundle2;
    }

    public static void c(Bundle bundle, Spannable spannable) {
        int i6 = bundle.getInt(f10449a);
        int i7 = bundle.getInt(f10450b);
        int i8 = bundle.getInt(f10451c);
        int i9 = bundle.getInt(f10452d, -1);
        Bundle bundle2 = bundle.getBundle(f10453e);
        if (i9 == 1) {
            spannable.setSpan(e.a((Bundle) AbstractC1119a.e(bundle2)), i6, i7, i8);
        } else if (i9 == 2) {
            spannable.setSpan(g.a((Bundle) AbstractC1119a.e(bundle2)), i6, i7, i8);
        } else {
            if (i9 != 3) {
                return;
            }
            spannable.setSpan(new d(), i6, i7, i8);
        }
    }
}
