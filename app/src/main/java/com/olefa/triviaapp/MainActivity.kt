package com.olefa.triviaapp

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.olefa.triviaapp.screens.QuestionsViewModel
import com.olefa.triviaapp.ui.theme.TriviaAppTheme
import dagger.hilt.android.AndroidEntryPoint
import androidx.hilt.navigation.compose.hiltViewModel
import com.olefa.triviaapp.screens.TriviaHome

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TriviaAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    TriviaHome(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}