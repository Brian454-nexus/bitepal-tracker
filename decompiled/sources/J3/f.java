package J3;

import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import y3.InterfaceC2355a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f2883a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2884b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2885c;

    /* renamed from: d, reason: collision with root package name */
    public final l f2886d;

    /* renamed from: e, reason: collision with root package name */
    public final File f2887e;

    /* renamed from: f, reason: collision with root package name */
    public final String f2888f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC2355a f2889g;

    public f(String instanceName, String str, String str2, l identityStorageProvider, File storageDirectory, String fileName, InterfaceC2355a interfaceC2355a) {
        Intrinsics.checkNotNullParameter(instanceName, "instanceName");
        Intrinsics.checkNotNullParameter(identityStorageProvider, "identityStorageProvider");
        Intrinsics.checkNotNullParameter(storageDirectory, "storageDirectory");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        this.f2883a = instanceName;
        this.f2884b = str;
        this.f2885c = str2;
        this.f2886d = identityStorageProvider;
        this.f2887e = storageDirectory;
        this.f2888f = fileName;
        this.f2889g = interfaceC2355a;
    }

    public final String a() {
        return this.f2884b;
    }

    public final String b() {
        return this.f2885c;
    }

    public final String c() {
        return this.f2888f;
    }

    public final l d() {
        return this.f2886d;
    }

    public final String e() {
        return this.f2883a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.areEqual(this.f2883a, fVar.f2883a) && Intrinsics.areEqual(this.f2884b, fVar.f2884b) && Intrinsics.areEqual(this.f2885c, fVar.f2885c) && Intrinsics.areEqual(this.f2886d, fVar.f2886d) && Intrinsics.areEqual(this.f2887e, fVar.f2887e) && Intrinsics.areEqual(this.f2888f, fVar.f2888f) && Intrinsics.areEqual(this.f2889g, fVar.f2889g);
    }

    public final InterfaceC2355a f() {
        return this.f2889g;
    }

    public final File g() {
        return this.f2887e;
    }

    public int hashCode() {
        int hashCode = this.f2883a.hashCode() * 31;
        String str = this.f2884b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f2885c;
        int hashCode3 = (((((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f2886d.hashCode()) * 31) + this.f2887e.hashCode()) * 31) + this.f2888f.hashCode()) * 31;
        InterfaceC2355a interfaceC2355a = this.f2889g;
        return hashCode3 + (interfaceC2355a != null ? interfaceC2355a.hashCode() : 0);
    }

    public String toString() {
        return "IdentityConfiguration(instanceName=" + this.f2883a + ", apiKey=" + this.f2884b + ", experimentApiKey=" + this.f2885c + ", identityStorageProvider=" + this.f2886d + ", storageDirectory=" + this.f2887e + ", fileName=" + this.f2888f + ", logger=" + this.f2889g + ')';
    }

    public /* synthetic */ f(String str, String str2, String str3, l lVar, File file, String str4, InterfaceC2355a interfaceC2355a, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i6 & 2) != 0 ? null : str2, (i6 & 4) != 0 ? null : str3, lVar, file, str4, (i6 & 64) != 0 ? null : interfaceC2355a);
    }
}
