package com.assignment.demoapp.model

import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet

class ChartData :
    LinksClicksDataWithDate {
    private lateinit var coordinates: ArrayList<Entry>
    lateinit var lineDataSet: LineDataSet
    lateinit var lineData: LineData
    lateinit var chartDateRange: String

    constructor(overallUrlChart: Map<String, Int>?) : super(overallUrlChart) {
        setCoordinates(dateWiseClickCountTotal.keys.first())
        setLineDataSet()

    }

    private fun setCoordinates(date: CustomDate) {
        val dayWiseClicks: Map<String, Int> =
            getClickCountDayWiseOfMonthOfYear(date.year, date.month)
        coordinates = ArrayList()
        for (day in dayWiseClicks) {
            coordinates.add(
                Entry(
                    day.key.toFloat(),
                    day.value.toFloat()
                )
            )
        }
        chartDateRange =
            dayWiseClicks.keys.first() + " " + date.month + " - " + dayWiseClicks.keys.last() + " " + date.month
    }

    private fun setLineDataSet() {
        lineDataSet = LineDataSet(coordinates, null)
        lineData = LineData(lineDataSet)
    }

}