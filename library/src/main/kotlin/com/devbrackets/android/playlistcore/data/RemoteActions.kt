/*
 * Copyright (C) 2016 - 2017 Brian Wernick
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.devbrackets.android.playlistcore.data

/**
 * A simple container for the remote actions used by the
 * [com.devbrackets.android.playlistcore.manager.BasePlaylistManager]
 * to inform the [BasePlaylistService] of processes to handle.
 */
object RemoteActions {
    //
    private const val PREFIX = "com.devbrackets.android.playlistcore."

    //
    const val ACTION_START_SERVICE = PREFIX + "start_service"
    const val ACTION_PLAY_PAUSE = PREFIX + "play_pause"
    const val ACTION_PREVIOUS = PREFIX + "previous"
    const val ACTION_NEXT = PREFIX + "next"
    const val ACTION_STOP = PREFIX + "stop"
    const val ACTION_SEEK_STARTED = PREFIX + "seek_started"
    const val ACTION_SEEK_ENDED = PREFIX + "seek_ended"
    const val ACTION_REPEAT_MODE = PREFIX + "repeat_mode"

    //Extras
    const val ACTION_EXTRA_SEEK_POSITION = PREFIX + "seek_position"
    const val ACTION_EXTRA_REPEAT_MODE = PREFIX + "repeat_mode"
    const val ACTION_EXTRA_START_PAUSED = PREFIX + "start_paused"
}
