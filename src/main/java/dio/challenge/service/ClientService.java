package dio.challenge.service;

import dio.challenge.model.Client;
import dio.challenge.repository.ClientRepository;
import dio.challenge.service.interfaces.CRUDInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class ClientService implements CRUDInterface<Client, Long> {
    @Autowired
    private ClientRepository clientRepository;
    @Override
    public Iterable<Client> findAll() {
        return clientRepository.findAll();
    }

    @Override
    public Client findById(Long id) {
        Optional<Client> client = clientRepository.findById(id);
        return client.get();
    }

    @Override
    public Client save(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public void update(Long id, Client client) {
        Optional<Client> clientBd = clientRepository.findById(id);
        if(clientBd.isPresent()){
            clientRepository.save(client);
        }
    }

    @Override
    public void deleteById(Long id) {
        clientRepository.deleteById(id);
    }
}
