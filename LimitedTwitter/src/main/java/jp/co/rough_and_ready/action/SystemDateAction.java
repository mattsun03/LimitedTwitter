package jp.co.rough_and_ready.action;

import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.arnx.jsonic.JSON;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 * åªç›éûçèÇï‘Ç∑Action
 *
 * @author mattsun
 *
 */
public class SystemDateAction extends Action {

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		Map<String, Integer> sysDateMap = new LinkedHashMap<String, Integer>();

		Calendar cal = Calendar.getInstance();
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);

		sysDateMap.put("hour", hour);
		sysDateMap.put("minute", minute);
		sysDateMap.put("second", second);

    	response.setContentType("text/javascript");
    	response.setCharacterEncoding("UTF-8");
    	response.getWriter().write(JSON.encode(sysDateMap));

		return null;
	}
}
