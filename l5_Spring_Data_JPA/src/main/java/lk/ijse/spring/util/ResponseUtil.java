/*
 * @author : xCODE
 * Project : SpringFramework
 * Date    : 12/13/2024 (Friday)
 * Time    : 2:29 PM
 * For GDSE course of IJSE institute.
 */

package lk.ijse.spring.util;

public class ResponseUtil {

    private String code;

    private String status;

    private Object data;

    public ResponseUtil() {
    }

    public ResponseUtil(String code, String status, Object data) {
        this.code = code;
        this.status = status;
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResponseUtil{" +
                "code='" + code + '\'' +
                ", status='" + status + '\'' +
                ", data=" + data +
                '}';
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
