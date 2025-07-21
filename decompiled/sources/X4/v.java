package X4;

import X4.n;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.InputStream;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class v implements n {

    /* renamed from: a, reason: collision with root package name */
    public final n f6311a;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a implements o {
        @Override // X4.o
        public n d(r rVar) {
            return new v(rVar.d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b implements o {
        @Override // X4.o
        public n d(r rVar) {
            return new v(rVar.d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class c implements o {
        @Override // X4.o
        public n d(r rVar) {
            return new v(rVar.d(Uri.class, InputStream.class));
        }
    }

    public v(n nVar) {
        this.f6311a = nVar;
    }

    public static Uri e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) == '/') {
            return f(str);
        }
        Uri parse = Uri.parse(str);
        return parse.getScheme() == null ? f(str) : parse;
    }

    public static Uri f(String str) {
        return Uri.fromFile(new File(str));
    }

    @Override // X4.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a a(String str, int i6, int i7, R4.h hVar) {
        Uri e6 = e(str);
        if (e6 == null || !this.f6311a.b(e6)) {
            return null;
        }
        return this.f6311a.a(e6, i6, i7, hVar);
    }

    @Override // X4.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(String str) {
        return true;
    }
}
