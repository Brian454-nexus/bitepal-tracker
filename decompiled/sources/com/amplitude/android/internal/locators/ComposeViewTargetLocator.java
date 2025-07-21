package com.amplitude.android.internal.locators;

import androidx.compose.ui.layout.ModifierInfo;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.InspectableValue;
import androidx.compose.ui.platform.ValueElement;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import q3.C2012c;
import t3.InterfaceC2079b;
import y3.InterfaceC2355a;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\r\u001a\u0004\u0018\u00010\f*\u00020\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u001b\u0010\u0014\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/amplitude/android/internal/locators/ComposeViewTargetLocator;", "Lt3/b;", "Ly3/a;", "logger", "<init>", "(Ly3/a;)V", "", "Lkotlin/Pair;", "", "targetPosition", "Lq3/c$a;", "targetType", "Lq3/c;", "a", "(Ljava/lang/Object;Lkotlin/Pair;Lq3/c$a;)Lq3/c;", "Ly3/a;", "Lb;", "Lkotlin/Lazy;", "c", "()Lb;", "composeLayoutNodeBoundsHelper", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class ComposeViewTargetLocator implements InterfaceC2079b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final InterfaceC2355a logger;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final Lazy composeLayoutNodeBoundsHelper;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends Lambda implements Function0 {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final defpackage.b invoke() {
            return new defpackage.b(ComposeViewTargetLocator.this.logger);
        }
    }

    public ComposeViewTargetLocator(InterfaceC2355a logger) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.logger = logger;
        this.composeLayoutNodeBoundsHelper = LazyKt.lazy(new b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // t3.InterfaceC2079b
    public C2012c a(Object obj, Pair targetPosition, C2012c.a targetType) {
        String str;
        String str2;
        String name;
        String str3;
        Intrinsics.checkNotNullParameter(obj, "<this>");
        Intrinsics.checkNotNullParameter(targetPosition, "targetPosition");
        Intrinsics.checkNotNullParameter(targetType, "targetType");
        String str4 = null;
        Owner owner = obj instanceof Owner ? (Owner) obj : null;
        if (owner == null) {
            return null;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(owner.getRoot());
        String str5 = null;
        String str6 = null;
        boolean z6 = false;
        while (!arrayDeque.isEmpty()) {
            LayoutNode layoutNode = (LayoutNode) arrayDeque.poll();
            if (layoutNode != null) {
                if (layoutNode.isPlaced() && c().c(layoutNode, targetPosition)) {
                    Iterator it = layoutNode.getModifierInfo().iterator();
                    boolean z7 = false;
                    while (it.hasNext()) {
                        InspectableValue modifier = ((ModifierInfo) it.next()).getModifier();
                        if (modifier instanceof InspectableValue) {
                            InspectableValue inspectableValue = modifier;
                            String nameFallback = inspectableValue.getNameFallback();
                            if (nameFallback != null) {
                                int hashCode = nameFallback.hashCode();
                                if (hashCode == -1964681502) {
                                    str2 = str4;
                                    if (nameFallback.equals("clickable")) {
                                        z7 = true;
                                    }
                                } else if (hashCode == -1422466648) {
                                    str2 = str4;
                                    if (nameFallback.equals("testTag")) {
                                        Iterator it2 = inspectableValue.getInspectableElements().iterator();
                                        while (true) {
                                            if (!it2.hasNext()) {
                                                break;
                                            }
                                            ValueElement valueElement = (ValueElement) it2.next();
                                            if (Intrinsics.areEqual(valueElement.getName(), "tag")) {
                                                Object value = valueElement.getValue();
                                                str5 = value instanceof String ? (String) value : str2;
                                            }
                                        }
                                    }
                                } else if (hashCode == -932820115 && nameFallback.equals("semantics")) {
                                    for (ValueElement valueElement2 : inspectableValue.getInspectableElements()) {
                                        if (Intrinsics.areEqual(valueElement2.getName(), "properties")) {
                                            Object value2 = valueElement2.getValue();
                                            if (value2 instanceof LinkedHashMap) {
                                                for (Map.Entry entry : ((LinkedHashMap) value2).entrySet()) {
                                                    Intrinsics.checkNotNull(entry);
                                                    Object key = entry.getKey();
                                                    Object value3 = entry.getValue();
                                                    str3 = str4;
                                                    if (Intrinsics.areEqual(key, "TestTag")) {
                                                        str5 = value3 instanceof String ? (String) value3 : str3;
                                                        str4 = str3;
                                                    } else {
                                                        str4 = str3;
                                                    }
                                                }
                                            }
                                        }
                                        str3 = str4;
                                        str4 = str3;
                                    }
                                }
                                name = modifier.getClass().getName();
                                if (!Intrinsics.areEqual(name, "androidx.compose.foundation.ClickableElement") || Intrinsics.areEqual(name, "androidx.compose.foundation.CombinedClickableElement")) {
                                    z7 = true;
                                }
                                str4 = str2;
                            }
                            str2 = str4;
                            name = modifier.getClass().getName();
                            if (!Intrinsics.areEqual(name, "androidx.compose.foundation.ClickableElement")) {
                            }
                            z7 = true;
                            str4 = str2;
                        }
                    }
                    str = str4;
                    if (z7 && targetType == C2012c.a.f18681a) {
                        str6 = str5;
                        z6 = true;
                    }
                } else {
                    str = str4;
                }
                arrayDeque.addAll(layoutNode.getZSortedChildren().asMutableList());
                str4 = str;
            }
        }
        return !z6 ? str4 : new C2012c(null, null, null, str6, null, "jetpack_compose", null);
    }

    public final defpackage.b c() {
        return (defpackage.b) this.composeLayoutNodeBoundsHelper.getValue();
    }
}
