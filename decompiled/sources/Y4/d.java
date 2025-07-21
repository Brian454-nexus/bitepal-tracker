package Y4;

import R4.h;
import X4.n;
import X4.o;
import X4.r;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.g;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class d implements n {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6573a;

    /* renamed from: b, reason: collision with root package name */
    public final n f6574b;

    /* renamed from: c, reason: collision with root package name */
    public final n f6575c;

    /* renamed from: d, reason: collision with root package name */
    public final Class f6576d;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class a implements o {

        /* renamed from: a, reason: collision with root package name */
        public final Context f6577a;

        /* renamed from: b, reason: collision with root package name */
        public final Class f6578b;

        public a(Context context, Class cls) {
            this.f6577a = context;
            this.f6578b = cls;
        }

        @Override // X4.o
        public final n d(r rVar) {
            return new d(this.f6577a, rVar.d(File.class, this.f6578b), rVar.d(Uri.class, this.f6578b), this.f6578b);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends a {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c extends a {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* renamed from: Y4.d$d, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class C0113d implements com.bumptech.glide.load.data.d {

        /* renamed from: k, reason: collision with root package name */
        public static final String[] f6579k = {"_data"};

        /* renamed from: a, reason: collision with root package name */
        public final Context f6580a;

        /* renamed from: b, reason: collision with root package name */
        public final n f6581b;

        /* renamed from: c, reason: collision with root package name */
        public final n f6582c;

        /* renamed from: d, reason: collision with root package name */
        public final Uri f6583d;

        /* renamed from: e, reason: collision with root package name */
        public final int f6584e;

        /* renamed from: f, reason: collision with root package name */
        public final int f6585f;

        /* renamed from: g, reason: collision with root package name */
        public final h f6586g;

        /* renamed from: h, reason: collision with root package name */
        public final Class f6587h;

        /* renamed from: i, reason: collision with root package name */
        public volatile boolean f6588i;

        /* renamed from: j, reason: collision with root package name */
        public volatile com.bumptech.glide.load.data.d f6589j;

        public C0113d(Context context, n nVar, n nVar2, Uri uri, int i6, int i7, h hVar, Class cls) {
            this.f6580a = context.getApplicationContext();
            this.f6581b = nVar;
            this.f6582c = nVar2;
            this.f6583d = uri;
            this.f6584e = i6;
            this.f6585f = i7;
            this.f6586g = hVar;
            this.f6587h = cls;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return this.f6587h;
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            com.bumptech.glide.load.data.d dVar = this.f6589j;
            if (dVar != null) {
                dVar.b();
            }
        }

        public final n.a c() {
            boolean isExternalStorageLegacy;
            isExternalStorageLegacy = Environment.isExternalStorageLegacy();
            if (isExternalStorageLegacy) {
                return this.f6581b.a(h(this.f6583d), this.f6584e, this.f6585f, this.f6586g);
            }
            if (S4.b.a(this.f6583d)) {
                return this.f6582c.a(this.f6583d, this.f6584e, this.f6585f, this.f6586g);
            }
            return this.f6582c.a(g() ? MediaStore.setRequireOriginal(this.f6583d) : this.f6583d, this.f6584e, this.f6585f, this.f6586g);
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
            this.f6588i = true;
            com.bumptech.glide.load.data.d dVar = this.f6589j;
            if (dVar != null) {
                dVar.cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public R4.a d() {
            return R4.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(g gVar, d.a aVar) {
            try {
                com.bumptech.glide.load.data.d f6 = f();
                if (f6 == null) {
                    aVar.c(new IllegalArgumentException("Failed to build fetcher for: " + this.f6583d));
                    return;
                }
                this.f6589j = f6;
                if (this.f6588i) {
                    cancel();
                } else {
                    f6.e(gVar, aVar);
                }
            } catch (FileNotFoundException e6) {
                aVar.c(e6);
            }
        }

        public final com.bumptech.glide.load.data.d f() {
            n.a c6 = c();
            if (c6 != null) {
                return c6.f6278c;
            }
            return null;
        }

        public final boolean g() {
            return this.f6580a.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0;
        }

        public final File h(Uri uri) {
            try {
                Cursor query = this.f6580a.getContentResolver().query(uri, f6579k, null, null, null);
                if (query == null || !query.moveToFirst()) {
                    throw new FileNotFoundException("Failed to media store entry for: " + uri);
                }
                String string = query.getString(query.getColumnIndexOrThrow("_data"));
                if (!TextUtils.isEmpty(string)) {
                    File file = new File(string);
                    query.close();
                    return file;
                }
                throw new FileNotFoundException("File path was empty in media store for: " + uri);
            } finally {
            }
        }
    }

    public d(Context context, n nVar, n nVar2, Class cls) {
        this.f6573a = context.getApplicationContext();
        this.f6574b = nVar;
        this.f6575c = nVar2;
        this.f6576d = cls;
    }

    @Override // X4.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a a(Uri uri, int i6, int i7, h hVar) {
        return new n.a(new m5.b(uri), new C0113d(this.f6573a, this.f6574b, this.f6575c, uri, i6, i7, hVar, this.f6576d));
    }

    @Override // X4.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && S4.b.c(uri);
    }
}
