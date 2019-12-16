package com.yh.service;

import com.yh.mapper.DoorMapper;
import com.yh.pojo.Door;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface DoorSerivce {

    /*
     * @Description:查询所有门店信息
     * @Author:hcf
     * @Date: 2019/12/16 18:22
     * @param: []
     * @return: java.util.List<com.yh.pojo.Door>
     */
   List<Door> findAll();
    /*
     * @Description:门店新增
     * @Author:hcf
     * @Date: 2019/12/16 20:23
     * @param: []
     * @return: void
     */
    void addDoor(Door door);
    /*
     * @Description:根据id查询门店
     * @Author:hcf
     * @Date: 2019/12/16 20:44
     * @param: [id]
     * @return: java.lang.String
     */
    void delDoor(Integer id);

    Door findById(Integer id);
    /*
     * @Description:修改门店
     * @Author:hcf
     * @Date: 2019/12/16 20:44
     * @param: [door]
     * @return: java.lang.String
     */
    void update(Door door);

}
