package b5;

import com.bumptech.glide.load.data.e;
import java.nio.ByteBuffer;

/* renamed from: b5.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C1097a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final ByteBuffer f10527a;

    /* renamed from: b5.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class C0160a implements e.a {
        @Override // com.bumptech.glide.load.data.e.a
        public Class a() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public e b(ByteBuffer byteBuffer) {
            return new C1097a(byteBuffer);
        }
    }

    public C1097a(ByteBuffer byteBuffer) {
        this.f10527a = byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.e
    public void b() {
    }

    @Override // com.bumptech.glide.load.data.e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public ByteBuffer a() {
        this.f10527a.position(0);
        return this.f10527a;
    }
}
