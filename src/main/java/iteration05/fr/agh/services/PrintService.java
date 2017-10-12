package iteration05.fr.agh.services;

import iteration05.fr.agh.domain.Dimension;
import iteration05.fr.agh.domain.Grid;

public interface PrintService {
	
	public void print(int stepNumber,Grid grid,Dimension dimension);

}
