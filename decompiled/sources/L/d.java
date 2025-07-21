package L;

import android.os.Build;
import android.util.CloseGuard;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final b f3022a;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public final CloseGuard f3023a = new CloseGuard();

        @Override // L.d.b
        public void a() {
            this.f3023a.warnIfOpen();
        }

        @Override // L.d.b
        public void b(String str) {
            this.f3023a.open(str);
        }

        @Override // L.d.b
        public void close() {
            this.f3023a.close();
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface b {
        void a();

        void b(String str);

        void close();
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c implements b {
        @Override // L.d.b
        public void a() {
        }

        @Override // L.d.b
        public void b(String str) {
            y0.g.g(str, "CloseMethodName must not be null.");
        }

        @Override // L.d.b
        public void close() {
        }
    }

    public d(b bVar) {
        this.f3022a = bVar;
    }

    public static d b() {
        return Build.VERSION.SDK_INT >= 30 ? new d(new a()) : new d(new c());
    }

    public void a() {
        this.f3022a.close();
    }

    public void c(String str) {
        this.f3022a.b(str);
    }

    public void d() {
        this.f3022a.a();
    }
}
