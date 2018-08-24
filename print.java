class print
{
void display()
{
System.out.println("no values");
}
void display(int a)
{
System.out.println("Value:"+a);
}
void display(float a)
{
System.out.println("Value:"+a);
}
public static void main(String args[])
{
print p=new print();
p.display();
p.display(10);
p.display(10.5f);
}
}