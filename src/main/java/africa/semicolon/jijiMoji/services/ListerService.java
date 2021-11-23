package africa.semicolon.jijiMoji.services;

import africa.semicolon.jijiMoji.dtos.requests.RegisterListerRequest;
import africa.semicolon.jijiMoji.dtos.responses.RegisterListerResponse;

public interface ListerService {

    public RegisterListerResponse registerLister(RegisterListerRequest request);
}
