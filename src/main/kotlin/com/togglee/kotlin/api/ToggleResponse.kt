package com.togglee.kotlin.api

import com.togglee.kotlin.models.Toggle
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("toggles")
data class ToggleResponse(val toggles: List<Toggle>)
