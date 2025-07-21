package com.amazon.d.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface h extends IInterface {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class a extends Binder implements h {

        /* renamed from: a, reason: collision with root package name */
        static final int f11456a = 1;

        /* renamed from: b, reason: collision with root package name */
        static final int f11457b = 2;

        /* renamed from: c, reason: collision with root package name */
        static final int f11458c = 3;

        /* renamed from: d, reason: collision with root package name */
        static final int f11459d = 4;

        /* renamed from: e, reason: collision with root package name */
        static final int f11460e = 5;

        /* renamed from: f, reason: collision with root package name */
        static final int f11461f = 6;

        /* renamed from: g, reason: collision with root package name */
        static final int f11462g = 7;

        /* renamed from: h, reason: collision with root package name */
        private static final String f11463h = "com.amazon.venezia.command.FailureResult";

        /* renamed from: com.amazon.d.a.h$a$a, reason: collision with other inner class name */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static class C0175a implements h {

            /* renamed from: a, reason: collision with root package name */
            private IBinder f11464a;

            public C0175a(IBinder iBinder) {
                this.f11464a = iBinder;
            }

            @Override // com.amazon.d.a.h
            public String a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f11463h);
                    this.f11464a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f11464a;
            }

            @Override // com.amazon.d.a.h
            public String b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f11463h);
                    this.f11464a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.d.a.h
            public String c() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f11463h);
                    this.f11464a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.d.a.h
            public String d() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f11463h);
                    this.f11464a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.d.a.h
            public boolean e() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f11463h);
                    this.f11464a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.d.a.h
            public Map f() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f11463h);
                    this.f11464a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readHashMap(getClass().getClassLoader());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.d.a.h
            public String g() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f11463h);
                    this.f11464a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String h() {
                return a.f11463h;
            }
        }

        public a() {
            attachInterface(this, f11463h);
        }

        public static h a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f11463h);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof h)) ? new C0175a(iBinder) : (h) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i6, Parcel parcel, Parcel parcel2, int i7) {
            if (i6 == 1598968902) {
                parcel2.writeString(f11463h);
                return true;
            }
            switch (i6) {
                case 1:
                    parcel.enforceInterface(f11463h);
                    String a6 = a();
                    parcel2.writeNoException();
                    parcel2.writeString(a6);
                    return true;
                case 2:
                    parcel.enforceInterface(f11463h);
                    String b6 = b();
                    parcel2.writeNoException();
                    parcel2.writeString(b6);
                    return true;
                case 3:
                    parcel.enforceInterface(f11463h);
                    String c6 = c();
                    parcel2.writeNoException();
                    parcel2.writeString(c6);
                    return true;
                case 4:
                    parcel.enforceInterface(f11463h);
                    String d6 = d();
                    parcel2.writeNoException();
                    parcel2.writeString(d6);
                    return true;
                case 5:
                    parcel.enforceInterface(f11463h);
                    boolean e6 = e();
                    parcel2.writeNoException();
                    parcel2.writeInt(e6 ? 1 : 0);
                    return true;
                case 6:
                    parcel.enforceInterface(f11463h);
                    Map f6 = f();
                    parcel2.writeNoException();
                    parcel2.writeMap(f6);
                    return true;
                case 7:
                    parcel.enforceInterface(f11463h);
                    String g6 = g();
                    parcel2.writeNoException();
                    parcel2.writeString(g6);
                    return true;
                default:
                    return super.onTransact(i6, parcel, parcel2, i7);
            }
        }
    }

    String a();

    String b();

    String c();

    String d();

    boolean e();

    Map f();

    String g();
}
