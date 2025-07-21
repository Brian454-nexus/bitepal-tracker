package H3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.IntRange;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class b {

    /* renamed from: b, reason: collision with root package name */
    public static final a f2203b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final g f2204a;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(int i6, String str) {
            IntRange b6 = g.f2212b.b();
            int first = b6.getFirst();
            if (i6 <= b6.getLast() && first <= i6) {
                return new j();
            }
            IntRange b7 = g.f2213c.b();
            int first2 = b7.getFirst();
            if (i6 <= b7.getLast() && first2 <= i6) {
                return new c(new JSONObject(str));
            }
            IntRange b8 = g.f2215e.b();
            int first3 = b8.getFirst();
            if (i6 <= b8.getLast() && first3 <= i6) {
                return new h(new JSONObject(str));
            }
            IntRange b9 = g.f2216f.b();
            int first4 = b9.getFirst();
            if (i6 <= b9.getLast() && first4 <= i6) {
                return new l(new JSONObject(str));
            }
            IntRange b10 = g.f2214d.b();
            return (i6 > b10.getLast() || b10.getFirst() > i6) ? new d(b(str)) : new k();
        }

        public final JSONObject b(String str) {
            JSONObject jSONObject = new JSONObject();
            if (str != null && str.length() != 0) {
                try {
                    return new JSONObject(str);
                } catch (Exception unused) {
                    jSONObject.put("error", str);
                }
            }
            return jSONObject;
        }

        public a() {
        }
    }

    public /* synthetic */ b(g gVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(gVar);
    }

    public final g a() {
        return this.f2204a;
    }

    public b(g gVar) {
        this.f2204a = gVar;
    }
}
