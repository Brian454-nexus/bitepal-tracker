package com.braze.support;

import android.util.Log;
import com.braze.support.BrazeLogger;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001DB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b\u0014\u0010\u0013J+\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b\u0015\u0010\u0013J+\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b\u0016\u0010\u0013J'\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0017\u0010\u0013J\u001b\u0010\u001a\u001a\u00020\r2\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001d\u001a\u00020\r*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0011\u0010\u001a\u001a\u00020\r*\u00020\r¢\u0006\u0004\b\u001a\u0010\u001fJ?\u0010$\u001a\u00020\u0006*\u00020\u00012\b\b\u0002\u0010!\u001a\u00020 2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\"\u001a\u00020\u00042\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\r0\u001c¢\u0006\u0004\b$\u0010%JC\u0010$\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010!\u001a\u00020 2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\"\u001a\u00020\u00042\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\r0\u001c¢\u0006\u0004\b$\u0010&J\u0011\u0010'\u001a\u00020\r*\u00020\u0001¢\u0006\u0004\b'\u0010(R\u0016\u0010)\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010*Rq\u00100\u001aK\u0012\u0013\u0012\u00110 ¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(!\u0012\u0013\u0012\u00110\r¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(#\u0012\u0015\u0012\u0013\u0018\u00010\u0010¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u00020\u0006\u0018\u00010,8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b0\u00101\u0012\u0004\b6\u0010\u0003\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0080\u0001\u00108\u001a`\u0012\u0013\u0012\u00110\r¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110 ¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(!\u0012\u0013\u0012\u00110\r¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(#\u0012\u0015\u0012\u0013\u0018\u00010\u0010¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u00020\u0006\u0018\u0001078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R0\u0010>\u001a\u00020\t2\u0006\u0010>\u001a\u00020\t8\u0006@FX\u0087\u000e¢\u0006\u0018\n\u0004\b>\u0010?\u0012\u0004\bC\u0010\u0003\u001a\u0004\b@\u0010A\"\u0004\bB\u0010\f¨\u0006E"}, d2 = {"Lcom/braze/support/BrazeLogger;", "", "<init>", "()V", "", "returnOnDebug", "", "checkForSystemLogLevelProperty", "(Z)V", "", "initialLogLevel", "setInitialLogLevelFromConfiguration", "(I)V", "", "tag", "msg", "", "tr", "v", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "d", "i", "w", Q4.e.f4542u, "Ljava/lang/Class;", "classForTag", "getBrazeLogTag", "(Ljava/lang/Class;)Ljava/lang/String;", "Lkotlin/Function0;", "toStringSafe", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/String;", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/braze/support/BrazeLogger$Priority;", "priority", "skipSdkDebug", "message", "brazelog", "(Ljava/lang/Object;Lcom/braze/support/BrazeLogger$Priority;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;)V", "(Ljava/lang/String;Lcom/braze/support/BrazeLogger$Priority;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;)V", "brazeLogTag", "(Ljava/lang/Object;)Ljava/lang/String;", "isSystemPropLogLevelSet", "Z", "hasLogLevelBeenSetForAppRun", "Lkotlin/Function3;", "Lkotlin/ParameterName;", com.amazon.a.a.h.a.f10906a, "throwable", "onLoggedCallback", "Lkotlin/jvm/functions/Function3;", "getOnLoggedCallback", "()Lkotlin/jvm/functions/Function3;", "setOnLoggedCallback", "(Lkotlin/jvm/functions/Function3;)V", "getOnLoggedCallback$annotations", "Lkotlin/Function4;", "sdkDebuggerCallback", "Lkotlin/jvm/functions/Function4;", "getSdkDebuggerCallback$android_sdk_base_release", "()Lkotlin/jvm/functions/Function4;", "setSdkDebuggerCallback$android_sdk_base_release", "(Lkotlin/jvm/functions/Function4;)V", "logLevel", "I", "getLogLevel", "()I", "setLogLevel", "getLogLevel$annotations", "Priority", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class BrazeLogger {
    private static boolean hasLogLevelBeenSetForAppRun;
    private static boolean isSystemPropLogLevelSet;
    private static Function3<? super Priority, ? super String, ? super Throwable, Unit> onLoggedCallback;
    private static Function4<? super String, ? super Priority, ? super String, ? super Throwable, Unit> sdkDebuggerCallback;
    public static final BrazeLogger INSTANCE = new BrazeLogger();
    private static int logLevel = 4;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/braze/support/BrazeLogger$Priority;", "", "logLevel", "", "<init>", "(Ljava/lang/String;II)V", "getLogLevel", "()I", "D", "I", "E", "V", "W", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class Priority extends Enum<Priority> {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Priority[] $VALUES;
        private final int logLevel;

        /* renamed from: D */
        public static final Priority f12980D = new Priority("D", 0, 3);

        /* renamed from: I */
        public static final Priority f12982I = new Priority("I", 1, 4);

        /* renamed from: E */
        public static final Priority f12981E = new Priority("E", 2, 6);

        /* renamed from: V */
        public static final Priority f12983V = new Priority("V", 3, 2);

        /* renamed from: W */
        public static final Priority f12984W = new Priority("W", 4, 5);

        private static final /* synthetic */ Priority[] $values() {
            return new Priority[]{f12980D, f12982I, f12981E, f12983V, f12984W};
        }

        static {
            Priority[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private Priority(String str, int i6, int i7) {
            super(str, i6);
            this.logLevel = i7;
        }

        public static Priority valueOf(String str) {
            return (Priority) Enum.valueOf(Priority.class, str);
        }

        public static Priority[] values() {
            return (Priority[]) $VALUES.clone();
        }

        public final int getLogLevel() {
            return this.logLevel;
        }
    }

    private BrazeLogger() {
    }

    public static final String _set_logLevel_$lambda$0(int i6) {
        return "Log level already set via system property. BrazeLogger.setLogLevel() ignored for level: " + i6;
    }

    public static /* synthetic */ void brazelog$default(BrazeLogger brazeLogger, Object obj, Priority priority, Throwable th, boolean z6, Function0 function0, int i6, Object obj2) {
        if ((i6 & 1) != 0) {
            priority = Priority.f12980D;
        }
        Priority priority2 = priority;
        if ((i6 & 2) != 0) {
            th = null;
        }
        Throwable th2 = th;
        if ((i6 & 4) != 0) {
            z6 = false;
        }
        brazeLogger.brazelog(obj, priority2, th2, z6, (Function0<String>) function0);
    }

    public static final String brazelog$lambda$7(Function0 function0) {
        return INSTANCE.toStringSafe(function0);
    }

    @JvmStatic
    public static final void checkForSystemLogLevelProperty(boolean returnOnDebug) {
        String a6 = s.a("log.tag.BRAZE");
        if (StringsKt.equals("verbose", StringsKt.trim(s.a("log.tag.APPBOY")).toString(), true) || StringsKt.equals("verbose", StringsKt.trim(a6).toString(), true)) {
            setLogLevel(2);
            isSystemPropLogLevelSet = true;
            BrazeLogger brazeLogger = INSTANCE;
            brazelog$default(brazeLogger, (Object) brazeLogger, Priority.f12982I, (Throwable) null, false, new Function0() { // from class: p4.N
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String checkForSystemLogLevelProperty$lambda$1;
                    checkForSystemLogLevelProperty$lambda$1 = BrazeLogger.checkForSystemLogLevelProperty$lambda$1();
                    return checkForSystemLogLevelProperty$lambda$1;
                }
            }, 6, (Object) null);
        }
    }

    public static /* synthetic */ void checkForSystemLogLevelProperty$default(boolean z6, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            z6 = true;
        }
        checkForSystemLogLevelProperty(z6);
    }

    public static final String checkForSystemLogLevelProperty$lambda$1() {
        return "BrazeLogger log level set to VERBOSE via device system property for BRAZE/APPBOY. Note that subsequent calls to BrazeLogger.setLogLevel() will have no effect.";
    }

    public static /* synthetic */ void d$default(String str, String str2, Throwable th, int i6, Object obj) {
        if ((i6 & 4) != 0) {
            th = null;
        }
        d(str, str2, th);
    }

    public static final String d$lambda$3(String str) {
        return str;
    }

    public static final String e$lambda$6(String str) {
        return str;
    }

    @JvmStatic
    public static final String getBrazeLogTag(Class<?> classForTag) {
        Intrinsics.checkNotNullParameter(classForTag, "classForTag");
        String name = classForTag.getName();
        int length = name.length();
        if (length <= 65) {
            Intrinsics.checkNotNull(name);
        } else {
            Intrinsics.checkNotNull(name);
            name = name.substring(length - 65);
            Intrinsics.checkNotNullExpressionValue(name, "substring(...)");
        }
        return com.braze.j.a("Braze v36.0.0 .", name);
    }

    @JvmStatic
    public static final void i(String tag, String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        i$default(tag, msg, null, 4, null);
    }

    public static /* synthetic */ void i$default(String str, String str2, Throwable th, int i6, Object obj) {
        if ((i6 & 4) != 0) {
            th = null;
        }
        i(str, str2, th);
    }

    public static final String i$lambda$4(String str) {
        return str;
    }

    @JvmStatic
    public static final void setInitialLogLevelFromConfiguration(int initialLogLevel) {
        if (hasLogLevelBeenSetForAppRun) {
            return;
        }
        setLogLevel(initialLogLevel);
    }

    public static final void setLogLevel(final int i6) {
        if (isSystemPropLogLevelSet) {
            BrazeLogger brazeLogger = INSTANCE;
            brazelog$default(brazeLogger, (Object) brazeLogger, Priority.f12984W, (Throwable) null, false, new Function0() { // from class: p4.M
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String _set_logLevel_$lambda$0;
                    _set_logLevel_$lambda$0 = BrazeLogger._set_logLevel_$lambda$0(i6);
                    return _set_logLevel_$lambda$0;
                }
            }, 6, (Object) null);
        } else {
            hasLogLevelBeenSetForAppRun = true;
            logLevel = i6;
        }
    }

    private final String toStringSafe(Function0<? extends Object> function0) {
        try {
            return String.valueOf(function0.invoke());
        } catch (Exception unused) {
            return "";
        }
    }

    @JvmStatic
    public static final void v(String tag, String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        v$default(tag, msg, null, 4, null);
    }

    public static /* synthetic */ void v$default(String str, String str2, Throwable th, int i6, Object obj) {
        if ((i6 & 4) != 0) {
            th = null;
        }
        v(str, str2, th);
    }

    public static final String v$lambda$2(String str) {
        return str;
    }

    @JvmStatic
    public static final void w(String tag, String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        w$default(tag, msg, null, 4, null);
    }

    public static /* synthetic */ void w$default(String str, String str2, Throwable th, int i6, Object obj) {
        if ((i6 & 4) != 0) {
            th = null;
        }
        w(str, str2, th);
    }

    public static final String w$lambda$5(String str) {
        return str;
    }

    public final String brazeLogTag(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        String name = obj.getClass().getName();
        Intrinsics.checkNotNull(name);
        String substringAfterLast$default = StringsKt.substringAfterLast$default(StringsKt.substringBefore$default(name, '$', (String) null, 2, (Object) null), com.amazon.a.a.o.c.a.b.f11260a, (String) null, 2, (Object) null);
        return substringAfterLast$default.length() == 0 ? getBrazeLogTag(name) : getBrazeLogTag(substringAfterLast$default);
    }

    public final void brazelog(Object obj, Priority priority, Throwable th, boolean z6, Function0<String> message) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(message, "message");
        if (logLevel <= priority.getLogLevel() || sdkDebuggerCallback != null) {
            brazelog(brazeLogTag(obj), priority, th, z6, message);
        }
    }

    public final void setSdkDebuggerCallback$android_sdk_base_release(Function4<? super String, ? super Priority, ? super String, ? super Throwable, Unit> function4) {
        sdkDebuggerCallback = function4;
    }

    @JvmStatic
    public static final void d(String tag, String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        d$default(tag, msg, null, 4, null);
    }

    @JvmStatic
    public static final void e(String tag, final String msg, Throwable tr) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(tr, "tr");
        brazelog$default(INSTANCE, tag, Priority.f12980D, tr, false, new Function0() { // from class: p4.P
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String e$lambda$6;
                e$lambda$6 = BrazeLogger.e$lambda$6(msg);
                return e$lambda$6;
            }
        }, 8, (Object) null);
    }

    @JvmStatic
    public static final void i(String tag, final String msg, Throwable tr) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        brazelog$default(INSTANCE, tag, Priority.f12982I, tr, false, new Function0() { // from class: p4.O
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String i$lambda$4;
                i$lambda$4 = BrazeLogger.i$lambda$4(msg);
                return i$lambda$4;
            }
        }, 8, (Object) null);
    }

    @JvmStatic
    public static final void v(String tag, final String msg, Throwable tr) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        brazelog$default(INSTANCE, tag, Priority.f12983V, tr, false, new Function0() { // from class: p4.K
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String v$lambda$2;
                v$lambda$2 = BrazeLogger.v$lambda$2(msg);
                return v$lambda$2;
            }
        }, 8, (Object) null);
    }

    @JvmStatic
    public static final void w(String tag, final String msg, Throwable tr) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        brazelog$default(INSTANCE, tag, Priority.f12984W, tr, false, new Function0() { // from class: p4.L
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String w$lambda$5;
                w$lambda$5 = BrazeLogger.w$lambda$5(msg);
                return w$lambda$5;
            }
        }, 8, (Object) null);
    }

    public static /* synthetic */ void brazelog$default(BrazeLogger brazeLogger, String str, Priority priority, Throwable th, boolean z6, Function0 function0, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            priority = Priority.f12980D;
        }
        Priority priority2 = priority;
        if ((i6 & 4) != 0) {
            th = null;
        }
        Throwable th2 = th;
        if ((i6 & 8) != 0) {
            z6 = false;
        }
        brazeLogger.brazelog(str, priority2, th2, z6, (Function0<String>) function0);
    }

    @JvmStatic
    public static final void d(String tag, final String msg, Throwable tr) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        brazelog$default(INSTANCE, tag, Priority.f12980D, tr, false, new Function0() { // from class: p4.I
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String d$lambda$3;
                d$lambda$3 = BrazeLogger.d$lambda$3(msg);
                return d$lambda$3;
            }
        }, 8, (Object) null);
    }

    public final void brazelog(String tag, Priority priority, Throwable tr, boolean skipSdkDebug, final Function0<String> message) {
        Function4<? super String, ? super Priority, ? super String, ? super Throwable, Unit> function4;
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(message, "message");
        Lazy lazy = LazyKt.lazy(new Function0() { // from class: p4.J
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String brazelog$lambda$7;
                brazelog$lambda$7 = BrazeLogger.brazelog$lambda$7(Function0.this);
                return brazelog$lambda$7;
            }
        });
        Function3<? super Priority, ? super String, ? super Throwable, Unit> function3 = onLoggedCallback;
        if (function3 != null) {
            function3.invoke(priority, lazy.getValue(), tr);
        }
        if (!skipSdkDebug && (function4 = sdkDebuggerCallback) != null) {
            function4.invoke(tag, priority, lazy.getValue(), tr);
        }
        if (logLevel <= priority.getLogLevel()) {
            int i6 = b.f12987a[priority.ordinal()];
            if (i6 == 1) {
                if (tr == null) {
                    Log.d(tag, (String) lazy.getValue());
                    return;
                } else {
                    Log.d(tag, (String) lazy.getValue(), tr);
                    return;
                }
            }
            if (i6 == 2) {
                if (tr == null) {
                    Log.i(tag, (String) lazy.getValue());
                    return;
                } else {
                    Log.i(tag, (String) lazy.getValue(), tr);
                    return;
                }
            }
            if (i6 == 3) {
                if (tr == null) {
                    Log.w(tag, (String) lazy.getValue());
                    return;
                } else {
                    Log.e(tag, (String) lazy.getValue(), tr);
                    return;
                }
            }
            if (i6 == 4) {
                if (tr == null) {
                    Log.w(tag, (String) lazy.getValue());
                    return;
                } else {
                    Log.w(tag, (String) lazy.getValue(), tr);
                    return;
                }
            }
            if (i6 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            if (tr == null) {
                Log.v(tag, (String) lazy.getValue());
            } else {
                Log.v(tag, (String) lazy.getValue(), tr);
            }
        }
    }

    public final String getBrazeLogTag(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return "Braze v36.0.0 ." + str;
    }
}
