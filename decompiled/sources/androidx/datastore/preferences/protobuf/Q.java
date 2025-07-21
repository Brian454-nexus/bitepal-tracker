package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class Q {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f8677a;

    static {
        char[] cArr = new char[80];
        f8677a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(int i6, StringBuilder sb) {
        while (i6 > 0) {
            char[] cArr = f8677a;
            int length = i6 > cArr.length ? cArr.length : i6;
            sb.append(cArr, 0, length);
            i6 -= length;
        }
    }

    public static boolean b(Object obj) {
        return obj instanceof Boolean ? !((Boolean) obj).booleanValue() : obj instanceof Integer ? ((Integer) obj).intValue() == 0 : obj instanceof Float ? Float.floatToRawIntBits(((Float) obj).floatValue()) == 0 : obj instanceof Double ? Double.doubleToRawLongBits(((Double) obj).doubleValue()) == 0 : obj instanceof String ? obj.equals("") : obj instanceof AbstractC1030g ? obj.equals(AbstractC1030g.f8721b) : obj instanceof O ? obj == ((O) obj).getDefaultInstanceForType() : (obj instanceof Enum) && ((Enum) obj).ordinal() == 0;
    }

    public static String c(String str) {
        if (str.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toLowerCase(str.charAt(0)));
        for (int i6 = 1; i6 < str.length(); i6++) {
            char charAt = str.charAt(i6);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    public static void d(StringBuilder sb, int i6, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                d(sb, i6, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                d(sb, i6, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        a(i6, sb);
        sb.append(c(str));
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(j0.c((String) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC1030g) {
            sb.append(": \"");
            sb.append(j0.a((AbstractC1030g) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC1045w) {
            sb.append(" {");
            e((AbstractC1045w) obj, sb, i6 + 2);
            sb.append("\n");
            a(i6, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i7 = i6 + 2;
        d(sb, i7, "key", entry.getKey());
        d(sb, i7, com.amazon.a.a.o.b.f11195Y, entry.getValue());
        sb.append("\n");
        a(i6, sb);
        sb.append("}");
    }

    public static void e(O o6, StringBuilder sb, int i6) {
        int i7;
        int i8;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = o6.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i9 = 0;
        while (true) {
            i7 = 3;
            if (i9 >= length) {
                break;
            }
            Method method3 = declaredMethods[i9];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith(com.amazon.a.a.o.b.au)) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i9++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i7);
            if (!substring.endsWith("List") || substring.endsWith("OrBuilderList") || substring.equals("List") || (method2 = (Method) entry.getValue()) == null) {
                i8 = i7;
            } else {
                i8 = i7;
                if (method2.getReturnType().equals(List.class)) {
                    d(sb, i6, substring.substring(0, substring.length() - 4), AbstractC1045w.w(method2, o6, new Object[0]));
                    i7 = i8;
                }
            }
            if (!substring.endsWith("Map") || substring.equals("Map") || (method = (Method) entry.getValue()) == null || !method.getReturnType().equals(Map.class) || method.isAnnotationPresent(Deprecated.class) || !Modifier.isPublic(method.getModifiers())) {
                if (hashSet.contains("set" + substring)) {
                    if (substring.endsWith("Bytes")) {
                        if (treeMap.containsKey(com.amazon.a.a.o.b.au + substring.substring(0, substring.length() - 5))) {
                        }
                    }
                    Method method4 = (Method) entry.getValue();
                    Method method5 = (Method) hashMap.get("has" + substring);
                    if (method4 != null) {
                        Object w6 = AbstractC1045w.w(method4, o6, new Object[0]);
                        if (method5 == null ? !b(w6) : ((Boolean) AbstractC1045w.w(method5, o6, new Object[0])).booleanValue()) {
                            d(sb, i6, substring, w6);
                        }
                    }
                }
            } else {
                d(sb, i6, substring.substring(0, substring.length() - 3), AbstractC1045w.w(method, o6, new Object[0]));
            }
            i7 = i8;
        }
        m0 m0Var = ((AbstractC1045w) o6).unknownFields;
        if (m0Var != null) {
            m0Var.m(sb, i6);
        }
    }

    public static String f(O o6, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        e(o6, sb, 0);
        return sb.toString();
    }
}
