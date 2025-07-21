package com.bumptech.glide;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final Map f13181a;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Map f13182a = new HashMap();

        public e b() {
            return new e(this);
        }
    }

    public e(a aVar) {
        this.f13181a = Collections.unmodifiableMap(new HashMap(aVar.f13182a));
    }

    public boolean a(Class cls) {
        return this.f13181a.containsKey(cls);
    }
}
