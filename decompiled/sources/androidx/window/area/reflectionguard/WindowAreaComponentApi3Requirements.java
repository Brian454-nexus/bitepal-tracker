package androidx.window.area.reflectionguard;

import android.app.Activity;
import android.util.DisplayMetrics;
import androidx.annotation.NonNull;
import androidx.window.extensions.area.ExtensionWindowAreaPresentation;
import androidx.window.extensions.area.ExtensionWindowAreaStatus;
import androidx.window.extensions.core.util.function.Consumer;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface WindowAreaComponentApi3Requirements extends WindowAreaComponentApi2Requirements {
    void addRearDisplayPresentationStatusListener(@NonNull Consumer<ExtensionWindowAreaStatus> consumer);

    void endRearDisplayPresentationSession();

    @NonNull
    DisplayMetrics getRearDisplayMetrics();

    ExtensionWindowAreaPresentation getRearDisplayPresentation();

    void removeRearDisplayPresentationStatusListener(@NonNull Consumer<ExtensionWindowAreaStatus> consumer);

    void startRearDisplayPresentationSession(@NonNull Activity activity, @NonNull Consumer<Integer> consumer);
}
