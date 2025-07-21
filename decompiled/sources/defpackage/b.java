package defpackage;

import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.ModifierInfo;
import androidx.compose.ui.node.LayoutNode;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import y3.InterfaceC2355a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2355a f10371a;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a extends Lambda implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f10372a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List list) {
            super(0);
            this.f10372a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ModifierInfo invoke() {
            Object obj;
            Iterator it = this.f10372a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((ModifierInfo) obj).getCoordinates().isAttached()) {
                    break;
                }
            }
            return (ModifierInfo) obj;
        }
    }

    public b(InterfaceC2355a logger) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f10371a = logger;
    }

    public static final ModifierInfo b(Lazy lazy) {
        return (ModifierInfo) lazy.getValue();
    }

    public final Rect a(LayoutNode layoutNode) {
        LayoutCoordinates coordinates;
        try {
            List modifierInfo = layoutNode.getModifierInfo();
            Object firstOrNull = CollectionsKt.firstOrNull(modifierInfo);
            ModifierInfo modifierInfo2 = (ModifierInfo) firstOrNull;
            if (modifierInfo2 == null || (coordinates = modifierInfo2.getCoordinates()) == null || !coordinates.isAttached()) {
                firstOrNull = null;
            }
            ModifierInfo modifierInfo3 = (ModifierInfo) firstOrNull;
            Lazy lazy = LazyKt.lazy(new a(modifierInfo));
            if (modifierInfo3 == null) {
                modifierInfo3 = b(lazy);
            }
            LayoutCoordinates coordinates2 = modifierInfo3 != null ? modifierInfo3.getCoordinates() : null;
            if (coordinates2 == null) {
                coordinates2 = layoutNode.getCoordinates();
            }
            return LayoutCoordinatesKt.boundsInWindow(coordinates2);
        } catch (Exception unused) {
            this.f10371a.e("Could not fetch position for LayoutNode");
            return null;
        }
    }

    public final boolean c(LayoutNode node, Pair position) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(position, "position");
        Rect a6 = a(node);
        if (a6 == null) {
            return false;
        }
        return a6.contains-k-4lQ0M(OffsetKt.Offset(((Number) position.component1()).floatValue(), ((Number) position.component2()).floatValue()));
    }
}
