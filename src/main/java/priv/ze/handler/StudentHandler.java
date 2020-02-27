package priv.ze.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import priv.ze.beans.Student;
import priv.ze.service.IStudentService;

/**
 * ClassName:StudentHandler
 * Package:priv.ze.handler
 *
 * @date:2020/2/16 21:14
 */
@org.springframework.stereotype.Controller
@RequestMapping("/area")
public class StudentHandler{
    @Autowired
    @Qualifier("StudentService")
//    @Resource(name="StudentService")
    private IStudentService service;
    public void setService(IStudentService service) {
        this.service = service;
    }
    @RequestMapping("/register.do")
    public String register(String name,int age){
        Student student = new Student(name, age);
        service.addStudent(student);
        return "/jsp/welcome.jsp";
    }
}
