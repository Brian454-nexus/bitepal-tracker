package q0;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.util.List;
import p0.AbstractC1890d;
import w0.j;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class j extends k {
    public static FontFamily i(CancellationSignal cancellationSignal, j.b[] bVarArr, ContentResolver contentResolver) {
        int i6;
        ParcelFileDescriptor openFileDescriptor;
        int length = bVarArr.length;
        FontFamily.Builder builder = null;
        while (i6 < length) {
            j.b bVar = bVarArr[i6];
            try {
                openFileDescriptor = contentResolver.openFileDescriptor(bVar.d(), "r", cancellationSignal);
            } catch (IOException e6) {
                Log.w("TypefaceCompatApi29Impl", "Font load failed", e6);
            }
            if (openFileDescriptor != null) {
                try {
                    Font build = new Font.Builder(openFileDescriptor).setWeight(bVar.e()).setSlant(bVar.f() ? 1 : 0).setTtcIndex(bVar.c()).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (Throwable th) {
                    try {
                        openFileDescriptor.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                    break;
                }
            } else {
                i6 = openFileDescriptor == null ? i6 + 1 : 0;
            }
            openFileDescriptor.close();
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public static int j(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // q0.k
    public Typeface a(Context context, AbstractC1890d.c cVar, Resources resources, int i6) {
        try {
            FontFamily.Builder builder = null;
            for (AbstractC1890d.C0232d c0232d : cVar.a()) {
                try {
                    Font build = new Font.Builder(resources, c0232d.b()).setWeight(c0232d.e()).setSlant(c0232d.f() ? 1 : 0).setTtcIndex(c0232d.c()).setFontVariationSettings(c0232d.d()).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(h(build2, i6).getStyle()).build();
        } catch (Exception e6) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e6);
            return null;
        }
    }

    @Override // q0.k
    public Typeface b(Context context, CancellationSignal cancellationSignal, j.b[] bVarArr, int i6) {
        try {
            FontFamily i7 = i(cancellationSignal, bVarArr, context.getContentResolver());
            if (i7 == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(i7).setStyle(h(i7, i6).getStyle()).build();
        } catch (Exception e6) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e6);
            return null;
        }
    }

    @Override // q0.k
    public Typeface c(Context context, CancellationSignal cancellationSignal, List list, int i6) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily i7 = i(cancellationSignal, (j.b[]) list.get(0), contentResolver);
            if (i7 == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(i7);
            for (int i8 = 1; i8 < list.size(); i8++) {
                FontFamily i9 = i(cancellationSignal, (j.b[]) list.get(i8), contentResolver);
                if (i9 != null) {
                    customFallbackBuilder.addCustomFallback(i9);
                }
            }
            return customFallbackBuilder.setStyle(h(i7, i6).getStyle()).build();
        } catch (Exception e6) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e6);
            return null;
        }
    }

    @Override // q0.k
    public Typeface d(Context context, Resources resources, int i6, String str, int i7) {
        try {
            Font build = new Font.Builder(resources, i6).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception e6) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e6);
            return null;
        }
    }

    @Override // q0.k
    public j.b g(j.b[] bVarArr, int i6) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    public final Font h(FontFamily fontFamily, int i6) {
        FontStyle fontStyle = new FontStyle((i6 & 1) != 0 ? 700 : 400, (i6 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int j6 = j(fontStyle, font.getStyle());
        for (int i7 = 1; i7 < fontFamily.getSize(); i7++) {
            Font font2 = fontFamily.getFont(i7);
            int j7 = j(fontStyle, font2.getStyle());
            if (j7 < j6) {
                font = font2;
                j6 = j7;
            }
        }
        return font;
    }
}
