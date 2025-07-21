package com.dexterous.flutterlocalnotifications;

import B9.a;
import G9.i;
import G9.j;
import G9.l;
import G9.m;
import G9.n;
import android.app.Activity;
import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.AudioAttributes;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.app.m;
import androidx.core.app.t;
import androidx.core.app.v;
import androidx.core.graphics.drawable.IconCompat;
import com.dexterous.flutterlocalnotifications.models.BitmapSource;
import com.dexterous.flutterlocalnotifications.models.DateTimeComponents;
import com.dexterous.flutterlocalnotifications.models.IconSource;
import com.dexterous.flutterlocalnotifications.models.MessageDetails;
import com.dexterous.flutterlocalnotifications.models.NotificationAction;
import com.dexterous.flutterlocalnotifications.models.NotificationChannelAction;
import com.dexterous.flutterlocalnotifications.models.NotificationChannelDetails;
import com.dexterous.flutterlocalnotifications.models.NotificationChannelGroupDetails;
import com.dexterous.flutterlocalnotifications.models.NotificationDetails;
import com.dexterous.flutterlocalnotifications.models.NotificationStyle;
import com.dexterous.flutterlocalnotifications.models.PersonDetails;
import com.dexterous.flutterlocalnotifications.models.RepeatInterval;
import com.dexterous.flutterlocalnotifications.models.ScheduleMode;
import com.dexterous.flutterlocalnotifications.models.ScheduledNotificationRepeatFrequency;
import com.dexterous.flutterlocalnotifications.models.SoundSource;
import com.dexterous.flutterlocalnotifications.models.styles.BigPictureStyleInformation;
import com.dexterous.flutterlocalnotifications.models.styles.BigTextStyleInformation;
import com.dexterous.flutterlocalnotifications.models.styles.DefaultStyleInformation;
import com.dexterous.flutterlocalnotifications.models.styles.InboxStyleInformation;
import com.dexterous.flutterlocalnotifications.models.styles.MessagingStyleInformation;
import com.dexterous.flutterlocalnotifications.models.styles.StyleInformation;
import com.dexterous.flutterlocalnotifications.utils.BooleanUtils;
import com.dexterous.flutterlocalnotifications.utils.StringUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.format.DateTimeFormatter;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import n0.AbstractC1809a;

