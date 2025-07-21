package M0;

import Ea.r;
import I0.w;
import ga.J;
import java.io.File;
import java.util.List;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f3370a = new e();

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a extends Lambda implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function0 f3371a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function0 function0) {
            super(0);
            this.f3371a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final r invoke() {
            File file = (File) this.f3371a.invoke();
            if (Intrinsics.areEqual(FilesKt.getExtension(file), "preferences_pb")) {
                r.a aVar = r.b;
                File absoluteFile = file.getAbsoluteFile();
                Intrinsics.checkNotNullExpressionValue(absoluteFile, "file.absoluteFile");
                return r.a.d(aVar, absoluteFile, false, 1, (Object) null);
            }
            throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: preferences_pb").toString());
        }
    }

    public final I0.h a(w storage, J0.b bVar, List migrations, J scope) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        return new d(I0.i.f2601a.a(storage, bVar, migrations, scope));
    }

    public final I0.h b(J0.b bVar, List migrations, J scope, Function0 produceFile) {
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        return new d(a(new K0.d(Ea.h.b, j.f3376a, null, new a(produceFile), 4, null), bVar, migrations, scope));
    }
}
