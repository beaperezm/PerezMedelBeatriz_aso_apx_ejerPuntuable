package com.bbva.wikj;

import com.bbva.wikj.dto.ejerpuntuable.EjerPuntuableIn;
import com.bbva.wikj.dto.ejerpuntuable.EjerPuntuableOut;
import com.bbva.wikj.lib.r002.WIKJR002;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WIKJT00201ESTransaction extends AbstractWIKJT00201ESTransaction {

	private static final Logger LOGGER = LoggerFactory.getLogger(WIKJT00201ESTransaction.class);

	@Override
	public void execute() {
		WIKJR002 wikjR002 = this.getServiceLibrary(WIKJR002.class);
		EjerPuntuableIn ejerPuntuableIn = this.getEjerpuntuablein();
		int result = wikjR002.executeInsert(ejerPuntuableIn);
		if(result == 0) {
			setEjerpuntuableout(null);
		} else {
			EjerPuntuableOut ejerPuntuableOut = wikjR002.executeSelect();
			setEjerpuntuableout(ejerPuntuableOut);
		}
	}

}
