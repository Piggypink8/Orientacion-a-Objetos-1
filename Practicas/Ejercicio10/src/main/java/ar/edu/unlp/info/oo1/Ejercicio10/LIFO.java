package ar.edu.unlp.info.oo1.Ejercicio10;

import java.util.List;

public class LIFO implements Strategy{

	@Override
	public JobDescription next(List<JobDescription> l) {
		return l.get(l.size()-1);
	}

}
