package J;

import I.InterfaceC0423d0;
import android.media.EncoderProfiles;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class b {
    public static InterfaceC0423d0 a(EncoderProfiles encoderProfiles) {
        return InterfaceC0423d0.b.h(encoderProfiles.getDefaultDurationSeconds(), encoderProfiles.getRecommendedFileFormat(), b(encoderProfiles.getAudioProfiles()), c(encoderProfiles.getVideoProfiles()));
    }

    public static List b(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            EncoderProfiles.AudioProfile audioProfile = (EncoderProfiles.AudioProfile) it.next();
            arrayList.add(InterfaceC0423d0.a.a(audioProfile.getCodec(), audioProfile.getMediaType(), audioProfile.getBitrate(), audioProfile.getSampleRate(), audioProfile.getChannels(), audioProfile.getProfile()));
        }
        return arrayList;
    }

    public static List c(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            EncoderProfiles.VideoProfile videoProfile = (EncoderProfiles.VideoProfile) it.next();
            arrayList.add(InterfaceC0423d0.c.a(videoProfile.getCodec(), videoProfile.getMediaType(), videoProfile.getBitrate(), videoProfile.getFrameRate(), videoProfile.getWidth(), videoProfile.getHeight(), videoProfile.getProfile(), 8, 0, 0));
        }
        return arrayList;
    }
}
