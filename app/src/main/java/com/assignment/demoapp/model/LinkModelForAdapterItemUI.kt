package com.assignment.demoapp.model

import android.graphics.drawable.Drawable

data class LinkModelForAdapterItemUI(
    var title: String? = null,
    var web_link: String? = null,
    var total_clicks: String? = null,
    var created_at: String? = null,
    var link_thumbnail: Drawable? = null
)