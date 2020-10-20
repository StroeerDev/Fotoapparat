package io.fotoapparat.selector

import io.fotoapparat.parameter.SceneMode

typealias SceneModeSelector = Iterable<SceneMode>.() -> SceneMode?

/**
 * @return Selector function which provides an auto scene mode if available.
 * Otherwise provides `null`.
 */
fun autoScene(): SceneModeSelector = single(SceneMode.Auto)


/**
 * @return Selector function which provides a auto scene mode if available.
 * Otherwise provides `null`.
 */
fun action(): SceneModeSelector = single(SceneMode.Action)

/**
 * @return Selector function which provides a potrait mode if available.
 * Otherwise provides `null`.
 */
fun portrait(): SceneModeSelector = single(SceneMode.Portrait)

/**
 * @return Selector function which provides a landsacpe mode if available.
 * Otherwise provides `null`.
 */
fun landscape(): SceneModeSelector = single(SceneMode.Landscape)

/**
 * @return Selector function which provides a night mode if available.
 * Otherwise provides `null`.
 */
fun night(): SceneModeSelector = single(SceneMode.Night)

/**
 * @return Selector function which provides a night portrait mode if available.
 * Otherwise provides `null`.
 */
fun nightPortrait(): SceneModeSelector = single(SceneMode.NightPortrait)

/**
 * @return Selector function which provides a night portrait mode if available.
 * Otherwise provides `null`.
 */
fun barcode(): SceneModeSelector = single(SceneMode.Barcode)
