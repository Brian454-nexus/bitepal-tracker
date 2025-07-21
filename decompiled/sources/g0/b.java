package g0;

import F.AbstractC0335i0;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.text.TextUtils;
import c0.AbstractC1104f;
import c0.l;
import c0.m;
import e0.i0;
import java.io.IOException;
import y0.g;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f14268a;

    public b() {
        this.f14268a = ((m) AbstractC1104f.a(m.class)) != null;
    }

    public MediaCodec a(MediaFormat mediaFormat) {
        MediaCodecList mediaCodecList = new MediaCodecList(1);
        String b6 = b(mediaFormat, mediaCodecList);
        try {
            if (!TextUtils.isEmpty(b6)) {
                return MediaCodec.createByCodecName(b6);
            }
            String string = mediaFormat.getString("mime");
            MediaCodec createEncoderByType = MediaCodec.createEncoderByType(string);
            AbstractC0335i0.l("EncoderFinder", String.format("No encoder found that supports requested MediaFormat %s. Create encoder by MIME type. Dump codec info:\n%s", mediaFormat, Z.e.b(string, createEncoderByType, mediaFormat)));
            return createEncoderByType;
        } catch (IOException e6) {
            e = e6;
            throw new i0("Encoder cannot created: " + b6 + ", isMediaFormatInQuirk: " + d(mediaFormat) + "\n" + Z.e.e(mediaCodecList, mediaFormat), e);
        } catch (IllegalArgumentException e7) {
            e = e7;
            throw new i0("Encoder cannot created: " + b6 + ", isMediaFormatInQuirk: " + d(mediaFormat) + "\n" + Z.e.e(mediaCodecList, mediaFormat), e);
        } catch (NullPointerException e8) {
            e = e8;
            throw new i0("Encoder cannot created: " + b6 + ", isMediaFormatInQuirk: " + d(mediaFormat) + "\n" + Z.e.e(mediaCodecList, mediaFormat), e);
        }
    }

    public String b(MediaFormat mediaFormat, MediaCodecList mediaCodecList) {
        Integer num = null;
        try {
            if (this.f14268a && mediaFormat.containsKey("frame-rate")) {
                Integer valueOf = Integer.valueOf(mediaFormat.getInteger("frame-rate"));
                try {
                    mediaFormat.setString("frame-rate", null);
                    num = valueOf;
                } catch (Throwable th) {
                    th = th;
                    num = valueOf;
                    if (num != null) {
                        mediaFormat.setInteger("frame-rate", num.intValue());
                    }
                    throw th;
                }
            }
            String findEncoderForFormat = mediaCodecList.findEncoderForFormat(mediaFormat);
            if (findEncoderForFormat == null) {
                findEncoderForFormat = c(mediaFormat, mediaCodecList.getCodecInfos());
            }
            if (num != null) {
                mediaFormat.setInteger("frame-rate", num.intValue());
            }
            return findEncoderForFormat;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final String c(MediaFormat mediaFormat, MediaCodecInfo[] mediaCodecInfoArr) {
        int i6;
        Integer num;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        int i7;
        String string = mediaFormat.getString("mime");
        Integer num2 = null;
        if (string == null) {
            AbstractC0335i0.l("EncoderFinder", "MediaFormat does not contain mime info.");
            return null;
        }
        int length = mediaCodecInfoArr.length;
        for (0; i6 < length; i6 + 1) {
            MediaCodecInfo mediaCodecInfo = mediaCodecInfoArr[i6];
            if (mediaCodecInfo.isEncoder()) {
                try {
                    capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(string);
                    boolean z6 = true;
                    g.b(capabilitiesForType != null, "MIME type is not supported");
                    if (mediaFormat.containsKey("bitrate")) {
                        MediaCodecInfo.VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
                        if (videoCapabilities == null) {
                            z6 = false;
                        }
                        g.b(z6, "Not video codec");
                        num = Integer.valueOf(mediaFormat.getInteger("bitrate"));
                        try {
                            i7 = videoCapabilities.getBitrateRange().clamp(num).intValue();
                            mediaFormat.setInteger("bitrate", i7);
                        } catch (IllegalArgumentException unused) {
                            i6 = num == null ? i6 + 1 : 0;
                            mediaFormat.setInteger("bitrate", num.intValue());
                        } catch (Throwable th) {
                            th = th;
                            num2 = num;
                            if (num2 != null) {
                                mediaFormat.setInteger("bitrate", num2.intValue());
                            }
                            throw th;
                        }
                    } else {
                        i7 = -1;
                        num = null;
                    }
                } catch (IllegalArgumentException unused2) {
                    num = null;
                } catch (Throwable th2) {
                    th = th2;
                }
                if (capabilitiesForType.isFormatSupported(mediaFormat)) {
                    AbstractC0335i0.l("EncoderFinder", String.format("No encoder found that supports requested bitrate. Adjusting bitrate to nearest supported bitrate [requested: %dbps, nearest: %dbps]", num, Integer.valueOf(i7)));
                    String name = mediaCodecInfo.getName();
                    if (num != null) {
                        mediaFormat.setInteger("bitrate", num.intValue());
                    }
                    return name;
                }
                if (num == null) {
                }
                mediaFormat.setInteger("bitrate", num.intValue());
            }
        }
        return null;
    }

    public final boolean d(MediaFormat mediaFormat) {
        l lVar = (l) AbstractC1104f.a(l.class);
        if (lVar == null) {
            return false;
        }
        return lVar.k(mediaFormat);
    }
}
