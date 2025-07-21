package h;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.provider.MediaStore;
import h.AbstractC1389a;
import h.C1394f;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: h.d, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C1392d extends AbstractC1389a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f14968b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f14969a;

    /* renamed from: h.d$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public C1392d(int i6) {
        this.f14969a = i6;
        if (i6 <= 1) {
            throw new IllegalArgumentException("Max items must be higher than 1");
        }
    }

    @Override // h.AbstractC1389a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, g.h input) {
        int pickImagesMaxLimit;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        C1394f.a aVar = C1394f.f14970a;
        if (aVar.f()) {
            Intent intent = new Intent("android.provider.action.PICK_IMAGES");
            intent.setType(aVar.c(input.a()));
            int i6 = this.f14969a;
            pickImagesMaxLimit = MediaStore.getPickImagesMaxLimit();
            if (i6 > pickImagesMaxLimit) {
                throw new IllegalArgumentException("Max items must be less or equals MediaStore.getPickImagesMaxLimit()");
            }
            intent.putExtra("android.provider.extra.PICK_IMAGES_MAX", this.f14969a);
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
            intent2.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_MAX", this.f14969a);
            return intent2;
        }
        if (!aVar.d(context)) {
            Intent intent3 = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent3.setType(aVar.c(input.a()));
            intent3.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
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
        intent4.putExtra("com.google.android.gms.provider.extra.PICK_IMAGES_MAX", this.f14969a);
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
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final List c(int i6, Intent intent) {
        List a6;
        if (i6 != -1) {
            intent = null;
        }
        return (intent == null || (a6 = AbstractC1390b.f14967a.a(intent)) == null) ? CollectionsKt.emptyList() : a6;
    }
}
