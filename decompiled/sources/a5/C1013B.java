package a5;

import a5.p;
import android.graphics.Bitmap;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: a5.B, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C1013B implements R4.j {

    /* renamed from: a, reason: collision with root package name */
    public final p f7714a;

    /* renamed from: b, reason: collision with root package name */
    public final U4.b f7715b;

    /* renamed from: a5.B$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a implements p.b {

        /* renamed from: a, reason: collision with root package name */
        public final z f7716a;

        /* renamed from: b, reason: collision with root package name */
        public final n5.d f7717b;

        public a(z zVar, n5.d dVar) {
            this.f7716a = zVar;
            this.f7717b = dVar;
        }

        @Override // a5.p.b
        public void a() {
            this.f7716a.c();
        }

        @Override // a5.p.b
        public void b(U4.d dVar, Bitmap bitmap) {
            IOException a6 = this.f7717b.a();
            if (a6 != null) {
                if (bitmap == null) {
                    throw a6;
                }
                dVar.c(bitmap);
                throw a6;
            }
        }
    }

    public C1013B(p pVar, U4.b bVar) {
        this.f7714a = pVar;
        this.f7715b = bVar;
    }

    @Override // R4.j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public T4.v a(InputStream inputStream, int i6, int i7, R4.h hVar) {
        boolean z6;
        z zVar;
        if (inputStream instanceof z) {
            zVar = (z) inputStream;
            z6 = false;
        } else {
            z6 = true;
            zVar = new z(inputStream, this.f7715b);
        }
        n5.d c6 = n5.d.c(zVar);
        try {
            T4.v f6 = this.f7714a.f(new n5.i(c6), i6, i7, hVar, new a(zVar, c6));
            c6.D();
            if (z6) {
                zVar.D();
            }
            return f6;
        } finally {
        }
    }

    @Override // R4.j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(InputStream inputStream, R4.h hVar) {
        return this.f7714a.p(inputStream);
    }
}
