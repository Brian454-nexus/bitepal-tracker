package e5;

import Q4.a;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;
import n5.l;

/* renamed from: e5.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C1271a implements R4.j {

    /* renamed from: f, reason: collision with root package name */
    public static final C0195a f13932f = new C0195a();

    /* renamed from: g, reason: collision with root package name */
    public static final b f13933g = new b();

    /* renamed from: a, reason: collision with root package name */
    public final Context f13934a;

    /* renamed from: b, reason: collision with root package name */
    public final List f13935b;

    /* renamed from: c, reason: collision with root package name */
    public final b f13936c;

    /* renamed from: d, reason: collision with root package name */
    public final C0195a f13937d;

    /* renamed from: e, reason: collision with root package name */
    public final C1272b f13938e;

    /* renamed from: e5.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class C0195a {
        public Q4.a a(a.InterfaceC0077a interfaceC0077a, Q4.c cVar, ByteBuffer byteBuffer, int i6) {
            return new Q4.e(interfaceC0077a, cVar, byteBuffer, i6);
        }
    }

    /* renamed from: e5.a$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final Queue f13939a = l.g(0);

        public synchronized Q4.d a(ByteBuffer byteBuffer) {
            Q4.d dVar;
            try {
                dVar = (Q4.d) this.f13939a.poll();
                if (dVar == null) {
                    dVar = new Q4.d();
                }
            } catch (Throwable th) {
                throw th;
            }
            return dVar.p(byteBuffer);
        }

        public synchronized void b(Q4.d dVar) {
            dVar.a();
            this.f13939a.offer(dVar);
        }
    }

    public C1271a(Context context, List list, U4.d dVar, U4.b bVar) {
        this(context, list, dVar, bVar, f13933g, f13932f);
    }

    public static int e(Q4.c cVar, int i6, int i7) {
        int min = Math.min(cVar.a() / i7, cVar.d() / i6);
        int max = Math.max(1, min == 0 ? 0 : Integer.highestOneBit(min));
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            Log.v("BufferGifDecoder", "Downsampling GIF, sampleSize: " + max + ", target dimens: [" + i6 + "x" + i7 + "], actual dimens: [" + cVar.d() + "x" + cVar.a() + "]");
        }
        return max;
    }

    public final C1275e c(ByteBuffer byteBuffer, int i6, int i7, Q4.d dVar, R4.h hVar) {
        StringBuilder sb;
        long b6 = n5.g.b();
        try {
            Q4.c c6 = dVar.c();
            if (c6.b() > 0 && c6.c() == 0) {
                Bitmap.Config config = hVar.c(AbstractC1279i.f13979a) == R4.b.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                Q4.a a6 = this.f13937d.a(this.f13938e, c6, byteBuffer, e(c6, i6, i7));
                a6.e(config);
                a6.b();
                Bitmap a7 = a6.a();
                if (a7 == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        sb = new StringBuilder();
                        sb.append("Decoded GIF from stream in ");
                        sb.append(n5.g.a(b6));
                        Log.v("BufferGifDecoder", sb.toString());
                    }
                    return null;
                }
                C1275e c1275e = new C1275e(new C1273c(this.f13934a, a6, Z4.j.c(), i6, i7, a7));
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    Log.v("BufferGifDecoder", "Decoded GIF from stream in " + n5.g.a(b6));
                }
                return c1275e;
            }
            if (!Log.isLoggable("BufferGifDecoder", 2)) {
                return null;
            }
            sb = new StringBuilder();
            sb.append("Decoded GIF from stream in ");
            sb.append(n5.g.a(b6));
            Log.v("BufferGifDecoder", sb.toString());
            return null;
        } catch (Throwable th) {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + n5.g.a(b6));
            }
            throw th;
        }
    }

    @Override // R4.j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public C1275e a(ByteBuffer byteBuffer, int i6, int i7, R4.h hVar) {
        Q4.d a6 = this.f13936c.a(byteBuffer);
        try {
            return c(byteBuffer, i6, i7, a6, hVar);
        } finally {
            this.f13936c.b(a6);
        }
    }

    @Override // R4.j
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean b(ByteBuffer byteBuffer, R4.h hVar) {
        return !((Boolean) hVar.c(AbstractC1279i.f13980b)).booleanValue() && com.bumptech.glide.load.a.g(this.f13935b, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    public C1271a(Context context, List list, U4.d dVar, U4.b bVar, b bVar2, C0195a c0195a) {
        this.f13934a = context.getApplicationContext();
        this.f13935b = list;
        this.f13937d = c0195a;
        this.f13938e = new C1272b(dVar, bVar);
        this.f13936c = bVar2;
    }
}
