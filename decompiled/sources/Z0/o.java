package Z0;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class o {
    public static int a(String str) {
        int i6;
        char c6;
        if (str == null) {
            return -1;
        }
        String t6 = y.t(str);
        t6.getClass();
        switch (t6.hashCode()) {
            case -2123537834:
                i6 = 20;
                if (t6.equals("audio/eac3-joc")) {
                    c6 = 0;
                    break;
                }
                c6 = 65535;
                break;
            case -1662384011:
                i6 = 20;
                if (t6.equals("video/mp2p")) {
                    c6 = 1;
                    break;
                }
                c6 = 65535;
                break;
            case -1662384007:
                i6 = 20;
                if (t6.equals("video/mp2t")) {
                    c6 = 2;
                    break;
                }
                c6 = 65535;
                break;
            case -1662095187:
                i6 = 20;
                if (t6.equals("video/webm")) {
                    c6 = 3;
                    break;
                }
                c6 = 65535;
                break;
            case -1606874997:
                i6 = 20;
                if (t6.equals("audio/amr-wb")) {
                    c6 = 4;
                    break;
                }
                c6 = 65535;
                break;
            case -1487656890:
                i6 = 20;
                if (t6.equals("image/avif")) {
                    c6 = 5;
                    break;
                }
                c6 = 65535;
                break;
            case -1487464693:
                i6 = 20;
                if (t6.equals("image/heic")) {
                    c6 = 6;
                    break;
                }
                c6 = 65535;
                break;
            case -1487464690:
                i6 = 20;
                if (t6.equals("image/heif")) {
                    c6 = 7;
                    break;
                }
                c6 = 65535;
                break;
            case -1487394660:
                i6 = 20;
                if (t6.equals("image/jpeg")) {
                    c6 = '\b';
                    break;
                }
                c6 = 65535;
                break;
            case -1487018032:
                i6 = 20;
                if (t6.equals("image/webp")) {
                    c6 = '\t';
                    break;
                }
                c6 = 65535;
                break;
            case -1248337486:
                i6 = 20;
                if (t6.equals("application/mp4")) {
                    c6 = '\n';
                    break;
                }
                c6 = 65535;
                break;
            case -1079884372:
                i6 = 20;
                if (t6.equals("video/x-msvideo")) {
                    c6 = 11;
                    break;
                }
                c6 = 65535;
                break;
            case -1004728940:
                i6 = 20;
                if (t6.equals("text/vtt")) {
                    c6 = '\f';
                    break;
                }
                c6 = 65535;
                break;
            case -879272239:
                i6 = 20;
                if (t6.equals("image/bmp")) {
                    c6 = '\r';
                    break;
                }
                c6 = 65535;
                break;
            case -879258763:
                i6 = 20;
                if (t6.equals("image/png")) {
                    c6 = 14;
                    break;
                }
                c6 = 65535;
                break;
            case -387023398:
                i6 = 20;
                if (t6.equals("audio/x-matroska")) {
                    c6 = 15;
                    break;
                }
                c6 = 65535;
                break;
            case -43467528:
                i6 = 20;
                if (t6.equals("application/webm")) {
                    c6 = 16;
                    break;
                }
                c6 = 65535;
                break;
            case 13915911:
                i6 = 20;
                if (t6.equals("video/x-flv")) {
                    c6 = 17;
                    break;
                }
                c6 = 65535;
                break;
            case 187078296:
                i6 = 20;
                if (t6.equals("audio/ac3")) {
                    c6 = 18;
                    break;
                }
                c6 = 65535;
                break;
            case 187078297:
                i6 = 20;
                if (t6.equals("audio/ac4")) {
                    c6 = 19;
                    break;
                }
                c6 = 65535;
                break;
            case 187078669:
                i6 = 20;
                if (t6.equals("audio/amr")) {
                    c6 = 20;
                    break;
                }
                c6 = 65535;
                break;
            case 187090232:
                i6 = 20;
                if (t6.equals("audio/mp4")) {
                    c6 = 21;
                    break;
                }
                c6 = 65535;
                break;
            case 187091926:
                i6 = 20;
                if (t6.equals("audio/ogg")) {
                    c6 = 22;
                    break;
                }
                c6 = 65535;
                break;
            case 187099443:
                i6 = 20;
                if (t6.equals("audio/wav")) {
                    c6 = 23;
                    break;
                }
                c6 = 65535;
                break;
            case 1331848029:
                i6 = 20;
                if (t6.equals("video/mp4")) {
                    c6 = 24;
                    break;
                }
                c6 = 65535;
                break;
            case 1503095341:
                i6 = 20;
                if (t6.equals("audio/3gpp")) {
                    c6 = 25;
                    break;
                }
                c6 = 65535;
                break;
            case 1504578661:
                i6 = 20;
                if (t6.equals("audio/eac3")) {
                    c6 = 26;
                    break;
                }
                c6 = 65535;
                break;
            case 1504619009:
                i6 = 20;
                if (t6.equals("audio/flac")) {
                    c6 = 27;
                    break;
                }
                c6 = 65535;
                break;
            case 1504824762:
                i6 = 20;
                if (t6.equals("audio/midi")) {
                    c6 = 28;
                    break;
                }
                c6 = 65535;
                break;
            case 1504831518:
                i6 = 20;
                if (t6.equals("audio/mpeg")) {
                    c6 = 29;
                    break;
                }
                c6 = 65535;
                break;
            case 1505118770:
                i6 = 20;
                if (t6.equals("audio/webm")) {
                    c6 = 30;
                    break;
                }
                c6 = 65535;
                break;
            case 2039520277:
                i6 = 20;
                if (t6.equals("video/x-matroska")) {
                    c6 = 31;
                    break;
                }
                c6 = 65535;
                break;
            default:
                c6 = 65535;
                i6 = 20;
                break;
        }
        switch (c6) {
            case 0:
            case 18:
            case 26:
                return 0;
            case 1:
                return 10;
            case 2:
                return 11;
            case 3:
            case 15:
            case 16:
            case 30:
            case 31:
                return 6;
            case 4:
            case 20:
            case 25:
                return 3;
            case 5:
                return 21;
            case 6:
            case 7:
                return i6;
            case '\b':
                return 14;
            case '\t':
                return 18;
            case '\n':
            case 21:
            case 24:
                return 8;
            case 11:
                return 16;
            case '\f':
                return 13;
            case '\r':
                return 19;
            case 14:
                return 17;
            case 17:
                return 5;
            case 19:
                return 1;
            case 22:
                return 9;
            case 23:
                return 12;
            case 27:
                return 4;
            case 28:
                return 15;
            case 29:
                return 7;
            default:
                return -1;
        }
    }

    public static int b(Map map) {
        List list = (List) map.get("Content-Type");
        return a((list == null || list.isEmpty()) ? null : (String) list.get(0));
    }

    public static int c(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
            return 15;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            return 14;
        }
        if (lastPathSegment.endsWith(".avi")) {
            return 16;
        }
        if (lastPathSegment.endsWith(".png")) {
            return 17;
        }
        if (lastPathSegment.endsWith(".webp")) {
            return 18;
        }
        if (lastPathSegment.endsWith(".bmp") || lastPathSegment.endsWith(".dib")) {
            return 19;
        }
        if (lastPathSegment.endsWith(".heic") || lastPathSegment.endsWith(".heif")) {
            return 20;
        }
        return lastPathSegment.endsWith(".avif") ? 21 : -1;
    }
}
