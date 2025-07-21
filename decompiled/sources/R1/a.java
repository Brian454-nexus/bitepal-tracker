package R1;

import Z0.x;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import y6.e;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a extends N1.c {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f4571c = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: a, reason: collision with root package name */
    public final CharsetDecoder f4572a = e.c.newDecoder();

    /* renamed from: b, reason: collision with root package name */
    public final CharsetDecoder f4573b = e.b.newDecoder();

    @Override // N1.c
    public x b(N1.b bVar, ByteBuffer byteBuffer) {
        String c6 = c(byteBuffer);
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        String str = null;
        if (c6 == null) {
            return new x(new c(bArr, null, null));
        }
        Matcher matcher = f4571c.matcher(c6);
        String str2 = null;
        for (int i6 = 0; matcher.find(i6); i6 = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String e6 = y6.c.e(group);
                e6.getClass();
                if (e6.equals("streamurl")) {
                    str2 = group2;
                } else if (e6.equals("streamtitle")) {
                    str = group2;
                }
            }
        }
        return new x(new c(bArr, str, str2));
    }

    public final String c(ByteBuffer byteBuffer) {
        try {
            return this.f4572a.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String charBuffer = this.f4573b.decode(byteBuffer).toString();
                this.f4573b.reset();
                byteBuffer.rewind();
                return charBuffer;
            } catch (CharacterCodingException unused2) {
                this.f4573b.reset();
                byteBuffer.rewind();
                return null;
            } catch (Throwable th) {
                this.f4573b.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            this.f4572a.reset();
            byteBuffer.rewind();
        }
    }
}
