package com.example.ws_MobileMoney.ws;

import com.example.ws_MobileMoney.entities.Client;
import com.example.ws_MobileMoney.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@Component
@WebService(serviceName = "mobileTransfert")
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;
    @WebMethod
    public List<Client> clients(){
        return clientRepository.findAll();
    }
}
