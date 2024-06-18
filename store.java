interface Member
{
    void callback();
}
class store
{
  Member mem[]=new Member[100];
  int total=0;
  void register(Member m)
  {
    mem[total++]=m;
  }
  void inviteSale()
  {
    for(int i=0;i<total;i++)
    {
      mem[i].callback();
    }
  }
}
