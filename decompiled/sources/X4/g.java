package X4;

import X4.n;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class g implements n {

    /* renamed from: a, reason: collision with root package name */
    public final d f6243a;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a implements o {

        /* renamed from: a, reason: collision with root package name */
        public final d f6244a;

        public a(d dVar) {
            this.f6244a = dVar;
        }

        @Override // X4.o
        public final n d(r rVar) {
            return new g(this.f6244a);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b extends a {

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public class a implements d {
            @Override // X4.g.d
            public Class a() {
                return ParcelFileDescriptor.class;
            }

            @Override // X4.g.d
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public void b(ParcelFileDescriptor parcelFileDescriptor) {
                parcelFileDescriptor.close();
            }

            @Override // X4.g.d
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public ParcelFileDescriptor c(File file) {
                return ParcelFileDescriptor.open(file, 268435456);
            }
        }

        public b() {
            super(new a());
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c implements com.bumptech.glide.load.data.d {

        /* renamed from: a, reason: collision with root package name */
        public final File f6245a;

        /* renamed from: b, reason: collision with root package name */
        public final d f6246b;

        /* renamed from: c, reason: collision with root package name */
        public Object f6247c;

        public c(File file, d dVar) {
            this.f6245a = file;
            this.f6246b = dVar;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return this.f6246b.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            Object obj = this.f6247c;
            if (obj != null) {
                try {
                    this.f6246b.b(obj);
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
                Object c6 = this.f6246b.c(this.f6245a);
                this.f6247c = c6;
                aVar.f(c6);
            } catch (FileNotFoundException e6) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", e6);
                }
                aVar.c(e6);
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface d {
        Class a();

        void b(Object obj);

        Object c(File file);
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class e extends a {

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public class a implements d {
            @Override // X4.g.d
            public Class a() {
                return InputStream.class;
            }

            @Override // X4.g.d
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public void b(InputStream inputStream) {
                inputStream.close();
            }

            @Override // X4.g.d
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public InputStream c(File file) {
                return new FileInputStream(file);
            }
        }

        public e() {
            super(new a());
        }
    }

    public g(d dVar) {
        this.f6243a = dVar;
    }

    @Override // X4.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a a(File file, int i6, int i7, R4.h hVar) {
        return new n.a(new m5.b(file), new c(file, this.f6243a));
    }

    @Override // X4.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(File file) {
        return true;
    }
}
