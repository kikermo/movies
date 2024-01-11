package org.kikermo.testapp.presentation.ui.views

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import org.kikermo.testapp.presentation.ui.theme.TestAppTheme

@Composable
fun LoadingLayout() {
    Box(Modifier.fillMaxSize()) {
        CircularProgressIndicator(
            Modifier.align(Alignment.Center),
        )
    }
}

@Composable
@Preview
fun PreviewLoadingLayout() {
    TestAppTheme {
        LoadingLayout()
    }
}
