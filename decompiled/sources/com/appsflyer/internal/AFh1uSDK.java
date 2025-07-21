package com.appsflyer.internal;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0014\b'\u0018\u0000 !2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u000b\u0010\fJO\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0016\u0010\fJ)\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0017\u0010\fJ)\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0018\u0010\fJ\u001d\u0010\u001a\u001a\u00020\u0006*\u0004\u0018\u00010\u00062\u0006\u0010\u0019\u001a\u00020\u0004H\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001c\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u001c\u0010\u001bR\u001a\u0010\u001d\u001a\u00020\b8\u0017X\u0096D¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 "}, d2 = {"Lcom/appsflyer/internal/AFh1uSDK;", "", "<init>", "()V", "Lcom/appsflyer/internal/AFh1vSDK;", "tag", "", "msg", "", "shouldRemoteDebug", "", "d", "(Lcom/appsflyer/internal/AFh1vSDK;Ljava/lang/String;Z)V", "", "throwable", "printMsg", "printThrowable", "shouldReportToExManager", Q4.e.f4542u, "(Lcom/appsflyer/internal/AFh1vSDK;Ljava/lang/String;Ljava/lang/Throwable;ZZZZ)V", "force", "(Lcom/appsflyer/internal/AFh1vSDK;Ljava/lang/String;)V", "i", "v", "w", "p0", "getRevenue", "(Ljava/lang/String;Lcom/appsflyer/internal/AFh1vSDK;)Ljava/lang/String;", "withTag$SDK_prodRelease", "shouldExtendMsg", "Z", "getShouldExtendMsg", "()Z", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAFLoggerBase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AFLoggerBase.kt\ncom/appsflyer/internal/logger/AFLoggerBase\n+ 2 StringExtensions.kt\ncom/appsflyer/StringExtensionsKt\n*L\n1#1,69:1\n36#2:70\n*S KotlinDebug\n*F\n+ 1 AFLoggerBase.kt\ncom/appsflyer/internal/logger/AFLoggerBase\n*L\n61#1:70\n*E\n"})
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AFh1uSDK {
    private final boolean shouldExtendMsg;
    public static long AFAdRevenueData = System.currentTimeMillis();

    public static /* synthetic */ void d$default(AFh1uSDK aFh1uSDK, AFh1vSDK aFh1vSDK, String str, boolean z6, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((i6 & 4) != 0) {
            z6 = true;
        }
        aFh1uSDK.d(aFh1vSDK, str, z6);
    }

    public static /* synthetic */ void e$default(AFh1uSDK aFh1uSDK, AFh1vSDK aFh1vSDK, String str, Throwable th, boolean z6, boolean z7, boolean z8, boolean z9, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((i6 & 8) != 0) {
            z6 = true;
        }
        if ((i6 & 16) != 0) {
            z7 = true;
        }
        if ((i6 & 32) != 0) {
            z8 = true;
        }
        if ((i6 & 64) != 0) {
            z9 = true;
        }
        aFh1uSDK.e(aFh1vSDK, str, th, z6, z7, z8, z9);
    }

    public static /* synthetic */ void i$default(AFh1uSDK aFh1uSDK, AFh1vSDK aFh1vSDK, String str, boolean z6, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((i6 & 4) != 0) {
            z6 = true;
        }
        aFh1uSDK.i(aFh1vSDK, str, z6);
    }

    public static /* synthetic */ void v$default(AFh1uSDK aFh1uSDK, AFh1vSDK aFh1vSDK, String str, boolean z6, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((i6 & 4) != 0) {
            z6 = true;
        }
        aFh1uSDK.v(aFh1vSDK, str, z6);
    }

    public static /* synthetic */ void w$default(AFh1uSDK aFh1uSDK, AFh1vSDK aFh1vSDK, String str, boolean z6, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((i6 & 4) != 0) {
            z6 = true;
        }
        aFh1uSDK.w(aFh1vSDK, str, z6);
    }

    @JvmOverloads
    public void d(@NotNull AFh1vSDK tag, @NotNull String msg, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
    }

    @JvmOverloads
    public void e(@NotNull AFh1vSDK tag, @NotNull String msg, @NotNull Throwable throwable, boolean printMsg, boolean printThrowable, boolean shouldReportToExManager, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
        Intrinsics.checkNotNullParameter(throwable, "");
    }

    public void force(@NotNull AFh1vSDK tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
    }

    @NotNull
    public final String getRevenue(@Nullable String str, @NotNull AFh1vSDK aFh1vSDK) {
        Intrinsics.checkNotNullParameter(aFh1vSDK, "");
        if (str == null || StringsKt.isBlank(str)) {
            str = "null";
        }
        String withTag$SDK_prodRelease = withTag$SDK_prodRelease(str, aFh1vSDK);
        if (!getShouldExtendMsg()) {
            return withTag$SDK_prodRelease;
        }
        return "(" + (System.currentTimeMillis() - AFAdRevenueData) + ") [" + Thread.currentThread().getName() + "] " + withTag$SDK_prodRelease;
    }

    @JvmName(name = "getShouldExtendMsg")
    public boolean getShouldExtendMsg() {
        return this.shouldExtendMsg;
    }

    @JvmOverloads
    public void i(@NotNull AFh1vSDK tag, @NotNull String msg, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
    }

    @JvmOverloads
    public void v(@NotNull AFh1vSDK tag, @NotNull String msg, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
    }

    @JvmOverloads
    public void w(@NotNull AFh1vSDK tag, @NotNull String msg, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
    }

    @NotNull
    public final String withTag$SDK_prodRelease(@NotNull String str, @NotNull AFh1vSDK aFh1vSDK) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(aFh1vSDK, "");
        return "[" + aFh1vSDK.getMediationNetwork + "] " + str;
    }

    @JvmOverloads
    public final void d(@NotNull AFh1vSDK aFh1vSDK, @NotNull String str) {
        Intrinsics.checkNotNullParameter(aFh1vSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        d$default(this, aFh1vSDK, str, false, 4, null);
    }

    @JvmOverloads
    public final void e(@NotNull AFh1vSDK aFh1vSDK, @NotNull String str, @NotNull Throwable th) {
        Intrinsics.checkNotNullParameter(aFh1vSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        e$default(this, aFh1vSDK, str, th, false, false, false, false, 120, null);
    }

    @JvmOverloads
    public final void i(@NotNull AFh1vSDK aFh1vSDK, @NotNull String str) {
        Intrinsics.checkNotNullParameter(aFh1vSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        i$default(this, aFh1vSDK, str, false, 4, null);
    }

    @JvmOverloads
    public final void v(@NotNull AFh1vSDK aFh1vSDK, @NotNull String str) {
        Intrinsics.checkNotNullParameter(aFh1vSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        v$default(this, aFh1vSDK, str, false, 4, null);
    }

    @JvmOverloads
    public final void w(@NotNull AFh1vSDK aFh1vSDK, @NotNull String str) {
        Intrinsics.checkNotNullParameter(aFh1vSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        w$default(this, aFh1vSDK, str, false, 4, null);
    }

    @JvmOverloads
    public final void e(@NotNull AFh1vSDK aFh1vSDK, @NotNull String str, @NotNull Throwable th, boolean z6) {
        Intrinsics.checkNotNullParameter(aFh1vSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        e$default(this, aFh1vSDK, str, th, z6, false, false, false, 112, null);
    }

    @JvmOverloads
    public final void e(@NotNull AFh1vSDK aFh1vSDK, @NotNull String str, @NotNull Throwable th, boolean z6, boolean z7) {
        Intrinsics.checkNotNullParameter(aFh1vSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        e$default(this, aFh1vSDK, str, th, z6, z7, false, false, 96, null);
    }

    @JvmOverloads
    public final void e(@NotNull AFh1vSDK aFh1vSDK, @NotNull String str, @NotNull Throwable th, boolean z6, boolean z7, boolean z8) {
        Intrinsics.checkNotNullParameter(aFh1vSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        e$default(this, aFh1vSDK, str, th, z6, z7, z8, false, 64, null);
    }
}
