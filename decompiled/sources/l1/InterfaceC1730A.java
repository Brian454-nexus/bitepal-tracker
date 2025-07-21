package l1;

import f1.InterfaceC1286b;
import h1.v1;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: l1.A, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface InterfaceC1730A {

    /* renamed from: l1.A$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final byte[] f16899a;

        /* renamed from: b, reason: collision with root package name */
        public final String f16900b;

        /* renamed from: c, reason: collision with root package name */
        public final int f16901c;

        public a(byte[] bArr, String str, int i6) {
            this.f16899a = bArr;
            this.f16900b = str;
            this.f16901c = i6;
        }

        public byte[] a() {
            return this.f16899a;
        }

        public String b() {
            return this.f16900b;
        }
    }

    /* renamed from: l1.A$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface b {
        void a(InterfaceC1730A interfaceC1730A, byte[] bArr, int i6, int i7, byte[] bArr2);
    }

    /* renamed from: l1.A$c */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface c {
        InterfaceC1730A a(UUID uuid);
    }

    /* renamed from: l1.A$d */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final byte[] f16902a;

        /* renamed from: b, reason: collision with root package name */
        public final String f16903b;

        public d(byte[] bArr, String str) {
            this.f16902a = bArr;
            this.f16903b = str;
        }

        public byte[] a() {
            return this.f16902a;
        }

        public String b() {
            return this.f16903b;
        }
    }

    Map a(byte[] bArr);

    d b();

    InterfaceC1286b c(byte[] bArr);

    byte[] d();

    default void e(byte[] bArr, v1 v1Var) {
    }

    boolean f(byte[] bArr, String str);

    void g(byte[] bArr, byte[] bArr2);

    void h(byte[] bArr);

    byte[] i(byte[] bArr, byte[] bArr2);

    void j(byte[] bArr);

    a k(byte[] bArr, List list, int i6, HashMap hashMap);

    int l();

    void m(b bVar);

    void release();
}
