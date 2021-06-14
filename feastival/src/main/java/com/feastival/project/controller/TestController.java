package com.feastival.project.controller;

import com.feastival.project.model.TestModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

//@Controller
@RestController
@RequestMapping("/test")
public class TestController {
    @ResponseBody
    @RequestMapping("/valueTest")
    public String valueTest() {
        String value = "테스트 String";
        return value;
    }

    @RequestMapping(value = "/testValue22", method = RequestMethod.GET)
    public String getTestValue() {
        String TestValue = "레스트컨트롤러 테스트";
        return TestValue;
    }

    @RequestMapping(value = "/testvaluepost", method = RequestMethod.GET)
    public String getTestValueParam(@RequestParam String id, @RequestParam Map<String, String> queryParameters) {
        String TestValue = "레스트컨트롤러 테스트";
        System.out.println("id=" + id);
        System.out.println(queryParameters);
        return TestValue + id;
    }

    @RequestMapping(method = RequestMethod.POST, path = "/postRequest")
    public TestModel postRequest(@RequestBody TestModel testModel) {
        System.out.println(testModel.getId());
        System.out.println(testModel.getAddress());
        System.out.println(testModel.getAge());
        return testModel;
    }


    //    @RestController
//    @RequestMapping("/hello")
//    public class HelloController {
//        @RequestMapping(value = "/{id}/{name}", method = RequestMethod.GET)
//        public void getMethod(@PathVariable int id, @PathVariable String name) {
//            System.out.println("id=" + id + ", name=" + name);
//        }
//    @RequestMapping(method = RequestMethod.GET)
//    public void getMethod(@RequestParam String id, @RequestParam Map<String, String> queryParameters, @RequestParam MultiValueMap<String, String> multiMap) {
//        System.out.println("id=" + id);
//        System.out.println(queryParameters);
//        System.out.println(multiMap);
//    }


}
