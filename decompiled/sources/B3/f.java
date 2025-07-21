package B3;

import H3.i;
import ga.G;
import ga.J;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface f {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f372b = new a("LAST_EVENT_ID", 0, "last_event_id");

        /* renamed from: c, reason: collision with root package name */
        public static final a f373c = new a("PREVIOUS_SESSION_ID", 1, "previous_session_id");

        /* renamed from: d, reason: collision with root package name */
        public static final a f374d = new a("LAST_EVENT_TIME", 2, "last_event_time");

        /* renamed from: e, reason: collision with root package name */
        public static final a f375e = new a("OPT_OUT", 3, "opt_out");

        /* renamed from: f, reason: collision with root package name */
        public static final a f376f = new a("Events", 4, "events");

        /* renamed from: g, reason: collision with root package name */
        public static final a f377g = new a("APP_VERSION", 5, "app_version");

        /* renamed from: h, reason: collision with root package name */
        public static final a f378h = new a("APP_BUILD", 6, "app_build");

        /* renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ a[] f379i;

        /* renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f380j;

        /* renamed from: a, reason: collision with root package name */
        public final String f381a;

        static {
            a[] a6 = a();
            f379i = a6;
            f380j = EnumEntriesKt.enumEntries(a6);
        }

        public a(String str, int i6, String str2) {
            this.f381a = str2;
        }

        public static final /* synthetic */ a[] a() {
            return new a[]{f372b, f373c, f374d, f375e, f376f, f377g, f378h};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f379i.clone();
        }

        public final String b() {
            return this.f381a;
        }
    }

    List a();

    Object b(Object obj, Continuation continuation);

    Object c(Continuation continuation);

    Object d(C3.a aVar, Continuation continuation);

    String f(a aVar);

    Object j(a aVar, String str, Continuation continuation);

    i k(D3.b bVar, b bVar2, J j6, G g6);
}
