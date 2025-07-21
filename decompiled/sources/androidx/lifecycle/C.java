package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import y2.d;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C {

    /* renamed from: f, reason: collision with root package name */
    public static final a f8976f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    public static final Class[] f8977g = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a, reason: collision with root package name */
    public final Map f8978a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f8979b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f8980c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f8981d;

    /* renamed from: e, reason: collision with root package name */
    public final d.c f8982e;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C a(Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                if (bundle2 == null) {
                    return new C();
                }
                HashMap hashMap = new HashMap();
                for (String key : bundle2.keySet()) {
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    hashMap.put(key, bundle2.get(key));
                }
                return new C(hashMap);
            }
            ClassLoader classLoader = C.class.getClassLoader();
            Intrinsics.checkNotNull(classLoader);
            bundle.setClassLoader(classLoader);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
            if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
                throw new IllegalStateException("Invalid bundle passed as restored state");
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                Object obj = parcelableArrayList.get(i6);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((String) obj, parcelableArrayList2.get(i6));
            }
            return new C(linkedHashMap);
        }

        public final boolean b(Object obj) {
            if (obj == null) {
                return true;
            }
            for (Class cls : C.f8977g) {
                Intrinsics.checkNotNull(cls);
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }

        public a() {
        }
    }

    public C(Map initialState) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f8978a = linkedHashMap;
        this.f8979b = new LinkedHashMap();
        this.f8980c = new LinkedHashMap();
        this.f8981d = new LinkedHashMap();
        this.f8982e = new d.c() { // from class: androidx.lifecycle.B
            @Override // y2.d.c
            public final Bundle a() {
                Bundle d6;
                d6 = C.d(C.this);
                return d6;
            }
        };
        linkedHashMap.putAll(initialState);
    }

    public static final Bundle d(C this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        for (Map.Entry entry : MapsKt.toMap(this$0.f8979b).entrySet()) {
            this$0.e((String) entry.getKey(), ((d.c) entry.getValue()).a());
        }
        Set<String> keySet = this$0.f8978a.keySet();
        ArrayList arrayList = new ArrayList(keySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : keySet) {
            arrayList.add(str);
            arrayList2.add(this$0.f8978a.get(str));
        }
        return v0.d.a(TuplesKt.to("keys", arrayList), TuplesKt.to("values", arrayList2));
    }

    public final d.c c() {
        return this.f8982e;
    }

    public final void e(String key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (!f8976f.b(obj)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Can't put value with type ");
            Intrinsics.checkNotNull(obj);
            sb.append(obj.getClass());
            sb.append(" into saved state");
            throw new IllegalArgumentException(sb.toString());
        }
        Object obj2 = this.f8980c.get(key);
        C1067t c1067t = obj2 instanceof C1067t ? (C1067t) obj2 : null;
        if (c1067t != null) {
            c1067t.p(obj);
        } else {
            this.f8978a.put(key, obj);
        }
        ja.u uVar = (ja.u) this.f8981d.get(key);
        if (uVar == null) {
            return;
        }
        uVar.setValue(obj);
    }

    public C() {
        this.f8978a = new LinkedHashMap();
        this.f8979b = new LinkedHashMap();
        this.f8980c = new LinkedHashMap();
        this.f8981d = new LinkedHashMap();
        this.f8982e = new d.c() { // from class: androidx.lifecycle.B
            @Override // y2.d.c
            public final Bundle a() {
                Bundle d6;
                d6 = C.d(C.this);
                return d6;
            }
        };
    }
}
