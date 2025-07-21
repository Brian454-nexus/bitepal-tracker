package y;

import F.AbstractC0335i0;
import F.AbstractC0347t;
import I.E;
import androidx.lifecycle.AbstractC1065q;
import androidx.lifecycle.C1067t;
import java.util.Objects;

/* renamed from: y.q0, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C2325q0 {

    /* renamed from: a, reason: collision with root package name */
    public final I.J f21050a;

    /* renamed from: b, reason: collision with root package name */
    public final C1067t f21051b;

    /* renamed from: y.q0$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21052a;

        static {
            int[] iArr = new int[E.a.values().length];
            f21052a = iArr;
            try {
                iArr[E.a.PENDING_OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21052a[E.a.OPENING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21052a[E.a.OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21052a[E.a.CONFIGURED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21052a[E.a.CLOSING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21052a[E.a.RELEASING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21052a[E.a.CLOSED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f21052a[E.a.RELEASED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public C2325q0(I.J j6) {
        this.f21050a = j6;
        C1067t c1067t = new C1067t();
        this.f21051b = c1067t;
        c1067t.m(AbstractC0347t.a(AbstractC0347t.b.CLOSED));
    }

    public AbstractC1065q a() {
        return this.f21051b;
    }

    public final AbstractC0347t b() {
        return this.f21050a.c() ? AbstractC0347t.a(AbstractC0347t.b.OPENING) : AbstractC0347t.a(AbstractC0347t.b.PENDING_OPEN);
    }

    public void c(E.a aVar, AbstractC0347t.a aVar2) {
        AbstractC0347t b6;
        switch (a.f21052a[aVar.ordinal()]) {
            case 1:
                b6 = b();
                break;
            case 2:
                b6 = AbstractC0347t.b(AbstractC0347t.b.OPENING, aVar2);
                break;
            case 3:
            case 4:
                b6 = AbstractC0347t.b(AbstractC0347t.b.OPEN, aVar2);
                break;
            case 5:
            case 6:
                b6 = AbstractC0347t.b(AbstractC0347t.b.CLOSING, aVar2);
                break;
            case 7:
            case 8:
                b6 = AbstractC0347t.b(AbstractC0347t.b.CLOSED, aVar2);
                break;
            default:
                throw new IllegalStateException("Unknown internal camera state: " + aVar);
        }
        AbstractC0335i0.a("CameraStateMachine", "New public camera state " + b6 + " from " + aVar + " and " + aVar2);
        if (Objects.equals((AbstractC0347t) this.f21051b.f(), b6)) {
            return;
        }
        AbstractC0335i0.a("CameraStateMachine", "Publishing new public camera state " + b6);
        this.f21051b.m(b6);
    }
}
