package g1;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import c1.AbstractC1133o;
import i1.InterfaceC1506x;
import i1.InterfaceC1507y;
import i1.M;
import java.util.ArrayList;
import o1.c;
import p1.C1909j;
import p1.k;
import q1.InterfaceC2008b;
import y1.C2352i;
import y1.InterfaceC2351h;

/* renamed from: g1.k, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C1340k implements M0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f14692a;

    /* renamed from: b, reason: collision with root package name */
    public final C1909j f14693b;

    /* renamed from: e, reason: collision with root package name */
    public boolean f14696e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f14698g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f14699h;

    /* renamed from: c, reason: collision with root package name */
    public int f14694c = 0;

    /* renamed from: d, reason: collision with root package name */
    public long f14695d = 5000;

    /* renamed from: f, reason: collision with root package name */
    public p1.x f14697f = p1.x.f18285a;

    public C1340k(Context context) {
        this.f14692a = context;
        this.f14693b = new C1909j(context);
    }

    @Override // g1.M0
    public J0[] a(Handler handler, C1.B b6, InterfaceC1506x interfaceC1506x, InterfaceC2351h interfaceC2351h, InterfaceC2008b interfaceC2008b) {
        Handler handler2;
        ArrayList arrayList = new ArrayList();
        i(this.f14692a, this.f14694c, this.f14697f, this.f14696e, handler, b6, this.f14695d, arrayList);
        InterfaceC1507y c6 = c(this.f14692a, this.f14698g, this.f14699h);
        if (c6 != null) {
            handler2 = handler;
            b(this.f14692a, this.f14694c, this.f14697f, this.f14696e, c6, handler2, interfaceC1506x, arrayList);
        } else {
            handler2 = handler;
        }
        h(this.f14692a, interfaceC2351h, handler2.getLooper(), this.f14694c, arrayList);
        f(this.f14692a, interfaceC2008b, handler2.getLooper(), this.f14694c, arrayList);
        d(this.f14692a, this.f14694c, arrayList);
        e(arrayList);
        g(this.f14692a, handler2, this.f14694c, arrayList);
        return (J0[]) arrayList.toArray(new J0[0]);
    }

    public void b(Context context, int i6, p1.x xVar, boolean z6, InterfaceC1507y interfaceC1507y, Handler handler, InterfaceC1506x interfaceC1506x, ArrayList arrayList) {
        int i7;
        int i8;
        int i9;
        arrayList.add(new i1.W(context, j(), xVar, z6, handler, interfaceC1506x, interfaceC1507y));
        if (i6 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i6 == 2) {
            size--;
        }
        try {
            try {
                i7 = size + 1;
                try {
                    arrayList.add(size, (J0) Class.forName("androidx.media3.decoder.midi.MidiRenderer").getConstructor(Context.class).newInstance(context));
                    AbstractC1133o.f("DefaultRenderersFactory", "Loaded MidiRenderer.");
                } catch (ClassNotFoundException unused) {
                    size = i7;
                    i7 = size;
                    try {
                        i8 = i7 + 1;
                        try {
                            arrayList.add(i7, (J0) Class.forName("androidx.media3.decoder.opus.LibopusAudioRenderer").getConstructor(Handler.class, InterfaceC1506x.class, InterfaceC1507y.class).newInstance(handler, interfaceC1506x, interfaceC1507y));
                            AbstractC1133o.f("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
                        } catch (ClassNotFoundException unused2) {
                            i7 = i8;
                            i8 = i7;
                            try {
                                i9 = i8 + 1;
                                arrayList.add(i8, (J0) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(Handler.class, InterfaceC1506x.class, InterfaceC1507y.class).newInstance(handler, interfaceC1506x, interfaceC1507y));
                                AbstractC1133o.f("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                            } catch (ClassNotFoundException unused3) {
                            }
                            arrayList.add(i9, (J0) Class.forName("androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, InterfaceC1506x.class, InterfaceC1507y.class).newInstance(handler, interfaceC1506x, interfaceC1507y));
                            AbstractC1133o.f("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                        }
                    } catch (ClassNotFoundException unused4) {
                    }
                    try {
                        i9 = i8 + 1;
                        arrayList.add(i8, (J0) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(Handler.class, InterfaceC1506x.class, InterfaceC1507y.class).newInstance(handler, interfaceC1506x, interfaceC1507y));
                        AbstractC1133o.f("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                        arrayList.add(i9, (J0) Class.forName("androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, InterfaceC1506x.class, InterfaceC1507y.class).newInstance(handler, interfaceC1506x, interfaceC1507y));
                        AbstractC1133o.f("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                    } catch (Exception e6) {
                        throw new RuntimeException("Error instantiating FLAC extension", e6);
                    }
                }
            } catch (ClassNotFoundException unused5) {
            }
            try {
                i8 = i7 + 1;
                arrayList.add(i7, (J0) Class.forName("androidx.media3.decoder.opus.LibopusAudioRenderer").getConstructor(Handler.class, InterfaceC1506x.class, InterfaceC1507y.class).newInstance(handler, interfaceC1506x, interfaceC1507y));
                AbstractC1133o.f("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
                i9 = i8 + 1;
                try {
                    arrayList.add(i8, (J0) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(Handler.class, InterfaceC1506x.class, InterfaceC1507y.class).newInstance(handler, interfaceC1506x, interfaceC1507y));
                    AbstractC1133o.f("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                } catch (ClassNotFoundException unused6) {
                    i8 = i9;
                    i9 = i8;
                    arrayList.add(i9, (J0) Class.forName("androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, InterfaceC1506x.class, InterfaceC1507y.class).newInstance(handler, interfaceC1506x, interfaceC1507y));
                    AbstractC1133o.f("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                }
                try {
                    arrayList.add(i9, (J0) Class.forName("androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, InterfaceC1506x.class, InterfaceC1507y.class).newInstance(handler, interfaceC1506x, interfaceC1507y));
                    AbstractC1133o.f("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                } catch (ClassNotFoundException unused7) {
                } catch (Exception e7) {
                    throw new RuntimeException("Error instantiating FFmpeg extension", e7);
                }
            } catch (Exception e8) {
                throw new RuntimeException("Error instantiating Opus extension", e8);
            }
        } catch (Exception e9) {
            throw new RuntimeException("Error instantiating MIDI extension", e9);
        }
    }

    public InterfaceC1507y c(Context context, boolean z6, boolean z7) {
        return new M.f(context).k(z6).j(z7).i();
    }

    public void d(Context context, int i6, ArrayList arrayList) {
        arrayList.add(new D1.b());
    }

    public void e(ArrayList arrayList) {
        arrayList.add(new o1.g(c.a.f17848a, null));
    }

    public void f(Context context, InterfaceC2008b interfaceC2008b, Looper looper, int i6, ArrayList arrayList) {
        arrayList.add(new q1.c(interfaceC2008b, looper));
    }

    public void g(Context context, Handler handler, int i6, ArrayList arrayList) {
    }

    public void h(Context context, InterfaceC2351h interfaceC2351h, Looper looper, int i6, ArrayList arrayList) {
        arrayList.add(new C2352i(interfaceC2351h, looper));
    }

    public void i(Context context, int i6, p1.x xVar, boolean z6, Handler handler, C1.B b6, long j6, ArrayList arrayList) {
        String str;
        int i7;
        int i8;
        Class cls = Integer.TYPE;
        Class cls2 = Long.TYPE;
        arrayList.add(new C1.k(context, j(), xVar, j6, z6, handler, b6, 50));
        if (i6 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i6 == 2) {
            size--;
        }
        try {
            try {
                i7 = size + 1;
                try {
                    arrayList.add(size, (J0) Class.forName("androidx.media3.decoder.vp9.LibvpxVideoRenderer").getConstructor(cls2, Handler.class, C1.B.class, cls).newInstance(Long.valueOf(j6), handler, b6, 50));
                    str = "DefaultRenderersFactory";
                    try {
                        AbstractC1133o.f(str, "Loaded LibvpxVideoRenderer.");
                    } catch (ClassNotFoundException unused) {
                        size = i7;
                        i7 = size;
                        try {
                            i8 = i7 + 1;
                            try {
                                arrayList.add(i7, (J0) Class.forName("androidx.media3.decoder.av1.Libgav1VideoRenderer").getConstructor(cls2, Handler.class, C1.B.class, cls).newInstance(Long.valueOf(j6), handler, b6, 50));
                                AbstractC1133o.f(str, "Loaded Libgav1VideoRenderer.");
                            } catch (ClassNotFoundException unused2) {
                                i7 = i8;
                                i8 = i7;
                                arrayList.add(i8, (J0) Class.forName("androidx.media3.decoder.ffmpeg.ExperimentalFfmpegVideoRenderer").getConstructor(cls2, Handler.class, C1.B.class, cls).newInstance(Long.valueOf(j6), handler, b6, 50));
                                AbstractC1133o.f(str, "Loaded FfmpegVideoRenderer.");
                            }
                        } catch (ClassNotFoundException unused3) {
                        }
                        arrayList.add(i8, (J0) Class.forName("androidx.media3.decoder.ffmpeg.ExperimentalFfmpegVideoRenderer").getConstructor(cls2, Handler.class, C1.B.class, cls).newInstance(Long.valueOf(j6), handler, b6, 50));
                        AbstractC1133o.f(str, "Loaded FfmpegVideoRenderer.");
                    }
                } catch (ClassNotFoundException unused4) {
                    str = "DefaultRenderersFactory";
                }
            } catch (Exception e6) {
                throw new RuntimeException("Error instantiating VP9 extension", e6);
            }
        } catch (ClassNotFoundException unused5) {
            str = "DefaultRenderersFactory";
        }
        try {
            i8 = i7 + 1;
            arrayList.add(i7, (J0) Class.forName("androidx.media3.decoder.av1.Libgav1VideoRenderer").getConstructor(cls2, Handler.class, C1.B.class, cls).newInstance(Long.valueOf(j6), handler, b6, 50));
            AbstractC1133o.f(str, "Loaded Libgav1VideoRenderer.");
            try {
                arrayList.add(i8, (J0) Class.forName("androidx.media3.decoder.ffmpeg.ExperimentalFfmpegVideoRenderer").getConstructor(cls2, Handler.class, C1.B.class, cls).newInstance(Long.valueOf(j6), handler, b6, 50));
                AbstractC1133o.f(str, "Loaded FfmpegVideoRenderer.");
            } catch (ClassNotFoundException unused6) {
            } catch (Exception e7) {
                throw new RuntimeException("Error instantiating FFmpeg extension", e7);
            }
        } catch (Exception e8) {
            throw new RuntimeException("Error instantiating AV1 extension", e8);
        }
    }

    public k.b j() {
        return this.f14693b;
    }
}
