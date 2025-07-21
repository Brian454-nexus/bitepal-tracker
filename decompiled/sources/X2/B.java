package X2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class B {

    /* renamed from: a, reason: collision with root package name */
    public static final String f6093a;

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f6094b;

    static {
        String i6 = W2.k.i("WrkDbPathHelper");
        Intrinsics.checkNotNullExpressionValue(i6, "tagWithPrefix(\"WrkDbPathHelper\")");
        f6093a = i6;
        f6094b = new String[]{"-journal", "-shm", "-wal"};
    }
}
