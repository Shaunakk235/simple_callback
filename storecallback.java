public class storecallback
{
    public static void main(String[] args) {
        store st=new store();
        customer c1=new customer();
        c1.Customer("Jake");
        customer c2=new customer();
        c2.Customer("John");
        st.register(c1);
        st.register(c2);
        st.inviteSale();
    }
}
