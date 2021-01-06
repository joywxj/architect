package com.joy.utils.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * <p>@ClassName: JsonHelper  </p>
 * <p>@Description: </p>
 * <p>@author: wxj  </p>
 * <p>@date: 2021/1/5</p>
 * <p>@Tel:18772118541</p>
 * <p>@email:18772118541@163.com</p>
 */
public class JsonHelper {
	private JsonHelper() {
	}

	public static String object2Str(Object obj) throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		String s = mapper.writeValueAsString(obj);
		return s;
	}
}
