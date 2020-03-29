package com.dvdb.checklist.recycler.holder.base.factory

import android.view.ViewGroup
import com.dvdb.checklist.recycler.holder.base.BaseRecyclerHolder
import com.dvdb.checklist.recycler.holder.base.BaseRecyclerHolderThemeConfig
import com.dvdb.checklist.recycler.item.base.BaseRecyclerItem

internal interface BaseRecyclerHolderFactory<T : BaseRecyclerItem, C : BaseRecyclerHolderThemeConfig> {
    fun create(parent: ViewGroup, config: C): BaseRecyclerHolder<T, C>
}