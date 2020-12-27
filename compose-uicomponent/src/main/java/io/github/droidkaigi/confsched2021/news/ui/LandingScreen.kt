package io.github.droidkaigi.confsched2021.news.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedTask
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.imageResource
import io.github.droidkaigi.confsched2021.news.uicomponent.R
import kotlinx.coroutines.delay

private const val SplashWaitTime: Long = 2000

@Composable
fun LandingScreen(modifier: Modifier = Modifier, onTimeout: () -> Unit) {
    Box(modifier = modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        // FIXME Deprecated
        LaunchedTask {
            delay(SplashWaitTime)
            onTimeout()
        }
        Image(bitmap = imageResource(id = R.drawable.ic_logo_big), Modifier.fillMaxSize(0.5F))
    }
}