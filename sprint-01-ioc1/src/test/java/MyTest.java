import com.kstudy.dao.UserDaoImpl;
import com.kstudy.dao.UserDaoMysqlImpl;
import com.kstudy.service.UserServiceImpl;

public class MyTest {
    public static void main(String[] args) {
        // 用户调用业务层，无视dao层
        // 修改前，每次要获取mysql数据都需要修改service代码
//        UserServiceImpl userService = new UserServiceImpl();

        //修改后：
        UserServiceImpl userService = new UserServiceImpl();
        userService.setUserDao(new UserDaoImpl());
        userService.getUser();

        userService.setUserDao(new UserDaoMysqlImpl());
        userService.getUser();

    }
}
