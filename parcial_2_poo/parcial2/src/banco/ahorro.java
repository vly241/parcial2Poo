package banco;
import java.util.*;

public class ahorro {

	private Scanner sc;
	String name_cliente;
    int n_cuenta;
    int saldo;
    String fecha_n;
    String interes;
    
    banco b = new banco();
    
    public void menu_ahorro() {
		int opc;
		ahorro a = new ahorro();
		
		 System.out.println("que desea hacer:");
		 System.out.println("1.registro.");
		 System.out.println("2.consultar.");
		 System.out.println("3.depositar");
		 System.out.println("4.retirar.");
		 System.out.println("5.volver.");
		 opc=sc.nextInt();
		 switch(opc) {
		 
		 case 1:
			 a.ahorro1();
			 break;
			 
		 case 2:
			 a.consultar();
			 break;
			 
		 case 3:
			 a.deposita();
			 break;
		 case 4:
			 a.retirar();
			 break;
			 
		 case 5:
			 b.banco1();
			 break;
		default:
			break;
		 }
	}
	
	
	
	public void ahorro1() {
		
		
        System.out.println("cuenta de ahorros");
      
                
                System.out.println("1.) Ingrese el numero de la cuenta: ");
                n_cuenta=sc.nextInt();
                
                System.out.println("2.) Ingrese el nombre del cliente: ");
                name_cliente=sc.nextLine();
                
                System.out.println("3.) Ingrese el saldo: ");
                saldo=sc.nextInt();
                
                System.out.println("4.) Ingrese la fecha de vencimiento: ");
                fecha_n=sc.nextLine();
                System.out.println("");
                
                System.out.println("5.) Ingrese el porcentage del interes mensual. ");
                interes=sc.nextLine();
                System.out.println("");
                
                System.out.println("");
                
	
        System.out.println("la cuenta de ahorro se han creado con exito.");

		
	 System.out.println();	
	
     
	}
	
	
	
	public void deposita() {
		int valor;
		 System.out.println("ingrese el valor que desea depositar:");
		 valor=sc.nextInt();
		 
		 saldo=valor+saldo;
       
    }
	
	public void consultar() {
		System.out.println("el saldo de la cuenta de ahorro es:"+saldo);
	}
	
	public void retirar() {
		int retiro;
		 System.out.println("ingrese el valor que desea retirar:");
		 retiro=sc.nextInt();
		saldo=saldo-retiro;
	}
	
	
}