@Keep
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class FlutterLocalNotificationsPlugin implements j.c, m, n, l, B9.a, C9.a {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String ACTION_ID = "actionId";
    private static final String ARE_NOTIFICATIONS_ENABLED_METHOD = "areNotificationsEnabled";
    private static final String CALLBACK_HANDLE = "callback_handle";
    private static final String CANCEL_ALL_METHOD = "cancelAll";
    private static final String CANCEL_ID = "id";
    private static final String CANCEL_METHOD = "cancel";
    static final String CANCEL_NOTIFICATION = "cancelNotification";
    private static final String CANCEL_TAG = "tag";
    private static final String CAN_SCHEDULE_EXACT_NOTIFICATIONS_METHOD = "canScheduleExactNotifications";
    private static final String CREATE_NOTIFICATION_CHANNEL_GROUP_METHOD = "createNotificationChannelGroup";
    private static final String CREATE_NOTIFICATION_CHANNEL_METHOD = "createNotificationChannel";
    private static final String DEFAULT_ICON = "defaultIcon";
    private static final String DELETE_NOTIFICATION_CHANNEL_GROUP_METHOD = "deleteNotificationChannelGroup";
    private static final String DELETE_NOTIFICATION_CHANNEL_METHOD = "deleteNotificationChannel";
    private static final String DISPATCHER_HANDLE = "dispatcher_handle";
    private static final String DRAWABLE = "drawable";
    private static final String EXACT_ALARMS_PERMISSION_ERROR_CODE = "exact_alarms_not_permitted";
    static final int EXACT_ALARM_PERMISSION_REQUEST_CODE = 2;
    static final int FULL_SCREEN_INTENT_PERMISSION_REQUEST_CODE = 3;
    private static final String GET_ACTIVE_NOTIFICATIONS_ERROR_MESSAGE = "Android version must be 6.0 or newer to use getActiveNotifications";
    private static final String GET_ACTIVE_NOTIFICATIONS_METHOD = "getActiveNotifications";
    private static final String GET_ACTIVE_NOTIFICATION_MESSAGING_STYLE_ERROR_CODE = "getActiveNotificationMessagingStyleError";
    private static final String GET_ACTIVE_NOTIFICATION_MESSAGING_STYLE_METHOD = "getActiveNotificationMessagingStyle";
    private static final String GET_CALLBACK_HANDLE_METHOD = "getCallbackHandle";
    private static final String GET_NOTIFICATION_APP_LAUNCH_DETAILS_METHOD = "getNotificationAppLaunchDetails";
    private static final String GET_NOTIFICATION_CHANNELS_ERROR_CODE = "getNotificationChannelsError";
    private static final String GET_NOTIFICATION_CHANNELS_METHOD = "getNotificationChannels";
    private static final String INITIALIZE_METHOD = "initialize";
    private static final String INPUT = "input";
    private static final String INPUT_RESULT = "FlutterLocalNotificationsPluginInputResult";
    private static final String INVALID_BIG_PICTURE_ERROR_CODE = "invalid_big_picture";
    private static final String INVALID_DRAWABLE_RESOURCE_ERROR_MESSAGE = "The resource %s could not be found. Please make sure it has been added as a drawable resource to your Android head project.";
    private static final String INVALID_ICON_ERROR_CODE = "invalid_icon";
    private static final String INVALID_LARGE_ICON_ERROR_CODE = "invalid_large_icon";
    private static final String INVALID_LED_DETAILS_ERROR_CODE = "invalid_led_details";
    private static final String INVALID_LED_DETAILS_ERROR_MESSAGE = "Must specify both ledOnMs and ledOffMs to configure the blink cycle on older versions of Android before Oreo";
    private static final String INVALID_RAW_RESOURCE_ERROR_MESSAGE = "The resource %s could not be found. Please make sure it has been added as a raw resource to your Android head project.";
    private static final String INVALID_SOUND_ERROR_CODE = "invalid_sound";
    private static final String METHOD_CHANNEL = "dexterous.com/flutter/local_notifications";
    static String NOTIFICATION_DETAILS = "notificationDetails";
    static final String NOTIFICATION_ID = "notificationId";
    private static final String NOTIFICATION_LAUNCHED_APP = "notificationLaunchedApp";
    static final int NOTIFICATION_PERMISSION_REQUEST_CODE = 1;
    private static final String NOTIFICATION_RESPONSE_TYPE = "notificationResponseType";
    static final String NOTIFICATION_TAG = "notificationTag";
    static final String PAYLOAD = "payload";
    private static final String PENDING_NOTIFICATION_REQUESTS_METHOD = "pendingNotificationRequests";
    private static final String PERIODICALLY_SHOW_METHOD = "periodicallyShow";
    private static final String PERIODICALLY_SHOW_WITH_DURATION = "periodicallyShowWithDuration";
    private static final String PERMISSION_REQUEST_IN_PROGRESS_ERROR_CODE = "permissionRequestInProgress";
    private static final String PERMISSION_REQUEST_IN_PROGRESS_ERROR_MESSAGE = "Another permission request is already in progress";
    private static final String REQUEST_EXACT_ALARMS_PERMISSION_METHOD = "requestExactAlarmsPermission";
    private static final String REQUEST_FULL_SCREEN_INTENT_PERMISSION_METHOD = "requestFullScreenIntentPermission";
    private static final String REQUEST_NOTIFICATIONS_PERMISSION_METHOD = "requestNotificationsPermission";
    private static final String SCHEDULED_NOTIFICATIONS = "scheduled_notifications";
    private static final String SELECT_FOREGROUND_NOTIFICATION_ACTION = "SELECT_FOREGROUND_NOTIFICATION";
    private static final String SELECT_NOTIFICATION = "SELECT_NOTIFICATION";
    private static final String SHARED_PREFERENCES_KEY = "notification_plugin_cache";
    private static final String SHOW_METHOD = "show";
    private static final String START_FOREGROUND_SERVICE = "startForegroundService";
    private static final String STOP_FOREGROUND_SERVICE = "stopForegroundService";
    private static final String TAG = "FLTLocalNotifPlugin";
    private static final String UNSUPPORTED_OS_VERSION_ERROR_CODE = "unsupported_os_version";
    private static final String ZONED_SCHEDULE_METHOD = "zonedSchedule";
    static Gson gson;
    private Context applicationContext;
    private com.dexterous.flutterlocalnotifications.e callback;
    private j channel;
    private Activity mainActivity;
    private f permissionRequestProgress = f.None;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements com.dexterous.flutterlocalnotifications.e {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j.d f13291a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ FlutterLocalNotificationsPlugin f13292b;

        public a(FlutterLocalNotificationsPlugin flutterLocalNotificationsPlugin, j.d dVar) {
            this.f13291a = dVar;
            this.f13292b = flutterLocalNotificationsPlugin;
        }

        @Override // com.dexterous.flutterlocalnotifications.e
        public void a(String str) {
            this.f13291a.b(FlutterLocalNotificationsPlugin.PERMISSION_REQUEST_IN_PROGRESS_ERROR_CODE, str, (Object) null);
        }

        @Override // com.dexterous.flutterlocalnotifications.e
        public void b(boolean z6) {
            this.f13291a.a(Boolean.valueOf(z6));
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class b implements com.dexterous.flutterlocalnotifications.e {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j.d f13293a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ FlutterLocalNotificationsPlugin f13294b;

        public b(FlutterLocalNotificationsPlugin flutterLocalNotificationsPlugin, j.d dVar) {
            this.f13293a = dVar;
            this.f13294b = flutterLocalNotificationsPlugin;
        }

        @Override // com.dexterous.flutterlocalnotifications.e
        public void a(String str) {
            this.f13293a.b(FlutterLocalNotificationsPlugin.PERMISSION_REQUEST_IN_PROGRESS_ERROR_CODE, str, (Object) null);
        }

        @Override // com.dexterous.flutterlocalnotifications.e
        public void b(boolean z6) {
            this.f13293a.a(Boolean.valueOf(z6));
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class c implements com.dexterous.flutterlocalnotifications.e {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j.d f13295a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ FlutterLocalNotificationsPlugin f13296b;

        public c(FlutterLocalNotificationsPlugin flutterLocalNotificationsPlugin, j.d dVar) {
            this.f13295a = dVar;
            this.f13296b = flutterLocalNotificationsPlugin;
        }

        @Override // com.dexterous.flutterlocalnotifications.e
        public void a(String str) {
            this.f13295a.b(FlutterLocalNotificationsPlugin.PERMISSION_REQUEST_IN_PROGRESS_ERROR_CODE, str, (Object) null);
        }

        @Override // com.dexterous.flutterlocalnotifications.e
        public void b(boolean z6) {
            this.f13295a.a(Boolean.valueOf(z6));
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13297a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f13298b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f13299c;

        static {
            int[] iArr = new int[NotificationStyle.values().length];
            f13299c = iArr;
            try {
                iArr[NotificationStyle.BigPicture.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13299c[NotificationStyle.BigText.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13299c[NotificationStyle.Inbox.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13299c[NotificationStyle.Messaging.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13299c[NotificationStyle.Media.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[IconSource.values().length];
            f13298b = iArr2;
            try {
                iArr2[IconSource.DrawableResource.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13298b[IconSource.BitmapFilePath.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f13298b[IconSource.ContentUri.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f13298b[IconSource.FlutterBitmapAsset.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f13298b[IconSource.ByteArray.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            int[] iArr3 = new int[RepeatInterval.values().length];
            f13297a = iArr3;
            try {
                iArr3[RepeatInterval.EveryMinute.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f13297a[RepeatInterval.Hourly.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f13297a[RepeatInterval.Daily.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f13297a[RepeatInterval.Weekly.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class e extends g {
        public e() {
            super(FlutterLocalNotificationsPlugin.EXACT_ALARMS_PERMISSION_ERROR_CODE, "Exact alarms are not permitted");
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public enum f {
        None,
        RequestingNotificationPermission,
        RequestingExactAlarmsPermission,
        RequestingFullScreenIntentPermission
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class g extends RuntimeException {

        /* renamed from: a, reason: collision with root package name */
        public final String f13305a;

        public g(String str, String str2) {
            super(str2);
            this.f13305a = str;
        }
    }

    private static void applyGrouping(NotificationDetails notificationDetails, m.e eVar) {
        if (StringUtils.isNullOrEmpty(notificationDetails.groupKey).booleanValue()) {
            return;
        }
        eVar.u(notificationDetails.groupKey);
        if (BooleanUtils.getValue(notificationDetails.setAsGroupSummary)) {
            eVar.w(true);
        }
        eVar.v(notificationDetails.groupAlertBehavior.intValue());
    }

    private void areNotificationsEnabled(j.d dVar) {
        dVar.a(Boolean.valueOf(getNotificationManager(this.applicationContext).areNotificationsEnabled()));
    }

    @NonNull
    public static Gson buildGson() {
        if (gson == null) {
            gson = new com.google.gson.d().c(ScheduleMode.class, new ScheduleMode.Deserializer()).d(RuntimeTypeAdapterFactory.of(StyleInformation.class).registerSubtype(DefaultStyleInformation.class).registerSubtype(BigTextStyleInformation.class).registerSubtype(BigPictureStyleInformation.class).registerSubtype(InboxStyleInformation.class).registerSubtype(MessagingStyleInformation.class)).b();
        }
        return gson;
    }

    private static t buildPerson(Context context, PersonDetails personDetails) {
        IconSource iconSource;
        if (personDetails == null) {
            return null;
        }
        t.b bVar = new t.b();
        bVar.b(BooleanUtils.getValue(personDetails.bot));
        Object obj = personDetails.icon;
        if (obj != null && (iconSource = personDetails.iconBitmapSource) != null) {
            bVar.c(getIconFromSource(context, obj, iconSource));
        }
        bVar.d(BooleanUtils.getValue(personDetails.important));
        String str = personDetails.key;
        if (str != null) {
            bVar.e(str);
        }
        String str2 = personDetails.name;
        if (str2 != null) {
            bVar.f(str2);
        }
        String str3 = personDetails.uri;
        if (str3 != null) {
            bVar.g(str3);
        }
        return bVar.a();
    }

    private static long calculateNextNotificationTrigger(long j6, long j7) {
        while (j6 < System.currentTimeMillis()) {
            j6 += j7;
        }
        return j6;
    }

    private static long calculateRepeatIntervalMilliseconds(NotificationDetails notificationDetails) {
        if (notificationDetails.repeatIntervalMilliseconds != null) {
            return r0.intValue();
        }
        int i6 = d.f13297a[notificationDetails.repeatInterval.ordinal()];
        if (i6 == 1) {
            return 60000L;
        }
        if (i6 == 2) {
            return 3600000L;
        }
        if (i6 != 3) {
            return i6 != 4 ? 0L : 604800000L;
        }
        return 86400000L;
    }

    private static Boolean canCreateNotificationChannel(Context context, NotificationChannelDetails notificationChannelDetails) {
        NotificationChannelAction notificationChannelAction;
        NotificationChannel notificationChannel = ((NotificationManager) context.getSystemService("notification")).getNotificationChannel(notificationChannelDetails.id);
        return Boolean.valueOf((notificationChannel == null && ((notificationChannelAction = notificationChannelDetails.channelAction) == null || notificationChannelAction == NotificationChannelAction.CreateIfNotExists)) || (notificationChannel != null && notificationChannelDetails.channelAction == NotificationChannelAction.Update));
    }

    private void cancel(i iVar, j.d dVar) {
        Map map = (Map) iVar.b();
        cancelNotification((Integer) map.get(CANCEL_ID), (String) map.get(CANCEL_TAG));
        dVar.a((Object) null);
    }

    private void cancelAllNotifications(j.d dVar) {
        getNotificationManager(this.applicationContext).cancelAll();
        ArrayList<NotificationDetails> loadScheduledNotifications = loadScheduledNotifications(this.applicationContext);
        if (loadScheduledNotifications == null || loadScheduledNotifications.isEmpty()) {
            dVar.a((Object) null);
            return;
        }
        Intent intent = new Intent(this.applicationContext, (Class<?>) ScheduledNotificationReceiver.class);
        Iterator<NotificationDetails> it = loadScheduledNotifications.iterator();
        while (it.hasNext()) {
            getAlarmManager(this.applicationContext).cancel(getBroadcastPendingIntent(this.applicationContext, it.next().id.intValue(), intent));
        }
        saveScheduledNotifications(this.applicationContext, new ArrayList());
        dVar.a((Object) null);
    }

    private void cancelNotification(Integer num, String str) {
        getAlarmManager(this.applicationContext).cancel(getBroadcastPendingIntent(this.applicationContext, num.intValue(), new Intent(this.applicationContext, (Class<?>) ScheduledNotificationReceiver.class)));
        NotificationManagerCompat notificationManager = getNotificationManager(this.applicationContext);
        if (str == null) {
            notificationManager.cancel(num.intValue());
        } else {
            notificationManager.cancel(str, num.intValue());
        }
        removeNotificationFromCache(this.applicationContext, num);
    }

    private static byte[] castObjectToByteArray(Object obj) {
        if (!(obj instanceof ArrayList)) {
            return (byte[]) obj;
        }
        ArrayList arrayList = (ArrayList) obj;
        byte[] bArr = new byte[arrayList.size()];
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            bArr[i6] = (byte) ((Double) arrayList.get(i6)).intValue();
        }
        return bArr;
    }

    private static void checkCanScheduleExactAlarms(AlarmManager alarmManager) {
        boolean canScheduleExactAlarms;
        if (Build.VERSION.SDK_INT >= 31) {
            canScheduleExactAlarms = alarmManager.canScheduleExactAlarms();
            if (!canScheduleExactAlarms) {
                throw new e();
            }
        }
    }

    private static m.i.d createMessage(Context context, MessageDetails messageDetails) {
        String str;
        m.i.d dVar = new m.i.d(messageDetails.text, messageDetails.timestamp.longValue(), buildPerson(context, messageDetails.person));
        String str2 = messageDetails.dataUri;
        if (str2 != null && (str = messageDetails.dataMimeType) != null) {
            dVar.j(str, Uri.parse(str2));
        }
        return dVar;
    }

    public static Notification createNotification(Context context, NotificationDetails notificationDetails) {
        Intent intent;
        int i6;
        PendingIntent broadcast;
        IconSource iconSource;
        NotificationChannelDetails fromNotificationDetails = NotificationChannelDetails.fromNotificationDetails(notificationDetails);
        if (canCreateNotificationChannel(context, fromNotificationDetails).booleanValue()) {
            setupNotificationChannel(context, fromNotificationDetails);
        }
        Intent launchIntent = getLaunchIntent(context);
        launchIntent.setAction(SELECT_NOTIFICATION);
        launchIntent.putExtra(NOTIFICATION_ID, notificationDetails.id);
        launchIntent.putExtra(PAYLOAD, notificationDetails.payload);
        PendingIntent activity = PendingIntent.getActivity(context, notificationDetails.id.intValue(), launchIntent, 201326592);
        DefaultStyleInformation defaultStyleInformation = (DefaultStyleInformation) notificationDetails.styleInformation;
        m.e C6 = new m.e(context, notificationDetails.channelId).n(defaultStyleInformation.htmlFormatTitle.booleanValue() ? fromHtml(notificationDetails.title) : notificationDetails.title).m(defaultStyleInformation.htmlFormatBody.booleanValue() ? fromHtml(notificationDetails.body) : notificationDetails.body).N(notificationDetails.ticker).f(BooleanUtils.getValue(notificationDetails.autoCancel)).l(activity).D(notificationDetails.priority.intValue()).B(BooleanUtils.getValue(notificationDetails.ongoing)).I(BooleanUtils.getValue(notificationDetails.silent)).C(BooleanUtils.getValue(notificationDetails.onlyAlertOnce));
        if (notificationDetails.actions != null) {
            int intValue = notificationDetails.id.intValue() * 16;
            for (NotificationAction notificationAction : notificationDetails.actions) {
                IconCompat iconFromSource = (TextUtils.isEmpty(notificationAction.icon) || (iconSource = notificationAction.iconSource) == null) ? null : getIconFromSource(context, notificationAction.icon, iconSource);
                Boolean bool = notificationAction.showsUserInterface;
                if (bool == null || !bool.booleanValue()) {
                    intent = new Intent(context, (Class<?>) ActionBroadcastReceiver.class);
                    intent.setAction("com.dexterous.flutterlocalnotifications.ActionBroadcastReceiver.ACTION_TAPPED");
                } else {
                    intent = getLaunchIntent(context);
                    intent.setAction(SELECT_FOREGROUND_NOTIFICATION_ACTION);
                }
                intent.putExtra(NOTIFICATION_ID, notificationDetails.id).putExtra(NOTIFICATION_TAG, notificationDetails.tag).putExtra(ACTION_ID, notificationAction.id).putExtra(CANCEL_NOTIFICATION, notificationAction.cancelNotification).putExtra(PAYLOAD, notificationDetails.payload);
                List<NotificationAction.a> list = notificationAction.actionInputs;
                int i7 = (list == null || list.isEmpty()) ? 201326592 : Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
                Boolean bool2 = notificationAction.showsUserInterface;
                if (bool2 == null || !bool2.booleanValue()) {
                    i6 = intValue + 1;
                    broadcast = PendingIntent.getBroadcast(context, intValue, intent, i7);
                } else {
                    i6 = intValue + 1;
                    broadcast = PendingIntent.getActivity(context, intValue, intent, i7);
                }
                intValue = i6;
                SpannableString spannableString = new SpannableString(notificationAction.title);
                if (notificationAction.titleColor != null) {
                    spannableString.setSpan(new ForegroundColorSpan(notificationAction.titleColor.intValue()), 0, spannableString.length(), 0);
                }
                m.a.C0125a c0125a = new m.a.C0125a(iconFromSource, spannableString, broadcast);
                Boolean bool3 = notificationAction.contextual;
                if (bool3 != null) {
                    c0125a.f(bool3.booleanValue());
                }
                Boolean bool4 = notificationAction.showsUserInterface;
                if (bool4 != null) {
                    c0125a.g(bool4.booleanValue());
                }
                Boolean bool5 = notificationAction.allowGeneratedReplies;
                if (bool5 != null) {
                    c0125a.e(bool5.booleanValue());
                }
                List<NotificationAction.a> list2 = notificationAction.actionInputs;
                if (list2 != null) {
                    for (NotificationAction.a aVar : list2) {
                        v.d e6 = new v.d(INPUT_RESULT).e(aVar.f13315c);
                        Boolean bool6 = aVar.f13314b;
                        if (bool6 != null) {
                            e6.c(bool6.booleanValue());
                        }
                        List list3 = aVar.f13316d;
                        if (list3 != null) {
                            Iterator it = list3.iterator();
                            while (it.hasNext()) {
                                e6.b((String) it.next(), true);
                            }
                        }
                        List list4 = aVar.f13313a;
                        if (list4 != null) {
                            e6.d((CharSequence[]) list4.toArray(new CharSequence[0]));
                        }
                        c0125a.b(e6.a());
                    }
                }
                C6.b(c0125a.c());
            }
        }
        setSmallIcon(context, notificationDetails, C6);
        C6.x(getBitmapFromSource(context, notificationDetails.largeIcon, notificationDetails.largeIconBitmapSource));
        Integer num = notificationDetails.color;
        if (num != null) {
            C6.j(num.intValue());
        }
        Boolean bool7 = notificationDetails.colorized;
        if (bool7 != null) {
            C6.k(bool7.booleanValue());
        }
        Boolean bool8 = notificationDetails.showWhen;
        if (bool8 != null) {
            C6.H(BooleanUtils.getValue(bool8));
        }
        Long l6 = notificationDetails.when;
        if (l6 != null) {
            C6.S(l6.longValue());
        }
        Boolean bool9 = notificationDetails.usesChronometer;
        if (bool9 != null) {
            C6.P(bool9.booleanValue());
        }
        Boolean bool10 = notificationDetails.chronometerCountDown;
        if (bool10 != null) {
            C6.i(bool10.booleanValue());
        }
        if (BooleanUtils.getValue(notificationDetails.fullScreenIntent)) {
            C6.t(activity, true);
        }
        if (!StringUtils.isNullOrEmpty(notificationDetails.shortcutId).booleanValue()) {
            C6.G(notificationDetails.shortcutId);
        }
        if (!StringUtils.isNullOrEmpty(notificationDetails.subText).booleanValue()) {
            C6.M(notificationDetails.subText);
        }
        Integer num2 = notificationDetails.number;
        if (num2 != null) {
            C6.A(num2.intValue());
        }
        setVisibility(notificationDetails, C6);
        applyGrouping(notificationDetails, C6);
        setSound(context, notificationDetails, C6);
        setVibrationPattern(notificationDetails, C6);
        setLights(notificationDetails, C6);
        setStyle(context, notificationDetails, C6);
        setProgress(notificationDetails, C6);
        setCategory(notificationDetails, C6);
        setTimeoutAfter(notificationDetails, C6);
        Notification c6 = C6.c();
        int[] iArr = notificationDetails.additionalFlags;
        if (iArr != null && iArr.length > 0) {
            for (int i8 : iArr) {
                c6.flags = i8 | c6.flags;
            }
        }
        return c6;
    }

    private void createNotificationChannel(i iVar, j.d dVar) {
        setupNotificationChannel(this.applicationContext, NotificationChannelDetails.from((Map) iVar.b()));
        dVar.a((Object) null);
    }

    private void createNotificationChannelGroup(i iVar, j.d dVar) {
        int i6 = Build.VERSION.SDK_INT;
        NotificationChannelGroupDetails from = NotificationChannelGroupDetails.from((Map) iVar.b());
        NotificationManager notificationManager = (NotificationManager) this.applicationContext.getSystemService("notification");
        NotificationChannelGroup notificationChannelGroup = new NotificationChannelGroup(from.id, from.name);
        if (i6 >= 28) {
            notificationChannelGroup.setDescription(from.description);
        }
        notificationManager.createNotificationChannelGroup(notificationChannelGroup);
        dVar.a((Object) null);
    }

    private void deleteNotificationChannel(i iVar, j.d dVar) {
        ((NotificationManager) this.applicationContext.getSystemService("notification")).deleteNotificationChannel((String) iVar.b());
        dVar.a((Object) null);
    }

    private void deleteNotificationChannelGroup(i iVar, j.d dVar) {
        ((NotificationManager) this.applicationContext.getSystemService("notification")).deleteNotificationChannelGroup((String) iVar.b());
        dVar.a((Object) null);
    }

    private Map<String, Object> describeIcon(IconCompat iconCompat) {
        IconSource iconSource;
        String resourceEntryName;
        if (iconCompat == null) {
            return null;
        }
        int o6 = iconCompat.o();
        if (o6 == 2) {
            iconSource = IconSource.DrawableResource;
            resourceEntryName = this.applicationContext.getResources().getResourceEntryName(iconCompat.m());
        } else {
            if (o6 != 4) {
                return null;
            }
            iconSource = IconSource.ContentUri;
            resourceEntryName = iconCompat.p().toString();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("source", Integer.valueOf(iconSource.ordinal()));
        hashMap.put("data", resourceEntryName);
        return hashMap;
    }

    private Map<String, Object> describePerson(t tVar) {
        if (tVar == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("key", tVar.d());
        hashMap.put(com.amazon.a.a.h.a.f10906a, tVar.e());
        hashMap.put("uri", tVar.f());
        hashMap.put("bot", Boolean.valueOf(tVar.g()));
        hashMap.put("important", Boolean.valueOf(tVar.h()));
        hashMap.put("icon", describeIcon(tVar.c()));
        return hashMap;
    }

    private NotificationDetails extractNotificationDetails(j.d dVar, Map<String, Object> map) {
        NotificationDetails from = NotificationDetails.from(map);
        if (hasInvalidIcon(dVar, from.icon) || hasInvalidLargeIcon(dVar, from.largeIcon, from.largeIconBitmapSource) || hasInvalidBigPictureResources(dVar, from) || hasInvalidRawSoundResource(dVar, from) || hasInvalidLedDetails(dVar, from)) {
            return null;
        }
        return from;
    }

    public static Map<String, Object> extractNotificationResponseMap(Intent intent) {
        int intExtra = intent.getIntExtra(NOTIFICATION_ID, 0);
        HashMap hashMap = new HashMap();
        hashMap.put(NOTIFICATION_ID, Integer.valueOf(intExtra));
        hashMap.put(NOTIFICATION_TAG, intent.getStringExtra(NOTIFICATION_TAG));
        hashMap.put(ACTION_ID, intent.getStringExtra(ACTION_ID));
        hashMap.put(PAYLOAD, intent.getStringExtra(PAYLOAD));
        Bundle j6 = v.j(intent);
        if (j6 != null) {
            hashMap.put(INPUT, j6.getString(INPUT_RESULT));
        }
        if (SELECT_NOTIFICATION.equals(intent.getAction())) {
            hashMap.put(NOTIFICATION_RESPONSE_TYPE, 0);
        }
        if (SELECT_FOREGROUND_NOTIFICATION_ACTION.equals(intent.getAction())) {
            hashMap.put(NOTIFICATION_RESPONSE_TYPE, 1);
        }
        return hashMap;
    }

    private static Spanned fromHtml(String str) {
        if (str == null) {
            return null;
        }
        return Html.fromHtml(str, 0);
    }

    private void getActiveNotificationMessagingStyle(i iVar, j.d dVar) {
        Notification notification;
        NotificationManager notificationManager = (NotificationManager) this.applicationContext.getSystemService("notification");
        try {
            Map map = (Map) iVar.b();
            int intValue = ((Integer) map.get(CANCEL_ID)).intValue();
            String str = (String) map.get(CANCEL_TAG);
            for (StatusBarNotification statusBarNotification : notificationManager.getActiveNotifications()) {
                if (statusBarNotification.getId() != intValue || (str != null && !str.equals(statusBarNotification.getTag()))) {
                }
                notification = statusBarNotification.getNotification();
            }
            notification = null;
            if (notification == null) {
                dVar.a((Object) null);
                return;
            }
            m.i d6 = m.i.d(notification);
            if (d6 == null) {
                dVar.a((Object) null);
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("groupConversation", Boolean.valueOf(d6.h()));
            hashMap.put("person", describePerson(d6.g()));
            hashMap.put("conversationTitle", d6.e());
            ArrayList arrayList = new ArrayList();
            for (m.i.d dVar2 : d6.f()) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("text", dVar2.h());
                hashMap2.put("timestamp", Long.valueOf(dVar2.i()));
                hashMap2.put("person", describePerson(dVar2.g()));
                arrayList.add(hashMap2);
            }
            hashMap.put("messages", arrayList);
            dVar.a(hashMap);
        } catch (Throwable th) {
            dVar.b(GET_ACTIVE_NOTIFICATION_MESSAGING_STYLE_ERROR_CODE, th.getMessage(), Log.getStackTraceString(th));
        }
    }

    private void getActiveNotifications(j.d dVar) {
        try {
            StatusBarNotification[] activeNotifications = ((NotificationManager) this.applicationContext.getSystemService("notification")).getActiveNotifications();
            ArrayList arrayList = new ArrayList();
            for (StatusBarNotification statusBarNotification : activeNotifications) {
                HashMap hashMap = new HashMap();
                hashMap.put(CANCEL_ID, Integer.valueOf(statusBarNotification.getId()));
                Notification notification = statusBarNotification.getNotification();
                hashMap.put("channelId", notification.getChannelId());
                hashMap.put(CANCEL_TAG, statusBarNotification.getTag());
                hashMap.put("groupKey", notification.getGroup());
                hashMap.put(com.amazon.a.a.o.b.f11189S, notification.extras.getCharSequence("android.title"));
                hashMap.put("body", notification.extras.getCharSequence("android.text"));
                hashMap.put("bigText", notification.extras.getCharSequence("android.bigText"));
                arrayList.add(hashMap);
            }
            dVar.a(arrayList);
        } catch (Throwable th) {
            dVar.b(UNSUPPORTED_OS_VERSION_ERROR_CODE, th.getMessage(), Log.getStackTraceString(th));
        }
    }

    private static AlarmManager getAlarmManager(Context context) {
        return (AlarmManager) context.getSystemService("alarm");
    }

    private static Bitmap getBitmapFromSource(Context context, Object obj, BitmapSource bitmapSource) {
        if (bitmapSource == BitmapSource.DrawableResource) {
            return BitmapFactory.decodeResource(context.getResources(), getDrawableResourceId(context, (String) obj));
        }
        if (bitmapSource == BitmapSource.FilePath) {
            return BitmapFactory.decodeFile((String) obj);
        }
        if (bitmapSource != BitmapSource.ByteArray) {
            return null;
        }
        byte[] castObjectToByteArray = castObjectToByteArray(obj);
        return BitmapFactory.decodeByteArray(castObjectToByteArray, 0, castObjectToByteArray.length);
    }

    private static PendingIntent getBroadcastPendingIntent(Context context, int i6, Intent intent) {
        return PendingIntent.getBroadcast(context, i6, intent, 201326592);
    }

    private void getCallbackHandle(j.d dVar) {
        dVar.a(new p5.a(this.applicationContext).c());
    }

    private static int getDrawableResourceId(Context context, String str) {
        return context.getResources().getIdentifier(str, DRAWABLE, context.getPackageName());
    }

    private static IconCompat getIconFromSource(Context context, Object obj, IconSource iconSource) {
        int i6 = d.f13298b[iconSource.ordinal()];
        if (i6 == 1) {
            return IconCompat.j(context, getDrawableResourceId(context, (String) obj));
        }
        if (i6 == 2) {
            return IconCompat.f(BitmapFactory.decodeFile((String) obj));
        }
        if (i6 == 3) {
            return IconCompat.h((String) obj);
        }
        if (i6 != 4) {
            if (i6 != 5) {
                return null;
            }
            byte[] castObjectToByteArray = castObjectToByteArray(obj);
            return IconCompat.i(castObjectToByteArray, 0, castObjectToByteArray.length);
        }
        try {
            AssetFileDescriptor openFd = context.getAssets().openFd(u9.a.e().c().l((String) obj));
            FileInputStream createInputStream = openFd.createInputStream();
            IconCompat f6 = IconCompat.f(BitmapFactory.decodeStream(createInputStream));
            createInputStream.close();
            openFd.close();
            return f6;
        } catch (IOException e6) {
            throw new RuntimeException(e6);
        }
    }

    private static Intent getLaunchIntent(Context context) {
        return context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
    }

    private HashMap<String, Object> getMappedNotificationChannel(NotificationChannel notificationChannel) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put(CANCEL_ID, notificationChannel.getId());
        hashMap.put(com.amazon.a.a.h.a.f10906a, notificationChannel.getName());
        hashMap.put(com.amazon.a.a.o.b.f11199c, notificationChannel.getDescription());
        hashMap.put("groupId", notificationChannel.getGroup());
        hashMap.put("showBadge", Boolean.valueOf(notificationChannel.canShowBadge()));
        hashMap.put("importance", Integer.valueOf(notificationChannel.getImportance()));
        Uri sound = notificationChannel.getSound();
        if (sound == null) {
            hashMap.put("sound", null);
            hashMap.put("playSound", Boolean.FALSE);
        } else {
            hashMap.put("playSound", Boolean.TRUE);
            List asList = Arrays.asList(SoundSource.values());
            if (sound.getScheme().equals("android.resource")) {
                String str = sound.toString().split("/")[r1.length - 1];
                Integer tryParseInt = tryParseInt(str);
                if (tryParseInt == null) {
                    hashMap.put("soundSource", Integer.valueOf(asList.indexOf(SoundSource.RawResource)));
                    hashMap.put("sound", str);
                } else {
                    try {
                        String resourceEntryName = this.applicationContext.getResources().getResourceEntryName(tryParseInt.intValue());
                        if (resourceEntryName != null) {
                            hashMap.put("soundSource", Integer.valueOf(asList.indexOf(SoundSource.RawResource)));
                            hashMap.put("sound", resourceEntryName);
                        }
                    } catch (Exception unused) {
                        hashMap.put("sound", null);
                        hashMap.put("playSound", Boolean.FALSE);
                    }
                }
            } else {
                hashMap.put("soundSource", Integer.valueOf(asList.indexOf(SoundSource.Uri)));
                hashMap.put("sound", sound.toString());
            }
        }
        hashMap.put("enableVibration", Boolean.valueOf(notificationChannel.shouldVibrate()));
        hashMap.put("vibrationPattern", notificationChannel.getVibrationPattern());
        hashMap.put("enableLights", Boolean.valueOf(notificationChannel.shouldShowLights()));
        hashMap.put("ledColor", Integer.valueOf(notificationChannel.getLightColor()));
        AudioAttributes audioAttributes = notificationChannel.getAudioAttributes();
        hashMap.put("audioAttributesUsage", Integer.valueOf(audioAttributes == null ? 5 : audioAttributes.getUsage()));
        return hashMap;
    }

    private static String getNextFireDate(NotificationDetails notificationDetails) {
        ScheduledNotificationRepeatFrequency scheduledNotificationRepeatFrequency = notificationDetails.scheduledNotificationRepeatFrequency;
        if (scheduledNotificationRepeatFrequency == ScheduledNotificationRepeatFrequency.Daily) {
            return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(LocalDateTime.parse(notificationDetails.scheduledDateTime).plusDays(1L));
        }
        if (scheduledNotificationRepeatFrequency != ScheduledNotificationRepeatFrequency.Weekly) {
            return null;
        }
        return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(LocalDateTime.parse(notificationDetails.scheduledDateTime).plusWeeks(1L));
    }

    private static String getNextFireDateMatchingDateTimeComponents(NotificationDetails notificationDetails) {
        ZoneId of = ZoneId.of(notificationDetails.timeZoneName);
        ZonedDateTime of2 = ZonedDateTime.of(LocalDateTime.parse(notificationDetails.scheduledDateTime), of);
        ZonedDateTime now = ZonedDateTime.now(of);
        ZonedDateTime of3 = ZonedDateTime.of(now.getYear(), now.getMonthValue(), now.getDayOfMonth(), of2.getHour(), of2.getMinute(), of2.getSecond(), of2.getNano(), of);
        while (of3.isBefore(now)) {
            of3 = of3.plusDays(1L);
        }
        DateTimeComponents dateTimeComponents = notificationDetails.matchDateTimeComponents;
        if (dateTimeComponents == DateTimeComponents.Time) {
            return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(of3);
        }
        if (dateTimeComponents == DateTimeComponents.DayOfWeekAndTime) {
            while (of3.getDayOfWeek() != of2.getDayOfWeek()) {
                of3 = of3.plusDays(1L);
            }
            return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(of3);
        }
        if (dateTimeComponents == DateTimeComponents.DayOfMonthAndTime) {
            while (of3.getDayOfMonth() != of2.getDayOfMonth()) {
                of3 = of3.plusDays(1L);
            }
            return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(of3);
        }
        if (dateTimeComponents != DateTimeComponents.DateAndTime) {
            return null;
        }
        while (true) {
            if (of3.getMonthValue() == of2.getMonthValue() && of3.getDayOfMonth() == of2.getDayOfMonth()) {
                return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(of3);
            }
            of3 = of3.plusDays(1L);
        }
    }

    private void getNotificationAppLaunchDetails(j.d dVar) {
        HashMap hashMap = new HashMap();
        Boolean bool = Boolean.FALSE;
        Activity activity = this.mainActivity;
        if (activity != null) {
            Intent intent = activity.getIntent();
            boolean z6 = intent != null && (SELECT_NOTIFICATION.equals(intent.getAction()) || SELECT_FOREGROUND_NOTIFICATION_ACTION.equals(intent.getAction())) && !launchedActivityFromHistory(intent);
            Boolean valueOf = Boolean.valueOf(z6);
            if (z6) {
                hashMap.put("notificationResponse", extractNotificationResponseMap(intent));
            }
            bool = valueOf;
        }
        hashMap.put(NOTIFICATION_LAUNCHED_APP, bool);
        dVar.a(hashMap);
    }

    private void getNotificationChannels(j.d dVar) {
        try {
            List<NotificationChannel> notificationChannels = getNotificationManager(this.applicationContext).getNotificationChannels();
            ArrayList arrayList = new ArrayList();
            Iterator<NotificationChannel> it = notificationChannels.iterator();
            while (it.hasNext()) {
                arrayList.add(getMappedNotificationChannel(it.next()));
            }
            dVar.a(arrayList);
        } catch (Throwable th) {
            dVar.b(GET_NOTIFICATION_CHANNELS_ERROR_CODE, th.getMessage(), Log.getStackTraceString(th));
        }
    }

    private static NotificationManagerCompat getNotificationManager(Context context) {
        return NotificationManagerCompat.from(context);
    }

    private boolean hasInvalidBigPictureResources(j.d dVar, NotificationDetails notificationDetails) {
        if (notificationDetails.style == NotificationStyle.BigPicture) {
            BigPictureStyleInformation bigPictureStyleInformation = (BigPictureStyleInformation) notificationDetails.styleInformation;
            if (hasInvalidLargeIcon(dVar, bigPictureStyleInformation.largeIcon, bigPictureStyleInformation.largeIconBitmapSource)) {
                return true;
            }
            BitmapSource bitmapSource = bigPictureStyleInformation.bigPictureBitmapSource;
            if (bitmapSource == BitmapSource.DrawableResource) {
                String str = (String) bigPictureStyleInformation.bigPicture;
                return StringUtils.isNullOrEmpty(str).booleanValue() && !isValidDrawableResource(this.applicationContext, str, dVar, INVALID_BIG_PICTURE_ERROR_CODE);
            }
            if (bitmapSource == BitmapSource.FilePath) {
                return StringUtils.isNullOrEmpty((String) bigPictureStyleInformation.bigPicture).booleanValue();
            }
            if (bitmapSource == BitmapSource.ByteArray) {
                byte[] bArr = (byte[]) bigPictureStyleInformation.bigPicture;
                return bArr == null || bArr.length == 0;
            }
        }
        return false;
    }

    private boolean hasInvalidIcon(j.d dVar, String str) {
        return (StringUtils.isNullOrEmpty(str).booleanValue() || isValidDrawableResource(this.applicationContext, str, dVar, INVALID_ICON_ERROR_CODE)) ? false : true;
    }

    private boolean hasInvalidLargeIcon(j.d dVar, Object obj, BitmapSource bitmapSource) {
        BitmapSource bitmapSource2 = BitmapSource.DrawableResource;
        if (bitmapSource != bitmapSource2 && bitmapSource != BitmapSource.FilePath) {
            return bitmapSource == BitmapSource.ByteArray && ((byte[]) obj).length == 0;
        }
        String str = (String) obj;
        return (StringUtils.isNullOrEmpty(str).booleanValue() || bitmapSource != bitmapSource2 || isValidDrawableResource(this.applicationContext, str, dVar, INVALID_LARGE_ICON_ERROR_CODE)) ? false : true;
    }

    private boolean hasInvalidLedDetails(j.d dVar, NotificationDetails notificationDetails) {
        if (notificationDetails.ledColor == null) {
            return false;
        }
        if (notificationDetails.ledOnMs != null && notificationDetails.ledOffMs != null) {
            return false;
        }
        dVar.b(INVALID_LED_DETAILS_ERROR_CODE, INVALID_LED_DETAILS_ERROR_MESSAGE, (Object) null);
        return true;
    }

    private boolean hasInvalidRawSoundResource(j.d dVar, NotificationDetails notificationDetails) {
        if (StringUtils.isNullOrEmpty(notificationDetails.sound).booleanValue()) {
            return false;
        }
        SoundSource soundSource = notificationDetails.soundSource;
        if ((soundSource != null && soundSource != SoundSource.RawResource) || this.applicationContext.getResources().getIdentifier(notificationDetails.sound, "raw", this.applicationContext.getPackageName()) != 0) {
            return false;
        }
        dVar.b(INVALID_SOUND_ERROR_CODE, String.format(INVALID_RAW_RESOURCE_ERROR_MESSAGE, notificationDetails.sound), (Object) null);
        return true;
    }

    private void initialize(i iVar, j.d dVar) {
        String str = (String) ((Map) iVar.b()).get(DEFAULT_ICON);
        if (isValidDrawableResource(this.applicationContext, str, dVar, INVALID_ICON_ERROR_CODE)) {
            Long a6 = q5.a.a(iVar.a(DISPATCHER_HANDLE));
            Long a7 = q5.a.a(iVar.a(CALLBACK_HANDLE));
            if (a6 != null && a7 != null) {
                new p5.a(this.applicationContext).e(a6, a7);
            }
            this.applicationContext.getSharedPreferences(SHARED_PREFERENCES_KEY, 0).edit().putString(DEFAULT_ICON, str).apply();
            dVar.a(Boolean.TRUE);
        }
    }

    private static boolean isValidDrawableResource(Context context, String str, j.d dVar, String str2) {
        if (context.getResources().getIdentifier(str, DRAWABLE, context.getPackageName()) != 0) {
            return true;
        }
        dVar.b(str2, String.format(INVALID_DRAWABLE_RESOURCE_ERROR_MESSAGE, str), (Object) null);
        return false;
    }

    private static boolean launchedActivityFromHistory(Intent intent) {
        return intent != null && (intent.getFlags() & 1048576) == 1048576;
    }

    private static ArrayList<NotificationDetails> loadScheduledNotifications(Context context) {
        ArrayList<NotificationDetails> arrayList = new ArrayList<>();
        String string = context.getSharedPreferences(SCHEDULED_NOTIFICATIONS, 0).getString(SCHEDULED_NOTIFICATIONS, null);
        return string != null ? (ArrayList) buildGson().k(string, new TypeToken<ArrayList<NotificationDetails>>() { // from class: com.dexterous.flutterlocalnotifications.FlutterLocalNotificationsPlugin.1
        }.getType()) : arrayList;
    }

    private void pendingNotificationRequests(j.d dVar) {
        ArrayList<NotificationDetails> loadScheduledNotifications = loadScheduledNotifications(this.applicationContext);
        ArrayList arrayList = new ArrayList();
        Iterator<NotificationDetails> it = loadScheduledNotifications.iterator();
        while (it.hasNext()) {
            NotificationDetails next = it.next();
            HashMap hashMap = new HashMap();
            hashMap.put(CANCEL_ID, next.id);
            hashMap.put(com.amazon.a.a.o.b.f11189S, next.title);
            hashMap.put("body", next.body);
            hashMap.put(PAYLOAD, next.payload);
            arrayList.add(hashMap);
        }
        dVar.a(arrayList);
    }

    private void processForegroundNotificationAction(Intent intent, Map<String, Object> map) {
        if (intent.getBooleanExtra(CANCEL_NOTIFICATION, false)) {
            NotificationManagerCompat.from(this.applicationContext).cancel(((Integer) map.get(NOTIFICATION_ID)).intValue());
        }
    }

    public static void removeNotificationFromCache(Context context, Integer num) {
        ArrayList<NotificationDetails> loadScheduledNotifications = loadScheduledNotifications(context);
        Iterator<NotificationDetails> it = loadScheduledNotifications.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().id.equals(num)) {
                it.remove();
                break;
            }
        }
        saveScheduledNotifications(context, loadScheduledNotifications);
    }

    private void repeat(i iVar, j.d dVar) {
        NotificationDetails extractNotificationDetails = extractNotificationDetails(dVar, (Map) iVar.b());
        if (extractNotificationDetails != null) {
            try {
                repeatNotification(this.applicationContext, extractNotificationDetails, Boolean.TRUE);
                dVar.a((Object) null);
            } catch (g e6) {
                dVar.b(e6.f13305a, e6.getMessage(), (Object) null);
            }
        }
    }

    private static void repeatNotification(Context context, NotificationDetails notificationDetails, Boolean bool) {
        long calculateRepeatIntervalMilliseconds = calculateRepeatIntervalMilliseconds(notificationDetails);
        long longValue = notificationDetails.calledAt.longValue();
        if (notificationDetails.repeatTime != null) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(11, notificationDetails.repeatTime.hour.intValue());
            calendar.set(12, notificationDetails.repeatTime.minute.intValue());
            calendar.set(13, notificationDetails.repeatTime.second.intValue());
            Integer num = notificationDetails.day;
            if (num != null) {
                calendar.set(7, num.intValue());
            }
            longValue = calendar.getTimeInMillis();
        }
        long calculateNextNotificationTrigger = calculateNextNotificationTrigger(longValue, calculateRepeatIntervalMilliseconds);
        String s6 = buildGson().s(notificationDetails);
        Intent intent = new Intent(context, (Class<?>) ScheduledNotificationReceiver.class);
        intent.putExtra(NOTIFICATION_DETAILS, s6);
        PendingIntent broadcastPendingIntent = getBroadcastPendingIntent(context, notificationDetails.id.intValue(), intent);
        AlarmManager alarmManager = getAlarmManager(context);
        if (notificationDetails.scheduleMode == null) {
            notificationDetails.scheduleMode = ScheduleMode.inexact;
        }
        if (notificationDetails.scheduleMode.useAllowWhileIdle()) {
            setupAllowWhileIdleAlarm(notificationDetails, alarmManager, calculateNextNotificationTrigger, broadcastPendingIntent);
        } else {
            alarmManager.setInexactRepeating(0, calculateNextNotificationTrigger, calculateRepeatIntervalMilliseconds, broadcastPendingIntent);
        }
        if (bool.booleanValue()) {
            saveScheduledNotification(context, notificationDetails);
        }
    }

    public static void rescheduleNotifications(Context context) {
        Iterator<NotificationDetails> it = loadScheduledNotifications(context).iterator();
        while (it.hasNext()) {
            NotificationDetails next = it.next();
            try {
            } catch (e e6) {
                Log.e(TAG, e6.getMessage());
                removeNotificationFromCache(context, next.id);
            }
            if (next.repeatInterval == null && next.repeatIntervalMilliseconds == null) {
                if (next.timeZoneName != null) {
                    zonedScheduleNotification(context, next, Boolean.FALSE);
                } else {
                    scheduleNotification(context, next, Boolean.FALSE);
                }
            }
            repeatNotification(context, next, Boolean.FALSE);
        }
    }

    private static Uri retrieveSoundResourceUri(Context context, String str, SoundSource soundSource) {
        if (StringUtils.isNullOrEmpty(str).booleanValue()) {
            return RingtoneManager.getDefaultUri(2);
        }
        if (soundSource != null && soundSource != SoundSource.RawResource) {
            if (soundSource == SoundSource.Uri) {
                return Uri.parse(str);
            }
            return null;
        }
        return Uri.parse("android.resource://" + context.getPackageName() + "/raw/" + str);
    }

    private static void saveScheduledNotification(Context context, NotificationDetails notificationDetails) {
        ArrayList<NotificationDetails> loadScheduledNotifications = loadScheduledNotifications(context);
        ArrayList arrayList = new ArrayList();
        Iterator<NotificationDetails> it = loadScheduledNotifications.iterator();
        while (it.hasNext()) {
            NotificationDetails next = it.next();
            if (!next.id.equals(notificationDetails.id)) {
                arrayList.add(next);
            }
        }
        arrayList.add(notificationDetails);
        saveScheduledNotifications(context, arrayList);
    }

    private static void saveScheduledNotifications(Context context, ArrayList<NotificationDetails> arrayList) {
        context.getSharedPreferences(SCHEDULED_NOTIFICATIONS, 0).edit().putString(SCHEDULED_NOTIFICATIONS, buildGson().s(arrayList)).apply();
    }

    public static void scheduleNextNotification(Context context, NotificationDetails notificationDetails) {
        try {
            if (notificationDetails.scheduledNotificationRepeatFrequency != null) {
                zonedScheduleNextNotification(context, notificationDetails);
                return;
            }
            if (notificationDetails.matchDateTimeComponents != null) {
                zonedScheduleNextNotificationMatchingDateComponents(context, notificationDetails);
                return;
            }
            if (notificationDetails.repeatInterval == null && notificationDetails.repeatIntervalMilliseconds == null) {
                removeNotificationFromCache(context, notificationDetails.id);
                return;
            }
            scheduleNextRepeatingNotification(context, notificationDetails);
        } catch (e e6) {
            Log.e(TAG, e6.getMessage());
            removeNotificationFromCache(context, notificationDetails.id);
        }
    }

    private static void scheduleNextRepeatingNotification(Context context, NotificationDetails notificationDetails) {
        long calculateNextNotificationTrigger = calculateNextNotificationTrigger(notificationDetails.calledAt.longValue(), calculateRepeatIntervalMilliseconds(notificationDetails));
        String s6 = buildGson().s(notificationDetails);
        Intent intent = new Intent(context, (Class<?>) ScheduledNotificationReceiver.class);
        intent.putExtra(NOTIFICATION_DETAILS, s6);
        PendingIntent broadcastPendingIntent = getBroadcastPendingIntent(context, notificationDetails.id.intValue(), intent);
        AlarmManager alarmManager = getAlarmManager(context);
        if (notificationDetails.scheduleMode == null) {
            notificationDetails.scheduleMode = ScheduleMode.exactAllowWhileIdle;
        }
        setupAllowWhileIdleAlarm(notificationDetails, alarmManager, calculateNextNotificationTrigger, broadcastPendingIntent);
        saveScheduledNotification(context, notificationDetails);
    }

    private static void scheduleNotification(Context context, NotificationDetails notificationDetails, Boolean bool) {
        String s6 = buildGson().s(notificationDetails);
        Intent intent = new Intent(context, (Class<?>) ScheduledNotificationReceiver.class);
        intent.putExtra(NOTIFICATION_DETAILS, s6);
        setupAlarm(notificationDetails, getAlarmManager(context), notificationDetails.millisecondsSinceEpoch.longValue(), getBroadcastPendingIntent(context, notificationDetails.id.intValue(), intent));
        if (bool.booleanValue()) {
            saveScheduledNotification(context, notificationDetails);
        }
    }

    private Boolean sendNotificationPayloadMessage(Intent intent) {
        if (!SELECT_NOTIFICATION.equals(intent.getAction()) && !SELECT_FOREGROUND_NOTIFICATION_ACTION.equals(intent.getAction())) {
            return Boolean.FALSE;
        }
        Map<String, Object> extractNotificationResponseMap = extractNotificationResponseMap(intent);
        if (SELECT_FOREGROUND_NOTIFICATION_ACTION.equals(intent.getAction())) {
            processForegroundNotificationAction(intent, extractNotificationResponseMap);
        }
        this.channel.c("didReceiveNotificationResponse", extractNotificationResponseMap);
        return Boolean.TRUE;
    }

    private void setActivity(Activity activity) {
        this.mainActivity = activity;
    }

    private static void setBigPictureStyle(Context context, NotificationDetails notificationDetails, m.e eVar) {
        BigPictureStyleInformation bigPictureStyleInformation = (BigPictureStyleInformation) notificationDetails.styleInformation;
        m.b bVar = new m.b();
        if (bigPictureStyleInformation.contentTitle != null) {
            bVar.f(bigPictureStyleInformation.htmlFormatContentTitle.booleanValue() ? fromHtml(bigPictureStyleInformation.contentTitle) : bigPictureStyleInformation.contentTitle);
        }
        if (bigPictureStyleInformation.summaryText != null) {
            bVar.g(bigPictureStyleInformation.htmlFormatSummaryText.booleanValue() ? fromHtml(bigPictureStyleInformation.summaryText) : bigPictureStyleInformation.summaryText);
        }
        if (bigPictureStyleInformation.hideExpandedLargeIcon.booleanValue()) {
            bVar.c(null);
        } else {
            Object obj = bigPictureStyleInformation.largeIcon;
            if (obj != null) {
                bVar.c(getBitmapFromSource(context, obj, bigPictureStyleInformation.largeIconBitmapSource));
            }
        }
        bVar.d(getBitmapFromSource(context, bigPictureStyleInformation.bigPicture, bigPictureStyleInformation.bigPictureBitmapSource));
        eVar.L(bVar);
    }

    private static void setBigTextStyle(NotificationDetails notificationDetails, m.e eVar) {
        BigTextStyleInformation bigTextStyleInformation = (BigTextStyleInformation) notificationDetails.styleInformation;
        m.c cVar = new m.c();
        if (bigTextStyleInformation.bigText != null) {
            cVar.b(bigTextStyleInformation.htmlFormatBigText.booleanValue() ? fromHtml(bigTextStyleInformation.bigText) : bigTextStyleInformation.bigText);
        }
        if (bigTextStyleInformation.contentTitle != null) {
            cVar.c(bigTextStyleInformation.htmlFormatContentTitle.booleanValue() ? fromHtml(bigTextStyleInformation.contentTitle) : bigTextStyleInformation.contentTitle);
        }
        if (bigTextStyleInformation.summaryText != null) {
            cVar.d(bigTextStyleInformation.htmlFormatSummaryText.booleanValue() ? fromHtml(bigTextStyleInformation.summaryText) : bigTextStyleInformation.summaryText);
        }
        eVar.L(cVar);
    }

    private void setCanScheduleExactNotifications(j.d dVar) {
        boolean canScheduleExactAlarms;
        if (Build.VERSION.SDK_INT < 31) {
            dVar.a(Boolean.TRUE);
        } else {
            canScheduleExactAlarms = getAlarmManager(this.applicationContext).canScheduleExactAlarms();
            dVar.a(Boolean.valueOf(canScheduleExactAlarms));
        }
    }

    private static void setCategory(NotificationDetails notificationDetails, m.e eVar) {
        String str = notificationDetails.category;
        if (str == null) {
            return;
        }
        eVar.g(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.core.app.m$h, androidx.core.app.m$j] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.text.Spanned] */
    /* JADX WARN: Type inference failed for: r5v0, types: [androidx.core.app.m$e] */
    private static void setInboxStyle(NotificationDetails notificationDetails, m.e eVar) {
        InboxStyleInformation inboxStyleInformation = (InboxStyleInformation) notificationDetails.styleInformation;
        ?? hVar = new m.h();
        if (inboxStyleInformation.contentTitle != null) {
            hVar.c(inboxStyleInformation.htmlFormatContentTitle.booleanValue() ? fromHtml(inboxStyleInformation.contentTitle) : inboxStyleInformation.contentTitle);
        }
        if (inboxStyleInformation.summaryText != null) {
            hVar.d(inboxStyleInformation.htmlFormatSummaryText.booleanValue() ? fromHtml(inboxStyleInformation.summaryText) : inboxStyleInformation.summaryText);
        }
        ArrayList<String> arrayList = inboxStyleInformation.lines;
        if (arrayList != null) {
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (inboxStyleInformation.htmlFormatLines.booleanValue()) {
                    next = fromHtml(next);
                }
                hVar.b(next);
            }
        }
        eVar.L(hVar);
    }

    private static void setLights(NotificationDetails notificationDetails, m.e eVar) {
        if (!BooleanUtils.getValue(notificationDetails.enableLights) || notificationDetails.ledOnMs == null || notificationDetails.ledOffMs == null) {
            return;
        }
        eVar.y(notificationDetails.ledColor.intValue(), notificationDetails.ledOnMs.intValue(), notificationDetails.ledOffMs.intValue());
    }

    private static void setMediaStyle(m.e eVar) {
        eVar.L(new Y0.a());
    }

    private static void setMessagingStyle(Context context, NotificationDetails notificationDetails, m.e eVar) {
        MessagingStyleInformation messagingStyleInformation = (MessagingStyleInformation) notificationDetails.styleInformation;
        m.i iVar = new m.i(buildPerson(context, messagingStyleInformation.person));
        iVar.j(BooleanUtils.getValue(messagingStyleInformation.groupConversation));
        String str = messagingStyleInformation.conversationTitle;
        if (str != null) {
            iVar.i(str);
        }
        ArrayList<MessageDetails> arrayList = messagingStyleInformation.messages;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<MessageDetails> it = messagingStyleInformation.messages.iterator();
            while (it.hasNext()) {
                iVar.b(createMessage(context, it.next()));
            }
        }
        eVar.L(iVar);
    }

    private static void setProgress(NotificationDetails notificationDetails, m.e eVar) {
        if (BooleanUtils.getValue(notificationDetails.showProgress)) {
            eVar.E(notificationDetails.maxProgress.intValue(), notificationDetails.progress.intValue(), notificationDetails.indeterminate.booleanValue());
        }
    }

    private static void setSmallIcon(Context context, NotificationDetails notificationDetails, m.e eVar) {
        if (!StringUtils.isNullOrEmpty(notificationDetails.icon).booleanValue()) {
            eVar.J(getDrawableResourceId(context, notificationDetails.icon));
            return;
        }
        String string = context.getSharedPreferences(SHARED_PREFERENCES_KEY, 0).getString(DEFAULT_ICON, null);
        if (StringUtils.isNullOrEmpty(string).booleanValue()) {
            eVar.J(notificationDetails.iconResourceId.intValue());
        } else {
            eVar.J(getDrawableResourceId(context, string));
        }
    }

    private static void setSound(Context context, NotificationDetails notificationDetails, m.e eVar) {
        if (BooleanUtils.getValue(notificationDetails.playSound)) {
            eVar.K(retrieveSoundResourceUri(context, notificationDetails.sound, notificationDetails.soundSource));
        } else {
            eVar.K(null);
        }
    }

    private static void setStyle(Context context, NotificationDetails notificationDetails, m.e eVar) {
        int i6 = d.f13299c[notificationDetails.style.ordinal()];
        if (i6 == 1) {
            setBigPictureStyle(context, notificationDetails, eVar);
            return;
        }
        if (i6 == 2) {
            setBigTextStyle(notificationDetails, eVar);
            return;
        }
        if (i6 == 3) {
            setInboxStyle(notificationDetails, eVar);
        } else if (i6 == 4) {
            setMessagingStyle(context, notificationDetails, eVar);
        } else {
            if (i6 != 5) {
                return;
            }
            setMediaStyle(eVar);
        }
    }

    private static void setTimeoutAfter(NotificationDetails notificationDetails, m.e eVar) {
        Long l6 = notificationDetails.timeoutAfter;
        if (l6 == null) {
            return;
        }
        eVar.O(l6.longValue());
    }

    private static void setVibrationPattern(NotificationDetails notificationDetails, m.e eVar) {
        if (!BooleanUtils.getValue(notificationDetails.enableVibration)) {
            eVar.Q(new long[]{0});
            return;
        }
        long[] jArr = notificationDetails.vibrationPattern;
        if (jArr == null || jArr.length <= 0) {
            return;
        }
        eVar.Q(jArr);
    }

    private static void setVisibility(NotificationDetails notificationDetails, m.e eVar) {
        int i6;
        Integer num = notificationDetails.visibility;
        if (num == null) {
            return;
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            i6 = 1;
            if (intValue != 1) {
                if (intValue != 2) {
                    throw new IllegalArgumentException("Unknown index: " + notificationDetails.visibility);
                }
                i6 = -1;
            }
        } else {
            i6 = 0;
        }
        eVar.R(i6);
    }

    private static void setupAlarm(NotificationDetails notificationDetails, AlarmManager alarmManager, long j6, PendingIntent pendingIntent) {
        if (notificationDetails.scheduleMode == null) {
            notificationDetails.scheduleMode = ScheduleMode.exact;
        }
        if (notificationDetails.scheduleMode.useAllowWhileIdle()) {
            setupAllowWhileIdleAlarm(notificationDetails, alarmManager, j6, pendingIntent);
            return;
        }
        if (notificationDetails.scheduleMode.useExactAlarm()) {
            checkCanScheduleExactAlarms(alarmManager);
            androidx.core.app.c.c(alarmManager, 0, j6, pendingIntent);
        } else if (!notificationDetails.scheduleMode.useAlarmClock()) {
            alarmManager.set(0, j6, pendingIntent);
        } else {
            checkCanScheduleExactAlarms(alarmManager);
            androidx.core.app.c.a(alarmManager, j6, pendingIntent, pendingIntent);
        }
    }

    private static void setupAllowWhileIdleAlarm(NotificationDetails notificationDetails, AlarmManager alarmManager, long j6, PendingIntent pendingIntent) {
        if (notificationDetails.scheduleMode.useExactAlarm()) {
            checkCanScheduleExactAlarms(alarmManager);
            androidx.core.app.c.d(alarmManager, 0, j6, pendingIntent);
        } else if (!notificationDetails.scheduleMode.useAlarmClock()) {
            androidx.core.app.c.b(alarmManager, 0, j6, pendingIntent);
        } else {
            checkCanScheduleExactAlarms(alarmManager);
            androidx.core.app.c.a(alarmManager, j6, pendingIntent, pendingIntent);
        }
    }

    private static void setupNotificationChannel(Context context, NotificationChannelDetails notificationChannelDetails) {
        Integer num;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        NotificationChannel notificationChannel = new NotificationChannel(notificationChannelDetails.id, notificationChannelDetails.name, notificationChannelDetails.importance.intValue());
        notificationChannel.setDescription(notificationChannelDetails.description);
        notificationChannel.setGroup(notificationChannelDetails.groupId);
        if (notificationChannelDetails.playSound.booleanValue()) {
            Integer num2 = notificationChannelDetails.audioAttributesUsage;
            notificationChannel.setSound(retrieveSoundResourceUri(context, notificationChannelDetails.sound, notificationChannelDetails.soundSource), new AudioAttributes.Builder().setUsage(num2 != null ? num2.intValue() : 5).build());
        } else {
            notificationChannel.setSound(null, null);
        }
        notificationChannel.enableVibration(BooleanUtils.getValue(notificationChannelDetails.enableVibration));
        long[] jArr = notificationChannelDetails.vibrationPattern;
        if (jArr != null && jArr.length > 0) {
            notificationChannel.setVibrationPattern(jArr);
        }
        boolean value = BooleanUtils.getValue(notificationChannelDetails.enableLights);
        notificationChannel.enableLights(value);
        if (value && (num = notificationChannelDetails.ledColor) != null) {
            notificationChannel.setLightColor(num.intValue());
        }
        notificationChannel.setShowBadge(BooleanUtils.getValue(notificationChannelDetails.showBadge));
        notificationManager.createNotificationChannel(notificationChannel);
    }

    private void show(i iVar, j.d dVar) {
        NotificationDetails extractNotificationDetails = extractNotificationDetails(dVar, (Map) iVar.b());
        if (extractNotificationDetails != null) {
            showNotification(this.applicationContext, extractNotificationDetails);
            dVar.a((Object) null);
        }
    }

    public static void showNotification(Context context, NotificationDetails notificationDetails) {
        Notification createNotification = createNotification(context, notificationDetails);
        NotificationManagerCompat notificationManager = getNotificationManager(context);
        String str = notificationDetails.tag;
        if (str != null) {
            notificationManager.notify(str, notificationDetails.id.intValue(), createNotification);
        } else {
            notificationManager.notify(notificationDetails.id.intValue(), createNotification);
        }
    }

    private void startForegroundService(i iVar, j.d dVar) {
        Map<String, Object> map = (Map) iVar.a("notificationData");
        Integer num = (Integer) iVar.a("startType");
        ArrayList arrayList = (ArrayList) iVar.a("foregroundServiceTypes");
        if (arrayList != null && arrayList.size() == 0) {
            dVar.b("ARGUMENT_ERROR", "If foregroundServiceTypes is non-null it must not be empty!", (Object) null);
            return;
        }
        if (map == null || num == null) {
            dVar.b("ARGUMENT_ERROR", "An argument passed to startForegroundService was null!", (Object) null);
            return;
        }
        NotificationDetails extractNotificationDetails = extractNotificationDetails(dVar, map);
        if (extractNotificationDetails != null) {
            if (extractNotificationDetails.id.intValue() == 0) {
                dVar.b("ARGUMENT_ERROR", "The id of the notification for a foreground service must not be 0!", (Object) null);
                return;
            }
            com.dexterous.flutterlocalnotifications.d dVar2 = new com.dexterous.flutterlocalnotifications.d(extractNotificationDetails, num.intValue(), arrayList);
            Intent intent = new Intent(this.applicationContext, (Class<?>) com.dexterous.flutterlocalnotifications.c.class);
            intent.putExtra("com.dexterous.flutterlocalnotifications.ForegroundServiceStartParameter", dVar2);
            AbstractC1809a.startForegroundService(this.applicationContext, intent);
            dVar.a((Object) null);
        }
    }

    private void stopForegroundService(j.d dVar) {
        this.applicationContext.stopService(new Intent(this.applicationContext, (Class<?>) com.dexterous.flutterlocalnotifications.c.class));
        dVar.a((Object) null);
    }

    private Integer tryParseInt(String str) {
        try {
            return Integer.valueOf(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private void zonedSchedule(i iVar, j.d dVar) {
        NotificationDetails extractNotificationDetails = extractNotificationDetails(dVar, (Map) iVar.b());
        if (extractNotificationDetails != null) {
            if (extractNotificationDetails.matchDateTimeComponents != null) {
                extractNotificationDetails.scheduledDateTime = getNextFireDateMatchingDateTimeComponents(extractNotificationDetails);
            }
            try {
                zonedScheduleNotification(this.applicationContext, extractNotificationDetails, Boolean.TRUE);
                dVar.a((Object) null);
            } catch (g e6) {
                dVar.b(e6.f13305a, e6.getMessage(), (Object) null);
            }
        }
    }

    private static void zonedScheduleNextNotification(Context context, NotificationDetails notificationDetails) {
        String nextFireDate = getNextFireDate(notificationDetails);
        if (nextFireDate == null) {
            return;
        }
        notificationDetails.scheduledDateTime = nextFireDate;
        zonedScheduleNotification(context, notificationDetails, Boolean.TRUE);
    }

    private static void zonedScheduleNextNotificationMatchingDateComponents(Context context, NotificationDetails notificationDetails) {
        String nextFireDateMatchingDateTimeComponents = getNextFireDateMatchingDateTimeComponents(notificationDetails);
        if (nextFireDateMatchingDateTimeComponents == null) {
            return;
        }
        notificationDetails.scheduledDateTime = nextFireDateMatchingDateTimeComponents;
        zonedScheduleNotification(context, notificationDetails, Boolean.TRUE);
    }

    private static void zonedScheduleNotification(Context context, NotificationDetails notificationDetails, Boolean bool) {
        String s6 = buildGson().s(notificationDetails);
        Intent intent = new Intent(context, (Class<?>) ScheduledNotificationReceiver.class);
        intent.putExtra(NOTIFICATION_DETAILS, s6);
        setupAlarm(notificationDetails, getAlarmManager(context), ZonedDateTime.of(LocalDateTime.parse(notificationDetails.scheduledDateTime), ZoneId.of(notificationDetails.timeZoneName)).toInstant().toEpochMilli(), getBroadcastPendingIntent(context, notificationDetails.id.intValue(), intent));
        if (bool.booleanValue()) {
            saveScheduledNotification(context, notificationDetails);
        }
    }

    public boolean onActivityResult(int i6, int i7, Intent intent) {
        boolean canUseFullScreenIntent;
        boolean canScheduleExactAlarms;
        if (i6 != 1 && i6 != 2 && i6 != 3) {
            return false;
        }
        if (this.permissionRequestProgress == f.RequestingExactAlarmsPermission && i6 == 2 && Build.VERSION.SDK_INT >= 31) {
            AlarmManager alarmManager = getAlarmManager(this.applicationContext);
            com.dexterous.flutterlocalnotifications.e eVar = this.callback;
            canScheduleExactAlarms = alarmManager.canScheduleExactAlarms();
            eVar.b(canScheduleExactAlarms);
            this.permissionRequestProgress = f.None;
        }
        if (this.permissionRequestProgress == f.RequestingFullScreenIntentPermission && i6 == 3 && Build.VERSION.SDK_INT >= 34) {
            NotificationManager notificationManager = (NotificationManager) this.applicationContext.getSystemService("notification");
            com.dexterous.flutterlocalnotifications.e eVar2 = this.callback;
            canUseFullScreenIntent = notificationManager.canUseFullScreenIntent();
            eVar2.b(canUseFullScreenIntent);
            this.permissionRequestProgress = f.None;
        }
        return true;
    }

    public void onAttachedToActivity(C9.c cVar) {
        cVar.h(this);
        cVar.i(this);
        cVar.k(this);
        Activity f6 = cVar.f();
        this.mainActivity = f6;
        Intent intent = f6.getIntent();
        if (launchedActivityFromHistory(intent) || !SELECT_FOREGROUND_NOTIFICATION_ACTION.equals(intent.getAction())) {
            return;
        }
        processForegroundNotificationAction(intent, extractNotificationResponseMap(intent));
    }

    public void onAttachedToEngine(a.b bVar) {
        this.applicationContext = bVar.a();
        j jVar = new j(bVar.b(), METHOD_CHANNEL);
        this.channel = jVar;
        jVar.e(this);
    }

    public void onDetachedFromActivity() {
        this.mainActivity = null;
    }

    public void onDetachedFromActivityForConfigChanges() {
        this.mainActivity = null;
    }

    public void onDetachedFromEngine(@NonNull a.b bVar) {
        this.channel.e((j.c) null);
        this.channel = null;
        this.applicationContext = null;
    }

    public void onMethodCall(i iVar, @NonNull j.d dVar) {
        String str = iVar.a;
        str.getClass();
        char c6 = 65535;
        switch (str.hashCode()) {
            case -2096263152:
                if (str.equals(STOP_FOREGROUND_SERVICE)) {
                    c6 = 0;
                    break;
                }
                break;
            case -2041662895:
                if (str.equals(GET_NOTIFICATION_CHANNELS_METHOD)) {
                    c6 = 1;
                    break;
                }
                break;
            case -1873731438:
                if (str.equals(DELETE_NOTIFICATION_CHANNEL_GROUP_METHOD)) {
                    c6 = 2;
                    break;
                }
                break;
            case -1785484984:
                if (str.equals(REQUEST_NOTIFICATIONS_PERMISSION_METHOD)) {
                    c6 = 3;
                    break;
                }
                break;
            case -1367724422:
                if (str.equals(CANCEL_METHOD)) {
                    c6 = 4;
                    break;
                }
                break;
            case -1108601471:
                if (str.equals(REQUEST_EXACT_ALARMS_PERMISSION_METHOD)) {
                    c6 = 5;
                    break;
                }
                break;
            case -950516363:
                if (str.equals(REQUEST_FULL_SCREEN_INTENT_PERMISSION_METHOD)) {
                    c6 = 6;
                    break;
                }
                break;
            case -799130106:
                if (str.equals(PENDING_NOTIFICATION_REQUESTS_METHOD)) {
                    c6 = 7;
                    break;
                }
                break;
            case -208611345:
                if (str.equals(GET_NOTIFICATION_APP_LAUNCH_DETAILS_METHOD)) {
                    c6 = '\b';
                    break;
                }
                break;
            case 3529469:
                if (str.equals(SHOW_METHOD)) {
                    c6 = '\t';
                    break;
                }
                break;
            case 6625712:
                if (str.equals(PERIODICALLY_SHOW_METHOD)) {
                    c6 = '\n';
                    break;
                }
                break;
            case 116003316:
                if (str.equals(GET_ACTIVE_NOTIFICATION_MESSAGING_STYLE_METHOD)) {
                    c6 = 11;
                    break;
                }
                break;
            case 476547271:
                if (str.equals(CANCEL_ALL_METHOD)) {
                    c6 = '\f';
                    break;
                }
                break;
            case 548573423:
                if (str.equals(ZONED_SCHEDULE_METHOD)) {
                    c6 = '\r';
                    break;
                }
                break;
            case 767006947:
                if (str.equals(CREATE_NOTIFICATION_CHANNEL_GROUP_METHOD)) {
                    c6 = 14;
                    break;
                }
                break;
            case 825311171:
                if (str.equals(GET_CALLBACK_HANDLE_METHOD)) {
                    c6 = 15;
                    break;
                }
                break;
            case 871091088:
                if (str.equals(INITIALIZE_METHOD)) {
                    c6 = 16;
                    break;
                }
                break;
            case 891942317:
                if (str.equals(ARE_NOTIFICATIONS_ENABLED_METHOD)) {
                    c6 = 17;
                    break;
                }
                break;
            case 972029712:
                if (str.equals(CAN_SCHEDULE_EXACT_NOTIFICATIONS_METHOD)) {
                    c6 = 18;
                    break;
                }
                break;
            case 1008472557:
                if (str.equals(DELETE_NOTIFICATION_CHANNEL_METHOD)) {
                    c6 = 19;
                    break;
                }
                break;
            case 1207771056:
                if (str.equals(START_FOREGROUND_SERVICE)) {
                    c6 = 20;
                    break;
                }
                break;
            case 1594833996:
                if (str.equals(GET_ACTIVE_NOTIFICATIONS_METHOD)) {
                    c6 = 21;
                    break;
                }
                break;
            case 1653467900:
                if (str.equals(CREATE_NOTIFICATION_CHANNEL_METHOD)) {
                    c6 = 22;
                    break;
                }
                break;
            case 2147197514:
                if (str.equals(PERIODICALLY_SHOW_WITH_DURATION)) {
                    c6 = 23;
                    break;
                }
                break;
        }
        switch (c6) {
            case 0:
                stopForegroundService(dVar);
                return;
            case 1:
                getNotificationChannels(dVar);
                return;
            case 2:
                deleteNotificationChannelGroup(iVar, dVar);
                return;
            case 3:
                requestNotificationsPermission(new a(this, dVar));
                return;
            case 4:
                cancel(iVar, dVar);
                return;
            case 5:
                requestExactAlarmsPermission(new b(this, dVar));
                return;
            case 6:
                requestFullScreenIntentPermission(new c(this, dVar));
                return;
            case 7:
                pendingNotificationRequests(dVar);
                return;
            case '\b':
                getNotificationAppLaunchDetails(dVar);
                return;
            case '\t':
                show(iVar, dVar);
                return;
            case '\n':
                repeat(iVar, dVar);
                return;
            case 11:
                getActiveNotificationMessagingStyle(iVar, dVar);
                return;
            case '\f':
                cancelAllNotifications(dVar);
                return;
            case '\r':
                zonedSchedule(iVar, dVar);
                return;
            case 14:
                createNotificationChannelGroup(iVar, dVar);
                return;
            case 15:
                getCallbackHandle(dVar);
                return;
            case 16:
                initialize(iVar, dVar);
                return;
            case 17:
                areNotificationsEnabled(dVar);
                return;
            case 18:
                setCanScheduleExactNotifications(dVar);
                return;
            case 19:
                deleteNotificationChannel(iVar, dVar);
                return;
            case 20:
                startForegroundService(iVar, dVar);
                return;
            case 21:
                getActiveNotifications(dVar);
                return;
            case 22:
                createNotificationChannel(iVar, dVar);
                return;
            case 23:
                repeat(iVar, dVar);
                return;
            default:
                dVar.c();
                return;
        }
    }

    public boolean onNewIntent(Intent intent) {
        Activity activity;
        boolean booleanValue = sendNotificationPayloadMessage(intent).booleanValue();
        if (booleanValue && (activity = this.mainActivity) != null) {
            activity.setIntent(intent);
        }
        return booleanValue;
    }

    public void onReattachedToActivityForConfigChanges(C9.c cVar) {
        cVar.h(this);
        cVar.i(this);
        cVar.k(this);
        this.mainActivity = cVar.f();
    }

    public boolean onRequestPermissionsResult(int i6, @NonNull String[] strArr, @NonNull int[] iArr) {
        boolean z6 = false;
        if (this.permissionRequestProgress == f.RequestingNotificationPermission && i6 == 1) {
            if (iArr.length > 0 && iArr[0] == 0) {
                z6 = true;
            }
            this.callback.b(z6);
            this.permissionRequestProgress = f.None;
        }
        return z6;
    }

    public void requestExactAlarmsPermission(@NonNull com.dexterous.flutterlocalnotifications.e eVar) {
        boolean canScheduleExactAlarms;
        f fVar = this.permissionRequestProgress;
        f fVar2 = f.None;
        if (fVar != fVar2) {
            eVar.a(PERMISSION_REQUEST_IN_PROGRESS_ERROR_MESSAGE);
            return;
        }
        this.callback = eVar;
        if (Build.VERSION.SDK_INT < 31) {
            eVar.b(true);
            return;
        }
        canScheduleExactAlarms = getAlarmManager(this.applicationContext).canScheduleExactAlarms();
        if (canScheduleExactAlarms) {
            this.callback.b(true);
            this.permissionRequestProgress = fVar2;
            return;
        }
        this.permissionRequestProgress = f.RequestingExactAlarmsPermission;
        this.mainActivity.startActivityForResult(new Intent("android.settings.REQUEST_SCHEDULE_EXACT_ALARM", Uri.parse("package:" + this.applicationContext.getPackageName())), 2);
    }

    public void requestFullScreenIntentPermission(@NonNull com.dexterous.flutterlocalnotifications.e eVar) {
        boolean canUseFullScreenIntent;
        f fVar = this.permissionRequestProgress;
        f fVar2 = f.None;
        if (fVar != fVar2) {
            eVar.a(PERMISSION_REQUEST_IN_PROGRESS_ERROR_MESSAGE);
            return;
        }
        this.callback = eVar;
        if (Build.VERSION.SDK_INT < 34) {
            eVar.b(true);
            return;
        }
        NotificationManager notificationManager = (NotificationManager) this.applicationContext.getSystemService("notification");
        getAlarmManager(this.applicationContext);
        canUseFullScreenIntent = notificationManager.canUseFullScreenIntent();
        if (canUseFullScreenIntent) {
            this.callback.b(true);
            this.permissionRequestProgress = fVar2;
            return;
        }
        this.permissionRequestProgress = f.RequestingFullScreenIntentPermission;
        this.mainActivity.startActivityForResult(new Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT", Uri.parse("package:" + this.applicationContext.getPackageName())), 3);
    }

    public void requestNotificationsPermission(@NonNull com.dexterous.flutterlocalnotifications.e eVar) {
        f fVar = this.permissionRequestProgress;
        f fVar2 = f.None;
        if (fVar != fVar2) {
            eVar.a(PERMISSION_REQUEST_IN_PROGRESS_ERROR_MESSAGE);
            return;
        }
        this.callback = eVar;
        if (Build.VERSION.SDK_INT < 33) {
            this.callback.b(NotificationManagerCompat.from(this.mainActivity).areNotificationsEnabled());
        } else if (AbstractC1809a.checkSelfPermission(this.mainActivity, "android.permission.POST_NOTIFICATIONS") == 0) {
            this.callback.b(true);
            this.permissionRequestProgress = fVar2;
        } else {
            this.permissionRequestProgress = f.RequestingNotificationPermission;
            androidx.core.app.a.a(this.mainActivity, new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
        }
    }
}
