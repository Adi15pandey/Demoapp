package com.assignment.demoapp.model

import com.assignment.demoapp.adapters.LinkDataItemAdapter

data class MainActivityModelForUi(
    val chartDateRange: String,
    val greetingString: String,
    val adapter: LinkDataItemAdapter
)
