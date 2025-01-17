package ru.dimagor555.passwordgenerator.screen.components

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import ru.dimagor555.passwordgenerator.screen.R
import ru.dimagor555.ui.core.components.SimpleBackArrowTopAppBar
import ru.dimagor555.ui.core.components.SimpleIconButton
import ru.dimagor555.ui.core.theme.PasswordManagerTheme

@Composable
internal fun PasswordGenerationTopAppBar(
    onNavigateBackWithPassword: () -> Unit,
    onNavigateBack: () -> Unit
) {
    SimpleBackArrowTopAppBar(
        title = { Text(text = stringResource(R.string.generate)) },
        onArrowBackClick = onNavigateBack,
        actions = {
            SimpleIconButton(
                icon = Icons.Default.Check,
                contentDescription = null,
                onClick = onNavigateBackWithPassword
            )
        }
    )
}

@Preview("Password generation TopAppBar")
@Preview("Password generation TopAppBar (ru)", locale = "ru")
@Preview("Password generation TopAppBar (dark)", uiMode = UI_MODE_NIGHT_YES)
@Composable
private fun PasswordGenerationTopAppBarPreview() {
    PasswordManagerTheme {
        PasswordGenerationTopAppBar({}, {})
    }
}