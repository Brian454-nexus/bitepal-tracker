package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(J2.a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f8416a = (IconCompat) aVar.v(remoteActionCompat.f8416a, 1);
        remoteActionCompat.f8417b = aVar.l(remoteActionCompat.f8417b, 2);
        remoteActionCompat.f8418c = aVar.l(remoteActionCompat.f8418c, 3);
        remoteActionCompat.f8419d = (PendingIntent) aVar.r(remoteActionCompat.f8419d, 4);
        remoteActionCompat.f8420e = aVar.h(remoteActionCompat.f8420e, 5);
        remoteActionCompat.f8421f = aVar.h(remoteActionCompat.f8421f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, J2.a aVar) {
        aVar.x(false, false);
        aVar.M(remoteActionCompat.f8416a, 1);
        aVar.D(remoteActionCompat.f8417b, 2);
        aVar.D(remoteActionCompat.f8418c, 3);
        aVar.H(remoteActionCompat.f8419d, 4);
        aVar.z(remoteActionCompat.f8420e, 5);
        aVar.z(remoteActionCompat.f8421f, 6);
    }
}
