package com.amazon.a.a.i;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.amazon.a.a.i.c;
import com.amazon.a.a.i.h;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Locale;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class g extends h implements com.amazon.a.a.k.d {

    /* renamed from: b, reason: collision with root package name */
    public static final long f10963b = 31536000;

    /* renamed from: e, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f10964e = new com.amazon.a.a.o.c("ShutdownPrompt");

    /* renamed from: f, reason: collision with root package name */
    private static final String f10965f = "https://www.amazon.com/appstore-error-help";

    /* renamed from: g, reason: collision with root package name */
    private static final String f10966g = "badcert";

    /* renamed from: h, reason: collision with root package name */
    private static final String f10967h = "1.1";

    /* renamed from: i, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.a.a f10968i;

    /* renamed from: j, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.m.c f10969j;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a extends AsyncTask<Void, Void, Void> {

        /* renamed from: a, reason: collision with root package name */
        private final com.amazon.a.a.a.a f10970a;

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            return null;
        }

        private a(com.amazon.a.a.a.a aVar) {
            this.f10970a = aVar;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void r12) {
            g.b(this.f10970a);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b extends AsyncTask<Intent, Void, Void> {

        /* renamed from: a, reason: collision with root package name */
        private final Context f10971a;

        /* renamed from: b, reason: collision with root package name */
        private final com.amazon.a.a.a.a f10972b;

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Intent... intentArr) {
            this.f10971a.startActivity(intentArr[0]);
            return null;
        }

        private b(Context context, com.amazon.a.a.a.a aVar) {
            this.f10971a = context;
            this.f10972b = aVar;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void r12) {
            g.b(this.f10972b);
        }
    }

    public g(c cVar) {
        super(cVar, h.a.EXTENDED);
        f10964e.a("new ShutdownPrompt called!");
    }

    private String n() {
        return Locale.getDefault().getLanguage() + "_" + Locale.getDefault().getCountry();
    }

    @Override // com.amazon.a.a.e.a
    public void b() {
        this.f10968i.g();
    }

    @Override // com.amazon.a.a.e.c
    public long h() {
        return f10963b;
    }

    @Override // com.amazon.a.a.i.h
    public void i() {
        a(0);
    }

    public void m() {
        com.amazon.a.a.o.c cVar = f10964e;
        cVar.a("Store contains " + this.f10969j.toString());
        if (!((h) this).f10975c.i()) {
            cVar.a("Should not show fixup");
            new a(this.f10968i).execute(new Void[0]);
        } else {
            cVar.a("Should show fixup");
            Activity a6 = this.f10968i.a();
            a(a6, a((Context) a6));
            cVar.a("Attempted to start browser.");
        }
    }

    public String toString() {
        return "ShutdownPrompt";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(com.amazon.a.a.a.a aVar) {
        com.amazon.a.a.o.c cVar = f10964e;
        cVar.a("doShutdown()");
        cVar.c("Killing application");
        System.exit(0);
    }

    @Override // com.amazon.a.a.i.h
    public void a(int i6) {
        com.amazon.a.a.o.c cVar = f10964e;
        cVar.a("doAction(" + i6 + ")");
        c.a[] c6 = ((h) this).f10975c.c();
        c.a aVar = c.a.DEFAULT;
        c.a aVar2 = i6 < c6.length ? c6[i6] : aVar;
        if (aVar2 == c.a.HELP) {
            cVar.a("doAction() help");
            m();
        } else if (aVar2 == c.a.DEEPLINK) {
            cVar.a("doAction() deeplink");
            a(f10966g);
        } else if (aVar2 == aVar) {
            b(this.f10968i);
        }
    }

    private String b(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager == null) {
            f10964e.a("tm was null!");
            return null;
        }
        com.amazon.a.a.o.c cVar = f10964e;
        cVar.a("tm was not null.");
        int simState = telephonyManager.getSimState();
        if (simState != 5) {
            cVar.a("SIM not ready, returning null.  State was " + simState);
            return null;
        }
        return telephonyManager.getSimOperator();
    }

    private boolean b(Context context, Intent intent) {
        intent.addFlags(268435456);
        return intent.resolveActivity(context.getPackageManager()) != null;
    }

    private final Intent a(Context context) {
        String packageName = context.getPackageName();
        StringBuilder sb = new StringBuilder(f10965f);
        PackageManager packageManager = context.getPackageManager();
        a(sb, "?k=", f10967h);
        a(sb, "&m=", ((h) this).f10975c.e());
        a(sb, "&ec=", String.valueOf(((h) this).f10975c.g()));
        String str = (String) this.f10969j.a(com.amazon.a.a.m.c.f11029f);
        if (str != null) {
            a(sb, "&t=", str);
            a(sb, "&tv=", str, packageManager);
        }
        String str2 = (String) this.f10969j.a(com.amazon.a.a.m.c.f11030g);
        if (str2 != null) {
            a(sb, "&c=", str2);
        }
        String str3 = (String) this.f10969j.a(com.amazon.a.a.m.c.f11027d);
        if (str3 != null) {
            a(sb, "&e=", str3);
        }
        String str4 = Build.PRODUCT;
        if (str4 != null) {
            a(sb, "&d=", str4);
        }
        String str5 = Build.MANUFACTURER;
        if (str5 != null) {
            a(sb, "&ma=", str5);
        }
        String str6 = Build.MODEL;
        if (str6 != null) {
            a(sb, "&mo=", str6);
        }
        String str7 = Build.ID;
        if (str7 != null) {
            a(sb, "&bn=", str7);
        }
        a(sb, "&sz=", String.valueOf(context.getResources().getConfiguration().screenLayout & 15));
        a(sb, "&s=", String.valueOf(Build.VERSION.SDK_INT));
        a(sb, "&p=", packageName);
        a(sb, "&pv=", packageName, packageManager);
        a(sb, "&l=", n());
        String b6 = b(context);
        if (!TextUtils.isEmpty(b6)) {
            a(sb, "&mc=", b6);
        }
        String sb2 = sb.toString();
        f10964e.a("Starting browser for uri " + sb2);
        return new Intent("android.intent.action.VIEW", Uri.parse(sb2));
    }

    private final void a(StringBuilder sb, String str, String str2, PackageManager packageManager) {
        try {
            a(sb, str, String.valueOf(packageManager.getPackageInfo(str2, 0).versionCode));
        } catch (PackageManager.NameNotFoundException unused) {
            f10964e.b("Could not find information for package " + str2);
        }
    }

    private final void a(StringBuilder sb, String str, String str2) {
        try {
            String encode = URLEncoder.encode(str2, "UTF-8");
            sb.append(str);
            sb.append(encode);
        } catch (UnsupportedEncodingException e6) {
            f10964e.b("Failed to URL-encode argument", e6);
        }
    }

    private void a(String str) {
        f10964e.a("Attempting to deep link to appstore.");
        Activity a6 = this.f10968i.a();
        a(a6, a(a6, str));
    }

    private Intent a(Context context, String str) {
        return new Intent("android.intent.action.VIEW", Uri.parse("amzn://apps/android?p=" + context.getPackageName() + "&ref=" + str));
    }

    private void a(Context context, Intent intent) {
        if (!b(context, intent)) {
            f10964e.b("Could not start activity, nothing resolves for the given data.");
            b(this.f10968i);
        } else {
            new b(context, this.f10968i).execute(intent);
        }
    }

    @Override // com.amazon.a.a.i.h
    public boolean a(c.a aVar) {
        Intent a6;
        if (aVar == c.a.DEFAULT) {
            return true;
        }
        Activity a7 = this.f10968i.a();
        if (aVar == c.a.DEEPLINK) {
            a6 = a(a7, f10966g);
        } else {
            a6 = aVar == c.a.HELP ? a((Context) a7) : null;
        }
        if (a6 == null) {
            f10964e.b("Unexpected action " + aVar + ", could not create intent.");
            return false;
        }
        return b(a7, a6);
    }
}
