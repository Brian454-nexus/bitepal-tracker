package com.braze.support;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.TrafficStats;
import android.net.Uri;
import com.braze.Braze;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.io.ConstantsKt;
import kotlin.io.FilesKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0011\u0010\f\u001a\u00020\u000b*\u00020\n¢\u0006\u0004\b\f\u0010\r\u001a\u0011\u0010\u000e\u001a\u00020\u000b*\u00020\n¢\u0006\u0004\b\u000e\u0010\r\u001aO\u0010\u0017\u001a \u0012\u0004\u0012\u00020\u0000\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0015j\u0002`\u00160\u00142\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0019\u0010\u001b\u001a\u00020\u000f*\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000f¢\u0006\u0004\b\u001b\u0010\u001c\"\u0014\u0010\u001d\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\"\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000f0\u001f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Ljava/io/File;", "fileOrDirectory", "", "deleteFileOrDirectory", "(Ljava/io/File;)V", "Landroid/content/Context;", "context", "file", "deleteSharedPreferencesFile", "(Landroid/content/Context;Ljava/io/File;)V", "Landroid/net/Uri;", "", "isRemoteUri", "(Landroid/net/Uri;)Z", "isLocalUri", "", "downloadDirectoryAbsolutePath", "remoteFileUrl", "outputFilename", "extension", "Lkotlin/Pair;", "", "Lcom/braze/communication/HttpHeaders;", "downloadFileToPath", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lkotlin/Pair;", "Landroid/content/res/AssetManager;", "assetPath", "getAssetFileStringContents", "(Landroid/content/res/AssetManager;Ljava/lang/String;)Ljava/lang/String;", "TAG", "Ljava/lang/String;", "", "REMOTE_SCHEMES", "Ljava/util/List;", "android-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class BrazeFileUtils {
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("BrazeFileUtils");
    public static final List<String> REMOTE_SCHEMES = CollectionsKt.listOf(new String[]{"http", "https", "ftp", "ftps", "about", "javascript"});

    public static final void deleteFileOrDirectory(final File fileOrDirectory) {
        Intrinsics.checkNotNullParameter(fileOrDirectory, "fileOrDirectory");
        if (FilesKt.deleteRecursively(fileOrDirectory)) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: p4.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String deleteFileOrDirectory$lambda$0;
                deleteFileOrDirectory$lambda$0 = BrazeFileUtils.deleteFileOrDirectory$lambda$0(fileOrDirectory);
                return deleteFileOrDirectory$lambda$0;
            }
        }, 12, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String deleteFileOrDirectory$lambda$0(File file) {
        return "Could not recursively delete " + file.getName();
    }

    public static final void deleteSharedPreferencesFile(Context context, final File file) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(file, "file");
        if (!file.exists()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: p4.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String deleteSharedPreferencesFile$lambda$1;
                    deleteSharedPreferencesFile$lambda$1 = BrazeFileUtils.deleteSharedPreferencesFile$lambda$1(file);
                    return deleteSharedPreferencesFile$lambda$1;
                }
            }, 12, (Object) null);
            return;
        }
        String name = file.getName();
        Intrinsics.checkNotNull(name);
        if (StringsKt.endsWith$default(name, ".xml", false, 2, (Object) null)) {
            context.deleteSharedPreferences(StringsKt.removeSuffix(name, ".xml"));
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: p4.c
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String deleteSharedPreferencesFile$lambda$2;
                    deleteSharedPreferencesFile$lambda$2 = BrazeFileUtils.deleteSharedPreferencesFile$lambda$2(file);
                    return deleteSharedPreferencesFile$lambda$2;
                }
            }, 12, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String deleteSharedPreferencesFile$lambda$1(File file) {
        return "Cannot delete SharedPreferences that does not exist. Path: " + file.getAbsolutePath();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String deleteSharedPreferencesFile$lambda$2(File file) {
        return "SharedPreferences file is expected to end in .xml. Path: " + file.getAbsolutePath();
    }

    public static final Pair<File, Map<String, String>> downloadFileToPath(String downloadDirectoryAbsolutePath, final String remoteFileUrl, String outputFilename, String str) {
        Exception exc;
        Throwable th;
        File file;
        HttpURLConnection a6;
        Intrinsics.checkNotNullParameter(downloadDirectoryAbsolutePath, "downloadDirectoryAbsolutePath");
        Intrinsics.checkNotNullParameter(remoteFileUrl, "remoteFileUrl");
        Intrinsics.checkNotNullParameter(outputFilename, "outputFilename");
        TrafficStats.setThreadStatsTag(1337);
        if (Braze.INSTANCE.getOutboundNetworkRequestsOffline()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: p4.i
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String downloadFileToPath$lambda$4;
                    downloadFileToPath$lambda$4 = BrazeFileUtils.downloadFileToPath$lambda$4(remoteFileUrl);
                    return downloadFileToPath$lambda$4;
                }
            }, 12, (Object) null);
            throw new Exception(com.braze.j.a("SDK is offline. File not downloaded for url: ", remoteFileUrl));
        }
        if (StringsKt.isBlank(downloadDirectoryAbsolutePath)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: p4.h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String downloadFileToPath$lambda$5;
                    downloadFileToPath$lambda$5 = BrazeFileUtils.downloadFileToPath$lambda$5();
                    return downloadFileToPath$lambda$5;
                }
            }, 12, (Object) null);
            throw new Exception("Download directory is blank. File not downloaded.");
        }
        if (StringsKt.isBlank(remoteFileUrl)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: p4.g
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String downloadFileToPath$lambda$6;
                    downloadFileToPath$lambda$6 = BrazeFileUtils.downloadFileToPath$lambda$6();
                    return downloadFileToPath$lambda$6;
                }
            }, 12, (Object) null);
            throw new Exception("Zip file url is blank. File not downloaded.");
        }
        if (StringsKt.isBlank(outputFilename)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: p4.f
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String downloadFileToPath$lambda$7;
                    downloadFileToPath$lambda$7 = BrazeFileUtils.downloadFileToPath$lambda$7();
                    return downloadFileToPath$lambda$7;
                }
            }, 12, (Object) null);
            throw new Exception("Output filename is blank. File not downloaded.");
        }
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                new File(downloadDirectoryAbsolutePath).mkdirs();
                if (str != null && !StringsKt.isBlank(str)) {
                    outputFilename = outputFilename + str;
                }
                file = new File(downloadDirectoryAbsolutePath, outputFilename);
                a6 = com.braze.communication.g.f12110a.a(new URL(remoteFileUrl));
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e6) {
            exc = e6;
        }
        try {
            final int responseCode = a6.getResponseCode();
            if (responseCode != 200) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: p4.d
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String downloadFileToPath$lambda$8;
                        downloadFileToPath$lambda$8 = BrazeFileUtils.downloadFileToPath$lambda$8(responseCode, remoteFileUrl);
                        return downloadFileToPath$lambda$8;
                    }
                }, 14, (Object) null);
                throw new Exception("HTTP response code was " + responseCode + ". File with url " + remoteFileUrl + " could not be downloaded.");
            }
            DataInputStream dataInputStream = new DataInputStream(a6.getInputStream());
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    ByteStreamsKt.copyTo$default(dataInputStream, fileOutputStream, 0, 2, null);
                    CloseableKt.closeFinally(fileOutputStream, null);
                    CloseableKt.closeFinally(dataInputStream, null);
                    Map<String, List<String>> headerFields = a6.getHeaderFields();
                    Intrinsics.checkNotNullExpressionValue(headerFields, "getHeaderFields(...)");
                    LinkedHashMap a7 = l.a(headerFields);
                    a6.disconnect();
                    return new Pair<>(file, a7);
                } finally {
                }
            } finally {
            }
        } catch (Exception e7) {
            httpURLConnection = a6;
            exc = e7;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f12981E, (Throwable) exc, false, new Function0() { // from class: p4.e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String downloadFileToPath$lambda$11;
                    downloadFileToPath$lambda$11 = BrazeFileUtils.downloadFileToPath$lambda$11(remoteFileUrl);
                    return downloadFileToPath$lambda$11;
                }
            }, 8, (Object) null);
            throw new Exception("Exception during download of file from url : " + remoteFileUrl);
        } catch (Throwable th3) {
            httpURLConnection = a6;
            th = th3;
            if (httpURLConnection == null) {
                throw th;
            }
            httpURLConnection.disconnect();
            throw th;
        }
    }

    public static /* synthetic */ Pair downloadFileToPath$default(String str, String str2, String str3, String str4, int i6, Object obj) {
        if ((i6 & 8) != 0) {
            str4 = null;
        }
        return downloadFileToPath(str, str2, str3, str4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String downloadFileToPath$lambda$11(String str) {
        return com.braze.j.a("Exception during download of file from url : ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String downloadFileToPath$lambda$4(String str) {
        return com.braze.j.a("SDK is offline. File not downloaded for url: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String downloadFileToPath$lambda$5() {
        return "Download directory null or blank. File not downloaded.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String downloadFileToPath$lambda$6() {
        return "Zip file url null or blank. File not downloaded.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String downloadFileToPath$lambda$7() {
        return "Output filename null or blank. File not downloaded.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String downloadFileToPath$lambda$8(int i6, String str) {
        return "HTTP response code was " + i6 + ". File with url " + str + " could not be downloaded.";
    }

    public static final String getAssetFileStringContents(AssetManager assetManager, String assetPath) {
        Intrinsics.checkNotNullParameter(assetManager, "<this>");
        Intrinsics.checkNotNullParameter(assetPath, "assetPath");
        InputStream open = assetManager.open(assetPath);
        Intrinsics.checkNotNullExpressionValue(open, "open(...)");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open, Charsets.UTF_8), ConstantsKt.DEFAULT_BUFFER_SIZE);
        try {
            String readText = TextStreamsKt.readText(bufferedReader);
            CloseableKt.closeFinally(bufferedReader, null);
            return readText;
        } finally {
        }
    }

    public static final boolean isLocalUri(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        String scheme = uri.getScheme();
        return scheme == null || StringsKt.isBlank(scheme) || Intrinsics.areEqual(scheme, "file");
    }

    public static final boolean isRemoteUri(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        String scheme = uri.getScheme();
        if (scheme != null && !StringsKt.isBlank(scheme)) {
            return REMOTE_SCHEMES.contains(scheme);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: p4.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String isRemoteUri$lambda$3;
                isRemoteUri$lambda$3 = BrazeFileUtils.isRemoteUri$lambda$3();
                return isRemoteUri$lambda$3;
            }
        }, 12, (Object) null);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isRemoteUri$lambda$3() {
        return "Null or blank Uri scheme.";
    }
}
