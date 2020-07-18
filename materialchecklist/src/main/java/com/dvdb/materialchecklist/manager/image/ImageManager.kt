/*
 * Designed and developed by Damian van den Berg.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.dvdb.materialchecklist.manager.image

import com.dvdb.materialchecklist.manager.image.model.ImageItem
import com.dvdb.materialchecklist.manager.image.model.ImageManagerConfig
import com.dvdb.materialchecklist.recycler.adapter.ChecklistItemAdapter
import com.dvdb.materialchecklist.recycler.adapter.listener.ChecklistItemAdapterDragListener
import com.dvdb.materialchecklist.recycler.imagecontainer.image.model.ImageRecyclerItem

internal interface ImageManager : ChecklistItemAdapterDragListener {

    var onImageItemClicked: (item: ImageItem) -> Unit

    val onImageItemInContainerClicked: (item: ImageRecyclerItem) -> Unit

    fun lateInitState(
        adapter: ChecklistItemAdapter,
        config: ImageManagerConfig
    )

    fun setConfig(config: ImageManagerConfig)

    fun getImageItems(): List<ImageItem>

    fun setImageItems(items: List<ImageItem>)

    fun removeImageItems(): Boolean
}