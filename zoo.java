abstract class animal
{
String breed,color;
abstract void speak();
}
class dog extends animal
{
dog()
{
breed="pug";
color="black";
}
void speak()
{
System.out.println("Breed: "+breed+"\nColor: "+color+"\nSpeak: bark....");
}
}
class cat extends animal
{
cat()
{
breed="normal";
color="white";
}
void speak()
{
System.out.println("Breed: "+breed+"\nColor: "+color+"\nSpeak: meow....");
}
}
class zoo
{
public static void main(String args[])
{
animal a;
a=new dog();
a.speak();
a=new cat();
a.speak();
}
}