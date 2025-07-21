package C0;

import android.view.View;
import android.widget.PopupWindow;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class g {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {
        public static void a(PopupWindow popupWindow, boolean z6) {
            popupWindow.setOverlapAnchor(z6);
        }

        public static void b(PopupWindow popupWindow, int i6) {
            popupWindow.setWindowLayoutType(i6);
        }
    }

    public static void a(PopupWindow popupWindow, boolean z6) {
        a.a(popupWindow, z6);
    }

    public static void b(PopupWindow popupWindow, int i6) {
        a.b(popupWindow, i6);
    }

    public static void c(PopupWindow popupWindow, View view, int i6, int i7, int i8) {
        popupWindow.showAsDropDown(view, i6, i7, i8);
    }
}
