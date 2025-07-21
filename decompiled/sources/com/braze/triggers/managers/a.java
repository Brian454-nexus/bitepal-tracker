package com.braze.triggers.managers;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import com.braze.support.IntentUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a {
    public static final String a(String str) {
        return com.braze.a.a("Not removing local path for remote path ", str, " from cache because it is being preserved until the end of the app run.");
    }

    public static final String b(File file) {
        return "Deleting obsolete asset '" + file.getPath() + "' from filesystem.";
    }

    public static final String c(String str) {
        return com.braze.b.a("Encountered unexpected exception while parsing stored triggered action local assets on remote asset '", str, '\'');
    }

    public static final String b(String str, String str2) {
        return "Retrieving trigger local asset path '" + str + "' from local storage for remote path '" + str2 + '\'';
    }

    public static final String c(File file) {
        return "Deleting triggers directory at: " + file.getAbsolutePath();
    }

    public final void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        final File file = new File(context.getCacheDir(), "ab_triggers");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: t4.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.triggers.managers.a.c(file);
            }
        }, 6, (Object) null);
        BrazeFileUtils.deleteFileOrDirectory(file);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [T, java.lang.Object, java.lang.String] */
    public static String b(final String remoteAssetUrl) {
        String lastPathSegment;
        int lastIndexOf$default;
        Intrinsics.checkNotNullParameter(remoteAssetUrl, "remoteAssetUrl");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "";
        Uri parse = Uri.parse(remoteAssetUrl);
        if (parse != null && (lastPathSegment = parse.getLastPathSegment()) != null && lastPathSegment.length() != 0 && (lastIndexOf$default = StringsKt.lastIndexOf$default(lastPathSegment, com.amazon.a.a.o.c.a.b.f11260a, 0, false, 6, (Object) null)) > -1) {
            ?? substring = lastPathSegment.substring(lastIndexOf$default);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            objectRef.element = substring;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) b.f13073e, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: t4.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.triggers.managers.a.a(Ref.ObjectRef.this, remoteAssetUrl);
                }
            }, 6, (Object) null);
        }
        return IntentUtils.getRequestCode() + ((String) objectRef.element);
    }

    public final void a(File triggeredAssetDirectory, ConcurrentHashMap remoteToLocalAssetsMap, LinkedHashMap preservedLocalAssetMap) {
        Intrinsics.checkNotNullParameter(triggeredAssetDirectory, "triggeredAssetDirectory");
        Intrinsics.checkNotNullParameter(remoteToLocalAssetsMap, "remoteToLocalAssetsMap");
        Intrinsics.checkNotNullParameter(preservedLocalAssetMap, "preservedLocalAssetMap");
        final File[] listFiles = triggeredAssetDirectory.listFiles();
        if (listFiles == null) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: t4.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.triggers.managers.a.a(listFiles);
            }
        }, 6, (Object) null);
        try {
            ArrayList arrayList = new ArrayList();
            for (File file : listFiles) {
                if (!remoteToLocalAssetsMap.containsValue(file.getPath())) {
                    arrayList.add(file);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (!preservedLocalAssetMap.containsValue(((File) next).getPath())) {
                    arrayList2.add(next);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                final File file2 = (File) it2.next();
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) b.f13073e, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: t4.i
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.triggers.managers.a.b(file2);
                    }
                }, 7, (Object) null);
                Intrinsics.checkNotNull(file2);
                BrazeFileUtils.deleteFileOrDirectory(file2);
            }
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: t4.j
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.triggers.managers.a.a();
                }
            }, 4, (Object) null);
        }
    }

    public static final String a(File[] fileArr) {
        return "Local triggered asset directory contains files: " + ArraysKt.joinToString$default(fileArr, " , ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: t4.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.braze.triggers.managers.a.a((File) obj);
            }
        }, 30, (Object) null);
    }

    public static final CharSequence a(File file) {
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return name;
    }

    public static final String a() {
        return "Exception while deleting obsolete assets from filesystem.";
    }

    public final ConcurrentHashMap a(SharedPreferences storagePrefs) {
        Intrinsics.checkNotNullParameter(storagePrefs, "storagePrefs");
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        Map<String, ?> all = storagePrefs.getAll();
        if (all != null && !all.isEmpty()) {
            for (final String str : all.keySet()) {
                try {
                    final String string = storagePrefs.getString(str, null);
                    if (string != null && !StringsKt.isBlank(string)) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: t4.a
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return com.braze.triggers.managers.a.b(string, str);
                            }
                        }, 7, (Object) null);
                        concurrentHashMap.put(str, string);
                    }
                } catch (Exception e6) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: t4.d
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return com.braze.triggers.managers.a.c(str);
                        }
                    }, 4, (Object) null);
                }
            }
        }
        return concurrentHashMap;
    }

    public final void a(SharedPreferences.Editor editor, ConcurrentHashMap localAssetPaths, Set newRemotePathStrings, LinkedHashMap preservedLocalAssetPathMap) {
        Intrinsics.checkNotNullParameter(editor, "editor");
        Intrinsics.checkNotNullParameter(localAssetPaths, "localAssetPaths");
        Intrinsics.checkNotNullParameter(newRemotePathStrings, "newRemotePathStrings");
        Intrinsics.checkNotNullParameter(preservedLocalAssetPathMap, "preservedLocalAssetPathMap");
        Iterator it = new HashSet(localAssetPaths.keySet()).iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            final String str = (String) it.next();
            if (preservedLocalAssetPathMap.containsKey(str)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: t4.k
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.triggers.managers.a.a(str);
                    }
                }, 7, (Object) null);
            } else if (!newRemotePathStrings.contains(str)) {
                localAssetPaths.remove(str);
                editor.remove(str);
                final String str2 = (String) localAssetPaths.get(str);
                if (str2 != null && !StringsKt.isBlank(str2)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: t4.l
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return com.braze.triggers.managers.a.a(str2, str);
                        }
                    }, 7, (Object) null);
                    BrazeFileUtils.deleteFileOrDirectory(new File(str2));
                }
            }
        }
    }

    public static final String a(String str, String str2) {
        return "Removing obsolete local path " + str + " for obsolete remote path " + str2 + " from cache.";
    }

    public final Pair a(List triggeredActions) {
        Intrinsics.checkNotNullParameter(triggeredActions, "triggeredActions");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it = triggeredActions.iterator();
        while (it.hasNext()) {
            final com.braze.triggers.actions.a aVar = (com.braze.triggers.actions.a) it.next();
            if (!((com.braze.triggers.actions.g) aVar).f13022c) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: t4.f
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.triggers.managers.a.a(com.braze.triggers.actions.a.this);
                    }
                }, 7, (Object) null);
            } else {
                Iterator it2 = aVar.a().iterator();
                while (it2.hasNext()) {
                    com.braze.triggers.utils.a aVar2 = (com.braze.triggers.utils.a) it2.next();
                    final String str = aVar2.f13108b;
                    if (!StringsKt.isBlank(str)) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: t4.g
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return com.braze.triggers.managers.a.a(com.braze.triggers.actions.a.this, str);
                            }
                        }, 7, (Object) null);
                        linkedHashSet.add(aVar2);
                        linkedHashSet2.add(str);
                    }
                }
            }
        }
        return new Pair(linkedHashSet, linkedHashSet2);
    }

    public static final String a(com.braze.triggers.actions.a aVar) {
        return com.braze.c.a(new StringBuilder("Pre-fetch off for triggered action "), ((com.braze.triggers.actions.g) aVar).f13020a, ". Not pre-fetching assets.");
    }

    public static final String a(com.braze.triggers.actions.a aVar, String str) {
        return "Received new remote path for triggered action " + ((com.braze.triggers.actions.g) aVar).f13020a + " at " + str + com.amazon.a.a.o.c.a.b.f11260a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final String a(Ref.ObjectRef objectRef, String str) {
        return "Using file extension " + ((String) objectRef.element) + " for remote asset url: " + str;
    }
}
