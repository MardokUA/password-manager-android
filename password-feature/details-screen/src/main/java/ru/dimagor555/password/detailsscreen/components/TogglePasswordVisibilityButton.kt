package ru.dimagor555.password.detailsscreen.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import ru.dimagor555.password.detailsscreen.R
import ru.dimagor555.ui.core.components.SimpleButton

@Composable
internal fun TogglePasswordVisibilityButton(
    isVisible: Boolean,
    onToggleVisibility: () -> Unit
) {
    val btnText = stringResource(chooseButtonTextId(isVisible))
    SimpleButton(
        text = btnText,
        onClick = onToggleVisibility
    )
}

private fun chooseButtonTextId(isVisible: Boolean) =
    if (isVisible)
        R.string.hide_password
    else
        R.string.show_password