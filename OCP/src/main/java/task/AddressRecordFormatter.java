package task;

public class AddressRecordFormatter implements RecordFormatter {

    @Override
    public String format(Record record){
        AddressRecord addressRecord = (AddressRecord) record;
        return "address: " + addressRecord.getCountry() + ", " + addressRecord.getProvince() + ", " + addressRecord.getCity() + ", " +
                addressRecord.getStreet() + " st., " + addressRecord.getBuilding() + " b., " + addressRecord.getApartment() + " apt., " +
                addressRecord.getIndex();
    }
}
