package com.example.affirmations.data

import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

class Datasource {
    fun loadAffirmations(): List<Affirmation>{
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation01, R.drawable.image1),
            Affirmation(R.string.affirmation02, R.drawable.image2),
            Affirmation(R.string.affirmation03, R.drawable.image3),
            Affirmation(R.string.affirmation04, R.drawable.image4),
            Affirmation(R.string.affirmation05, R.drawable.image5),
            Affirmation(R.string.affirmation06, R.drawable.image6),
            Affirmation(R.string.affirmation07, R.drawable.image7),
            Affirmation(R.string.affirmation08, R.drawable.image8),
            Affirmation(R.string.affirmation09, R.drawable.image9),
            Affirmation(R.string.affirmation10, R.drawable.image10)
        )
    }
}