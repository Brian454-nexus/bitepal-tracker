package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* renamed from: androidx.datastore.preferences.protobuf.z, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C1048z extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public O f8973a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8974b;

    /* renamed from: androidx.datastore.preferences.protobuf.z$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a extends C1048z {
        public a(String str) {
            super(str);
        }
    }

    public C1048z(String str) {
        super(str);
        this.f8973a = null;
    }

    public static C1048z b() {
        return new C1048z("Protocol message end-group tag did not match expected tag.");
    }

    public static C1048z c() {
        return new C1048z("Protocol message contained an invalid tag (zero).");
    }

    public static C1048z d() {
        return new C1048z("Protocol message had invalid UTF-8.");
    }

    public static a e() {
        return new a("Protocol message tag had invalid wire type.");
    }

    public static C1048z f() {
        return new C1048z("CodedInputStream encountered a malformed varint.");
    }

    public static C1048z g() {
        return new C1048z("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static C1048z h() {
        return new C1048z("Failed to parse the message.");
    }

    public static C1048z i() {
        return new C1048z("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public static C1048z l() {
        return new C1048z("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public static C1048z m() {
        return new C1048z("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public boolean a() {
        return this.f8974b;
    }

    public void j() {
        this.f8974b = true;
    }

    public C1048z k(O o6) {
        this.f8973a = o6;
        return this;
    }

    public C1048z(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.f8973a = null;
    }
}
