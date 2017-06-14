package corso.java.git;

public class FirstGITclass {

	public void firstMethod() {

		System.out.println("Test secondo commi");

		System.out.println("sono sempre Pietro");
		

	}
	
	public void ciao() {
		
	}
	
	public void suus() {
		System.out.println("eclipse fa caha");
		
	}
	
	public String helloName(String name){
		return "Hello " + name;
	}
	
	public int boh(int[] a){
		
		int x=0;
		for (int i=0;i<a.length;i++){
			if (a[i]>x)
				x=a[i];		//i massoni lo fascevano meglio sta function che restituisce il valore maggiore del vettore		
	}
		return x;
	
	}
	
	  public void bubbleSort(int [] array) {

	        for(int i = 0; i < array.length; i++) {
	            boolean flag = false;
	            for(int j = 0; j < array.length-1; j++) {

	                //Se l' elemento j e maggiore del successivo allora
	                //scambiamo i valori
	                if(array[j]>array[j+1]) {
	                    int k = array[j];
	                    array[j] = array[j+1];
	                    array[j+1] = k;
	                    flag=true; //Lo setto a true per indicare che é avvenuto uno scambio
	                }
	                

	            }

	            if(!flag) break; //Se flag=false allora vuol dire che nell' ultima iterazione
	                             //non ci sono stati scambi, quindi il metodo può terminare
	                             //poiché l' array risulta ordinato
	        }
	    }

}
