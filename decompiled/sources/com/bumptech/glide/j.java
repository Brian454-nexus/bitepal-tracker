package com.bumptech.glide;

import X4.a;
import X4.b;
import X4.d;
import X4.e;
import X4.g;
import X4.l;
import X4.o;
import X4.s;
import X4.t;
import X4.u;
import X4.v;
import X4.w;
import X4.x;
import X4.y;
import Y4.a;
import Y4.b;
import Y4.c;
import Y4.d;
import Y4.f;
import a5.C1012A;
import a5.C1013B;
import a5.C1015D;
import a5.C1017F;
import a5.C1018a;
import a5.C1019b;
import a5.C1020c;
import a5.n;
import a5.p;
import a5.s;
import a5.w;
import a5.y;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import b5.C1097a;
import com.bumptech.glide.c;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.data.k;
import d5.C1203a;
import e5.C1271a;
import e5.C1273c;
import e5.C1274d;
import e5.C1278h;
import e5.C1280j;
import f5.C1303a;
import f5.C1304b;
import f5.C1305c;
import f5.C1306d;
import h5.AbstractC1464a;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import n5.f;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class j {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements f.b {

        /* renamed from: a, reason: collision with root package name */
        public boolean f13204a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f13205b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f13206c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ AbstractC1464a f13207d;

        public a(b bVar, List list, AbstractC1464a abstractC1464a) {
            this.f13205b = bVar;
            this.f13206c = list;
            this.f13207d = abstractC1464a;
        }

        @Override // n5.f.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public i get() {
            if (this.f13204a) {
                throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
            }
            G2.a.c("Glide registry");
            this.f13204a = true;
            try {
                return j.a(this.f13205b, this.f13206c, this.f13207d);
            } finally {
                this.f13204a = false;
                G2.a.f();
            }
        }
    }

    public static i a(b bVar, List list, AbstractC1464a abstractC1464a) {
        U4.d f6 = bVar.f();
        U4.b e6 = bVar.e();
        Context applicationContext = bVar.i().getApplicationContext();
        e g6 = bVar.i().g();
        i iVar = new i();
        b(applicationContext, iVar, f6, e6, g6);
        c(applicationContext, bVar, iVar, list, abstractC1464a);
        return iVar;
    }

    public static void b(Context context, i iVar, U4.d dVar, U4.b bVar, e eVar) {
        R4.j iVar2;
        R4.j c1013b;
        String str;
        i iVar3;
        iVar.o(new n());
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 27) {
            iVar.o(new s());
        }
        Resources resources = context.getResources();
        List g6 = iVar.g();
        C1271a c1271a = new C1271a(context, g6, dVar, bVar);
        R4.j m6 = C1017F.m(dVar);
        p pVar = new p(iVar.g(), resources.getDisplayMetrics(), dVar, bVar);
        if (i6 < 28 || !eVar.a(c.b.class)) {
            iVar2 = new a5.i(pVar);
            c1013b = new C1013B(pVar, bVar);
        } else {
            c1013b = new w();
            iVar2 = new a5.k();
        }
        if (i6 >= 28) {
            iVar.e("Animation", InputStream.class, Drawable.class, c5.h.f(g6, bVar));
            iVar.e("Animation", ByteBuffer.class, Drawable.class, c5.h.a(g6, bVar));
        }
        c5.l lVar = new c5.l(context);
        C1020c c1020c = new C1020c(bVar);
        C1303a c1303a = new C1303a();
        C1306d c1306d = new C1306d();
        ContentResolver contentResolver = context.getContentResolver();
        iVar.a(ByteBuffer.class, new X4.c()).a(InputStream.class, new u(bVar)).e("Bitmap", ByteBuffer.class, Bitmap.class, iVar2).e("Bitmap", InputStream.class, Bitmap.class, c1013b);
        if (ParcelFileDescriptorRewinder.c()) {
            str = "Animation";
            iVar.e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new y(pVar));
        } else {
            str = "Animation";
        }
        iVar.e("Bitmap", AssetFileDescriptor.class, Bitmap.class, C1017F.c(dVar));
        String str2 = str;
        iVar.e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, m6).d(Bitmap.class, Bitmap.class, w.a.a()).e("Bitmap", Bitmap.class, Bitmap.class, new C1015D()).b(Bitmap.class, c1020c).e("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C1018a(resources, iVar2)).e("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C1018a(resources, c1013b)).e("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new C1018a(resources, m6)).b(BitmapDrawable.class, new C1019b(dVar, c1020c)).e(str2, InputStream.class, C1273c.class, new C1280j(g6, c1271a, bVar)).e(str2, ByteBuffer.class, C1273c.class, c1271a).b(C1273c.class, new C1274d()).d(Q4.a.class, Q4.a.class, w.a.a()).e("Bitmap", Q4.a.class, Bitmap.class, new C1278h(dVar)).c(Uri.class, Drawable.class, lVar).c(Uri.class, Bitmap.class, new C1012A(lVar, dVar)).p(new C1097a.C0160a()).d(File.class, ByteBuffer.class, new d.b()).d(File.class, InputStream.class, new g.e()).c(File.class, File.class, new C1203a()).d(File.class, ParcelFileDescriptor.class, new g.b()).d(File.class, File.class, w.a.a()).p(new k.a(bVar));
        if (ParcelFileDescriptorRewinder.c()) {
            iVar3 = iVar;
            iVar3.p(new ParcelFileDescriptorRewinder.a());
        } else {
            iVar3 = iVar;
        }
        o g7 = X4.f.g(context);
        o c6 = X4.f.c(context);
        o e6 = X4.f.e(context);
        Class cls = Integer.TYPE;
        iVar3.d(cls, InputStream.class, g7).d(Integer.class, InputStream.class, g7).d(cls, AssetFileDescriptor.class, c6).d(Integer.class, AssetFileDescriptor.class, c6).d(cls, Drawable.class, e6).d(Integer.class, Drawable.class, e6).d(Uri.class, InputStream.class, t.f(context)).d(Uri.class, AssetFileDescriptor.class, t.e(context));
        s.c cVar = new s.c(resources);
        s.a aVar = new s.a(resources);
        s.b bVar2 = new s.b(resources);
        iVar3.d(Integer.class, Uri.class, cVar).d(cls, Uri.class, cVar).d(Integer.class, AssetFileDescriptor.class, aVar).d(cls, AssetFileDescriptor.class, aVar).d(Integer.class, InputStream.class, bVar2).d(cls, InputStream.class, bVar2);
        iVar3.d(String.class, InputStream.class, new e.c()).d(Uri.class, InputStream.class, new e.c()).d(String.class, InputStream.class, new v.c()).d(String.class, ParcelFileDescriptor.class, new v.b()).d(String.class, AssetFileDescriptor.class, new v.a()).d(Uri.class, InputStream.class, new a.c(context.getAssets())).d(Uri.class, AssetFileDescriptor.class, new a.b(context.getAssets())).d(Uri.class, InputStream.class, new b.a(context)).d(Uri.class, InputStream.class, new c.a(context));
        if (i6 >= 29) {
            iVar3.d(Uri.class, InputStream.class, new d.c(context));
            iVar3.d(Uri.class, ParcelFileDescriptor.class, new d.b(context));
        }
        iVar3.d(Uri.class, InputStream.class, new x.d(contentResolver)).d(Uri.class, ParcelFileDescriptor.class, new x.b(contentResolver)).d(Uri.class, AssetFileDescriptor.class, new x.a(contentResolver)).d(Uri.class, InputStream.class, new y.a()).d(URL.class, InputStream.class, new f.a()).d(Uri.class, File.class, new l.a(context)).d(X4.h.class, InputStream.class, new a.C0112a()).d(byte[].class, ByteBuffer.class, new b.a()).d(byte[].class, InputStream.class, new b.d()).d(Uri.class, Uri.class, w.a.a()).d(Drawable.class, Drawable.class, w.a.a()).c(Drawable.class, Drawable.class, new c5.m()).q(Bitmap.class, BitmapDrawable.class, new C1304b(resources)).q(Bitmap.class, byte[].class, c1303a).q(Drawable.class, byte[].class, new C1305c(dVar, c1303a, c1306d)).q(C1273c.class, byte[].class, c1306d);
        R4.j d6 = C1017F.d(dVar);
        iVar3.c(ByteBuffer.class, Bitmap.class, d6);
        iVar3.c(ByteBuffer.class, BitmapDrawable.class, new C1018a(resources, d6));
    }

    public static void c(Context context, b bVar, i iVar, List list, AbstractC1464a abstractC1464a) {
        Iterator it = list.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
        if (abstractC1464a != null) {
            abstractC1464a.a(context, bVar, iVar);
        }
    }

    public static f.b d(b bVar, List list, AbstractC1464a abstractC1464a) {
        return new a(bVar, list, abstractC1464a);
    }
}
