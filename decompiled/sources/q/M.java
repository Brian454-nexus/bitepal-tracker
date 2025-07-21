package q;

import android.R;
import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import i.AbstractC1468a;
import i.AbstractC1472e;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;
import n0.AbstractC1809a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class M extends F0.c implements View.OnClickListener {

    /* renamed from: l, reason: collision with root package name */
    public final SearchManager f18467l;

    /* renamed from: m, reason: collision with root package name */
    public final SearchView f18468m;

    /* renamed from: n, reason: collision with root package name */
    public final SearchableInfo f18469n;

    /* renamed from: o, reason: collision with root package name */
    public final Context f18470o;

    /* renamed from: p, reason: collision with root package name */
    public final WeakHashMap f18471p;

    /* renamed from: q, reason: collision with root package name */
    public final int f18472q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f18473r;

    /* renamed from: s, reason: collision with root package name */
    public int f18474s;

    /* renamed from: t, reason: collision with root package name */
    public ColorStateList f18475t;

    /* renamed from: u, reason: collision with root package name */
    public int f18476u;

    /* renamed from: v, reason: collision with root package name */
    public int f18477v;

    /* renamed from: w, reason: collision with root package name */
    public int f18478w;

    /* renamed from: x, reason: collision with root package name */
    public int f18479x;

    /* renamed from: y, reason: collision with root package name */
    public int f18480y;

    /* renamed from: z, reason: collision with root package name */
    public int f18481z;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final TextView f18482a;

        /* renamed from: b, reason: collision with root package name */
        public final TextView f18483b;

        /* renamed from: c, reason: collision with root package name */
        public final ImageView f18484c;

        /* renamed from: d, reason: collision with root package name */
        public final ImageView f18485d;

        /* renamed from: e, reason: collision with root package name */
        public final ImageView f18486e;

        public a(View view) {
            this.f18482a = (TextView) view.findViewById(R.id.text1);
            this.f18483b = (TextView) view.findViewById(R.id.text2);
            this.f18484c = (ImageView) view.findViewById(R.id.icon1);
            this.f18485d = (ImageView) view.findViewById(R.id.icon2);
            this.f18486e = (ImageView) view.findViewById(AbstractC1472e.f15416k);
        }
    }

    public M(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f18473r = false;
        this.f18474s = 1;
        this.f18476u = -1;
        this.f18477v = -1;
        this.f18478w = -1;
        this.f18479x = -1;
        this.f18480y = -1;
        this.f18481z = -1;
        this.f18467l = (SearchManager) this.f1546d.getSystemService("search");
        this.f18468m = searchView;
        this.f18469n = searchableInfo;
        this.f18472q = searchView.getSuggestionCommitIconResId();
        this.f18470o = context;
        this.f18471p = weakHashMap;
    }

    public static String o(Cursor cursor, String str) {
        return w(cursor, cursor.getColumnIndex(str));
    }

    public static String w(Cursor cursor, int i6) {
        if (i6 == -1) {
            return null;
        }
        try {
            return cursor.getString(i6);
        } catch (Exception e6) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e6);
            return null;
        }
    }

    public final void A(String str, Drawable drawable) {
        if (drawable != null) {
            this.f18471p.put(str, drawable.getConstantState());
        }
    }

    public final void B(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // F0.a, F0.b.a
    public void a(Cursor cursor) {
        if (this.f18473r) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.a(cursor);
            if (cursor != null) {
                this.f18476u = cursor.getColumnIndex("suggest_text_1");
                this.f18477v = cursor.getColumnIndex("suggest_text_2");
                this.f18478w = cursor.getColumnIndex("suggest_text_2_url");
                this.f18479x = cursor.getColumnIndex("suggest_icon_1");
                this.f18480y = cursor.getColumnIndex("suggest_icon_2");
                this.f18481z = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e6) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e6);
        }
    }

    @Override // F0.a, F0.b.a
    public CharSequence c(Cursor cursor) {
        String o6;
        String o7;
        if (cursor == null) {
            return null;
        }
        String o8 = o(cursor, "suggest_intent_query");
        if (o8 != null) {
            return o8;
        }
        if (this.f18469n.shouldRewriteQueryFromData() && (o7 = o(cursor, "suggest_intent_data")) != null) {
            return o7;
        }
        if (!this.f18469n.shouldRewriteQueryFromText() || (o6 = o(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return o6;
    }

    @Override // F0.b.a
    public Cursor d(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        if (this.f18468m.getVisibility() == 0 && this.f18468m.getWindowVisibility() == 0) {
            try {
                Cursor v6 = v(this.f18469n, charSequence2, 50);
                if (v6 != null) {
                    v6.getCount();
                    return v6;
                }
            } catch (RuntimeException e6) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e6);
            }
        }
        return null;
    }

    @Override // F0.a
    public void e(View view, Context context, Cursor cursor) {
        a aVar = (a) view.getTag();
        int i6 = this.f18481z;
        int i7 = i6 != -1 ? cursor.getInt(i6) : 0;
        if (aVar.f18482a != null) {
            z(aVar.f18482a, w(cursor, this.f18476u));
        }
        if (aVar.f18483b != null) {
            String w6 = w(cursor, this.f18478w);
            CharSequence l6 = w6 != null ? l(w6) : w(cursor, this.f18477v);
            if (TextUtils.isEmpty(l6)) {
                TextView textView = aVar.f18482a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f18482a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f18482a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f18482a.setMaxLines(1);
                }
            }
            z(aVar.f18483b, l6);
        }
        ImageView imageView = aVar.f18484c;
        if (imageView != null) {
            y(imageView, t(cursor), 4);
        }
        ImageView imageView2 = aVar.f18485d;
        if (imageView2 != null) {
            y(imageView2, u(cursor), 8);
        }
        int i8 = this.f18474s;
        if (i8 != 2 && (i8 != 1 || (i7 & 1) == 0)) {
            aVar.f18486e.setVisibility(8);
            return;
        }
        aVar.f18486e.setVisibility(0);
        aVar.f18486e.setTag(aVar.f18482a.getText());
        aVar.f18486e.setOnClickListener(this);
    }

    @Override // F0.a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i6, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i6, view, viewGroup);
        } catch (RuntimeException e6) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e6);
            View g6 = g(this.f1546d, this.f1545c, viewGroup);
            if (g6 != null) {
                ((a) g6.getTag()).f18482a.setText(e6.toString());
            }
            return g6;
        }
    }

    @Override // F0.a, android.widget.Adapter
    public View getView(int i6, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i6, view, viewGroup);
        } catch (RuntimeException e6) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e6);
            View h6 = h(this.f1546d, this.f1545c, viewGroup);
            if (h6 != null) {
                ((a) h6.getTag()).f18482a.setText(e6.toString());
            }
            return h6;
        }
    }

    @Override // F0.c, F0.a
    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        View h6 = super.h(context, cursor, viewGroup);
        h6.setTag(new a(h6));
        ((ImageView) h6.findViewById(AbstractC1472e.f15416k)).setImageResource(this.f18472q);
        return h6;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    public final Drawable k(String str) {
        Drawable.ConstantState constantState = (Drawable.ConstantState) this.f18471p.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    public final CharSequence l(CharSequence charSequence) {
        if (this.f18475t == null) {
            TypedValue typedValue = new TypedValue();
            this.f1546d.getTheme().resolveAttribute(AbstractC1468a.f15344r, typedValue, true);
            this.f18475t = this.f1546d.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f18475t, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    public final Drawable m(ComponentName componentName) {
        PackageManager packageManager = this.f1546d.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            Log.w("SuggestionsAdapter", "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString());
            return null;
        } catch (PackageManager.NameNotFoundException e6) {
            Log.w("SuggestionsAdapter", e6.toString());
            return null;
        }
    }

    public final Drawable n(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        if (!this.f18471p.containsKey(flattenToShortString)) {
            Drawable m6 = m(componentName);
            this.f18471p.put(flattenToShortString, m6 != null ? m6.getConstantState() : null);
            return m6;
        }
        Drawable.ConstantState constantState = (Drawable.ConstantState) this.f18471p.get(flattenToShortString);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable(this.f18470o.getResources());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        B(b());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        B(b());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f18468m.R((CharSequence) tag);
        }
    }

    public final Drawable p(Cursor cursor) {
        Drawable n6 = n(this.f18469n.getSearchActivity());
        return n6 != null ? n6 : this.f1546d.getPackageManager().getDefaultActivityIcon();
    }

    public final Drawable q(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return r(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream openInputStream = this.f18470o.getContentResolver().openInputStream(uri);
            if (openInputStream == null) {
                throw new FileNotFoundException("Failed to open " + uri);
            }
            try {
                Drawable createFromStream = Drawable.createFromStream(openInputStream, null);
                try {
                    return createFromStream;
                } catch (IOException e6) {
                    return createFromStream;
                }
            } finally {
                try {
                    openInputStream.close();
                } catch (IOException e62) {
                    Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e62);
                }
            }
        } catch (FileNotFoundException e7) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e7.getMessage());
            return null;
        }
        Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e7.getMessage());
        return null;
    }

    public Drawable r(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f1546d.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    parseInt = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (parseInt != 0) {
                return resourcesForApplication.getDrawable(parseInt);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    public final Drawable s(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f18470o.getPackageName() + "/" + parseInt;
            Drawable k6 = k(str2);
            if (k6 != null) {
                return k6;
            }
            Drawable drawable = AbstractC1809a.getDrawable(this.f18470o, parseInt);
            A(str2, drawable);
            return drawable;
        } catch (Resources.NotFoundException unused) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable k7 = k(str);
            if (k7 != null) {
                return k7;
            }
            Drawable q6 = q(Uri.parse(str));
            A(str, q6);
            return q6;
        }
    }

    public final Drawable t(Cursor cursor) {
        int i6 = this.f18479x;
        if (i6 == -1) {
            return null;
        }
        Drawable s6 = s(cursor.getString(i6));
        return s6 != null ? s6 : p(cursor);
    }

    public final Drawable u(Cursor cursor) {
        int i6 = this.f18480y;
        if (i6 == -1) {
            return null;
        }
        return s(cursor.getString(i6));
    }

    public Cursor v(SearchableInfo searchableInfo, String str, int i6) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i6 > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i6));
        }
        return this.f1546d.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    public void x(int i6) {
        this.f18474s = i6;
    }

    public final void y(ImageView imageView, Drawable drawable, int i6) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i6);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    public final void z(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }
}
