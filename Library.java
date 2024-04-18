public class Library {
    public static void main(String args[]){
        User details=new User();
        details.UsrName="madesh";
        details.UsrId="21CS084";
        System.out.println(details.UsrName);
        System.out.println(details.UsrId);
        Book details1=new Book();
        details1.BookName="The  C";
        details1.BookId="21XCS0";
        details1.price=200;
        System.out.println(details1.BookName);
        System.out.println(details1.BookId);
        System.out.println(details1.price);
        Card details2=new Card();
        details2.CardName="Maddy";
        details2.CardNo=7893556;
        details2.CardDetails="AccessCard";
        System.out.println(details2.CardName);
        System.out.println(details2.CardNo);
        System.out.println(details2.CardDetails);

        ReminderMessage details3=new ReminderMessage();
        details3.title="Reminder for Book return";
        details3.DueDate="21/06/2024";
        details3.Date="21/04/2024";
        details3.Id=22124;
        details3.DateOfRenew="19/06/2024";
        System.out.println(details3.title);
        System.out.println(details3.DueDate);
        System.out.println(details3.Date);
        System.out.println(details3.Id);
        System.out.println(details3.DateOfRenew);
    }
}
