package trikita.anvil.design;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.design.internal.ForegroundLinearLayout;
import android.support.design.internal.NavigationMenuItemView;
import android.support.design.internal.NavigationMenuView;
import android.support.design.internal.ScrimInsetsFrameLayout;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabItem;
import android.support.design.widget.TabLayout;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v4.view.ViewPager;
import android.view.View;
import java.lang.Boolean;
import java.lang.CharSequence;
import java.lang.Float;
import java.lang.Integer;
import java.lang.Void;
import trikita.anvil.Anvil;
import trikita.anvil.BaseDSL;

/**
 * DSL for creating views and settings their attributes.
 * This file has been generated by {@code gradle generateDesignDSL}.
 * It contains views and their setters from the library design.
 * Please, don't edit it manually unless for debugging.
 */
public final class DesignDSL {
  public static BaseDSL.ViewClassResult foregroundLinearLayout() {
    return BaseDSL.v(ForegroundLinearLayout.class);
  }

  public static Void foregroundLinearLayout(Anvil.Renderable r) {
    return BaseDSL.v(ForegroundLinearLayout.class, r);
  }

  public static BaseDSL.ViewClassResult navigationMenuItemView() {
    return BaseDSL.v(NavigationMenuItemView.class);
  }

  public static Void navigationMenuItemView(Anvil.Renderable r) {
    return BaseDSL.v(NavigationMenuItemView.class, r);
  }

  public static BaseDSL.ViewClassResult navigationMenuView() {
    return BaseDSL.v(NavigationMenuView.class);
  }

  public static Void navigationMenuView(Anvil.Renderable r) {
    return BaseDSL.v(NavigationMenuView.class, r);
  }

  public static BaseDSL.ViewClassResult scrimInsetsFrameLayout() {
    return BaseDSL.v(ScrimInsetsFrameLayout.class);
  }

  public static Void scrimInsetsFrameLayout(Anvil.Renderable r) {
    return BaseDSL.v(ScrimInsetsFrameLayout.class, r);
  }

  public static BaseDSL.ViewClassResult appBarLayout() {
    return BaseDSL.v(AppBarLayout.class);
  }

  public static Void appBarLayout(Anvil.Renderable r) {
    return BaseDSL.v(AppBarLayout.class, r);
  }

  public static BaseDSL.ViewClassResult collapsingToolbarLayout() {
    return BaseDSL.v(CollapsingToolbarLayout.class);
  }

  public static Void collapsingToolbarLayout(Anvil.Renderable r) {
    return BaseDSL.v(CollapsingToolbarLayout.class, r);
  }

  public static BaseDSL.ViewClassResult coordinatorLayout() {
    return BaseDSL.v(CoordinatorLayout.class);
  }

  public static Void coordinatorLayout(Anvil.Renderable r) {
    return BaseDSL.v(CoordinatorLayout.class, r);
  }

  public static BaseDSL.ViewClassResult floatingActionButton() {
    return BaseDSL.v(FloatingActionButton.class);
  }

  public static Void floatingActionButton(Anvil.Renderable r) {
    return BaseDSL.v(FloatingActionButton.class, r);
  }

  public static BaseDSL.ViewClassResult navigationView() {
    return BaseDSL.v(NavigationView.class);
  }

  public static Void navigationView(Anvil.Renderable r) {
    return BaseDSL.v(NavigationView.class, r);
  }

  public static BaseDSL.ViewClassResult tabItem() {
    return BaseDSL.v(TabItem.class);
  }

  public static Void tabItem(Anvil.Renderable r) {
    return BaseDSL.v(TabItem.class, r);
  }

  public static BaseDSL.ViewClassResult tabLayout() {
    return BaseDSL.v(TabLayout.class);
  }

  public static Void tabLayout(Anvil.Renderable r) {
    return BaseDSL.v(TabLayout.class, r);
  }

  public static BaseDSL.ViewClassResult textInputEditText() {
    return BaseDSL.v(TextInputEditText.class);
  }

  public static Void textInputEditText(Anvil.Renderable r) {
    return BaseDSL.v(TextInputEditText.class, r);
  }

  public static BaseDSL.ViewClassResult textInputLayout() {
    return BaseDSL.v(TextInputLayout.class);
  }

