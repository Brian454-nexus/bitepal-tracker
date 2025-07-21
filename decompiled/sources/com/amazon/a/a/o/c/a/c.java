package com.amazon.a.a.o.c.a;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    private final Set<String> f11267a;

    public c(String... strArr) {
        this.f11267a = Collections.unmodifiableSet(new HashSet(Arrays.asList(strArr)));
    }

    @Override // com.amazon.a.a.o.c.a.a
    public boolean a(String str) {
        return this.f11267a.contains(str);
    }
}
