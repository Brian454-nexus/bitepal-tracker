package com.braze.triggers.managers;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import com.braze.j;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import com.braze.support.WebContentUtils;
import com.braze.support.l;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final a f13073e = new a();

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f13074a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f13075b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f13076c;

    /* renamed from: d, reason: collision with root package name */
    public final File f13077d;

    public b(Context context, String apiKey) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.appboy.storage.triggers.local_assets." + apiKey, 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        this.f13074a = sharedPreferences;
        this.f13075b = f13073e.a(sharedPreferences);
        this.f13076c = new LinkedHashMap();
        this.f13077d = new File(context.getCacheDir().getPath() + "/ab_triggers");
    }

    public static final String a(String str) {
        return j.a("Could not download ", str);
    }

    public static final String b(String str) {
        return com.braze.a.a("Failed to store asset for remote path ", str, ". Not storing local asset");
    }

    public static final String c(String str) {
        return com.braze.a.a("Failed to store html zip asset for remote path ", str, ". Not storing local asset");
    }

    public static final String d(String str) {
        return j.a("Could not find local asset for remote path ", str);
    }

    public static final String e(String str) {
        return j.a("Failed to add new local path for remote path ", str);
    }

    public static final String b(com.braze.triggers.actions.a aVar) {
        return "Prefetch is turned off for this triggered action. Not retrieving local asset paths. Action id: " + ((com.braze.triggers.actions.g) aVar).f13020a;
    }

    public static final String c(String str, String str2) {
        return "Adding new local path '" + str + "' for remote path '" + str2 + "' to cache.";
    }

    public final String a(com.braze.triggers.utils.a remotePath) {
        Long a6;
        Intrinsics.checkNotNullParameter(remotePath, "remotePath");
        final String str = remotePath.f13108b;
        int ordinal = remotePath.f13107a.ordinal();
        if (ordinal == 0) {
            final String localHtmlUrlFromRemoteUrl = WebContentUtils.getLocalHtmlUrlFromRemoteUrl(this.f13077d, str);
            if (localHtmlUrlFromRemoteUrl != null && !StringsKt.isBlank(localHtmlUrlFromRemoteUrl)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: t4.n
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.triggers.managers.b.a(localHtmlUrlFromRemoteUrl, str);
                    }
                }, 6, (Object) null);
                return localHtmlUrlFromRemoteUrl;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: t4.o
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.triggers.managers.b.c(str);
                }
            }, 7, (Object) null);
            return null;
        }
        if (ordinal != 1 && ordinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        String b6 = a.b(str);
        try {
            String file = this.f13077d.toString();
            Intrinsics.checkNotNullExpressionValue(file, "toString(...)");
            Pair downloadFileToPath$default = BrazeFileUtils.downloadFileToPath$default(file, str, b6, null, 8, null);
            File file2 = (File) downloadFileToPath$default.component1();
            final Map map = (Map) downloadFileToPath$default.component2();
            String str2 = (String) map.get("expires");
            if (str2 != null && (a6 = l.a(str2)) != null && a6.longValue() <= 0) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: t4.u
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.triggers.managers.b.a(str, map);
                    }
                }, 7, (Object) null);
                return null;
            }
            final Uri fromFile = Uri.fromFile(file2);
            if (fromFile != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: t4.v
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.triggers.managers.b.a(fromFile, str);
                    }
                }, 6, (Object) null);
                return fromFile.getPath();
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: t4.w
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.triggers.managers.b.b(str);
                }
            }, 7, (Object) null);
            return null;
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: t4.x
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.triggers.managers.b.a(str);
                }
            }, 4, (Object) null);
            return null;
        }
    }

    public static final String c(com.braze.triggers.actions.a aVar) {
        return "No local assets found for action id: " + ((com.braze.triggers.actions.g) aVar).f13020a;
    }

    public static final String b(String str, String str2) {
        return "Found local asset at path " + str + " for remote asset at path: " + str2;
    }

    public final void a(List triggeredActions) {
        Intrinsics.checkNotNullParameter(triggeredActions, "triggeredActions");
        a aVar = f13073e;
        Pair a6 = aVar.a(triggeredActions);
        Set set = (Set) a6.component1();
        Set set2 = (Set) a6.component2();
        SharedPreferences.Editor edit = this.f13074a.edit();
        Intrinsics.checkNotNull(edit);
        aVar.a(edit, this.f13075b, set2, this.f13076c);
        aVar.a(this.f13077d, this.f13075b, this.f13076c);
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (!this.f13075b.containsKey(((com.braze.triggers.utils.a) obj).f13108b)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.braze.triggers.utils.a aVar2 = (com.braze.triggers.utils.a) it.next();
            final String str = aVar2.f13108b;
            try {
                final String a7 = a(aVar2);
                if (a7 != null && !StringsKt.isBlank(a7)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: t4.s
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return com.braze.triggers.managers.b.c(a7, str);
                        }
                    }, 7, (Object) null);
                    this.f13075b.put(str, a7);
                    edit.putString(str, a7);
                }
            } catch (Exception e6) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: t4.t
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.triggers.managers.b.e(str);
                    }
                }, 4, (Object) null);
            }
        }
        edit.apply();
    }

    public final Map a(final com.braze.triggers.actions.a triggeredAction) {
        Intrinsics.checkNotNullParameter(triggeredAction, "triggeredAction");
        if (!((com.braze.triggers.actions.g) triggeredAction).f13022c) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: t4.m
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.triggers.managers.b.b(com.braze.triggers.actions.a.this);
                }
            }, 7, (Object) null);
            return MapsKt.emptyMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = triggeredAction.a().iterator();
        while (it.hasNext()) {
            final String str = ((com.braze.triggers.utils.a) it.next()).f13108b;
            final String path = (String) this.f13075b.get(str);
            if (path != null) {
                Intrinsics.checkNotNullParameter(path, "path");
                if (new File(path).exists()) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: t4.p
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return com.braze.triggers.managers.b.b(path, str);
                        }
                    }, 7, (Object) null);
                    this.f13076c.put(str, path);
                    linkedHashMap.put(str, path);
                }
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: t4.q
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.triggers.managers.b.d(str);
                }
            }, 6, (Object) null);
        }
        if (linkedHashMap.isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: t4.r
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.triggers.managers.b.c(com.braze.triggers.actions.a.this);
                }
            }, 6, (Object) null);
        }
        return linkedHashMap;
    }

    public static final String a(String str, String str2) {
        return "Storing local triggered action html zip asset at local path " + str + " for remote path " + str2;
    }

    public static final String a(String str, Map map) {
        return "Not caching " + str + " due to headers " + map;
    }

    public static final String a(Uri uri, String str) {
        return "Storing local triggered action asset at local path " + uri.getPath() + " for remote path " + str;
    }
}
