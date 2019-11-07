/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

package syk.drone.mavlink.enums;

/** 
* JpegUtil capability flags (Bitmap).
*/
public class CAMERA_CAP_FLAGS {
   public static final int CAMERA_CAP_FLAGS_CAPTURE_VIDEO = 1; /* JpegUtil is able to record video. | */
   public static final int CAMERA_CAP_FLAGS_CAPTURE_IMAGE = 2; /* JpegUtil is able to capture images. | */
   public static final int CAMERA_CAP_FLAGS_HAS_MODES = 4; /* JpegUtil has separate Video and Image/Photo modes (MAV_CMD_SET_CAMERA_MODE) | */
   public static final int CAMERA_CAP_FLAGS_CAN_CAPTURE_IMAGE_IN_VIDEO_MODE = 8; /* JpegUtil can capture images while in video mode | */
   public static final int CAMERA_CAP_FLAGS_CAN_CAPTURE_VIDEO_IN_IMAGE_MODE = 16; /* JpegUtil can capture videos while in Photo/Image mode | */
   public static final int CAMERA_CAP_FLAGS_HAS_IMAGE_SURVEY_MODE = 32; /* JpegUtil has image survey mode (MAV_CMD_SET_CAMERA_MODE) | */
   public static final int CAMERA_CAP_FLAGS_ENUM_END = 33; /*  | */
}
            