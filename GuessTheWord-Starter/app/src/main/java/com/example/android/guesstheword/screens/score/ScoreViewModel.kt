package com.example.android.guesstheword.screens.score

import android.util.Log
import androidx.lifecycle.ViewModel

/**
 * @Description:
 *
 * @author zhuoxinwang
 * @version v13.11.0
 * @since 2022/9/19
 */
class ScoreViewModel(finalScore: Int): ViewModel() {
    // The final score
    var score = finalScore
    init {
        Log.i("ScoreViewModel", "Final score is $finalScore")
    }
}