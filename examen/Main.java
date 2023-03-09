package examen;
import java.util.Random;
public class Main {

	public static void main (String []args) {
		
		String[] names= {"valeria", "ricardo", "sofia", "mauricio", "fernando", "michelle","fatima","carlos", "efren","jose"};
		Random random= new Random();
		
		SpecificPerson[]individuo=new SpecificPerson[10];
		
		for (int n=0; n <10; n++) {
			int randNum =random.nextInt(10);
			
			while (names[randNum]==null) {
				randNum=random.nextInt(10);
			}
			
			individuo[n]=new SpecificPerson();
			String nombreAl=names[randNum];
			names[randNum]=null;
			individuo[n].setNombre(nombreAl);
		}
		
		
	}
}
