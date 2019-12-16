package com.yh.controller;

import com.yh.pojo.Door;
import com.yh.service.DoorSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class DoorController {
    @Autowired
    DoorSerivce doorSerivce;
    /*
     * @Description:查询所有门店
     * @Author:hcf
     * @Date: 2019/12/16 19:54
     * @param: []
     * @return: java.lang.String
     */
    @RequestMapping("/findAll")
    public String findAll(Model model){
        List<Door> doors = doorSerivce.findAll();
        model.addAttribute("doors",doors);
        return "door_list";
    }
    @RequestMapping("/addDoor")
    public String addDoor(Door door){
        doorSerivce.addDoor(door);
        return "redirect:/doorList";
    }
    @RequestMapping("/delDoor/{id}")
    public String delDoor(@PathVariable Integer id){
        try {
            doorSerivce.delDoor(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/door_list";
    }
    /*
     * @Description:根据id查询门店
     * @Author:hcf
     * @Date: 2019/12/16 20:44
     * @param: [id]
     * @return: java.lang.String
     */
    @RequestMapping("/findById/{id}")
    public String findById(@PathVariable Integer id,Model model){
        Door door = doorSerivce.findById(id);
        model.addAttribute("door",door);
        return "door_update";
    }
    /*
     * @Description:修改门店
     * @Author:hcf
     * @Date: 2019/12/16 20:44
     * @param: [door]
     * @return: java.lang.String
     */
    @RequestMapping("/update")
    public String update(Door door){
       doorSerivce.update(door);
       return "redirect:/doorList";
    }
}
