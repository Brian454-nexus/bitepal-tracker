package X4;

import X4.n;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class d implements n {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a implements com.bumptech.glide.load.data.d {

        /* renamed from: a, reason: collision with root package name */
        public final File f6226a;

        public a(File file) {
            this.f6226a = file;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
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
                aVar.f(n5.a.a(this.f6226a));
            } catch (IOException e6) {
                if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e6);
                }
                aVar.c(e6);
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b implements o {
        @Override // X4.o
        public n d(r rVar) {
            return new d();
        }
    }

    @Override // X4.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a a(File file, int i6, int i7, R4.h hVar) {
        return new n.a(new m5.b(file), new a(file));
    }

    @Override // X4.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(File file) {
        return true;
    }
}
