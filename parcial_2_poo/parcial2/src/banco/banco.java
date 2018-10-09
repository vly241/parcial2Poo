package banco;

import java.util.Scanner;

class banco {
	
	public Scanner t;
	
	int opc;
	
	public void banco1(){
		
		ahorro a = new ahorro();
		cheque c = new cheque();
		
		
	     System.out.println("BANCO ");
	     System.out.println("Ingrese su tipo de cuenta: ");
	     System.out.println("1.CHEQUES.  ");
	     System.out.println("2.CUENTA DE AHORRO. \n");
	     opc=t.nextInt();
	     
	     switch(opc) {
	     
	     case 1:
	    	 c.ch();
	    	 break;
	    	 
	     case 2:
	    	a.ahorro1();
	    	 break;
	    	 
	    	default:
	    		break;
	     }
	
	}
		
	
	


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        banco j = new banco();
                j.banco1();

}
}
