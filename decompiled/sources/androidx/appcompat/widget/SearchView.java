package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import i.AbstractC1468a;
import i.AbstractC1470c;
import i.AbstractC1472e;
import i.AbstractC1473f;
import i.AbstractC1474g;
import i.AbstractC1476i;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import o.InterfaceC1832b;
import q.AbstractC1979c;
import q.M;
import q.S;
import q.T;
import q.V;
import z0.AbstractC2393D;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class SearchView extends androidx.appcompat.widget.b implements InterfaceC1832b {

    /* renamed from: v0, reason: collision with root package name */
    public static final k f8127v0 = new k();

    /* renamed from: A, reason: collision with root package name */
    public Rect f8128A;

    /* renamed from: B, reason: collision with root package name */
    public int[] f8129B;

    /* renamed from: C, reason: collision with root package name */
    public int[] f8130C;

    /* renamed from: D, reason: collision with root package name */
    public final ImageView f8131D;

    /* renamed from: E, reason: collision with root package name */
    public final Drawable f8132E;

    /* renamed from: F, reason: collision with root package name */
    public final int f8133F;

    /* renamed from: G, reason: collision with root package name */
    public final int f8134G;

    /* renamed from: H, reason: collision with root package name */
    public final Intent f8135H;

    /* renamed from: I, reason: collision with root package name */
    public final Intent f8136I;

    /* renamed from: J, reason: collision with root package name */
    public final CharSequence f8137J;

    /* renamed from: K, reason: collision with root package name */
    public View.OnFocusChangeListener f8138K;

    /* renamed from: L, reason: collision with root package name */
    public View.OnClickListener f8139L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f8140M;

    /* renamed from: V, reason: collision with root package name */
    public boolean f8141V;

    /* renamed from: W, reason: collision with root package name */
    public F0.a f8142W;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f8143a0;

    /* renamed from: b0, reason: collision with root package name */
    public CharSequence f8144b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f8145c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f8146d0;

    /* renamed from: e0, reason: collision with root package name */
    public int f8147e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f8148f0;

    /* renamed from: g0, reason: collision with root package name */
    public CharSequence f8149g0;

    /* renamed from: h0, reason: collision with root package name */
    public CharSequence f8150h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f8151i0;

    /* renamed from: j0, reason: collision with root package name */
    public int f8152j0;

    /* renamed from: k0, reason: collision with root package name */
    public SearchableInfo f8153k0;

    /* renamed from: l0, reason: collision with root package name */
    public Bundle f8154l0;

    /* renamed from: m0, reason: collision with root package name */
    public final Runnable f8155m0;

    /* renamed from: n0, reason: collision with root package name */
    public Runnable f8156n0;

    /* renamed from: o0, reason: collision with root package name */
    public final WeakHashMap f8157o0;

    /* renamed from: p, reason: collision with root package name */
    public final SearchAutoComplete f8158p;

    /* renamed from: p0, reason: collision with root package name */
    public final View.OnClickListener f8159p0;

    /* renamed from: q, reason: collision with root package name */
    public final View f8160q;

    /* renamed from: q0, reason: collision with root package name */
    public View.OnKeyListener f8161q0;

    /* renamed from: r, reason: collision with root package name */
    public final View f8162r;

    /* renamed from: r0, reason: collision with root package name */
    public final TextView.OnEditorActionListener f8163r0;

    /* renamed from: s, reason: collision with root package name */
    public final View f8164s;

    /* renamed from: s0, reason: collision with root package name */
    public final AdapterView.OnItemClickListener f8165s0;

    /* renamed from: t, reason: collision with root package name */
    public final ImageView f8166t;

    /* renamed from: t0, reason: collision with root package name */
    public final AdapterView.OnItemSelectedListener f8167t0;

    /* renamed from: u, reason: collision with root package name */
    public final ImageView f8168u;

    /* renamed from: u0, reason: collision with root package name */
    public TextWatcher f8169u0;

    /* renamed from: v, reason: collision with root package name */
    public final ImageView f8170v;

    /* renamed from: w, reason: collision with root package name */
    public final ImageView f8171w;

    /* renamed from: x, reason: collision with root package name */
    public final View f8172x;

    /* renamed from: y, reason: collision with root package name */
    public p f8173y;

    /* renamed from: z, reason: collision with root package name */
    public Rect f8174z;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class SearchAutoComplete extends AbstractC1979c {

        /* renamed from: d, reason: collision with root package name */
        public int f8175d;

        /* renamed from: e, reason: collision with root package name */
        public SearchView f8176e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f8177f;

        /* renamed from: g, reason: collision with root package name */
        public final Runnable f8178g;

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.b();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, AbstractC1468a.f15333g);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i6 = configuration.screenWidthDp;
            int i7 = configuration.screenHeightDp;
            if (i6 >= 960 && i7 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i6 < 600) {
                return (i6 < 640 || i7 < 480) ? 160 : 192;
            }
            return 192;
        }

        public boolean a() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        public void b() {
            if (this.f8177f) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f8177f = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f8175d <= 0 || super.enoughToFilter();
        }

        @Override // q.AbstractC1979c, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f8177f) {
                removeCallbacks(this.f8178g);
                post(this.f8178g);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onFocusChanged(boolean z6, int i6, Rect rect) {
            super.onFocusChanged(z6, i6, rect);
            this.f8176e.W();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i6, KeyEvent keyEvent) {
            if (i6 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f8176e.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i6, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z6) {
            super.onWindowFocusChanged(z6);
            if (z6 && this.f8176e.hasFocus() && getVisibility() == 0) {
                this.f8177f = true;
                if (SearchView.J(getContext())) {
                    SearchView.f8127v0.c(this, true);
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z6) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z6) {
                this.f8177f = false;
                removeCallbacks(this.f8178g);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f8177f = true;
                    return;
                }
                this.f8177f = false;
                removeCallbacks(this.f8178g);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f8176e = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i6) {
            super.setThreshold(i6);
            this.f8175d = i6;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i6) {
            super(context, attributeSet, i6);
            this.f8178g = new a();
            this.f8175d = getThreshold();
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
            SearchView.this.V(charSequence);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.c0();
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            F0.a aVar = SearchView.this.f8142W;
            if (aVar instanceof M) {
                aVar.a(null);
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class d implements View.OnFocusChangeListener {
        public d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z6) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f8138K;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z6);
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class e implements View.OnLayoutChangeListener {
        public e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
            SearchView.this.y();
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f8166t) {
                searchView.S();
                return;
            }
            if (view == searchView.f8170v) {
                searchView.O();
                return;
            }
            if (view == searchView.f8168u) {
                searchView.T();
            } else if (view == searchView.f8171w) {
                searchView.X();
            } else if (view == searchView.f8158p) {
                searchView.E();
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class g implements View.OnKeyListener {
        public g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i6, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f8153k0 == null) {
                return false;
            }
            if (searchView.f8158p.isPopupShowing() && SearchView.this.f8158p.getListSelection() != -1) {
                return SearchView.this.U(view, i6, keyEvent);
            }
            if (SearchView.this.f8158p.a() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i6 != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.M(0, null, searchView2.f8158p.getText().toString());
            return true;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class h implements TextView.OnEditorActionListener {
        public h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i6, KeyEvent keyEvent) {
            SearchView.this.T();
            return true;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class i implements AdapterView.OnItemClickListener {
        public i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i6, long j6) {
            SearchView.this.P(i6, 0, null);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class j implements AdapterView.OnItemSelectedListener {
        public j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i6, long j6) {
            SearchView.this.Q(i6);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class k {

        /* renamed from: a, reason: collision with root package name */
        public Method f8190a;

        /* renamed from: b, reason: collision with root package name */
        public Method f8191b;

        /* renamed from: c, reason: collision with root package name */
        public Method f8192c;

        public k() {
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f8190a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f8191b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f8192c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        public void a(AutoCompleteTextView autoCompleteTextView) {
            Method method = this.f8191b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        public void b(AutoCompleteTextView autoCompleteTextView) {
            Method method = this.f8190a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        public void c(AutoCompleteTextView autoCompleteTextView, boolean z6) {
            Method method = this.f8192c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.valueOf(z6));
                } catch (Exception unused) {
                }
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface l {
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface m {
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface n {
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class o extends G0.a {
        public static final Parcelable.Creator<o> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        public boolean f8193c;

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static class a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public o createFromParcel(Parcel parcel) {
                return new o(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public o createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new o(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public o[] newArray(int i6) {
                return new o[i6];
            }
        }

        public o(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f8193c + "}";
        }

        @Override // G0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i6) {
            super.writeToParcel(parcel, i6);
            parcel.writeValue(Boolean.valueOf(this.f8193c));
        }

        public o(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f8193c = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class p extends TouchDelegate {

        /* renamed from: a, reason: collision with root package name */
        public final View f8194a;

        /* renamed from: b, reason: collision with root package name */
        public final Rect f8195b;

        /* renamed from: c, reason: collision with root package name */
        public final Rect f8196c;

        /* renamed from: d, reason: collision with root package name */
        public final Rect f8197d;

        /* renamed from: e, reason: collision with root package name */
        public final int f8198e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f8199f;

        public p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f8198e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f8195b = new Rect();
            this.f8197d = new Rect();
            this.f8196c = new Rect();
            a(rect, rect2);
            this.f8194a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.f8195b.set(rect);
            this.f8197d.set(rect);
            Rect rect3 = this.f8197d;
            int i6 = this.f8198e;
            rect3.inset(-i6, -i6);
            this.f8196c.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z6;
            boolean z7;
            int x6 = (int) motionEvent.getX();
            int y6 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z8 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z7 = this.f8199f;
                    if (z7 && !this.f8197d.contains(x6, y6)) {
                        z8 = z7;
                        z6 = false;
                    }
                } else {
                    if (action == 3) {
                        z7 = this.f8199f;
                        this.f8199f = false;
                    }
                    z6 = true;
                    z8 = false;
                }
                z8 = z7;
                z6 = true;
            } else {
                if (this.f8195b.contains(x6, y6)) {
                    this.f8199f = true;
                    z6 = true;
                }
                z6 = true;
                z8 = false;
            }
            if (!z8) {
                return false;
            }
            if (!z6 || this.f8196c.contains(x6, y6)) {
                Rect rect = this.f8196c;
                motionEvent.setLocation(x6 - rect.left, y6 - rect.top);
            } else {
                motionEvent.setLocation(this.f8194a.getWidth() / 2, this.f8194a.getHeight() / 2);
            }
            return this.f8194a.dispatchTouchEvent(motionEvent);
        }
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public static boolean J(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(AbstractC1470c.f15357e);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(AbstractC1470c.f15358f);
    }

    private void setQuery(CharSequence charSequence) {
        this.f8158p.setText(charSequence);
        this.f8158p.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    public final Intent A(Cursor cursor, int i6, String str) {
        int i7;
        String o6;
        try {
            String o7 = M.o(cursor, "suggest_intent_action");
            if (o7 == null) {
                o7 = this.f8153k0.getSuggestIntentAction();
            }
            if (o7 == null) {
                o7 = "android.intent.action.SEARCH";
            }
            String str2 = o7;
            String o8 = M.o(cursor, "suggest_intent_data");
            if (o8 == null) {
                o8 = this.f8153k0.getSuggestIntentData();
            }
            if (o8 != null && (o6 = M.o(cursor, "suggest_intent_data_id")) != null) {
                o8 = o8 + "/" + Uri.encode(o6);
            }
            return z(str2, o8 == null ? null : Uri.parse(o8), M.o(cursor, "suggest_intent_extra_data"), M.o(cursor, "suggest_intent_query"), i6, str);
        } catch (RuntimeException e6) {
            try {
                i7 = cursor.getPosition();
            } catch (RuntimeException unused) {
                i7 = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + i7 + " returned exception.", e6);
            return null;
        }
    }

    public final Intent B(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f8154l0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final Intent C(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    public final void D() {
        this.f8158p.dismissDropDown();
    }

    public void E() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f8158p.refreshAutoCompleteResults();
            return;
        }
        k kVar = f8127v0;
        kVar.b(this.f8158p);
        kVar.a(this.f8158p);
    }

    public final void F(View view, Rect rect) {
        view.getLocationInWindow(this.f8129B);
        getLocationInWindow(this.f8130C);
        int[] iArr = this.f8129B;
        int i6 = iArr[1];
        int[] iArr2 = this.f8130C;
        int i7 = i6 - iArr2[1];
        int i8 = iArr[0] - iArr2[0];
        rect.set(i8, i7, view.getWidth() + i8, view.getHeight() + i7);
    }

    public final CharSequence G(CharSequence charSequence) {
        if (!this.f8140M || this.f8132E == null) {
            return charSequence;
        }
        int textSize = (int) (this.f8158p.getTextSize() * 1.25d);
        this.f8132E.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f8132E), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    public final boolean H() {
        SearchableInfo searchableInfo = this.f8153k0;
        if (searchableInfo != null && searchableInfo.getVoiceSearchEnabled()) {
            Intent intent = this.f8153k0.getVoiceSearchLaunchWebSearch() ? this.f8135H : this.f8153k0.getVoiceSearchLaunchRecognizer() ? this.f8136I : null;
            if (intent != null && getContext().getPackageManager().resolveActivity(intent, 65536) != null) {
                return true;
            }
        }
        return false;
    }

    public boolean I() {
        return this.f8141V;
    }

    public final boolean K() {
        return (this.f8143a0 || this.f8148f0) && !I();
    }

    public final void L(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException e6) {
            Log.e("SearchView", "Failed launch activity: " + intent, e6);
        }
    }

    public void M(int i6, String str, String str2) {
        getContext().startActivity(z("android.intent.action.SEARCH", null, null, str2, i6, str));
    }

    public final boolean N(int i6, int i7, String str) {
        Cursor b6 = this.f8142W.b();
        if (b6 == null || !b6.moveToPosition(i6)) {
            return false;
        }
        L(A(b6, i7, str));
        return true;
    }

    public void O() {
        if (!TextUtils.isEmpty(this.f8158p.getText())) {
            this.f8158p.setText("");
            this.f8158p.requestFocus();
            this.f8158p.setImeVisibility(true);
        } else if (this.f8140M) {
            clearFocus();
            h0(true);
        }
    }

    public boolean P(int i6, int i7, String str) {
        N(i6, 0, null);
        this.f8158p.setImeVisibility(false);
        D();
        return true;
    }

    public boolean Q(int i6) {
        Z(i6);
        return true;
    }

    public void R(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public void S() {
        h0(false);
        this.f8158p.requestFocus();
        this.f8158p.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f8139L;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void T() {
        Editable text = this.f8158p.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.f8153k0 != null) {
            M(0, null, text.toString());
        }
        this.f8158p.setImeVisibility(false);
        D();
    }

    public boolean U(View view, int i6, KeyEvent keyEvent) {
        if (this.f8153k0 != null && this.f8142W != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i6 == 66 || i6 == 84 || i6 == 61) {
                return P(this.f8158p.getListSelection(), 0, null);
            }
            if (i6 == 21 || i6 == 22) {
                this.f8158p.setSelection(i6 == 21 ? 0 : this.f8158p.length());
                this.f8158p.setListSelection(0);
                this.f8158p.clearListSelection();
                f8127v0.c(this.f8158p, true);
                return true;
            }
            if (i6 == 19) {
                this.f8158p.getListSelection();
                return false;
            }
        }
        return false;
    }

    public void V(CharSequence charSequence) {
        Editable text = this.f8158p.getText();
        this.f8150h0 = text;
        boolean isEmpty = TextUtils.isEmpty(text);
        g0(!isEmpty);
        i0(isEmpty);
        b0();
        f0();
        this.f8149g0 = charSequence.toString();
    }

    public void W() {
        h0(I());
        Y();
        if (this.f8158p.hasFocus()) {
            E();
        }
    }

    public void X() {
        SearchableInfo searchableInfo = this.f8153k0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                getContext().startActivity(C(this.f8135H, searchableInfo));
            } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                getContext().startActivity(B(this.f8136I, searchableInfo));
            }
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }

    public final void Y() {
        post(this.f8155m0);
    }

    public final void Z(int i6) {
        Editable text = this.f8158p.getText();
        Cursor b6 = this.f8142W.b();
        if (b6 == null) {
            return;
        }
        if (!b6.moveToPosition(i6)) {
            setQuery(text);
            return;
        }
        CharSequence c6 = this.f8142W.c(b6);
        if (c6 != null) {
            setQuery(c6);
        } else {
            setQuery(text);
        }
    }

    public void a0(CharSequence charSequence, boolean z6) {
        this.f8158p.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f8158p;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f8150h0 = charSequence;
        }
        if (!z6 || TextUtils.isEmpty(charSequence)) {
            return;
        }
        T();
    }

    @Override // o.InterfaceC1832b
    public void b() {
        if (this.f8151i0) {
            return;
        }
        this.f8151i0 = true;
        int imeOptions = this.f8158p.getImeOptions();
        this.f8152j0 = imeOptions;
        this.f8158p.setImeOptions(imeOptions | 33554432);
        this.f8158p.setText("");
        setIconified(false);
    }

    public final void b0() {
        boolean isEmpty = TextUtils.isEmpty(this.f8158p.getText());
        this.f8170v.setVisibility(!isEmpty || (this.f8140M && !this.f8151i0) ? 0 : 8);
        Drawable drawable = this.f8170v.getDrawable();
        if (drawable != null) {
            drawable.setState(!isEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    @Override // o.InterfaceC1832b
    public void c() {
        a0("", false);
        clearFocus();
        h0(true);
        this.f8158p.setImeOptions(this.f8152j0);
        this.f8151i0 = false;
    }

    public void c0() {
        int[] iArr = this.f8158p.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f8162r.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f8164s.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.f8146d0 = true;
        super.clearFocus();
        this.f8158p.clearFocus();
        this.f8158p.setImeVisibility(false);
        this.f8146d0 = false;
    }

    public final void d0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f8158p;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(G(queryHint));
    }

    public final void e0() {
        this.f8158p.setThreshold(this.f8153k0.getSuggestThreshold());
        this.f8158p.setImeOptions(this.f8153k0.getImeOptions());
        int inputType = this.f8153k0.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f8153k0.getSuggestAuthority() != null) {
                inputType |= 589824;
            }
        }
        this.f8158p.setInputType(inputType);
        F0.a aVar = this.f8142W;
        if (aVar != null) {
            aVar.a(null);
        }
        if (this.f8153k0.getSuggestAuthority() != null) {
            M m6 = new M(getContext(), this, this.f8153k0, this.f8157o0);
            this.f8142W = m6;
            this.f8158p.setAdapter(m6);
            ((M) this.f8142W).x(this.f8145c0 ? 2 : 1);
        }
    }

    public final void f0() {
        this.f8164s.setVisibility((K() && (this.f8168u.getVisibility() == 0 || this.f8171w.getVisibility() == 0)) ? 0 : 8);
    }

    public final void g0(boolean z6) {
        this.f8168u.setVisibility((this.f8143a0 && K() && hasFocus() && (z6 || !this.f8148f0)) ? 0 : 8);
    }

    public int getImeOptions() {
        return this.f8158p.getImeOptions();
    }

    public int getInputType() {
        return this.f8158p.getInputType();
    }

    public int getMaxWidth() {
        return this.f8147e0;
    }

    public CharSequence getQuery() {
        return this.f8158p.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f8144b0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f8153k0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f8137J : getContext().getText(this.f8153k0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f8134G;
    }

    public int getSuggestionRowLayout() {
        return this.f8133F;
    }

    public F0.a getSuggestionsAdapter() {
        return this.f8142W;
    }

    public final void h0(boolean z6) {
        this.f8141V = z6;
        int i6 = 8;
        int i7 = z6 ? 0 : 8;
        boolean isEmpty = TextUtils.isEmpty(this.f8158p.getText());
        this.f8166t.setVisibility(i7);
        g0(!isEmpty);
        this.f8160q.setVisibility(z6 ? 8 : 0);
        if (this.f8131D.getDrawable() != null && !this.f8140M) {
            i6 = 0;
        }
        this.f8131D.setVisibility(i6);
        b0();
        i0(isEmpty);
        f0();
    }

    public final void i0(boolean z6) {
        int i6 = 8;
        if (this.f8148f0 && !I() && z6) {
            this.f8168u.setVisibility(8);
            i6 = 0;
        }
        this.f8171w.setVisibility(i6);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f8155m0);
        post(this.f8156n0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.b, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z6, int i6, int i7, int i8, int i9) {
        super.onLayout(z6, i6, i7, i8, i9);
        if (z6) {
            F(this.f8158p, this.f8174z);
            Rect rect = this.f8128A;
            Rect rect2 = this.f8174z;
            rect.set(rect2.left, 0, rect2.right, i9 - i7);
            p pVar = this.f8173y;
            if (pVar != null) {
                pVar.a(this.f8128A, this.f8174z);
                return;
            }
            p pVar2 = new p(this.f8128A, this.f8174z, this.f8158p);
            this.f8173y = pVar2;
            setTouchDelegate(pVar2);
        }
    }

    @Override // androidx.appcompat.widget.b, android.view.View
    public void onMeasure(int i6, int i7) {
        int i8;
        if (I()) {
            super.onMeasure(i6, i7);
            return;
        }
        int mode = View.MeasureSpec.getMode(i6);
        int size = View.MeasureSpec.getSize(i6);
        if (mode == Integer.MIN_VALUE) {
            int i9 = this.f8147e0;
            size = i9 > 0 ? Math.min(i9, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f8147e0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i8 = this.f8147e0) > 0) {
            size = Math.min(i8, size);
        }
        int mode2 = View.MeasureSpec.getMode(i7);
        int size2 = View.MeasureSpec.getSize(i7);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof o)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        o oVar = (o) parcelable;
        super.onRestoreInstanceState(oVar.a());
        h0(oVar.f8193c);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        o oVar = new o(super.onSaveInstanceState());
        oVar.f8193c = I();
        return oVar;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z6) {
        super.onWindowFocusChanged(z6);
        Y();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i6, Rect rect) {
        if (this.f8146d0 || !isFocusable()) {
            return false;
        }
        if (I()) {
            return super.requestFocus(i6, rect);
        }
        boolean requestFocus = this.f8158p.requestFocus(i6, rect);
        if (requestFocus) {
            h0(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f8154l0 = bundle;
    }

    public void setIconified(boolean z6) {
        if (z6) {
            O();
        } else {
            S();
        }
    }

    public void setIconifiedByDefault(boolean z6) {
        if (this.f8140M == z6) {
            return;
        }
        this.f8140M = z6;
        h0(z6);
        d0();
    }

    public void setImeOptions(int i6) {
        this.f8158p.setImeOptions(i6);
    }

    public void setInputType(int i6) {
        this.f8158p.setInputType(i6);
    }

    public void setMaxWidth(int i6) {
        this.f8147e0 = i6;
        requestLayout();
    }

    public void setOnCloseListener(l lVar) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f8138K = onFocusChangeListener;
    }

    public void setOnQueryTextListener(m mVar) {
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f8139L = onClickListener;
    }

    public void setOnSuggestionListener(n nVar) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f8144b0 = charSequence;
        d0();
    }

    public void setQueryRefinementEnabled(boolean z6) {
        this.f8145c0 = z6;
        F0.a aVar = this.f8142W;
        if (aVar instanceof M) {
            ((M) aVar).x(z6 ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f8153k0 = searchableInfo;
        if (searchableInfo != null) {
            e0();
            d0();
        }
        boolean H6 = H();
        this.f8148f0 = H6;
        if (H6) {
            this.f8158p.setPrivateImeOptions("nm");
        }
        h0(I());
    }

    public void setSubmitButtonEnabled(boolean z6) {
        this.f8143a0 = z6;
        h0(I());
    }

    public void setSuggestionsAdapter(F0.a aVar) {
        this.f8142W = aVar;
        this.f8158p.setAdapter(aVar);
    }

    public void y() {
        if (this.f8172x.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f8162r.getPaddingLeft();
            Rect rect = new Rect();
            boolean b6 = V.b(this);
            int dimensionPixelSize = this.f8140M ? resources.getDimensionPixelSize(AbstractC1470c.f15355c) + resources.getDimensionPixelSize(AbstractC1470c.f15356d) : 0;
            this.f8158p.getDropDownBackground().getPadding(rect);
            this.f8158p.setDropDownHorizontalOffset(b6 ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
            this.f8158p.setDropDownWidth((((this.f8172x.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    public final Intent z(String str, Uri uri, String str2, String str3, int i6, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f8150h0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f8154l0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i6 != 0) {
            intent.putExtra("action_key", i6);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f8153k0.getSearchActivity());
        return intent;
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1468a.f15342p);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        this.f8174z = new Rect();
        this.f8128A = new Rect();
        this.f8129B = new int[2];
        this.f8130C = new int[2];
        this.f8155m0 = new b();
        this.f8156n0 = new c();
        this.f8157o0 = new WeakHashMap();
        f fVar = new f();
        this.f8159p0 = fVar;
        this.f8161q0 = new g();
        h hVar = new h();
        this.f8163r0 = hVar;
        i iVar = new i();
        this.f8165s0 = iVar;
        j jVar = new j();
        this.f8167t0 = jVar;
        this.f8169u0 = new a();
        S r6 = S.r(context, attributeSet, AbstractC1476i.f15467C1, i6, 0);
        LayoutInflater.from(context).inflate(r6.l(AbstractC1476i.f15507M1, AbstractC1473f.f15443l), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(AbstractC1472e.f15424s);
        this.f8158p = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f8160q = findViewById(AbstractC1472e.f15420o);
        View findViewById = findViewById(AbstractC1472e.f15423r);
        this.f8162r = findViewById;
        View findViewById2 = findViewById(AbstractC1472e.f15430y);
        this.f8164s = findViewById2;
        ImageView imageView = (ImageView) findViewById(AbstractC1472e.f15418m);
        this.f8166t = imageView;
        ImageView imageView2 = (ImageView) findViewById(AbstractC1472e.f15421p);
        this.f8168u = imageView2;
        ImageView imageView3 = (ImageView) findViewById(AbstractC1472e.f15419n);
        this.f8170v = imageView3;
        ImageView imageView4 = (ImageView) findViewById(AbstractC1472e.f15425t);
        this.f8171w = imageView4;
        ImageView imageView5 = (ImageView) findViewById(AbstractC1472e.f15422q);
        this.f8131D = imageView5;
        AbstractC2393D.O(findViewById, r6.f(AbstractC1476i.f15511N1));
        AbstractC2393D.O(findViewById2, r6.f(AbstractC1476i.f15527R1));
        int i7 = AbstractC1476i.f15523Q1;
        imageView.setImageDrawable(r6.f(i7));
        imageView2.setImageDrawable(r6.f(AbstractC1476i.f15499K1));
        imageView3.setImageDrawable(r6.f(AbstractC1476i.f15487H1));
        imageView4.setImageDrawable(r6.f(AbstractC1476i.f15535T1));
        imageView5.setImageDrawable(r6.f(i7));
        this.f8132E = r6.f(AbstractC1476i.f15519P1);
        T.a(imageView, getResources().getString(AbstractC1474g.f15455l));
        this.f8133F = r6.l(AbstractC1476i.f15531S1, AbstractC1473f.f15442k);
        this.f8134G = r6.l(AbstractC1476i.f15491I1, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.f8169u0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f8161q0);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(r6.a(AbstractC1476i.f15503L1, true));
        int e6 = r6.e(AbstractC1476i.f15475E1, -1);
        if (e6 != -1) {
            setMaxWidth(e6);
        }
        this.f8137J = r6.n(AbstractC1476i.f15495J1);
        this.f8144b0 = r6.n(AbstractC1476i.f15515O1);
        int i8 = r6.i(AbstractC1476i.f15483G1, -1);
        if (i8 != -1) {
            setImeOptions(i8);
        }
        int i9 = r6.i(AbstractC1476i.f15479F1, -1);
        if (i9 != -1) {
            setInputType(i9);
        }
        setFocusable(r6.a(AbstractC1476i.f15471D1, true));
        r6.s();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f8135H = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f8136I = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f8172x = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new e());
        }
        h0(this.f8140M);
        d0();
    }
}
