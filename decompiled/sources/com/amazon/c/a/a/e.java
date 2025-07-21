package com.amazon.c.a.a;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static final String f11413a = String.format("A valid instance of %s is required to have at least one non-blank ID, either developerId or certificateId, and at least one non-blank name, either developerName or commonName.", e.class.getSimpleName());

    /* renamed from: b, reason: collision with root package name */
    private static final String f11414b = String.format("A valid instance of %s is required to have a certificate ID.", e.class.getSimpleName());

    /* renamed from: c, reason: collision with root package name */
    private String f11415c;

    /* renamed from: d, reason: collision with root package name */
    private String f11416d;

    /* renamed from: e, reason: collision with root package name */
    private String f11417e;

    /* renamed from: f, reason: collision with root package name */
    private String f11418f;

    public static String a() {
        return f11413a;
    }

    public static String b() {
        return f11414b;
    }

    public boolean c() {
        return (StringUtils.isBlank(e()) || StringUtils.isBlank(f())) ? false : true;
    }

    public boolean d() {
        return !StringUtils.isBlank(e());
    }

    public String e() {
        if (StringUtils.isBlank(this.f11417e)) {
            return this.f11415c;
        }
        return this.f11417e;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return new EqualsBuilder().append(this.f11417e, eVar.f11417e).append(this.f11418f, eVar.f11418f).append(this.f11415c, eVar.f11415c).append(this.f11416d, eVar.f11416d).isEquals();
    }

    public String f() {
        if (StringUtils.isBlank(this.f11418f)) {
            return this.f11416d;
        }
        return this.f11418f;
    }

    public String g() {
        return this.f11415c;
    }

    public String h() {
        return this.f11416d;
    }

    public int hashCode() {
        return new HashCodeBuilder().append(this.f11417e).append(this.f11418f).append(this.f11415c).append(this.f11416d).toHashCode();
    }

    public String i() {
        return this.f11417e;
    }

    public String j() {
        return this.f11418f;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public e a(String str) {
        this.f11415c = str;
        return this;
    }

    public void b(String str) {
        this.f11415c = str;
    }

    public e c(String str) {
        this.f11416d = str;
        return this;
    }

    public void d(String str) {
        this.f11416d = str;
    }

    public e g(String str) {
        this.f11418f = str;
        return this;
    }

    public void h(String str) {
        this.f11418f = str;
    }

    public e e(String str) {
        this.f11417e = str;
        return this;
    }

    public void f(String str) {
        this.f11417e = str;
    }
}
