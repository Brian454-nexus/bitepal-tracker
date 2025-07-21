package X4;

import X4.n;
import android.util.Base64;
import com.bumptech.glide.load.data.d;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class e implements n {

    /* renamed from: a, reason: collision with root package name */
    public final a f6227a;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface a {
        Class a();

        void b(Object obj);

        Object c(String str);
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b implements com.bumptech.glide.load.data.d {

        /* renamed from: a, reason: collision with root package name */
        public final String f6228a;

        /* renamed from: b, reason: collision with root package name */
        public final a f6229b;

        /* renamed from: c, reason: collision with root package name */
        public Object f6230c;

        public b(String str, a aVar) {
            this.f6228a = str;
            this.f6229b = aVar;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return this.f6229b.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            try {
                this.f6229b.b(this.f6230c);
            } catch (IOException unused) {
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
                Object c6 = this.f6229b.c(this.f6228a);
                this.f6230c = c6;
                aVar.f(c6);
            } catch (IllegalArgumentException e6) {
                aVar.c(e6);
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c implements o {

        /* renamed from: a, reason: collision with root package name */
        public final a f6231a = new a();

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public class a implements a {
            public a() {
            }

            @Override // X4.e.a
            public Class a() {
                return InputStream.class;
            }

            @Override // X4.e.a
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public void b(InputStream inputStream) {
                inputStream.close();
            }

            @Override // X4.e.a
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public InputStream c(String str) {
                if (!str.startsWith("data:image")) {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
                int indexOf = str.indexOf(44);
                if (indexOf == -1) {
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                if (str.substring(0, indexOf).endsWith(";base64")) {
                    return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                }
                throw new IllegalArgumentException("Not a base64 image data URL.");
            }
        }

        @Override // X4.o
        public n d(r rVar) {
            return new e(this.f6231a);
        }
    }

    public e(a aVar) {
        this.f6227a = aVar;
    }

    @Override // X4.n
    public n.a a(Object obj, int i6, int i7, R4.h hVar) {
        return new n.a(new m5.b(obj), new b(obj.toString(), this.f6227a));
    }

    @Override // X4.n
    public boolean b(Object obj) {
        return obj.toString().startsWith("data:image");
    }
}
