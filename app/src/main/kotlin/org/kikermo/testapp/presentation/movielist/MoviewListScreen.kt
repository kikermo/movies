package org.kikermo.testapp.presentation.movielist

import androidx.annotation.VisibleForTesting
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import org.kikermo.testapp.R
import org.kikermo.testapp.domain.model.Movie
import org.kikermo.testapp.presentation.ui.theme.TestAppTheme
import org.kikermo.testapp.presentation.ui.views.ErrorLayout
import org.kikermo.testapp.presentation.ui.views.LoadingLayout
import org.kikermo.testapp.presentation.ui.views.SimpleAppBarScaffold
import org.kikermo.testapp.presentation.ui.views.urlPainter

@Composable
internal fun PhotoListScreen(
    viewModel: MoviewListViewModel = viewModel(),
) {
    when (val viewState = viewModel.viewState.collectAsStateWithLifecycle().value) {
        MoviewListViewModel.ViewState.Loading -> Loading()
        is MoviewListViewModel.ViewState.ErrorState -> ErrorState(viewState)
        is MoviewListViewModel.ViewState.MovieList -> PhotoList(viewState)
    }
}

@Composable
@VisibleForTesting
internal fun PhotoList(
    viewState: MoviewListViewModel.ViewState.MovieList,
) {
    SimpleAppBarScaffold(title = stringResource(id = R.string.movie_list_title)) {
        LazyColumn {
            items(viewState.movieList) { movie: Movie ->
                MovieItem(movie)
            }
        }
    }
}

@Composable
private fun MovieItem(
    movie: Movie
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp), border = BorderStroke(
            width = 1.dp, color = MaterialTheme.colorScheme.outline
        )
    ) {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Image(
                modifier = Modifier.size(64.dp),
                painter = urlPainter(movie.posterPath),
                contentDescription = ""
            )
            Spacer(modifier = Modifier.size(16.dp))
            Column(Modifier.weight(1f)) {
                Text(
                    text = movie.title,
                    style = MaterialTheme.typography.titleMedium,
                )
            }
        }
    }

}


@Composable
private fun Loading() {
    LoadingLayout()
}

@Composable
@VisibleForTesting
internal fun ErrorState(
    viewState: MoviewListViewModel.ViewState.ErrorState,
) {
    ErrorLayout(
        errorMessage = viewState.errorMessage,
        errorAction = viewState.errorAction,
        errorActionText = stringResource(id = R.string.general_try_again),
    )
}

@Composable
@Preview
fun PreviewPhotoEntry() {
    TestAppTheme {
        val movie = Movie(
            id = 1,
            title = "Titanic",
            originalTitle = "Le Titanic",
            posterPath = "https://via.placeholder.com/600/474645"
        )

        MovieItem(movie)
    }
}
