package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class l implements d {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f13281a;

    /* renamed from: b, reason: collision with root package name */
    public final ContentResolver f13282b;

    /* renamed from: c, reason: collision with root package name */
    public Object f13283c;

    public l(ContentResolver contentResolver, Uri uri) {
        this.f13282b = contentResolver;
        this.f13281a = uri;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        Object obj = this.f13283c;
        if (obj != null) {
            try {
                c(obj);
            } catch (IOException unused) {
            }
        }
    }

    public abstract void c(Object obj);

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }

    @Override // com.bumptech.glide.load.data.d
    public R4.a d() {
        return R4.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(com.bumptech.glide.g gVar, d.a aVar) {
        try {
            Object f6 = f(this.f13281a, this.f13282b);
            this.f13283c = f6;
            aVar.f(f6);
        } catch (FileNotFoundException e6) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e6);
            }
            aVar.c(e6);
        }
    }

    public abstract Object f(Uri uri, ContentResolver contentResolver);
}
