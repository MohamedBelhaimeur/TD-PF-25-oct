package TD.PF.oct;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Paire<T,U> {
	  public T taille;
	  public U poid;
	  public Paire(T taille, U poid) {
	  this.taille = taille;
	  this.poid = poid;
	  }
	  @Override public String toString() {
	  return String.format("(%s,%s)",taille.toString(),poid.toString());
	  }
	  
	  public List <T> filtragePredicatif(List<Predicate<T>>list,List<T> lsite2){
		Predicate<T> global=list.stream().reduce(x->true, Predicate::and);
		  List<T> listeresult=null;
		 
		  for(T index:lsite2) {
			  if(global.test(index)) {
				  listeresult.add(index);
			  }
			 
			  
		  }
		  
		  return listeresult;
		  
	  }
		  
	}
