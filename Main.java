class Flower {
void display () {
System.out.println("Rose is a beautiful flower.");
}
void display (String flower) {
for (int i=0;i<2;i++) {
System.out.println(flower + " is a beautiful flower.");
}
}
void display (String flower,int n) {
for (int i=0;i<n;i++) {
System.out.println(flower + " is a beautiful flower.");
}
}
}
public class Main {
public static void main(String args[]) {
Flower flower = new Flower();
flower.display();
flower.display("Sunflower");
flower.display("Marigold",3);
}
}