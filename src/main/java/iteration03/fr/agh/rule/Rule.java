package iteration03.fr.agh.rule;

import iteration03.fr.agh.domain.Grid;
import iteration03.fr.agh.domain.State;

public interface Rule {
	
	public State apply(int index,Grid grid);

}
