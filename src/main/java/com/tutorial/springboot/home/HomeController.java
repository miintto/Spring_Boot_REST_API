package com.tutorial.springboot.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * <pre>
 * :Description
 *     HTTP 요청 처리
 *
 * :Logic
 *     - RestController 어노테이션을 통해 controller 정의
 *     - RequestMapping, PostMapping 어노테이션을 통해 url 및 method 정의
 *     - RequestParam, RequestBody 어노테이션으로 입력받은 parameter 들을 처리
 *     - ResponseEntity 어노테이션으로 model 객체를 json 형태로 가공해서 처리
 * </pre>
 */
@RestController
@RequestMapping(value = "/home")
public class HomeController {
    @Autowired
    private HomeService service;

    @PostMapping(value = "/test1")
    public String test1(@RequestParam(value = "id", defaultValue = "None") String id) throws Exception {

        JSONObject json = new JSONObject();

        json.put("key1", id);
        json.put("key2", id);

        return json.toString(4);
    }

    @PostMapping(value = "/test2")
    public ResponseEntity<?> test2(@RequestBody Home model) {
        Home returnModel = null;

        try {
            long id = model.getId();
            returnModel = service.get(id);
        } catch (final Exception e) {
            System.out.println(e.getMessage());
        }

        return new ResponseEntity<>(returnModel, HttpStatus.OK);
    }

}
