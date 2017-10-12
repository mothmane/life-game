package iteration05;

import iteration05.fr.agh.domain.Dimension;
import iteration05.fr.agh.domain.Grid;
import iteration05.fr.agh.services.PrintService;

public class Simulator {

	private PrintService printService;
	private Dimension dimension;
	private int iterationNumber;
	private Grid grid;

	public Simulator() {
		super();
	}

	public Simulator(Dimension dimension, int iterationNumber, Grid grid) {
		super();
		this.dimension = dimension;
		this.iterationNumber = iterationNumber;
		this.grid = grid;
	}

	public void start() {
		printService.print(0, this.grid,this.dimension);
		for (int i = 1; i <= this.iterationNumber; i++) {
			grid.evolution();
			printService.print(i, this.grid,this.dimension);
		}

	}

	public Dimension getDimension() {
		return dimension;
	}

	public void setDimension(Dimension dimension) {
		this.dimension = dimension;
	}

	public int getIterationNumber() {
		return iterationNumber;
	}

	public void setIterationNumber(int iterationNumber) {
		this.iterationNumber = iterationNumber;
	}

	public Grid getGrid() {
		return grid;
	}

	public void setGrid(Grid grid) {
		this.grid = grid;
	}

	public PrintService getPrintService() {
		return printService;
	}

	public void setPrintService(PrintService printService) {
		this.printService = printService;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Simulator other = (Simulator) obj;
		if (dimension == null) {
			if (other.dimension != null)
				return false;
		} else if (!dimension.equals(other.dimension))
			return false;
		if (grid == null) {
			if (other.grid != null)
				return false;
		} else if (!grid.equals(other.grid))
			return false;
		if (iterationNumber != other.iterationNumber)
			return false;
		
		return true;
	}

	@Override
	public String toString() {
		return "Simulator [dimension=" + dimension + ", iterationNumber=" + iterationNumber + ", grid=" + grid + "]";
	}

}
