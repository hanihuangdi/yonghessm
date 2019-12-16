import com.yh.mapper.DoorMapper;
import com.yh.pojo.Door;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestMybats {
    @Test
    public void test1(){
        try {
            InputStream in = Resources.getResourceAsStream("mybatis/mybatis-config.xml");
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            SqlSessionFactory factory = builder.build(in);
            SqlSession sqlSession = factory.openSession();
            DoorMapper mapper = sqlSession.getMapper(DoorMapper.class);
            List<Door> all = mapper.findAll();
            for(Door door:all ){
               System.out.println(door);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws Exception {
        //1.读取mybatis-config.xml核心文件
        InputStream in = Resources.getResourceAsStream(
                "mybatis/mybatis-config.xml");
        //2.获取SqlSessionFactory工厂
        SqlSessionFactory factory =
                new SqlSessionFactoryBuilder()
                        .build(in);
        //3.获取SqlSession对象
        SqlSession session = factory.openSession();

        //4.获取DoorMapper接口的实例
        DoorMapper mapper = session.getMapper(DoorMapper.class);
        //5.调用findAll方法查询所有门店信息
        List<Door> list = mapper.findAll();
        //6.遍历所有门店信息
        for(Door door : list){
            System.out.println(door);
        }
    }
}
