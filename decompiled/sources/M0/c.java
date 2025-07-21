package M0;

import M0.f;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class c extends f {

    /* renamed from: a, reason: collision with root package name */
    public final Map f3363a;

    /* renamed from: b, reason: collision with root package name */
    public final b f3364b;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a extends Lambda implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f3365a = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(Map.Entry entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            Object value = entry.getValue();
            return "  " + ((f.a) entry.getKey()).a() + " = " + (value instanceof byte[] ? ArraysKt.joinToString$default((byte[]) value, ", ", "[", "]", 0, (CharSequence) null, (Function1) null, 56, (Object) null) : String.valueOf(entry.getValue()));
        }
    }

    public /* synthetic */ c(Map map, boolean z6, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? new LinkedHashMap() : map, (i6 & 2) != 0 ? true : z6);
    }

    @Override // M0.f
    public Map a() {
        Pair pair;
        Set<Map.Entry> entrySet = this.f3363a.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(entrySet, 10)), 16));
        for (Map.Entry entry : entrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
                pair = new Pair(key, copyOf);
            } else {
                pair = new Pair(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return M0.a.b(linkedHashMap);
    }

    @Override // M0.f
    public Object b(f.a key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = this.f3363a.get(key);
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    public final void e() {
        if (this.f3364b.a()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[LOOP:0: B:15:0x002e->B:30:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof M0.c
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            M0.c r6 = (M0.c) r6
            java.util.Map r0 = r6.f3363a
            java.util.Map r2 = r5.f3363a
            r3 = 1
            if (r0 != r2) goto L10
            return r3
        L10:
            int r0 = r0.size()
            java.util.Map r2 = r5.f3363a
            int r2 = r2.size()
            if (r0 == r2) goto L1d
            return r1
        L1d:
            java.util.Map r6 = r6.f3363a
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L26
            return r3
        L26:
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L2e:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L67
            java.lang.Object r0 = r6.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.util.Map r2 = r5.f3363a
            java.lang.Object r4 = r0.getKey()
            java.lang.Object r2 = r2.get(r4)
            if (r2 == 0) goto L63
            java.lang.Object r0 = r0.getValue()
            boolean r4 = r0 instanceof byte[]
            if (r4 == 0) goto L5e
            boolean r4 = r2 instanceof byte[]
            if (r4 == 0) goto L63
            byte[] r0 = (byte[]) r0
            byte[] r2 = (byte[]) r2
            boolean r0 = java.util.Arrays.equals(r0, r2)
            if (r0 == 0) goto L63
            r0 = r3
            goto L64
        L5e:
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
            goto L64
        L63:
            r0 = r1
        L64:
            if (r0 != 0) goto L2e
            return r1
        L67:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: M0.c.equals(java.lang.Object):boolean");
    }

    public final void f() {
        e();
        this.f3363a.clear();
    }

    public final void g() {
        this.f3364b.b(true);
    }

    public final void h(f.b... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        e();
        if (pairs.length <= 0) {
            return;
        }
        f.b bVar = pairs[0];
        throw null;
    }

    public int hashCode() {
        Iterator it = this.f3363a.entrySet().iterator();
        int i6 = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            i6 += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return i6;
    }

    public final Object i(f.a key) {
        Intrinsics.checkNotNullParameter(key, "key");
        e();
        return this.f3363a.remove(key);
    }

    public final void j(f.a key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        k(key, obj);
    }

    public final void k(f.a key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        e();
        if (obj == null) {
            i(key);
            return;
        }
        if (obj instanceof Set) {
            this.f3363a.put(key, M0.a.a((Set) obj));
            return;
        }
        if (!(obj instanceof byte[])) {
            this.f3363a.put(key, obj);
            return;
        }
        Map map = this.f3363a;
        byte[] bArr = (byte[]) obj;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        map.put(key, copyOf);
    }

    public String toString() {
        return CollectionsKt.joinToString$default(this.f3363a.entrySet(), ",\n", "{\n", "\n}", 0, (CharSequence) null, a.f3365a, 24, (Object) null);
    }

    public c(Map preferencesMap, boolean z6) {
        Intrinsics.checkNotNullParameter(preferencesMap, "preferencesMap");
        this.f3363a = preferencesMap;
        this.f3364b = new b(z6);
    }
}
