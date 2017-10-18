package cn.demo.service0.controllerTest;



import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class TestController {
	@RequestMapping("/getTest")
	public String getTest () {
		
		return "adlkfasd ?";
	}
	
	 @RequestMapping("/")
	public String index(ModelMap map) {
	        // 加入一个属性，用来在模板中读取
	        map.addAttribute("host", "http://blog.didispace.com");
	        // return模板文件的名称，对应src/main/resources/templates/index.html
	        return "index";  
	 }
	 
	 @RequestMapping("/newFile")
	 public String newFile(ModelMap map) {
	        // 加入一个属性，用来在模板中读取
	        //map.addAttribute("host", "http://blog.didispace.com");
	        // return模板文件的名称，对应src/main/resources/templates/index.html
		 
		 System.out.println("请求进来...");
	        return "NewFile";  
	  }
}
