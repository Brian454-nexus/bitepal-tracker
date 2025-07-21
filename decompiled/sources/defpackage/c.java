package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import com.braze.enums.BrazeViewBounds;
import com.braze.images.IBrazeImageLoader;
import com.braze.models.cards.Card;
import com.braze.models.inappmessage.IInAppMessage;
import com.bumptech.glide.b;
import j5.h;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class c implements IBrazeImageLoader {

    /* renamed from: b, reason: collision with root package name */
    public static final a f10529b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final String f10530c = Reflection.getOrCreateKotlinClass(c.class).getQualifiedName();

    /* renamed from: a, reason: collision with root package name */
    public h f10531a = new h();

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    private final Bitmap a(Context context, String str, BrazeViewBounds brazeViewBounds) {
        try {
            return (Bitmap) b.t(context).c().a(this.f10531a).u0(str).x0().get();
        } catch (Exception e6) {
            Log.e(f10530c, "Failed to retrieve bitmap at url: " + str, e6);
            return null;
        }
    }

    public final void b(Context context, String str, ImageView imageView, BrazeViewBounds brazeViewBounds) {
        b.t(context).t(str).a(this.f10531a).r0(imageView);
    }

    @Override // com.braze.images.IBrazeImageLoader
    public Bitmap getInAppMessageBitmapFromUrl(Context context, IInAppMessage inAppMessage, String imageUrl, BrazeViewBounds brazeViewBounds) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        return a(context, imageUrl, brazeViewBounds);
    }

    @Override // com.braze.images.IBrazeImageLoader
    public Bitmap getPushBitmapFromUrl(Context context, Bundle bundle, String imageUrl, BrazeViewBounds brazeViewBounds) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        return a(context, imageUrl, brazeViewBounds);
    }

    @Override // com.braze.images.IBrazeImageLoader
    public void renderUrlIntoCardView(Context context, Card card, String imageUrl, ImageView imageView, BrazeViewBounds brazeViewBounds) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        b(context, imageUrl, imageView, brazeViewBounds);
    }

    @Override // com.braze.images.IBrazeImageLoader
    public void renderUrlIntoInAppMessageView(Context context, IInAppMessage inAppMessage, String imageUrl, ImageView imageView, BrazeViewBounds brazeViewBounds) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        b(context, imageUrl, imageView, brazeViewBounds);
    }

    @Override // com.braze.images.IBrazeImageLoader
    public void setOffline(boolean z6) {
        this.f10531a = (h) this.f10531a.M(z6);
    }
}
