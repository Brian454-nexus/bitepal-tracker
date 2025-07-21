package G3;

import ga.J;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;
import y3.InterfaceC2355a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class g {

    /* renamed from: l, reason: collision with root package name */
    public static final b f1777l = new b(null);

    /* renamed from: m, reason: collision with root package name */
    public static final ConcurrentHashMap f1778m = new ConcurrentHashMap();

    /* renamed from: n, reason: collision with root package name */
    public static final ConcurrentHashMap f1779n = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final File f1780a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1781b;

    /* renamed from: c, reason: collision with root package name */
    public final K3.b f1782c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC2355a f1783d;

    /* renamed from: e, reason: collision with root package name */
    public final G3.c f1784e;

    /* renamed from: f, reason: collision with root package name */
    public final String f1785f;

    /* renamed from: g, reason: collision with root package name */
    public final String f1786g;

    /* renamed from: h, reason: collision with root package name */
    public final Set f1787h;

    /* renamed from: i, reason: collision with root package name */
    public final Map f1788i;

    /* renamed from: j, reason: collision with root package name */
    public final pa.a f1789j;

    /* renamed from: k, reason: collision with root package name */
    public final pa.a f1790k;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a extends SuspendLambda implements Function2 {

        /* renamed from: j, reason: collision with root package name */
        public int f1791j;

        public a(Continuation continuation) {
            super(2, continuation);
        }

        public final Continuation create(Object obj, Continuation continuation) {
            return new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(J j6, Continuation continuation) {
            return create(j6, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i6 = this.f1791j;
            if (i6 == 0) {
                ResultKt.throwOnFailure(obj);
                g gVar = g.this;
                this.f1791j = 1;
                if (gVar.l(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i6 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c extends ContinuationImpl {

        /* renamed from: j, reason: collision with root package name */
        public Object f1793j;

        /* renamed from: k, reason: collision with root package name */
        public Object f1794k;

        /* renamed from: l, reason: collision with root package name */
        public Object f1795l;

        /* renamed from: m, reason: collision with root package name */
        public /* synthetic */ Object f1796m;

        /* renamed from: o, reason: collision with root package name */
        public int f1798o;

        public c(Continuation continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(Object obj) {
            this.f1796m = obj;
            this.f1798o |= IntCompanionObject.MIN_VALUE;
            return g.this.j(null, this);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class d extends ContinuationImpl {

        /* renamed from: j, reason: collision with root package name */
        public Object f1799j;

        /* renamed from: k, reason: collision with root package name */
        public Object f1800k;

        /* renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f1801l;

        /* renamed from: n, reason: collision with root package name */
        public int f1803n;

        public d(Continuation continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(Object obj) {
            this.f1801l = obj;
            this.f1803n |= IntCompanionObject.MIN_VALUE;
            return g.this.l(this);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class e implements Comparator {
        public e() {
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            String padStart;
            String padStart2;
            File file = (File) obj;
            Intrinsics.checkNotNull(file);
            String replace$default = StringsKt.replace$default(FilesKt.getNameWithoutExtension(file), g.this.f1781b + '-', "", false, 4, (Object) null);
            int indexOf$default = StringsKt.indexOf$default(replace$default, '-', 0, false, 6, (Object) null);
            if (indexOf$default >= 0) {
                StringBuilder sb = new StringBuilder();
                String substring = replace$default.substring(0, indexOf$default);
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                sb.append(StringsKt.padStart(substring, 10, '0'));
                String substring2 = replace$default.substring(indexOf$default);
                Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                sb.append(substring2);
                padStart = sb.toString();
            } else {
                padStart = StringsKt.padStart(replace$default, 10, '0');
            }
            File file2 = (File) obj2;
            Intrinsics.checkNotNull(file2);
            String replace$default2 = StringsKt.replace$default(FilesKt.getNameWithoutExtension(file2), g.this.f1781b + '-', "", false, 4, (Object) null);
            int indexOf$default2 = StringsKt.indexOf$default(replace$default2, '-', 0, false, 6, (Object) null);
            if (indexOf$default2 >= 0) {
                StringBuilder sb2 = new StringBuilder();
                String substring3 = replace$default2.substring(0, indexOf$default2);
                Intrinsics.checkNotNullExpressionValue(substring3, "substring(...)");
                sb2.append(StringsKt.padStart(substring3, 10, '0'));
                String substring4 = replace$default2.substring(indexOf$default2);
                Intrinsics.checkNotNullExpressionValue(substring4, "substring(...)");
                sb2.append(substring4);
                padStart2 = sb2.toString();
            } else {
                padStart2 = StringsKt.padStart(replace$default2, 10, '0');
            }
            return ComparisonsKt.compareValues(padStart, padStart2);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class f extends ContinuationImpl {

        /* renamed from: j, reason: collision with root package name */
        public Object f1805j;

        /* renamed from: k, reason: collision with root package name */
        public Object f1806k;

        /* renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f1807l;

        /* renamed from: n, reason: collision with root package name */
        public int f1809n;

        public f(Continuation continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(Object obj) {
            this.f1807l = obj;
            this.f1809n |= IntCompanionObject.MIN_VALUE;
            return g.this.u(this);
        }
    }

    /* renamed from: G3.g$g, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class C0036g extends ContinuationImpl {

        /* renamed from: j, reason: collision with root package name */
        public Object f1810j;

        /* renamed from: k, reason: collision with root package name */
        public Object f1811k;

        /* renamed from: l, reason: collision with root package name */
        public Object f1812l;

        /* renamed from: m, reason: collision with root package name */
        public /* synthetic */ Object f1813m;

        /* renamed from: o, reason: collision with root package name */
        public int f1815o;

        public C0036g(Continuation continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(Object obj) {
            this.f1813m = obj;
            this.f1815o |= IntCompanionObject.MIN_VALUE;
            return g.this.w(null, this);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class h extends Lambda implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final h f1816a = new h();

        public h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(JSONObject it) {
            Intrinsics.checkNotNullParameter(it, "it");
            String jSONObject = it.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
            return StringsKt.replace$default(jSONObject, "\u0000", "", false, 4, (Object) null);
        }
    }

    public g(File directory, String storageKey, K3.b kvs, InterfaceC2355a logger, G3.c diagnostics) {
        Object putIfAbsent;
        Object putIfAbsent2;
        Intrinsics.checkNotNullParameter(directory, "directory");
        Intrinsics.checkNotNullParameter(storageKey, "storageKey");
        Intrinsics.checkNotNullParameter(kvs, "kvs");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(diagnostics, "diagnostics");
        this.f1780a = directory;
        this.f1781b = storageKey;
        this.f1782c = kvs;
        this.f1783d = logger;
        this.f1784e = diagnostics;
        this.f1785f = "amplitude.events.file.index." + storageKey;
        this.f1786g = "amplitude.events.file.version." + storageKey;
        Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        Intrinsics.checkNotNullExpressionValue(newSetFromMap, "newSetFromMap(...)");
        this.f1787h = newSetFromMap;
        this.f1788i = new ConcurrentHashMap();
        ConcurrentHashMap concurrentHashMap = f1778m;
        Object obj = concurrentHashMap.get(storageKey);
        if (obj == null && (putIfAbsent2 = concurrentHashMap.putIfAbsent(storageKey, (obj = pa.c.b(false, 1, (Object) null)))) != null) {
            obj = putIfAbsent2;
        }
        this.f1789j = (pa.a) obj;
        ConcurrentHashMap concurrentHashMap2 = f1779n;
        Object obj2 = concurrentHashMap2.get(storageKey);
        if (obj2 == null && (putIfAbsent = concurrentHashMap2.putIfAbsent(storageKey, (obj2 = pa.c.b(false, 1, (Object) null)))) != null) {
            obj2 = putIfAbsent;
        }
        this.f1790k = (pa.a) obj2;
        k();
        ga.i.f((CoroutineContext) null, new a(null), 1, (Object) null);
    }

    public static final boolean h(g this_run, File file, String str) {
        Intrinsics.checkNotNullParameter(this_run, "$this_run");
        Intrinsics.checkNotNull(str);
        return StringsKt.contains$default(str, this_run.f1781b, false, 2, (Object) null) && StringsKt.endsWith$default(str, ".tmp", false, 2, (Object) null);
    }

    public static final boolean m(g this$0, File file, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(str);
        return StringsKt.contains$default(str, this$0.f1781b, false, 2, (Object) null) && !StringsKt.endsWith$default(str, ".properties", false, 2, (Object) null);
    }

    public static final boolean p(g this$0, File file, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(str);
        return (!StringsKt.contains$default(str, this$0.f1781b, false, 2, (Object) null) || StringsKt.endsWith$default(str, ".tmp", false, 2, (Object) null) || StringsKt.endsWith$default(str, ".properties", false, 2, (Object) null)) ? false : true;
    }

    public static /* synthetic */ void y(g gVar, List list, File file, boolean z6, int i6, Object obj) {
        if ((i6 & 4) != 0) {
            z6 = true;
        }
        gVar.x(list, file, z6);
    }

    public final void f() {
        this.f1782c.a(this.f1785f);
        this.f1782c.a(this.f1786g);
    }

    public final File g() {
        File file = (File) this.f1788i.get(this.f1781b);
        if (file == null) {
            File[] listFiles = this.f1780a.listFiles(new FilenameFilter() { // from class: G3.e
                @Override // java.io.FilenameFilter
                public final boolean accept(File file2, String str) {
                    boolean h6;
                    h6 = g.h(g.this, file2, str);
                    return h6;
                }
            });
            if (listFiles == null) {
                listFiles = new File[0];
            }
            file = (File) ArraysKt.getOrNull(listFiles, 0);
        }
        long j6 = this.f1782c.getLong(this.f1785f, 0L);
        Map map = this.f1788i;
        String str = this.f1781b;
        if (file == null) {
            file = new File(this.f1780a, this.f1781b + '-' + j6 + ".tmp");
        }
        map.put(str, file);
        Object obj = this.f1788i.get(this.f1781b);
        Intrinsics.checkNotNull(obj);
        return (File) obj;
    }

    public final void i(File file) {
        if (file == null) {
            return;
        }
        s(file);
        n();
        t();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006c A[Catch: all -> 0x0073, TRY_ENTER, TryCatch #1 {all -> 0x0073, blocks: (B:11:0x0062, B:14:0x006c, B:18:0x0076, B:40:0x015e, B:54:0x0167, B:55:0x016a, B:20:0x0093, B:22:0x009e, B:23:0x00b6, B:25:0x00bc, B:28:0x00c8, B:32:0x00d5, B:36:0x00f1, B:38:0x00f7, B:39:0x00fb, B:41:0x00ff, B:43:0x0127, B:46:0x0137, B:51:0x0165), top: B:10:0x0062, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0076 A[Catch: all -> 0x0073, TRY_LEAVE, TryCatch #1 {all -> 0x0073, blocks: (B:11:0x0062, B:14:0x006c, B:18:0x0076, B:40:0x015e, B:54:0x0167, B:55:0x016a, B:20:0x0093, B:22:0x009e, B:23:0x00b6, B:25:0x00bc, B:28:0x00c8, B:32:0x00d5, B:36:0x00f1, B:38:0x00f7, B:39:0x00fb, B:41:0x00ff, B:43:0x0127, B:46:0x0137, B:51:0x0165), top: B:10:0x0062, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(java.lang.String r18, kotlin.coroutines.Continuation r19) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: G3.g.j(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean k() {
        try {
            K3.a.a(this.f1780a);
            return true;
        } catch (IOException e6) {
            this.f1784e.a("Failed to create directory: " + e6.getMessage());
            this.f1783d.a("Failed to create directory for events storage: " + this.f1780a.getPath());
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064 A[Catch: all -> 0x0075, TryCatch #1 {all -> 0x0075, blocks: (B:11:0x0054, B:14:0x012a, B:19:0x0064, B:21:0x0072, B:22:0x0078, B:24:0x0081, B:26:0x0089, B:28:0x008c, B:31:0x008e, B:32:0x0092, B:34:0x0098, B:37:0x00ad, B:39:0x00d5, B:44:0x00ed, B:48:0x00f1, B:52:0x0121), top: B:10:0x0054, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(kotlin.coroutines.Continuation r12) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: G3.g.l(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean n() {
        return this.f1782c.putLong(this.f1785f, this.f1782c.getLong(this.f1785f, 0L) + 1);
    }

    public final List o() {
        File[] listFiles = this.f1780a.listFiles(new FilenameFilter() { // from class: G3.d
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                boolean p6;
                p6 = g.p(g.this, file, str);
                return p6;
            }
        });
        if (listFiles == null) {
            listFiles = new File[0];
        }
        List sortedWith = ArraysKt.sortedWith(listFiles, new e());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(sortedWith, 10));
        Iterator it = sortedWith.iterator();
        while (it.hasNext()) {
            arrayList.add(((File) it.next()).getAbsolutePath());
        }
        return arrayList;
    }

    public final void q(String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        this.f1787h.remove(filePath);
    }

    public final boolean r(String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        this.f1787h.remove(filePath);
        return new File(filePath).delete();
    }

    public final void s(File file) {
        if (!file.exists() || FilesKt.getExtension(file).length() == 0) {
            return;
        }
        String nameWithoutExtension = FilesKt.getNameWithoutExtension(file);
        File file2 = new File(this.f1780a, nameWithoutExtension);
        if (!file2.exists()) {
            file.renameTo(new File(this.f1780a, FilesKt.getNameWithoutExtension(file)));
            return;
        }
        this.f1783d.b("File already exists: " + file2 + ", handle gracefully.");
        file.renameTo(new File(this.f1780a, nameWithoutExtension + '-' + System.currentTimeMillis() + '-' + new Random().nextInt(1000)));
    }

    public final void t() {
        this.f1788i.remove(this.f1781b);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(kotlin.coroutines.Continuation r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof G3.g.f
            if (r0 == 0) goto L13
            r0 = r8
            G3.g$f r0 = (G3.g.f) r0
            int r1 = r0.f1809n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1809n = r1
            goto L18
        L13:
            G3.g$f r0 = new G3.g$f
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f1807l
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f1809n
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r1 = r0.f1806k
            pa.a r1 = (pa.a) r1
            java.lang.Object r0 = r0.f1805j
            G3.g r0 = (G3.g) r0
            kotlin.ResultKt.throwOnFailure(r8)
            goto L53
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3a:
            kotlin.ResultKt.throwOnFailure(r8)
            pa.a r8 = r7.f1789j
            java.lang.String r2 = "writeMutex"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r2)
            r0.f1805j = r7
            r0.f1806k = r8
            r0.f1809n = r3
            java.lang.Object r0 = r8.e(r4, r0)
            if (r0 != r1) goto L51
            return r1
        L51:
            r0 = r7
            r1 = r8
        L53:
            java.io.File r8 = r0.g()     // Catch: java.lang.Throwable -> L6b
            boolean r2 = r8.exists()     // Catch: java.lang.Throwable -> L6b
            if (r2 == 0) goto L6d
            long r2 = r8.length()     // Catch: java.lang.Throwable -> L6b
            r5 = 0
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 <= 0) goto L6d
            r0.i(r8)     // Catch: java.lang.Throwable -> L6b
            goto L6d
        L6b:
            r8 = move-exception
            goto L73
        L6d:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L6b
            r1.f(r4)
            return r8
        L73:
            r1.f(r4)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: G3.g.u(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void v(String filePath, JSONArray events) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(events, "events");
        File file = new File(filePath);
        if (file.exists()) {
            String name = file.getName();
            File file2 = new File(this.f1780a, name + "-1.tmp");
            File file3 = new File(this.f1780a, name + "-2.tmp");
            Pair f6 = p.f(events);
            y(this, (List) f6.getFirst(), file2, false, 4, null);
            y(this, (List) f6.getSecond(), file3, false, 4, null);
            r(filePath);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064 A[Catch: all -> 0x0074, TRY_LEAVE, TryCatch #2 {all -> 0x0074, blocks: (B:11:0x005c, B:14:0x0122, B:19:0x0064, B:23:0x0070, B:28:0x00ab, B:30:0x00b6, B:33:0x00c3, B:38:0x00c8, B:41:0x00f9, B:26:0x0079), top: B:10:0x005c, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(java.lang.String r12, kotlin.coroutines.Continuation r13) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: G3.g.w(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void x(List list, File file, boolean z6) {
        try {
            String joinToString$default = CollectionsKt.joinToString$default(list, "\u0000", (CharSequence) null, "\u0000", 0, (CharSequence) null, h.f1816a, 26, (Object) null);
            file.createNewFile();
            byte[] bytes = joinToString$default.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            z(bytes, file, z6);
            s(file);
        } catch (IOException e6) {
            this.f1784e.a("Failed to create or write to split file: " + e6.getMessage());
            this.f1783d.a("Failed to create or write to split file: " + file.getPath());
        } catch (Exception e7) {
            this.f1784e.a("Failed to write to split file: " + e7.getMessage());
            this.f1783d.a("Failed to write to split file: " + file.getPath() + " for error: " + e7.getMessage());
        }
    }

    public final void z(byte[] bArr, File file, boolean z6) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file, z6);
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.flush();
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(fileOutputStream, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(fileOutputStream, th);
                    throw th2;
                }
            }
        } catch (FileNotFoundException e6) {
            this.f1784e.a("Error writing to file: " + e6.getMessage());
            this.f1783d.a("File not found: " + file.getPath());
        } catch (IOException e7) {
            this.f1784e.a("Error writing to file: " + e7.getMessage());
            this.f1783d.a("Failed to write to file: " + file.getPath());
        } catch (SecurityException e8) {
            this.f1784e.a("Error writing to file: " + e8.getMessage());
            this.f1783d.a("Security exception when saving event: " + e8.getMessage());
        } catch (Exception e9) {
            this.f1784e.a("Error writing to file: " + e9.getMessage());
            this.f1783d.a("Failed to write to file: " + file.getPath());
        }
    }
}
