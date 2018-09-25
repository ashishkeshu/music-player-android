package com.firekernel.musicplayer;

import android.support.v4.media.MediaBrowserCompat;

/**
 * Created by Ashish on 7/5/2017.
 */

public interface FirePopupMenuSelectedListener {
    void onPlaySelected(MediaBrowserCompat.MediaItem item);

    void onShareSelected(MediaBrowserCompat.MediaItem item);
}
