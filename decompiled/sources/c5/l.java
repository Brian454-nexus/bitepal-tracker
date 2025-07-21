package c5;

import T4.v;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class l implements R4.j {

    /* renamed from: b, reason: collision with root package name */
    public static final R4.g f10765b = R4.g.e("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme");

    /* renamed from: a, reason: collision with root package name */
    public final Context f10766a;

    public l(Context context) {
        this.f10766a = context.getApplicationContext();
    }

    @Override // R4.j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public v a(Uri uri, int i6, int i7, R4.h hVar) {
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            Context d6 = d(uri, authority);
            int g6 = g(d6, uri);
            Resources.Theme theme = ((String) n5.k.d(authority)).equals(this.f10766a.getPackageName()) ? (Resources.Theme) hVar.c(f10765b) : null;
            return k.e(theme == null ? i.b(this.f10766a, d6, g6) : i.a(this.f10766a, g6, theme));
        }
        throw new IllegalStateException("Package name for " + uri + " is null or empty");
    }

    public final Context d(Uri uri, String str) {
        if (str.equals(this.f10766a.getPackageName())) {
            return this.f10766a;
        }
        try {
            return this.f10766a.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e6) {
            if (str.contains(this.f10766a.getPackageName())) {
                return this.f10766a;
            }
            throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e6);
        }
    }

    public final int e(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e6) {
            throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e6);
        }
    }

    public final int f(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        String authority = uri.getAuthority();
        String str = pathSegments.get(0);
        String str2 = pathSegments.get(1);
        int identifier = context.getResources().getIdentifier(str2, str, authority);
        if (identifier == 0) {
            identifier = Resources.getSystem().getIdentifier(str2, str, "android");
        }
        if (identifier != 0) {
            return identifier;
        }
        throw new IllegalArgumentException("Failed to find resource id for: " + uri);
    }

    public final int g(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return f(context, uri);
        }
        if (pathSegments.size() == 1) {
            return e(uri);
        }
        throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
    }

    @Override // R4.j
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean b(Uri uri, R4.h hVar) {
        String scheme = uri.getScheme();
        return scheme != null && scheme.equals("android.resource");
    }
}
