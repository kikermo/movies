package org.kikermo.testapp.presentation.ui.views

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import org.kikermo.testapp.presentation.ui.theme.TestAppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SimpleAppBarScaffold(
    title: String,
    content: @Composable (PaddingValues) -> Unit,
) {
    Scaffold(
        topBar = {
            BasicAppBar(title = title)
        },
    ) { innerPadding ->
        Box(
            Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            content(innerPadding)
        }
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BasicAppBar(
    title: String,
) {
    val topAppBarColors =
        TopAppBarDefaults.smallTopAppBarColors(
            containerColor = MaterialTheme.colorScheme.primary,
            titleContentColor = Color.White,
        )

    TopAppBar(
        title = {
            Box(Modifier.fillMaxSize()) {
                Text(
                    modifier = Modifier.align(Center),
                    text = title,
                    style = MaterialTheme.typography.titleLarge
                )
            }
        },
        colors = topAppBarColors,
    )
}

@Composable
@Preview
fun PreviewAppBar() {
    TestAppTheme {
        BasicAppBar(
            title = "A Title",
        )
    }
}