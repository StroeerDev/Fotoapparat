package io.fotoapparat.parameter

/**
 * Anti Banding modes which camera can use.
 */
sealed class SceneMode : Parameter {

    /**
     * Take photos of fast moving objects. Same as {@link
     * #SCENE_MODE_SPORTS}.
     */
    object Auto : SceneMode() {
        override fun toString(): String = "SceneMode.Auto"
    }

    /**
     * Take photos of fast moving objects. Same as {@link
     * #SCENE_MODE_SPORTS}.
     */
    object Action : SceneMode() {
        override fun toString(): String = "SceneMode.Action"
    }

    /**
     * Take people pictures.
     */
    object Portrait : SceneMode() {
        override fun toString(): String = "SceneMode.Portrait"
    }

    /**
     * Take pictures on distant objects.
     */
    object Landscape : SceneMode() {
        override fun toString(): String = "SceneMode.Landscape"
    }

    /**
     * Take photos at night.
     */
    object Night : SceneMode() {
        override fun toString(): String = "SceneMode.Night"
    }

    /**
     * Take people pictures at night.
     */
    object NightPortrait : SceneMode() {
        override fun toString(): String = "SceneMode.Night-Portrait"
    }

    /**
     * Applications are looking for a barcode. Camera driver will be
     * optimized for barcode reading.
     */
    object Barcode : SceneMode() {
        override fun toString(): String = "SceneMode.Barcode"
    }

}












/*
public static final String SCENE_MODE_NIGHT_PORTRAIT = "night-portrait";

/**
 * Take photos in a theater. Flash light is off.
 */
public static final String SCENE_MODE_THEATRE = "theatre";

/**
 * Take pictures on the beach.
 */
public static final String SCENE_MODE_BEACH = "beach";

/**
 * Take pictures on the snow.
 */
public static final String SCENE_MODE_SNOW = "snow";

/**
 * Take sunset photos.
 */
public static final String SCENE_MODE_SUNSET = "sunset";

/**
 * Avoid blurry pictures (for example, due to hand shake).
 */
public static final String SCENE_MODE_STEADYPHOTO = "steadyphoto";

/**
 * For shooting firework displays.
 */
public static final String SCENE_MODE_FIREWORKS = "fireworks";

/**
 * Take photos of fast moving objects. Same as {@link
 * #SCENE_MODE_ACTION}.
 */
public static final String SCENE_MODE_SPORTS = "sports";

/**
 * Take indoor low-light shot.
 */
public static final String SCENE_MODE_PARTY = "party";

/**
 * Capture the naturally warm color of scenes lit by candles.
 */
public static final String SCENE_MODE_CANDLELIGHT = "candlelight";
*/

