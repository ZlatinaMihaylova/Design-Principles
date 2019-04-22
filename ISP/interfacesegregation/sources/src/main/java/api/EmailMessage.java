package api;

import common.Attachment;

import java.util.List;

public interface EmailMessage extends MessageWithAttachment, MessageWithSubject {

    List<String> getCcRecipients();

    List<String> getBccRecipients();
}