  public static Void textInputLayout(Anvil.Renderable r) {
    return BaseDSL.v(TextInputLayout.class, r);
  }

  public static Void backgroundTintList(ColorStateList arg) {
    return BaseDSL.attr(BackgroundTintListFunc9e5e0e4e.instance, arg);
  }

  public static Void backgroundTintMode(PorterDuff.Mode arg) {
    return BaseDSL.attr(BackgroundTintModeFuncabb7a84e.instance, arg);
  }

  public static Void checkable(boolean arg) {
    return BaseDSL.attr(CheckableFunc148d6054.instance, arg);
  }

  public static Void checked(boolean arg) {
    return BaseDSL.attr(CheckedFunc148d6054.instance, arg);
  }

  public static Void checkedItem(int arg) {
    return BaseDSL.attr(CheckedItemFunc8567756a.instance, arg);
  }

  public static Void collapsedTitleGravity(int arg) {
    return BaseDSL.attr(CollapsedTitleGravityFunc8567756a.instance, arg);
  }

  public static Void collapsedTitleTextAppearance(int arg) {
    return BaseDSL.attr(CollapsedTitleTextAppearanceFunc8567756a.instance, arg);
  }

  public static Void collapsedTitleTextColor(int arg) {
    return BaseDSL.attr(CollapsedTitleTextColorFunc8567756a.instance, arg);
  }

  public static Void collapsedTitleTypeface(Typeface arg) {
    return BaseDSL.attr(CollapsedTitleTypefaceFunc53b4afb.instance, arg);
  }

  public static Void compatElevation(float arg) {
    return BaseDSL.attr(CompatElevationFunce0893188.instance, arg);
  }

  public static Void contentScrim(Drawable arg) {
    return BaseDSL.attr(ContentScrimFuncfb47464a.instance, arg);
  }

  public static Void contentScrimColor(int arg) {
    return BaseDSL.attr(ContentScrimColorFunc8567756a.instance, arg);
  }

  public static Void contentScrimResource(int arg) {
    return BaseDSL.attr(ContentScrimResourceFunc8567756a.instance, arg);
  }

  public static Void counterEnabled(boolean arg) {
    return BaseDSL.attr(CounterEnabledFunc148d6054.instance, arg);
  }

  public static Void counterMaxLength(int arg) {
    return BaseDSL.attr(CounterMaxLengthFunc8567756a.instance, arg);
  }

  public static Void error(CharSequence arg) {
    return BaseDSL.attr(ErrorFuncc0af808b.instance, arg);
  }

  public static Void errorEnabled(boolean arg) {
    return BaseDSL.attr(ErrorEnabledFunc148d6054.instance, arg);
  }

  public static Void expanded(boolean arg) {
    return BaseDSL.attr(ExpandedFunc148d6054.instance, arg);
  }

  public static Void expandedTitleColor(int arg) {
    return BaseDSL.attr(ExpandedTitleColorFunc8567756a.instance, arg);
  }

  public static Void expandedTitleGravity(int arg) {
    return BaseDSL.attr(ExpandedTitleGravityFunc8567756a.instance, arg);
  }

  public static Void expandedTitleMarginBottom(int arg) {
    return BaseDSL.attr(ExpandedTitleMarginBottomFunc8567756a.instance, arg);
  }

  public static Void expandedTitleMarginEnd(int arg) {
    return BaseDSL.attr(ExpandedTitleMarginEndFunc8567756a.instance, arg);
  }

  public static Void expandedTitleMarginStart(int arg) {
    return BaseDSL.attr(ExpandedTitleMarginStartFunc8567756a.instance, arg);
  }

  public static Void expandedTitleMarginTop(int arg) {
    return BaseDSL.attr(ExpandedTitleMarginTopFunc8567756a.instance, arg);
  }

  public static Void expandedTitleTextAppearance(int arg) {
    return BaseDSL.attr(ExpandedTitleTextAppearanceFunc8567756a.instance, arg);
  }

  public static Void expandedTitleTypeface(Typeface arg) {
    return BaseDSL.attr(ExpandedTitleTypefaceFunc53b4afb.instance, arg);
  }

