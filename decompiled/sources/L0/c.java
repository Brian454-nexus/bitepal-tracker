package L0;

import android.content.Context;
import ga.J;
import java.io.File;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class c implements ReadOnlyProperty {

    /* renamed from: a, reason: collision with root package name */
    public final String f3085a;

    /* renamed from: b, reason: collision with root package name */
    public final J0.b f3086b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f3087c;

    /* renamed from: d, reason: collision with root package name */
    public final J f3088d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f3089e;

    /* renamed from: f, reason: collision with root package name */
    public volatile I0.h f3090f;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a extends Lambda implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f3091a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f3092b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, c cVar) {
            super(0);
            this.f3091a = context;
            this.f3092b = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            Context applicationContext = this.f3091a;
            Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
            return b.a(applicationContext, this.f3092b.f3085a);
        }
    }

    public c(String name, J0.b bVar, Function1 produceMigrations, J scope) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(produceMigrations, "produceMigrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f3085a = name;
        this.f3086b = bVar;
        this.f3087c = produceMigrations;
        this.f3088d = scope;
        this.f3089e = new Object();
    }

    @Override // kotlin.properties.ReadOnlyProperty
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public I0.h getValue(Context thisRef, KProperty property) {
        I0.h hVar;
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        I0.h hVar2 = this.f3090f;
        if (hVar2 != null) {
            return hVar2;
        }
        synchronized (this.f3089e) {
            try {
                if (this.f3090f == null) {
                    Context applicationContext = thisRef.getApplicationContext();
                    M0.e eVar = M0.e.f3370a;
                    J0.b bVar = this.f3086b;
                    Function1 function1 = this.f3087c;
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
                    this.f3090f = eVar.b(bVar, (List) function1.invoke(applicationContext), this.f3088d, new a(applicationContext, this));
                }
                hVar = this.f3090f;
                Intrinsics.checkNotNull(hVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar;
    }
}
