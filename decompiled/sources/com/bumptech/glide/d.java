package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import com.bumptech.glide.b;
import java.util.List;
import java.util.Map;
import n5.f;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class d extends ContextWrapper {

    /* renamed from: k, reason: collision with root package name */
    public static final m f13170k = new a();

    /* renamed from: a, reason: collision with root package name */
    public final U4.b f13171a;

    /* renamed from: b, reason: collision with root package name */
    public final f.b f13172b;

    /* renamed from: c, reason: collision with root package name */
    public final k5.f f13173c;

    /* renamed from: d, reason: collision with root package name */
    public final b.a f13174d;

    /* renamed from: e, reason: collision with root package name */
    public final List f13175e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f13176f;

    /* renamed from: g, reason: collision with root package name */
    public final T4.k f13177g;

    /* renamed from: h, reason: collision with root package name */
    public final e f13178h;

    /* renamed from: i, reason: collision with root package name */
    public final int f13179i;

    /* renamed from: j, reason: collision with root package name */
    public j5.h f13180j;

    public d(Context context, U4.b bVar, f.b bVar2, k5.f fVar, b.a aVar, Map map, List list, T4.k kVar, e eVar, int i6) {
        super(context.getApplicationContext());
        this.f13171a = bVar;
        this.f13173c = fVar;
        this.f13174d = aVar;
        this.f13175e = list;
        this.f13176f = map;
        this.f13177g = kVar;
        this.f13178h = eVar;
        this.f13179i = i6;
        this.f13172b = n5.f.a(bVar2);
    }

    public k5.i a(ImageView imageView, Class cls) {
        return this.f13173c.a(imageView, cls);
    }

    public U4.b b() {
        return this.f13171a;
    }

    public List c() {
        return this.f13175e;
    }

    public synchronized j5.h d() {
        try {
            if (this.f13180j == null) {
                this.f13180j = (j5.h) this.f13174d.build().L();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f13180j;
    }

    public m e(Class cls) {
        m mVar = (m) this.f13176f.get(cls);
        if (mVar == null) {
            for (Map.Entry entry : this.f13176f.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    mVar = (m) entry.getValue();
                }
            }
        }
        return mVar == null ? f13170k : mVar;
    }

    public T4.k f() {
        return this.f13177g;
    }

    public e g() {
        return this.f13178h;
    }

    public int h() {
        return this.f13179i;
    }

    public i i() {
        return (i) this.f13172b.get();
    }
}
