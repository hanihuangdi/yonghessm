package com.yh.mapper;

import com.yh.pojo.Door;

import java.util.List;

public interface DoorMapper {
    public List<Door> findAll();
    /*
     * @Description:门店新增
     * @Author:hcf
     * @Date: 2019/12/16 20:22
     * @param: [door]
     * @return: void
     */
    public void addDoor(Door door);
    /*
     * @Description:门店删除
     * @Author:hcf
     * @Date: 2019/12/16 20:33
     * @param: [id]
     * @return: void
     */
    void delDoor(Integer id);
    /*
     * @Description:根据id查询门店
     * @Author:hcf
     * @Date: 2019/12/16 20:43
     * @param: [id]
     * @return: com.yh.pojo.Door
     */
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
