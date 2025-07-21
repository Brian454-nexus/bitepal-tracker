package s0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface b extends MenuItem {
    @Override // android.view.MenuItem
    MenuItem setAlphabeticShortcut(char c6, int i6);

    @Override // android.view.MenuItem
    b setContentDescription(CharSequence charSequence);

    @Override // android.view.MenuItem
    MenuItem setIconTintList(ColorStateList colorStateList);

    @Override // android.view.MenuItem
    MenuItem setIconTintMode(PorterDuff.Mode mode);

    @Override // android.view.MenuItem
    MenuItem setNumericShortcut(char c6, int i6);

    @Override // android.view.MenuItem
    b setTooltipText(CharSequence charSequence);
}
