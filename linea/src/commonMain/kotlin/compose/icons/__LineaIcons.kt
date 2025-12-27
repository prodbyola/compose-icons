package compose.icons

import androidx.compose.ui.graphics.vector.ImageVector
import compose.icons.lineaicons.AllIcons
import compose.icons.lineaicons.AllIconsNamed
import compose.icons.lineaicons.Arrows
import compose.icons.lineaicons.Basic
import compose.icons.lineaicons.BasicElaboration
import compose.icons.lineaicons.Ecommerce
import compose.icons.lineaicons.Music
import compose.icons.lineaicons.Software
import compose.icons.lineaicons.Weather
import compose.icons.lineaicons.groupName
import kotlin.String
import kotlin.collections.List as ____KtList
import kotlin.collections.Map as ____KtMap

public object LineaIcons

private var __AllIcons: ____KtList<ImageVector>? = null

public val LineaIcons.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= Arrows.AllIcons + Basic.AllIcons + BasicElaboration.AllIcons + Ecommerce.AllIcons +
        Music.AllIcons + Software.AllIcons + Weather.AllIcons + listOf()
    return __AllIcons!!
  }

private var __AllIconsNamed: ____KtMap<String, ImageVector>? = null

public val LineaIcons.AllIconsNamed: ____KtMap<String, ImageVector>
  get() {
    if (__AllIconsNamed != null) {
      return __AllIconsNamed!!
    }
    __AllIconsNamed= Arrows.AllIconsNamed.mapKeys { "${Arrows.groupName}.${it.key}"} +
        Basic.AllIconsNamed.mapKeys { "${Basic.groupName}.${it.key}"} +
        BasicElaboration.AllIconsNamed.mapKeys { "${BasicElaboration.groupName}.${it.key}"} +
        Ecommerce.AllIconsNamed.mapKeys { "${Ecommerce.groupName}.${it.key}"} +
        Music.AllIconsNamed.mapKeys { "${Music.groupName}.${it.key}"} +
        Software.AllIconsNamed.mapKeys { "${Software.groupName}.${it.key}"} +
        Weather.AllIconsNamed.mapKeys { "${Weather.groupName}.${it.key}"} + mapOf()
    return __AllIconsNamed!!
  }
