package android.support.v4.media.session;

import android.os.Bundle;
import android.os.ResultReceiver;
import java.lang.ref.WeakReference;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
class MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver extends ResultReceiver {

    /* renamed from: a, reason: collision with root package name */
    public WeakReference f7837a;

    @Override // android.os.ResultReceiver
    public void onReceiveResult(int i6, Bundle bundle) {
        b.a(this.f7837a.get());
    }
}
