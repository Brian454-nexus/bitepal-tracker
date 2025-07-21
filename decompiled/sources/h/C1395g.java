package h;

import android.content.Context;
import android.content.Intent;
import h.AbstractC1389a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import n0.AbstractC1809a;

/* renamed from: h.g, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1395g extends AbstractC1389a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f14974a = new a(null);

    /* renamed from: h.g$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Intent a(String[] input) {
            Intrinsics.checkNotNullParameter(input, "input");
            Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", input);
            Intrinsics.checkNotNullExpressionValue(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
            return putExtra;
        }

        public a() {
        }
    }

    @Override // h.AbstractC1389a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, String[] input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        return f14974a.a(input);
    }

    @Override // h.AbstractC1389a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public AbstractC1389a.C0202a b(Context context, String[] input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        if (input.length == 0) {
            return new AbstractC1389a.C0202a(MapsKt.emptyMap());
        }
        for (String str : input) {
            if (AbstractC1809a.checkSelfPermission(context, str) != 0) {
                return null;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(input.length), 16));
        for (String str2 : input) {
            Pair pair = TuplesKt.to(str2, Boolean.TRUE);
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return new AbstractC1389a.C0202a(linkedHashMap);
    }

    @Override // h.AbstractC1389a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Map c(int i6, Intent intent) {
        if (i6 == -1 && intent != null) {
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra == null || stringArrayExtra == null) {
                return MapsKt.emptyMap();
            }
            ArrayList arrayList = new ArrayList(intArrayExtra.length);
            for (int i7 : intArrayExtra) {
                arrayList.add(Boolean.valueOf(i7 == 0));
            }
            return MapsKt.toMap(CollectionsKt.zip(ArraysKt.filterNotNull(stringArrayExtra), arrayList));
        }
        return MapsKt.emptyMap();
    }
}
