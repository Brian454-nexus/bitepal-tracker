package v2;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import v2.j;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface k extends IInterface {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class a extends Binder implements k {

        /* renamed from: v2.k$a$a, reason: collision with other inner class name */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static class C0261a implements k {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f19428a;

            public C0261a(IBinder iBinder) {
                this.f19428a = iBinder;
            }

            @Override // v2.k
            public int E(j jVar, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeStrongInterface(jVar);
                    obtain.writeString(str);
                    this.f19428a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // v2.k
            public void X(int i6, String[] strArr) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeInt(i6);
                    obtain.writeStringArray(strArr);
                    this.f19428a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f19428a;
            }
        }

        public a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
        }

        public static k b(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof k)) ? new C0261a(iBinder) : (k) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i6, Parcel parcel, Parcel parcel2, int i7) {
            if (i6 >= 1 && i6 <= 16777215) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            }
            if (i6 == 1598968902) {
                parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
                return true;
            }
            if (i6 == 1) {
                int E6 = E(j.a.b(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(E6);
            } else if (i6 == 2) {
                a0(j.a.b(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
            } else {
                if (i6 != 3) {
                    return super.onTransact(i6, parcel, parcel2, i7);
                }
                X(parcel.readInt(), parcel.createStringArray());
            }
            return true;
        }
    }

    int E(j jVar, String str);

    void X(int i6, String[] strArr);

    void a0(j jVar, int i6);
}
