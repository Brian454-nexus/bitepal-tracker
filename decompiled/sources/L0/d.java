package L0;

import androidx.datastore.preferences.protobuf.C1048z;
import java.io.InputStream;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final a f3093a = new a(null);

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a(InputStream input) {
            Intrinsics.checkNotNullParameter(input, "input");
            try {
                f S5 = f.S(input);
                Intrinsics.checkNotNullExpressionValue(S5, "{\n                Prefer…From(input)\n            }");
                return S5;
            } catch (C1048z e6) {
                throw new I0.c("Unable to parse preferences proto.", e6);
            }
        }

        public a() {
        }
    }
}
