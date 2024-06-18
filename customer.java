class customer implements Member
{
    private String name;
    void Customer(String n)
    {
        name=n;
    }
    public void callback()
    {
        System.out.println("Thanks I'll Visit"+" "+name);
    }
}
