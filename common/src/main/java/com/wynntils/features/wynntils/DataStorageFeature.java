/*
 * Copyright © Wynntils 2022.
 * This file is released under AGPLv3. See LICENSE for full license details.
 */
package com.wynntils.features.wynntils;

import com.wynntils.core.config.Config;
import com.wynntils.core.features.Feature;

// FIXME: This feature is only needed because we do not have a way to save any data persistently.
//        Remove this when we add persistent data storage other than configs.
public class DataStorageFeature extends Feature {
    public static DataStorageFeature INSTANCE;

    @Config(visible = false)
    public int dryCount = 0;

    @Config(visible = false)
    public int dryBoxes = 0;
}
