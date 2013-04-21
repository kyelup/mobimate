package st.isacc.isacc.services.com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * �����׼��rest�����Զ�Ӧʵ�����Ĳ���,�Դﵽͳһrest�ķ�������,
 * �����Ա���������Ҫ�ظ���д@RequestMapping annotation.
 * 
 * ����Ҫʵ��ĳ����ֻ�踲������ķ�������.
 * ע��: ����ʱ��ʹ��@Override,��ȷ�����ᷢ������
 * <pre>
 * /userinfo                => index()  
 * /userinfo/new            => _new()  
 * /userinfo/{id}           => show()  
 * /userinfo/{id}/edit      => edit()  
 * /userinfo        POST    => create()  
 * /userinfo/{id}   PUT     => update()  
 * /userinfo/{id}   DELETE  => delete()  
 * /userinfo        DELETE  => batchDelete()  
 * </pre>
 * @author badqiu
 */
public class BaseRestSpringController<Entity,PK> extends BaseSpringController{
	
	//�ر�˵��: ����spring�ķ�������ӳ��̫�������,������²�������Ӧ��,���Լ��޸Ĳ������޸Ĵ���������ģ��
	// ����㲻ϲ�� HttpServletRequest request,HttpServletResponse response��Ϊ����������Ҳ��ɾ��
	
	@RequestMapping
	public ModelAndView index(HttpServletRequest request,HttpServletResponse response,Entity model) {
		throw new UnsupportedOperationException("not yet implement");
	}
	
	/** �������� */
	@RequestMapping(value="/new")
	public ModelAndView _new(HttpServletRequest request,HttpServletResponse response,Entity model) throws Exception {
		throw new UnsupportedOperationException("not yet implement");
	}
	
	/** ��ʾ */
	@RequestMapping(value="/{id}")
	public ModelAndView show(@PathVariable PK id) throws Exception {
		throw new UnsupportedOperationException("not yet implement");
	}
	
	/** �༭ */
	@RequestMapping(value="/{id}/edit")
	public ModelAndView edit(@PathVariable PK id) throws Exception {
		throw new UnsupportedOperationException("not yet implement");
	}
	
	/** �������� */
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView create(HttpServletRequest request,HttpServletResponse response,Entity model) throws Exception {
		throw new UnsupportedOperationException("not yet implement");
	}
	
	/** ������� */
	@RequestMapping(value="/{id}",method=RequestMethod.PUT)
	public ModelAndView update(@PathVariable PK id,HttpServletRequest request,HttpServletResponse response) throws Exception {
		throw new UnsupportedOperationException("not yet implement");
	}
	
	/** ɾ�� */
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	public ModelAndView delete(@PathVariable PK id) {
		throw new UnsupportedOperationException("not yet implement");
	}

	/** ����ɾ�� */
	@RequestMapping(method=RequestMethod.DELETE)
	public ModelAndView batchDelete(@RequestParam("items") PK[] items) {
		throw new UnsupportedOperationException("not yet implement");
	}
}
