package X2;

import android.content.Context;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public static final A f6092a = new A();

    public static final void d(Context context) {
        String str;
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(context, "context");
        A a6 = f6092a;
        if (a6.b(context).exists()) {
            W2.k e6 = W2.k.e();
            str = B.f6093a;
            e6.a(str, "Migrating WorkDatabase to the no-backup directory");
            for (Map.Entry entry : a6.e(context).entrySet()) {
                File file = (File) entry.getKey();
                File file2 = (File) entry.getValue();
                if (file.exists()) {
                    if (file2.exists()) {
                        W2.k e7 = W2.k.e();
                        str3 = B.f6093a;
                        e7.k(str3, "Over-writing contents of " + file2);
                    }
                    String str4 = file.renameTo(file2) ? "Migrated " + file + "to " + file2 : "Renaming " + file + " to " + file2 + " failed";
                    W2.k e8 = W2.k.e();
                    str2 = B.f6093a;
                    e8.a(str2, str4);
                }
            }
        }
    }

    public final File a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return c(context);
    }

    public final File b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        Intrinsics.checkNotNullExpressionValue(databasePath, "context.getDatabasePath(WORK_DATABASE_NAME)");
        return databasePath;
    }

    public final File c(Context context) {
        return new File(C0817a.f6163a.a(context), "androidx.work.workdb");
    }

    public final Map e(Context context) {
        String[] strArr;
        Intrinsics.checkNotNullParameter(context, "context");
        File b6 = b(context);
        File a6 = a(context);
        strArr = B.f6094b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(strArr.length), 16));
        for (String str : strArr) {
            Pair pair = TuplesKt.to(new File(b6.getPath() + str), new File(a6.getPath() + str));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return MapsKt.plus(linkedHashMap, TuplesKt.to(b6, a6));
    }
}
