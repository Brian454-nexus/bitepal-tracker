package d;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: d.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface InterfaceC1170a extends IInterface {

    /* renamed from: l, reason: collision with root package name */
    public static final String f13318l = "android$support$v4$os$IResultReceiver".replace('$', com.amazon.a.a.o.c.a.b.f11260a);

    /* renamed from: d.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class AbstractBinderC0185a extends Binder implements InterfaceC1170a {

        /* renamed from: d.a$a$a, reason: collision with other inner class name */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static class C0186a implements InterfaceC1170a {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f13319a;

            public C0186a(IBinder iBinder) {
                this.f13319a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f13319a;
            }
        }

        public AbstractBinderC0185a() {
            attachInterface(this, InterfaceC1170a.f13318l);
        }

        public static InterfaceC1170a b(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(InterfaceC1170a.f13318l);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC1170a)) ? new C0186a(iBinder) : (InterfaceC1170a) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i6, Parcel parcel, Parcel parcel2, int i7) {
            String str = InterfaceC1170a.f13318l;
            if (i6 >= 1 && i6 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i6 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i6 != 1) {
                return super.onTransact(i6, parcel, parcel2, i7);
            }
            c0(parcel.readInt(), (Bundle) b.b(parcel, Bundle.CREATOR));
            return true;
        }
    }

    /* renamed from: d.a$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b {
        public static Object b(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }
    }

    void c0(int i6, Bundle bundle);
}
