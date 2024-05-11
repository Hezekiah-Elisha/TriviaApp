package com.olefa.triviaapp.repository

import android.util.Log
import com.olefa.triviaapp.data.DataOrException
import com.olefa.triviaapp.model.QuestionItem
import com.olefa.triviaapp.network.QuestionApi
import javax.inject.Inject

class QuestionRepository @Inject constructor(
    private val api: QuestionApi
) {
    private val dataOrException
        = DataOrException<ArrayList<QuestionItem>, Boolean, Exception>()

    suspend fun getAllQuestions(): DataOrException<ArrayList<QuestionItem>, Boolean, Exception> {
        try {

            dataOrException.loading = true
            dataOrException.data = api.getAllQuestions()
            if (dataOrException.data.toString().isNotEmpty()) dataOrException.loading = false

        } catch (e: Exception) {
            dataOrException.exception = e
            Log.d("Exc", "getAllQuestions: ${dataOrException.exception!!.localizedMessage }")
        }
        return dataOrException
    }
}