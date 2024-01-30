package com.assignment.demoapp.model

import com.assignment.demoapp.parsersandconverters.TimeAndDateProvider

open class LinksClicksDataWithDate {
    var dateWiseClickCountTotal: MutableMap<CustomDate, Int> = mutableMapOf()

    constructor(overallUrlChart: Map<String, Int>?) {
        convertingMapOfCustomDate(overallUrlChart)
    }

    private fun convertingMapOfCustomDate(overallUrlChart: Map<String, Int>?) {
        if (overallUrlChart != null) {
            for (item in overallUrlChart) {
                val date: CustomDate = TimeAndDateProvider.convertStringToDateObject(item.key)
                val clickCount = item.value
                dateWiseClickCountTotal[date] = clickCount
            }
        }
    }

    fun getClickCountDayWiseOfMonthOfYear(year: String, month: String): Map<String, Int> {
        val clickCountDayWiseOfMonthOfYear: MutableMap<String, Int> = mutableMapOf()
        for (date in dateWiseClickCountTotal) {
//            if (date.key.year == year && date.key.month == month) {
//                clickCountDayWiseOfMonthOfYear[date.key.date] = date.value
//            }
            clickCountDayWiseOfMonthOfYear[date.key.date] = date.value

        }
        return clickCountDayWiseOfMonthOfYear
    }


}