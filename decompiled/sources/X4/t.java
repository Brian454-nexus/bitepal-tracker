package X4;

import X4.n;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.util.Log;
import java.io.InputStream;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class t implements n {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6306a;

    /* renamed from: b, reason: collision with root package name */
    public final n f6307b;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a implements o {

        /* renamed from: a, reason: collision with root package name */
        public final Context f6308a;

        public a(Context context) {
            this.f6308a = context;
        }

        @Override // X4.o
        public n d(r rVar) {
            return new t(this.f6308a, rVar.d(Integer.class, AssetFileDescriptor.class));
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b implements o {

        /* renamed from: a, reason: collision with root package name */
        public final Context f6309a;

        public b(Context context) {
            this.f6309a = context;
        }

        @Override // X4.o
        public n d(r rVar) {
            return new t(this.f6309a, rVar.d(Integer.class, InputStream.class));
        }
    }

    public t(Context context, n nVar) {
        this.f6306a = context.getApplicationContext();
        this.f6307b = nVar;
    }

    public static o e(Context context) {
        return new a(context);
    }

    public static o f(Context context) {
        return new b(context);
    }

    @Override // X4.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a a(Uri uri, int i6, int i7, R4.h hVar) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 1) {
            return g(uri, i6, i7, hVar);
        }
        if (pathSegments.size() == 2) {
            return h(uri, i6, i7, hVar);
        }
        if (!Log.isLoggable("ResourceUriLoader", 5)) {
            return null;
        }
        Log.w("ResourceUriLoader", "Failed to parse resource uri: " + uri);
        return null;
    }

    @Override // X4.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Uri uri) {
        return "android.resource".equals(uri.getScheme()) && this.f6306a.getPackageName().equals(uri.getAuthority());
    }

    public final n.a g(Uri uri, int i6, int i7, R4.h hVar) {
        try {
            int parseInt = Integer.parseInt(uri.getPathSegments().get(0));
            if (parseInt != 0) {
                return this.f6307b.a(Integer.valueOf(parseInt), i6, i7, hVar);
            }
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri);
            }
            return null;
        } catch (NumberFormatException e6) {
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                Log.w("ResourceUriLoader", "Failed to parse resource id from: " + uri, e6);
            }
            return null;
        }
    }

    public final n.a h(Uri uri, int i6, int i7, R4.h hVar) {
        List<String> pathSegments = uri.getPathSegments();
        int identifier = this.f6306a.getResources().getIdentifier(pathSegments.get(1), pathSegments.get(0), this.f6306a.getPackageName());
        if (identifier != 0) {
            return this.f6307b.a(Integer.valueOf(identifier), i6, i7, hVar);
        }
        if (!Log.isLoggable("ResourceUriLoader", 5)) {
            return null;
        }
        Log.w("ResourceUriLoader", "Failed to find resource id for: " + uri);
        return null;
    }
}
