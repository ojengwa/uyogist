package com.uyogist.uyogist;

import android.os.Environment;

import java.io.File;

/**
 * Constants
 * Created by oyewale on 9/13/15.
 */
public final class Constants {

    public static final boolean DEBUG = true;

    public static final class FOLDERS {

        private static final String ROOT = File.separator + "CameraModule";

        private static final String SD_CARD_PATH = Environment.getExternalStorageDirectory().getPath();

        public static final String PATH = SD_CARD_PATH + ROOT;

    }

}
