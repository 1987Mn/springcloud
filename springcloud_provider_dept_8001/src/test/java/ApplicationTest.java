import com.lzw.springcloud.Application;
import com.lzw.springcloud.dao.DeptMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = Application.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ApplicationTest {


    @Autowired
    DeptMapper deptMapper ;

    @Test
    public void de(){
        System.out.println(deptMapper.getAll());
    }


}
