package U4;

import android.graphics.Bitmap;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class j implements d {

    /* renamed from: k, reason: collision with root package name */
    public static final Bitmap.Config f5239k = Bitmap.Config.ARGB_8888;

    /* renamed from: a, reason: collision with root package name */
    public final k f5240a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f5241b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5242c;

    /* renamed from: d, reason: collision with root package name */
    public final a f5243d;

    /* renamed from: e, reason: collision with root package name */
    public long f5244e;

    /* renamed from: f, reason: collision with root package name */
    public long f5245f;

    /* renamed from: g, reason: collision with root package name */
    public int f5246g;

    /* renamed from: h, reason: collision with root package name */
    public int f5247h;

    /* renamed from: i, reason: collision with root package name */
    public int f5248i;

    /* renamed from: j, reason: collision with root package name */
    public int f5249j;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface a {
        void a(Bitmap bitmap);

        void b(Bitmap bitmap);
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b implements a {
        @Override // U4.j.a
        public void a(Bitmap bitmap) {
        }

        @Override // U4.j.a
        public void b(Bitmap bitmap) {
        }
    }

    public j(long j6, k kVar, Set set) {
        this.f5242c = j6;
        this.f5244e = j6;
        this.f5240a = kVar;
        this.f5241b = set;
        this.f5243d = new b();
    }

    public static void f(Bitmap.Config config) {
        if (config != Bitmap.Config.HARDWARE) {
            return;
        }
        throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
    }

    public static Bitmap g(int i6, int i7, Bitmap.Config config) {
        if (config == null) {
            config = f5239k;
        }
        return Bitmap.createBitmap(i6, i7, config);
    }

    public static Set k() {
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        hashSet.add(null);
        hashSet.remove(Bitmap.Config.HARDWARE);
        return Collections.unmodifiableSet(hashSet);
    }

    public static k l() {
        return new m();
    }

    public static void o(Bitmap bitmap) {
        bitmap.setPremultiplied(true);
    }

    public static void p(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        o(bitmap);
    }

    @Override // U4.d
    public void a(int i6) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i6);
        }
        if (i6 >= 40 || i6 >= 20) {
            b();
        } else if (i6 >= 20 || i6 == 15) {
            q(n() / 2);
        }
    }

    @Override // U4.d
    public void b() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        q(0L);
    }

    @Override // U4.d
    public synchronized void c(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable() && this.f5240a.b(bitmap) <= this.f5244e && this.f5241b.contains(bitmap.getConfig())) {
                int b6 = this.f5240a.b(bitmap);
                this.f5240a.c(bitmap);
                this.f5243d.b(bitmap);
                this.f5248i++;
                this.f5245f += b6;
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    Log.v("LruBitmapPool", "Put bitmap in pool=" + this.f5240a.e(bitmap));
                }
                h();
                j();
                return;
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + this.f5240a.e(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f5241b.contains(bitmap.getConfig()));
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // U4.d
    public Bitmap d(int i6, int i7, Bitmap.Config config) {
        Bitmap m6 = m(i6, i7, config);
        if (m6 == null) {
            return g(i6, i7, config);
        }
        m6.eraseColor(0);
        return m6;
    }

    @Override // U4.d
    public Bitmap e(int i6, int i7, Bitmap.Config config) {
        Bitmap m6 = m(i6, i7, config);
        return m6 == null ? g(i6, i7, config) : m6;
    }

    public final void h() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            i();
        }
    }

    public final void i() {
        Log.v("LruBitmapPool", "Hits=" + this.f5246g + ", misses=" + this.f5247h + ", puts=" + this.f5248i + ", evictions=" + this.f5249j + ", currentSize=" + this.f5245f + ", maxSize=" + this.f5244e + "\nStrategy=" + this.f5240a);
    }

    public final void j() {
        q(this.f5244e);
    }

    public final synchronized Bitmap m(int i6, int i7, Bitmap.Config config) {
        Bitmap d6;
        try {
            f(config);
            d6 = this.f5240a.d(i6, i7, config != null ? config : f5239k);
            if (d6 == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    Log.d("LruBitmapPool", "Missing bitmap=" + this.f5240a.a(i6, i7, config));
                }
                this.f5247h++;
            } else {
                this.f5246g++;
                this.f5245f -= this.f5240a.b(d6);
                this.f5243d.a(d6);
                p(d6);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Get bitmap=" + this.f5240a.a(i6, i7, config));
            }
            h();
        } catch (Throwable th) {
            throw th;
        }
        return d6;
    }

    public long n() {
        return this.f5244e;
    }

    public final synchronized void q(long j6) {
        while (this.f5245f > j6) {
            try {
                Bitmap removeLast = this.f5240a.removeLast();
                if (removeLast == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        i();
                    }
                    this.f5245f = 0L;
                    return;
                }
                this.f5243d.a(removeLast);
                this.f5245f -= this.f5240a.b(removeLast);
                this.f5249j++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    Log.d("LruBitmapPool", "Evicting bitmap=" + this.f5240a.e(removeLast));
                }
                h();
                removeLast.recycle();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public j(long j6) {
        this(j6, l(), k());
    }
}
