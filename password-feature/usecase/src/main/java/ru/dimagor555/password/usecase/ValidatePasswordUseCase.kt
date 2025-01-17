package ru.dimagor555.password.usecase

import ru.dimagor555.password.domain.validation.validateLogin
import ru.dimagor555.password.domain.validation.validatePasswordText
import ru.dimagor555.password.domain.validation.validateTitle
import ru.dimagor555.password.validation.TextValidationError

class ValidatePasswordUseCase {
    operator fun invoke(params: Params) = Result(
        titleError = validateTitle(params.title).firstOrNull(),
        loginError = validateLogin(params.login).firstOrNull(),
        passwordError = validatePasswordText(params.password).firstOrNull()
    )

    data class Params(
        val title: String,
        val login: String,
        val password: String
    )

    data class Result(
        val titleError: TextValidationError?,
        val loginError: TextValidationError?,
        val passwordError: TextValidationError?
    )
}