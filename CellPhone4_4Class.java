
public class CellPhone4_4Class   {
    private String IMEICode;
    private String SIMCard;
    private String Processor;
    private double InternalMemory;
    private String SIMtype;

    public CellPhone4_4Class(String IMEICode, String SIMCard, String processor, double internalMemory, String SIMtype) {
        this.IMEICode = IMEICode;
        this.SIMCard = SIMCard;
        Processor = processor;
        InternalMemory = internalMemory;
        this.SIMtype = SIMtype;
    }

    public String getIMEICode() {
        return IMEICode;
    }

    public String getSIMCard() {
        return SIMCard;
    }

    public String getProcessor() {
        return Processor;
    }

    public double getInternalMemory() {
        return InternalMemory;
    }

    public String getSIMtype() {
        return SIMtype;
    }

    public void setIMEICode(String IMEICode) {
        this.IMEICode = IMEICode;
    }

    public void setSIMCard(String SIMCard) {
        this.SIMCard = SIMCard;
    }

    public void setProcessor(String processor) {
        Processor = processor;
    }

    public void setInternalMemory(double internalMemory) {
        InternalMemory = internalMemory;
    }

    public void setSIMtype(String SIMtype) {
        this.SIMtype = SIMtype;
    }
    public void DialNumber(String number){
        System.out.println("Number is: "+ number);
    }
    public void receiveCall(){
        System.out.println("Call is receive");
    }

    public void sendSMS(String message, String recipient) {
        System.out.println("Sending SMS to " + recipient + ": " + message);
    }

    public void receiveSMS(String message, String sender) {
        System.out.println("Received SMS from " + sender + ": " + message);
    }

    public static void main(String[] args) {

        CellPhone4_4Class cellPhone1 = new CellPhone4_4Class(
                "IEDF34343435235",
                "Nano SIM",
                "SnapDragon",
                8,
                "Single SIM"
        );



        // Calling all methods
        cellPhone1.DialNumber("03001234567");

        cellPhone1.receiveCall();
        cellPhone1.sendSMS("Hello! How are you?", "03111234567");
        cellPhone1.receiveSMS("I’m good, thanks!", "03221234567");

        // Displaying values using getters
        System.out.println("\nPhone Details:");
        System.out.println("IMEI Code: " + cellPhone1.getIMEICode());
        System.out.println("SIM Card: " + cellPhone1.getSIMCard());
        System.out.println("Processor: " + cellPhone1.getProcessor());
        System.out.println("Memory: " + cellPhone1.getInternalMemory() + " GB");
        System.out.println("SIM Type: " + cellPhone1.getSIMtype());
    }


}
