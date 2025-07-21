package com.amazon.a.a.j;

import java.util.HashMap;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f10988a = "RESPONSE";

    /* renamed from: b, reason: collision with root package name */
    public static final String f10989b = "RESET_OFFSET";

    /* renamed from: d, reason: collision with root package name */
    public static final String f10990d = "RECEIPT_STRING";

    /* renamed from: e, reason: collision with root package name */
    public static final String f10991e = "KIWI_EXECUTION_RESULT_CODE";

    /* renamed from: f, reason: collision with root package name */
    public static final String f10992f = "RECEIPT_DELIVERED";

    /* renamed from: g, reason: collision with root package name */
    public static final String f10993g = "PURCHASE_REQUEST_ID";

    /* renamed from: h, reason: collision with root package name */
    public static final String f10994h = "userId";

    /* renamed from: i, reason: collision with root package name */
    static final /* synthetic */ boolean f10995i = true;

    /* renamed from: c, reason: collision with root package name */
    public final Map<String, Object> f10996c = new HashMap();

    public Object a(String str) {
        return this.f10996c.get(str);
    }

    public boolean b(String str) {
        return this.f10996c.containsKey(str);
    }

    public Object c(String str) {
        return this.f10996c.remove(str);
    }

    public void a(String str, Object obj) {
        this.f10996c.put(str, obj);
    }

    public Object b() {
        return this.f10996c.get(f10988a);
    }

    public void c() {
        this.f10996c.remove(f10988a);
    }

    public boolean a(Class cls) {
        return b(f10988a) && a(f10988a).getClass().equals(cls);
    }

    public void a() {
        this.f10996c.clear();
    }

    public void a(Object obj) {
        if (!f10995i && obj == null) {
            throw new AssertionError();
        }
        this.f10996c.put(f10988a, obj);
    }
}
