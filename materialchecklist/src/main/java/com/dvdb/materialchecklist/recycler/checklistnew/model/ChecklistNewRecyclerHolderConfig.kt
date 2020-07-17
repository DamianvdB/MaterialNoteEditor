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

package com.dvdb.materialchecklist.recycler.checklistnew.model

import android.graphics.Typeface
import android.graphics.drawable.Drawable
import androidx.annotation.ColorInt
import com.dvdb.materialchecklist.recycler.base.holder.BaseRecyclerHolderConfig

internal data class ChecklistNewRecyclerHolderConfig(
    val text: String,
    @ColorInt val textColor: Int,
    val textSize: Float,
    val textAlpha: Float,
    val textTypeFace: Typeface?,
    @ColorInt val iconTintColor: Int,
    val iconAdd: Drawable?,
    val iconAlphaAdd: Float,
    val topAndBottomPadding: Float,
    val leftAndRightPadding: Float?
) : BaseRecyclerHolderConfig