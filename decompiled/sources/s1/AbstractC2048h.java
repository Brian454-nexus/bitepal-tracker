package s1;

import android.net.Uri;
import c1.AbstractC1117K;
import e1.C1252j;

/* renamed from: s1.h, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC2048h {
    public static C1252j a(int i6) {
        return new C1252j(Uri.parse(AbstractC1117K.H("%s:%d", "rtp://0.0.0.0", Integer.valueOf(i6))));
    }
}
