package a5;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class r implements R4.l {

    /* renamed from: b, reason: collision with root package name */
    public final R4.l f7781b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7782c;

    public r(R4.l lVar, boolean z6) {
        this.f7781b = lVar;
        this.f7782c = z6;
    }

    @Override // R4.f
    public void a(MessageDigest messageDigest) {
        this.f7781b.a(messageDigest);
    }

    @Override // R4.l
    public T4.v b(Context context, T4.v vVar, int i6, int i7) {
        U4.d f6 = com.bumptech.glide.b.c(context).f();
        Drawable drawable = (Drawable) vVar.get();
        T4.v a6 = q.a(f6, drawable, i6, i7);
        if (a6 != null) {
            T4.v b6 = this.f7781b.b(context, a6, i6, i7);
            if (!b6.equals(a6)) {
                return d(context, b6);
            }
            b6.a();
            return vVar;
        }
        if (!this.f7782c) {
            return vVar;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    public R4.l c() {
        return this;
    }

    public final T4.v d(Context context, T4.v vVar) {
        return x.e(context.getResources(), vVar);
    }

    @Override // R4.f
    public boolean equals(Object obj) {
        if (obj instanceof r) {
            return this.f7781b.equals(((r) obj).f7781b);
        }
        return false;
    }

    @Override // R4.f
    public int hashCode() {
        return this.f7781b.hashCode();
    }
}
