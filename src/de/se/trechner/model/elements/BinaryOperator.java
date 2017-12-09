package de.se.trechner.model.elements;

import de.se.trechner.model.GridActions;

public class BinaryOperator extends Operator{
	private int rank;

	public BinaryOperator(GridActions identifier) {
		super(identifier);
		rank = getRank(identifier);
	}

	public boolean isPrioritised(BinaryOperator b) {
		return (rank >= b.rank);
	}
	
	private int getRank(GridActions identifier){
		switch(identifier){
		case ADDITION:
		case SUBTRACT:
			return 1;
		case MULTIPLY:
		case DIVIDE:
			return 2;
		case XPOWY:
		case YSQRT:
		case EXP:
		case MOD:
			return 3;
		}
		return -1;
	}
}