package android.support.design.widget;

import android.view.ViewGroup;

public class AppBarLayout extends ViewGroup {

    public static class LayoutParams extends ViewGroup.LayoutParams {
        public static final int SCROLL_FLAG_SCROLL = 0x1;

        public void setScrollFlags(int flags) {
            throw new RuntimeException("Stub!");
        }
    }
}