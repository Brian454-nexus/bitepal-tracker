package P1;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import kotlin.io.ConstantsKt;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final ByteArrayOutputStream f4300a;

    /* renamed from: b, reason: collision with root package name */
    public final DataOutputStream f4301b;

    public c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(ConstantsKt.MINIMUM_BLOCK_SIZE);
        this.f4300a = byteArrayOutputStream;
        this.f4301b = new DataOutputStream(byteArrayOutputStream);
    }

    public static void b(DataOutputStream dataOutputStream, String str) {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public byte[] a(a aVar) {
        this.f4300a.reset();
        try {
            b(this.f4301b, aVar.f4294a);
            String str = aVar.f4295b;
            if (str == null) {
                str = "";
            }
            b(this.f4301b, str);
            this.f4301b.writeLong(aVar.f4296c);
            this.f4301b.writeLong(aVar.f4297d);
            this.f4301b.write(aVar.f4298e);
            this.f4301b.flush();
            return this.f4300a.toByteArray();
        } catch (IOException e6) {
            throw new RuntimeException(e6);
        }
    }
}
