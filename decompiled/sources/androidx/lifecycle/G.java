package androidx.lifecycle;

import android.os.Bundle;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import y2.d;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class G implements d.c {

    /* renamed from: a, reason: collision with root package name */
    public final y2.d f8990a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8991b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f8992c;

    /* renamed from: d, reason: collision with root package name */
    public final Lazy f8993d;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a extends Lambda implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Q f8994a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Q q6) {
            super(0);
            this.f8994a = q6;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final H invoke() {
            return F.e(this.f8994a);
        }
    }

    public G(y2.d savedStateRegistry, Q viewModelStoreOwner) {
        Intrinsics.checkNotNullParameter(savedStateRegistry, "savedStateRegistry");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
        this.f8990a = savedStateRegistry;
        this.f8993d = LazyKt.lazy(new a(viewModelStoreOwner));
    }

    @Override // y2.d.c
    public Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f8992c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : c().f().entrySet()) {
            String str = (String) entry.getKey();
            Bundle a6 = ((C) entry.getValue()).c().a();
            if (!Intrinsics.areEqual(a6, Bundle.EMPTY)) {
                bundle.putBundle(str, a6);
            }
        }
        this.f8991b = false;
        return bundle;
    }

    public final Bundle b(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        d();
        Bundle bundle = this.f8992c;
        Bundle bundle2 = bundle != null ? bundle.getBundle(key) : null;
        Bundle bundle3 = this.f8992c;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        Bundle bundle4 = this.f8992c;
        if (bundle4 != null && bundle4.isEmpty()) {
            this.f8992c = null;
        }
        return bundle2;
    }

    public final H c() {
        return (H) this.f8993d.getValue();
    }

    public final void d() {
        if (this.f8991b) {
            return;
        }
        Bundle b6 = this.f8990a.b("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f8992c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (b6 != null) {
            bundle.putAll(b6);
        }
        this.f8992c = bundle;
        this.f8991b = true;
        c();
    }
}
