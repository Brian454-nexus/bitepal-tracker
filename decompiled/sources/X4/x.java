package X4;

import X4.n;
import android.content.ContentResolver;
import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class x implements n {

    /* renamed from: b, reason: collision with root package name */
    public static final Set f6315b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));

    /* renamed from: a, reason: collision with root package name */
    public final c f6316a;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a implements o, c {

        /* renamed from: a, reason: collision with root package name */
        public final ContentResolver f6317a;

        public a(ContentResolver contentResolver) {
            this.f6317a = contentResolver;
        }

        @Override // X4.x.c
        public com.bumptech.glide.load.data.d a(Uri uri) {
            return new com.bumptech.glide.load.data.a(this.f6317a, uri);
        }

        @Override // X4.o
        public n d(r rVar) {
            return new x(this);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b implements o, c {

        /* renamed from: a, reason: collision with root package name */
        public final ContentResolver f6318a;

        public b(ContentResolver contentResolver) {
            this.f6318a = contentResolver;
        }

        @Override // X4.x.c
        public com.bumptech.glide.load.data.d a(Uri uri) {
            return new com.bumptech.glide.load.data.i(this.f6318a, uri);
        }

        @Override // X4.o
        public n d(r rVar) {
            return new x(this);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface c {
        com.bumptech.glide.load.data.d a(Uri uri);
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class d implements o, c {

        /* renamed from: a, reason: collision with root package name */
        public final ContentResolver f6319a;

        public d(ContentResolver contentResolver) {
            this.f6319a = contentResolver;
        }

        @Override // X4.x.c
        public com.bumptech.glide.load.data.d a(Uri uri) {
            return new com.bumptech.glide.load.data.n(this.f6319a, uri);
        }

        @Override // X4.o
        public n d(r rVar) {
            return new x(this);
        }
    }

    public x(c cVar) {
        this.f6316a = cVar;
    }

    @Override // X4.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a a(Uri uri, int i6, int i7, R4.h hVar) {
        return new n.a(new m5.b(uri), this.f6316a.a(uri));
    }

    @Override // X4.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Uri uri) {
        return f6315b.contains(uri.getScheme());
    }
}
