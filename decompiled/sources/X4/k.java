package X4;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class k implements i {

    /* renamed from: c, reason: collision with root package name */
    public final Map f6257c;

    /* renamed from: d, reason: collision with root package name */
    public volatile Map f6258d;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: d, reason: collision with root package name */
        public static final String f6259d;

        /* renamed from: e, reason: collision with root package name */
        public static final Map f6260e;

        /* renamed from: a, reason: collision with root package name */
        public boolean f6261a = true;

        /* renamed from: b, reason: collision with root package name */
        public Map f6262b = f6260e;

        /* renamed from: c, reason: collision with root package name */
        public boolean f6263c = true;

        static {
            String b6 = b();
            f6259d = b6;
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(b6)) {
                hashMap.put("User-Agent", Collections.singletonList(new b(b6)));
            }
            f6260e = Collections.unmodifiableMap(hashMap);
        }

        public static String b() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb = new StringBuilder(property.length());
            for (int i6 = 0; i6 < length; i6++) {
                char charAt = property.charAt(i6);
                if ((charAt > 31 || charAt == '\t') && charAt < 127) {
                    sb.append(charAt);
                } else {
                    sb.append('?');
                }
            }
            return sb.toString();
        }

        public k a() {
            this.f6261a = true;
            return new k(this.f6262b);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b implements j {

        /* renamed from: a, reason: collision with root package name */
        public final String f6264a;

        public b(String str) {
            this.f6264a = str;
        }

        @Override // X4.j
        public String a() {
            return this.f6264a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f6264a.equals(((b) obj).f6264a);
            }
            return false;
        }

        public int hashCode() {
            return this.f6264a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.f6264a + "'}";
        }
    }

    public k(Map map) {
        this.f6257c = Collections.unmodifiableMap(map);
    }

    @Override // X4.i
    public Map a() {
        if (this.f6258d == null) {
            synchronized (this) {
                try {
                    if (this.f6258d == null) {
                        this.f6258d = Collections.unmodifiableMap(c());
                    }
                } finally {
                }
            }
        }
        return this.f6258d;
    }

    public final String b(List list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            String a6 = ((j) list.get(i6)).a();
            if (!TextUtils.isEmpty(a6)) {
                sb.append(a6);
                if (i6 != list.size() - 1) {
                    sb.append(',');
                }
            }
        }
        return sb.toString();
    }

    public final Map c() {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f6257c.entrySet()) {
            String b6 = b((List) entry.getValue());
            if (!TextUtils.isEmpty(b6)) {
                hashMap.put(entry.getKey(), b6);
            }
        }
        return hashMap;
    }

    public boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f6257c.equals(((k) obj).f6257c);
        }
        return false;
    }

    public int hashCode() {
        return this.f6257c.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f6257c + '}';
    }
}
