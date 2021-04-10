package com.togglee.kotlin.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("context")
data class ContextToggle(override var name: String, override var type: String, var conditions: Conditions): Toggle