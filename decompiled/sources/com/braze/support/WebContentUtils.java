package com.braze.support;

import android.content.Context;
import com.braze.support.BrazeLogger;
import com.braze.support.WebContentUtils;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Locale;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/braze/support/WebContentUtils;", "", "<init>", "()V", "Ljava/io/File;", "localDirectory", "", "remoteZipUrl", "getLocalHtmlUrlFromRemoteUrl", "(Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;", "unpackDirectory", "zipFile", "", "unpackZipIntoDirectory", "(Ljava/lang/String;Ljava/io/File;)Z", "Landroid/content/Context;", "context", "getHtmlInAppMessageAssetCacheDirectory", "(Landroid/content/Context;)Ljava/io/File;", "originalString", "", "remoteToLocalAssetMap", "replacePrefetchedUrlsWithLocalAssets", "(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;", "intendedParentDirectory", "childFilePath", "validateChildFileExistsUnderParent", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class WebContentUtils {
    public static final WebContentUtils INSTANCE = new WebContentUtils();

    private WebContentUtils() {
    }

    @JvmStatic
    public static final File getHtmlInAppMessageAssetCacheDirectory(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new File(context.getCacheDir().getPath() + "/braze-html-inapp-messages");
    }

    @JvmStatic
    public static final String getLocalHtmlUrlFromRemoteUrl(File localDirectory, final String remoteZipUrl) {
        Intrinsics.checkNotNullParameter(localDirectory, "localDirectory");
        Intrinsics.checkNotNullParameter(remoteZipUrl, "remoteZipUrl");
        if (StringsKt.isBlank(remoteZipUrl)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: p4.L0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String localHtmlUrlFromRemoteUrl$lambda$0;
                    localHtmlUrlFromRemoteUrl$lambda$0 = WebContentUtils.getLocalHtmlUrlFromRemoteUrl$lambda$0();
                    return localHtmlUrlFromRemoteUrl$lambda$0;
                }
            }, 6, (Object) null);
            return null;
        }
        String absolutePath = localDirectory.getAbsolutePath();
        String valueOf = String.valueOf(IntentUtils.getRequestCode());
        final String str = absolutePath + '/' + valueOf;
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        WebContentUtils webContentUtils = INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) webContentUtils, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: p4.O0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String localHtmlUrlFromRemoteUrl$lambda$1;
                localHtmlUrlFromRemoteUrl$lambda$1 = WebContentUtils.getLocalHtmlUrlFromRemoteUrl$lambda$1(remoteZipUrl, str);
                return localHtmlUrlFromRemoteUrl$lambda$1;
            }
        }, 7, (Object) null);
        try {
            File file = (File) BrazeFileUtils.downloadFileToPath(str, remoteZipUrl, valueOf, ".zip").component1();
            BrazeLogger.brazelog$default(brazeLogger, (Object) webContentUtils, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: p4.P0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String localHtmlUrlFromRemoteUrl$lambda$3;
                    localHtmlUrlFromRemoteUrl$lambda$3 = WebContentUtils.getLocalHtmlUrlFromRemoteUrl$lambda$3(remoteZipUrl, str);
                    return localHtmlUrlFromRemoteUrl$lambda$3;
                }
            }, 7, (Object) null);
            if (unpackZipIntoDirectory(str, file)) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) webContentUtils, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: p4.R0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String localHtmlUrlFromRemoteUrl$lambda$5;
                        localHtmlUrlFromRemoteUrl$lambda$5 = WebContentUtils.getLocalHtmlUrlFromRemoteUrl$lambda$5(str);
                        return localHtmlUrlFromRemoteUrl$lambda$5;
                    }
                }, 7, (Object) null);
                return str;
            }
            BrazeLogger.brazelog$default(brazeLogger, (Object) webContentUtils, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: p4.Q0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String localHtmlUrlFromRemoteUrl$lambda$4;
                    localHtmlUrlFromRemoteUrl$lambda$4 = WebContentUtils.getLocalHtmlUrlFromRemoteUrl$lambda$4();
                    return localHtmlUrlFromRemoteUrl$lambda$4;
                }
            }, 6, (Object) null);
            BrazeFileUtils.deleteFileOrDirectory(new File(str));
            return null;
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: p4.S0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String localHtmlUrlFromRemoteUrl$lambda$2;
                    localHtmlUrlFromRemoteUrl$lambda$2 = WebContentUtils.getLocalHtmlUrlFromRemoteUrl$lambda$2(remoteZipUrl);
                    return localHtmlUrlFromRemoteUrl$lambda$2;
                }
            }, 4, (Object) null);
            BrazeFileUtils.deleteFileOrDirectory(new File(str));
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalHtmlUrlFromRemoteUrl$lambda$0() {
        return "Remote zip url is empty. No local URL will be created.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalHtmlUrlFromRemoteUrl$lambda$1(String str, String str2) {
        return "Starting download of url: " + str + " to " + str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalHtmlUrlFromRemoteUrl$lambda$2(String str) {
        return com.braze.j.a("Could not download zip file to local storage. ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalHtmlUrlFromRemoteUrl$lambda$3(String str, String str2) {
        return "Html content zip downloaded. " + str + " to " + str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalHtmlUrlFromRemoteUrl$lambda$4() {
        return "Error during the zip unpack.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalHtmlUrlFromRemoteUrl$lambda$5(String str) {
        return com.braze.b.a("Html content zip unpacked to to ", str, com.amazon.a.a.o.c.a.b.f11260a);
    }

    @JvmStatic
    public static final String replacePrefetchedUrlsWithLocalAssets(String originalString, Map<String, String> remoteToLocalAssetMap) {
        Intrinsics.checkNotNullParameter(originalString, "originalString");
        Intrinsics.checkNotNullParameter(remoteToLocalAssetMap, "remoteToLocalAssetMap");
        String str = originalString;
        for (Map.Entry<String, String> entry : remoteToLocalAssetMap.entrySet()) {
            final String value = entry.getValue();
            if (new File(value).exists()) {
                final String key = entry.getKey();
                if (StringsKt.contains$default(value, "ab_triggers", false, 2, (Object) null)) {
                    final String a6 = com.braze.j.a("https://iamcache.braze/ab_triggers", (String) StringsKt.split$default(value, new String[]{"ab_triggers"}, false, 0, 6, (Object) null).get(1));
                    if (StringsKt.contains$default(str, key, false, 2, (Object) null)) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: p4.U0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                String replacePrefetchedUrlsWithLocalAssets$lambda$13;
                                replacePrefetchedUrlsWithLocalAssets$lambda$13 = WebContentUtils.replacePrefetchedUrlsWithLocalAssets$lambda$13(key, a6);
                                return replacePrefetchedUrlsWithLocalAssets$lambda$13;
                            }
                        }, 7, (Object) null);
                        str = StringsKt.replace$default(str, key, a6, false, 4, (Object) null);
                    }
                }
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: p4.T0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String replacePrefetchedUrlsWithLocalAssets$lambda$12;
                        replacePrefetchedUrlsWithLocalAssets$lambda$12 = WebContentUtils.replacePrefetchedUrlsWithLocalAssets$lambda$12(value);
                        return replacePrefetchedUrlsWithLocalAssets$lambda$12;
                    }
                }, 6, (Object) null);
            }
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String replacePrefetchedUrlsWithLocalAssets$lambda$12(String str) {
        return com.braze.j.a("Cannot find local asset file at path: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String replacePrefetchedUrlsWithLocalAssets$lambda$13(String str, String str2) {
        return "Replacing remote url \"" + str + "\" with local uri \"" + str2 + '\"';
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [T, java.lang.String] */
    @JvmStatic
    public static final boolean unpackZipIntoDirectory(final String unpackDirectory, final File zipFile) {
        Intrinsics.checkNotNullParameter(unpackDirectory, "unpackDirectory");
        Intrinsics.checkNotNullParameter(zipFile, "zipFile");
        if (StringsKt.isBlank(unpackDirectory)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: p4.V0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String unpackZipIntoDirectory$lambda$6;
                    unpackZipIntoDirectory$lambda$6 = WebContentUtils.unpackZipIntoDirectory$lambda$6();
                    return unpackZipIntoDirectory$lambda$6;
                }
            }, 6, (Object) null);
            return false;
        }
        new File(unpackDirectory).mkdirs();
        try {
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(zipFile));
            try {
                for (ZipEntry nextEntry = zipInputStream.getNextEntry(); nextEntry != null; nextEntry = zipInputStream.getNextEntry()) {
                    ?? name = nextEntry.getName();
                    objectRef.element = name;
                    Locale US = Locale.US;
                    Intrinsics.checkNotNullExpressionValue(US, "US");
                    String lowerCase = name.toLowerCase(US);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    if (!StringsKt.startsWith$default(lowerCase, "__macosx", false, 2, (Object) null)) {
                        try {
                            String validateChildFileExistsUnderParent = validateChildFileExistsUnderParent(unpackDirectory, unpackDirectory + '/' + ((String) objectRef.element));
                            if (!nextEntry.isDirectory()) {
                                try {
                                    File parentFile = new File(validateChildFileExistsUnderParent).getParentFile();
                                    if (parentFile != null) {
                                        parentFile.mkdirs();
                                    }
                                } catch (Exception e6) {
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: p4.W0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            String unpackZipIntoDirectory$lambda$10$lambda$7;
                                            unpackZipIntoDirectory$lambda$10$lambda$7 = WebContentUtils.unpackZipIntoDirectory$lambda$10$lambda$7(Ref.ObjectRef.this);
                                            return unpackZipIntoDirectory$lambda$10$lambda$7;
                                        }
                                    }, 4, (Object) null);
                                }
                                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(validateChildFileExistsUnderParent));
                                try {
                                    ByteStreamsKt.copyTo$default(zipInputStream, bufferedOutputStream, 0, 2, null);
                                    CloseableKt.closeFinally(bufferedOutputStream, null);
                                } catch (Throwable th) {
                                    try {
                                        throw th;
                                        break;
                                    } catch (Throwable th2) {
                                        CloseableKt.closeFinally(bufferedOutputStream, th);
                                        throw th2;
                                        break;
                                    }
                                }
                            } else {
                                new File(validateChildFileExistsUnderParent).mkdirs();
                            }
                        } catch (Exception e7) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f12981E, (Throwable) e7, false, new Function0() { // from class: p4.M0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    String unpackZipIntoDirectory$lambda$10$lambda$9;
                                    unpackZipIntoDirectory$lambda$10$lambda$9 = WebContentUtils.unpackZipIntoDirectory$lambda$10$lambda$9(Ref.ObjectRef.this);
                                    return unpackZipIntoDirectory$lambda$10$lambda$9;
                                }
                            }, 4, (Object) null);
                        }
                    }
                    zipInputStream.closeEntry();
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(zipInputStream, null);
                return true;
            } finally {
            }
        } catch (Throwable th3) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f12981E, th3, false, new Function0() { // from class: p4.N0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String unpackZipIntoDirectory$lambda$11;
                    unpackZipIntoDirectory$lambda$11 = WebContentUtils.unpackZipIntoDirectory$lambda$11(zipFile, unpackDirectory);
                    return unpackZipIntoDirectory$lambda$11;
                }
            }, 4, (Object) null);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final String unpackZipIntoDirectory$lambda$10$lambda$7(Ref.ObjectRef objectRef) {
        return "Error creating parent directory " + ((String) objectRef.element);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final String unpackZipIntoDirectory$lambda$10$lambda$9(Ref.ObjectRef objectRef) {
        return "Error unpacking zipEntry " + ((String) objectRef.element);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unpackZipIntoDirectory$lambda$11(File file, String str) {
        return "Error during unpack of zip file " + file.getAbsolutePath() + " to " + str + com.amazon.a.a.o.c.a.b.f11260a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unpackZipIntoDirectory$lambda$6() {
        return "Unpack directory is blank. Zip file not unpacked.";
    }

    @JvmStatic
    public static final String validateChildFileExistsUnderParent(String intendedParentDirectory, String childFilePath) {
        Intrinsics.checkNotNullParameter(intendedParentDirectory, "intendedParentDirectory");
        Intrinsics.checkNotNullParameter(childFilePath, "childFilePath");
        String canonicalPath = new File(intendedParentDirectory).getCanonicalPath();
        String canonicalPath2 = new File(childFilePath).getCanonicalPath();
        Intrinsics.checkNotNull(canonicalPath2);
        Intrinsics.checkNotNull(canonicalPath);
        if (StringsKt.startsWith$default(canonicalPath2, canonicalPath, false, 2, (Object) null)) {
            return canonicalPath2;
        }
        throw new IllegalStateException("Invalid file with original path: " + childFilePath + " with canonical path: " + canonicalPath2 + " does not exist under intended parent with  path: " + intendedParentDirectory + " and canonical path: " + canonicalPath);
    }
}
