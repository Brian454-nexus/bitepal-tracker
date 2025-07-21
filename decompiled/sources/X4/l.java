package X4;

import X4.n;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileNotFoundException;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class l implements n {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6265a;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a implements o {

        /* renamed from: a, reason: collision with root package name */
        public final Context f6266a;

        public a(Context context) {
            this.f6266a = context;
        }

        @Override // X4.o
        public n d(r rVar) {
            return new l(this.f6266a);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b implements com.bumptech.glide.load.data.d {

        /* renamed from: c, reason: collision with root package name */
        public static final String[] f6267c = {"_data"};

        /* renamed from: a, reason: collision with root package name */
        public final Context f6268a;

        /* renamed from: b, reason: collision with root package name */
        public final Uri f6269b;

        public b(Context context, Uri uri) {
            this.f6268a = context;
            this.f6269b = uri;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return File.class;
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public R4.a d() {
            return R4.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.g gVar, d.a aVar) {
            Cursor query = this.f6268a.getContentResolver().query(this.f6269b, f6267c, null, null, null);
            if (query != null) {
                try {
                    r0 = query.moveToFirst() ? query.getString(query.getColumnIndexOrThrow("_data")) : null;
                    query.close();
                } catch (Throwable th) {
                    query.close();
                    throw th;
                }
            }
            if (!TextUtils.isEmpty(r0)) {
                aVar.f(new File(r0));
                return;
            }
            aVar.c(new FileNotFoundException("Failed to find file path for: " + this.f6269b));
        }
    }

    public l(Context context) {
        this.f6265a = context;
    }

    @Override // X4.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a a(Uri uri, int i6, int i7, R4.h hVar) {
        return new n.a(new m5.b(uri), new b(this.f6265a, uri));
    }

    @Override // X4.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Uri uri) {
        return S4.b.c(uri);
    }
}
