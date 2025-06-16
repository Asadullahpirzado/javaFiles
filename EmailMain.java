public class EmailMain {
    public static void main(String[] args) {
        Email email= new Email("hi hello","Asad","Ali","for oop");
        System.out.println(email.toString());
        Message message=new Message("HI om ");
       // System.out.println(ContainsKeyword(email.getSubject()));
        boolean b= ContainsKeyword(message,"asad");
        System.out.println(b);
    }
    public static boolean ContainsKeyword(Message messageObject,
                                          String keyword) {
        if (messageObject.toString().indexOf(keyword,0) >= 0)
            return true;
        return false;
    }
}
