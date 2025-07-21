package v3;

import D3.f;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import n3.AbstractC1822b;
import n3.C1821a;

/* renamed from: v3.b, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C2167b implements f {

    /* renamed from: d, reason: collision with root package name */
    public static final a f19561d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final f.a f19562a = f.a.f797a;

    /* renamed from: b, reason: collision with root package name */
    public B3.a f19563b;

    /* renamed from: c, reason: collision with root package name */
    public C1821a f19564c;

    /* renamed from: v3.b$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: v3.b$b, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class C0262b extends Lambda implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ B3.a f19565a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0262b(B3.a aVar) {
            super(1);
            this.f19565a = aVar;
        }

        public final void a(AbstractC1822b abstractC1822b) {
            Intrinsics.checkNotNullParameter(abstractC1822b, "<name for destructuring parameter 0>");
            throw null;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            android.support.v4.media.session.b.a(obj);
            a(null);
            return Unit.INSTANCE;
        }
    }

    @Override // D3.f
    public void a(B3.a amplitude) {
        Intrinsics.checkNotNullParameter(amplitude, "amplitude");
        super.a(amplitude);
        C1821a a6 = C1821a.f17742c.a(amplitude.m().l());
        this.f19564c = a6;
        if (a6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("connector");
            a6 = null;
        }
        a6.c().a(new C0262b(amplitude));
    }

    @Override // D3.f
    public C3.a c(C3.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Map I02 = event.I0();
        if (I02 != null && !I02.isEmpty() && !Intrinsics.areEqual(event.F0(), "$exposure")) {
            HashMap hashMap = new HashMap();
            for (Map.Entry entry : I02.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof Map) {
                    try {
                        hashMap.put(str, (Map) value);
                    } catch (ClassCastException e6) {
                        e6.printStackTrace();
                    }
                }
            }
            C1821a c1821a = this.f19564c;
            if (c1821a == null) {
                Intrinsics.throwUninitializedPropertyAccessException("connector");
                c1821a = null;
            }
            c1821a.d().a().c(hashMap).commit();
        }
        return event;
    }

    @Override // D3.f
    public void d(B3.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f19563b = aVar;
    }

    @Override // D3.f
    public f.a getType() {
        return this.f19562a;
    }
}
