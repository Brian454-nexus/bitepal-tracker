package A;

import android.hardware.camera2.params.InputConfiguration;
import android.os.Build;
import java.util.Objects;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final c f6a;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a implements c {

        /* renamed from: a, reason: collision with root package name */
        public final InputConfiguration f7a;

        public a(Object obj) {
            this.f7a = (InputConfiguration) obj;
        }

        @Override // A.h.c
        public Object a() {
            return this.f7a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                return Objects.equals(this.f7a, ((c) obj).a());
            }
            return false;
        }

        public int hashCode() {
            return this.f7a.hashCode();
        }

        public String toString() {
            return this.f7a.toString();
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends a {
        public b(Object obj) {
            super(obj);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface c {
        Object a();
    }

    public h(c cVar) {
        this.f6a = cVar;
    }

    public static h b(Object obj) {
        if (obj == null) {
            return null;
        }
        return Build.VERSION.SDK_INT >= 31 ? new h(new b(obj)) : new h(new a(obj));
    }

    public Object a() {
        return this.f6a.a();
    }

    public boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f6a.equals(((h) obj).f6a);
        }
        return false;
    }

    public int hashCode() {
        return this.f6a.hashCode();
    }

    public String toString() {
        return this.f6a.toString();
    }
}
