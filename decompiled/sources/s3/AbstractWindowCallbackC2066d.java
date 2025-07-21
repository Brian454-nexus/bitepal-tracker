package s3;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: s3.d, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractWindowCallbackC2066d implements Window.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final Window.Callback f18920a;

    public AbstractWindowCallbackC2066d(Window.Callback delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f18920a = delegate;
    }

    public final Window.Callback a() {
        return this.f18920a;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f18920a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f18920a.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f18920a.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f18920a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f18920a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f18920a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public void onActionModeFinished(ActionMode actionMode) {
        this.f18920a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onActionModeStarted(ActionMode actionMode) {
        this.f18920a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onAttachedToWindow() {
        this.f18920a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public void onContentChanged() {
        this.f18920a.onContentChanged();
    }

    @Override // android.view.Window.Callback
    public boolean onCreatePanelMenu(int i6, Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        return this.f18920a.onCreatePanelMenu(i6, menu);
    }

    @Override // android.view.Window.Callback
    public View onCreatePanelView(int i6) {
        return this.f18920a.onCreatePanelView(i6);
    }

    @Override // android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.f18920a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public boolean onMenuItemSelected(int i6, MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return this.f18920a.onMenuItemSelected(i6, item);
    }

    @Override // android.view.Window.Callback
    public boolean onMenuOpened(int i6, Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        return this.f18920a.onMenuOpened(i6, menu);
    }

    @Override // android.view.Window.Callback
    public void onPanelClosed(int i6, Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        this.f18920a.onPanelClosed(i6, menu);
    }

    @Override // android.view.Window.Callback
    public boolean onPreparePanel(int i6, View view, Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        return this.f18920a.onPreparePanel(i6, view, menu);
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested() {
        return this.f18920a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f18920a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public void onWindowFocusChanged(boolean z6) {
        this.f18920a.onWindowFocusChanged(z6);
    }

    @Override // android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f18920a.onWindowStartingActionMode(callback);
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f18920a.onSearchRequested(searchEvent);
    }

    @Override // android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i6) {
        return this.f18920a.onWindowStartingActionMode(callback, i6);
    }
}
