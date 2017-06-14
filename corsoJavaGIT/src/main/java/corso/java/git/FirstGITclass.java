package corso.java.git;

public class FirstGITclass {


	
	public String helloName(String name){
		return "Hello " + name;
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
