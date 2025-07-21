package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.android.installreferrer.api.InstallReferrerClient;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import y0.g;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f8585k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a, reason: collision with root package name */
    public int f8586a;

    /* renamed from: b, reason: collision with root package name */
    public Object f8587b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f8588c;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f8589d;

    /* renamed from: e, reason: collision with root package name */
    public int f8590e;

    /* renamed from: f, reason: collision with root package name */
    public int f8591f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f8592g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f8593h;

    /* renamed from: i, reason: collision with root package name */
    public String f8594i;

    /* renamed from: j, reason: collision with root package name */
    public String f8595j;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {
        public static IconCompat a(Object obj) {
            g.f(obj);
            int d6 = d(obj);
            if (d6 == 2) {
                return IconCompat.k(null, c(obj), b(obj));
            }
            if (d6 == 4) {
                return IconCompat.g(e(obj));
            }
            if (d6 == 6) {
                return IconCompat.d(e(obj));
            }
            IconCompat iconCompat = new IconCompat(-1);
            iconCompat.f8587b = obj;
            return iconCompat;
        }

        public static int b(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e6) {
                Log.e("IconCompat", "Unable to get icon resource", e6);
                return 0;
            } catch (NoSuchMethodException e7) {
                Log.e("IconCompat", "Unable to get icon resource", e7);
                return 0;
            } catch (InvocationTargetException e8) {
                Log.e("IconCompat", "Unable to get icon resource", e8);
                return 0;
            }
        }

        public static String c(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e6) {
                Log.e("IconCompat", "Unable to get icon package", e6);
                return null;
            } catch (NoSuchMethodException e7) {
                Log.e("IconCompat", "Unable to get icon package", e7);
                return null;
            } catch (InvocationTargetException e8) {
                Log.e("IconCompat", "Unable to get icon package", e8);
                return null;
            }
        }

        public static int d(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e6) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e6);
                return -1;
            } catch (NoSuchMethodException e7) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e7);
                return -1;
            } catch (InvocationTargetException e8) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e8);
                return -1;
            }
        }

        public static Uri e(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e6) {
                Log.e("IconCompat", "Unable to get icon uri", e6);
                return null;
            } catch (NoSuchMethodException e7) {
                Log.e("IconCompat", "Unable to get icon uri", e7);
                return null;
            } catch (InvocationTargetException e8) {
                Log.e("IconCompat", "Unable to get icon uri", e8);
                return null;
            }
        }

        public static Icon f(IconCompat iconCompat, Context context) {
            Icon createWithBitmap;
            switch (iconCompat.f8586a) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    return (Icon) iconCompat.f8587b;
                case 0:
                default:
                    throw new IllegalArgumentException("Unknown type");
                case 1:
                    createWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f8587b);
                    break;
                case 2:
                    createWithBitmap = Icon.createWithResource(iconCompat.n(), iconCompat.f8590e);
                    break;
                case 3:
                    createWithBitmap = Icon.createWithData((byte[]) iconCompat.f8587b, iconCompat.f8590e, iconCompat.f8591f);
                    break;
                case 4:
                    createWithBitmap = Icon.createWithContentUri((String) iconCompat.f8587b);
                    break;
                case 5:
                    createWithBitmap = b.a((Bitmap) iconCompat.f8587b);
                    break;
                case 6:
                    if (Build.VERSION.SDK_INT >= 30) {
                        createWithBitmap = d.a(iconCompat.p());
                        break;
                    } else {
                        if (context == null) {
                            throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.p());
                        }
                        InputStream q6 = iconCompat.q(context);
                        if (q6 == null) {
                            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.p());
                        }
                        createWithBitmap = b.a(BitmapFactory.decodeStream(q6));
                        break;
                    }
            }
            ColorStateList colorStateList = iconCompat.f8592g;
            if (colorStateList != null) {
                createWithBitmap.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f8593h;
            if (mode != IconCompat.f8585k) {
                createWithBitmap.setTintMode(mode);
            }
            return createWithBitmap;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b {
        public static Icon a(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class c {
        public static int a(Object obj) {
            return ((Icon) obj).getResId();
        }

        public static String b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        public static int c(Object obj) {
            return ((Icon) obj).getType();
        }

        public static Uri d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class d {
        public static Icon a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public IconCompat() {
        this.f8586a = -1;
        this.f8588c = null;
        this.f8589d = null;
        this.f8590e = 0;
        this.f8591f = 0;
        this.f8592g = null;
        this.f8593h = f8585k;
        this.f8594i = null;
    }

    public static IconCompat a(Bundle bundle) {
        int i6 = bundle.getInt("type");
        IconCompat iconCompat = new IconCompat(i6);
        iconCompat.f8590e = bundle.getInt("int1");
        iconCompat.f8591f = bundle.getInt("int2");
        iconCompat.f8595j = bundle.getString("string1");
        if (bundle.containsKey("tint_list")) {
            iconCompat.f8592g = (ColorStateList) bundle.getParcelable("tint_list");
        }
        if (bundle.containsKey("tint_mode")) {
            iconCompat.f8593h = PorterDuff.Mode.valueOf(bundle.getString("tint_mode"));
        }
        switch (i6) {
            case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
            case 1:
            case 5:
                iconCompat.f8587b = bundle.getParcelable("obj");
                return iconCompat;
            case 0:
            default:
                Log.w("IconCompat", "Unknown type " + i6);
                return null;
            case 2:
            case 4:
            case 6:
                iconCompat.f8587b = bundle.getString("obj");
                return iconCompat;
            case 3:
                iconCompat.f8587b = bundle.getByteArray("obj");
                return iconCompat;
        }
    }

    public static IconCompat b(Icon icon) {
        return a.a(icon);
    }

    public static Bitmap c(Bitmap bitmap, boolean z6) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f6 = min;
        float f7 = 0.5f * f6;
        float f8 = 0.9166667f * f7;
        if (z6) {
            float f9 = 0.010416667f * f6;
            paint.setColor(0);
            paint.setShadowLayer(f9, 0.0f, f6 * 0.020833334f, 1023410176);
            canvas.drawCircle(f7, f7, f8, paint);
            paint.setShadowLayer(f9, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f7, f7, f8, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f7, f7, f8, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    public static IconCompat d(Uri uri) {
        y0.b.c(uri);
        return e(uri.toString());
    }

    public static IconCompat e(String str) {
        y0.b.c(str);
        IconCompat iconCompat = new IconCompat(6);
        iconCompat.f8587b = str;
        return iconCompat;
    }

    public static IconCompat f(Bitmap bitmap) {
        y0.b.c(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f8587b = bitmap;
        return iconCompat;
    }

    public static IconCompat g(Uri uri) {
        y0.b.c(uri);
        return h(uri.toString());
    }

    public static IconCompat h(String str) {
        y0.b.c(str);
        IconCompat iconCompat = new IconCompat(4);
        iconCompat.f8587b = str;
        return iconCompat;
    }

    public static IconCompat i(byte[] bArr, int i6, int i7) {
        y0.b.c(bArr);
        IconCompat iconCompat = new IconCompat(3);
        iconCompat.f8587b = bArr;
        iconCompat.f8590e = i6;
        iconCompat.f8591f = i7;
        return iconCompat;
    }

    public static IconCompat j(Context context, int i6) {
        y0.b.c(context);
        return k(context.getResources(), context.getPackageName(), i6);
    }

    public static IconCompat k(Resources resources, String str, int i6) {
        y0.b.c(str);
        if (i6 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f8590e = i6;
        if (resources != null) {
            try {
                iconCompat.f8587b = resources.getResourceName(i6);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f8587b = str;
        }
        iconCompat.f8595j = str;
        return iconCompat;
    }

    public static String w(int i6) {
        switch (i6) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    public Bitmap l() {
        int i6 = this.f8586a;
        if (i6 == -1) {
            Object obj = this.f8587b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        if (i6 == 1) {
            return (Bitmap) this.f8587b;
        }
        if (i6 == 5) {
            return c((Bitmap) this.f8587b, true);
        }
        throw new IllegalStateException("called getBitmap() on " + this);
    }

    public int m() {
        int i6 = this.f8586a;
        if (i6 == -1) {
            return a.b(this.f8587b);
        }
        if (i6 == 2) {
            return this.f8590e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public String n() {
        int i6 = this.f8586a;
        if (i6 == -1) {
            return a.c(this.f8587b);
        }
        if (i6 == 2) {
            String str = this.f8595j;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f8587b).split(":", -1)[0] : this.f8595j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public int o() {
        int i6 = this.f8586a;
        return i6 == -1 ? a.d(this.f8587b) : i6;
    }

    public Uri p() {
        int i6 = this.f8586a;
        if (i6 == -1) {
            return a.e(this.f8587b);
        }
        if (i6 == 4 || i6 == 6) {
            return Uri.parse((String) this.f8587b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public InputStream q(Context context) {
        Uri p6 = p();
        String scheme = p6.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(p6);
            } catch (Exception e6) {
                Log.w("IconCompat", "Unable to load image from URI: " + p6, e6);
                return null;
            }
        }
        try {
            return new FileInputStream(new File((String) this.f8587b));
        } catch (FileNotFoundException e7) {
            Log.w("IconCompat", "Unable to load image from path: " + p6, e7);
            return null;
        }
    }

    public void r() {
        this.f8593h = PorterDuff.Mode.valueOf(this.f8594i);
        switch (this.f8586a) {
            case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                Parcelable parcelable = this.f8589d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                this.f8587b = parcelable;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                Parcelable parcelable2 = this.f8589d;
                if (parcelable2 != null) {
                    this.f8587b = parcelable2;
                    return;
                }
                byte[] bArr = this.f8588c;
                this.f8587b = bArr;
                this.f8586a = 3;
                this.f8590e = 0;
                this.f8591f = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f8588c, Charset.forName("UTF-16"));
                this.f8587b = str;
                if (this.f8586a == 2 && this.f8595j == null) {
                    this.f8595j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f8587b = this.f8588c;
                return;
        }
    }

    public void s(boolean z6) {
        this.f8594i = this.f8593h.name();
        switch (this.f8586a) {
            case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                if (z6) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                this.f8589d = (Parcelable) this.f8587b;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (!z6) {
                    this.f8589d = (Parcelable) this.f8587b;
                    return;
                }
                Bitmap bitmap = (Bitmap) this.f8587b;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                this.f8588c = byteArrayOutputStream.toByteArray();
                return;
            case 2:
                this.f8588c = ((String) this.f8587b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f8588c = (byte[]) this.f8587b;
                return;
            case 4:
            case 6:
                this.f8588c = this.f8587b.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
    }

    public Bundle t() {
        Bundle bundle = new Bundle();
        switch (this.f8586a) {
            case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                bundle.putParcelable("obj", (Parcelable) this.f8587b);
                break;
            case 0:
            default:
                throw new IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                bundle.putParcelable("obj", (Bitmap) this.f8587b);
                break;
            case 2:
            case 4:
            case 6:
                bundle.putString("obj", (String) this.f8587b);
                break;
            case 3:
                bundle.putByteArray("obj", (byte[]) this.f8587b);
                break;
        }
        bundle.putInt("type", this.f8586a);
        bundle.putInt("int1", this.f8590e);
        bundle.putInt("int2", this.f8591f);
        bundle.putString("string1", this.f8595j);
        ColorStateList colorStateList = this.f8592g;
        if (colorStateList != null) {
            bundle.putParcelable("tint_list", colorStateList);
        }
        PorterDuff.Mode mode = this.f8593h;
        if (mode != f8585k) {
            bundle.putString("tint_mode", mode.name());
        }
        return bundle;
    }

    public String toString() {
        if (this.f8586a == -1) {
            return String.valueOf(this.f8587b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(w(this.f8586a));
        switch (this.f8586a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f8587b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f8587b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f8595j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(m())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f8590e);
                if (this.f8591f != 0) {
                    sb.append(" off=");
                    sb.append(this.f8591f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f8587b);
                break;
        }
        if (this.f8592g != null) {
            sb.append(" tint=");
            sb.append(this.f8592g);
        }
        if (this.f8593h != f8585k) {
            sb.append(" mode=");
            sb.append(this.f8593h);
        }
        sb.append(")");
        return sb.toString();
    }

    public Icon u() {
        return v(null);
    }

    public Icon v(Context context) {
        return a.f(this, context);
    }

    public IconCompat(int i6) {
        this.f8588c = null;
        this.f8589d = null;
        this.f8590e = 0;
        this.f8591f = 0;
        this.f8592g = null;
        this.f8593h = f8585k;
        this.f8594i = null;
        this.f8586a = i6;
    }
}
