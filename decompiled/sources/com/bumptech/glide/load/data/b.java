package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.io.IOException;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final String f13257a;

    /* renamed from: b, reason: collision with root package name */
    public final AssetManager f13258b;

    /* renamed from: c, reason: collision with root package name */
    public Object f13259c;

    public b(AssetManager assetManager, String str) {
        this.f13258b = assetManager;
        this.f13257a = str;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        Object obj = this.f13259c;
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
    public void e(com.bumptech.glide.g gVar, d.a aVar) {
        try {
            Object f6 = f(this.f13258b, this.f13257a);
            this.f13259c = f6;
            aVar.f(f6);
        } catch (IOException e6) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e6);
            }
            aVar.c(e6);
        }
    }

    public abstract Object f(AssetManager assetManager, String str);
}
