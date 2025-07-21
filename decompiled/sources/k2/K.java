package k2;

import android.util.SparseArray;
import c1.C1111E;
import c1.C1144z;
import java.util.Collections;
import java.util.List;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface K {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f16485a;

        /* renamed from: b, reason: collision with root package name */
        public final int f16486b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f16487c;

        public a(String str, int i6, byte[] bArr) {
            this.f16485a = str;
            this.f16486b = i6;
            this.f16487c = bArr;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f16488a;

        /* renamed from: b, reason: collision with root package name */
        public final String f16489b;

        /* renamed from: c, reason: collision with root package name */
        public final int f16490c;

        /* renamed from: d, reason: collision with root package name */
        public final List f16491d;

        /* renamed from: e, reason: collision with root package name */
        public final byte[] f16492e;

        public b(int i6, String str, int i7, List list, byte[] bArr) {
            this.f16488a = i6;
            this.f16489b = str;
            this.f16490c = i7;
            this.f16491d = list == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list);
            this.f16492e = bArr;
        }

        public int a() {
            int i6 = this.f16490c;
            if (i6 == 2) {
                return 2048;
            }
            if (i6 != 3) {
                return 0;
            }
            return ConstantsKt.MINIMUM_BLOCK_SIZE;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface c {
        SparseArray a();

        K b(int i6, b bVar);
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final String f16493a;

        /* renamed from: b, reason: collision with root package name */
        public final int f16494b;

        /* renamed from: c, reason: collision with root package name */
        public final int f16495c;

        /* renamed from: d, reason: collision with root package name */
        public int f16496d;

        /* renamed from: e, reason: collision with root package name */
        public String f16497e;

        public d(int i6, int i7) {
            this(IntCompanionObject.MIN_VALUE, i6, i7);
        }

        public void a() {
            int i6 = this.f16496d;
            this.f16496d = i6 == Integer.MIN_VALUE ? this.f16494b : i6 + this.f16495c;
            this.f16497e = this.f16493a + this.f16496d;
        }

        public String b() {
            d();
            return this.f16497e;
        }

        public int c() {
            d();
            return this.f16496d;
        }

        public final void d() {
            if (this.f16496d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        public d(int i6, int i7, int i8) {
            String str;
            if (i6 != Integer.MIN_VALUE) {
                str = i6 + "/";
            } else {
                str = "";
            }
            this.f16493a = str;
            this.f16494b = i7;
            this.f16495c = i8;
            this.f16496d = IntCompanionObject.MIN_VALUE;
            this.f16497e = "";
        }
    }

    void a(C1144z c1144z, int i6);

    void b();

    void c(C1111E c1111e, E1.r rVar, d dVar);
}
