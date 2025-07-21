package c;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: c.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface InterfaceC1098a extends IInterface {

    /* renamed from: k, reason: collision with root package name */
    public static final String f10532k = "android$support$v4$app$INotificationSideChannel".replace('$', com.amazon.a.a.o.c.a.b.f11260a);

    /* renamed from: c.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class AbstractBinderC0161a extends Binder implements InterfaceC1098a {

        /* renamed from: c.a$a$a, reason: collision with other inner class name */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static class C0162a implements InterfaceC1098a {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f10533a;

            public C0162a(IBinder iBinder) {
                this.f10533a = iBinder;
            }

            @Override // c.InterfaceC1098a
            public void Z(String str, int i6, String str2, Notification notification) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(InterfaceC1098a.f10532k);
                    obtain.writeString(str);
                    obtain.writeInt(i6);
                    obtain.writeString(str2);
                    b.b(obtain, notification, 0);
                    this.f10533a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f10533a;
            }
        }

        public static InterfaceC1098a b(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(InterfaceC1098a.f10532k);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC1098a)) ? new C0162a(iBinder) : (InterfaceC1098a) queryLocalInterface;
        }
    }

    /* renamed from: c.a$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b {
        public static void b(Parcel parcel, Parcelable parcelable, int i6) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i6);
            }
        }
    }

    void Z(String str, int i6, String str2, Notification notification);
}
