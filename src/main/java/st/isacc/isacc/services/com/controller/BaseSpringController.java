package st.isacc.isacc.services.com.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;

import org.springframework.util.ReflectionUtils;

import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class BaseSpringController extends MultiActionController {

	protected static void saveMessage(HttpServletRequest request, String message) {
		if (StringUtils.isNotBlank(message)) {
			List list = getOrCreateRequestAttribute(request, "springMessages",
					ArrayList.class);
			list.add(message);
		}
	}

	protected static void saveError(HttpServletRequest request, String errorMsg) {
		if (StringUtils.isNotBlank(errorMsg)) {
			List list = getOrCreateRequestAttribute(request, "springErrors",
					ArrayList.class);
			list.add(errorMsg);
		}
	}

	public static <T> T getOrCreateRequestAttribute(HttpServletRequest request,
			String key, Class<T> clazz) {
		Object value = request.getAttribute(key);
		if (value == null) {
			try {
				value = clazz.newInstance();
			} catch (Exception e) {
				ReflectionUtils.handleReflectionException(e);
			}
			request.setAttribute(key, value);
		}
		return (T) value;
	}

}
