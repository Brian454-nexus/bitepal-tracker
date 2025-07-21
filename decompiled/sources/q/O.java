package q;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class O extends ContextWrapper {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f18497c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static ArrayList f18498d;

    /* renamed from: a, reason: collision with root package name */
    public final Resources f18499a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources.Theme f18500b;

    public O(Context context) {
        super(context);
        if (!U.b()) {
            this.f18499a = new Q(this, context.getResources());
            this.f18500b = null;
            return;
        }
        U u6 = new U(this, context.getResources());
        this.f18499a = u6;
        Resources.Theme newTheme = u6.newTheme();
        this.f18500b = newTheme;
        newTheme.setTo(context.getTheme());
    }

    public static boolean a(Context context) {
        return ((context instanceof O) || (context.getResources() instanceof Q) || (context.getResources() instanceof U) || !U.b()) ? false : true;
    }

    public static Context b(Context context) {
        if (!a(context)) {
            return context;
        }
        synchronized (f18497c) {
            try {
                ArrayList arrayList = f18498d;
                if (arrayList == null) {
                    f18498d = new ArrayList();
                } else {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        WeakReference weakReference = (WeakReference) f18498d.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            f18498d.remove(size);
                        }
                    }
                    for (int size2 = f18498d.size() - 1; size2 >= 0; size2--) {
                        WeakReference weakReference2 = (WeakReference) f18498d.get(size2);
                        O o6 = weakReference2 != null ? (O) weakReference2.get() : null;
                        if (o6 != null && o6.getBaseContext() == context) {
                            return o6;
                        }
                    }
                }
                O o7 = new O(context);
                f18498d.add(new WeakReference(o7));
                return o7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f18499a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f18499a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f18500b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i6) {
        Resources.Theme theme = this.f18500b;
        if (theme == null) {
            super.setTheme(i6);
        } else {
            theme.applyStyle(i6, true);
        }
    }
}
