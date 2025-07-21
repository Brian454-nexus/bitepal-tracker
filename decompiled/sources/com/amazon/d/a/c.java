package com.amazon.d.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface c extends IInterface {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class a extends Binder implements c {

        /* renamed from: a, reason: collision with root package name */
        private static final String f11428a = "com.amazon.venezia.command.Command";

        /* renamed from: b, reason: collision with root package name */
        static final int f11429b = 1;

        /* renamed from: c, reason: collision with root package name */
        static final int f11430c = 2;

        /* renamed from: d, reason: collision with root package name */
        static final int f11431d = 3;

        /* renamed from: e, reason: collision with root package name */
        static final int f11432e = 4;

        /* renamed from: com.amazon.d.a.c$a$a, reason: collision with other inner class name */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static class C0170a implements c {

            /* renamed from: a, reason: collision with root package name */
            private IBinder f11433a;

            public C0170a(IBinder iBinder) {
                this.f11433a = iBinder;
            }

            @Override // com.amazon.d.a.c
            public String a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f11428a);
                    this.f11433a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f11433a;
            }

            @Override // com.amazon.d.a.c
            public String b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f11428a);
                    this.f11433a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.d.a.c
            public Map c() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f11428a);
                    this.f11433a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readHashMap(getClass().getClassLoader());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.d.a.c
            public String d() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f11428a);
                    this.f11433a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String e() {
                return a.f11428a;
            }
        }

        public a() {
            attachInterface(this, f11428a);
        }

        public static c a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f11428a);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof c)) ? new C0170a(iBinder) : (c) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i6, Parcel parcel, Parcel parcel2, int i7) {
            if (i6 == 1) {
                parcel.enforceInterface(f11428a);
                String b6 = b();
                parcel2.writeNoException();
                parcel2.writeString(b6);
                return true;
            }
            if (i6 == 2) {
                parcel.enforceInterface(f11428a);
                String a6 = a();
                parcel2.writeNoException();
                parcel2.writeString(a6);
                return true;
            }
            if (i6 == 3) {
                parcel.enforceInterface(f11428a);
                String d6 = d();
                parcel2.writeNoException();
                parcel2.writeString(d6);
                return true;
            }
            if (i6 != 4) {
                if (i6 != 1598968902) {
                    return super.onTransact(i6, parcel, parcel2, i7);
                }
                parcel2.writeString(f11428a);
                return true;
            }
            parcel.enforceInterface(f11428a);
            Map c6 = c();
            parcel2.writeNoException();
            parcel2.writeMap(c6);
            return true;
        }
    }

    String a();

    String b();

    Map c();

    String d();
}
