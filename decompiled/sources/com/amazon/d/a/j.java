package com.amazon.d.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface j extends IInterface {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class a extends Binder implements j {

        /* renamed from: a, reason: collision with root package name */
        static final int f11471a = 1;

        /* renamed from: b, reason: collision with root package name */
        static final int f11472b = 2;

        /* renamed from: c, reason: collision with root package name */
        private static final String f11473c = "com.amazon.venezia.command.SuccessResult";

        /* renamed from: com.amazon.d.a.j$a$a, reason: collision with other inner class name */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static class C0177a implements j {

            /* renamed from: a, reason: collision with root package name */
            private IBinder f11474a;

            public C0177a(IBinder iBinder) {
                this.f11474a = iBinder;
            }

            @Override // com.amazon.d.a.j
            public String a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f11473c);
                    this.f11474a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f11474a;
            }

            @Override // com.amazon.d.a.j
            public Map b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f11473c);
                    this.f11474a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readHashMap(getClass().getClassLoader());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String c() {
                return a.f11473c;
            }
        }

        public a() {
            attachInterface(this, f11473c);
        }

        public static j a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f11473c);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof j)) ? new C0177a(iBinder) : (j) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i6, Parcel parcel, Parcel parcel2, int i7) {
            if (i6 == 1) {
                parcel.enforceInterface(f11473c);
                String a6 = a();
                parcel2.writeNoException();
                parcel2.writeString(a6);
                return true;
            }
            if (i6 != 2) {
                if (i6 != 1598968902) {
                    return super.onTransact(i6, parcel, parcel2, i7);
                }
                parcel2.writeString(f11473c);
                return true;
            }
            parcel.enforceInterface(f11473c);
            Map b6 = b();
            parcel2.writeNoException();
            parcel2.writeMap(b6);
            return true;
        }
    }

    String a();

    Map b();
}
