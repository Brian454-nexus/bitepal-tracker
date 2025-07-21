package X4;

import X4.n;
import com.bumptech.glide.load.data.d;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class b implements n {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0107b f6221a;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a implements o {

        /* renamed from: X4.b$a$a, reason: collision with other inner class name */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public class C0106a implements InterfaceC0107b {
            public C0106a() {
            }

            @Override // X4.b.InterfaceC0107b
            public Class a() {
                return ByteBuffer.class;
            }

            @Override // X4.b.InterfaceC0107b
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public ByteBuffer b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // X4.o
        public n d(r rVar) {
            return new b(new C0106a());
        }
    }

    /* renamed from: X4.b$b, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface InterfaceC0107b {
        Class a();

        Object b(byte[] bArr);
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class c implements com.bumptech.glide.load.data.d {

        /* renamed from: a, reason: collision with root package name */
        public final byte[] f6223a;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC0107b f6224b;

        public c(byte[] bArr, InterfaceC0107b interfaceC0107b) {
            this.f6223a = bArr;
            this.f6224b = interfaceC0107b;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return this.f6224b.a();
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
            aVar.f(this.f6224b.b(this.f6223a));
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class d implements o {

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public class a implements InterfaceC0107b {
            public a() {
            }

            @Override // X4.b.InterfaceC0107b
            public Class a() {
                return InputStream.class;
            }

            @Override // X4.b.InterfaceC0107b
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public InputStream b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // X4.o
        public n d(r rVar) {
            return new b(new a());
        }
    }

    public b(InterfaceC0107b interfaceC0107b) {
        this.f6221a = interfaceC0107b;
    }

    @Override // X4.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a a(byte[] bArr, int i6, int i7, R4.h hVar) {
        return new n.a(new m5.b(bArr), new c(bArr, this.f6221a));
    }

    @Override // X4.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(byte[] bArr) {
        return true;
    }
}
