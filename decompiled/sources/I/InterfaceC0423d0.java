package I;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: I.d0, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface InterfaceC0423d0 {

    /* renamed from: I.d0$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class a {
        public static a a(int i6, String str, int i7, int i8, int i9, int i10) {
            return new C0424e(i6, str, i7, i8, i9, i10);
        }

        public abstract int b();

        public abstract int c();

        public abstract int d();

        public abstract String e();

        public abstract int f();

        public abstract int g();
    }

    /* renamed from: I.d0$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class b implements InterfaceC0423d0 {
        public static b h(int i6, int i7, List list, List list2) {
            return new C0426f(i6, i7, Collections.unmodifiableList(new ArrayList(list)), Collections.unmodifiableList(new ArrayList(list2)));
        }
    }

    /* renamed from: I.d0$c */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class c {
        public static c a(int i6, String str, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
            return new C0428g(i6, str, i7, i8, i9, i10, i11, i12, i13, i14);
        }

        public abstract int b();

        public abstract int c();

        public abstract int d();

        public abstract int e();

        public abstract int f();

        public abstract int g();

        public abstract int h();

        public abstract String i();

        public abstract int j();

        public abstract int k();
    }

    static String e(int i6) {
        switch (i6) {
            case 1:
                return "audio/3gpp";
            case 2:
                return "audio/amr-wb";
            case 3:
            case 4:
            case 5:
                return "audio/mp4a-latm";
            case 6:
                return "audio/vorbis";
            case 7:
                return "audio/opus";
            default:
                return "audio/none";
        }
    }

    static int f(int i6) {
        if (i6 == 3) {
            return 2;
        }
        if (i6 != 4) {
            return i6 != 5 ? -1 : 39;
        }
        return 5;
    }

    static String g(int i6) {
        switch (i6) {
            case 1:
                return "video/3gpp";
            case 2:
                return "video/avc";
            case 3:
                return "video/mp4v-es";
            case 4:
                return "video/x-vnd.on2.vp8";
            case 5:
                return "video/hevc";
            case 6:
                return "video/x-vnd.on2.vp9";
            case 7:
                return "video/dolby-vision";
            case 8:
                return "video/av01";
            default:
                return "video/none";
        }
    }

    int a();

    int b();

    List c();

    List d();
}
