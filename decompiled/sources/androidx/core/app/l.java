package androidx.core.app;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public final String f8443a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f8444b;

    /* renamed from: c, reason: collision with root package name */
    public String f8445c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8446d;

    /* renamed from: e, reason: collision with root package name */
    public List f8447e;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {
        public static NotificationChannelGroup a(String str, CharSequence charSequence) {
            return new NotificationChannelGroup(str, charSequence);
        }

        public static List b(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getChannels();
        }

        public static String c(NotificationChannel notificationChannel) {
            return notificationChannel.getGroup();
        }

        public static String d(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getId();
        }

        public static CharSequence e(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getName();
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b {
        public static String a(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getDescription();
        }

        public static boolean b(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.isBlocked();
        }

        public static void c(NotificationChannelGroup notificationChannelGroup, String str) {
            notificationChannelGroup.setDescription(str);
        }
    }

    public l(String str) {
        this.f8447e = Collections.EMPTY_LIST;
        this.f8443a = (String) y0.g.f(str);
    }

    public final List a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            NotificationChannel notificationChannel = (NotificationChannel) it.next();
            if (this.f8443a.equals(a.c(notificationChannel))) {
                arrayList.add(new k(notificationChannel));
            }
        }
        return arrayList;
    }

    public NotificationChannelGroup b() {
        int i6 = Build.VERSION.SDK_INT;
        NotificationChannelGroup a6 = a.a(this.f8443a, this.f8444b);
        if (i6 >= 28) {
            b.c(a6, this.f8445c);
        }
        return a6;
    }

    public l(NotificationChannelGroup notificationChannelGroup) {
        this(notificationChannelGroup, Collections.EMPTY_LIST);
    }

    public l(NotificationChannelGroup notificationChannelGroup, List list) {
        this(a.d(notificationChannelGroup));
        this.f8444b = a.e(notificationChannelGroup);
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 28) {
            this.f8445c = b.a(notificationChannelGroup);
        }
        if (i6 >= 28) {
            this.f8446d = b.b(notificationChannelGroup);
            this.f8447e = a(a.b(notificationChannelGroup));
        } else {
            this.f8447e = a(list);
        }
    }
}
