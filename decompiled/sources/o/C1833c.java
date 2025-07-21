package o;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import i.AbstractC1475h;

/* renamed from: o.c, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C1833c extends ContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    public int f17800a;

    /* renamed from: b, reason: collision with root package name */
    public Resources.Theme f17801b;

    /* renamed from: c, reason: collision with root package name */
    public LayoutInflater f17802c;

    /* renamed from: d, reason: collision with root package name */
    public Configuration f17803d;

    /* renamed from: e, reason: collision with root package name */
    public Resources f17804e;

    public C1833c(Context context, Resources.Theme theme) {
        super(context);
        this.f17801b = theme;
    }

    public void a(Configuration configuration) {
        if (this.f17804e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f17803d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f17803d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final Resources b() {
        if (this.f17804e == null) {
            Configuration configuration = this.f17803d;
            if (configuration == null) {
                this.f17804e = super.getResources();
            } else {
                this.f17804e = createConfigurationContext(configuration).getResources();
            }
        }
        return this.f17804e;
    }

    public final void c() {
        boolean z6 = this.f17801b == null;
        if (z6) {
            this.f17801b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f17801b.setTo(theme);
            }
        }
        d(this.f17801b, this.f17800a, z6);
    }

    public void d(Resources.Theme theme, int i6, boolean z6) {
        theme.applyStyle(i6, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f17802c == null) {
            this.f17802c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f17802c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f17801b;
        if (theme != null) {
            return theme;
        }
        if (this.f17800a == 0) {
            this.f17800a = AbstractC1475h.f15456a;
        }
        c();
        return this.f17801b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i6) {
        if (this.f17800a != i6) {
            this.f17800a = i6;
            c();
        }
    }
}
