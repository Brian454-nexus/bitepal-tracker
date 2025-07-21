package X4;

import X4.n;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.data.d;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class f implements n {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6233a;

    /* renamed from: b, reason: collision with root package name */
    public final e f6234b;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a implements o, e {

        /* renamed from: a, reason: collision with root package name */
        public final Context f6235a;

        public a(Context context) {
            this.f6235a = context;
        }

        @Override // X4.f.e
        public Class a() {
            return AssetFileDescriptor.class;
        }

        @Override // X4.o
        public n d(r rVar) {
            return new f(this.f6235a, this);
        }

        @Override // X4.f.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(AssetFileDescriptor assetFileDescriptor) {
            assetFileDescriptor.close();
        }

        @Override // X4.f.e
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public AssetFileDescriptor c(Resources.Theme theme, Resources resources, int i6) {
            return resources.openRawResourceFd(i6);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b implements o, e {

        /* renamed from: a, reason: collision with root package name */
        public final Context f6236a;

        public b(Context context) {
            this.f6236a = context;
        }

        @Override // X4.f.e
        public Class a() {
            return Drawable.class;
        }

        @Override // X4.o
        public n d(r rVar) {
            return new f(this.f6236a, this);
        }

        @Override // X4.f.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(Drawable drawable) {
        }

        @Override // X4.f.e
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Drawable c(Resources.Theme theme, Resources resources, int i6) {
            return c5.i.a(this.f6236a, i6, theme);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c implements o, e {

        /* renamed from: a, reason: collision with root package name */
        public final Context f6237a;

        public c(Context context) {
            this.f6237a = context;
        }

        @Override // X4.f.e
        public Class a() {
            return InputStream.class;
        }

        @Override // X4.o
        public n d(r rVar) {
            return new f(this.f6237a, this);
        }

        @Override // X4.f.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(InputStream inputStream) {
            inputStream.close();
        }

        @Override // X4.f.e
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public InputStream c(Resources.Theme theme, Resources resources, int i6) {
            return resources.openRawResource(i6);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class d implements com.bumptech.glide.load.data.d {

        /* renamed from: a, reason: collision with root package name */
        public final Resources.Theme f6238a;

        /* renamed from: b, reason: collision with root package name */
        public final Resources f6239b;

        /* renamed from: c, reason: collision with root package name */
        public final e f6240c;

        /* renamed from: d, reason: collision with root package name */
        public final int f6241d;

        /* renamed from: e, reason: collision with root package name */
        public Object f6242e;

        public d(Resources.Theme theme, Resources resources, e eVar, int i6) {
            this.f6238a = theme;
            this.f6239b = resources;
            this.f6240c = eVar;
            this.f6241d = i6;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return this.f6240c.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            Object obj = this.f6242e;
            if (obj != null) {
                try {
                    this.f6240c.b(obj);
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
        public void e(com.bumptech.glide.g gVar, d.a aVar) {
            try {
                Object c6 = this.f6240c.c(this.f6238a, this.f6239b, this.f6241d);
                this.f6242e = c6;
                aVar.f(c6);
            } catch (Resources.NotFoundException e6) {
                aVar.c(e6);
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface e {
        Class a();

        void b(Object obj);

        Object c(Resources.Theme theme, Resources resources, int i6);
    }

    public f(Context context, e eVar) {
        this.f6233a = context.getApplicationContext();
        this.f6234b = eVar;
    }

    public static o c(Context context) {
        return new a(context);
    }

    public static o e(Context context) {
        return new b(context);
    }

    public static o g(Context context) {
        return new c(context);
    }

    @Override // X4.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public n.a a(Integer num, int i6, int i7, R4.h hVar) {
        Resources.Theme theme = (Resources.Theme) hVar.c(c5.l.f10765b);
        return new n.a(new m5.b(num), new d(theme, theme != null ? theme.getResources() : this.f6233a.getResources(), this.f6234b, num.intValue()));
    }

    @Override // X4.n
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean b(Integer num) {
        return true;
    }
}
