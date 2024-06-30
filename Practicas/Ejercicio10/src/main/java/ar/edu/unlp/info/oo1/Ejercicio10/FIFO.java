package ar.edu.unlp.info.oo1.Ejercicio10;

import java.util.List;

public class FIFO implements Strategy{
	
	public FIFO() {}
	
	@Override
	public JobDescription next(List<JobDescription> l) {
		return l.get(0);
	}

}
