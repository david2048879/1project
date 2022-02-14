

class students{
    int id;
    String name;
    int age;
    String gender;

    void insert(int i, String n, int a, String g){
        id=a;
        name=n;
        age=a;
        gender=g;

    }
    void display(){
        System.out.println(id +" "+ name +" "+ age +" "+ gender);
    }
        }




public class object {
     public static void main(String[] args) {

         students s1=new students();
         students s2=new students();
         students s3=new students();
         System.out.println("ID"+" "+"NAME"+" "+"AGE"+" "+"GENDER");
         s1.insert(01,"David",20,"m");
         s2.insert(02,"Ajayi",14,"F");
         s3.insert(03,"Thiery",10,"m");
         s1.display();
         s2.display();
         s3.display();
    }

}
