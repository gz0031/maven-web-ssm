package priv.ze.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import priv.ze.beans.Student;
import priv.ze.dao.IStudentDao;
import javax.annotation.Resource;

/**
 * ClassName:IStudentServiceImpl
 * Package:priv.ze.service
 *
 * @date:2020/2/16 21:26
 */
@Service("StudentService")
public class IStudentServiceImpl implements IStudentService {
    @Resource(name="IStudentDao")
    private IStudentDao dao;
    public void setDao(IStudentDao dao) {
        this.dao = dao;
    }
    @Transactional//此处会有默认的隔离级别传播方式可以不写
    public void addStudent(Student student) {
        dao.insertStudent(student);
    }
}
