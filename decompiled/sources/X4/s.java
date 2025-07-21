package X4;

import X4.n;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import java.io.InputStream;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class s implements n {

    /* renamed from: a, reason: collision with root package name */
    public final n f6301a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f6302b;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a implements o {

        /* renamed from: a, reason: collision with root package name */
        public final Resources f6303a;

        public a(Resources resources) {
            this.f6303a = resources;
        }

        @Override // X4.o
        public n d(r rVar) {
            return new s(this.f6303a, rVar.d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b implements o {

        /* renamed from: a, reason: collision with root package name */
        public final Resources f6304a;

        public b(Resources resources) {
            this.f6304a = resources;
        }

        @Override // X4.o
        public n d(r rVar) {
            return new s(this.f6304a, rVar.d(Uri.class, InputStream.class));
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class c implements o {

        /* renamed from: a, reason: collision with root package name */
        public final Resources f6305a;

        public c(Resources resources) {
            this.f6305a = resources;
        }

        @Override // X4.o
        public n d(r rVar) {
            return new s(this.f6305a, w.c());
        }
    }

    public s(Resources resources, n nVar) {
        this.f6302b = resources;
        this.f6301a = nVar;
    }

    @Override // X4.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a a(Integer num, int i6, int i7, R4.h hVar) {
        Uri d6 = d(num);
        if (d6 == null) {
            return null;
        }
        return this.f6301a.a(d6, i6, i7, hVar);
    }

    public final Uri d(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.f6302b.getResourcePackageName(num.intValue()) + '/' + this.f6302b.getResourceTypeName(num.intValue()) + '/' + this.f6302b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e6) {
            if (!Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            Log.w("ResourceLoader", "Received invalid resource id: " + num, e6);
            return null;
        }
    }

    @Override // X4.n
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean b(Integer num) {
        return true;
    }
}
