package X;

import X.C0797f;
import X.r;
import java.io.File;

/* renamed from: X.p, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0807p extends r {

    /* renamed from: b, reason: collision with root package name */
    public final b f5953b;

    /* renamed from: X.p$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a extends r.a {

        /* renamed from: b, reason: collision with root package name */
        public final b.a f5954b;

        public a(File file) {
            super(new C0797f.b());
            y0.g.g(file, "File can't be null.");
            b.a aVar = (b.a) this.f5959a;
            this.f5954b = aVar;
            aVar.d(file);
        }

        public C0807p a() {
            return new C0807p(this.f5954b.c());
        }
    }

    /* renamed from: X.p$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class b extends r.b {

        /* renamed from: X.p$b$a */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static abstract class a extends r.b.a {
            public abstract b c();

            public abstract a d(File file);
        }

        public abstract File d();
    }

    public C0807p(b bVar) {
        super(bVar);
        this.f5953b = bVar;
    }

    public File d() {
        return this.f5953b.d();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0807p) {
            return this.f5953b.equals(((C0807p) obj).f5953b);
        }
        return false;
    }

    public int hashCode() {
        return this.f5953b.hashCode();
    }

    public String toString() {
        return this.f5953b.toString().replaceFirst("FileOutputOptionsInternal", "FileOutputOptions");
    }
}
