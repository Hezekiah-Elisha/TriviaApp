package com.olefa.triviaapp.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.olefa.triviaapp.component.Questions

@Composable
fun TriviaHome(
    modifier: Modifier = Modifier,
    viewModel: QuestionsViewModel = hiltViewModel()
) {
    Questions(viewModel = viewModel)
}