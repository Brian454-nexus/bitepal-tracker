package P0;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.core.app.a;
import androidx.lifecycle.AbstractC1057i;
import androidx.lifecycle.C1062n;
import e.AbstractActivityC1216j;
import f.InterfaceC1282b;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import y0.InterfaceC2343a;
import y2.d;
import z0.InterfaceC2428n;
import z0.InterfaceC2431q;

/* renamed from: P0.u, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractActivityC0712u extends AbstractActivityC1216j implements a.d {
    boolean mCreated;
    boolean mResumed;
    final C0716y mFragments = C0716y.b(new a());
    final C1062n mFragmentLifecycleRegistry = new C1062n(this);
    boolean mStopped = true;

    /* renamed from: P0.u$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a extends A implements n0.c, n0.d, androidx.core.app.r, androidx.core.app.s, androidx.lifecycle.Q, e.y, g.f, y2.f, M, InterfaceC2428n {
        public a() {
            super(AbstractActivityC0712u.this);
        }

        @Override // P0.M
        public void a(I i6, AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p) {
            AbstractActivityC0712u.this.onAttachFragment(abstractComponentCallbacksC0708p);
        }

        @Override // z0.InterfaceC2428n
        public void addMenuProvider(InterfaceC2431q interfaceC2431q) {
            AbstractActivityC0712u.this.addMenuProvider(interfaceC2431q);
        }

        @Override // n0.c
        public void addOnConfigurationChangedListener(InterfaceC2343a interfaceC2343a) {
            AbstractActivityC0712u.this.addOnConfigurationChangedListener(interfaceC2343a);
        }

        @Override // androidx.core.app.r
        public void addOnMultiWindowModeChangedListener(InterfaceC2343a interfaceC2343a) {
            AbstractActivityC0712u.this.addOnMultiWindowModeChangedListener(interfaceC2343a);
        }

        @Override // androidx.core.app.s
        public void addOnPictureInPictureModeChangedListener(InterfaceC2343a interfaceC2343a) {
            AbstractActivityC0712u.this.addOnPictureInPictureModeChangedListener(interfaceC2343a);
        }

        @Override // n0.d
        public void addOnTrimMemoryListener(InterfaceC2343a interfaceC2343a) {
            AbstractActivityC0712u.this.addOnTrimMemoryListener(interfaceC2343a);
        }

        @Override // P0.AbstractC0714w
        public View c(int i6) {
            return AbstractActivityC0712u.this.findViewById(i6);
        }

        @Override // P0.AbstractC0714w
        public boolean d() {
            Window window = AbstractActivityC0712u.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // g.f
        public g.e getActivityResultRegistry() {
            return AbstractActivityC0712u.this.getActivityResultRegistry();
        }

        @Override // androidx.lifecycle.InterfaceC1061m
        public AbstractC1057i getLifecycle() {
            return AbstractActivityC0712u.this.mFragmentLifecycleRegistry;
        }

        @Override // e.y
        public e.w getOnBackPressedDispatcher() {
            return AbstractActivityC0712u.this.getOnBackPressedDispatcher();
        }

        @Override // y2.f
        public y2.d getSavedStateRegistry() {
            return AbstractActivityC0712u.this.getSavedStateRegistry();
        }

        @Override // androidx.lifecycle.Q
        public androidx.lifecycle.P getViewModelStore() {
            return AbstractActivityC0712u.this.getViewModelStore();
        }

        @Override // P0.A
        public void i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            AbstractActivityC0712u.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // P0.A
        public LayoutInflater k() {
            return AbstractActivityC0712u.this.getLayoutInflater().cloneInContext(AbstractActivityC0712u.this);
        }

        @Override // P0.A
        public void m() {
            n();
        }

        public void n() {
            AbstractActivityC0712u.this.invalidateMenu();
        }

        @Override // P0.A
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public AbstractActivityC0712u j() {
            return AbstractActivityC0712u.this;
        }

        @Override // z0.InterfaceC2428n
        public void removeMenuProvider(InterfaceC2431q interfaceC2431q) {
            AbstractActivityC0712u.this.removeMenuProvider(interfaceC2431q);
        }

        @Override // n0.c
        public void removeOnConfigurationChangedListener(InterfaceC2343a interfaceC2343a) {
            AbstractActivityC0712u.this.removeOnConfigurationChangedListener(interfaceC2343a);
        }

        @Override // androidx.core.app.r
        public void removeOnMultiWindowModeChangedListener(InterfaceC2343a interfaceC2343a) {
            AbstractActivityC0712u.this.removeOnMultiWindowModeChangedListener(interfaceC2343a);
        }

        @Override // androidx.core.app.s
        public void removeOnPictureInPictureModeChangedListener(InterfaceC2343a interfaceC2343a) {
            AbstractActivityC0712u.this.removeOnPictureInPictureModeChangedListener(interfaceC2343a);
        }

        @Override // n0.d
        public void removeOnTrimMemoryListener(InterfaceC2343a interfaceC2343a) {
            AbstractActivityC0712u.this.removeOnTrimMemoryListener(interfaceC2343a);
        }
    }

    public AbstractActivityC0712u() {
        u();
    }

    public static /* synthetic */ Bundle s(AbstractActivityC0712u abstractActivityC0712u) {
        abstractActivityC0712u.markFragmentsCreated();
        abstractActivityC0712u.mFragmentLifecycleRegistry.h(AbstractC1057i.a.ON_STOP);
        return new Bundle();
    }

    public static boolean v(I i6, AbstractC1057i.b bVar) {
        boolean z6 = false;
        for (AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p : i6.u0()) {
            if (abstractComponentCallbacksC0708p != null) {
                if (abstractComponentCallbacksC0708p.getHost() != null) {
                    z6 |= v(abstractComponentCallbacksC0708p.getChildFragmentManager(), bVar);
                }
                V v6 = abstractComponentCallbacksC0708p.mViewLifecycleOwner;
                if (v6 != null && v6.getLifecycle().b().b(AbstractC1057i.b.STARTED)) {
                    abstractComponentCallbacksC0708p.mViewLifecycleOwner.f(bVar);
                    z6 = true;
                }
                if (abstractComponentCallbacksC0708p.mLifecycleRegistry.b().b(AbstractC1057i.b.STARTED)) {
                    abstractComponentCallbacksC0708p.mLifecycleRegistry.m(bVar);
                    z6 = true;
                }
            }
        }
        return z6;
    }

    public final View dispatchFragmentsOnCreateView(View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        return this.mFragments.n(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(@NonNull String str, FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.mCreated);
            printWriter.print(" mResumed=");
            printWriter.print(this.mResumed);
            printWriter.print(" mStopped=");
            printWriter.print(this.mStopped);
            if (getApplication() != null) {
                V0.a.b(this).a(str2, fileDescriptor, printWriter, strArr);
            }
            this.mFragments.l().W(str, fileDescriptor, printWriter, strArr);
        }
    }

    @NonNull
    public I getSupportFragmentManager() {
        return this.mFragments.l();
    }

    @NonNull
    @Deprecated
    public V0.a getSupportLoaderManager() {
        return V0.a.b(this);
    }

    public void markFragmentsCreated() {
        do {
        } while (v(getSupportFragmentManager(), AbstractC1057i.b.CREATED));
    }

    @Override // e.AbstractActivityC1216j, android.app.Activity
    public void onActivityResult(int i6, int i7, Intent intent) {
        this.mFragments.m();
        super.onActivityResult(i6, i7, intent);
    }

    @Deprecated
    public void onAttachFragment(@NonNull AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p) {
    }

    @Override // e.AbstractActivityC1216j, androidx.core.app.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.h(AbstractC1057i.a.ON_CREATE);
        this.mFragments.e();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.f();
        this.mFragmentLifecycleRegistry.h(AbstractC1057i.a.ON_DESTROY);
    }

    @Override // e.AbstractActivityC1216j, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i6, @NonNull MenuItem menuItem) {
        if (super.onMenuItemSelected(i6, menuItem)) {
            return true;
        }
        if (i6 == 6) {
            return this.mFragments.d(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.g();
        this.mFragmentLifecycleRegistry.h(AbstractC1057i.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // e.AbstractActivityC1216j, android.app.Activity
    public void onRequestPermissionsResult(int i6, @NonNull String[] strArr, @NonNull int[] iArr) {
        this.mFragments.m();
        super.onRequestPermissionsResult(i6, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.m();
        super.onResume();
        this.mResumed = true;
        this.mFragments.k();
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.h(AbstractC1057i.a.ON_RESUME);
        this.mFragments.h();
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.m();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.c();
        }
        this.mFragments.k();
        this.mFragmentLifecycleRegistry.h(AbstractC1057i.a.ON_START);
        this.mFragments.i();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.m();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.j();
        this.mFragmentLifecycleRegistry.h(AbstractC1057i.a.ON_STOP);
    }

    public final void u() {
        getSavedStateRegistry().h("android:support:lifecycle", new d.c() { // from class: P0.q
            @Override // y2.d.c
            public final Bundle a() {
                return AbstractActivityC0712u.s(AbstractActivityC0712u.this);
            }
        });
        addOnConfigurationChangedListener(new InterfaceC2343a() { // from class: P0.r
            @Override // y0.InterfaceC2343a
            public final void accept(Object obj) {
                AbstractActivityC0712u.this.mFragments.m();
            }
        });
        addOnNewIntentListener(new InterfaceC2343a() { // from class: P0.s
            @Override // y0.InterfaceC2343a
            public final void accept(Object obj) {
                AbstractActivityC0712u.this.mFragments.m();
            }
        });
        addOnContextAvailableListener(new InterfaceC1282b() { // from class: P0.t
            @Override // f.InterfaceC1282b
            public final void a(Context context) {
                AbstractActivityC0712u.this.mFragments.a(null);
            }
        });
    }

    @Override // androidx.core.app.a.d
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i6) {
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(@NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }
}
