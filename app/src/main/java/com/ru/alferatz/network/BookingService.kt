package com.ru.alferatz.network

import com.ru.alferatz.model.request.BookingByUserRequest
import com.ru.alferatz.model.request.BookingRequest
import com.ru.alferatz.model.request.CancelBookingRequest
import com.ru.alferatz.model.request.CreateBookingRequest
import com.ru.alferatz.model.response.BookingResponse
import com.ru.alferatz.model.response.CancelBookingResponse
import com.ru.alferatz.model.response.CreateBookingResponse
import retrofit2.Call
import retrofit2.http.*

interface BookingService {

    @POST("booking/create")
    fun createBooking(@Body request: CreateBookingRequest): Call<CreateBookingResponse>

    @POST("booking/cancel")
    fun cancelBooking(@Body request: CancelBookingRequest): Call<CancelBookingResponse>

    @POST("booking/confirm")
    fun confirmBooking(): Call<BookingResponse>


    @POST("table/available")
    fun getAvailableTables(): Call<BookingResponse>

    @GET("")
    fun getCurrentFreeTables(): Call<BookingResponse>

    @GET("booking/by-date")
    fun getBookingByDate(@Query("date") date: String): Call<BookingResponse>

    @GET("booking/by-date-time")
    fun getBookingByDateTime(@Query("dateTime") dateTime: String): Call<BookingResponse>

    @GET("booking/by-user")
    fun getBookingByUser(@Query("userId") userId: Long): Call<BookingResponse>

}