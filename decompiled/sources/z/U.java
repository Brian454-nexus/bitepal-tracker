package z;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class U extends V {
    public U(StreamConfigurationMap streamConfigurationMap) {
        super(streamConfigurationMap);
    }

    @Override // z.T.a
    public Size[] c(int i6) {
        return this.f21318a.getOutputSizes(i6);
    }
}