  public static Void foreground(Drawable arg) {
    return BaseDSL.attr(ForegroundFuncfb47464a.instance, arg);
  }

  public static Void foregroundGravity(int arg) {
    return BaseDSL.attr(ForegroundGravityFunc8567756a.instance, arg);
  }

  public static Void hint(CharSequence arg) {
    return BaseDSL.attr(HintFuncc0af808b.instance, arg);
  }

  public static Void hintAnimationEnabled(boolean arg) {
    return BaseDSL.attr(HintAnimationEnabledFunc148d6054.instance, arg);
  }

  public static Void hintEnabled(boolean arg) {
    return BaseDSL.attr(HintEnabledFunc148d6054.instance, arg);
  }

  public static Void hintTextAppearance(int arg) {
    return BaseDSL.attr(HintTextAppearanceFunc8567756a.instance, arg);
  }

  public static Void icon(Drawable arg) {
    return BaseDSL.attr(IconFuncfb47464a.instance, arg);
  }

  public static Void itemBackground(Drawable arg) {
    return BaseDSL.attr(ItemBackgroundFuncfb47464a.instance, arg);
  }

  public static Void itemBackgroundResource(int arg) {
    return BaseDSL.attr(ItemBackgroundResourceFunc8567756a.instance, arg);
  }

  public static Void itemIconTintList(ColorStateList arg) {
    return BaseDSL.attr(ItemIconTintListFunc9e5e0e4e.instance, arg);
  }

  public static Void itemTextAppearance(int arg) {
    return BaseDSL.attr(ItemTextAppearanceFunc8567756a.instance, arg);
  }

  public static Void itemTextColor(ColorStateList arg) {
    return BaseDSL.attr(ItemTextColorFunc9e5e0e4e.instance, arg);
  }

  public static Void navigationItemSelectedListener(NavigationView.OnNavigationItemSelectedListener arg) {
    return BaseDSL.attr(NavigationItemSelectedListenerFunc80db0872.instance, arg);
  }

  public static Void onTabSelected(TabLayout.OnTabSelectedListener arg) {
    return BaseDSL.attr(OnTabSelectedFuncaa1c085e.instance, arg);
  }

  public static Void rippleColor(int arg) {
    return BaseDSL.attr(RippleColorFunc8567756a.instance, arg);
  }

  public static Void scrimsShown(boolean arg) {
    return BaseDSL.attr(ScrimsShownFunc148d6054.instance, arg);
  }

  public static Void selectedTabIndicatorColor(int arg) {
    return BaseDSL.attr(SelectedTabIndicatorColorFunc8567756a.instance, arg);
  }

  public static Void selectedTabIndicatorHeight(int arg) {
    return BaseDSL.attr(SelectedTabIndicatorHeightFunc8567756a.instance, arg);
  }

  public static Void statusBarBackground(Drawable arg) {
    return BaseDSL.attr(StatusBarBackgroundFuncfb47464a.instance, arg);
  }

  public static Void statusBarBackgroundColor(int arg) {
    return BaseDSL.attr(StatusBarBackgroundColorFunc8567756a.instance, arg);
  }

  public static Void statusBarBackgroundResource(int arg) {
    return BaseDSL.attr(StatusBarBackgroundResourceFunc8567756a.instance, arg);
  }

  public static Void statusBarScrim(Drawable arg) {
    return BaseDSL.attr(StatusBarScrimFuncfb47464a.instance, arg);
  }

  public static Void statusBarScrimColor(int arg) {
    return BaseDSL.attr(StatusBarScrimColorFunc8567756a.instance, arg);
  }

  public static Void statusBarScrimResource(int arg) {
    return BaseDSL.attr(StatusBarScrimResourceFunc8567756a.instance, arg);
  }

  public static Void tabGravity(int arg) {
    return BaseDSL.attr(TabGravityFunc8567756a.instance, arg);
  }

  public static Void tabMode(int arg) {
    return BaseDSL.attr(TabModeFunc8567756a.instance, arg);
  }

  public static Void tabTextColors(ColorStateList arg) {
    return BaseDSL.attr(TabTextColorsFunc9e5e0e4e.instance, arg);
  }

