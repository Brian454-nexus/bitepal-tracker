package com.bumptech.glide.load.data;

import a5.z;
import com.bumptech.glide.load.data.e;
import java.io.InputStream;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class k implements e {

    /* renamed from: a, reason: collision with root package name */
    public final z f13279a;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a implements e.a {

        /* renamed from: a, reason: collision with root package name */
        public final U4.b f13280a;

        public a(U4.b bVar) {
            this.f13280a = bVar;
        }

        @Override // com.bumptech.glide.load.data.e.a
        public Class a() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public e b(InputStream inputStream) {
            return new k(inputStream, this.f13280a);
        }
    }

    public k(InputStream inputStream, U4.b bVar) {
        z zVar = new z(inputStream, bVar);
        this.f13279a = zVar;
        zVar.mark(5242880);
    }

    @Override // com.bumptech.glide.load.data.e
    public void b() {
        this.f13279a.D();
    }

    public void c() {
        this.f13279a.c();
    }

    @Override // com.bumptech.glide.load.data.e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public InputStream a() {
        this.f13279a.reset();
        return this.f13279a;
    }
}
