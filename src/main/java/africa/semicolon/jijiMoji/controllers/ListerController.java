package africa.semicolon.jijiMoji.controllers;

import africa.semicolon.jijiMoji.dtos.requests.RegisterListerRequest;
import africa.semicolon.jijiMoji.exceptions.AppException;
import africa.semicolon.jijiMoji.services.ListerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/lister")
public class ListerController {
    @Autowired
    private ListerService listerService;

    public ResponseEntity<?> register(@RequestBody RegisterListerRequest request){
        try{
            return new ResponseEntity<>(listerService.registerLister(request), HttpStatus.CREATED);
        } catch (AppException exception){
            return new response
        }

    }
}
