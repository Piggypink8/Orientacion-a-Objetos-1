package ar.edu.unlp.info.oo1.Ejercicio10;

import java.util.List;

public class MostEffort implements Strategy {

	@Override
	public JobDescription next(List<JobDescription> l) {
		// TODO Auto-generated method stub
		return l.stream()
                .max((j1,j2) -> Double.compare(j1.getEffort(), j2.getEffort()))
                .orElse(null);
	}

}
