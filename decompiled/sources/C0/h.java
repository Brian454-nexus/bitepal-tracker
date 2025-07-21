package C0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import x0.j;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class h {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {
        public static int a(TextView textView) {
            return textView.getBreakStrategy();
        }

        public static int b(TextView textView) {
            return textView.getHyphenationFrequency();
        }

        public static void c(TextView textView, int i6) {
            textView.setBreakStrategy(i6);
        }

        public static void d(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        public static void e(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }

        public static void f(TextView textView, int i6) {
            textView.setHyphenationFrequency(i6);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b {
        public static DecimalFormatSymbols a(Locale locale) {
            return DecimalFormatSymbols.getInstance(locale);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class c {
        public static String[] a(DecimalFormatSymbols decimalFormatSymbols) {
            return decimalFormatSymbols.getDigitStrings();
        }

        public static PrecomputedText.Params b(TextView textView) {
            return textView.getTextMetricsParams();
        }

        public static void c(TextView textView, int i6) {
            textView.setFirstBaselineToTopHeight(i6);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class d implements ActionMode.Callback {

        /* renamed from: a, reason: collision with root package name */
        public final ActionMode.Callback f454a;

        /* renamed from: b, reason: collision with root package name */
        public final TextView f455b;

        /* renamed from: c, reason: collision with root package name */
        public Class f456c;

        /* renamed from: d, reason: collision with root package name */
        public Method f457d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f458e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f459f = false;

        public d(ActionMode.Callback callback, TextView textView) {
            this.f454a = callback;
            this.f455b = textView;
        }

        public final Intent a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }

        public final Intent b(ResolveInfo resolveInfo, TextView textView) {
            Intent putExtra = a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !d(textView));
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            return putExtra.setClassName(activityInfo.packageName, activityInfo.name);
        }

        public final List c(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (context instanceof Activity) {
                for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(a(), 0)) {
                    if (e(resolveInfo, context)) {
                        arrayList.add(resolveInfo);
                    }
                }
            }
            return arrayList;
        }

        public final boolean d(TextView textView) {
            return (textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled();
        }

        public final boolean e(ResolveInfo resolveInfo, Context context) {
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!activityInfo.exported) {
                return false;
            }
            String str = activityInfo.permission;
            return str == null || context.checkSelfPermission(str) == 0;
        }

        public final void f(Menu menu) {
            Context context = this.f455b.getContext();
            PackageManager packageManager = context.getPackageManager();
            boolean z6 = this.f459f;
            Class cls = Integer.TYPE;
            if (!z6) {
                this.f459f = true;
                try {
                    Class<?> cls2 = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f456c = cls2;
                    this.f457d = cls2.getDeclaredMethod("removeItemAt", cls);
                    this.f458e = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f456c = null;
                    this.f457d = null;
                    this.f458e = false;
                }
            }
            try {
                Method declaredMethod = (this.f458e && this.f456c.isInstance(menu)) ? this.f457d : menu.getClass().getDeclaredMethod("removeItemAt", cls);
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        declaredMethod.invoke(menu, Integer.valueOf(size));
                    }
                }
                List c6 = c(context, packageManager);
                for (int i6 = 0; i6 < c6.size(); i6++) {
                    ResolveInfo resolveInfo = (ResolveInfo) c6.get(i6);
                    menu.add(0, 0, i6 + 100, resolveInfo.loadLabel(packageManager)).setIntent(b(resolveInfo, this.f455b)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f454a.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f454a.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            this.f454a.onDestroyActionMode(actionMode);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            f(menu);
            return this.f454a.onPrepareActionMode(actionMode, menu);
        }
    }

    public static int a(TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    public static int b(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    public static int c(TextDirectionHeuristic textDirectionHeuristic) {
        TextDirectionHeuristic textDirectionHeuristic2;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        if (textDirectionHeuristic == textDirectionHeuristic3 || textDirectionHeuristic == (textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == textDirectionHeuristic2) {
            return 6;
        }
        return textDirectionHeuristic == textDirectionHeuristic3 ? 7 : 1;
    }

    public static TextDirectionHeuristic d(TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        if (Build.VERSION.SDK_INT >= 28 && (textView.getInputType() & 15) == 3) {
            byte directionality = Character.getDirectionality(c.a(b.a(textView.getTextLocale()))[0].codePointAt(0));
            return (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        boolean z6 = textView.getLayoutDirection() == 1;
        switch (textView.getTextDirection()) {
            case 2:
                return TextDirectionHeuristics.ANYRTL_LTR;
            case 3:
                return TextDirectionHeuristics.LTR;
            case 4:
                return TextDirectionHeuristics.RTL;
            case 5:
                return TextDirectionHeuristics.LOCALE;
            case 6:
                return TextDirectionHeuristics.FIRSTSTRONG_LTR;
            case 7:
                return TextDirectionHeuristics.FIRSTSTRONG_RTL;
            default:
                return z6 ? TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
    }

    public static j.a e(TextView textView) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new j.a(c.b(textView));
        }
        j.a.C0270a c0270a = new j.a.C0270a(new TextPaint(textView.getPaint()));
        c0270a.b(a.a(textView));
        c0270a.c(a.b(textView));
        c0270a.d(d(textView));
        return c0270a.a();
    }

    public static void f(TextView textView, ColorStateList colorStateList) {
        y0.g.f(textView);
        a.d(textView, colorStateList);
    }

    public static void g(TextView textView, PorterDuff.Mode mode) {
        y0.g.f(textView);
        a.e(textView, mode);
    }

    public static void h(TextView textView, int i6) {
        y0.g.e(i6);
        if (Build.VERSION.SDK_INT >= 28) {
            c.c(textView, i6);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i7 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i6 > Math.abs(i7)) {
            textView.setPadding(textView.getPaddingLeft(), i6 + i7, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void i(TextView textView, int i6) {
        y0.g.e(i6);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i7 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i6 > Math.abs(i7)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i6 - i7);
        }
    }

    public static void j(TextView textView, int i6) {
        y0.g.e(i6);
        if (i6 != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i6 - r0, 1.0f);
        }
    }

    public static void k(TextView textView, j jVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        e(textView);
        throw null;
    }

    public static void l(TextView textView, j.a aVar) {
        textView.setTextDirection(c(aVar.d()));
        textView.getPaint().set(aVar.e());
        a.c(textView, aVar.b());
        a.f(textView, aVar.c());
    }

    public static ActionMode.Callback m(TextView textView, ActionMode.Callback callback) {
        return (Build.VERSION.SDK_INT > 27 || (callback instanceof d) || callback == null) ? callback : new d(callback, textView);
    }
}
