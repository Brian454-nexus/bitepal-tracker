package S4;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import com.bumptech.glide.g;
import com.bumptech.glide.load.data.d;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class c implements com.bumptech.glide.load.data.d {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f4721a;

    /* renamed from: b, reason: collision with root package name */
    public final e f4722b;

    /* renamed from: c, reason: collision with root package name */
    public InputStream f4723c;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a implements d {

        /* renamed from: b, reason: collision with root package name */
        public static final String[] f4724b = {"_data"};

        /* renamed from: a, reason: collision with root package name */
        public final ContentResolver f4725a;

        public a(ContentResolver contentResolver) {
            this.f4725a = contentResolver;
        }

        @Override // S4.d
        public Cursor a(Uri uri) {
            return this.f4725a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f4724b, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b implements d {

        /* renamed from: b, reason: collision with root package name */
        public static final String[] f4726b = {"_data"};

        /* renamed from: a, reason: collision with root package name */
        public final ContentResolver f4727a;

        public b(ContentResolver contentResolver) {
            this.f4727a = contentResolver;
        }

        @Override // S4.d
        public Cursor a(Uri uri) {
            return this.f4727a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f4726b, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    public c(Uri uri, e eVar) {
        this.f4721a = uri;
        this.f4722b = eVar;
    }

    public static c c(Context context, Uri uri, d dVar) {
        return new c(uri, new e(com.bumptech.glide.b.c(context).j().g(), dVar, com.bumptech.glide.b.c(context).e(), context.getContentResolver()));
    }

    public static c f(Context context, Uri uri) {
        return c(context, uri, new a(context.getContentResolver()));
    }

    public static c g(Context context, Uri uri) {
        return c(context, uri, new b(context.getContentResolver()));
    }

    @Override // com.bumptech.glide.load.data.d
    public Class a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        InputStream inputStream = this.f4723c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }

    @Override // com.bumptech.glide.load.data.d
    public R4.a d() {
        return R4.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public void e(g gVar, d.a aVar) {
        try {
            InputStream h6 = h();
            this.f4723c = h6;
            aVar.f(h6);
        } catch (FileNotFoundException e6) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e6);
            }
            aVar.c(e6);
        }
    }

    public final InputStream h() {
        InputStream d6 = this.f4722b.d(this.f4721a);
        int a6 = d6 != null ? this.f4722b.a(this.f4721a) : -1;
        return a6 != -1 ? new com.bumptech.glide.load.data.g(d6, a6) : d6;
    }
}
