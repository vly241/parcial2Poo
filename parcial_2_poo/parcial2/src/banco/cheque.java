package banco;

import java.util.Scanner;

public class cheque {

	private Scanner sc;
	String name_cliente;
    int n_cuenta;
    int saldo;
    
    public void ch() {
    	
    	 System.out.println("cuenta de cheques");
         
         
         System.out.println("1.) Ingrese el numero de la cuenta: ");
         n_cuenta=sc.nextInt();
         
         System.out.println("2.) Ingrese el nombre del cliente: ");
         name_cliente=sc.nextLine();
         
         System.out.println("3.) Ingrese el saldo: ");
         saldo=sc.nextInt();
         
         System.out.println("la cuenta de cheque se han creado con exito.");

 		
    	 System.out.println();	
    }
    
	public void cheque1() {
		int opc;
		cheque c = new cheque();
		banco b = new banco();
		
		 System.out.println("que desea hacer:");
		 System.out.println("1.registro.");
		 System.out.println("2.consultar.");
		 System.out.println("3.depositar");
		 System.out.println("4.retirar.");
		 System.out.println("5.volver.");
		 opc=sc.nextInt();
		 switch(opc) {
		 
		 case 1:
			 c.cheque1();;
			 break;
			 
		 case 2:
			 c.consultar();
			 break;
			 
		 case 3:
			 c.deposita();
			 break;
		 case 4:
			 c.retirar();
			 break;
			 
		 case 5:
			 b.banco1();
			 break;
		default:
			break;
		 }
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
