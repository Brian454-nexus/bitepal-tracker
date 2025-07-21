package com.amazon.d.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface g extends IInterface {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class a extends Binder implements g {

        /* renamed from: a, reason: collision with root package name */
        static final int f11452a = 1;

        /* renamed from: b, reason: collision with root package name */
        static final int f11453b = 2;

        /* renamed from: c, reason: collision with root package name */
        private static final String f11454c = "com.amazon.venezia.command.ExceptionResult";

        /* renamed from: com.amazon.d.a.g$a$a, reason: collision with other inner class name */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static class C0174a implements g {

            /* renamed from: a, reason: collision with root package name */
            private IBinder f11455a;

            public C0174a(IBinder iBinder) {
                this.f11455a = iBinder;
            }

            @Override // com.amazon.d.a.g
            public String a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f11454c);
                    this.f11455a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f11455a;
            }

            @Override // com.amazon.d.a.g
            public Map b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f11454c);
                    this.f11455a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readHashMap(getClass().getClassLoader());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String c() {
                return a.f11454c;
            }
        }

        public a() {
            attachInterface(this, f11454c);
        }

        public static g a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f11454c);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof g)) ? new C0174a(iBinder) : (g) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i6, Parcel parcel, Parcel parcel2, int i7) {
            if (i6 == 1) {
                parcel.enforceInterface(f11454c);
                String a6 = a();
                parcel2.writeNoException();
                parcel2.writeString(a6);
                return true;
            }
            if (i6 != 2) {
                if (i6 != 1598968902) {
                    return super.onTransact(i6, parcel, parcel2, i7);
                }
                parcel2.writeString(f11454c);
                return true;
            }
            parcel.enforceInterface(f11454c);
            Map b6 = b();
            parcel2.writeNoException();
            parcel2.writeMap(b6);
            return true;
        }
    }

    String a();

    Map b();
}
