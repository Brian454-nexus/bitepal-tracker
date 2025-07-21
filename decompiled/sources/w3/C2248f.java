package w3;

import B3.f;
import G3.j;
import H3.i;
import android.content.SharedPreferences;
import ga.G;
import ga.J;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import y3.InterfaceC2355a;

/* renamed from: w3.f, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C2248f implements B3.f, G3.h {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2355a f20165a;

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f20166b;

    /* renamed from: c, reason: collision with root package name */
    public final G3.g f20167c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f20168d;

    /* renamed from: w3.f$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a extends ContinuationImpl {

        /* renamed from: j, reason: collision with root package name */
        public Object f20169j;

        /* renamed from: k, reason: collision with root package name */
        public Object f20170k;

        /* renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f20171l;

        /* renamed from: n, reason: collision with root package name */
        public int f20173n;

        public a(Continuation continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(Object obj) {
            this.f20171l = obj;
            this.f20173n |= IntCompanionObject.MIN_VALUE;
            return C2248f.this.d(null, this);
        }
    }

    public C2248f(String storageKey, InterfaceC2355a logger, SharedPreferences sharedPreferences, File storageDirectory, G3.c diagnostics) {
        Intrinsics.checkNotNullParameter(storageKey, "storageKey");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(storageDirectory, "storageDirectory");
        Intrinsics.checkNotNullParameter(diagnostics, "diagnostics");
        this.f20165a = logger;
        this.f20166b = sharedPreferences;
        this.f20167c = new G3.g(storageDirectory, storageKey, new x3.d(sharedPreferences), logger, diagnostics);
        this.f20168d = new LinkedHashMap();
    }

    @Override // B3.f
    public List a() {
        return this.f20167c.o();
    }

    @Override // B3.f
    public Object b(Object obj, Continuation continuation) {
        G3.g gVar = this.f20167c;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
        return gVar.j((String) obj, continuation);
    }

    @Override // B3.f
    public Object c(Continuation continuation) {
        Object u6 = this.f20167c.u(continuation);
        return u6 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? u6 : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // B3.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(C3.a r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof w3.C2248f.a
            if (r0 == 0) goto L13
            r0 = r6
            w3.f$a r0 = (w3.C2248f.a) r0
            int r1 = r0.f20173n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20173n = r1
            goto L18
        L13:
            w3.f$a r0 = new w3.f$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f20171l
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f20173n
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.f20170k
            C3.a r5 = (C3.a) r5
            java.lang.Object r0 = r0.f20169j
            w3.f r0 = (w3.C2248f) r0
            kotlin.ResultKt.throwOnFailure(r6)
            goto L52
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            kotlin.ResultKt.throwOnFailure(r6)
            G3.g r6 = r4.f20167c
            G3.o r2 = G3.o.f1895a
            java.lang.String r2 = r2.b(r5)
            r0.f20169j = r4
            r0.f20170k = r5
            r0.f20173n = r3
            java.lang.Object r6 = r6.w(r2, r0)
            if (r6 != r1) goto L51
            return r1
        L51:
            r0 = r4
        L52:
            kotlin.jvm.functions.Function3 r6 = r5.f()
            if (r6 == 0) goto L66
            java.lang.String r5 = r5.u()
            if (r5 == 0) goto L66
            java.util.Map r0 = r0.f20168d
            java.lang.Object r5 = r0.put(r5, r6)
            kotlin.jvm.functions.Function3 r5 = (kotlin.jvm.functions.Function3) r5
        L66:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: w3.C2248f.d(C3.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // G3.h
    public void e(String insertId) {
        Intrinsics.checkNotNullParameter(insertId, "insertId");
        this.f20168d.remove(insertId);
    }

    @Override // B3.f
    public String f(f.a key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f20166b.getString(key.b(), null);
    }

    @Override // G3.h
    public void g(String filePath, JSONArray events) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(events, "events");
        this.f20167c.v(filePath, events);
    }

    @Override // G3.h
    public Function3 h(String insertId) {
        Intrinsics.checkNotNullParameter(insertId, "insertId");
        return (Function3) this.f20168d.get(insertId);
    }

    @Override // G3.h
    public boolean i(String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        return this.f20167c.r(filePath);
    }

    @Override // B3.f
    public Object j(f.a aVar, String str, Continuation continuation) {
        SharedPreferences.Editor edit = this.f20166b.edit();
        edit.putString(aVar.b(), str);
        edit.apply();
        return Unit.INSTANCE;
    }

    @Override // B3.f
    public i k(D3.b eventPipeline, B3.b configuration, J scope, G storageDispatcher) {
        Intrinsics.checkNotNullParameter(eventPipeline, "eventPipeline");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(storageDispatcher, "storageDispatcher");
        return new j(this, eventPipeline, configuration, scope, storageDispatcher, this.f20165a);
    }

    @Override // G3.h
    public void l(String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        this.f20167c.q(filePath);
    }

    public final void m() {
        this.f20167c.f();
    }

    public Object n(f.a aVar, Continuation continuation) {
        SharedPreferences.Editor edit = this.f20166b.edit();
        edit.remove(aVar.b());
        edit.apply();
        return Unit.INSTANCE;
    }
}
