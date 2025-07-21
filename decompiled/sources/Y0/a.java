package Y0;

import android.app.Notification;
import android.media.session.MediaSession;
import android.support.v4.media.session.MediaSessionCompat;
import android.widget.RemoteViews;
import androidx.core.app.j;
import androidx.core.app.m;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class a extends m.j {

    /* renamed from: a, reason: collision with root package name */
    public int[] f6325a = null;

    /* renamed from: b, reason: collision with root package name */
    public MediaSessionCompat.Token f6326b;

    @Override // androidx.core.app.m.j
    public void apply(j jVar) {
        jVar.a().setStyle(b(new Notification.MediaStyle()));
    }

    public Notification.MediaStyle b(Notification.MediaStyle mediaStyle) {
        int[] iArr = this.f6325a;
        if (iArr != null) {
            mediaStyle.setShowActionsInCompactView(iArr);
        }
        MediaSessionCompat.Token token = this.f6326b;
        if (token != null) {
            mediaStyle.setMediaSession((MediaSession.Token) token.a());
        }
        return mediaStyle;
    }

    @Override // androidx.core.app.m.j
    public RemoteViews makeBigContentView(j jVar) {
        return null;
    }

    @Override // androidx.core.app.m.j
    public RemoteViews makeContentView(j jVar) {
        return null;
    }
}
