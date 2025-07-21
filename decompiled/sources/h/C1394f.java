package h;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import h.AbstractC1389a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: h.f, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C1394f extends AbstractC1389a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f14970a = new a(null);

    /* renamed from: h.f$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ResolveInfo a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return context.getPackageManager().resolveActivity(new Intent("com.google.android.gms.provider.action.PICK_IMAGES"), 1114112);
        }

        public final ResolveInfo b(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112);
        }

        public final String c(e input) {
            Intrinsics.checkNotNullParameter(input, "input");
            if (input instanceof c) {
                return "image/*";
            }
            if (input instanceof d) {
                return "video/*";
            }
            if (input instanceof b) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }

        public final boolean d(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return a(context) != null;
        }

        public final boolean e(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return b(context) != null;
        }

        public final boolean f() {
            int extensionVersion;
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 33) {
                return true;
            }
            if (i6 >= 30) {
                extensionVersion = SdkExtensions.getExtensionVersion(30);
                if (extensionVersion >= 2) {
                    return true;
                }
            }
            return false;
        }

        public a() {
        }
    }

    /* renamed from: h.f$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b implements e {

        /* renamed from: a, reason: collision with root package name */
        public static final b f14971a = new b();
    }

    /* renamed from: h.f$c */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c implements e {

        /* renamed from: a, reason: collision with root package name */
        public static final c f14972a = new c();
    }

    /* renamed from: h.f$d */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class d implements e {

        /* renamed from: a, reason: collision with root package name */
        public static final d f14973a = new d();
    }

    /* renamed from: h.f$e */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface e {
    }

    public static final boolean f() {
        return f14970a.f();
    }

    @Override // h.AbstractC1389a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, g.h input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        a aVar = f14970a;
        if (aVar.f()) {
            Intent intent = new Intent("android.provider.action.PICK_IMAGES");
            intent.setType(aVar.c(input.a()));
            return intent;
        }
        if (aVar.e(context)) {
            ResolveInfo b6 = aVar.b(context);
            if (b6 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            ActivityInfo activityInfo = b6.activityInfo;
            Intent intent2 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
            intent2.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
            intent2.setType(aVar.c(input.a()));
            return intent2;
        }
        if (!aVar.d(context)) {
            Intent intent3 = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent3.setType(aVar.c(input.a()));
            if (intent3.getType() == null) {
                intent3.setType("*/*");
                intent3.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
            }
            return intent3;
        }
        ResolveInfo a6 = aVar.a(context);
        if (a6 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        ActivityInfo activityInfo2 = a6.activityInfo;
        Intent intent4 = new Intent("com.google.android.gms.provider.action.PICK_IMAGES");
        intent4.setClassName(activityInfo2.applicationInfo.packageName, activityInfo2.name);
        intent4.setType(aVar.c(input.a()));
        return intent4;
    }

    @Override // h.AbstractC1389a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final AbstractC1389a.C0202a b(Context context, g.h input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        return null;
    }

    @Override // h.AbstractC1389a
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Uri c(int i6, Intent intent) {
        if (i6 != -1) {
            intent = null;
        }
        if (intent == null) {
            return null;
        }
        Uri data = intent.getData();
        return data == null ? (Uri) CollectionsKt.firstOrNull(AbstractC1390b.f14967a.a(intent)) : data;
    }
}
