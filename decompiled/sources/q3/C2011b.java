package q3;

import android.content.res.Resources;
import android.view.View;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

/* renamed from: q3.b, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C2011b {

    /* renamed from: a, reason: collision with root package name */
    public static final C2011b f18672a = new C2011b();

    public final String a(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (view.getId() == -1 || c(view)) {
            throw new Resources.NotFoundException();
        }
        Resources resources = view.getContext().getResources();
        String resourceEntryName = resources != null ? resources.getResourceEntryName(view.getId()) : null;
        return resourceEntryName == null ? "" : resourceEntryName;
    }

    public final String b(View view) {
        Object obj;
        String sb;
        Intrinsics.checkNotNullParameter(view, "<this>");
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(f18672a.a(view));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.exceptionOrNull-impl(obj) != null) {
            if (view.getId() == -1) {
                sb = null;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("0x");
                String num = Integer.toString(view.getId(), CharsKt.checkRadix(16));
                Intrinsics.checkNotNullExpressionValue(num, "toString(...)");
                sb2.append(num);
                sb = sb2.toString();
            }
            obj = sb;
        }
        return (String) obj;
    }

    public final boolean c(View view) {
        return (view.getId() & (-16777216)) == 0 && (view.getId() & 16777215) != 0;
    }
}
