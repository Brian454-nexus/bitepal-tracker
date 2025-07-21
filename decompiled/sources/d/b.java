package d;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import d.InterfaceC1170a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f13320a = false;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f13321b = null;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC1170a f13322c;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i6) {
            return new b[i6];
        }
    }

    /* renamed from: d.b$b, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class BinderC0187b extends InterfaceC1170a.AbstractBinderC0185a {
        public BinderC0187b() {
        }

        @Override // d.InterfaceC1170a
        public void c0(int i6, Bundle bundle) {
            b bVar = b.this;
            Handler handler = bVar.f13321b;
            if (handler != null) {
                handler.post(new c(i6, bundle));
            } else {
                bVar.a(i6, bundle);
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final int f13324a;

        /* renamed from: b, reason: collision with root package name */
        public final Bundle f13325b;

        public c(int i6, Bundle bundle) {
            this.f13324a = i6;
            this.f13325b = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(this.f13324a, this.f13325b);
        }
    }

    public b(Parcel parcel) {
        this.f13322c = InterfaceC1170a.AbstractBinderC0185a.b(parcel.readStrongBinder());
    }

    public void a(int i6, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        synchronized (this) {
            try {
                if (this.f13322c == null) {
                    this.f13322c = new BinderC0187b();
                }
                parcel.writeStrongBinder(this.f13322c.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
