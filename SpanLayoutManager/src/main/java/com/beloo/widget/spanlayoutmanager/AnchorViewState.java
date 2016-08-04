package com.beloo.widget.spanlayoutmanager;

import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;

class AnchorViewState {
    @Nullable
    private Integer position;
    @NonNull
    private Rect anchorViewRect;

    private AnchorViewState(@NonNull Rect rect) {
        anchorViewRect = rect;
    }

    static AnchorViewState getNotFoundState(Rect canvasRect) {
        return new AnchorViewState(canvasRect);
    }

    AnchorViewState(int position, @NonNull Rect anchorViewRect) {
        this.position = position;
        this.anchorViewRect = anchorViewRect;
    }

    boolean isNotFoundState() {
        return position == null;
    }

    public int getPosition() {
        return position;
    }

    public Rect getAnchorViewRect() {
        return anchorViewRect;
    }
}
