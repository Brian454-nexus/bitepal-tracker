package o3;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class d {

    /* renamed from: f, reason: collision with root package name */
    public static final a f17935f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    public static final d f17936g = new d(true, true, true, true);

    /* renamed from: h, reason: collision with root package name */
    public static final d f17937h = new d(false, false, false, false);

    /* renamed from: a, reason: collision with root package name */
    public boolean f17938a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f17939b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f17940c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f17941d;

    /* renamed from: e, reason: collision with root package name */
    public final List f17942e;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public d(boolean z6, boolean z7, boolean z8, boolean z9) {
        this.f17938a = z6;
        this.f17939b = z7;
        this.f17940c = z8;
        this.f17941d = z9;
        this.f17942e = new ArrayList();
    }

    public final void a(Function1 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f17942e.add(listener);
    }

    public final boolean b() {
        return this.f17939b;
    }

    public final Set c() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (this.f17938a) {
            linkedHashSet.add(EnumC1840b.f17890a);
        }
        if (this.f17939b) {
            linkedHashSet.add(EnumC1840b.f17891b);
        }
        if (this.f17940c) {
            linkedHashSet.add(EnumC1840b.f17892c);
        }
        if (this.f17941d) {
            linkedHashSet.add(EnumC1840b.f17893d);
        }
        return linkedHashSet;
    }

    public final boolean d() {
        return this.f17940c;
    }

    public /* synthetic */ d(boolean z6, boolean z7, boolean z8, boolean z9, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? true : z6, (i6 & 2) != 0 ? false : z7, (i6 & 4) != 0 ? false : z8, (i6 & 8) != 0 ? false : z9);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(Function1 listener) {
        this(false, false, false, false, 15, null);
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f17942e.add(listener);
    }
}
