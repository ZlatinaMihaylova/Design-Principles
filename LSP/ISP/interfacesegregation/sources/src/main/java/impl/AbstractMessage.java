package impl;


import api.Message;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractMessage implements Message {

    protected List<String> recipients = new ArrayList<>();
    protected String messageBody;

    @Override
    public List<String> getRecipients() {
        return recipients;
    }

    public void setRecipients(List<String> recipients) {
        this.recipients = recipients;
    }

    @Override
    public String getMessageBody() {
        return messageBody;
    }

    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AbstractMessage that = (AbstractMessage) o;

        if (recipients != null ? !recipients.equals(that.recipients) : that.recipients != null) return false;
        return messageBody != null ? messageBody.equals(that.messageBody) : that.messageBody == null;
    }

    @Override
    public int hashCode() {
        int result = recipients != null ? recipients.hashCode() : 0;
        result = 31 * result + (messageBody != null ? messageBody.hashCode() : 0);
        return result;
    }
}
