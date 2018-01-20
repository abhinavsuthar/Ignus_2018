package org.ignus.ignus18.ui.utils

import android.graphics.Rect
import android.view.View
import android.support.v7.widget.RecyclerView


class SpacesItemDecoration(private val space: Int) : RecyclerView.ItemDecoration() {

    override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State) {
        outRect.left = 2 * space
        outRect.right = 2 * space
        outRect.top = space
        outRect.bottom = space

        // Add top margin only for the first item to avoid double space between items
        if (parent.getChildAdapterPosition(view) == 0 || parent.getChildAdapterPosition(view) == 1)
            outRect.top = 2 * space

        if (parent.getChildAdapterPosition(view) % 2 == 0) outRect.right = space
        else outRect.left = space

    }
}

class SpacesItemDecorationLand(private val space: Int) : RecyclerView.ItemDecoration() {

    override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State) {
        outRect.left = space
        outRect.right = space
        outRect.top = space
        outRect.bottom = space

        // Add top margin only for the first item to avoid double space between items
        if (parent.getChildAdapterPosition(view) == 0 || parent.getChildAdapterPosition(view) == 1 || parent.getChildAdapterPosition(view) == 2)
            outRect.top = 2 * space

        if (parent.getChildAdapterPosition(view) % 3 == 0) outRect.left = 2 * space
        if (parent.getChildAdapterPosition(view) % 3 == 2) outRect.right = 2 * space

    }
}