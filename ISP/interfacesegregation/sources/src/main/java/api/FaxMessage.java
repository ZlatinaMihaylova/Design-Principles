package api;

public interface FaxMessage extends MessageWithSubject {

    String getCompanyName();

    String getCallbackFax();
}
