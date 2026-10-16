package com.portfolio.stockmate
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith
@RunWith(AndroidJUnit4::class) class StockMateInstrumentedTest { @Test fun packageName_isCorrect(){ assert(com.portfolio.stockmate.BuildConfig.APPLICATION_ID=="com.portfolio.stockmate") } }
