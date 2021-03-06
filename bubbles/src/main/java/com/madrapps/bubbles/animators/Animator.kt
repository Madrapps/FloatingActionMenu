package com.madrapps.bubbles.animators

import android.content.Context
import android.graphics.Rect
import android.view.View

interface Animator {

    /**
     * Setup the animation for the children
     *
     * @param parent relative position of the action menu, i.e the parent
     * @param anchor relative position of the anchor with respect to the parent
     */
    fun configure(context: Context, children: List<View>, parent: Rect, anchor: Rect)

    /**
     * Start animation corresponding to show
     */
    fun show()

    /**
     * Start animation corresponding to hide
     */
    fun hide()
}