
/**
 * @author RainZ
 * 自定义文本比较异常
 */
public class CommonException extends RuntimeException {
    public CommonException(String message) {
        super(message);
    }
    public CommonException(String message, Throwable cause) {
        super(message, cause);
    }
}
