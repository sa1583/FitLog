package com.example.fitlog.ui.add

import android.graphics.Color
import androidx.compose.material3.ExperimentalMaterial3Api
import com.example.fitlog.common.SetInfo
import java.time.LocalDate

data class AddExerciseState @OptIn(ExperimentalMaterial3Api::class) constructor(
    val exerciseName: String = "",
    val numOfSet: Int = 1,
    val expanded: Boolean = false,
    val setInfo: List<SetInfo> = listOf(SetInfo("", 0)),
    val color: Int = Color.RED,
    val showDialog: Boolean = false,
    val curDate: LocalDate = LocalDate.now(),
)