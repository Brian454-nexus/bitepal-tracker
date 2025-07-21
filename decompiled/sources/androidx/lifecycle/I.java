package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.N;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class I extends N.d implements N.b {

    /* renamed from: b, reason: collision with root package name */
    public Application f8996b;

    /* renamed from: c, reason: collision with root package name */
    public final N.b f8997c;

    /* renamed from: d, reason: collision with root package name */
    public Bundle f8998d;

    /* renamed from: e, reason: collision with root package name */
    public AbstractC1057i f8999e;

    /* renamed from: f, reason: collision with root package name */
    public y2.d f9000f;

    public I(Application application, y2.f owner, Bundle bundle) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f9000f = owner.getSavedStateRegistry();
        this.f8999e = owner.getLifecycle();
        this.f8998d = bundle;
        this.f8996b = application;
        this.f8997c = application != null ? N.a.f9015f.a(application) : new N.a();
    }

    @Override // androidx.lifecycle.N.b
    public M a(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return d(canonicalName, modelClass);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.N.b
    public M b(Class modelClass, U0.a extras) {
        List list;
        Constructor c6;
        List list2;
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        String str = (String) extras.a(N.c.f9024d);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (extras.a(F.f8987a) == null || extras.a(F.f8988b) == null) {
            if (this.f8999e != null) {
                return d(str, modelClass);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) extras.a(N.a.f9017h);
        boolean isAssignableFrom = AbstractC1049a.class.isAssignableFrom(modelClass);
        if (!isAssignableFrom || application == null) {
            list = J.f9002b;
            c6 = J.c(modelClass, list);
        } else {
            list2 = J.f9001a;
            c6 = J.c(modelClass, list2);
        }
        return c6 == null ? this.f8997c.b(modelClass, extras) : (!isAssignableFrom || application == null) ? J.d(modelClass, c6, F.a(extras)) : J.d(modelClass, c6, application, F.a(extras));
    }

    @Override // androidx.lifecycle.N.d
    public void c(M viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        if (this.f8999e != null) {
            y2.d dVar = this.f9000f;
            Intrinsics.checkNotNull(dVar);
            AbstractC1057i abstractC1057i = this.f8999e;
            Intrinsics.checkNotNull(abstractC1057i);
            C1056h.a(viewModel, dVar, abstractC1057i);
        }
    }

    public final M d(String key, Class modelClass) {
        List list;
        Constructor c6;
        M d6;
        Application application;
        List list2;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        AbstractC1057i abstractC1057i = this.f8999e;
        if (abstractC1057i == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean isAssignableFrom = AbstractC1049a.class.isAssignableFrom(modelClass);
        if (!isAssignableFrom || this.f8996b == null) {
            list = J.f9002b;
            c6 = J.c(modelClass, list);
        } else {
            list2 = J.f9001a;
            c6 = J.c(modelClass, list2);
        }
        if (c6 == null) {
            return this.f8996b != null ? this.f8997c.a(modelClass) : N.c.f9022b.a().a(modelClass);
        }
        y2.d dVar = this.f9000f;
        Intrinsics.checkNotNull(dVar);
        E b6 = C1056h.b(dVar, abstractC1057i, key, this.f8998d);
        if (!isAssignableFrom || (application = this.f8996b) == null) {
            d6 = J.d(modelClass, c6, b6.b());
        } else {
            Intrinsics.checkNotNull(application);
            d6 = J.d(modelClass, c6, application, b6.b());
        }
        d6.e("androidx.lifecycle.savedstate.vm.tag", b6);
        return d6;
    }
}
