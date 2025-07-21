package com.amazon.d.c.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface a extends IInterface {
    String a();

    String a(String str);

    void a(String str, boolean z6, String str2);

    String b();

    /* renamed from: com.amazon.d.c.a.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class AbstractBinderC0178a extends Binder implements a {

        /* renamed from: a, reason: collision with root package name */
        static final int f11482a = 1;

        /* renamed from: b, reason: collision with root package name */
        static final int f11483b = 2;

        /* renamed from: c, reason: collision with root package name */
        static final int f11484c = 3;

        /* renamed from: d, reason: collision with root package name */
        static final int f11485d = 4;

        /* renamed from: e, reason: collision with root package name */
        private static final String f11486e = "com.amazon.venezia.service.verify.IApplicationVerificationService";

        public AbstractBinderC0178a() {
            attachInterface(this, f11486e);
        }

        public static a a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f11486e);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0179a(iBinder) : (a) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i6, Parcel parcel, Parcel parcel2, int i7) {
            if (i6 == 1) {
                parcel.enforceInterface(f11486e);
                a(parcel.readString(), parcel.readInt() != 0, parcel.readString());
                parcel2.writeNoException();
                return true;
            }
            if (i6 == 2) {
                parcel.enforceInterface(f11486e);
                String a6 = a(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(a6);
                return true;
            }
            if (i6 == 3) {
                parcel.enforceInterface(f11486e);
                String a7 = a();
                parcel2.writeNoException();
                parcel2.writeString(a7);
                return true;
            }
            if (i6 != 4) {
                if (i6 != 1598968902) {
                    return super.onTransact(i6, parcel, parcel2, i7);
                }
                parcel2.writeString(f11486e);
                return true;
            }
            parcel.enforceInterface(f11486e);
            String b6 = b();
            parcel2.writeNoException();
            parcel2.writeString(b6);
            return true;
        }

        /* renamed from: com.amazon.d.c.a.a$a$a, reason: collision with other inner class name */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static class C0179a implements a {

            /* renamed from: a, reason: collision with root package name */
            private IBinder f11487a;

            public C0179a(IBinder iBinder) {
                this.f11487a = iBinder;
            }

            @Override // com.amazon.d.c.a.a
            public void a(String str, boolean z6, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0178a.f11486e);
                    obtain.writeString(str);
                    obtain.writeInt(z6 ? 1 : 0);
                    obtain.writeString(str2);
                    this.f11487a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f11487a;
            }

            @Override // com.amazon.d.c.a.a
            public String b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0178a.f11486e);
                    this.f11487a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String c() {
                return AbstractBinderC0178a.f11486e;
            }

            @Override // com.amazon.d.c.a.a
            public String a(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0178a.f11486e);
                    obtain.writeString(str);
                    this.f11487a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.d.c.a.a
            public String a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0178a.f11486e);
                    this.f11487a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
