package com.togglee.kotlin.api

import com.github.kittinunf.fuel.Fuel.get

class ToggleApiClient {
    companion object {
        const val baseUrl = "https://gist.githubusercontent.com/kanekotic/c469f99bef5a5c0634b4a94a4acd6546/raw/toggles"
    }

    fun getToggles() {
        get(baseUrl)
            .responseString { request, response, result ->
                print(result)
            }
    }
}
