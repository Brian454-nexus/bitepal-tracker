package K3;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class a {
    public static final void a(File location) {
        Intrinsics.checkNotNullParameter(location, "location");
        if (location.exists() || location.mkdirs() || location.isDirectory()) {
            return;
        }
        throw new IOException("Could not create directory at " + location);
    }
}
