package i1;

import Z0.C0830b;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.media.AudioTrack;
import android.net.Uri;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import z6.A;
import z6.g0;
import z6.w;
import z6.y;

/* renamed from: i1.e, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1488e {

    /* renamed from: c, reason: collision with root package name */
    public static final C1488e f15915c = new C1488e(z6.w.y(C0207e.f15920d));

    /* renamed from: d, reason: collision with root package name */
    public static final z6.w f15916d = z6.w.A(2, 5, 6);

    /* renamed from: e, reason: collision with root package name */
    public static final z6.y f15917e = new y.a().f(5, 6).f(17, 6).f(7, 6).f(30, 10).f(18, 6).f(6, 8).f(8, 8).f(14, 8).c();

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f15918a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15919b;

    /* renamed from: i1.e$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {
        private static z6.A a() {
            A.a i6 = new A.a().i(new Integer[]{8, 7});
            int i7 = AbstractC1117K.f10560a;
            if (i7 >= 31) {
                i6.i(new Integer[]{26, 27});
            }
            if (i7 >= 33) {
                i6.h(30);
            }
            return i6.l();
        }

        public static boolean b(AudioManager audioManager, C1493j c1493j) {
            AudioDeviceInfo[] devices = c1493j == null ? ((AudioManager) AbstractC1119a.e(audioManager)).getDevices(2) : new AudioDeviceInfo[]{c1493j.f15939a};
            z6.A a6 = a();
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                if (a6.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: i1.e$c */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c {
        public static z6.w a(C0830b c0830b) {
            boolean isDirectPlaybackSupported;
            w.a o6 = z6.w.o();
            g0 l6 = C1488e.f15917e.i().l();
            while (l6.hasNext()) {
                Integer num = (Integer) l6.next();
                int intValue = num.intValue();
                if (AbstractC1117K.f10560a >= AbstractC1117K.L(intValue)) {
                    isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), c0830b.a().f6870a);
                    if (isDirectPlaybackSupported) {
                        o6.h(num);
                    }
                }
            }
            o6.h(2);
            return o6.k();
        }

        public static int b(int i6, int i7, C0830b c0830b) {
            boolean isDirectPlaybackSupported;
            for (int i8 = 10; i8 > 0; i8--) {
                int N5 = AbstractC1117K.N(i8);
                if (N5 != 0) {
                    isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i6).setSampleRate(i7).setChannelMask(N5).build(), c0830b.a().f6870a);
                    if (isDirectPlaybackSupported) {
                        return i8;
                    }
                }
            }
            return 0;
        }
    }

    /* renamed from: i1.e$d */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class d {
        public static C1488e a(AudioManager audioManager, C0830b c0830b) {
            List directProfilesForAttributes;
            directProfilesForAttributes = audioManager.getDirectProfilesForAttributes(c0830b.a().f6870a);
            return new C1488e(C1488e.c(directProfilesForAttributes));
        }

        public static C1493j b(AudioManager audioManager, C0830b c0830b) {
            List audioDevicesForAttributes;
            try {
                audioDevicesForAttributes = ((AudioManager) AbstractC1119a.e(audioManager)).getAudioDevicesForAttributes(c0830b.a().f6870a);
                if (audioDevicesForAttributes.isEmpty()) {
                    return null;
                }
                return new C1493j((AudioDeviceInfo) audioDevicesForAttributes.get(0));
            } catch (RuntimeException unused) {
                return null;
            }
        }
    }

    public static boolean b() {
        String str = AbstractC1117K.f10562c;
        return "Amazon".equals(str) || "Xiaomi".equals(str);
    }

    public static z6.w c(List list) {
        int encapsulationType;
        int format;
        int[] channelMasks;
        int[] channelMasks2;
        HashMap hashMap = new HashMap();
        hashMap.put(2, new HashSet(C6.g.c(new int[]{12})));
        for (int i6 = 0; i6 < list.size(); i6++) {
            AudioProfile a6 = AbstractC1484a.a(list.get(i6));
            encapsulationType = a6.getEncapsulationType();
            if (encapsulationType != 1) {
                format = a6.getFormat();
                if (AbstractC1117K.B0(format) || f15917e.containsKey(Integer.valueOf(format))) {
                    if (hashMap.containsKey(Integer.valueOf(format))) {
                        Set set = (Set) AbstractC1119a.e((Set) hashMap.get(Integer.valueOf(format)));
                        channelMasks2 = a6.getChannelMasks();
                        set.addAll(C6.g.c(channelMasks2));
                    } else {
                        Integer valueOf = Integer.valueOf(format);
                        channelMasks = a6.getChannelMasks();
                        hashMap.put(valueOf, new HashSet(C6.g.c(channelMasks)));
                    }
                }
            }
        }
        w.a o6 = z6.w.o();
        for (Map.Entry entry : hashMap.entrySet()) {
            o6.h(new C0207e(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
        }
        return o6.k();
    }

    public static z6.w d(int[] iArr, int i6) {
        w.a o6 = z6.w.o();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i7 : iArr) {
            o6.h(new C0207e(i7, i6));
        }
        return o6.k();
    }

    public static C1488e e(Context context, C0830b c0830b, AudioDeviceInfo audioDeviceInfo) {
        return f(context, c0830b, (AbstractC1117K.f10560a < 23 || audioDeviceInfo == null) ? null : new C1493j(audioDeviceInfo));
    }

    public static C1488e f(Context context, C0830b c0830b, C1493j c1493j) {
        return g(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), c0830b, c1493j);
    }

    public static C1488e g(Context context, Intent intent, C0830b c0830b, C1493j c1493j) {
        AudioManager audioManager = (AudioManager) AbstractC1119a.e(context.getSystemService("audio"));
        if (c1493j == null) {
            c1493j = AbstractC1117K.f10560a >= 33 ? d.b(audioManager, c0830b) : null;
        }
        int i6 = AbstractC1117K.f10560a;
        if (i6 >= 33 && (AbstractC1117K.F0(context) || AbstractC1117K.y0(context))) {
            return d.a(audioManager, c0830b);
        }
        if (i6 >= 23 && b.b(audioManager, c1493j)) {
            return f15915c;
        }
        A.a aVar = new A.a();
        aVar.h(2);
        if (i6 >= 29 && (AbstractC1117K.F0(context) || AbstractC1117K.y0(context))) {
            aVar.j(c.a(c0830b));
            return new C1488e(d(C6.g.m(aVar.l()), 10));
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z6 = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if ((z6 || b()) && Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            aVar.j(f15916d);
        }
        if (intent == null || z6 || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new C1488e(d(C6.g.m(aVar.l()), 10));
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            aVar.j(C6.g.c(intArrayExtra));
        }
        return new C1488e(d(C6.g.m(aVar.l()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
    }

    public static int h(int i6) {
        int i7 = AbstractC1117K.f10560a;
        if (i7 <= 28) {
            if (i6 == 7) {
                i6 = 8;
            } else if (i6 == 3 || i6 == 4 || i6 == 5) {
                i6 = 6;
            }
        }
        if (i7 <= 26 && "fugu".equals(AbstractC1117K.f10561b) && i6 == 1) {
            i6 = 2;
        }
        return AbstractC1117K.N(i6);
    }

    public static Uri j() {
        if (b()) {
            return Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1488e)) {
            return false;
        }
        C1488e c1488e = (C1488e) obj;
        return AbstractC1117K.t(this.f15918a, c1488e.f15918a) && this.f15919b == c1488e.f15919b;
    }

    public int hashCode() {
        return this.f15919b + (AbstractC1117K.u(this.f15918a) * 31);
    }

    public Pair i(Z0.q qVar, C0830b c0830b) {
        int f6 = Z0.y.f((String) AbstractC1119a.e(qVar.f6990n), qVar.f6986j);
        if (!f15917e.containsKey(Integer.valueOf(f6))) {
            return null;
        }
        if (f6 == 18 && !l(18)) {
            f6 = 6;
        } else if ((f6 == 8 && !l(8)) || (f6 == 30 && !l(30))) {
            f6 = 7;
        }
        if (!l(f6)) {
            return null;
        }
        C0207e c0207e = (C0207e) AbstractC1119a.e((C0207e) this.f15918a.get(f6));
        int i6 = qVar.f6966B;
        if (i6 == -1 || f6 == 18) {
            int i7 = qVar.f6967C;
            if (i7 == -1) {
                i7 = 48000;
            }
            i6 = c0207e.b(i7, c0830b);
        } else if (!qVar.f6990n.equals("audio/vnd.dts.uhd;profile=p2") || AbstractC1117K.f10560a >= 33) {
            if (!c0207e.c(i6)) {
                return null;
            }
        } else if (i6 > 10) {
            return null;
        }
        int h6 = h(i6);
        if (h6 == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(f6), Integer.valueOf(h6));
    }

    public boolean k(Z0.q qVar, C0830b c0830b) {
        return i(qVar, c0830b) != null;
    }

    public boolean l(int i6) {
        return AbstractC1117K.r(this.f15918a, i6);
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f15919b + ", audioProfiles=" + this.f15918a + "]";
    }

    public C1488e(List list) {
        this.f15918a = new SparseArray();
        for (int i6 = 0; i6 < list.size(); i6++) {
            C0207e c0207e = (C0207e) list.get(i6);
            this.f15918a.put(c0207e.f15921a, c0207e);
        }
        int i7 = 0;
        for (int i8 = 0; i8 < this.f15918a.size(); i8++) {
            i7 = Math.max(i7, ((C0207e) this.f15918a.valueAt(i8)).f15922b);
        }
        this.f15919b = i7;
    }

    /* renamed from: i1.e$e, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class C0207e {

        /* renamed from: d, reason: collision with root package name */
        public static final C0207e f15920d;

        /* renamed from: a, reason: collision with root package name */
        public final int f15921a;

        /* renamed from: b, reason: collision with root package name */
        public final int f15922b;

        /* renamed from: c, reason: collision with root package name */
        public final z6.A f15923c;

        static {
            f15920d = AbstractC1117K.f10560a >= 33 ? new C0207e(2, (Set) a(10)) : new C0207e(2, 10);
        }

        public C0207e(int i6, Set set) {
            this.f15921a = i6;
            z6.A s6 = z6.A.s(set);
            this.f15923c = s6;
            g0 l6 = s6.l();
            int i7 = 0;
            while (l6.hasNext()) {
                i7 = Math.max(i7, Integer.bitCount(((Integer) l6.next()).intValue()));
            }
            this.f15922b = i7;
        }

        public static z6.A a(int i6) {
            A.a aVar = new A.a();
            for (int i7 = 1; i7 <= i6; i7++) {
                aVar.h(Integer.valueOf(AbstractC1117K.N(i7)));
            }
            return aVar.l();
        }

        public int b(int i6, C0830b c0830b) {
            return this.f15923c != null ? this.f15922b : AbstractC1117K.f10560a >= 29 ? c.b(this.f15921a, i6, c0830b) : ((Integer) AbstractC1119a.e((Integer) C1488e.f15917e.getOrDefault(Integer.valueOf(this.f15921a), 0))).intValue();
        }

        public boolean c(int i6) {
            if (this.f15923c == null) {
                return i6 <= this.f15922b;
            }
            int N5 = AbstractC1117K.N(i6);
            if (N5 == 0) {
                return false;
            }
            return this.f15923c.contains(Integer.valueOf(N5));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0207e)) {
                return false;
            }
            C0207e c0207e = (C0207e) obj;
            return this.f15921a == c0207e.f15921a && this.f15922b == c0207e.f15922b && AbstractC1117K.c(this.f15923c, c0207e.f15923c);
        }

        public int hashCode() {
            int i6 = ((this.f15921a * 31) + this.f15922b) * 31;
            z6.A a6 = this.f15923c;
            return i6 + (a6 == null ? 0 : a6.hashCode());
        }

        public String toString() {
            return "AudioProfile[format=" + this.f15921a + ", maxChannelCount=" + this.f15922b + ", channelMasks=" + this.f15923c + "]";
        }

        public C0207e(int i6, int i7) {
            this.f15921a = i6;
            this.f15922b = i7;
            this.f15923c = null;
        }
    }
}
