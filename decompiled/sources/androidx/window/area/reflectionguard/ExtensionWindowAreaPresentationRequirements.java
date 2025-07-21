package androidx.window.area.reflectionguard;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface ExtensionWindowAreaPresentationRequirements {
    @NonNull
    Context getPresentationContext();

    void setPresentationView(@NonNull View view);
}
