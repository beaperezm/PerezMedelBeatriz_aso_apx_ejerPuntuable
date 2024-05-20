package com.bbva.wikj;

import com.bbva.elara.transaction.AbstractTransaction;
import com.bbva.wikj.dto.ejerpuntuable.EjerPuntuableIn;
import com.bbva.wikj.dto.ejerpuntuable.EjerPuntuableOut;

/**
 * In this class, the input and output data is defined automatically through the setters and getters.
 */
public abstract class AbstractWIKJT00201ESTransaction extends AbstractTransaction {

	public AbstractWIKJT00201ESTransaction(){
	}

	protected EjerPuntuableIn getEjerpuntuablein(){
		return (EjerPuntuableIn)this.getParameter("ejerPuntuableIn");
	}

	protected void setEjerpuntuableout(final EjerPuntuableOut field){
		this.addParameter("ejerPuntuableOut", field);
	}
}
