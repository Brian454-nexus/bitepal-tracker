package J5;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import t5.b;
import t5.c;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface a extends IInterface {

    /* renamed from: J5.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class AbstractBinderC0051a extends b implements a {

        /* renamed from: J5.a$a$a, reason: collision with other inner class name */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static class C0052a extends t5.a implements a {
            public C0052a(IBinder iBinder) {
                super(iBinder);
            }

            @Override // J5.a
            public final Bundle c(Bundle bundle) {
                Parcel d02 = d0();
                c.b(d02, bundle);
                Parcel e02 = e0(d02);
                Bundle bundle2 = (Bundle) c.a(e02, Bundle.CREATOR);
                e02.recycle();
                return bundle2;
            }
        }

        public static a b(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            return queryLocalInterface instanceof a ? (a) queryLocalInterface : new C0052a(iBinder);
        }
    }

    Bundle c(Bundle bundle);
}
