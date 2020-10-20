package io.fotoapparat.parameter.camera.convert

import android.hardware.Camera
import io.fotoapparat.parameter.AntiBandingMode
import io.fotoapparat.parameter.SceneMode

/**
 * Converts a scene mode code to a [SceneMode].
 *
 * @receiver Code of the scene mode as in [Camera.Parameters].
 * @return The [io.fotoapparat.Fotoapparat]'s camera [SceneMode]. `null` if camera code is not supported.
 */
fun String.toSceneMode(): SceneMode? =
        when (this) {
            Camera.Parameters.SCENE_MODE_AUTO -> SceneMode.Auto
            Camera.Parameters.SCENE_MODE_ACTION -> SceneMode.Action
            Camera.Parameters.SCENE_MODE_PORTRAIT -> SceneMode.Portrait
            Camera.Parameters.SCENE_MODE_LANDSCAPE -> SceneMode.Landscape
            Camera.Parameters.SCENE_MODE_NIGHT -> SceneMode.Night
            Camera.Parameters.SCENE_MODE_NIGHT_PORTRAIT -> SceneMode.NightPortrait
            Camera.Parameters.SCENE_MODE_BARCODE -> SceneMode.Barcode
            else -> null
        }

/**
 * Converts a [SceneMode] to a scene mode code as in [Camera.Parameters].
 *
 * @receiver The [io.fotoapparat.Fotoapparat]'s camera [SceneMode].
 * @return scene mode code as in [Camera.Parameters].
 */
fun SceneMode.toCode(): String =
        when (this) {
            SceneMode.Auto -> Camera.Parameters.SCENE_MODE_AUTO
            SceneMode.Action -> Camera.Parameters.SCENE_MODE_ACTION
            SceneMode.Portrait -> Camera.Parameters.SCENE_MODE_PORTRAIT
            SceneMode.Landscape -> Camera.Parameters.SCENE_MODE_LANDSCAPE
            SceneMode.Night -> Camera.Parameters.SCENE_MODE_NIGHT
            SceneMode.NightPortrait -> Camera.Parameters.SCENE_MODE_NIGHT_PORTRAIT
            SceneMode.Barcode -> Camera.Parameters.SCENE_MODE_BARCODE
        }