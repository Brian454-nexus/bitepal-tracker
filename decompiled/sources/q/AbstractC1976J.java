package q;

import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.io.InputStream;

/* renamed from: q.J, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC1976J extends Resources {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f18458a;

    public AbstractC1976J(Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f18458a = resources;
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getAnimation(int i6) {
        return this.f18458a.getAnimation(i6);
    }

    @Override // android.content.res.Resources
    public boolean getBoolean(int i6) {
        return this.f18458a.getBoolean(i6);
    }

    @Override // android.content.res.Resources
    public int getColor(int i6) {
        return this.f18458a.getColor(i6);
    }

    @Override // android.content.res.Resources
    public ColorStateList getColorStateList(int i6) {
        return this.f18458a.getColorStateList(i6);
    }

    @Override // android.content.res.Resources
    public Configuration getConfiguration() {
        return this.f18458a.getConfiguration();
    }

    @Override // android.content.res.Resources
    public float getDimension(int i6) {
        return this.f18458a.getDimension(i6);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelOffset(int i6) {
        return this.f18458a.getDimensionPixelOffset(i6);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelSize(int i6) {
        return this.f18458a.getDimensionPixelSize(i6);
    }

    @Override // android.content.res.Resources
    public DisplayMetrics getDisplayMetrics() {
        return this.f18458a.getDisplayMetrics();
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i6) {
        return this.f18458a.getDrawable(i6);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawableForDensity(int i6, int i7) {
        return this.f18458a.getDrawableForDensity(i6, i7);
    }

    @Override // android.content.res.Resources
    public float getFraction(int i6, int i7, int i8) {
        return this.f18458a.getFraction(i6, i7, i8);
    }

    @Override // android.content.res.Resources
    public int getIdentifier(String str, String str2, String str3) {
        return this.f18458a.getIdentifier(str, str2, str3);
    }

    @Override // android.content.res.Resources
    public int[] getIntArray(int i6) {
        return this.f18458a.getIntArray(i6);
    }

    @Override // android.content.res.Resources
    public int getInteger(int i6) {
        return this.f18458a.getInteger(i6);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getLayout(int i6) {
        return this.f18458a.getLayout(i6);
    }

    @Override // android.content.res.Resources
    public Movie getMovie(int i6) {
        return this.f18458a.getMovie(i6);
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int i6, int i7, Object... objArr) {
        return this.f18458a.getQuantityString(i6, i7, objArr);
    }

    @Override // android.content.res.Resources
    public CharSequence getQuantityText(int i6, int i7) {
        return this.f18458a.getQuantityText(i6, i7);
    }

    @Override // android.content.res.Resources
    public String getResourceEntryName(int i6) {
        return this.f18458a.getResourceEntryName(i6);
    }

    @Override // android.content.res.Resources
    public String getResourceName(int i6) {
        return this.f18458a.getResourceName(i6);
    }

    @Override // android.content.res.Resources
    public String getResourcePackageName(int i6) {
        return this.f18458a.getResourcePackageName(i6);
    }

    @Override // android.content.res.Resources
    public String getResourceTypeName(int i6) {
        return this.f18458a.getResourceTypeName(i6);
    }

    @Override // android.content.res.Resources
    public String getString(int i6) {
        return this.f18458a.getString(i6);
    }

    @Override // android.content.res.Resources
    public String[] getStringArray(int i6) {
        return this.f18458a.getStringArray(i6);
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int i6) {
        return this.f18458a.getText(i6);
    }

    @Override // android.content.res.Resources
    public CharSequence[] getTextArray(int i6) {
        return this.f18458a.getTextArray(i6);
    }

    @Override // android.content.res.Resources
    public void getValue(int i6, TypedValue typedValue, boolean z6) {
        this.f18458a.getValue(i6, typedValue, z6);
    }

    @Override // android.content.res.Resources
    public void getValueForDensity(int i6, int i7, TypedValue typedValue, boolean z6) {
        this.f18458a.getValueForDensity(i6, i7, typedValue, z6);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getXml(int i6) {
        return this.f18458a.getXml(i6);
    }

    @Override // android.content.res.Resources
    public TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return this.f18458a.obtainAttributes(attributeSet, iArr);
    }

    @Override // android.content.res.Resources
    public TypedArray obtainTypedArray(int i6) {
        return this.f18458a.obtainTypedArray(i6);
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int i6) {
        return this.f18458a.openRawResource(i6);
    }

    @Override // android.content.res.Resources
    public AssetFileDescriptor openRawResourceFd(int i6) {
        return this.f18458a.openRawResourceFd(i6);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) {
        this.f18458a.parseBundleExtra(str, attributeSet, bundle);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) {
        this.f18458a.parseBundleExtras(xmlResourceParser, bundle);
    }

    @Override // android.content.res.Resources
    public void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        Resources resources = this.f18458a;
        if (resources != null) {
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i6, Resources.Theme theme) {
        return this.f18458a.getDrawable(i6, theme);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawableForDensity(int i6, int i7, Resources.Theme theme) {
        return this.f18458a.getDrawableForDensity(i6, i7, theme);
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int i6, int i7) {
        return this.f18458a.getQuantityString(i6, i7);
    }

    @Override // android.content.res.Resources
    public String getString(int i6, Object... objArr) {
        return this.f18458a.getString(i6, objArr);
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int i6, CharSequence charSequence) {
        return this.f18458a.getText(i6, charSequence);
    }

    @Override // android.content.res.Resources
    public void getValue(String str, TypedValue typedValue, boolean z6) {
        this.f18458a.getValue(str, typedValue, z6);
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int i6, TypedValue typedValue) {
        return this.f18458a.openRawResource(i6, typedValue);
    }
}
