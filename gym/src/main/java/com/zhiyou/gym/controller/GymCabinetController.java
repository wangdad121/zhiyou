package com.zhiyou.gym.controller;

import com.zhiyou.gym.pojo.Gym_Cabinet;
import com.zhiyou.gym.service.GymCabinetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "Cabinet")
public class GymCabinetController {
    @Autowired
    GymCabinetService gymCabinetService;
    @RequestMapping(value = "findAll")
    public List<Gym_Cabinet> findAll(){
        return gymCabinetService.findAll();
    }
   @RequestMapping(value = "add")
    public void  add(Gym_Cabinet gymcabinet){
        gymCabinetService.add(gymcabinet);
   }
    @RequestMapping(value = "delete")
    public void  delete(Gym_Cabinet gymcabinet){
        gymCabinetService.deleteById(gymcabinet.getCabid());
    }
    @RequestMapping(value = "update")
    public void  update(Gym_Cabinet gymcabinet){
        gymCabinetService.update(gymcabinet);
    }
}