  public static Void targetElevation(float arg) {
    return BaseDSL.attr(TargetElevationFunce0893188.instance, arg);
  }

  public static Void textColor(ColorStateList arg) {
    return BaseDSL.attr(TextColorFunc9e5e0e4e.instance, arg);
  }

  public static Void title(CharSequence arg) {
    return BaseDSL.attr(TitleFuncc0af808b.instance, arg);
  }

  public static Void titleEnabled(boolean arg) {
    return BaseDSL.attr(TitleEnabledFunc148d6054.instance, arg);
  }

  public static Void typeface(Typeface arg) {
    return BaseDSL.attr(TypefaceFunc53b4afb.instance, arg);
  }

  public static Void upWithViewPager(ViewPager arg) {
    return BaseDSL.attr(UpWithViewPagerFunc648eda47.instance, arg);
  }

  public static Void useCompatPadding(boolean arg) {
    return BaseDSL.attr(UseCompatPaddingFunc148d6054.instance, arg);
  }

  private static final class BackgroundTintListFunc9e5e0e4e implements Anvil.AttrFunc<ColorStateList> {
    public static final BackgroundTintListFunc9e5e0e4e instance = new BackgroundTintListFunc9e5e0e4e();

    public void apply(View v, final ColorStateList arg, final ColorStateList old) {
      if (v instanceof FloatingActionButton) {
        ((FloatingActionButton) v).setBackgroundTintList(arg);
      }
    }
  }

  private static final class BackgroundTintModeFuncabb7a84e implements Anvil.AttrFunc<PorterDuff.Mode> {
    public static final BackgroundTintModeFuncabb7a84e instance = new BackgroundTintModeFuncabb7a84e();

    public void apply(View v, final PorterDuff.Mode arg, final PorterDuff.Mode old) {
      if (v instanceof FloatingActionButton) {
        ((FloatingActionButton) v).setBackgroundTintMode(arg);
      }
    }
  }

