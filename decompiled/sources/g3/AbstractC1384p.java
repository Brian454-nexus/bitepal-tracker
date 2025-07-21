package g3;

import android.content.ComponentName;
import android.content.Context;

/* renamed from: g3.p, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC1384p {

    /* renamed from: a, reason: collision with root package name */
    public static final String f14880a = W2.k.i("PackageManagerHelper");

    public static void a(Context context, Class cls, boolean z6) {
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z6 ? 1 : 2, 1);
            W2.k e6 = W2.k.e();
            String str = f14880a;
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getName());
            sb.append(" ");
            sb.append(z6 ? "enabled" : "disabled");
            e6.a(str, sb.toString());
        } catch (Exception e7) {
            W2.k e8 = W2.k.e();
            String str2 = f14880a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append("could not be ");
            sb2.append(z6 ? "enabled" : "disabled");
            e8.b(str2, sb2.toString(), e7);
        }
    }
}
