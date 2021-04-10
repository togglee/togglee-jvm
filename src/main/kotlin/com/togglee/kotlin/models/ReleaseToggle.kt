package com.togglee.kotlin.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("release")
data class ReleaseToggle(override var name: String, override var type: String, var value: String) : Toggle
