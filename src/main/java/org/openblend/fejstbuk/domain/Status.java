package org.openblend.fejstbuk.domain;

import javax.persistence.Entity;
import java.util.Date;

/**
 * @author <a href="mailto:ales.justin@jboss.org">Ales Justin</a>
 */
@Entity
public class Status extends Linked {
    private String status;

    public Status() {
    }

    public Status(String status, Date timestamp) {

        this.status = status;
        setTimestamp(timestamp);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
