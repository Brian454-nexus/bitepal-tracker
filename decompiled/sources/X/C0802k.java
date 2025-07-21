package X;

import X.Q;
import java.util.concurrent.Executor;
import y0.InterfaceC2343a;

/* renamed from: X.k, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0802k extends Q.k {

    /* renamed from: g, reason: collision with root package name */
    public final r f5898g;

    /* renamed from: h, reason: collision with root package name */
    public final Executor f5899h;

    /* renamed from: i, reason: collision with root package name */
    public final InterfaceC2343a f5900i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f5901j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f5902k;

    /* renamed from: l, reason: collision with root package name */
    public final long f5903l;

    public C0802k(r rVar, Executor executor, InterfaceC2343a interfaceC2343a, boolean z6, boolean z7, long j6) {
        if (rVar == null) {
            throw new NullPointerException("Null getOutputOptions");
        }
        this.f5898g = rVar;
        this.f5899h = executor;
        this.f5900i = interfaceC2343a;
        this.f5901j = z6;
        this.f5902k = z7;
        this.f5903l = j6;
    }

    @Override // X.Q.k
    public Executor T() {
        return this.f5899h;
    }

    @Override // X.Q.k
    public InterfaceC2343a Y() {
        return this.f5900i;
    }

    @Override // X.Q.k
    public r a0() {
        return this.f5898g;
    }

    public boolean equals(Object obj) {
        Executor executor;
        InterfaceC2343a interfaceC2343a;
        if (obj == this) {
            return true;
        }
        if (obj instanceof Q.k) {
            Q.k kVar = (Q.k) obj;
            if (this.f5898g.equals(kVar.a0()) && ((executor = this.f5899h) != null ? executor.equals(kVar.T()) : kVar.T() == null) && ((interfaceC2343a = this.f5900i) != null ? interfaceC2343a.equals(kVar.Y()) : kVar.Y() == null) && this.f5901j == kVar.k0() && this.f5902k == kVar.q0() && this.f5903l == kVar.f0()) {
                return true;
            }
        }
        return false;
    }

    @Override // X.Q.k
    public long f0() {
        return this.f5903l;
    }

    public int hashCode() {
        int hashCode = (this.f5898g.hashCode() ^ 1000003) * 1000003;
        Executor executor = this.f5899h;
        int hashCode2 = (hashCode ^ (executor == null ? 0 : executor.hashCode())) * 1000003;
        InterfaceC2343a interfaceC2343a = this.f5900i;
        int hashCode3 = (((hashCode2 ^ (interfaceC2343a != null ? interfaceC2343a.hashCode() : 0)) * 1000003) ^ (this.f5901j ? 1231 : 1237)) * 1000003;
        int i6 = this.f5902k ? 1231 : 1237;
        long j6 = this.f5903l;
        return ((hashCode3 ^ i6) * 1000003) ^ ((int) (j6 ^ (j6 >>> 32)));
    }

    @Override // X.Q.k
    public boolean k0() {
        return this.f5901j;
    }

    @Override // X.Q.k
    public boolean q0() {
        return this.f5902k;
    }

    public String toString() {
        return "RecordingRecord{getOutputOptions=" + this.f5898g + ", getCallbackExecutor=" + this.f5899h + ", getEventListener=" + this.f5900i + ", hasAudioEnabled=" + this.f5901j + ", isPersistent=" + this.f5902k + ", getRecordingId=" + this.f5903l + "}";
    }
}
