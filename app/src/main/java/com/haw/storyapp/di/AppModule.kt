package com.haw.storyapp.di

import com.haw.storyapp.network.ApiConfig
import org.koin.dsl.module

val appModule = module {
    single { ApiConfig.provideApiService }
}