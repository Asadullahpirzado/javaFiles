public class SMS extends Message{
    private String recipientContactNo;
    public SMS(){}

    public SMS(String recipientContactNo) {
        this.recipientContactNo = recipientContactNo;
    }

    public SMS(String text, String recipientContactNo) {
        super(text);
        this.recipientContactNo = recipientContactNo;
    }

    public String getRecipientContactNo() {
        return recipientContactNo;
    }

    public void setRecipientContactNo(String recipientContactNo) {
        this.recipientContactNo = recipientContactNo;
    }

    @Override
    public String toString() {
        return "SMS{" +
                "recipientContactNo='" + recipientContactNo + '\'' +"text='" + getText() +
                '}';
    }
}
