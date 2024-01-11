package org.kikermo.testapp.presentation.ui.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.kikermo.testapp.R
import org.kikermo.testapp.presentation.ui.theme.TestAppTheme

@Composable
fun ErrorLayout(
    errorMessage: String,
    errorAction: () -> Unit,
    errorActionText: String,
) {
    Box(Modifier.fillMaxSize()) {
        Column(
            Modifier.align(Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            val imageModifier = Modifier
                .background(
                    color = MaterialTheme.colorScheme.errorContainer,
                    shape = CircleShape,
                )
                .padding(16.dp)
            Image(
                painter = painterResource(id = R.drawable.illustration_warning),
                contentDescription = stringResource(id = R.string.general_error_image_description),
                colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.primary),
                modifier = imageModifier,
            )
            Spacer(modifier = Modifier.size(8.dp))
            Text(
                text = errorMessage,
                style = MaterialTheme.typography.bodyLarge,
            )
            Spacer(modifier = Modifier.size(16.dp))
            Button(onClick = errorAction) {
                Text(text = errorActionText)
            }
        }
    }
}

@Composable
@Preview
fun PreviewErrorLayout() {
    TestAppTheme {
        ErrorLayout(
            errorMessage = stringResource(R.string.general_error),
            errorAction = {},
            errorActionText = stringResource(R.string.general_try_again),
        )
    }
}
