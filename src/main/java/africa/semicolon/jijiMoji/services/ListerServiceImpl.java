package africa.semicolon.jijiMoji.services;

import africa.semicolon.jijiMoji.data.models.Lister;
import africa.semicolon.jijiMoji.data.repositories.ListerRepository;
import africa.semicolon.jijiMoji.dtos.requests.RegisterListerRequest;
import africa.semicolon.jijiMoji.dtos.responses.RegisterListerResponse;
import africa.semicolon.jijiMoji.exceptions.DuplicateEmailException;
import africa.semicolon.jijiMoji.utils.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
//@Component : this is to just get the general one instead of @service

@Service
public class ListerServiceImpl implements ListerService {
    @Autowired
    private ListerRepository listerRepository;

    @Override
    public RegisterListerResponse registerLister(RegisterListerRequest request){
        Optional<Lister> optionalLister = listerRepository.findListerByEmail(request.getEmail());
        if(optionalLister.isPresent()) throw new DuplicateEmailException(request.getEmail() + "already exists");
        Lister lister = ModelMapper.map(request);
        Lister savedLister = listerRepository.save(lister);
        RegisterListerResponse response = ModelMapper.map(savedLister);
        return response;

//        validate user does not exist (email)
            //       find lister by email, if null
            //       create lister from request
            //       save lister
            //       create response from saved lister
            //       return response
            //       else throw exception
    }
}
