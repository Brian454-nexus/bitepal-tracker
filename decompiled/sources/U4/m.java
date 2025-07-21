package U4;

import android.graphics.Bitmap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class m implements k {

    /* renamed from: d, reason: collision with root package name */
    public static final Bitmap.Config[] f5250d;

    /* renamed from: e, reason: collision with root package name */
    public static final Bitmap.Config[] f5251e;

    /* renamed from: f, reason: collision with root package name */
    public static final Bitmap.Config[] f5252f;

    /* renamed from: g, reason: collision with root package name */
    public static final Bitmap.Config[] f5253g;

    /* renamed from: h, reason: collision with root package name */
    public static final Bitmap.Config[] f5254h;

    /* renamed from: a, reason: collision with root package name */
    public final c f5255a = new c();

    /* renamed from: b, reason: collision with root package name */
    public final g f5256b = new g();

    /* renamed from: c, reason: collision with root package name */
    public final Map f5257c = new HashMap();

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5258a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f5258a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5258a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5258a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5258a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b implements l {

        /* renamed from: a, reason: collision with root package name */
        public final c f5259a;

        /* renamed from: b, reason: collision with root package name */
        public int f5260b;

        /* renamed from: c, reason: collision with root package name */
        public Bitmap.Config f5261c;

        public b(c cVar) {
            this.f5259a = cVar;
        }

        @Override // U4.l
        public void a() {
            this.f5259a.c(this);
        }

        public void b(int i6, Bitmap.Config config) {
            this.f5260b = i6;
            this.f5261c = config;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f5260b == bVar.f5260b && n5.l.e(this.f5261c, bVar.f5261c)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i6 = this.f5260b * 31;
            Bitmap.Config config = this.f5261c;
            return i6 + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return m.h(this.f5260b, this.f5261c);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class c extends U4.c {
        @Override // U4.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public b a() {
            return new b(this);
        }

        public b e(int i6, Bitmap.Config config) {
            b bVar = (b) b();
            bVar.b(i6, config);
            return bVar;
        }
    }

    static {
        Bitmap.Config[] configArr = (Bitmap.Config[]) Arrays.copyOf(new Bitmap.Config[]{Bitmap.Config.ARGB_8888, null}, 3);
        configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        f5250d = configArr;
        f5251e = configArr;
        f5252f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f5253g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f5254h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    public static String h(int i6, Bitmap.Config config) {
        return "[" + i6 + "](" + config + ")";
    }

    public static Bitmap.Config[] i(Bitmap.Config config) {
        if (Bitmap.Config.RGBA_F16.equals(config)) {
            return f5251e;
        }
        int i6 = a.f5258a[config.ordinal()];
        return i6 != 1 ? i6 != 2 ? i6 != 3 ? i6 != 4 ? new Bitmap.Config[]{config} : f5254h : f5253g : f5252f : f5250d;
    }

    @Override // U4.k
    public String a(int i6, int i7, Bitmap.Config config) {
        return h(n5.l.h(i6, i7, config), config);
    }

    @Override // U4.k
    public int b(Bitmap bitmap) {
        return n5.l.i(bitmap);
    }

    @Override // U4.k
    public void c(Bitmap bitmap) {
        b e6 = this.f5255a.e(n5.l.i(bitmap), bitmap.getConfig());
        this.f5256b.d(e6, bitmap);
        NavigableMap j6 = j(bitmap.getConfig());
        Integer num = (Integer) j6.get(Integer.valueOf(e6.f5260b));
        j6.put(Integer.valueOf(e6.f5260b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // U4.k
    public Bitmap d(int i6, int i7, Bitmap.Config config) {
        b g6 = g(n5.l.h(i6, i7, config), config);
        Bitmap bitmap = (Bitmap) this.f5256b.a(g6);
        if (bitmap != null) {
            f(Integer.valueOf(g6.f5260b), bitmap);
            bitmap.reconfigure(i6, i7, config);
        }
        return bitmap;
    }

    @Override // U4.k
    public String e(Bitmap bitmap) {
        return h(n5.l.i(bitmap), bitmap.getConfig());
    }

    public final void f(Integer num, Bitmap bitmap) {
        NavigableMap j6 = j(bitmap.getConfig());
        Integer num2 = (Integer) j6.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                j6.remove(num);
                return;
            } else {
                j6.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + e(bitmap) + ", this: " + this);
    }

    public final b g(int i6, Bitmap.Config config) {
        b e6 = this.f5255a.e(i6, config);
        Bitmap.Config[] i7 = i(config);
        int length = i7.length;
        int i8 = 0;
        while (true) {
            if (i8 >= length) {
                break;
            }
            Bitmap.Config config2 = i7[i8];
            Integer num = (Integer) j(config2).ceilingKey(Integer.valueOf(i6));
            if (num == null || num.intValue() > i6 * 8) {
                i8++;
            } else if (num.intValue() != i6 || (config2 != null ? !config2.equals(config) : config != null)) {
                this.f5255a.c(e6);
                return this.f5255a.e(num.intValue(), config2);
            }
        }
        return e6;
    }

    public final NavigableMap j(Bitmap.Config config) {
        NavigableMap navigableMap = (NavigableMap) this.f5257c.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f5257c.put(config, treeMap);
        return treeMap;
    }

    @Override // U4.k
    public Bitmap removeLast() {
        Bitmap bitmap = (Bitmap) this.f5256b.f();
        if (bitmap != null) {
            f(Integer.valueOf(n5.l.i(bitmap)), bitmap);
        }
        return bitmap;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.f5256b);
        sb.append(", sortedSizes=(");
        for (Map.Entry entry : this.f5257c.entrySet()) {
            sb.append(entry.getKey());
            sb.append('[');
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!this.f5257c.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }
}
