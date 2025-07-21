package com.braze.lrucache;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class h extends ByteArrayOutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f12374a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, int i6) {
        super(i6);
        this.f12374a = iVar;
    }

    @Override // java.io.ByteArrayOutputStream
    public final String toString() {
        int i6 = ((ByteArrayOutputStream) this).count;
        if (i6 > 0) {
            int i7 = i6 - 1;
            if (((ByteArrayOutputStream) this).buf[i7] == 13) {
                i6 = i7;
            }
        }
        try {
            return new String(((ByteArrayOutputStream) this).buf, 0, i6, this.f12374a.f12376b.name());
        } catch (UnsupportedEncodingException e6) {
            throw new AssertionError(e6);
        }
    }
}
