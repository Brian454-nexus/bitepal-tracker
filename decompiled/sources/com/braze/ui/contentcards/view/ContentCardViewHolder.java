package com.braze.ui.contentcards.view;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.braze.ui.R$drawable;
import com.braze.ui.R$id;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u000bJ\u0015\u0010\r\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000bJ\u0015\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/braze/ui/contentcards/view/ContentCardViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$D;", "Landroid/view/View;", "view", "", "showUnreadIndicator", "<init>", "(Landroid/view/View;Z)V", "isVisible", "", "setPinnedIconVisible", "(Z)V", "setUnreadBarVisible", "setActionHintVisible", "", "text", "setActionHintText", "(Ljava/lang/String;)V", "unreadBar", "Landroid/view/View;", "Landroid/widget/ImageView;", "pinnedIcon", "Landroid/widget/ImageView;", "Landroid/widget/TextView;", "actionHint", "Landroid/widget/TextView;", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nContentCardViewHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentCardViewHolder.kt\ncom/braze/ui/contentcards/view/ContentCardViewHolder\n+ 2 Locale.kt\nandroidx/core/text/LocaleKt\n*L\n1#1,70:1\n28#2:71\n*S KotlinDebug\n*F\n+ 1 ContentCardViewHolder.kt\ncom/braze/ui/contentcards/view/ContentCardViewHolder\n*L\n40#1:71\n*E\n"})
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class ContentCardViewHolder extends RecyclerView.D {

    @Nullable
    private final TextView actionHint;

    @Nullable
    private final ImageView pinnedIcon;

    @Nullable
    private final View unreadBar;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentCardViewHolder(@NotNull View view, boolean z6) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        View findViewById = view.findViewById(R$id.com_braze_content_cards_unread_bar);
        this.unreadBar = findViewById;
        this.pinnedIcon = (ImageView) view.findViewById(R$id.com_braze_content_cards_pinned_icon);
        this.actionHint = (TextView) view.findViewById(R$id.com_braze_content_cards_action_hint);
        if (!z6) {
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
        } else {
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
            if (findViewById != null) {
                findViewById.setBackground(view.getContext().getResources().getDrawable(R$drawable.com_braze_content_cards_unread_bar_background));
            }
        }
    }

    public final void setActionHintText(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        TextView textView = this.actionHint;
        if (textView != null) {
            textView.setText(text);
        }
    }

    public final void setActionHintVisible(boolean isVisible) {
        TextView textView = this.actionHint;
        if (textView != null) {
            textView.setVisibility(isVisible ? 0 : 8);
        }
    }

    public final void setPinnedIconVisible(boolean isVisible) {
        ImageView imageView;
        ImageView imageView2 = this.pinnedIcon;
        if (imageView2 != null) {
            imageView2.setVisibility(isVisible ? 0 : 8);
        }
        if (isVisible) {
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
            if (TextUtils.getLayoutDirectionFromLocale(locale) != 1 || (imageView = this.pinnedIcon) == null) {
                return;
            }
            imageView.setScaleX(-1.0f);
        }
    }

    public final void setUnreadBarVisible(boolean isVisible) {
        View view = this.unreadBar;
        if (view != null) {
            view.setVisibility(isVisible ? 0 : 8);
        }
    }
}
