package com.amazon.d.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface e extends IInterface {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class a extends Binder implements e {

        /* renamed from: a, reason: collision with root package name */
        private static final String f11437a = "com.amazon.venezia.command.DecisionExpirationContext";

        /* renamed from: c, reason: collision with root package name */
        static final int f11438c = 1;

        /* renamed from: d, reason: collision with root package name */
        static final int f11439d = 2;

        /* renamed from: com.amazon.d.a.e$a$a, reason: collision with other inner class name */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static class C0172a implements e {

            /* renamed from: a, reason: collision with root package name */
            private IBinder f11440a;

            public C0172a(IBinder iBinder) {
                this.f11440a = iBinder;
            }

            @Override // com.amazon.d.a.e
            public String a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f11437a);
                    this.f11440a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f11440a;
            }

            @Override // com.amazon.d.a.e
            public Map b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f11437a);
                    this.f11440a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readHashMap(getClass().getClassLoader());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String c() {
                return a.f11437a;
            }
        }

        public a() {
            attachInterface(this, f11437a);
        }

        public static e a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f11437a);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof e)) ? new C0172a(iBinder) : (e) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i6, Parcel parcel, Parcel parcel2, int i7) {
            if (i6 == 1) {
                parcel.enforceInterface(f11437a);
                String a6 = a();
                parcel2.writeNoException();
                parcel2.writeString(a6);
                return true;
            }
            if (i6 != 2) {
                if (i6 != 1598968902) {
                    return super.onTransact(i6, parcel, parcel2, i7);
                }
                parcel2.writeString(f11437a);
                return true;
            }
            parcel.enforceInterface(f11437a);
            Map b6 = b();
            parcel2.writeNoException();
            parcel2.writeMap(b6);
            return true;
        }
    }

    String a();

    Map b();
}
