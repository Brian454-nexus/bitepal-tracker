package X4;

import X4.n;
import android.content.res.AssetManager;
import android.net.Uri;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class a implements n {

    /* renamed from: c, reason: collision with root package name */
    public static final int f6216c = 22;

    /* renamed from: a, reason: collision with root package name */
    public final AssetManager f6217a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0105a f6218b;

    /* renamed from: X4.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface InterfaceC0105a {
        com.bumptech.glide.load.data.d a(AssetManager assetManager, String str);
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b implements o, InterfaceC0105a {

        /* renamed from: a, reason: collision with root package name */
        public final AssetManager f6219a;

        public b(AssetManager assetManager) {
            this.f6219a = assetManager;
        }

        @Override // X4.a.InterfaceC0105a
        public com.bumptech.glide.load.data.d a(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.h(assetManager, str);
        }

        @Override // X4.o
        public n d(r rVar) {
            return new a(this.f6219a, this);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class c implements o, InterfaceC0105a {

        /* renamed from: a, reason: collision with root package name */
        public final AssetManager f6220a;

        public c(AssetManager assetManager) {
            this.f6220a = assetManager;
        }

        @Override // X4.a.InterfaceC0105a
        public com.bumptech.glide.load.data.d a(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.m(assetManager, str);
        }

        @Override // X4.o
        public n d(r rVar) {
            return new a(this.f6220a, this);
        }
    }

    public a(AssetManager assetManager, InterfaceC0105a interfaceC0105a) {
        this.f6217a = assetManager;
        this.f6218b = interfaceC0105a;
    }

    @Override // X4.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a a(Uri uri, int i6, int i7, R4.h hVar) {
        return new n.a(new m5.b(uri), this.f6218b.a(this.f6217a, uri.toString().substring(f6216c)));
    }

    @Override // X4.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Uri uri) {
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }
}
