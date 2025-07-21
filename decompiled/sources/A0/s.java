package A0;

import A0.v;
import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.io.ConstantsKt;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    public final AccessibilityNodeInfo f27a;

    /* renamed from: b, reason: collision with root package name */
    public int f28b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f29c = -1;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {

        /* renamed from: A, reason: collision with root package name */
        public static final a f30A;

        /* renamed from: B, reason: collision with root package name */
        public static final a f31B;

        /* renamed from: C, reason: collision with root package name */
        public static final a f32C;

        /* renamed from: D, reason: collision with root package name */
        public static final a f33D;

        /* renamed from: E, reason: collision with root package name */
        public static final a f34E;

        /* renamed from: F, reason: collision with root package name */
        public static final a f35F;

        /* renamed from: G, reason: collision with root package name */
        public static final a f36G;

        /* renamed from: H, reason: collision with root package name */
        public static final a f37H;

        /* renamed from: I, reason: collision with root package name */
        public static final a f38I;

        /* renamed from: J, reason: collision with root package name */
        public static final a f39J;

        /* renamed from: K, reason: collision with root package name */
        public static final a f40K;

        /* renamed from: L, reason: collision with root package name */
        public static final a f41L;

        /* renamed from: M, reason: collision with root package name */
        public static final a f42M;

        /* renamed from: N, reason: collision with root package name */
        public static final a f43N;

        /* renamed from: O, reason: collision with root package name */
        public static final a f44O;

        /* renamed from: P, reason: collision with root package name */
        public static final a f45P;

        /* renamed from: Q, reason: collision with root package name */
        public static final a f46Q;

        /* renamed from: R, reason: collision with root package name */
        public static final a f47R;

        /* renamed from: S, reason: collision with root package name */
        public static final a f48S;

        /* renamed from: T, reason: collision with root package name */
        public static final a f49T;

        /* renamed from: U, reason: collision with root package name */
        public static final a f50U;

        /* renamed from: d, reason: collision with root package name */
        public static final a f51d = new a(1, null);

        /* renamed from: e, reason: collision with root package name */
        public static final a f52e = new a(2, null);

        /* renamed from: f, reason: collision with root package name */
        public static final a f53f = new a(4, null);

        /* renamed from: g, reason: collision with root package name */
        public static final a f54g = new a(8, null);

        /* renamed from: h, reason: collision with root package name */
        public static final a f55h = new a(16, null);

        /* renamed from: i, reason: collision with root package name */
        public static final a f56i = new a(32, null);

        /* renamed from: j, reason: collision with root package name */
        public static final a f57j = new a(64, null);

        /* renamed from: k, reason: collision with root package name */
        public static final a f58k = new a(128, null);

        /* renamed from: l, reason: collision with root package name */
        public static final a f59l = new a(256, null, v.b.class);

        /* renamed from: m, reason: collision with root package name */
        public static final a f60m = new a(ConstantsKt.MINIMUM_BLOCK_SIZE, null, v.b.class);

        /* renamed from: n, reason: collision with root package name */
        public static final a f61n = new a(1024, null, v.c.class);

        /* renamed from: o, reason: collision with root package name */
        public static final a f62o = new a(2048, null, v.c.class);

        /* renamed from: p, reason: collision with root package name */
        public static final a f63p = new a(ConstantsKt.DEFAULT_BLOCK_SIZE, null);

        /* renamed from: q, reason: collision with root package name */
        public static final a f64q = new a(ConstantsKt.DEFAULT_BUFFER_SIZE, null);

        /* renamed from: r, reason: collision with root package name */
        public static final a f65r = new a(16384, null);

        /* renamed from: s, reason: collision with root package name */
        public static final a f66s = new a(32768, null);

        /* renamed from: t, reason: collision with root package name */
        public static final a f67t = new a(65536, null);

        /* renamed from: u, reason: collision with root package name */
        public static final a f68u = new a(131072, null, v.g.class);

        /* renamed from: v, reason: collision with root package name */
        public static final a f69v = new a(262144, null);

        /* renamed from: w, reason: collision with root package name */
        public static final a f70w = new a(524288, null);

        /* renamed from: x, reason: collision with root package name */
        public static final a f71x = new a(1048576, null);

        /* renamed from: y, reason: collision with root package name */
        public static final a f72y = new a(2097152, null, v.h.class);

        /* renamed from: z, reason: collision with root package name */
        public static final a f73z;

        /* renamed from: a, reason: collision with root package name */
        public final Object f74a;

        /* renamed from: b, reason: collision with root package name */
        public final int f75b;

        /* renamed from: c, reason: collision with root package name */
        public final Class f76c;

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction15;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction16;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction17;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction18;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction19;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction20;
            int i6 = Build.VERSION.SDK_INT;
            f73z = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
            f30A = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, v.e.class);
            f31B = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
            f32C = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
            f33D = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
            f34E = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
            f35F = new a(i6 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
            if (i6 >= 29) {
                accessibilityAction20 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
                accessibilityAction = accessibilityAction20;
            } else {
                accessibilityAction = null;
            }
            f36G = new a(accessibilityAction, R.id.accessibilityActionPageDown, null, null, null);
            if (i6 >= 29) {
                accessibilityAction19 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
                accessibilityAction2 = accessibilityAction19;
            } else {
                accessibilityAction2 = null;
            }
            f37H = new a(accessibilityAction2, R.id.accessibilityActionPageLeft, null, null, null);
            if (i6 >= 29) {
                accessibilityAction18 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
                accessibilityAction3 = accessibilityAction18;
            } else {
                accessibilityAction3 = null;
            }
            f38I = new a(accessibilityAction3, R.id.accessibilityActionPageRight, null, null, null);
            f39J = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
            f40K = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, v.f.class);
            f41L = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, null, v.d.class);
            f42M = new a(i6 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
            if (i6 >= 28) {
                accessibilityAction17 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
                accessibilityAction4 = accessibilityAction17;
            } else {
                accessibilityAction4 = null;
            }
            f43N = new a(accessibilityAction4, R.id.accessibilityActionHideTooltip, null, null, null);
            if (i6 >= 30) {
                accessibilityAction16 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
                accessibilityAction5 = accessibilityAction16;
            } else {
                accessibilityAction5 = null;
            }
            f44O = new a(accessibilityAction5, R.id.accessibilityActionPressAndHold, null, null, null);
            if (i6 >= 30) {
                accessibilityAction15 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
                accessibilityAction6 = accessibilityAction15;
            } else {
                accessibilityAction6 = null;
            }
            f45P = new a(accessibilityAction6, R.id.accessibilityActionImeEnter, null, null, null);
            if (i6 >= 32) {
                accessibilityAction14 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
                accessibilityAction7 = accessibilityAction14;
            } else {
                accessibilityAction7 = null;
            }
            f46Q = new a(accessibilityAction7, R.id.ALT, null, null, null);
            if (i6 >= 32) {
                accessibilityAction13 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
                accessibilityAction8 = accessibilityAction13;
            } else {
                accessibilityAction8 = null;
            }
            f47R = new a(accessibilityAction8, R.id.CTRL, null, null, null);
            if (i6 >= 32) {
                accessibilityAction12 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
                accessibilityAction9 = accessibilityAction12;
            } else {
                accessibilityAction9 = null;
            }
            f48S = new a(accessibilityAction9, R.id.FUNCTION, null, null, null);
            if (i6 >= 33) {
                accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
                accessibilityAction10 = accessibilityAction11;
            } else {
                accessibilityAction10 = null;
            }
            f49T = new a(accessibilityAction10, R.id.KEYCODE_0, null, null, null);
            f50U = new a(i6 >= 34 ? d.a() : null, R.id.KEYCODE_3D_MODE, null, null, null);
        }

        public a(int i6, CharSequence charSequence) {
            this(null, i6, charSequence, null, null);
        }

        public int a() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f74a).getId();
        }

        public CharSequence b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f74a).getLabel();
        }

        public boolean c(View view, Bundle bundle) {
            return false;
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            Object obj2 = this.f74a;
            return obj2 == null ? aVar.f74a == null : obj2.equals(aVar.f74a);
        }

        public int hashCode() {
            Object obj = this.f74a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AccessibilityActionCompat: ");
            String f6 = s.f(this.f75b);
            if (f6.equals("ACTION_UNKNOWN") && b() != null) {
                f6 = b().toString();
            }
            sb.append(f6);
            return sb.toString();
        }

        public a(Object obj) {
            this(obj, 0, null, null, null);
        }

        public a(int i6, CharSequence charSequence, Class cls) {
            this(null, i6, charSequence, null, cls);
        }

        public a(Object obj, int i6, CharSequence charSequence, v vVar, Class cls) {
            this.f75b = i6;
            if (obj == null) {
                this.f74a = new AccessibilityNodeInfo.AccessibilityAction(i6, charSequence);
            } else {
                this.f74a = obj;
            }
            this.f76c = cls;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b {
        public static CharSequence a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getStateDescription();
        }

        public static void b(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class c {
        public static String a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getUniqueId();
        }

        public static boolean b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isTextSelectable();
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class d {
        public static AccessibilityNodeInfo.AccessibilityAction a() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
        }

        public static void b(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.getBoundsInWindow(rect);
        }

        public static CharSequence c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getContainerTitle();
        }

        public static boolean d(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isAccessibilityDataSensitive();
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public final Object f77a;

        public e(Object obj) {
            this.f77a = obj;
        }

        public static e a(int i6, int i7, boolean z6, int i8) {
            return new e(AccessibilityNodeInfo.CollectionInfo.obtain(i6, i7, z6, i8));
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class f {

        /* renamed from: a, reason: collision with root package name */
        public final Object f78a;

        public f(Object obj) {
            this.f78a = obj;
        }

        public static f a(int i6, int i7, int i8, int i9, boolean z6, boolean z7) {
            return new f(AccessibilityNodeInfo.CollectionItemInfo.obtain(i6, i7, i8, i9, z6, z7));
        }
    }

    public s(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f27a = accessibilityNodeInfo;
    }

    public static s Z(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new s(accessibilityNodeInfo);
    }

    public static String f(int i6) {
        if (i6 == 1) {
            return "ACTION_FOCUS";
        }
        if (i6 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i6) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case ConstantsKt.MINIMUM_BLOCK_SIZE /* 512 */:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case ConstantsKt.DEFAULT_BLOCK_SIZE /* 4096 */:
                return "ACTION_SCROLL_FORWARD";
            case ConstantsKt.DEFAULT_BUFFER_SIZE /* 8192 */:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case R.id.KEYCODE_3D_MODE:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i6) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i6) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i6) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.ALT:
                                        return "ACTION_DRAG_START";
                                    case R.id.CTRL:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.FUNCTION:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    public static ClickableSpan[] l(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    public boolean A() {
        return this.f27a.isChecked();
    }

    public boolean B() {
        return this.f27a.isClickable();
    }

    public boolean C() {
        return this.f27a.isContextClickable();
    }

    public boolean D() {
        return this.f27a.isEnabled();
    }

    public boolean E() {
        return this.f27a.isFocusable();
    }

    public boolean F() {
        return this.f27a.isFocused();
    }

    public boolean G() {
        return g(67108864);
    }

    public boolean H() {
        return this.f27a.isImportantForAccessibility();
    }

    public boolean I() {
        return this.f27a.isLongClickable();
    }

    public boolean J() {
        return this.f27a.isPassword();
    }

    public boolean K() {
        return this.f27a.isScrollable();
    }

    public boolean L() {
        return this.f27a.isSelected();
    }

    public boolean M() {
        return Build.VERSION.SDK_INT >= 33 ? c.b(this.f27a) : g(8388608);
    }

    public boolean N() {
        return this.f27a.isVisibleToUser();
    }

    public boolean O(int i6, Bundle bundle) {
        return this.f27a.performAction(i6, bundle);
    }

    public final void P(int i6, boolean z6) {
        Bundle p6 = p();
        if (p6 != null) {
            int i7 = p6.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i6);
            if (!z6) {
                i6 = 0;
            }
            p6.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i6 | i7);
        }
    }

    public void Q(CharSequence charSequence) {
        this.f27a.setClassName(charSequence);
    }

    public void R(Object obj) {
        this.f27a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((e) obj).f77a);
    }

    public void S(Object obj) {
        this.f27a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((f) obj).f78a);
    }

    public void T(boolean z6) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f27a.setHeading(z6);
        } else {
            P(2, z6);
        }
    }

    public void U(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f27a.setPaneTitle(charSequence);
        } else {
            this.f27a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public void V(boolean z6) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f27a.setScreenReaderFocusable(z6);
        } else {
            P(1, z6);
        }
    }

    public void W(boolean z6) {
        this.f27a.setScrollable(z6);
    }

    public void X(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            b.b(this.f27a, charSequence);
        } else {
            this.f27a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public AccessibilityNodeInfo Y() {
        return this.f27a;
    }

    public void a(int i6) {
        this.f27a.addAction(i6);
    }

    public void b(a aVar) {
        this.f27a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f74a);
    }

    public void c(CharSequence charSequence, View view) {
    }

    public final List d(String str) {
        ArrayList<Integer> integerArrayList = this.f27a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f27a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public List e() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f27a.getActionList();
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i6 = 0; i6 < size; i6++) {
            arrayList.add(new a(actionList.get(i6)));
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f27a;
        if (accessibilityNodeInfo == null) {
            if (sVar.f27a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(sVar.f27a)) {
            return false;
        }
        return this.f29c == sVar.f29c && this.f28b == sVar.f28b;
    }

    public final boolean g(int i6) {
        Bundle p6 = p();
        return p6 != null && (p6.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i6) == i6;
    }

    public void h(Rect rect) {
        this.f27a.getBoundsInParent(rect);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f27a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public void i(Rect rect) {
        this.f27a.getBoundsInScreen(rect);
    }

    public void j(Rect rect) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.b(this.f27a, rect);
            return;
        }
        Rect rect2 = (Rect) this.f27a.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
        if (rect2 != null) {
            rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
    }

    public CharSequence k() {
        return this.f27a.getClassName();
    }

    public CharSequence m() {
        return Build.VERSION.SDK_INT >= 34 ? d.c(this.f27a) : this.f27a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
    }

    public CharSequence n() {
        return this.f27a.getContentDescription();
    }

    public CharSequence o() {
        return this.f27a.getError();
    }

    public Bundle p() {
        return this.f27a.getExtras();
    }

    public int q() {
        return this.f27a.getMaxTextLength();
    }

    public CharSequence r() {
        return this.f27a.getPackageName();
    }

    public CharSequence s() {
        return Build.VERSION.SDK_INT >= 30 ? b.a(this.f27a) : this.f27a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    }

    public CharSequence t() {
        if (!x()) {
            return this.f27a.getText();
        }
        List d6 = d("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List d7 = d("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List d8 = d("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List d9 = d("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f27a.getText(), 0, this.f27a.getText().length()));
        for (int i6 = 0; i6 < d6.size(); i6++) {
            spannableString.setSpan(new A0.a(((Integer) d9.get(i6)).intValue(), this, p().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) d6.get(i6)).intValue(), ((Integer) d7.get(i6)).intValue(), ((Integer) d8.get(i6)).intValue());
        }
        return spannableString;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        h(rect);
        sb.append("; boundsInParent: " + rect);
        i(rect);
        sb.append("; boundsInScreen: " + rect);
        j(rect);
        sb.append("; boundsInWindow: " + rect);
        sb.append("; packageName: ");
        sb.append(r());
        sb.append("; className: ");
        sb.append(k());
        sb.append("; text: ");
        sb.append(t());
        sb.append("; error: ");
        sb.append(o());
        sb.append("; maxTextLength: ");
        sb.append(q());
        sb.append("; stateDescription: ");
        sb.append(s());
        sb.append("; contentDescription: ");
        sb.append(n());
        sb.append("; tooltipText: ");
        sb.append(u());
        sb.append("; viewIdResName: ");
        sb.append(w());
        sb.append("; uniqueId: ");
        sb.append(v());
        sb.append("; checkable: ");
        sb.append(z());
        sb.append("; checked: ");
        sb.append(A());
        sb.append("; focusable: ");
        sb.append(E());
        sb.append("; focused: ");
        sb.append(F());
        sb.append("; selected: ");
        sb.append(L());
        sb.append("; clickable: ");
        sb.append(B());
        sb.append("; longClickable: ");
        sb.append(I());
        sb.append("; contextClickable: ");
        sb.append(C());
        sb.append("; enabled: ");
        sb.append(D());
        sb.append("; password: ");
        sb.append(J());
        sb.append("; scrollable: " + K());
        sb.append("; containerTitle: ");
        sb.append(m());
        sb.append("; granularScrollingSupported: ");
        sb.append(G());
        sb.append("; importantForAccessibility: ");
        sb.append(H());
        sb.append("; visible: ");
        sb.append(N());
        sb.append("; isTextSelectable: ");
        sb.append(M());
        sb.append("; accessibilityDataSensitive: ");
        sb.append(y());
        sb.append("; [");
        List e6 = e();
        for (int i6 = 0; i6 < e6.size(); i6++) {
            a aVar = (a) e6.get(i6);
            String f6 = f(aVar.a());
            if (f6.equals("ACTION_UNKNOWN") && aVar.b() != null) {
                f6 = aVar.b().toString();
            }
            sb.append(f6);
            if (i6 != e6.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public CharSequence u() {
        CharSequence tooltipText;
        if (Build.VERSION.SDK_INT < 28) {
            return this.f27a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
        }
        tooltipText = this.f27a.getTooltipText();
        return tooltipText;
    }

    public String v() {
        return Build.VERSION.SDK_INT >= 33 ? c.a(this.f27a) : this.f27a.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }

    public String w() {
        return this.f27a.getViewIdResourceName();
    }

    public final boolean x() {
        return !d("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    public boolean y() {
        return Build.VERSION.SDK_INT >= 34 ? d.d(this.f27a) : g(64);
    }

    public boolean z() {
        return this.f27a.isCheckable();
    }
}
