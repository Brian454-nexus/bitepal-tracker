package M0;

import L0.f;
import L0.g;
import L0.h;
import M0.f;
import androidx.datastore.preferences.protobuf.AbstractC1030g;
import androidx.datastore.preferences.protobuf.AbstractC1045w;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class j implements K0.c {

    /* renamed from: a, reason: collision with root package name */
    public static final j f3376a = new j();

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3377a;

        static {
            int[] iArr = new int[h.b.values().length];
            try {
                iArr[h.b.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h.b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h.b.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[h.b.INTEGER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[h.b.LONG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[h.b.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[h.b.STRING_SET.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[h.b.BYTES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[h.b.VALUE_NOT_SET.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f3377a = iArr;
        }
    }

    @Override // K0.c
    public Object c(Ea.d dVar, Continuation continuation) {
        L0.f a6 = L0.d.f3093a.a(dVar.n0());
        c b6 = g.b(new f.b[0]);
        Map O5 = a6.O();
        Intrinsics.checkNotNullExpressionValue(O5, "preferencesProto.preferencesMap");
        for (Map.Entry entry : O5.entrySet()) {
            String name = (String) entry.getKey();
            L0.h value = (L0.h) entry.getValue();
            j jVar = f3376a;
            Intrinsics.checkNotNullExpressionValue(name, "name");
            Intrinsics.checkNotNullExpressionValue(value, "value");
            jVar.d(name, value, b6);
        }
        return b6.d();
    }

    public final void d(String str, L0.h hVar, c cVar) {
        h.b d02 = hVar.d0();
        switch (d02 == null ? -1 : a.f3377a[d02.ordinal()]) {
            case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                throw new I0.c("Value case is null.", null, 2, null);
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                cVar.j(h.a(str), Boolean.valueOf(hVar.U()));
                return;
            case 2:
                cVar.j(h.d(str), Float.valueOf(hVar.Y()));
                return;
            case 3:
                cVar.j(h.c(str), Double.valueOf(hVar.X()));
                return;
            case 4:
                cVar.j(h.e(str), Integer.valueOf(hVar.Z()));
                return;
            case 5:
                cVar.j(h.f(str), Long.valueOf(hVar.a0()));
                return;
            case 6:
                f.a g6 = h.g(str);
                String b02 = hVar.b0();
                Intrinsics.checkNotNullExpressionValue(b02, "value.string");
                cVar.j(g6, b02);
                return;
            case 7:
                f.a h6 = h.h(str);
                List Q5 = hVar.c0().Q();
                Intrinsics.checkNotNullExpressionValue(Q5, "value.stringSet.stringsList");
                cVar.j(h6, CollectionsKt.toSet(Q5));
                return;
            case 8:
                f.a b6 = h.b(str);
                byte[] u6 = hVar.V().u();
                Intrinsics.checkNotNullExpressionValue(u6, "value.bytes.toByteArray()");
                cVar.j(b6, u6);
                return;
            case 9:
                throw new I0.c("Value not set.", null, 2, null);
        }
    }

    @Override // K0.c
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public f a() {
        return g.a();
    }

    public final L0.h f(Object obj) {
        if (obj instanceof Boolean) {
            AbstractC1045w f6 = L0.h.e0().n(((Boolean) obj).booleanValue()).f();
            Intrinsics.checkNotNullExpressionValue(f6, "newBuilder().setBoolean(value).build()");
            return (L0.h) f6;
        }
        if (obj instanceof Float) {
            AbstractC1045w f7 = L0.h.e0().q(((Number) obj).floatValue()).f();
            Intrinsics.checkNotNullExpressionValue(f7, "newBuilder().setFloat(value).build()");
            return (L0.h) f7;
        }
        if (obj instanceof Double) {
            AbstractC1045w f8 = L0.h.e0().p(((Number) obj).doubleValue()).f();
            Intrinsics.checkNotNullExpressionValue(f8, "newBuilder().setDouble(value).build()");
            return (L0.h) f8;
        }
        if (obj instanceof Integer) {
            AbstractC1045w f9 = L0.h.e0().r(((Number) obj).intValue()).f();
            Intrinsics.checkNotNullExpressionValue(f9, "newBuilder().setInteger(value).build()");
            return (L0.h) f9;
        }
        if (obj instanceof Long) {
            AbstractC1045w f10 = L0.h.e0().s(((Number) obj).longValue()).f();
            Intrinsics.checkNotNullExpressionValue(f10, "newBuilder().setLong(value).build()");
            return (L0.h) f10;
        }
        if (obj instanceof String) {
            AbstractC1045w f11 = L0.h.e0().t((String) obj).f();
            Intrinsics.checkNotNullExpressionValue(f11, "newBuilder().setString(value).build()");
            return (L0.h) f11;
        }
        if (obj instanceof Set) {
            h.a e02 = L0.h.e0();
            g.a R5 = L0.g.R();
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
            AbstractC1045w f12 = e02.u(R5.n((Set) obj)).f();
            Intrinsics.checkNotNullExpressionValue(f12, "newBuilder().setStringSe…                ).build()");
            return (L0.h) f12;
        }
        if (obj instanceof byte[]) {
            AbstractC1045w f13 = L0.h.e0().o(AbstractC1030g.i((byte[]) obj)).f();
            Intrinsics.checkNotNullExpressionValue(f13, "newBuilder().setBytes(By….copyFrom(value)).build()");
            return (L0.h) f13;
        }
        throw new IllegalStateException("PreferencesSerializer does not support type: " + obj.getClass().getName());
    }

    @Override // K0.c
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Object b(f fVar, Ea.c cVar, Continuation continuation) {
        Map a6 = fVar.a();
        f.a R5 = L0.f.R();
        for (Map.Entry entry : a6.entrySet()) {
            R5.n(((f.a) entry.getKey()).a(), f(entry.getValue()));
        }
        ((L0.f) R5.f()).f(cVar.m0());
        return Unit.INSTANCE;
    }
}
