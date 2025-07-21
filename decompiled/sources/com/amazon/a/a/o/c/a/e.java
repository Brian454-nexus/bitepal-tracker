package com.amazon.a.a.o.c.a;

import java.util.regex.Pattern;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
final class e implements a {

    /* renamed from: a, reason: collision with root package name */
    private final Pattern f11275a;

    public e(String str) {
        this(Pattern.compile(str));
    }

    @Override // com.amazon.a.a.o.c.a.a
    public boolean a(String str) {
        return this.f11275a.matcher(str).matches();
    }

    public e(Pattern pattern) {
        if (pattern != null) {
            this.f11275a = pattern;
            return;
        }
        throw new IllegalArgumentException("Null pattern");
    }
}
