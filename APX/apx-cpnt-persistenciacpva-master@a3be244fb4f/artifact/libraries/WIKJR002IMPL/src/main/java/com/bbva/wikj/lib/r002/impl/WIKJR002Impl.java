package com.bbva.wikj.lib.r002.impl;

import com.bbva.wikj.dto.ejerpuntuable.EjerPuntuableIn;
import com.bbva.wikj.dto.ejerpuntuable.EjerPuntuableOut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class WIKJR002Impl extends WIKJR002Abstract {
	private static final Logger LOGGER = LoggerFactory.getLogger(WIKJR002Impl.class);

	@Override
	public int executeInsert(EjerPuntuableIn ejerPuntuableIn) {
		Map<String, Object> args = new HashMap<>();
		args.put("id", ejerPuntuableIn.getId());
		args.put("date_field", ejerPuntuableIn.getDateField());
		return this.jdbcUtils.update("query.insert",args);
	}

	@Override
	public EjerPuntuableOut executeSelect() {
		String result = this.jdbcUtils.queryForString("query.select");
		EjerPuntuableOut ejerPuntuableOut = new EjerPuntuableOut();
		ejerPuntuableOut.setDateField(result);
		return ejerPuntuableOut;
	}
}
