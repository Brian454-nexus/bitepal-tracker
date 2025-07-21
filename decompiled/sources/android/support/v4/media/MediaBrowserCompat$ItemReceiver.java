package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import d.b;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
class MediaBrowserCompat$ItemReceiver extends b {
    @Override // d.b
    public void a(int i6, Bundle bundle) {
        MediaSessionCompat.a(bundle);
        if (i6 != 0) {
            throw null;
        }
        if (bundle == null) {
            throw null;
        }
        if (!bundle.containsKey("media_item")) {
            throw null;
        }
        Parcelable parcelable = bundle.getParcelable("media_item");
        if (parcelable != null && !(parcelable instanceof MediaBrowserCompat$MediaItem)) {
            throw null;
        }
        throw null;
    }
}
