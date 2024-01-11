package org.kikermo.testapp.presentation.movielist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import org.kikermo.testapp.domain.coroutines.CoroutinesContextProvider
import org.kikermo.testapp.domain.model.Movie
import org.kikermo.testapp.domain.usecase.GetMoviesUseCase
import org.kikermo.testapp.utils.StringProvider
import org.kikermo.testapp.utils.toText
import javax.inject.Inject

@HiltViewModel
internal class MoviewListViewModel @Inject constructor(
    private val coroutinesContextProvider: CoroutinesContextProvider,
    private val getFirstPhotoOfAlbumsUseCase: GetMoviesUseCase,
    private val stringProvider: StringProvider,
) : ViewModel() {
    private val _viewState = MutableStateFlow<ViewState>(ViewState.Loading)
    val viewState: StateFlow<ViewState> = _viewState.asStateFlow()

    init {
        loadData()
    }

    private fun loadData() {
        _viewState.value = ViewState.Loading
        viewModelScope.launch(coroutinesContextProvider.main) {
            getFirstPhotoOfAlbumsUseCase()
                .collect(::handleResponse)
        }
    }

    private fun handleResponse(status: GetMoviesUseCase.Status) {
        _viewState.value = when (status) {
            is GetMoviesUseCase.Status.Failure -> ViewState.ErrorState(
                errorMessage = status.error.toText(stringProvider),
                errorAction = {
                    loadData()
                },
            )

            is GetMoviesUseCase.Status.Success -> ViewState.MovieList(status.moviewList)
        }
    }

    sealed class ViewState {
        object Loading : ViewState()

        data class MovieList(
            val movieList: List<Movie>,
        ) : ViewState()

        data class ErrorState(
            val errorMessage: String,
            val errorAction: () -> Unit,
        ) : ViewState()
    }
}
