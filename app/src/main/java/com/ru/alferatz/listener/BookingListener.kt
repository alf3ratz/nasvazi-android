package com.ru.alferatz.listener

import com.ru.alferatz.model.dto.BookingDto
import com.ru.alferatz.model.entity.BookingEntity

interface BookingListener {
    fun onEventClicked(booking: BookingEntity)
}
