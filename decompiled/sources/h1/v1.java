package h1;

import android.media.metrics.LogSessionId;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import java.util.Objects;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class v1 {

    /* renamed from: d, reason: collision with root package name */
    public static final v1 f15209d;

    /* renamed from: a, reason: collision with root package name */
    public final String f15210a;

    /* renamed from: b, reason: collision with root package name */
    public final a f15211b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f15212c;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f15213b;

        /* renamed from: a, reason: collision with root package name */
        public final LogSessionId f15214a;

        static {
            LogSessionId logSessionId;
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            f15213b = new a(logSessionId);
        }

        public a(LogSessionId logSessionId) {
            this.f15214a = logSessionId;
        }
    }

    static {
        f15209d = AbstractC1117K.f10560a < 31 ? new v1("") : new v1(a.f15213b, "");
    }

    public v1(String str) {
        AbstractC1119a.g(AbstractC1117K.f10560a < 31);
        this.f15210a = str;
        this.f15211b = null;
        this.f15212c = new Object();
    }

    public LogSessionId a() {
        return ((a) AbstractC1119a.e(this.f15211b)).f15214a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1)) {
            return false;
        }
        v1 v1Var = (v1) obj;
        return Objects.equals(this.f15210a, v1Var.f15210a) && Objects.equals(this.f15211b, v1Var.f15211b) && Objects.equals(this.f15212c, v1Var.f15212c);
    }

    public int hashCode() {
        return Objects.hash(this.f15210a, this.f15211b, this.f15212c);
    }

    public v1(LogSessionId logSessionId, String str) {
        this(new a(logSessionId), str);
    }

    public v1(a aVar, String str) {
        this.f15211b = aVar;
        this.f15210a = str;
        this.f15212c = new Object();
    }
}
