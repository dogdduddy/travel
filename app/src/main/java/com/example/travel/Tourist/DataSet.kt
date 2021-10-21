package com.example.travel.Tourist

import com.example.travel.R

class DataSet {
    fun makeSet() : List<affirmation> {
        return listOf<affirmation>(
            affirmation(R.drawable.mount, R.string.placeResource1,
                R.string.starResource1, R.string.subResource1,
                R.string.locationResource1, R.string.writerResource1),

            affirmation(R.drawable.camellia, R.string.placeResource2,
                R.string.starResource2, R.string.subResource2,
                R.string.locationResource2, R.string.writerResource2),

            affirmation(R.drawable.hyeopjae, R.string.placeResource3,
                R.string.starResource3, R.string.subResource3,
                R.string.locationResource3, R.string.writerResource3),

            affirmation(R.drawable.saebyel, R.string.placeResource4,
                R.string.starResource4, R.string.subResource4,
                R.string.locationResource4, R.string.writerResource4),

            affirmation(R.drawable.iron, R.string.placeResource5,
                R.string.starResource5, R.string.subResource5,
                R.string.locationResource5, R.string.writerResource5),

            affirmation(R.drawable.arte, R.string.placeResource6,
                R.string.starResource6, R.string.subResource6,
                R.string.locationResource6, R.string.writerResource6),

            affirmation(R.drawable.mount, R.string.placeResource1,
                R.string.starResource1, R.string.subResource1,
                R.string.locationResource1, R.string.writerResource1))
    }
}