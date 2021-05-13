import java.util.Scanner;

public class Principal {
    public static void main (String[]args){
int op=0;

        String[]std = new String[0];
        String []str = new String[0];

        Scanner scanner= new Scanner(System.in);
        while(op!=4){



            System.out.println("Bienvenido al sistema de provincias.\n" +
                    "¿Qué desea hacer? \n1) Crear zona geográfica \n2) Crear Pais \n3) Mostrar Datos \n4)Salir");

        op = scanner.nextInt();
         switch(op) {



             case 1:
                 System.out.println("Ha seleccionado opcion 1\n ¿Cuantas zonas desea crear?");
                 int c = scanner.nextInt();
                 str = new String[c];
                 for (int x = 0; x < c; x++) {
                     System.out.println("inserte nombre de zona ");
                     String name = scanner.next();
                     System.out.println("insterte la superficie de zona ");
                     String s = scanner.next();
                     Herencia zona = new Herencia(name, s);
                     str[x] = name + " " + s;
                 }

                 break;

             case 2:
                 System.out.println("Ha seleccionado opcion 2\n ¿Cuantos paises desea crear?");
                 int d=scanner.nextInt();
                 std = new String[d];

                 for(int x=0;x<d;x++){
                     System.out.println("inserte Lenguaje del pais ");
                     String l = scanner.next();
                     System.out.println("insterte la moneda del pais ");
                     String coin= scanner.next();
                     System.out.println("insterte el presidente del pais ");
                     String p= scanner.next();
                     System.out.println("inserte la zona del pais ");
                     String name = scanner.next();
                     System.out.println("insterte la superficie del pais ");
                     String s= scanner.next();

                     Getters_n_Setters pais= new Getters_n_Setters(l,coin,p,name,s);
                     std[x] = l+" "+coin+" "+p+" "+name+" "+s;
                 }



                 break;

             case 3:
                 System.out.println("Zonas y pasies creados");
                 System.out.println("zonas");
                 imprimirzona(str);
                 System.out.println("paises");
                 imprimirpais(std);

                 break;

             case 4:
                 System.out.close();

             break;



         }
        }

    }
    public static void imprimirzona(String[] arr){
        for (int x = 0; x < arr.length; x++) {
            System.out.println(arr[x]);
        }
    }
    public static void imprimirpais(String[]arr2 ){
        for (int x = 0; x < arr2.length; x++) {
            System.out.println(arr2[x]);
        }
    }

}
