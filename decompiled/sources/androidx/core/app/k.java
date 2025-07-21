package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public final String f8425a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f8426b;

    /* renamed from: c, reason: collision with root package name */
    public int f8427c;

    /* renamed from: d, reason: collision with root package name */
    public String f8428d;

    /* renamed from: e, reason: collision with root package name */
    public String f8429e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8430f;

    /* renamed from: g, reason: collision with root package name */
    public Uri f8431g;

    /* renamed from: h, reason: collision with root package name */
    public AudioAttributes f8432h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f8433i;

    /* renamed from: j, reason: collision with root package name */
    public int f8434j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f8435k;

    /* renamed from: l, reason: collision with root package name */
    public long[] f8436l;

    /* renamed from: m, reason: collision with root package name */
    public String f8437m;

    /* renamed from: n, reason: collision with root package name */
    public String f8438n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f8439o;

    /* renamed from: p, reason: collision with root package name */
    public int f8440p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f8441q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f8442r;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {
        public static boolean a(NotificationChannel notificationChannel) {
            return notificationChannel.canBypassDnd();
        }

        public static boolean b(NotificationChannel notificationChannel) {
            return notificationChannel.canShowBadge();
        }

        public static NotificationChannel c(String str, CharSequence charSequence, int i6) {
            return new NotificationChannel(str, charSequence, i6);
        }

        public static void d(NotificationChannel notificationChannel, boolean z6) {
            notificationChannel.enableLights(z6);
        }

        public static void e(NotificationChannel notificationChannel, boolean z6) {
            notificationChannel.enableVibration(z6);
        }

        public static AudioAttributes f(NotificationChannel notificationChannel) {
            return notificationChannel.getAudioAttributes();
        }

        public static String g(NotificationChannel notificationChannel) {
            return notificationChannel.getDescription();
        }

        public static String h(NotificationChannel notificationChannel) {
            return notificationChannel.getGroup();
        }

        public static String i(NotificationChannel notificationChannel) {
            return notificationChannel.getId();
        }

        public static int j(NotificationChannel notificationChannel) {
            return notificationChannel.getImportance();
        }

        public static int k(NotificationChannel notificationChannel) {
            return notificationChannel.getLightColor();
        }

        public static int l(NotificationChannel notificationChannel) {
            return notificationChannel.getLockscreenVisibility();
        }

        public static CharSequence m(NotificationChannel notificationChannel) {
            return notificationChannel.getName();
        }

        public static Uri n(NotificationChannel notificationChannel) {
            return notificationChannel.getSound();
        }

        public static long[] o(NotificationChannel notificationChannel) {
            return notificationChannel.getVibrationPattern();
        }

        public static void p(NotificationChannel notificationChannel, String str) {
            notificationChannel.setDescription(str);
        }

        public static void q(NotificationChannel notificationChannel, String str) {
            notificationChannel.setGroup(str);
        }

        public static void r(NotificationChannel notificationChannel, int i6) {
            notificationChannel.setLightColor(i6);
        }

        public static void s(NotificationChannel notificationChannel, boolean z6) {
            notificationChannel.setShowBadge(z6);
        }

        public static void t(NotificationChannel notificationChannel, Uri uri, AudioAttributes audioAttributes) {
            notificationChannel.setSound(uri, audioAttributes);
        }

        public static void u(NotificationChannel notificationChannel, long[] jArr) {
            notificationChannel.setVibrationPattern(jArr);
        }

        public static boolean v(NotificationChannel notificationChannel) {
            return notificationChannel.shouldShowLights();
        }

        public static boolean w(NotificationChannel notificationChannel) {
            return notificationChannel.shouldVibrate();
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b {
        public static boolean a(NotificationChannel notificationChannel) {
            return notificationChannel.canBubble();
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class c {
        public static String a(NotificationChannel notificationChannel) {
            return notificationChannel.getConversationId();
        }

        public static String b(NotificationChannel notificationChannel) {
            return notificationChannel.getParentChannelId();
        }

        public static boolean c(NotificationChannel notificationChannel) {
            return notificationChannel.isImportantConversation();
        }

        public static void d(NotificationChannel notificationChannel, String str, String str2) {
            notificationChannel.setConversationId(str, str2);
        }
    }

    public k(String str, int i6) {
        this.f8430f = true;
        this.f8431g = Settings.System.DEFAULT_NOTIFICATION_URI;
        this.f8434j = 0;
        this.f8425a = (String) y0.g.f(str);
        this.f8427c = i6;
        this.f8432h = Notification.AUDIO_ATTRIBUTES_DEFAULT;
    }

    public NotificationChannel a() {
        String str;
        String str2;
        int i6 = Build.VERSION.SDK_INT;
        NotificationChannel c6 = a.c(this.f8425a, this.f8426b, this.f8427c);
        a.p(c6, this.f8428d);
        a.q(c6, this.f8429e);
        a.s(c6, this.f8430f);
        a.t(c6, this.f8431g, this.f8432h);
        a.d(c6, this.f8433i);
        a.r(c6, this.f8434j);
        a.u(c6, this.f8436l);
        a.e(c6, this.f8435k);
        if (i6 >= 30 && (str = this.f8437m) != null && (str2 = this.f8438n) != null) {
            c.d(c6, str, str2);
        }
        return c6;
    }

    public k(NotificationChannel notificationChannel) {
        this(a.i(notificationChannel), a.j(notificationChannel));
        this.f8426b = a.m(notificationChannel);
        this.f8428d = a.g(notificationChannel);
        this.f8429e = a.h(notificationChannel);
        this.f8430f = a.b(notificationChannel);
        this.f8431g = a.n(notificationChannel);
        this.f8432h = a.f(notificationChannel);
        this.f8433i = a.v(notificationChannel);
        this.f8434j = a.k(notificationChannel);
        this.f8435k = a.w(notificationChannel);
        this.f8436l = a.o(notificationChannel);
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 30) {
            this.f8437m = c.b(notificationChannel);
            this.f8438n = c.a(notificationChannel);
        }
        this.f8439o = a.a(notificationChannel);
        this.f8440p = a.l(notificationChannel);
        if (i6 >= 29) {
            this.f8441q = b.a(notificationChannel);
        }
        if (i6 >= 30) {
            this.f8442r = c.c(notificationChannel);
        }
    }
}
