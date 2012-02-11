package jp.co.rough_and_ready.action;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.rough_and_ready.form.HelloWorldForm;
import net.arnx.jsonic.JSON;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class JsonSampleAction extends Action {

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		HelloWorldForm helloWorldForm = (HelloWorldForm) form;
		helloWorldForm.setMessage("Hello World! Struts");

		Map<String, String> resultMap = new HashMap<String, String>();

		resultMap.put("key1", "value1");
		resultMap.put("key2", "value2");

    	response.setContentType("text/javascript");
    	response.setCharacterEncoding("UTF-8");
    	response.getWriter().write(JSON.encode(resultMap));

		return null;
	}
}
