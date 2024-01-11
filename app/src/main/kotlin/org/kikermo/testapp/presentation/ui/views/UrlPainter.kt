package org.kikermo.testapp.presentation.ui.views

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import coil.compose.AsyncImagePainter
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest
import coil.size.Size

@Composable
fun urlPainter(imageUrl: String) : AsyncImagePainter {
     val baseImageURL = "https://image.tmdb.org/t/p/w500"

    return rememberAsyncImagePainter(
        model = ImageRequest.Builder(LocalContext.current)
            .data(baseImageURL + imageUrl)
            .size(Size.ORIGINAL)
            .build()
    )
}