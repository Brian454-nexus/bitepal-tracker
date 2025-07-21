package b;

import B9.a;
import G9.i;
import G9.j;
import android.os.Build;
import android.os.Environment;
import android.os.FileObserver;
import android.os.Handler;
import android.os.Looper;
import android.webkit.MimeTypeMap;
import b.C1072a;
import com.appsflyer.AppsFlyerProperties;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0017B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\tJ\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR$\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\u001f0\u001ej\b\u0012\u0004\u0012\u00020\u001f` 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010!¨\u0006#"}, d2 = {"Lb/a;", "LB9/a;", "LG9/j$c;", "<init>", "()V", "LB9/a$b;", "flutterPluginBinding", "", "onAttachedToEngine", "(LB9/a$b;)V", "LG9/i;", "call", "LG9/j$d;", "result", "onMethodCall", "(LG9/i;LG9/j$d;)V", "binding", "onDetachedFromEngine", "", "url", "c", "(Ljava/lang/String;)Ljava/lang/String;", "LG9/j;", "a", "LG9/j;", AppsFlyerProperties.CHANNEL, "Landroid/os/Handler;", "b", "Landroid/os/Handler;", "handler", "Ljava/util/ArrayList;", "Landroid/os/FileObserver;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "fileObservers", "screenshot_detector_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScreenshotDetectorPlugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScreenshotDetectorPlugin.kt\nai/reface/flutter/screenshot_detector/ScreenshotDetectorPlugin\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,109:1\n1863#2,2:110\n1863#2,2:112\n1863#2,2:114\n*S KotlinDebug\n*F\n+ 1 ScreenshotDetectorPlugin.kt\nai/reface/flutter/screenshot_detector/ScreenshotDetectorPlugin\n*L\n59#1:110,2\n74#1:112,2\n80#1:114,2\n*E\n"})
/* renamed from: b.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1072a implements B9.a, j.c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public j channel;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public Handler handler;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final ArrayList fileObservers = new ArrayList();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: b.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class EnumC0157a {

        /* renamed from: b, reason: collision with root package name */
        public static final EnumC0157a f10376b;

        /* renamed from: c, reason: collision with root package name */
        public static final EnumC0157a f10377c;

        /* renamed from: d, reason: collision with root package name */
        public static final EnumC0157a f10378d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ EnumC0157a[] f10379e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f10380f;

        /* renamed from: a, reason: collision with root package name */
        public final String f10381a;

        static {
            String path = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).getPath();
            String str = File.separator;
            f10376b = new EnumC0157a("DCIMSAMSUNG", 0, path + str + "Screen recordings" + str);
            f10377c = new EnumC0157a("DCIM", 1, Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).getPath() + str + "Screenshots" + str);
            f10378d = new EnumC0157a("PICTURES", 2, Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getPath() + str + "Screenshots" + str);
            EnumC0157a[] a6 = a();
            f10379e = a6;
            f10380f = EnumEntriesKt.enumEntries(a6);
        }

        public EnumC0157a(String str, int i6, String str2) {
            this.f10381a = str2;
        }

        public static final /* synthetic */ EnumC0157a[] a() {
            return new EnumC0157a[]{f10376b, f10377c, f10378d};
        }

        public static EnumC0157a valueOf(String str) {
            return (EnumC0157a) Enum.valueOf(EnumC0157a.class, str);
        }

        public static EnumC0157a[] values() {
            return (EnumC0157a[]) f10379e.clone();
        }

        public final String b() {
            return this.f10381a;
        }
    }

    /* renamed from: b.a$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends FileObserver {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f10382a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C1072a f10383b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ArrayList arrayList, ArrayList arrayList2, C1072a c1072a) {
            super(arrayList);
            this.f10382a = arrayList2;
            this.f10383b = c1072a;
        }

        public static final void b(C1072a this$0, File file) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(file, "$file");
            j jVar = this$0.channel;
            if (jVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException(AppsFlyerProperties.CHANNEL);
                jVar = null;
            }
            jVar.c("screenshot", file.getPath());
        }

        @Override // android.os.FileObserver
        public void onEvent(int i6, String str) {
            Iterator it = this.f10382a.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
            while (it.hasNext()) {
                Object next = it.next();
                Intrinsics.checkNotNullExpressionValue(next, "next(...)");
                final File file = new File(((String) next) + str);
                if (file.exists()) {
                    C1072a c1072a = this.f10383b;
                    String path = file.getPath();
                    Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
                    String c6 = c1072a.c(path);
                    if (c6 != null && (i6 == 256 || i6 == 2)) {
                        Handler handler = null;
                        if (StringsKt.contains$default(c6, "image", false, 2, (Object) null)) {
                            Handler handler2 = this.f10383b.handler;
                            if (handler2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("handler");
                            } else {
                                handler = handler2;
                            }
                            final C1072a c1072a2 = this.f10383b;
                            handler.post(new Runnable() { // from class: b.b
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C1072a.b.b(C1072a.this, file);
                                }
                            });
                            return;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b.a$c */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c extends FileObserver {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ EnumC0157a f10384a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C1072a f10385b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(EnumC0157a enumC0157a, C1072a c1072a, String str) {
            super(str);
            this.f10384a = enumC0157a;
            this.f10385b = c1072a;
        }

        public static final void b(C1072a this$0, File file) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(file, "$file");
            j jVar = this$0.channel;
            if (jVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException(AppsFlyerProperties.CHANNEL);
                jVar = null;
            }
            jVar.c("screenshot", file.getPath());
        }

        @Override // android.os.FileObserver
        public void onEvent(int i6, String str) {
            final File file = new File(this.f10384a.b() + str);
            if (file.exists()) {
                C1072a c1072a = this.f10385b;
                String path = file.getPath();
                Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
                String c6 = c1072a.c(path);
                if (c6 == null) {
                    return;
                }
                if (i6 == 256 || i6 == 2) {
                    Handler handler = null;
                    if (StringsKt.contains$default(c6, "image", false, 2, (Object) null)) {
                        Handler handler2 = this.f10385b.handler;
                        if (handler2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("handler");
                        } else {
                            handler = handler2;
                        }
                        final C1072a c1072a2 = this.f10385b;
                        handler.post(new Runnable() { // from class: b.c
                            @Override // java.lang.Runnable
                            public final void run() {
                                C1072a.c.b(C1072a.this, file);
                            }
                        });
                    }
                }
            }
        }
    }

    public final String c(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        int lastIndexOf$default = StringsKt.lastIndexOf$default(url, com.amazon.a.a.o.c.a.b.f11260a, 0, false, 6, (Object) null);
        if (lastIndexOf$default < 0 || lastIndexOf$default >= url.length() - 1) {
            return null;
        }
        String substring = url.substring(lastIndexOf$default + 1);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return MimeTypeMap.getSingleton().getMimeTypeFromExtension(substring);
    }

    public void onAttachedToEngine(a.b flutterPluginBinding) {
        Intrinsics.checkNotNullParameter(flutterPluginBinding, "flutterPluginBinding");
        j jVar = new j(flutterPluginBinding.b(), "screenshot_detector_channel");
        this.channel = jVar;
        jVar.e(this);
        this.handler = new Handler(Looper.getMainLooper());
    }

    public void onDetachedFromEngine(a.b binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        j jVar = this.channel;
        if (jVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException(AppsFlyerProperties.CHANNEL);
            jVar = null;
        }
        jVar.e((j.c) null);
    }

    public void onMethodCall(i call, j.d result) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        String str = call.a;
        if (!Intrinsics.areEqual(str, "watch")) {
            if (Intrinsics.areEqual(str, "dispose")) {
                Iterator it = this.fileObservers.iterator();
                while (it.hasNext()) {
                    ((FileObserver) it.next()).stopWatching();
                }
                return;
            }
            return;
        }
        int i6 = 0;
        if (Build.VERSION.SDK_INT < 29) {
            EnumC0157a[] values = EnumC0157a.values();
            int length = values.length;
            while (i6 < length) {
                EnumC0157a enumC0157a = values[i6];
                this.fileObservers.add(new c(enumC0157a, this, enumC0157a.b()));
                Iterator it2 = this.fileObservers.iterator();
                while (it2.hasNext()) {
                    ((FileObserver) it2.next()).startWatching();
                }
                i6++;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        EnumC0157a[] values2 = EnumC0157a.values();
        int length2 = values2.length;
        while (i6 < length2) {
            EnumC0157a enumC0157a2 = values2[i6];
            arrayList.add(new File(enumC0157a2.b()));
            arrayList2.add(enumC0157a2.b());
            i6++;
        }
        this.fileObservers.add(new b(arrayList, arrayList2, this));
        Iterator it3 = this.fileObservers.iterator();
        while (it3.hasNext()) {
            ((FileObserver) it3.next()).startWatching();
        }
    }
}
