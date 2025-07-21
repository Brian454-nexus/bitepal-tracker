package com.braze.managers;

import android.app.PendingIntent;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.managers.BrazeGeofenceManager;
import com.braze.models.BrazeGeofence;
import com.braze.models.IBrazeLocation;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.PermissionUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u0000 s2\u00020\u00012\u00020\u0001:\u0001sB7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\u001f\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001f\u0010\u0018J\u0017\u0010$\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u001d\u0010)\u001a\u00020\u00102\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0010H\u0016¢\u0006\u0004\b+\u0010\u0012J\u0019\u0010,\u001a\u00020\u00102\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b,\u0010 J\u000f\u0010-\u001a\u00020\u0010H\u0007¢\u0006\u0004\b-\u0010\u0012J%\u0010.\u001a\u00020\u00102\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&2\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b1\u00102R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00103R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00104R \u00106\u001a\u0002058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b6\u00107\u0012\u0004\b:\u0010\u0012\u001a\u0004\b8\u00109R \u0010<\u001a\u00020;8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b<\u0010=\u0012\u0004\b@\u0010\u0012\u001a\u0004\b>\u0010?R\u001c\u0010B\u001a\n A*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR \u0010H\u001a\u00020G8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bH\u0010I\u0012\u0004\bL\u0010\u0012\u001a\u0004\bJ\u0010KR&\u0010N\u001a\b\u0012\u0004\u0012\u00020'0M8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bN\u0010O\u0012\u0004\bR\u0010\u0012\u001a\u0004\bP\u0010QR\"\u0010S\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bS\u0010T\u0012\u0004\bW\u0010\u0012\u001a\u0004\bU\u0010VR(\u0010Y\u001a\u00020X8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bY\u0010Z\u0012\u0004\b_\u0010\u0012\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R*\u0010`\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b`\u0010a\u0012\u0004\be\u0010\u0012\u001a\u0004\bb\u0010c\"\u0004\bd\u0010 R(\u0010f\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bf\u0010g\u0012\u0004\bj\u0010\u0012\u001a\u0004\bf\u0010h\"\u0004\bi\u0010\u0018R(\u0010l\u001a\u00020k8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bl\u0010m\u0012\u0004\br\u0010\u0012\u001a\u0004\bn\u0010o\"\u0004\bp\u0010q¨\u0006t"}, d2 = {"Lcom/braze/managers/BrazeGeofenceManager;", "", "Landroid/content/Context;", "context", "", "apiKey", "Lcom/braze/managers/c0;", "brazeManager", "Lcom/braze/configuration/BrazeConfigurationProvider;", "configurationProvider", "Lcom/braze/storage/e0;", "serverConfigStorageProvider", "Lcom/braze/events/e;", "internalIEventMessenger", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/braze/managers/c0;Lcom/braze/configuration/BrazeConfigurationProvider;Lcom/braze/storage/e0;Lcom/braze/events/e;)V", "", "initializeGeofences", "()V", "", "isGeofencesEnabledFromEnvironment", "(Landroid/content/Context;)Z", "reRegisterGeofences", "setUpGeofences", "(Z)V", "Landroid/app/PendingIntent;", "geofenceRequestIntent", "tearDownGeofences", "(Landroid/app/PendingIntent;)V", "Lcom/braze/models/IBrazeLocation;", "location", "requestGeofenceRefresh", "(Lcom/braze/models/IBrazeLocation;)V", "ignoreRateLimit", "Lcom/braze/models/response/m;", "serverConfig", "configureFromServerConfig", "(Lcom/braze/models/response/m;)V", "", "Lcom/braze/models/BrazeGeofence;", "geofenceList", "registerGeofences", "(Ljava/util/List;)V", "unregisterGeofences", "onLocationRequestComplete", "requestSingleLocationUpdateFromGooglePlay", "registerGeofencesWithGooglePlay", "(Ljava/util/List;Landroid/app/PendingIntent;)V", "Lcom/braze/managers/c0;", "getBrazeManager", "()Lcom/braze/managers/c0;", "Lcom/braze/configuration/BrazeConfigurationProvider;", "Lcom/braze/storage/e0;", "Lcom/braze/location/a;", "brazeGeofenceApi", "Lcom/braze/location/a;", "getBrazeGeofenceApi", "()Lcom/braze/location/a;", "getBrazeGeofenceApi$annotations", "Lcom/braze/location/b;", "brazeLocationApi", "Lcom/braze/location/b;", "getBrazeLocationApi", "()Lcom/braze/location/b;", "getBrazeLocationApi$annotations", "kotlin.jvm.PlatformType", "applicationContext", "Landroid/content/Context;", "Ljava/util/concurrent/locks/ReentrantLock;", "geofenceListLock", "Ljava/util/concurrent/locks/ReentrantLock;", "Landroid/content/SharedPreferences;", "geofenceStorageSharedPreferences", "Landroid/content/SharedPreferences;", "getGeofenceStorageSharedPreferences", "()Landroid/content/SharedPreferences;", "getGeofenceStorageSharedPreferences$annotations", "", "brazeGeofences", "Ljava/util/List;", "getBrazeGeofences", "()Ljava/util/List;", "getBrazeGeofences$annotations", "geofenceTransitionPendingIntent", "Landroid/app/PendingIntent;", "getGeofenceTransitionPendingIntent", "()Landroid/app/PendingIntent;", "getGeofenceTransitionPendingIntent$annotations", "Lcom/braze/managers/i;", "brazeGeofenceReEligibilityManager", "Lcom/braze/managers/i;", "getBrazeGeofenceReEligibilityManager", "()Lcom/braze/managers/i;", "setBrazeGeofenceReEligibilityManager", "(Lcom/braze/managers/i;)V", "getBrazeGeofenceReEligibilityManager$annotations", "geofenceRequestLocation", "Lcom/braze/models/IBrazeLocation;", "getGeofenceRequestLocation", "()Lcom/braze/models/IBrazeLocation;", "setGeofenceRequestLocation", "getGeofenceRequestLocation$annotations", "isGeofencesEnabled", "Z", "()Z", "setGeofencesEnabled", "isGeofencesEnabled$annotations", "", "maxNumToRegister", "I", "getMaxNumToRegister", "()I", "setMaxNumToRegister", "(I)V", "getMaxNumToRegister$annotations", "Companion", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class BrazeGeofenceManager {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Context applicationContext;
    private final com.braze.location.a brazeGeofenceApi;
    private i brazeGeofenceReEligibilityManager;
    private final List<BrazeGeofence> brazeGeofences;
    private final com.braze.location.b brazeLocationApi;
    private final c0 brazeManager;
    private final BrazeConfigurationProvider configurationProvider;
    private final ReentrantLock geofenceListLock;
    private IBrazeLocation geofenceRequestLocation;
    private final SharedPreferences geofenceStorageSharedPreferences;
    private final PendingIntent geofenceTransitionPendingIntent;
    private boolean isGeofencesEnabled;
    private int maxNumToRegister;
    private final com.braze.storage.e0 serverConfigStorageProvider;

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/braze/managers/BrazeGeofenceManager$Companion;", "", "<init>", "()V", "", "apiKey", "getGeofenceSharedPreferencesName", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/braze/configuration/BrazeConfigurationProvider;", "configurationProvider", "", "getGeofencesEnabledFromConfiguration", "(Lcom/braze/configuration/BrazeConfigurationProvider;)Z", "Lcom/braze/storage/e0;", "serverConfigStorageProvider", "getGeofencesEnabledFromServerConfig", "(Lcom/braze/storage/e0;)Z", "", "getMaxNumToRegister", "(Lcom/braze/storage/e0;)I", "Landroid/content/SharedPreferences;", "sharedPreferences", "", "Lcom/braze/models/BrazeGeofence;", "retrieveBrazeGeofencesFromLocalStorage", "(Landroid/content/SharedPreferences;)Ljava/util/List;", "GEOFENCE_STORAGE_SHARED_PREFS_LOCATION", "Ljava/lang/String;", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getGeofencesEnabledFromServerConfig$lambda$0() {
            return "Geofences enabled in server configuration.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getGeofencesEnabledFromServerConfig$lambda$1() {
            return "Geofences explicitly disabled via server configuration.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getGeofencesEnabledFromServerConfig$lambda$2() {
            return "Geofences implicitly disabled via server configuration.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String retrieveBrazeGeofencesFromLocalStorage$lambda$3() {
            return "Did not find stored geofences.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String retrieveBrazeGeofencesFromLocalStorage$lambda$4() {
            return "Failed to find stored geofence keys.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String retrieveBrazeGeofencesFromLocalStorage$lambda$5(String str) {
            return com.braze.a.a("Received null or blank serialized geofence string for geofence id ", str, " from shared preferences. Not parsing.");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String retrieveBrazeGeofencesFromLocalStorage$lambda$6(String str) {
            return com.braze.j.a("Encountered Json exception while parsing stored geofence: ", str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String retrieveBrazeGeofencesFromLocalStorage$lambda$7(String str) {
            return com.braze.j.a("Encountered unexpected exception while parsing stored geofence: ", str);
        }

        @JvmStatic
        public final String getGeofenceSharedPreferencesName(String apiKey) {
            Intrinsics.checkNotNullParameter(apiKey, "apiKey");
            return "com.appboy.managers.geofences.storage." + apiKey;
        }

        @JvmStatic
        public final boolean getGeofencesEnabledFromConfiguration(BrazeConfigurationProvider configurationProvider) {
            Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
            return configurationProvider.isGeofencesEnabled();
        }

        @JvmStatic
        public final boolean getGeofencesEnabledFromServerConfig(com.braze.storage.e0 serverConfigStorageProvider) {
            Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
            if (!serverConfigStorageProvider.I()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: Z3.M
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String geofencesEnabledFromServerConfig$lambda$2;
                        geofencesEnabledFromServerConfig$lambda$2 = BrazeGeofenceManager.Companion.getGeofencesEnabledFromServerConfig$lambda$2();
                        return geofencesEnabledFromServerConfig$lambda$2;
                    }
                }, 6, (Object) null);
                return false;
            }
            if (serverConfigStorageProvider.H()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: Z3.K
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String geofencesEnabledFromServerConfig$lambda$0;
                        geofencesEnabledFromServerConfig$lambda$0 = BrazeGeofenceManager.Companion.getGeofencesEnabledFromServerConfig$lambda$0();
                        return geofencesEnabledFromServerConfig$lambda$0;
                    }
                }, 6, (Object) null);
                return true;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: Z3.L
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String geofencesEnabledFromServerConfig$lambda$1;
                    geofencesEnabledFromServerConfig$lambda$1 = BrazeGeofenceManager.Companion.getGeofencesEnabledFromServerConfig$lambda$1();
                    return geofencesEnabledFromServerConfig$lambda$1;
                }
            }, 6, (Object) null);
            return false;
        }

        @JvmStatic
        public final int getMaxNumToRegister(com.braze.storage.e0 serverConfigStorageProvider) {
            Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
            if (serverConfigStorageProvider.q() > 0) {
                return serverConfigStorageProvider.q();
            }
            return 20;
        }

        @JvmStatic
        public final List<BrazeGeofence> retrieveBrazeGeofencesFromLocalStorage(SharedPreferences sharedPreferences) {
            Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
            ArrayList arrayList = new ArrayList();
            Map<String, ?> all = sharedPreferences.getAll();
            if (all == null || all.isEmpty()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.J
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String retrieveBrazeGeofencesFromLocalStorage$lambda$3;
                        retrieveBrazeGeofencesFromLocalStorage$lambda$3 = BrazeGeofenceManager.Companion.retrieveBrazeGeofencesFromLocalStorage$lambda$3();
                        return retrieveBrazeGeofencesFromLocalStorage$lambda$3;
                    }
                }, 7, (Object) null);
                return arrayList;
            }
            Set<String> keySet = all.keySet();
            if (keySet.isEmpty()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: Z3.F
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String retrieveBrazeGeofencesFromLocalStorage$lambda$4;
                        retrieveBrazeGeofencesFromLocalStorage$lambda$4 = BrazeGeofenceManager.Companion.retrieveBrazeGeofencesFromLocalStorage$lambda$4();
                        return retrieveBrazeGeofencesFromLocalStorage$lambda$4;
                    }
                }, 6, (Object) null);
                return arrayList;
            }
            for (final String str : keySet) {
                final String string = sharedPreferences.getString(str, null);
                if (string != null) {
                    try {
                    } catch (JSONException e6) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: Z3.I
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                String retrieveBrazeGeofencesFromLocalStorage$lambda$6;
                                retrieveBrazeGeofencesFromLocalStorage$lambda$6 = BrazeGeofenceManager.Companion.retrieveBrazeGeofencesFromLocalStorage$lambda$6(string);
                                return retrieveBrazeGeofencesFromLocalStorage$lambda$6;
                            }
                        }, 4, (Object) null);
                        Unit unit = Unit.INSTANCE;
                    } catch (Exception e7) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e7, false, new Function0() { // from class: Z3.H
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                String retrieveBrazeGeofencesFromLocalStorage$lambda$7;
                                retrieveBrazeGeofencesFromLocalStorage$lambda$7 = BrazeGeofenceManager.Companion.retrieveBrazeGeofencesFromLocalStorage$lambda$7(string);
                                return retrieveBrazeGeofencesFromLocalStorage$lambda$7;
                            }
                        }, 4, (Object) null);
                        Unit unit2 = Unit.INSTANCE;
                    }
                    if (!StringsKt.isBlank(string)) {
                        arrayList.add(new BrazeGeofence(new JSONObject(string)));
                    }
                }
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: Z3.G
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String retrieveBrazeGeofencesFromLocalStorage$lambda$5;
                        retrieveBrazeGeofencesFromLocalStorage$lambda$5 = BrazeGeofenceManager.Companion.retrieveBrazeGeofencesFromLocalStorage$lambda$5(str);
                        return retrieveBrazeGeofencesFromLocalStorage$lambda$5;
                    }
                }, 6, (Object) null);
            }
            return arrayList;
        }

        private Companion() {
        }
    }

    public BrazeGeofenceManager(Context context, String apiKey, c0 brazeManager, BrazeConfigurationProvider configurationProvider, com.braze.storage.e0 serverConfigStorageProvider, com.braze.events.e internalIEventMessenger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(internalIEventMessenger, "internalIEventMessenger");
        this.brazeManager = brazeManager;
        this.configurationProvider = configurationProvider;
        this.serverConfigStorageProvider = serverConfigStorageProvider;
        this.brazeGeofenceApi = new com.braze.location.a();
        this.brazeLocationApi = new com.braze.location.b(context, k.f12439d.a(configurationProvider), configurationProvider);
        this.applicationContext = context.getApplicationContext();
        this.geofenceListLock = new ReentrantLock();
        Companion companion = INSTANCE;
        SharedPreferences sharedPreferences = context.getSharedPreferences(companion.getGeofenceSharedPreferencesName(apiKey), 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        this.geofenceStorageSharedPreferences = sharedPreferences;
        this.brazeGeofences = CollectionsKt.toMutableList(companion.retrieveBrazeGeofencesFromLocalStorage(sharedPreferences));
        Intrinsics.checkNotNullParameter(context, "context");
        this.geofenceTransitionPendingIntent = null;
        this.brazeGeofenceReEligibilityManager = new i(context, apiKey, serverConfigStorageProvider, internalIEventMessenger);
        if (companion.getGeofencesEnabledFromServerConfig(serverConfigStorageProvider)) {
            isGeofencesEnabledFromEnvironment(context);
        }
        this.isGeofencesEnabled = false;
        this.maxNumToRegister = companion.getMaxNumToRegister(serverConfigStorageProvider);
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: Z3.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String _init_$lambda$0;
                _init_$lambda$0 = BrazeGeofenceManager._init_$lambda$0();
                return _init_$lambda$0;
            }
        }, 6, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: Z3.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String _init_$lambda$1;
                _init_$lambda$1 = BrazeGeofenceManager._init_$lambda$1();
                return _init_$lambda$1;
            }
        }, 6, (Object) null);
        setUpGeofences(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$0() {
        return "***Geofence API not found. Please include the android-sdk-location module***";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$1() {
        return "Calling setUpGeofences on geofence manager init";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String configureFromServerConfig$lambda$27(boolean z6) {
        return "Geofences enabled server config value " + z6 + " received.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String configureFromServerConfig$lambda$28(BrazeGeofenceManager brazeGeofenceManager) {
        return "Geofences enabled status newly set to " + brazeGeofenceManager.isGeofencesEnabled + " during server config update.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String configureFromServerConfig$lambda$29(boolean z6) {
        return "Geofences enabled status of `" + z6 + "` was unchanged during server config update.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String configureFromServerConfig$lambda$30(BrazeGeofenceManager brazeGeofenceManager) {
        return "Max number to register newly set to " + brazeGeofenceManager.maxNumToRegister + " via server config.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String initializeGeofences$lambda$2() {
        return "Request to set up geofences received.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String initializeGeofences$lambda$3() {
        return "Not automatically requesting Geofences on initialization due to configuration.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isGeofencesEnabledFromEnvironment$lambda$4() {
        return "Braze Geofences disabled or Braze location collection disabled in local configuration. Geofences not enabled.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isGeofencesEnabledFromEnvironment$lambda$5() {
        return "Fine grained location permissions not found. Geofences not enabled.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isGeofencesEnabledFromEnvironment$lambda$6() {
        return "Background location access permission not found. Geofences not enabled.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isGeofencesEnabledFromEnvironment$lambda$7() {
        return "Google Play Services not available. Geofences not enabled.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isGeofencesEnabledFromEnvironment$lambda$8() {
        return "Braze Geofence API is not available";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onLocationRequestComplete$lambda$40(IBrazeLocation iBrazeLocation) {
        return "Single location request was successful, requesting Geofence refresh. Location:\n " + iBrazeLocation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onLocationRequestComplete$lambda$41() {
        return "Single location request was unsuccessful, not storing last updated time.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerGeofences$lambda$31() {
        return "Braze geofences not enabled. Not adding new geofences to local storage.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerGeofences$lambda$37$lambda$33(List list) {
        return "Received new geofence list of size: " + list.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerGeofences$lambda$37$lambda$34(BrazeGeofenceManager brazeGeofenceManager) {
        return "Reached maximum number of new geofences: " + brazeGeofenceManager.maxNumToRegister;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerGeofences$lambda$37$lambda$35(BrazeGeofence brazeGeofence) {
        return "Adding new geofence to local storage: " + brazeGeofence;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerGeofences$lambda$37$lambda$36(BrazeGeofenceManager brazeGeofenceManager) {
        return "Added " + brazeGeofenceManager.brazeGeofences.size() + " new geofences to local storage.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestGeofenceRefresh$lambda$24() {
        return "Braze geofences not enabled. Not requesting geofences.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestGeofenceRefresh$lambda$26() {
        return "Braze geofences not enabled. Not requesting geofences.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestSingleLocationUpdateFromGooglePlay$lambda$42(BrazeGeofenceManager brazeGeofenceManager, IBrazeLocation location) {
        Intrinsics.checkNotNullParameter(location, "location");
        brazeGeofenceManager.onLocationRequestComplete(location);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setUpGeofences$lambda$11() {
        return "Braze geofences not enabled. Geofences not set up.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setUpGeofences$lambda$12(boolean z6) {
        return "Setting up geofences in setUpGeofences with reRegisterGeofences: " + z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setUpGeofences$lambda$13() {
        return "Could not get pending intent to setup geofences";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String tearDownGeofences$lambda$15() {
        return "Tearing down geofences.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String tearDownGeofences$lambda$16() {
        return "Unregistering any Braze geofences from Google Play Services.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String tearDownGeofences$lambda$18$lambda$17() {
        return "Deleting locally stored geofences.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unregisterGeofences$lambda$38() {
        return "Braze geofences not enabled. Not un-registering geofences.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unregisterGeofences$lambda$39() {
        return "Tearing down all geofences.";
    }

    public void configureFromServerConfig(com.braze.models.response.m serverConfig) {
        Intrinsics.checkNotNullParameter(serverConfig, "serverConfig");
        final boolean z6 = serverConfig.f12695i;
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String configureFromServerConfig$lambda$27;
                configureFromServerConfig$lambda$27 = BrazeGeofenceManager.configureFromServerConfig$lambda$27(z6);
                return configureFromServerConfig$lambda$27;
            }
        }, 7, (Object) null);
        if (z6) {
            Context applicationContext = this.applicationContext;
            Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
            if (isGeofencesEnabledFromEnvironment(applicationContext)) {
                this.brazeGeofenceApi.getClass();
            }
        }
        final boolean z7 = false;
        if (this.isGeofencesEnabled) {
            this.isGeofencesEnabled = false;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: Z3.j
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String configureFromServerConfig$lambda$28;
                    configureFromServerConfig$lambda$28 = BrazeGeofenceManager.configureFromServerConfig$lambda$28(BrazeGeofenceManager.this);
                    return configureFromServerConfig$lambda$28;
                }
            }, 6, (Object) null);
            if (this.isGeofencesEnabled) {
                setUpGeofences(false);
                if (this.configurationProvider.isAutomaticGeofenceRequestsEnabled()) {
                    requestGeofenceRefresh(true);
                }
            } else {
                tearDownGeofences(this.geofenceTransitionPendingIntent);
            }
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.k
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String configureFromServerConfig$lambda$29;
                    configureFromServerConfig$lambda$29 = BrazeGeofenceManager.configureFromServerConfig$lambda$29(z7);
                    return configureFromServerConfig$lambda$29;
                }
            }, 7, (Object) null);
        }
        int i6 = serverConfig.f12693g;
        if (i6 >= 0) {
            this.maxNumToRegister = i6;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: Z3.m
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String configureFromServerConfig$lambda$30;
                    configureFromServerConfig$lambda$30 = BrazeGeofenceManager.configureFromServerConfig$lambda$30(BrazeGeofenceManager.this);
                    return configureFromServerConfig$lambda$30;
                }
            }, 6, (Object) null);
        }
        this.brazeGeofenceReEligibilityManager.a(serverConfig);
    }

    public final void initializeGeofences() {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.w
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String initializeGeofences$lambda$2;
                initializeGeofences$lambda$2 = BrazeGeofenceManager.initializeGeofences$lambda$2();
                return initializeGeofences$lambda$2;
            }
        }, 7, (Object) null);
        if (INSTANCE.getGeofencesEnabledFromServerConfig(this.serverConfigStorageProvider)) {
            Context applicationContext = this.applicationContext;
            Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
            if (isGeofencesEnabledFromEnvironment(applicationContext)) {
                this.brazeGeofenceApi.getClass();
            }
        }
        this.isGeofencesEnabled = false;
        if (this.configurationProvider.isAutomaticGeofenceRequestsEnabled()) {
            requestGeofenceRefresh(true);
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.y
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String initializeGeofences$lambda$3;
                    initializeGeofences$lambda$3 = BrazeGeofenceManager.initializeGeofences$lambda$3();
                    return initializeGeofences$lambda$3;
                }
            }, 7, (Object) null);
        }
    }

    public final boolean isGeofencesEnabledFromEnvironment(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!INSTANCE.getGeofencesEnabledFromConfiguration(this.configurationProvider)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.z
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String isGeofencesEnabledFromEnvironment$lambda$4;
                    isGeofencesEnabledFromEnvironment$lambda$4 = BrazeGeofenceManager.isGeofencesEnabledFromEnvironment$lambda$4();
                    return isGeofencesEnabledFromEnvironment$lambda$4;
                }
            }, 7, (Object) null);
            return false;
        }
        if (!PermissionUtils.hasPermission(context, "android.permission.ACCESS_FINE_LOCATION")) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: Z3.A
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String isGeofencesEnabledFromEnvironment$lambda$5;
                    isGeofencesEnabledFromEnvironment$lambda$5 = BrazeGeofenceManager.isGeofencesEnabledFromEnvironment$lambda$5();
                    return isGeofencesEnabledFromEnvironment$lambda$5;
                }
            }, 6, (Object) null);
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29 && !PermissionUtils.hasPermission(context, "android.permission.ACCESS_BACKGROUND_LOCATION")) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: Z3.B
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String isGeofencesEnabledFromEnvironment$lambda$6;
                    isGeofencesEnabledFromEnvironment$lambda$6 = BrazeGeofenceManager.isGeofencesEnabledFromEnvironment$lambda$6();
                    return isGeofencesEnabledFromEnvironment$lambda$6;
                }
            }, 6, (Object) null);
            return false;
        }
        if (!com.braze.support.k.a(context)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.C
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String isGeofencesEnabledFromEnvironment$lambda$7;
                    isGeofencesEnabledFromEnvironment$lambda$7 = BrazeGeofenceManager.isGeofencesEnabledFromEnvironment$lambda$7();
                    return isGeofencesEnabledFromEnvironment$lambda$7;
                }
            }, 7, (Object) null);
            return false;
        }
        this.brazeGeofenceApi.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.D
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String isGeofencesEnabledFromEnvironment$lambda$8;
                isGeofencesEnabledFromEnvironment$lambda$8 = BrazeGeofenceManager.isGeofencesEnabledFromEnvironment$lambda$8();
                return isGeofencesEnabledFromEnvironment$lambda$8;
            }
        }, 7, (Object) null);
        return false;
    }

    public void onLocationRequestComplete(final IBrazeLocation location) {
        if (location == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.v
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String onLocationRequestComplete$lambda$41;
                    onLocationRequestComplete$lambda$41 = BrazeGeofenceManager.onLocationRequestComplete$lambda$41();
                    return onLocationRequestComplete$lambda$41;
                }
            }, 7, (Object) null);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.u
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String onLocationRequestComplete$lambda$40;
                onLocationRequestComplete$lambda$40 = BrazeGeofenceManager.onLocationRequestComplete$lambda$40(IBrazeLocation.this);
                return onLocationRequestComplete$lambda$40;
            }
        }, 7, (Object) null);
        requestGeofenceRefresh(location);
        this.brazeGeofenceReEligibilityManager.b(DateTimeUtils.nowInSeconds());
    }

    public void registerGeofences(List<BrazeGeofence> geofenceList) {
        List list;
        boolean z6;
        Intrinsics.checkNotNullParameter(geofenceList, "geofenceList");
        List<BrazeGeofence> mutableList = CollectionsKt.toMutableList(geofenceList);
        if (!this.isGeofencesEnabled) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: Z3.n
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String registerGeofences$lambda$31;
                    registerGeofences$lambda$31 = BrazeGeofenceManager.registerGeofences$lambda$31();
                    return registerGeofences$lambda$31;
                }
            }, 6, (Object) null);
            return;
        }
        if (this.geofenceRequestLocation != null) {
            for (BrazeGeofence brazeGeofence : mutableList) {
                IBrazeLocation iBrazeLocation = this.geofenceRequestLocation;
                if (iBrazeLocation != null) {
                    double d6 = iBrazeLocation.get_latitude();
                    double d7 = iBrazeLocation.get_longitude();
                    double latitude = brazeGeofence.getLatitude();
                    double longitude = brazeGeofence.getLongitude();
                    double radians = Math.toRadians(latitude - d6);
                    double radians2 = Math.toRadians(longitude - d7);
                    double d8 = 2;
                    brazeGeofence.setDistanceFromGeofenceRefresh(Math.asin(Math.sqrt((Math.cos(Math.toRadians(latitude)) * Math.cos(Math.toRadians(d6)) * Math.pow(Math.sin(radians2 / d8), 2.0d)) + Math.pow(Math.sin(radians / d8), 2.0d))) * 1.2742E7d);
                    mutableList = mutableList;
                }
            }
            list = mutableList;
            z6 = true;
            CollectionsKt.sort(list);
        } else {
            list = mutableList;
            z6 = true;
        }
        ReentrantLock reentrantLock = this.geofenceListLock;
        reentrantLock.lock();
        try {
            final List list2 = list;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.o
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String registerGeofences$lambda$37$lambda$33;
                    registerGeofences$lambda$37$lambda$33 = BrazeGeofenceManager.registerGeofences$lambda$37$lambda$33(list2);
                    return registerGeofences$lambda$37$lambda$33;
                }
            }, 7, (Object) null);
            SharedPreferences.Editor edit = this.geofenceStorageSharedPreferences.edit();
            edit.clear();
            this.brazeGeofences.clear();
            Iterator it = list2.iterator();
            int i6 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                final BrazeGeofence brazeGeofence2 = (BrazeGeofence) it.next();
                if (i6 == this.maxNumToRegister) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.p
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String registerGeofences$lambda$37$lambda$34;
                            registerGeofences$lambda$37$lambda$34 = BrazeGeofenceManager.registerGeofences$lambda$37$lambda$34(BrazeGeofenceManager.this);
                            return registerGeofences$lambda$37$lambda$34;
                        }
                    }, 7, (Object) null);
                    break;
                }
                this.brazeGeofences.add(brazeGeofence2);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.q
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String registerGeofences$lambda$37$lambda$35;
                        registerGeofences$lambda$37$lambda$35 = BrazeGeofenceManager.registerGeofences$lambda$37$lambda$35(BrazeGeofence.this);
                        return registerGeofences$lambda$37$lambda$35;
                    }
                }, 7, (Object) null);
                edit.putString(brazeGeofence2.getId(), brazeGeofence2.getKey().toString());
                i6++;
            }
            edit.apply();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.r
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String registerGeofences$lambda$37$lambda$36;
                    registerGeofences$lambda$37$lambda$36 = BrazeGeofenceManager.registerGeofences$lambda$37$lambda$36(BrazeGeofenceManager.this);
                    return registerGeofences$lambda$37$lambda$36;
                }
            }, 7, (Object) null);
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            this.brazeGeofenceReEligibilityManager.a(list2);
            setUpGeofences(z6);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void registerGeofencesWithGooglePlay(List<BrazeGeofence> geofenceList, PendingIntent geofenceRequestIntent) {
        Intrinsics.checkNotNullParameter(geofenceList, "geofenceList");
        Intrinsics.checkNotNullParameter(geofenceRequestIntent, "geofenceRequestIntent");
        com.braze.location.a aVar = this.brazeGeofenceApi;
        Context context = this.applicationContext;
        Intrinsics.checkNotNullExpressionValue(context, "applicationContext");
        aVar.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(geofenceList, "geofenceList");
        Intrinsics.checkNotNullParameter(geofenceRequestIntent, "geofenceRequestIntent");
    }

    public void requestGeofenceRefresh(IBrazeLocation location) {
        Intrinsics.checkNotNullParameter(location, "location");
        if (!this.isGeofencesEnabled) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.x
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String requestGeofenceRefresh$lambda$24;
                    requestGeofenceRefresh$lambda$24 = BrazeGeofenceManager.requestGeofenceRefresh$lambda$24();
                    return requestGeofenceRefresh$lambda$24;
                }
            }, 7, (Object) null);
            return;
        }
        this.geofenceRequestLocation = location;
        if (location != null) {
            ((m) this.brazeManager).a(location);
        }
    }

    public final void requestSingleLocationUpdateFromGooglePlay() {
        com.braze.location.b bVar = this.brazeLocationApi;
        Function1 locationUpdateCallback = new Function1() { // from class: Z3.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit requestSingleLocationUpdateFromGooglePlay$lambda$42;
                requestSingleLocationUpdateFromGooglePlay$lambda$42 = BrazeGeofenceManager.requestSingleLocationUpdateFromGooglePlay$lambda$42(BrazeGeofenceManager.this, (IBrazeLocation) obj);
                return requestSingleLocationUpdateFromGooglePlay$lambda$42;
            }
        };
        bVar.getClass();
        Intrinsics.checkNotNullParameter(locationUpdateCallback, "locationUpdateCallback");
    }

    public final void setUpGeofences(final boolean reRegisterGeofences) {
        if (!this.isGeofencesEnabled) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.c
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String upGeofences$lambda$11;
                    upGeofences$lambda$11 = BrazeGeofenceManager.setUpGeofences$lambda$11();
                    return upGeofences$lambda$11;
                }
            }, 7, (Object) null);
            return;
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: Z3.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String upGeofences$lambda$12;
                upGeofences$lambda$12 = BrazeGeofenceManager.setUpGeofences$lambda$12(reRegisterGeofences);
                return upGeofences$lambda$12;
            }
        }, 6, (Object) null);
        PendingIntent pendingIntent = this.geofenceTransitionPendingIntent;
        if (pendingIntent == null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String upGeofences$lambda$13;
                    upGeofences$lambda$13 = BrazeGeofenceManager.setUpGeofences$lambda$13();
                    return upGeofences$lambda$13;
                }
            }, 7, (Object) null);
            return;
        }
        if (reRegisterGeofences) {
            ReentrantLock reentrantLock = this.geofenceListLock;
            reentrantLock.lock();
            try {
                registerGeofencesWithGooglePlay(this.brazeGeofences, pendingIntent);
                Unit unit = Unit.INSTANCE;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final void tearDownGeofences(PendingIntent geofenceRequestIntent) {
        BrazeGeofenceManager brazeGeofenceManager;
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String tearDownGeofences$lambda$15;
                tearDownGeofences$lambda$15 = BrazeGeofenceManager.tearDownGeofences$lambda$15();
                return tearDownGeofences$lambda$15;
            }
        }, 7, (Object) null);
        if (geofenceRequestIntent != null) {
            brazeGeofenceManager = this;
            BrazeLogger.brazelog$default(brazeLogger, (Object) brazeGeofenceManager, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.g
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String tearDownGeofences$lambda$16;
                    tearDownGeofences$lambda$16 = BrazeGeofenceManager.tearDownGeofences$lambda$16();
                    return tearDownGeofences$lambda$16;
                }
            }, 7, (Object) null);
            com.braze.location.a aVar = brazeGeofenceManager.brazeGeofenceApi;
            Context applicationContext = brazeGeofenceManager.applicationContext;
            Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
            aVar.getClass();
            Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
            Intrinsics.checkNotNullParameter(geofenceRequestIntent, "intent");
        } else {
            brazeGeofenceManager = this;
        }
        ReentrantLock reentrantLock = brazeGeofenceManager.geofenceListLock;
        reentrantLock.lock();
        try {
            BrazeLogger.brazelog$default(brazeLogger, (Object) brazeGeofenceManager, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String tearDownGeofences$lambda$18$lambda$17;
                    tearDownGeofences$lambda$18$lambda$17 = BrazeGeofenceManager.tearDownGeofences$lambda$18$lambda$17();
                    return tearDownGeofences$lambda$18$lambda$17;
                }
            }, 7, (Object) null);
            brazeGeofenceManager.geofenceStorageSharedPreferences.edit().clear().apply();
            brazeGeofenceManager.brazeGeofences.clear();
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void unregisterGeofences() {
        if (!this.isGeofencesEnabled) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.E
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String unregisterGeofences$lambda$38;
                    unregisterGeofences$lambda$38 = BrazeGeofenceManager.unregisterGeofences$lambda$38();
                    return unregisterGeofences$lambda$38;
                }
            }, 7, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String unregisterGeofences$lambda$39;
                    unregisterGeofences$lambda$39 = BrazeGeofenceManager.unregisterGeofences$lambda$39();
                    return unregisterGeofences$lambda$39;
                }
            }, 7, (Object) null);
            tearDownGeofences(this.geofenceTransitionPendingIntent);
        }
    }

    public void requestGeofenceRefresh(boolean ignoreRateLimit) {
        if (!this.isGeofencesEnabled) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.s
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String requestGeofenceRefresh$lambda$26;
                    requestGeofenceRefresh$lambda$26 = BrazeGeofenceManager.requestGeofenceRefresh$lambda$26();
                    return requestGeofenceRefresh$lambda$26;
                }
            }, 7, (Object) null);
        } else if (this.brazeGeofenceReEligibilityManager.a(ignoreRateLimit, DateTimeUtils.nowInSeconds())) {
            requestSingleLocationUpdateFromGooglePlay();
        }
    }
}