  private static final class CheckableFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final CheckableFunc148d6054 instance = new CheckableFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof NavigationMenuItemView) {
        ((NavigationMenuItemView) v).setCheckable(arg);
      }
    }
  }

  private static final class CheckedFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final CheckedFunc148d6054 instance = new CheckedFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof NavigationMenuItemView) {
        ((NavigationMenuItemView) v).setChecked(arg);
      }
    }
  }

  private static final class CheckedItemFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final CheckedItemFunc8567756a instance = new CheckedItemFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof NavigationView) {
        ((NavigationView) v).setCheckedItem(arg);
      }
    }
  }

  private static final class CollapsedTitleGravityFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final CollapsedTitleGravityFunc8567756a instance = new CollapsedTitleGravityFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof CollapsingToolbarLayout) {
        ((CollapsingToolbarLayout) v).setCollapsedTitleGravity(arg);
      }
    }
  }

  private static final class CollapsedTitleTextAppearanceFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final CollapsedTitleTextAppearanceFunc8567756a instance = new CollapsedTitleTextAppearanceFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof CollapsingToolbarLayout) {
        ((CollapsingToolbarLayout) v).setCollapsedTitleTextAppearance(arg);
      }
    }
  }

  private static final class CollapsedTitleTextColorFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final CollapsedTitleTextColorFunc8567756a instance = new CollapsedTitleTextColorFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof CollapsingToolbarLayout) {
        ((CollapsingToolbarLayout) v).setCollapsedTitleTextColor(arg);
      }
    }
  }

  private static final class CollapsedTitleTypefaceFunc53b4afb implements Anvil.AttrFunc<Typeface> {
    public static final CollapsedTitleTypefaceFunc53b4afb instance = new CollapsedTitleTypefaceFunc53b4afb();

    public void apply(View v, final Typeface arg, final Typeface old) {
      if (v instanceof CollapsingToolbarLayout) {
        ((CollapsingToolbarLayout) v).setCollapsedTitleTypeface(arg);
      }
    }
  }

  private static final class CompatElevationFunce0893188 implements Anvil.AttrFunc<Float> {
    public static final CompatElevationFunce0893188 instance = new CompatElevationFunce0893188();

    public void apply(View v, final Float arg, final Float old) {
      if (v instanceof FloatingActionButton) {
        ((FloatingActionButton) v).setCompatElevation(arg);
      }
    }
  }

  private static final class ContentScrimFuncfb47464a implements Anvil.AttrFunc<Drawable> {
    public static final ContentScrimFuncfb47464a instance = new ContentScrimFuncfb47464a();

    public void apply(View v, final Drawable arg, final Drawable old) {
      if (v instanceof CollapsingToolbarLayout) {
        ((CollapsingToolbarLayout) v).setContentScrim(arg);
      }
    }
  }

  private static final class ContentScrimColorFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final ContentScrimColorFunc8567756a instance = new ContentScrimColorFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof CollapsingToolbarLayout) {
        ((CollapsingToolbarLayout) v).setContentScrimColor(arg);
      }
    }
  }

  private static final class ContentScrimResourceFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final ContentScrimResourceFunc8567756a instance = new ContentScrimResourceFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof CollapsingToolbarLayout) {
        ((CollapsingToolbarLayout) v).setContentScrimResource(arg);
      }
    }
  }

  private static final class CounterEnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final CounterEnabledFunc148d6054 instance = new CounterEnabledFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof TextInputLayout) {
        ((TextInputLayout) v).setCounterEnabled(arg);
      }
    }
  }

  private static final class CounterMaxLengthFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final CounterMaxLengthFunc8567756a instance = new CounterMaxLengthFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof TextInputLayout) {
        ((TextInputLayout) v).setCounterMaxLength(arg);
      }
    }
  }

  private static final class ErrorFuncc0af808b implements Anvil.AttrFunc<CharSequence> {
    public static final ErrorFuncc0af808b instance = new ErrorFuncc0af808b();

    public void apply(View v, final CharSequence arg, final CharSequence old) {
      if (v instanceof TextInputLayout) {
        ((TextInputLayout) v).setError(arg);
      }
    }
  }

  private static final class ErrorEnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final ErrorEnabledFunc148d6054 instance = new ErrorEnabledFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof TextInputLayout) {
        ((TextInputLayout) v).setErrorEnabled(arg);
      }
    }
  }

  private static final class ExpandedFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final ExpandedFunc148d6054 instance = new ExpandedFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof AppBarLayout) {
        ((AppBarLayout) v).setExpanded(arg);
      }
    }
  }

  private static final class ExpandedTitleColorFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final ExpandedTitleColorFunc8567756a instance = new ExpandedTitleColorFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof CollapsingToolbarLayout) {
        ((CollapsingToolbarLayout) v).setExpandedTitleColor(arg);
      }
    }
  }

  private static final class ExpandedTitleGravityFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final ExpandedTitleGravityFunc8567756a instance = new ExpandedTitleGravityFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof CollapsingToolbarLayout) {
        ((CollapsingToolbarLayout) v).setExpandedTitleGravity(arg);
      }
    }
  }

  private static final class ExpandedTitleMarginBottomFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final ExpandedTitleMarginBottomFunc8567756a instance = new ExpandedTitleMarginBottomFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof CollapsingToolbarLayout) {
        ((CollapsingToolbarLayout) v).setExpandedTitleMarginBottom(arg);
      }
    }
  }

  private static final class ExpandedTitleMarginEndFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final ExpandedTitleMarginEndFunc8567756a instance = new ExpandedTitleMarginEndFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof CollapsingToolbarLayout) {
        ((CollapsingToolbarLayout) v).setExpandedTitleMarginEnd(arg);
      }
    }
  }

  private static final class ExpandedTitleMarginStartFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final ExpandedTitleMarginStartFunc8567756a instance = new ExpandedTitleMarginStartFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof CollapsingToolbarLayout) {
        ((CollapsingToolbarLayout) v).setExpandedTitleMarginStart(arg);
      }
    }
  }

  private static final class ExpandedTitleMarginTopFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final ExpandedTitleMarginTopFunc8567756a instance = new ExpandedTitleMarginTopFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof CollapsingToolbarLayout) {
        ((CollapsingToolbarLayout) v).setExpandedTitleMarginTop(arg);
      }
    }
  }

  private static final class ExpandedTitleTextAppearanceFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final ExpandedTitleTextAppearanceFunc8567756a instance = new ExpandedTitleTextAppearanceFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof CollapsingToolbarLayout) {
        ((CollapsingToolbarLayout) v).setExpandedTitleTextAppearance(arg);
      }
    }
  }

  private static final class ExpandedTitleTypefaceFunc53b4afb implements Anvil.AttrFunc<Typeface> {
    public static final ExpandedTitleTypefaceFunc53b4afb instance = new ExpandedTitleTypefaceFunc53b4afb();

    public void apply(View v, final Typeface arg, final Typeface old) {
      if (v instanceof CollapsingToolbarLayout) {
        ((CollapsingToolbarLayout) v).setExpandedTitleTypeface(arg);
      }
    }
  }

  private static final class ForegroundFuncfb47464a implements Anvil.AttrFunc<Drawable> {
    public static final ForegroundFuncfb47464a instance = new ForegroundFuncfb47464a();

    public void apply(View v, final Drawable arg, final Drawable old) {
      if (v instanceof ForegroundLinearLayout) {
        ((ForegroundLinearLayout) v).setForeground(arg);
      }
    }
  }

  private static final class ForegroundGravityFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final ForegroundGravityFunc8567756a instance = new ForegroundGravityFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof ForegroundLinearLayout) {
        ((ForegroundLinearLayout) v).setForegroundGravity(arg);
      }
    }
  }

  private static final class HintFuncc0af808b implements Anvil.AttrFunc<CharSequence> {
    public static final HintFuncc0af808b instance = new HintFuncc0af808b();

    public void apply(View v, final CharSequence arg, final CharSequence old) {
      if (v instanceof TextInputLayout) {
        ((TextInputLayout) v).setHint(arg);
      }
    }
  }

  private static final class HintAnimationEnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final HintAnimationEnabledFunc148d6054 instance = new HintAnimationEnabledFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof TextInputLayout) {
        ((TextInputLayout) v).setHintAnimationEnabled(arg);
      }
    }
  }

  private static final class HintEnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final HintEnabledFunc148d6054 instance = new HintEnabledFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof TextInputLayout) {
        ((TextInputLayout) v).setHintEnabled(arg);
      }
    }
  }

  private static final class HintTextAppearanceFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final HintTextAppearanceFunc8567756a instance = new HintTextAppearanceFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof TextInputLayout) {
        ((TextInputLayout) v).setHintTextAppearance(arg);
      }
    }
  }

  private static final class IconFuncfb47464a implements Anvil.AttrFunc<Drawable> {
    public static final IconFuncfb47464a instance = new IconFuncfb47464a();

    public void apply(View v, final Drawable arg, final Drawable old) {
      if (v instanceof NavigationMenuItemView) {
        ((NavigationMenuItemView) v).setIcon(arg);
      }
    }
  }

  private static final class ItemBackgroundFuncfb47464a implements Anvil.AttrFunc<Drawable> {
    public static final ItemBackgroundFuncfb47464a instance = new ItemBackgroundFuncfb47464a();

    public void apply(View v, final Drawable arg, final Drawable old) {
      if (v instanceof NavigationView) {
        ((NavigationView) v).setItemBackground(arg);
      }
    }
  }

  private static final class ItemBackgroundResourceFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final ItemBackgroundResourceFunc8567756a instance = new ItemBackgroundResourceFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof NavigationView) {
        ((NavigationView) v).setItemBackgroundResource(arg);
      }
    }
  }

  private static final class ItemIconTintListFunc9e5e0e4e implements Anvil.AttrFunc<ColorStateList> {
    public static final ItemIconTintListFunc9e5e0e4e instance = new ItemIconTintListFunc9e5e0e4e();

    public void apply(View v, final ColorStateList arg, final ColorStateList old) {
      if (v instanceof NavigationView) {
        ((NavigationView) v).setItemIconTintList(arg);
      }
    }
  }

  private static final class ItemTextAppearanceFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final ItemTextAppearanceFunc8567756a instance = new ItemTextAppearanceFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof NavigationView) {
        ((NavigationView) v).setItemTextAppearance(arg);
      }
    }
  }

  private static final class ItemTextColorFunc9e5e0e4e implements Anvil.AttrFunc<ColorStateList> {
    public static final ItemTextColorFunc9e5e0e4e instance = new ItemTextColorFunc9e5e0e4e();

    public void apply(View v, final ColorStateList arg, final ColorStateList old) {
      if (v instanceof NavigationView) {
        ((NavigationView) v).setItemTextColor(arg);
      }
    }
  }

  private static final class NavigationItemSelectedListenerFunc80db0872 implements Anvil.AttrFunc<NavigationView.OnNavigationItemSelectedListener> {
    public static final NavigationItemSelectedListenerFunc80db0872 instance = new NavigationItemSelectedListenerFunc80db0872();

    public void apply(View v, final NavigationView.OnNavigationItemSelectedListener arg, final NavigationView.OnNavigationItemSelectedListener old) {
      if (v instanceof NavigationView) {
        ((NavigationView) v).setNavigationItemSelectedListener(arg);
      }
    }
  }

  private static final class OnTabSelectedFuncaa1c085e implements Anvil.AttrFunc<TabLayout.OnTabSelectedListener> {
    public static final OnTabSelectedFuncaa1c085e instance = new OnTabSelectedFuncaa1c085e();

    public void apply(View v, final TabLayout.OnTabSelectedListener arg, final TabLayout.OnTabSelectedListener old) {
      if (v instanceof TabLayout) {
        if (arg != null) {
          ((TabLayout) v).setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            public void onTabReselected(TabLayout.Tab a0) {
              arg.onTabReselected(a0);
              Anvil.render();
            }

            public void onTabSelected(TabLayout.Tab a0) {
              arg.onTabSelected(a0);
              Anvil.render();
            }

            public void onTabUnselected(TabLayout.Tab a0) {
              arg.onTabUnselected(a0);
              Anvil.render();
            }
          });
        } else {
          ((TabLayout) v).setOnTabSelectedListener((TabLayout.OnTabSelectedListener) null);
        }
      }
    }
  }

  private static final class RippleColorFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final RippleColorFunc8567756a instance = new RippleColorFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof FloatingActionButton) {
        ((FloatingActionButton) v).setRippleColor(arg);
      }
    }
  }

  private static final class ScrimsShownFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final ScrimsShownFunc148d6054 instance = new ScrimsShownFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof CollapsingToolbarLayout) {
        ((CollapsingToolbarLayout) v).setScrimsShown(arg);
      }
    }
  }

  private static final class SelectedTabIndicatorColorFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final SelectedTabIndicatorColorFunc8567756a instance = new SelectedTabIndicatorColorFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof TabLayout) {
        ((TabLayout) v).setSelectedTabIndicatorColor(arg);
      }
    }
  }

  private static final class SelectedTabIndicatorHeightFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final SelectedTabIndicatorHeightFunc8567756a instance = new SelectedTabIndicatorHeightFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof TabLayout) {
        ((TabLayout) v).setSelectedTabIndicatorHeight(arg);
      }
    }
  }

  private static final class StatusBarBackgroundFuncfb47464a implements Anvil.AttrFunc<Drawable> {
    public static final StatusBarBackgroundFuncfb47464a instance = new StatusBarBackgroundFuncfb47464a();

    public void apply(View v, final Drawable arg, final Drawable old) {
      if (v instanceof CoordinatorLayout) {
        ((CoordinatorLayout) v).setStatusBarBackground(arg);
      }
    }
  }

  private static final class StatusBarBackgroundColorFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final StatusBarBackgroundColorFunc8567756a instance = new StatusBarBackgroundColorFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof CoordinatorLayout) {
        ((CoordinatorLayout) v).setStatusBarBackgroundColor(arg);
      }
    }
  }

  private static final class StatusBarBackgroundResourceFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final StatusBarBackgroundResourceFunc8567756a instance = new StatusBarBackgroundResourceFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof CoordinatorLayout) {
        ((CoordinatorLayout) v).setStatusBarBackgroundResource(arg);
      }
    }
  }

  private static final class StatusBarScrimFuncfb47464a implements Anvil.AttrFunc<Drawable> {
    public static final StatusBarScrimFuncfb47464a instance = new StatusBarScrimFuncfb47464a();

    public void apply(View v, final Drawable arg, final Drawable old) {
      if (v instanceof CollapsingToolbarLayout) {
        ((CollapsingToolbarLayout) v).setStatusBarScrim(arg);
      }
    }
  }

  private static final class StatusBarScrimColorFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final StatusBarScrimColorFunc8567756a instance = new StatusBarScrimColorFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof CollapsingToolbarLayout) {
        ((CollapsingToolbarLayout) v).setStatusBarScrimColor(arg);
      }
    }
  }

  private static final class StatusBarScrimResourceFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final StatusBarScrimResourceFunc8567756a instance = new StatusBarScrimResourceFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof CollapsingToolbarLayout) {
        ((CollapsingToolbarLayout) v).setStatusBarScrimResource(arg);
      }
    }
  }

  private static final class TabGravityFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final TabGravityFunc8567756a instance = new TabGravityFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof TabLayout) {
        ((TabLayout) v).setTabGravity(arg);
      }
    }
  }

  private static final class TabModeFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final TabModeFunc8567756a instance = new TabModeFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof TabLayout) {
        ((TabLayout) v).setTabMode(arg);
      }
    }
  }

  private static final class TabTextColorsFunc9e5e0e4e implements Anvil.AttrFunc<ColorStateList> {
    public static final TabTextColorsFunc9e5e0e4e instance = new TabTextColorsFunc9e5e0e4e();

    public void apply(View v, final ColorStateList arg, final ColorStateList old) {
      if (v instanceof TabLayout) {
        ((TabLayout) v).setTabTextColors(arg);
      }
    }
  }

  private static final class TargetElevationFunce0893188 implements Anvil.AttrFunc<Float> {
    public static final TargetElevationFunce0893188 instance = new TargetElevationFunce0893188();

    public void apply(View v, final Float arg, final Float old) {
      if (v instanceof AppBarLayout) {
        ((AppBarLayout) v).setTargetElevation(arg);
      }
    }
  }

  private static final class TextColorFunc9e5e0e4e implements Anvil.AttrFunc<ColorStateList> {
    public static final TextColorFunc9e5e0e4e instance = new TextColorFunc9e5e0e4e();

    public void apply(View v, final ColorStateList arg, final ColorStateList old) {
      if (v instanceof NavigationMenuItemView) {
        ((NavigationMenuItemView) v).setTextColor(arg);
      }
    }
  }

  private static final class TitleFuncc0af808b implements Anvil.AttrFunc<CharSequence> {
    public static final TitleFuncc0af808b instance = new TitleFuncc0af808b();

    public void apply(View v, final CharSequence arg, final CharSequence old) {
      if (v instanceof NavigationMenuItemView) {
        ((NavigationMenuItemView) v).setTitle(arg);
      }
      if (v instanceof CollapsingToolbarLayout) {
        ((CollapsingToolbarLayout) v).setTitle(arg);
      }
    }
  }

  private static final class TitleEnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final TitleEnabledFunc148d6054 instance = new TitleEnabledFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof CollapsingToolbarLayout) {
        ((CollapsingToolbarLayout) v).setTitleEnabled(arg);
      }
    }
  }

  private static final class TypefaceFunc53b4afb implements Anvil.AttrFunc<Typeface> {
    public static final TypefaceFunc53b4afb instance = new TypefaceFunc53b4afb();

    public void apply(View v, final Typeface arg, final Typeface old) {
      if (v instanceof TextInputLayout) {
        ((TextInputLayout) v).setTypeface(arg);
      }
    }
  }

  private static final class UpWithViewPagerFunc648eda47 implements Anvil.AttrFunc<ViewPager> {
    public static final UpWithViewPagerFunc648eda47 instance = new UpWithViewPagerFunc648eda47();

    public void apply(View v, final ViewPager arg, final ViewPager old) {
      if (v instanceof TabLayout) {
        ((TabLayout) v).setupWithViewPager(arg);
      }
    }
  }

  private static final class UseCompatPaddingFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final UseCompatPaddingFunc148d6054 instance = new UseCompatPaddingFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof FloatingActionButton) {
        ((FloatingActionButton) v).setUseCompatPadding(arg);
      }
    }
  }
}
