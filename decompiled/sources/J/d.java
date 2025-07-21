package J;

import I.InterfaceC0423d0;
import android.media.CamcorderProfile;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class d {
    public static InterfaceC0423d0 a(CamcorderProfile camcorderProfile) {
        return InterfaceC0423d0.b.h(camcorderProfile.duration, camcorderProfile.fileFormat, b(camcorderProfile), c(camcorderProfile));
    }

    public static List b(CamcorderProfile camcorderProfile) {
        ArrayList arrayList = new ArrayList();
        int i6 = camcorderProfile.audioCodec;
        arrayList.add(InterfaceC0423d0.a.a(i6, InterfaceC0423d0.e(i6), camcorderProfile.audioBitRate, camcorderProfile.audioSampleRate, camcorderProfile.audioChannels, InterfaceC0423d0.f(camcorderProfile.audioCodec)));
        return arrayList;
    }

    public static List c(CamcorderProfile camcorderProfile) {
        ArrayList arrayList = new ArrayList();
        int i6 = camcorderProfile.videoCodec;
        arrayList.add(InterfaceC0423d0.c.a(i6, InterfaceC0423d0.g(i6), camcorderProfile.videoBitRate, camcorderProfile.videoFrameRate, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, -1, 8, 0, 0));
        return arrayList;
    }
}
