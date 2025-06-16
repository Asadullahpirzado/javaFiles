public class MessageSMSEmail {
    // Message base class
    static class Message {
        private String text;

        // Constructor
        public Message(String text) {
            this.text = text;
        }

        // Mutator method
        public void setText(String text) {
            this.text = text;
        }

        // Accessor method
        public String getText() {
            return text;
        }

        // toString method
        @Override
        public String toString() {
            return text;
        }
    }

    // SMS class derived from Message
    static class SMS extends Message {
        private String recipientContactNo;

        // Constructor
        public SMS(String text, String recipientContactNo) {
            super(text);
            this.recipientContactNo = recipientContactNo;
        }

        // Accessor method
        public String getRecipientContactNo() {
            return recipientContactNo;
        }

        // Mutator method
        public void setRecipientContactNo(String recipientContactNo) {
            this.recipientContactNo = recipientContactNo;
        }

        // Overridden toString method
        @Override
        public String toString() {
            return "SMS to " + recipientContactNo + ": " + super.toString();
        }
    }

    // Email class derived from Message
    static class Email extends Message {
        private String sender;
        private String receiver;
        private String subject;

        // Constructor
        public Email(String text, String sender, String receiver, String subject) {
            super(text);
            this.sender = sender;
            this.receiver = receiver;
            this.subject = subject;
        }

        // Accessor methods
        public String getSender() {
            return sender;
        }

        public String getReceiver() {
            return receiver;
        }

        public String getSubject() {
            return subject;
        }

        // Mutator methods
        public void setSender(String sender) {
            this.sender = sender;
        }

        public void setReceiver(String receiver) {
            this.receiver = receiver;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        // Overridden toString method
        @Override
        public String toString() {
            return "From: " + sender + ", To: " + receiver + ", Subject: " + subject + ", Message: " + super.toString();
        }
    }

    // Method to check if message contains keyword
    public static boolean ContainsKeyword(Message messageObject, String keyword) {
        if (messageObject.toString().indexOf(keyword, 0) >= 0)
            return true;
        return false;
    }

    // Method to encode message
    public static String encodeMessage(String message) {
        StringBuilder encoded = new StringBuilder();
        for (char c : message.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                char next = (char) (base + (c - base + 1) % 26);
                encoded.append(next);
            } else {
                encoded.append(c);
            }
        }
        return encoded.toString();
    }

    // Main method to test the classes
    public static void main(String[] args) {
        // Create SMS objects
        SMS sms1 = new SMS("Hello, this is Java class", "+1234567890");
        SMS sms2 = new SMS("Meeting tomorrow", "+0987654321");

        // Create Email objects
        Email email1 = new Email("This is Java programming", "alice@example.com", "bob@example.com", "Java Course");
        Email email2 = new Email("Project deadline approaching", "carol@example.com", "dave@example.com", "Project Update");

        // Test toString methods
        System.out.println("SMS 1: " + sms1.toString());
        System.out.println("SMS 2: " + sms2.toString());
        System.out.println("Email 1: " + email1.toString());
        System.out.println("Email 2: " + email2.toString());
        System.out.println();

        // Test ContainsKeyword method
        String keyword = "Java";
        System.out.println("Checking for keyword '" + keyword + "':");
        System.out.println("SMS 1 contains 'Java': " + ContainsKeyword(sms1, keyword));
        System.out.println("SMS 2 contains 'Java': " + ContainsKeyword(sms2, keyword));
        System.out.println("Email 1 contains 'Java': " + ContainsKeyword(email1, keyword));
        System.out.println("Email 2 contains 'Java': " + ContainsKeyword(email2, keyword));
        System.out.println();

        // Test encoding
        String message = "This is Java";
        String encodedMessage = encodeMessage(message);
        System.out.println("Original message: " + message);
        System.out.println("Encoded message: " + encodedMessage);
    }
}