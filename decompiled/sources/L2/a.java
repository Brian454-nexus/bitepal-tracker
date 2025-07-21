package L2;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URLConnection;
import java.util.zip.GZIPInputStream;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class a {
    public static String a(File file) {
        String canonicalPath = file.getCanonicalPath();
        if (canonicalPath.endsWith("/")) {
            return canonicalPath;
        }
        return canonicalPath + "/";
    }

    public static File b(File file, String str) {
        String a6 = a(file);
        String canonicalPath = new File(file, str).getCanonicalPath();
        if (canonicalPath.startsWith(a6)) {
            return new File(canonicalPath);
        }
        return null;
    }

    public static File c(Context context) {
        return context.getDataDir();
    }

    public static String d(String str) {
        String guessContentTypeFromName = URLConnection.guessContentTypeFromName(str);
        return guessContentTypeFromName == null ? "text/plain" : guessContentTypeFromName;
    }

    public static InputStream e(String str, InputStream inputStream) {
        return str.endsWith(".svgz") ? new GZIPInputStream(inputStream) : inputStream;
    }

    public static InputStream f(File file) {
        return e(file.getPath(), new FileInputStream(file));
    }
}
