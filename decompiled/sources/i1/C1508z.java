package i1;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* renamed from: i1.z, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1508z {

    /* renamed from: a, reason: collision with root package name */
    public final a f15993a;

    /* renamed from: b, reason: collision with root package name */
    public int f15994b;

    /* renamed from: c, reason: collision with root package name */
    public long f15995c;

    /* renamed from: d, reason: collision with root package name */
    public long f15996d;

    /* renamed from: e, reason: collision with root package name */
    public long f15997e;

    /* renamed from: f, reason: collision with root package name */
    public long f15998f;

    /* renamed from: i1.z$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final AudioTrack f15999a;

        /* renamed from: b, reason: collision with root package name */
        public final AudioTimestamp f16000b = new AudioTimestamp();

        /* renamed from: c, reason: collision with root package name */
        public long f16001c;

        /* renamed from: d, reason: collision with root package name */
        public long f16002d;

        /* renamed from: e, reason: collision with root package name */
        public long f16003e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f16004f;

        /* renamed from: g, reason: collision with root package name */
        public long f16005g;

        public a(AudioTrack audioTrack) {
            this.f15999a = audioTrack;
        }

        public void a() {
            this.f16004f = true;
        }

        public long b() {
            return this.f16003e;
        }

        public long c() {
            return this.f16000b.nanoTime / 1000;
        }

        public boolean d() {
            boolean timestamp = this.f15999a.getTimestamp(this.f16000b);
            if (timestamp) {
                long j6 = this.f16000b.framePosition;
                long j7 = this.f16002d;
                if (j7 > j6) {
                    if (this.f16004f) {
                        this.f16005g += j7;
                        this.f16004f = false;
                    } else {
                        this.f16001c++;
                    }
                }
                this.f16002d = j6;
                this.f16003e = j6 + this.f16005g + (this.f16001c << 32);
            }
            return timestamp;
        }
    }

    public C1508z(AudioTrack audioTrack) {
        this.f15993a = new a(audioTrack);
        h();
    }

    public void a() {
        if (this.f15994b == 4) {
            h();
        }
    }

    public void b() {
        a aVar = this.f15993a;
        if (aVar != null) {
            aVar.a();
        }
    }

    public long c() {
        a aVar = this.f15993a;
        if (aVar != null) {
            return aVar.b();
        }
        return -1L;
    }

    public long d() {
        a aVar = this.f15993a;
        if (aVar != null) {
            return aVar.c();
        }
        return -9223372036854775807L;
    }

    public boolean e() {
        return this.f15994b == 2;
    }

    public boolean f(long j6) {
        a aVar = this.f15993a;
        if (aVar == null || j6 - this.f15997e < this.f15996d) {
            return false;
        }
        this.f15997e = j6;
        boolean d6 = aVar.d();
        int i6 = this.f15994b;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        if (i6 != 4) {
                            throw new IllegalStateException();
                        }
                    } else if (d6) {
                        h();
                        return d6;
                    }
                } else if (!d6) {
                    h();
                    return d6;
                }
            } else {
                if (!d6) {
                    h();
                    return d6;
                }
                if (this.f15993a.b() > this.f15998f) {
                    i(2);
                    return d6;
                }
            }
        } else {
            if (d6) {
                if (this.f15993a.c() < this.f15995c) {
                    return false;
                }
                this.f15998f = this.f15993a.b();
                i(1);
                return d6;
            }
            if (j6 - this.f15995c > 500000) {
                i(3);
            }
        }
        return d6;
    }

    public void g() {
        i(4);
    }

    public void h() {
        if (this.f15993a != null) {
            i(0);
        }
    }

    public final void i(int i6) {
        this.f15994b = i6;
        if (i6 == 0) {
            this.f15997e = 0L;
            this.f15998f = -1L;
            this.f15995c = System.nanoTime() / 1000;
            this.f15996d = 10000L;
            return;
        }
        if (i6 == 1) {
            this.f15996d = 10000L;
            return;
        }
        if (i6 == 2 || i6 == 3) {
            this.f15996d = 10000000L;
        } else {
            if (i6 != 4) {
                throw new IllegalStateException();
            }
            this.f15996d = 500000L;
        }
    }
}
