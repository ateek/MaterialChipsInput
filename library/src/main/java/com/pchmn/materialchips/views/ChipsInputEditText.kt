package com.pchmn.materialchips.views


import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.appcompat.widget.AppCompatEditText

class ChipsInputEditText : AppCompatEditText {

    var filterableListView: FilterableListView? = null

    val isFilterableListVisible: Boolean
        get() = filterableListView != null && filterableListView!!.visibility == View.VISIBLE

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)
}
