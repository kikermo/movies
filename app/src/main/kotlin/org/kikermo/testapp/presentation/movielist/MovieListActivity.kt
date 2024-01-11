package org.kikermo.testapp.presentation.movielist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import dagger.hilt.android.AndroidEntryPoint
import org.kikermo.testapp.presentation.ui.theme.TestAppTheme

@AndroidEntryPoint
class MovieListActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TestAppTheme {
                PhotoListScreen()
            }
        }
    }
}
