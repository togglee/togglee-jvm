package com.togglee.kotlin.api

import com.github.kittinunf.fuel.core.Client
import com.github.kittinunf.fuel.core.FuelManager
import io.mockk.every
import io.mockk.mockk
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class ToggleApiClientTest {
    private var sut: ToggleApiClient = ToggleApiClient()
    private val someJson = "{\"toggles\":[{\"name\":\"propPepito\",\"type\":\"release\",\"value\":false}," +
            "{\"name\":\"propJoselito\",\"type\":\"release\",\"value\":true}]}"

    @BeforeEach
    fun setup() {
        val client = mockk<Client>()

        every { client.executeRequest(any()).statusCode } returns 200
        every { client.executeRequest(any()).responseMessage } returns "OK"
        every { client.executeRequest(any()).data } returns someJson.toByteArray()

        FuelManager.instance.client = client

   }

    @Test
    fun testApiClientReturnOk() {
        sut.getToggles()
    }
}