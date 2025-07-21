package K2;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.webkit.WebResourceResponse;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final List f2992a;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f2993a = false;

        /* renamed from: b, reason: collision with root package name */
        public String f2994b = "appassets.androidplatform.net";

        /* renamed from: c, reason: collision with root package name */
        public List f2995c = new ArrayList();

        public a a(String str, InterfaceC0054c interfaceC0054c) {
            this.f2995c.add(new d(this.f2994b, str, this.f2993a, interfaceC0054c));
            return this;
        }

        public c b() {
            return new c(this.f2995c);
        }

        public a c(String str) {
            this.f2994b = str;
            return this;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b implements InterfaceC0054c {

        /* renamed from: b, reason: collision with root package name */
        public static final String[] f2996b = {"app_webview/", "databases/", "lib/", "shared_prefs/", "code_cache/"};

        /* renamed from: a, reason: collision with root package name */
        public final File f2997a;

        public b(Context context, File file) {
            try {
                this.f2997a = new File(L2.a.a(file));
                if (b(context)) {
                    return;
                }
                throw new IllegalArgumentException("The given directory \"" + file + "\" doesn't exist under an allowed app internal storage directory");
            } catch (IOException e6) {
                throw new IllegalArgumentException("Failed to resolve the canonical path for the given directory: " + file.getPath(), e6);
            }
        }

        @Override // K2.c.InterfaceC0054c
        public WebResourceResponse a(String str) {
            File b6;
            try {
                b6 = L2.a.b(this.f2997a, str);
            } catch (IOException e6) {
                Log.e("WebViewAssetLoader", "Error opening the requested path: " + str, e6);
            }
            if (b6 != null) {
                return new WebResourceResponse(L2.a.d(str), null, L2.a.f(b6));
            }
            Log.e("WebViewAssetLoader", String.format("The requested file: %s is outside the mounted directory: %s", str, this.f2997a));
            return new WebResourceResponse(null, null, null);
        }

        public final boolean b(Context context) {
            String a6 = L2.a.a(this.f2997a);
            String a7 = L2.a.a(context.getCacheDir());
            String a8 = L2.a.a(L2.a.c(context));
            if ((!a6.startsWith(a7) && !a6.startsWith(a8)) || a6.equals(a7) || a6.equals(a8)) {
                return false;
            }
            for (String str : f2996b) {
                if (a6.startsWith(a8 + str)) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: K2.c$c, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface InterfaceC0054c {
        WebResourceResponse a(String str);
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f2998a;

        /* renamed from: b, reason: collision with root package name */
        public final String f2999b;

        /* renamed from: c, reason: collision with root package name */
        public final String f3000c;

        /* renamed from: d, reason: collision with root package name */
        public final InterfaceC0054c f3001d;

        public d(String str, String str2, boolean z6, InterfaceC0054c interfaceC0054c) {
            if (str2.isEmpty() || str2.charAt(0) != '/') {
                throw new IllegalArgumentException("Path should start with a slash '/'.");
            }
            if (!str2.endsWith("/")) {
                throw new IllegalArgumentException("Path should end with a slash '/'");
            }
            this.f2999b = str;
            this.f3000c = str2;
            this.f2998a = z6;
            this.f3001d = interfaceC0054c;
        }

        public String a(String str) {
            return str.replaceFirst(this.f3000c, "");
        }

        public InterfaceC0054c b(Uri uri) {
            if (uri.getScheme().equals("http") && !this.f2998a) {
                return null;
            }
            if ((uri.getScheme().equals("http") || uri.getScheme().equals("https")) && uri.getAuthority().equals(this.f2999b) && uri.getPath().startsWith(this.f3000c)) {
                return this.f3001d;
            }
            return null;
        }
    }

    public c(List list) {
        this.f2992a = list;
    }

    public WebResourceResponse a(Uri uri) {
        WebResourceResponse a6;
        for (d dVar : this.f2992a) {
            InterfaceC0054c b6 = dVar.b(uri);
            if (b6 != null && (a6 = b6.a(dVar.a(uri.getPath()))) != null) {
                return a6;
            }
        }
        return null;
    }
}
