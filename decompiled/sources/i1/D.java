package i1;

import Z0.C0830b;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import i1.C1494k;
import i1.M;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class D implements M.d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f15736a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f15737b;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {
        public static C1494k a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z6) {
            boolean isOffloadedPlaybackSupported;
            isOffloadedPlaybackSupported = AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes);
            return !isOffloadedPlaybackSupported ? C1494k.f15940d : new C1494k.b().e(true).g(z6).d();
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {
        public static C1494k a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z6) {
            int playbackOffloadSupport;
            playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
            if (playbackOffloadSupport == 0) {
                return C1494k.f15940d;
            }
            return new C1494k.b().e(true).f(AbstractC1117K.f10560a > 32 && playbackOffloadSupport == 2).g(z6).d();
        }
    }

    public D(Context context) {
        this.f15736a = context;
    }

    @Override // i1.M.d
    public C1494k a(Z0.q qVar, C0830b c0830b) {
        AbstractC1119a.e(qVar);
        AbstractC1119a.e(c0830b);
        int i6 = AbstractC1117K.f10560a;
        if (i6 < 29 || qVar.f6967C == -1) {
            return C1494k.f15940d;
        }
        boolean b6 = b(this.f15736a);
        int f6 = Z0.y.f((String) AbstractC1119a.e(qVar.f6990n), qVar.f6986j);
        if (f6 == 0 || i6 < AbstractC1117K.L(f6)) {
            return C1494k.f15940d;
        }
        int N5 = AbstractC1117K.N(qVar.f6966B);
        if (N5 == 0) {
            return C1494k.f15940d;
        }
        try {
            AudioFormat M5 = AbstractC1117K.M(qVar.f6967C, N5, f6);
            return i6 >= 31 ? b.a(M5, c0830b.a().f6870a, b6) : a.a(M5, c0830b.a().f6870a, b6);
        } catch (IllegalArgumentException unused) {
            return C1494k.f15940d;
        }
    }

    public final boolean b(Context context) {
        Boolean bool = this.f15737b;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context != null) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager != null) {
                String parameters = audioManager.getParameters("offloadVariableRateSupported");
                this.f15737b = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            } else {
                this.f15737b = Boolean.FALSE;
            }
        } else {
            this.f15737b = Boolean.FALSE;
        }
        return this.f15737b.booleanValue();
    }
}
