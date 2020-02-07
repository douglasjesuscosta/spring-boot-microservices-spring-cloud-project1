
package mobileappws.response;

import java.util.Date;

/**
 * ErrorMessage
 */
public class ErrorMessage {
    private Date timeStamp;
    private String message;

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}