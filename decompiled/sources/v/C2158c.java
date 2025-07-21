package v;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.LocaleList;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import java.util.ArrayList;
import n0.AbstractC1809a;
import v.C2156a;

/* renamed from: v.c, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C2158c {

    /* renamed from: a, reason: collision with root package name */
    public final Intent f19262a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f19263b;

    /* renamed from: v.c$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {
        public static ActivityOptions a() {
            return ActivityOptions.makeBasic();
        }
    }

    /* renamed from: v.c$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b {
        public static String a() {
            LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
            if (adjustedDefault.size() > 0) {
                return adjustedDefault.get(0).toLanguageTag();
            }
            return null;
        }
    }

    /* renamed from: v.c$c, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class C0253c {
        public static void a(ActivityOptions activityOptions, boolean z6) {
            activityOptions.setShareIdentityEnabled(z6);
        }
    }

    /* renamed from: v.c$d */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class d {

        /* renamed from: c, reason: collision with root package name */
        public ArrayList f19266c;

        /* renamed from: d, reason: collision with root package name */
        public ActivityOptions f19267d;

        /* renamed from: e, reason: collision with root package name */
        public ArrayList f19268e;

        /* renamed from: f, reason: collision with root package name */
        public SparseArray f19269f;

        /* renamed from: g, reason: collision with root package name */
        public Bundle f19270g;

        /* renamed from: j, reason: collision with root package name */
        public boolean f19273j;

        /* renamed from: a, reason: collision with root package name */
        public final Intent f19264a = new Intent("android.intent.action.VIEW");

        /* renamed from: b, reason: collision with root package name */
        public final C2156a.C0252a f19265b = new C2156a.C0252a();

        /* renamed from: h, reason: collision with root package name */
        public int f19271h = 0;

        /* renamed from: i, reason: collision with root package name */
        public boolean f19272i = true;

        public C2158c a() {
            if (!this.f19264a.hasExtra("android.support.customtabs.extra.SESSION")) {
                c(null, null);
            }
            ArrayList<? extends Parcelable> arrayList = this.f19266c;
            if (arrayList != null) {
                this.f19264a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<? extends Parcelable> arrayList2 = this.f19268e;
            if (arrayList2 != null) {
                this.f19264a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f19264a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f19272i);
            this.f19264a.putExtras(this.f19265b.a().a());
            Bundle bundle = this.f19270g;
            if (bundle != null) {
                this.f19264a.putExtras(bundle);
            }
            if (this.f19269f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f19269f);
                this.f19264a.putExtras(bundle2);
            }
            this.f19264a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f19271h);
            int i6 = Build.VERSION.SDK_INT;
            b();
            if (i6 >= 34) {
                d();
            }
            ActivityOptions activityOptions = this.f19267d;
            return new C2158c(this.f19264a, activityOptions != null ? activityOptions.toBundle() : null);
        }

        public final void b() {
            String a6 = b.a();
            if (TextUtils.isEmpty(a6)) {
                return;
            }
            Bundle bundleExtra = this.f19264a.hasExtra("com.android.browser.headers") ? this.f19264a.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (bundleExtra.containsKey("Accept-Language")) {
                return;
            }
            bundleExtra.putString("Accept-Language", a6);
            this.f19264a.putExtra("com.android.browser.headers", bundleExtra);
        }

        public final void c(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.f19264a.putExtras(bundle);
        }

        public final void d() {
            if (this.f19267d == null) {
                this.f19267d = a.a();
            }
            C0253c.a(this.f19267d, this.f19273j);
        }

        public d e(boolean z6) {
            this.f19264a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", z6 ? 1 : 0);
            return this;
        }
    }

    public C2158c(Intent intent, Bundle bundle) {
        this.f19262a = intent;
        this.f19263b = bundle;
    }

    public void a(Context context, Uri uri) {
        this.f19262a.setData(uri);
        AbstractC1809a.startActivity(context, this.f19262a, this.f19263b);
    }
}
