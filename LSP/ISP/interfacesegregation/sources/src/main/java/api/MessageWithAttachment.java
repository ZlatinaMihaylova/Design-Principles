package api;

import common.Attachment;

import java.util.List;

public interface MessageWithAttachment extends Message {

    List<Attachment> getAttachments();
}
