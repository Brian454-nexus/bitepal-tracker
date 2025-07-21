package androidx.window.area.reflectionguard;

import android.util.DisplayMetrics;
import androidx.annotation.NonNull;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface ExtensionWindowAreaStatusRequirements {
    @NonNull
    DisplayMetrics getWindowAreaDisplayMetrics();

    int getWindowAreaStatus();
}
