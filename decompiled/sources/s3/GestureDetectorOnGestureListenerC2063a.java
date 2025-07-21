package s3;

import android.app.Activity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import q3.C2010a;
import q3.C2012c;
import x3.i;
import y3.InterfaceC2355a;

/* renamed from: s3.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class GestureDetectorOnGestureListenerC2063a implements GestureDetector.OnGestureListener {

    /* renamed from: a, reason: collision with root package name */
    public final Function2 f18911a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2355a f18912b;

    /* renamed from: c, reason: collision with root package name */
    public final List f18913c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakReference f18914d;

    /* renamed from: s3.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class C0246a extends Lambda implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final C0246a f18915a = new C0246a();

        public C0246a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.length() <= 0) {
                return it;
            }
            StringBuilder sb = new StringBuilder();
            String valueOf = String.valueOf(it.charAt(0));
            Intrinsics.checkNotNull(valueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = valueOf.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            sb.append((Object) upperCase);
            String substring = it.substring(1);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            sb.append(substring);
            return sb.toString();
        }
    }

    public GestureDetectorOnGestureListenerC2063a(Activity activity, Function2 track, InterfaceC2355a logger, List viewTargetLocators) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(track, "track");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(viewTargetLocators, "viewTargetLocators");
        this.f18911a = track;
        this.f18912b = logger;
        this.f18913c = viewTargetLocators;
        this.f18914d = new WeakReference(activity);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent e6) {
        Intrinsics.checkNotNullParameter(e6, "e");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent e22, float f6, float f7) {
        Intrinsics.checkNotNullParameter(e22, "e2");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent e6) {
        Intrinsics.checkNotNullParameter(e6, "e");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent e22, float f6, float f7) {
        Intrinsics.checkNotNullParameter(e22, "e2");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent e6) {
        Intrinsics.checkNotNullParameter(e6, "e");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent e6) {
        Window window;
        View decorView;
        Intrinsics.checkNotNullParameter(e6, "e");
        Activity activity = (Activity) this.f18914d.get();
        if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            this.f18912b.a("DecorView is null in onSingleTapUp()");
            Unit unit = Unit.INSTANCE;
            return false;
        }
        C2012c b6 = C2010a.b(decorView, new Pair(Float.valueOf(e6.getX()), Float.valueOf(e6.getY())), this.f18913c, C2012c.a.f18681a, this.f18912b);
        if (b6 == null) {
            this.f18912b.e("Unable to find click target. No event captured.");
            Unit unit2 = Unit.INSTANCE;
            return false;
        }
        Pair pair = TuplesKt.to("[Amplitude] Action", "touch");
        Pair pair2 = TuplesKt.to("[Amplitude] Target Class", b6.a());
        Pair pair3 = TuplesKt.to("[Amplitude] Target Resource", b6.c());
        Pair pair4 = TuplesKt.to("[Amplitude] Target Tag", b6.e());
        Pair pair5 = TuplesKt.to("[Amplitude] Target Text", b6.f());
        Pair pair6 = TuplesKt.to("[Amplitude] Target Source", CollectionsKt.joinToString$default(StringsKt.split$default(StringsKt.replace$default(b6.d(), "_", " ", false, 4, (Object) null), new String[]{" "}, false, 0, 6, (Object) null), " ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C0246a.f18915a, 30, (Object) null));
        Pair pair7 = TuplesKt.to("[Amplitude] Hierarchy", b6.b());
        String str = null;
        try {
            Activity activity2 = (Activity) this.f18914d.get();
            if (activity2 != null) {
                str = i.f20543c.a(activity2);
            }
        } catch (Exception e7) {
            this.f18912b.a("Error getting screen name: " + e7);
        }
        this.f18911a.invoke("[Amplitude] Element Interacted", MapsKt.mapOf(new Pair[]{pair, pair2, pair3, pair4, pair5, pair6, pair7, TuplesKt.to("[Amplitude] Screen Name", str)}));
        return false;
    }
}
