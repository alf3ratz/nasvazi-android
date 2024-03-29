package com.ru.alferatz.viewmodel

import android.app.Application
import androidx.annotation.NonNull
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.ru.alferatz.model.request.AuthRequest
import com.ru.alferatz.model.request.ConfirmAuthRequest
import com.ru.alferatz.model.response.AuthResponse
import com.ru.alferatz.model.response.BookingResponse
import com.ru.alferatz.repository.AuthRepository
import com.ru.alferatz.repository.BookingRepository
import okhttp3.Response

class AuthViewModel(@NonNull application: Application) : AndroidViewModel(application) {
    private var authRepository: AuthRepository =
        AuthRepository()

    fun login(request: AuthRequest): LiveData<AuthResponse> {
        return authRepository.login(request)
    }
    fun confirmAuth(request: ConfirmAuthRequest): LiveData<AuthResponse> {
        return authRepository.confirmAuth(request)
    }
}