package com.togglee.kotlin.models

import kotlinx.serialization.Serializable

@Serializable
data class Conditions(var field: String, var value: String, var operation: String)
