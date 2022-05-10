package com.devbrackets.android.playlistcore.annotation

import androidx.annotation.IntDef

const val REPEAT_NONE = 0
const val REPEAT_ONE = 1

@IntDef(
    REPEAT_NONE,
    REPEAT_ONE
)
@Retention(AnnotationRetention.SOURCE)
annotation class RepeatMode
