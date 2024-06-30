package ar.edu.unlp.info.oo1.Ejercicio10;

import java.util.List;

public class HighestPriority implements Strategy {

	@Override
	public JobDescription next(List<JobDescription> l) {
		return l.stream()
        .max((j1,j2) -> Double.compare(j1.getPriority(), j2.getPriority()))
        .orElse(null);
	}

}
