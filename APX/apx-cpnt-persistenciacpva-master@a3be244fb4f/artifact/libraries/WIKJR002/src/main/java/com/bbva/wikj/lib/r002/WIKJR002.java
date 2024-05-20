package com.bbva.wikj.lib.r002;

import com.bbva.wikj.dto.ejerpuntuable.EjerPuntuableIn;
import com.bbva.wikj.dto.ejerpuntuable.EjerPuntuableOut;

public interface WIKJR002 {

	int executeInsert(EjerPuntuableIn ejerPuntuableIn);

	EjerPuntuableOut executeSelect();

}
