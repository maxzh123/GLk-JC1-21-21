package MyApp;

public class BaseResponse {
    private final String status;
    private final Integer code;
    private final String description = "Это я";

    public BaseResponse(String status, Integer code) {
        this.status = status;
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public Integer getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
