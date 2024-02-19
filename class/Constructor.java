class another {
int Marriage_Age;
int Mapila_Age;
String Mapila_Name;
String Ponnu_Name;
int Ponnu_Age;
     another (){

    }
    another(int n){
        Marriage_Age = n;
        System.out.println(Marriage_Age);
    }
    another(String str,String str1 ,int a,int b){
        Mapila_Name = str;
        Ponnu_Name = str1;
        Mapila_Age = a;
        Ponnu_Age = b;
        System.out.println(Mapila_Name +" " + Mapila_Age +" " + Ponnu_Name +" " + Ponnu_Age);
        
    }
}
public class Constructor {

    

public static void main(String [] args){
    another m =new another(27);
    another c = new another("Sivuuu" , "Meenu" , 25 ,23);


}
}