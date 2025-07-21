package P0;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.InterfaceC1061m;

/* renamed from: P0.n, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class DialogInterfaceOnCancelListenerC0706n extends AbstractComponentCallbacksC0708p implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public Handler f4223a;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4232j;

    /* renamed from: l, reason: collision with root package name */
    public Dialog f4234l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4235m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4236n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f4237o;

    /* renamed from: b, reason: collision with root package name */
    public Runnable f4224b = new a();

    /* renamed from: c, reason: collision with root package name */
    public DialogInterface.OnCancelListener f4225c = new b();

    /* renamed from: d, reason: collision with root package name */
    public DialogInterface.OnDismissListener f4226d = new c();

    /* renamed from: e, reason: collision with root package name */
    public int f4227e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f4228f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4229g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4230h = true;

    /* renamed from: i, reason: collision with root package name */
    public int f4231i = -1;

    /* renamed from: k, reason: collision with root package name */
    public androidx.lifecycle.u f4233k = new d();

    /* renamed from: p, reason: collision with root package name */
    public boolean f4238p = false;

    /* renamed from: P0.n$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DialogInterfaceOnCancelListenerC0706n.this.f4226d.onDismiss(DialogInterfaceOnCancelListenerC0706n.this.f4234l);
        }
    }

    /* renamed from: P0.n$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class b implements DialogInterface.OnCancelListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            if (DialogInterfaceOnCancelListenerC0706n.this.f4234l != null) {
                DialogInterfaceOnCancelListenerC0706n dialogInterfaceOnCancelListenerC0706n = DialogInterfaceOnCancelListenerC0706n.this;
                dialogInterfaceOnCancelListenerC0706n.onCancel(dialogInterfaceOnCancelListenerC0706n.f4234l);
            }
        }
    }

    /* renamed from: P0.n$c */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class c implements DialogInterface.OnDismissListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (DialogInterfaceOnCancelListenerC0706n.this.f4234l != null) {
                DialogInterfaceOnCancelListenerC0706n dialogInterfaceOnCancelListenerC0706n = DialogInterfaceOnCancelListenerC0706n.this;
                dialogInterfaceOnCancelListenerC0706n.onDismiss(dialogInterfaceOnCancelListenerC0706n.f4234l);
            }
        }
    }

    /* renamed from: P0.n$d */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class d implements androidx.lifecycle.u {
        public d() {
        }

        @Override // androidx.lifecycle.u
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(InterfaceC1061m interfaceC1061m) {
            if (interfaceC1061m == null || !DialogInterfaceOnCancelListenerC0706n.this.f4230h) {
                return;
            }
            View requireView = DialogInterfaceOnCancelListenerC0706n.this.requireView();
            if (requireView.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            if (DialogInterfaceOnCancelListenerC0706n.this.f4234l != null) {
                if (I.I0(3)) {
                    Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + DialogInterfaceOnCancelListenerC0706n.this.f4234l);
                }
                DialogInterfaceOnCancelListenerC0706n.this.f4234l.setContentView(requireView);
            }
        }
    }

    /* renamed from: P0.n$e */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class e extends AbstractC0714w {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AbstractC0714w f4243a;

        public e(AbstractC0714w abstractC0714w) {
            this.f4243a = abstractC0714w;
        }

        @Override // P0.AbstractC0714w
        public View c(int i6) {
            return this.f4243a.d() ? this.f4243a.c(i6) : DialogInterfaceOnCancelListenerC0706n.this.q(i6);
        }

        @Override // P0.AbstractC0714w
        public boolean d() {
            return this.f4243a.d() || DialogInterfaceOnCancelListenerC0706n.this.r();
        }
    }

    @Override // P0.AbstractComponentCallbacksC0708p
    public AbstractC0714w createFragmentContainer() {
        return new e(super.createFragmentContainer());
    }

    public final void n(boolean z6, boolean z7, boolean z8) {
        if (this.f4236n) {
            return;
        }
        this.f4236n = true;
        this.f4237o = false;
        Dialog dialog = this.f4234l;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f4234l.dismiss();
            if (!z7) {
                if (Looper.myLooper() == this.f4223a.getLooper()) {
                    onDismiss(this.f4234l);
                } else {
                    this.f4223a.post(this.f4224b);
                }
            }
        }
        this.f4235m = true;
        if (this.f4231i >= 0) {
            if (z8) {
                getParentFragmentManager().X0(this.f4231i, 1);
            } else {
                getParentFragmentManager().V0(this.f4231i, 1, z6);
            }
            this.f4231i = -1;
            return;
        }
        Q n6 = getParentFragmentManager().n();
        n6.m(true);
        n6.l(this);
        if (z8) {
            n6.h();
        } else if (z6) {
            n6.g();
        } else {
            n6.f();
        }
    }

    public int o() {
        return this.f4228f;
    }

    @Override // P0.AbstractComponentCallbacksC0708p
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // P0.AbstractComponentCallbacksC0708p
    public void onAttach(Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().j(this.f4233k);
        if (this.f4237o) {
            return;
        }
        this.f4236n = false;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // P0.AbstractComponentCallbacksC0708p
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f4223a = new Handler();
        this.f4230h = this.mContainerId == 0;
        if (bundle != null) {
            this.f4227e = bundle.getInt("android:style", 0);
            this.f4228f = bundle.getInt("android:theme", 0);
            this.f4229g = bundle.getBoolean("android:cancelable", true);
            this.f4230h = bundle.getBoolean("android:showsDialog", this.f4230h);
            this.f4231i = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // P0.AbstractComponentCallbacksC0708p
    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.f4234l;
        if (dialog != null) {
            this.f4235m = true;
            dialog.setOnDismissListener(null);
            this.f4234l.dismiss();
            if (!this.f4236n) {
                onDismiss(this.f4234l);
            }
            this.f4234l = null;
            this.f4238p = false;
        }
    }

    @Override // P0.AbstractComponentCallbacksC0708p
    public void onDetach() {
        super.onDetach();
        if (!this.f4237o && !this.f4236n) {
            this.f4236n = true;
        }
        getViewLifecycleOwnerLiveData().n(this.f4233k);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f4235m) {
            return;
        }
        if (I.I0(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        n(true, true, false);
    }

    @Override // P0.AbstractComponentCallbacksC0708p
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        if (this.f4230h && !this.f4232j) {
            s(bundle);
            if (I.I0(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.f4234l;
            if (dialog != null) {
                return onGetLayoutInflater.cloneInContext(dialog.getContext());
            }
        } else if (I.I0(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.f4230h) {
                Log.d("FragmentManager", "mShowsDialog = false: " + str);
                return onGetLayoutInflater;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: " + str);
        }
        return onGetLayoutInflater;
    }

    @Override // P0.AbstractComponentCallbacksC0708p
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.f4234l;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i6 = this.f4227e;
        if (i6 != 0) {
            bundle.putInt("android:style", i6);
        }
        int i7 = this.f4228f;
        if (i7 != 0) {
            bundle.putInt("android:theme", i7);
        }
        boolean z6 = this.f4229g;
        if (!z6) {
            bundle.putBoolean("android:cancelable", z6);
        }
        boolean z7 = this.f4230h;
        if (!z7) {
            bundle.putBoolean("android:showsDialog", z7);
        }
        int i8 = this.f4231i;
        if (i8 != -1) {
            bundle.putInt("android:backStackId", i8);
        }
    }

    @Override // P0.AbstractComponentCallbacksC0708p
    public void onStart() {
        super.onStart();
        Dialog dialog = this.f4234l;
        if (dialog != null) {
            this.f4235m = false;
            dialog.show();
            View decorView = this.f4234l.getWindow().getDecorView();
            androidx.lifecycle.S.a(decorView, this);
            androidx.lifecycle.T.a(decorView, this);
            y2.g.a(decorView, this);
        }
    }

    @Override // P0.AbstractComponentCallbacksC0708p
    public void onStop() {
        super.onStop();
        Dialog dialog = this.f4234l;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // P0.AbstractComponentCallbacksC0708p
    public void onViewStateRestored(Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.f4234l == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f4234l.onRestoreInstanceState(bundle2);
    }

    public Dialog p(Bundle bundle) {
        if (I.I0(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new e.r(requireContext(), o());
    }

    @Override // P0.AbstractComponentCallbacksC0708p
    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView != null || this.f4234l == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f4234l.onRestoreInstanceState(bundle2);
    }

    public View q(int i6) {
        Dialog dialog = this.f4234l;
        if (dialog != null) {
            return dialog.findViewById(i6);
        }
        return null;
    }

    public boolean r() {
        return this.f4238p;
    }

    public final void s(Bundle bundle) {
        if (this.f4230h && !this.f4238p) {
            try {
                this.f4232j = true;
                Dialog p6 = p(bundle);
                this.f4234l = p6;
                if (this.f4230h) {
                    u(p6, this.f4227e);
                    Context context = getContext();
                    if (context instanceof Activity) {
                        this.f4234l.setOwnerActivity((Activity) context);
                    }
                    this.f4234l.setCancelable(this.f4229g);
                    this.f4234l.setOnCancelListener(this.f4225c);
                    this.f4234l.setOnDismissListener(this.f4226d);
                    this.f4238p = true;
                } else {
                    this.f4234l = null;
                }
                this.f4232j = false;
            } catch (Throwable th) {
                this.f4232j = false;
                throw th;
            }
        }
    }

    public void t(boolean z6) {
        this.f4230h = z6;
    }

    public void u(Dialog dialog, int i6) {
        if (i6 != 1 && i6 != 2) {
            if (i6 != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void v(I i6, String str) {
        this.f4236n = false;
        this.f4237o = true;
        Q n6 = i6.n();
        n6.m(true);
        n6.c(this, str);
        n6.f();
    }
}
