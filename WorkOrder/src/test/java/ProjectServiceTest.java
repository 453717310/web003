import cn.bdqn.bean.Project;
import cn.bdqn.service.ProjectService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by dll on 2017/7/28.
 */
public class ProjectServiceTest {

    @Test
            public void test(){

    ApplicationContext ac= new ClassPathXmlApplicationContext("applicationContext.xml");
        Project project=new Project();
        project.setProjectName("jdsa");
        ProjectService projectService= (ProjectService) ac.getBean("dao");
        projectService.add(project);
        System.out.println(projectService);
    }




}