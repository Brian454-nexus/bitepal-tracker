package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.service.notification.StatusBarNotification;
import android.util.Log;
import androidx.annotation.NonNull;
import c.InterfaceC1098a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class NotificationManagerCompat {
    public static final String ACTION_BIND_SIDE_CHANNEL = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL";
    private static final String CHECK_OP_NO_THROW = "checkOpNoThrow";
    public static final String EXTRA_USE_SIDE_CHANNEL = "android.support.useSideChannel";
    public static final int IMPORTANCE_DEFAULT = 3;
    public static final int IMPORTANCE_HIGH = 4;
    public static final int IMPORTANCE_LOW = 2;
    public static final int IMPORTANCE_MAX = 5;
    public static final int IMPORTANCE_MIN = 1;
    public static final int IMPORTANCE_NONE = 0;
    public static final int IMPORTANCE_UNSPECIFIED = -1000;
    public static final int INTERRUPTION_FILTER_ALARMS = 4;
    public static final int INTERRUPTION_FILTER_ALL = 1;
    public static final int INTERRUPTION_FILTER_NONE = 3;
    public static final int INTERRUPTION_FILTER_PRIORITY = 2;
    public static final int INTERRUPTION_FILTER_UNKNOWN = 0;
    static final int MAX_SIDE_CHANNEL_SDK_VERSION = 19;
    private static final String OP_POST_NOTIFICATION = "OP_POST_NOTIFICATION";
    private static final String SETTING_ENABLED_NOTIFICATION_LISTENERS = "enabled_notification_listeners";
    private static final int SIDE_CHANNEL_RETRY_BASE_INTERVAL_MS = 1000;
    private static final int SIDE_CHANNEL_RETRY_MAX_COUNT = 6;
    private static final String TAG = "NotifManCompat";
    private static String sEnabledNotificationListeners;
    private static i sSideChannelManager;
    private final Context mContext;
    private final NotificationManager mNotificationManager;
    private static final Object sEnabledNotificationListenersLock = new Object();
    private static Set<String> sEnabledNotificationListenerPackages = new HashSet();
    private static final Object sLock = new Object();

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {
        public static List a(NotificationManager notificationManager) {
            StatusBarNotification[] activeNotifications = notificationManager.getActiveNotifications();
            return activeNotifications == null ? new ArrayList() : Arrays.asList(activeNotifications);
        }

        public static int b(NotificationManager notificationManager) {
            return notificationManager.getCurrentInterruptionFilter();
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b {
        public static boolean a(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }

        public static int b(NotificationManager notificationManager) {
            return notificationManager.getImportance();
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class c {
        public static void a(NotificationManager notificationManager, NotificationChannel notificationChannel) {
            notificationManager.createNotificationChannel(notificationChannel);
        }

        public static void b(NotificationManager notificationManager, NotificationChannelGroup notificationChannelGroup) {
            notificationManager.createNotificationChannelGroup(notificationChannelGroup);
        }

        public static void c(NotificationManager notificationManager, List list) {
            notificationManager.createNotificationChannelGroups(list);
        }

        public static void d(NotificationManager notificationManager, List list) {
            notificationManager.createNotificationChannels(list);
        }

        public static void e(NotificationManager notificationManager, String str) {
            notificationManager.deleteNotificationChannel(str);
        }

        public static void f(NotificationManager notificationManager, String str) {
            notificationManager.deleteNotificationChannelGroup(str);
        }

        public static String g(NotificationChannel notificationChannel) {
            return notificationChannel.getId();
        }

        public static String h(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getId();
        }

        public static NotificationChannel i(NotificationManager notificationManager, String str) {
            return notificationManager.getNotificationChannel(str);
        }

        public static List j(NotificationManager notificationManager) {
            return notificationManager.getNotificationChannelGroups();
        }

        public static List k(NotificationManager notificationManager) {
            return notificationManager.getNotificationChannels();
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class d {
        public static NotificationChannelGroup a(NotificationManager notificationManager, String str) {
            return notificationManager.getNotificationChannelGroup(str);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class e {
        public static NotificationChannel a(NotificationManager notificationManager, String str, String str2) {
            return notificationManager.getNotificationChannel(str, str2);
        }

        public static String b(NotificationChannel notificationChannel) {
            return notificationChannel.getParentChannelId();
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class f {
        public static boolean a(NotificationManager notificationManager) {
            return notificationManager.canUseFullScreenIntent();
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class g implements j {

        /* renamed from: a, reason: collision with root package name */
        public final String f8400a;

        /* renamed from: b, reason: collision with root package name */
        public final int f8401b;

        /* renamed from: c, reason: collision with root package name */
        public final String f8402c;

        /* renamed from: d, reason: collision with root package name */
        public final Notification f8403d;

        public g(String str, int i6, String str2, Notification notification) {
            this.f8400a = str;
            this.f8401b = i6;
            this.f8402c = str2;
            this.f8403d = notification;
        }

        @Override // androidx.core.app.NotificationManagerCompat.j
        public void a(InterfaceC1098a interfaceC1098a) {
            interfaceC1098a.Z(this.f8400a, this.f8401b, this.f8402c, this.f8403d);
        }

        public String toString() {
            return "NotifyTask[packageName:" + this.f8400a + ", id:" + this.f8401b + ", tag:" + this.f8402c + "]";
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class h {

        /* renamed from: a, reason: collision with root package name */
        public final ComponentName f8404a;

        /* renamed from: b, reason: collision with root package name */
        public final IBinder f8405b;

        public h(ComponentName componentName, IBinder iBinder) {
            this.f8404a = componentName;
            this.f8405b = iBinder;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class i implements Handler.Callback, ServiceConnection {

        /* renamed from: a, reason: collision with root package name */
        public final Context f8406a;

        /* renamed from: b, reason: collision with root package name */
        public final HandlerThread f8407b;

        /* renamed from: c, reason: collision with root package name */
        public final Handler f8408c;

        /* renamed from: d, reason: collision with root package name */
        public final Map f8409d = new HashMap();

        /* renamed from: e, reason: collision with root package name */
        public Set f8410e = new HashSet();

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static class a {

            /* renamed from: a, reason: collision with root package name */
            public final ComponentName f8411a;

            /* renamed from: c, reason: collision with root package name */
            public InterfaceC1098a f8413c;

            /* renamed from: b, reason: collision with root package name */
            public boolean f8412b = false;

            /* renamed from: d, reason: collision with root package name */
            public ArrayDeque f8414d = new ArrayDeque();

            /* renamed from: e, reason: collision with root package name */
            public int f8415e = 0;

            public a(ComponentName componentName) {
                this.f8411a = componentName;
            }
        }

        public i(Context context) {
            this.f8406a = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.f8407b = handlerThread;
            handlerThread.start();
            this.f8408c = new Handler(handlerThread.getLooper(), this);
        }

        public final boolean a(a aVar) {
            if (aVar.f8412b) {
                return true;
            }
            boolean bindService = this.f8406a.bindService(new Intent(NotificationManagerCompat.ACTION_BIND_SIDE_CHANNEL).setComponent(aVar.f8411a), this, 33);
            aVar.f8412b = bindService;
            if (bindService) {
                aVar.f8415e = 0;
            } else {
                Log.w(NotificationManagerCompat.TAG, "Unable to bind to listener " + aVar.f8411a);
                this.f8406a.unbindService(this);
            }
            return aVar.f8412b;
        }

        public final void b(a aVar) {
            if (aVar.f8412b) {
                this.f8406a.unbindService(this);
                aVar.f8412b = false;
            }
            aVar.f8413c = null;
        }

        public final void c(j jVar) {
            j();
            for (a aVar : this.f8409d.values()) {
                aVar.f8414d.add(jVar);
                g(aVar);
            }
        }

        public final void d(ComponentName componentName) {
            a aVar = (a) this.f8409d.get(componentName);
            if (aVar != null) {
                g(aVar);
            }
        }

        public final void e(ComponentName componentName, IBinder iBinder) {
            a aVar = (a) this.f8409d.get(componentName);
            if (aVar != null) {
                aVar.f8413c = InterfaceC1098a.AbstractBinderC0161a.b(iBinder);
                aVar.f8415e = 0;
                g(aVar);
            }
        }

        public final void f(ComponentName componentName) {
            a aVar = (a) this.f8409d.get(componentName);
            if (aVar != null) {
                b(aVar);
            }
        }

        public final void g(a aVar) {
            if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                Log.d(NotificationManagerCompat.TAG, "Processing component " + aVar.f8411a + ", " + aVar.f8414d.size() + " queued tasks");
            }
            if (aVar.f8414d.isEmpty()) {
                return;
            }
            if (!a(aVar) || aVar.f8413c == null) {
                i(aVar);
                return;
            }
            while (true) {
                j jVar = (j) aVar.f8414d.peek();
                if (jVar == null) {
                    break;
                }
                try {
                    if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                        Log.d(NotificationManagerCompat.TAG, "Sending task " + jVar);
                    }
                    jVar.a(aVar.f8413c);
                    aVar.f8414d.remove();
                } catch (DeadObjectException unused) {
                    if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                        Log.d(NotificationManagerCompat.TAG, "Remote service has died: " + aVar.f8411a);
                    }
                } catch (RemoteException e6) {
                    Log.w(NotificationManagerCompat.TAG, "RemoteException communicating with " + aVar.f8411a, e6);
                }
            }
            if (aVar.f8414d.isEmpty()) {
                return;
            }
            i(aVar);
        }

        public void h(j jVar) {
            this.f8408c.obtainMessage(0, jVar).sendToTarget();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i6 = message.what;
            if (i6 == 0) {
                c((j) message.obj);
                return true;
            }
            if (i6 == 1) {
                h hVar = (h) message.obj;
                e(hVar.f8404a, hVar.f8405b);
                return true;
            }
            if (i6 == 2) {
                f((ComponentName) message.obj);
                return true;
            }
            if (i6 != 3) {
                return false;
            }
            d((ComponentName) message.obj);
            return true;
        }

        public final void i(a aVar) {
            if (this.f8408c.hasMessages(3, aVar.f8411a)) {
                return;
            }
            int i6 = aVar.f8415e;
            int i7 = i6 + 1;
            aVar.f8415e = i7;
            if (i7 <= 6) {
                int i8 = (1 << i6) * NotificationManagerCompat.SIDE_CHANNEL_RETRY_BASE_INTERVAL_MS;
                if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                    Log.d(NotificationManagerCompat.TAG, "Scheduling retry for " + i8 + " ms");
                }
                this.f8408c.sendMessageDelayed(this.f8408c.obtainMessage(3, aVar.f8411a), i8);
                return;
            }
            Log.w(NotificationManagerCompat.TAG, "Giving up on delivering " + aVar.f8414d.size() + " tasks to " + aVar.f8411a + " after " + aVar.f8415e + " retries");
            aVar.f8414d.clear();
        }

        public final void j() {
            Set<String> enabledListenerPackages = NotificationManagerCompat.getEnabledListenerPackages(this.f8406a);
            if (enabledListenerPackages.equals(this.f8410e)) {
                return;
            }
            this.f8410e = enabledListenerPackages;
            List<ResolveInfo> queryIntentServices = this.f8406a.getPackageManager().queryIntentServices(new Intent().setAction(NotificationManagerCompat.ACTION_BIND_SIDE_CHANNEL), 0);
            HashSet<ComponentName> hashSet = new HashSet();
            for (ResolveInfo resolveInfo : queryIntentServices) {
                if (enabledListenerPackages.contains(resolveInfo.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        Log.w(NotificationManagerCompat.TAG, "Permission present on component " + componentName + ", not adding listener record.");
                    } else {
                        hashSet.add(componentName);
                    }
                }
            }
            for (ComponentName componentName2 : hashSet) {
                if (!this.f8409d.containsKey(componentName2)) {
                    if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                        Log.d(NotificationManagerCompat.TAG, "Adding listener record for " + componentName2);
                    }
                    this.f8409d.put(componentName2, new a(componentName2));
                }
            }
            Iterator it = this.f8409d.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!hashSet.contains(entry.getKey())) {
                    if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                        Log.d(NotificationManagerCompat.TAG, "Removing listener record for " + entry.getKey());
                    }
                    b((a) entry.getValue());
                    it.remove();
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                Log.d(NotificationManagerCompat.TAG, "Connected to service " + componentName);
            }
            this.f8408c.obtainMessage(1, new h(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                Log.d(NotificationManagerCompat.TAG, "Disconnected from service " + componentName);
            }
            this.f8408c.obtainMessage(2, componentName).sendToTarget();
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface j {
        void a(InterfaceC1098a interfaceC1098a);
    }

    private NotificationManagerCompat(Context context) {
        this.mContext = context;
        this.mNotificationManager = (NotificationManager) context.getSystemService("notification");
    }

    @NonNull
    public static NotificationManagerCompat from(@NonNull Context context) {
        return new NotificationManagerCompat(context);
    }

    @NonNull
    public static Set<String> getEnabledListenerPackages(@NonNull Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), SETTING_ENABLED_NOTIFICATION_LISTENERS);
        synchronized (sEnabledNotificationListenersLock) {
            if (string != null) {
                try {
                    if (!string.equals(sEnabledNotificationListeners)) {
                        String[] split = string.split(":", -1);
                        HashSet hashSet = new HashSet(split.length);
                        for (String str : split) {
                            ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                            if (unflattenFromString != null) {
                                hashSet.add(unflattenFromString.getPackageName());
                            }
                        }
                        sEnabledNotificationListenerPackages = hashSet;
                        sEnabledNotificationListeners = string;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            set = sEnabledNotificationListenerPackages;
        }
        return set;
    }

    private void pushSideChannelQueue(j jVar) {
        synchronized (sLock) {
            try {
                if (sSideChannelManager == null) {
                    sSideChannelManager = new i(this.mContext.getApplicationContext());
                }
                sSideChannelManager.h(jVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static boolean useSideChannelForNotification(Notification notification) {
        Bundle a6 = m.a(notification);
        return a6 != null && a6.getBoolean(EXTRA_USE_SIDE_CHANNEL);
    }

    public boolean areNotificationsEnabled() {
        return b.a(this.mNotificationManager);
    }

    public boolean canUseFullScreenIntent() {
        int i6 = Build.VERSION.SDK_INT;
        if (i6 < 29) {
            return true;
        }
        return i6 < 34 ? this.mContext.checkSelfPermission("android.permission.USE_FULL_SCREEN_INTENT") == 0 : f.a(this.mNotificationManager);
    }

    public void cancel(int i6) {
        cancel(null, i6);
    }

    public void cancelAll() {
        this.mNotificationManager.cancelAll();
    }

    public void createNotificationChannel(@NonNull NotificationChannel notificationChannel) {
        c.a(this.mNotificationManager, notificationChannel);
    }

    public void createNotificationChannelGroup(@NonNull NotificationChannelGroup notificationChannelGroup) {
        c.b(this.mNotificationManager, notificationChannelGroup);
    }

    public void createNotificationChannelGroups(@NonNull List<NotificationChannelGroup> list) {
        c.c(this.mNotificationManager, list);
    }

    public void createNotificationChannelGroupsCompat(@NonNull List<l> list) {
        if (list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<l> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().b());
        }
        c.c(this.mNotificationManager, arrayList);
    }

    public void createNotificationChannels(@NonNull List<NotificationChannel> list) {
        c.d(this.mNotificationManager, list);
    }

    public void createNotificationChannelsCompat(@NonNull List<k> list) {
        if (list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<k> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().a());
        }
        c.d(this.mNotificationManager, arrayList);
    }

    public void deleteNotificationChannel(@NonNull String str) {
        c.e(this.mNotificationManager, str);
    }

    public void deleteNotificationChannelGroup(@NonNull String str) {
        c.f(this.mNotificationManager, str);
    }

    public void deleteUnlistedNotificationChannels(@NonNull Collection<String> collection) {
        for (NotificationChannel notificationChannel : c.k(this.mNotificationManager)) {
            if (!collection.contains(c.g(notificationChannel)) && (Build.VERSION.SDK_INT < 30 || !collection.contains(e.b(notificationChannel)))) {
                c.e(this.mNotificationManager, c.g(notificationChannel));
            }
        }
    }

    @NonNull
    public List<StatusBarNotification> getActiveNotifications() {
        return a.a(this.mNotificationManager);
    }

    public int getCurrentInterruptionFilter() {
        return a.b(this.mNotificationManager);
    }

    public int getImportance() {
        return b.b(this.mNotificationManager);
    }

    public NotificationChannel getNotificationChannel(@NonNull String str) {
        return c.i(this.mNotificationManager, str);
    }

    public k getNotificationChannelCompat(@NonNull String str) {
        NotificationChannel notificationChannel = getNotificationChannel(str);
        if (notificationChannel != null) {
            return new k(notificationChannel);
        }
        return null;
    }

    public NotificationChannelGroup getNotificationChannelGroup(@NonNull String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            return d.a(this.mNotificationManager, str);
        }
        for (NotificationChannelGroup notificationChannelGroup : getNotificationChannelGroups()) {
            if (c.h(notificationChannelGroup).equals(str)) {
                return notificationChannelGroup;
            }
        }
        return null;
    }

    public l getNotificationChannelGroupCompat(@NonNull String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            NotificationChannelGroup notificationChannelGroup = getNotificationChannelGroup(str);
            if (notificationChannelGroup != null) {
                return new l(notificationChannelGroup);
            }
            return null;
        }
        NotificationChannelGroup notificationChannelGroup2 = getNotificationChannelGroup(str);
        if (notificationChannelGroup2 != null) {
            return new l(notificationChannelGroup2, getNotificationChannels());
        }
        return null;
    }

    @NonNull
    public List<NotificationChannelGroup> getNotificationChannelGroups() {
        return c.j(this.mNotificationManager);
    }

    @NonNull
    public List<l> getNotificationChannelGroupsCompat() {
        int i6 = Build.VERSION.SDK_INT;
        List<NotificationChannelGroup> notificationChannelGroups = getNotificationChannelGroups();
        if (notificationChannelGroups.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        List<NotificationChannel> notificationChannels = i6 >= 28 ? Collections.EMPTY_LIST : getNotificationChannels();
        ArrayList arrayList = new ArrayList(notificationChannelGroups.size());
        for (NotificationChannelGroup notificationChannelGroup : notificationChannelGroups) {
            if (Build.VERSION.SDK_INT >= 28) {
                arrayList.add(new l(notificationChannelGroup));
            } else {
                arrayList.add(new l(notificationChannelGroup, notificationChannels));
            }
        }
        return arrayList;
    }

    @NonNull
    public List<NotificationChannel> getNotificationChannels() {
        return c.k(this.mNotificationManager);
    }

    @NonNull
    public List<k> getNotificationChannelsCompat() {
        List<NotificationChannel> notificationChannels = getNotificationChannels();
        if (notificationChannels.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(notificationChannels.size());
        Iterator<NotificationChannel> it = notificationChannels.iterator();
        while (it.hasNext()) {
            arrayList.add(new k(it.next()));
        }
        return arrayList;
    }

    public void notify(int i6, @NonNull Notification notification) {
        notify(null, i6, notification);
    }

    public void cancel(String str, int i6) {
        this.mNotificationManager.cancel(str, i6);
    }

    public void createNotificationChannel(@NonNull k kVar) {
        createNotificationChannel(kVar.a());
    }

    public void createNotificationChannelGroup(@NonNull l lVar) {
        createNotificationChannelGroup(lVar.b());
    }

    public NotificationChannel getNotificationChannel(@NonNull String str, @NonNull String str2) {
        if (Build.VERSION.SDK_INT >= 30) {
            return e.a(this.mNotificationManager, str, str2);
        }
        return getNotificationChannel(str);
    }

    public void notify(String str, int i6, @NonNull Notification notification) {
        if (useSideChannelForNotification(notification)) {
            pushSideChannelQueue(new g(this.mContext.getPackageName(), i6, str, notification));
            this.mNotificationManager.cancel(str, i6);
        } else {
            this.mNotificationManager.notify(str, i6, notification);
        }
    }

    public k getNotificationChannelCompat(@NonNull String str, @NonNull String str2) {
        NotificationChannel notificationChannel = getNotificationChannel(str, str2);
        if (notificationChannel != null) {
            return new k(notificationChannel);
        }
        return null;
    }

    public NotificationManagerCompat(@NonNull NotificationManager notificationManager, @NonNull Context context) {
        this.mContext = context;
        this.mNotificationManager = notificationManager;
    }

    public void notify(@NonNull List<Object> list) {
        if (list.size() <= 0) {
            return;
        }
        android.support.v4.media.session.b.a(list.get(0));
        throw null;
    }
}
