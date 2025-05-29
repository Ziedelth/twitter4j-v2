package twitter4j

enum class MediaType(val value: String, val otherValues: List<String> = emptyList()) {
    VIDEO_MP4("video/mp4"),
    VIDEO_WEBM("video/webm"),
    VIDEO_MP2T("video/mp2t"),
    VIDEO_QUICKTIME("video/quicktime"),
    TEXT_SRT("text/srt"),
    TEXT_VTT("text/vtt"),
    IMAGE_JPEG("image/jpeg", listOf("image/jpg")),
    IMAGE_GIF("image/gif"),
    IMAGE_BMP("image/bmp"),
    IMAGE_PNG("image/png"),
    IMAGE_WEBP("image/webp"),
    IMAGE_PJPEG("image/pjpeg"),
    IMAGE_TIFF("image/tiff"),
    MODEL_GLTF_BINARY("model/gltf-binary"),
    MODEL_VND_USDZ("model/vnd.usdz+zip"),
    ;

    companion object {
        fun fromValue(value: String): MediaType? {
            return MediaType.entries.firstOrNull { it.value == value || it.otherValues.contains(value) }
        }
    }
}